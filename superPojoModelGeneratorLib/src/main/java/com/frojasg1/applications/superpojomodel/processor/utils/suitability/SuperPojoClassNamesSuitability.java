/*
 * Copyright (c) 2024. Francisco Javier Rojas Garrido <frojasg1@hotmail.com>
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 3.0 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You may obtain a copy of the License at
 *
 *       http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 */

package com.frojasg1.applications.superpojomodel.processor.utils.suitability;

import com.frojasg1.applications.superpojomodel.config.SuperPojoModelGeneratorConfiguration;
import com.frojasg1.applications.superpojomodel.processor.helper.ClassFunctions;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.AttributeContext;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.JavaSourceFileDefinitionContext;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.impl.EnumDefinitionContext;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.impl.PojoClassDefinitionContext;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SuperPojoClassNamesSuitability {

    protected URLClassLoader urlClassLoader;
    protected List<String> superPojoNestedClasses;
    protected SuperPojoModelGeneratorConfiguration commandLineArgs;

    protected Map<String, JavaSourceFileDefinitionContext> javaClassDefinitionResultMap;

    protected int numErrors;
    protected int numWarnings;


    public SuperPojoClassNamesSuitability(URLClassLoader urlClassLoader, List<String> superPojoNestedClasses, SuperPojoModelGeneratorConfiguration commandLineArgs) {
        this.urlClassLoader = urlClassLoader;
        this.superPojoNestedClasses = superPojoNestedClasses;
        this.commandLineArgs = commandLineArgs;
    }

    public SuperPojoClassNamesSuitability process() {
        Map<String, JavaSourceFileDefinitionContext> result = new HashMap<>();

        JavaSourceFileDefinitionContext currentSuperPojoJavaDefinition = null;
        for(String superPojoNestedClassName: superPojoNestedClasses) {
            currentSuperPojoJavaDefinition = isSuitable(superPojoNestedClassName);
            result.put(superPojoNestedClassName, currentSuperPojoJavaDefinition);
        }

        this.javaClassDefinitionResultMap = result;

        return this;
    }

    protected URLClassLoader getUrlClassLoader() {
        return urlClassLoader;
    }

    protected List<String> getSuperPojoNestedClasses() {
        return superPojoNestedClasses;
    }

    protected SuperPojoModelGeneratorConfiguration getCommandLineArgs() {
        return commandLineArgs;
    }

    public Map<String, JavaSourceFileDefinitionContext> getJavaClassDefinitionResultMap() {
        return javaClassDefinitionResultMap;
    }

    protected JavaSourceFileDefinitionContext isSuitable(String superPojoNestedClassName) {
        Map<String, JavaSourceFileDefinitionContext> map = new HashMap<>();

        String inputPackageClassName = null;
        JavaSourceFileDefinitionContext currentJavaDefinition = null;
        for(String inputPackage: getCommandLineArgs().getInputPackages()) {
            inputPackageClassName = inputPackage + "." + superPojoNestedClassName;
            currentJavaDefinition = calculateCurrentJavaDefinition(inputPackageClassName);
            if(currentJavaDefinition != null) {
                map.put(inputPackage, currentJavaDefinition);
            }
        }

        JavaSourceFileDefinitionContext result = checkAndJoin(map);

        if(result instanceof PojoClassDefinitionContext) {
            PojoClassDefinitionContext pojoClassDefinitionContext = (PojoClassDefinitionContext) result;
            for(String nestedClassName: getNestedClasses(superPojoNestedClassName)) {
                pojoClassDefinitionContext.addNestedClass(isSuitable(nestedClassName));
            }
        }

        return result;
    }

    protected ClassFunctions getClassFunctions() {
        return ClassFunctions.instance();
    }

    protected List<Class<?>> getPublicStaticNestedClasses(Class<?> clazz) {
        return getClassFunctions().getPublicStaticNestedClasses(clazz);
    }

    protected String getNestedClassName(Class<?> clazz) {
        return getClassFunctions().getNestedClassName(clazz);
    }

    protected List<String> getNestedClasses(String superPojoNestedClassName) {
        List<String> result = new ArrayList<>();

        String nestedNestedClassName = null;
        Class<?> nestedClass = null;
        String inputPackageClassName = null;
        JavaSourceFileDefinitionContext currentJavaDefinition = null;
        for(String inputPackage: getCommandLineArgs().getInputPackages()) {
            inputPackageClassName = inputPackage + "." + superPojoNestedClassName;
            nestedClass = loadClass(inputPackageClassName);

            if(nestedClass != null) {
                for(Class<?> nestedNestedClass: getPublicStaticNestedClasses(nestedClass)) {
                    nestedNestedClassName = getNestedClassName(nestedNestedClass);

                    if(!result.contains(nestedNestedClassName)) {
                        result.add(nestedNestedClassName);
                    }
                }
            }
        }

        return result;
    }

    protected JavaSourceFileDefinitionContext calculateCurrentJavaDefinition(String inputPackageClassName) {
        JavaSourceFileDefinitionContext result = null;
        Class<?> inputPackageClass = loadClass(inputPackageClassName);

        if(inputPackageClass != null) {
            if(inputPackageClass.isEnum()) {
                result = calculateEnumJavaDefinition(inputPackageClass);
            } else {
                result = calculatePojoJavaDefinition(inputPackageClass);
            }
        }
        return result;
    }

    protected Class<?> loadClass(String inputPackageClassName) {
        try {
            return getUrlClassLoader().loadClass(inputPackageClassName);
        } catch(Exception ex) {
            return null;
        }
    }

    protected EnumDefinitionContext calculateEnumJavaDefinition(Class<?> inputPackageClass) {
        EnumDefinitionContext result = new EnumDefinitionContext(inputPackageClass);

        for(String elemName: getElemNames(inputPackageClass)) {
            result.addElemName(elemName);
        }

        return result;
    }

    protected <T> List<String> getElemNames(Class<T> enumClass) {
        List<String> result = null;
        if(enumClass.isEnum()) {
            result = new ArrayList<>();
            for (T enumValue : enumClass.getEnumConstants()) {
                result.add(((Enum<?>)enumValue).name());
            }
        }
        return result;
    }

    protected PojoClassDefinitionContext calculatePojoJavaDefinition(Class<?> inputPackageClass) {
        PojoClassDefinitionContext result = new PojoClassDefinitionContext(inputPackageClass);

        List<Method> methods = Arrays.stream(inputPackageClass.getMethods())
                .filter( method -> !Modifier.isStatic(method.getModifiers()))
                .filter( method -> Modifier.isPublic(method.getModifiers()))
                .collect(Collectors.toList());

        while(!methods.isEmpty()) {
            processAndRemoveFirstMethod(methods, inputPackageClass, result);
        }

        return result;
    }

    protected AttributeContext createAttributeContext(Class<?> inputPackageClass, Object attributeType) {
        return new AttributeContext(inputPackageClass, attributeType);
    }

    protected void processAndRemoveFirstMethod(List<Method> methods,
                                               Class<?> inputPackageClass,
                                               PojoClassDefinitionContext result) {
        Method method = methods.remove(0);

        String attributeName = getAttributeName(method);

        Object attributeType = null;
        if(attributeName != null) {
            attributeType = getAttributeType(method, inputPackageClass);

            AttributeContext attributeContext = createAttributeContext(inputPackageClass, attributeType);
            if(removeAndCheckAllAttributeGettersAndSetters(method, attributeName, attributeContext,
                    inputPackageClass, methods)) {
                result.putAttributeDescription(normalizeAttributeName(attributeName), attributeContext);
            }
        }
    }

    protected String normalizeAttributeName(String attributeName) {
        return attributeName == null ?
                null :
                attributeName.substring(0, 1).toLowerCase() + attributeName.substring(1);
    }

    protected Pattern getGetterRegexPattern() {
        return getCommandLineArgs().getGetterRegexPattern();
    }

    protected Pattern getSetterRegexPattern() {
        return getCommandLineArgs().getSetterRegexPattern();
    }

    protected String getAttributeName(Method method) {
        String result = getGetterAttributeName(method);

        if(result == null) {
            result = getSetterAttributeName(method);
        }

        return result;
    }

    protected boolean canBeGetter(Method method) {
        return method.getParameterTypes().length == 0 &&
                method.getReturnType() != void.class &&
                !method.getName().equals("getClass");
    }

    protected boolean canBeSetter(Method method) {
        return method.getParameterTypes().length == 1 &&
                method.getReturnType() == void.class;
    }

    protected String getGetterAttributeName(Method method) {
        String attribName = null;
        if(canBeGetter(method)) {
            attribName = getMatchingLastGroup(getGetterRegexPattern(), method.getName());
        }
        return attribName;
    }

    protected String getSetterAttributeName(Method method) {
        String attribName = null;
        if(canBeSetter(method)) {
            attribName = getMatchingLastGroup(getSetterRegexPattern(), method.getName());
        }
        return attribName;
    }

    protected String getMatchingLastGroup(Pattern pattern, String text) {
        String result = null;
        Matcher matcher = pattern.matcher(text);
        if(matcher.matches()) {
            result = matcher.group(matcher.groupCount());
        }
        return result;
    }

    protected Object getAttributeType(Method method, Class<?> inputPackageClass) {
        Object result = getGetterAttributeType(method, inputPackageClass);

        if(result == null) {
            result = getSetterAttributeType(method, inputPackageClass);
        }

        return result;
    }

    protected Object getSetterAttributeType(Method method, Class<?> inputPackageClass) {
        Object result = null;
        if(getSetterAttributeName(method) != null) {
            result = getAttributeType(method.getGenericParameterTypes()[0], inputPackageClass);
        }
        return result;
    }

    protected Object getGetterAttributeType(Method method, Class<?> inputPackageClass) {
        Object result = null;
        if(getGetterAttributeName(method) != null) {
            result = getAttributeType(method.getGenericReturnType(), inputPackageClass);
        }
        return result;
    }

    protected Object getAttributeType(Type attribType, Class<?> inputPackageClass) {
        return getClassFunctions().getAttributeType(attribType, inputPackageClass);
    }

    protected AttributeContext getCompatibleAttrib(AttributeContext resultAttributeContext,
                                                   AttributeContext currentAttributeContext) {
        AttributeContext result = resultAttributeContext;
        if(resultAttributeContext == null) {
            result = currentAttributeContext;
        } else if(currentAttributeContext == null) {
            result = resultAttributeContext;
        } else {
            if(!areAttribTypesTheSame(resultAttributeContext.getAttributeType(), currentAttributeContext.getAttributeType())) {
                if(getCommandLineArgs().elementAndListOfElementsAreCompatible()) {
                    result = getListIfElementAndListOfElements(resultAttributeContext, currentAttributeContext);
                } else {
                    result = null;
                }
            }
        }
        return result;
    }

    protected AttributeContext getListIfElementAndListOfElements(AttributeContext resultAttributeContext,
                                                                 AttributeContext currentAttributeContext) {
        AttributeContext result = getListIfFirstListSecondElement(resultAttributeContext, currentAttributeContext);
        if(result == null) {
            result = getListIfFirstListSecondElement(currentAttributeContext, resultAttributeContext);
        }
        return result;
    }

    protected AttributeContext getListIfFirstListSecondElement(AttributeContext resultAttributeContext,
                                                               AttributeContext currentAttributeContext) {
        AttributeContext result = null;
        if(isParameterizedList(resultAttributeContext.getAttributeType())) {
            if(areAttribTypesTheSame(getFirstParameter(resultAttributeContext.getAttributeType()), currentAttributeContext.getAttributeType())) {
                result = resultAttributeContext;
            }
        }
        return result;
    }

    protected Object getFirstParameter(Object attributeType) {
        return getClassFunctions().getFirstParameter(attributeType);
    }

    protected boolean isParameterizedList(Object attributeType) {
        return getClassFunctions().isParameterizedList(attributeType);
    }

    protected boolean areAttribTypesTheSame(Object attribType1, Object attribType2) {
        return Objects.equals(attribType1, attribType2);
    }

    protected boolean removeAndCheckAllAttributeGettersAndSetters(Method firstMethod,
                                                                  String attributeName,
                                                                  AttributeContext attributeContext,
                                                                  Class<?> inputPackageClass,
                                                                  List<Method> methodsResult) {
        boolean result = true;
        addSetterOrGetter(firstMethod, attributeContext);

        Iterator<Method> it = methodsResult.iterator();

        String normalizedAttribName = normalizeAttributeName(attributeName);
        String currentNormalizedAttributeName = null;
        String currentAttributeName = null;
        Object currentAttributeType = null;
        Method method = null;
        while(it.hasNext()) {
            method = it.next();

            currentAttributeName = getAttributeName(method);
            currentNormalizedAttributeName = normalizeAttributeName(currentAttributeName);

            if(Objects.equals(normalizedAttribName, currentNormalizedAttributeName)) {

                currentAttributeType = getAttributeType(method, inputPackageClass);
                if(!Objects.equals(currentAttributeName, attributeName)) {
                    warn(String.format("incompatible attrib names at: %s, for methods: \n %s \n and \n %s", inputPackageClass, firstMethod, method));
                }

                if(!areAttribTypesTheSame(currentAttributeType, attributeContext.getAttributeType())) {
                    error(String.format("incompatible attribute types at: %s, for methods: \n attrib type: %s \n %s \n and \n attrib type: %s \n %s",
                            inputPackageClass, attributeContext.getAttributeType(), firstMethod, currentAttributeType, method));
                    result = false;
                }

                addSetterOrGetter(method, attributeContext);

                it.remove();
            }
        }

        if(attributeContext.getGetters().isEmpty()) {
            warn(String.format("Attribute of %s without getter: %s. for setter: %s", inputPackageClass, attributeName, attributeContext.getSetters().get(0)));
        } else if(attributeContext.getSetters().isEmpty()) {
            warn(String.format("Attribute of %s without setter: %s. for getter: %s", inputPackageClass, attributeName, attributeContext.getGetters().get(0)));
        }

        if(attributeContext.getGetters().size() > 1) {
            warn(String.format("Attribute of %s with more than one getter: %s", inputPackageClass, attributeContext.getGetters()));
        }

        if(attributeContext.getSetters().size() > 1) {
            warn(String.format("Attribute of %s with more than one setter: %s", inputPackageClass, attributeContext.getSetters()));
        }

        return result;
    }

    protected void addSetterOrGetter(Method method, AttributeContext result) {
        if(canBeGetter(method)) {
            result.addGetter(method);
        } else if(canBeSetter(method)) {
            result.addSetter(method);
        }
    }

    protected JavaSourceFileDefinitionContext checkAndJoin(Map<String, JavaSourceFileDefinitionContext> map) {
        JavaSourceFileDefinitionContext result = null;

        for(JavaSourceFileDefinitionContext currentJavaDefinition: map.values()) {
            result = checkAndJoin(result, currentJavaDefinition);
        }

        return result;
    }

    protected JavaSourceFileDefinitionContext checkAndJoin(JavaSourceFileDefinitionContext currentResult,
                                                           JavaSourceFileDefinitionContext currentJavaDefinition) {
        JavaSourceFileDefinitionContext result = currentResult;

        if(result == null) {
            result = currentJavaDefinition.createCopy();
        } else {
            if(currentResult.getClass() != currentJavaDefinition.getClass()) {
                error(String.format("Incompatible types: \n %s \n %s", currentResult, currentJavaDefinition));
            } else if(currentResult instanceof EnumDefinitionContext) {
                addEnum((EnumDefinitionContext) currentResult, (EnumDefinitionContext) currentJavaDefinition);
            } else if(currentResult instanceof PojoClassDefinitionContext) {
                checkAndAddPojoAttribs((PojoClassDefinitionContext) currentResult, (PojoClassDefinitionContext) currentJavaDefinition);
            } else {
                error("Not expected type: " + currentResult);
            }
        }
        return result;
    }

    protected void addEnum(EnumDefinitionContext currentResult,
                           EnumDefinitionContext currentJavaDefinition) {
        for(String enumElemName: currentJavaDefinition.getElemNames()) {
            if(!currentResult.getElemNames().contains(enumElemName)) {
                currentResult.addElemName(enumElemName);
            }
        }
    }

    protected void checkAndAddPojoAttribs(PojoClassDefinitionContext currentResult,
                                          PojoClassDefinitionContext currentJavaDefinition) {
        String attributeName = null;
        AttributeContext attributeContext = null;
        Map.Entry<String, AttributeContext> entry = null;
        Map<String, AttributeContext> compatibleAttribMap = new HashMap<>();
        Iterator<Map.Entry<String, AttributeContext>> it = currentResult.getAttributeDescriptionMap().entrySet().iterator();
        AttributeContext currentAttribCtx = null;
        while(it.hasNext()) {
            entry = it.next();
            attributeName = entry.getKey();
            attributeContext = entry.getValue();

            currentAttribCtx = getSuitableAttrib(attributeContext, currentJavaDefinition.getAttributeDescriptionMap().get(attributeName));
            if(currentAttribCtx != null) {
                compatibleAttribMap.put(attributeName, currentAttribCtx);
            }
        }
        currentResult.getAttributeDescriptionMap().clear();
        currentResult.getAttributeDescriptionMap().putAll(compatibleAttribMap);

        for(Map.Entry<String, AttributeContext> entry2: currentJavaDefinition.getAttributeDescriptionMap().entrySet()) {
            attributeName = entry2.getKey();

            currentResult.getAttributeDescriptionMap().computeIfAbsent(attributeName, (atrNam) -> entry2.getValue());
        }
    }

    protected AttributeContext getSuitableAttrib(AttributeContext resultAttributeContext, AttributeContext currentAttributeContext) {
        AttributeContext result = resultAttributeContext;
        if(currentAttributeContext != null) {
            result = getCompatibleAttrib(resultAttributeContext, currentAttributeContext);
            if(result == null) {
                error(String.format("incompatible attribute types at: %s : \n attrib type: %s \n (%s) \n and \n %s: \n attrib type: %s \n %s",
                        resultAttributeContext.getContainerClass(), resultAttributeContext.getAttributeType(), getMethod(resultAttributeContext),
                        currentAttributeContext.getContainerClass(), currentAttributeContext.getAttributeType(), getMethod(currentAttributeContext)));
            } else {
                // the first letter may differ in case sensitivity
                Map<String, Method> resultAttributeNameMap = getAttributeNames(resultAttributeContext);
                Map<String, Method> currentAttributeNameMap = getAttributeNames(currentAttributeContext);

                for(String currentAttributeName: currentAttributeNameMap.keySet()) {
                    if(resultAttributeNameMap.get(currentAttributeName) == null) {
                        Method exampleResultMethod = getMethod(resultAttributeContext);
                        warn(String.format("Found potential incompatibility in:  \n%s - with attribute name: %s (%s)\n and \n%s - with attribute name %s (%s)",
                                resultAttributeContext.getContainerClass(), getAttributeName(exampleResultMethod), exampleResultMethod,
                                currentAttributeContext.getContainerClass(), currentAttributeName, currentAttributeNameMap.get(currentAttributeName)));
                    }
                }
            }
        }
        return result;
    }

    protected Map<String, Method> getAttributeNames(AttributeContext attributeContext) {
        Map<String, Method> result = new HashMap<>();
        addAttributeNames(attributeContext.getGetters(), result);
        addAttributeNames(attributeContext.getSetters(), result);

        return result;
    }

    protected void addAttributeNames(List<Method> methods, Map<String, Method> result) {
        String attribName = null;
        for(Method method: methods) {
            attribName = getAttributeName(method);
            result.computeIfAbsent(attribName, (atrNa) -> method);
        }
    }

    protected Method getMethod(AttributeContext attributeContext) {
        Method result = null;
        if(!attributeContext.getGetters().isEmpty()) {
            result = attributeContext.getGetters().get(0);
        } else if(!attributeContext.getSetters().isEmpty()) {
            result = attributeContext.getSetters().get(0);
        }
        return result;
    }

    public void errLog(String text) {
        System.err.println(text);
    }

    protected void error(String text) {
        errLog("ERROR - " + text);
        numErrors++;
    }

    protected void warn(String text) {
        errLog("WARNING - " + text);
        numWarnings++;
    }

    public int getNumErrors() {
        return numErrors;
    }

    public int getNumWarnings() {
        return numWarnings;
    }
}
