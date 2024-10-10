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

package com.frojasg1.applications.superpojomodel.processor.utils.codegeneration;

import com.frojasg1.applications.superpojomodel.args.CommandLineArgs;
import com.frojasg1.applications.superpojomodel.contexts.MyParameterizedType;
import com.frojasg1.applications.superpojomodel.processor.helper.ClassFunctions;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.AttributeContext;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.JavaSourceFileDefinitionContext;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.impl.EnumDefinitionContext;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.impl.PojoClassDefinitionContext;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.AbstractJType;
import com.helger.jcodemodel.IJClassContainer;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JBlock;
import com.helger.jcodemodel.JClassAlreadyExistsException;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JConditional;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JVar;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CodeGenerator {

    protected CommandLineArgs commandLineArgs;
    protected Map<String, JavaSourceFileDefinitionContext> superPojoMap;

    protected JCodeModel modelResult;
    protected JPackage jPackage;

    public CodeGenerator(CommandLineArgs commandLineArgs, Map<String, JavaSourceFileDefinitionContext> superPojoMap) {
        this.commandLineArgs = commandLineArgs;
        this.superPojoMap = superPojoMap;
    }

    public CodeGenerator process() {
        JCodeModel result = createJCodeModel();

        this.modelResult = result;

        JavaSourceFileDefinitionContext javaSourceFileDefinitionContext = null;
        String superPojoClassName = null;
        for(Map.Entry<String, JavaSourceFileDefinitionContext> entry: getSuperPojoMap().entrySet()) {
            superPojoClassName = entry.getKey();
            javaSourceFileDefinitionContext = entry.getValue();

            fillJavaSourceFile(superPojoClassName, javaSourceFileDefinitionContext);
        }

        saveSourceCode();

        return this;
    }

    protected void saveSourceCode() {
        try {
            File outputDir = new File(getCommandLineArgs().getOutputFolder());
            modelResult.build(outputDir);
        } catch(Exception ex) {
            throw new RuntimeException("Error saving generated source code", ex);
        }
    }

    protected void fillJavaSourceFile(String superPojoClassName, JavaSourceFileDefinitionContext javaSourceFileDefinitionContext) {
        JDefinedClass jClass = getJClass(superPojoClassName);
        fillJavaSourceFileInternal(jClass, javaSourceFileDefinitionContext);
    }

    protected void fillJavaSourceFileInternal(JDefinedClass jClass, JavaSourceFileDefinitionContext javaSourceFileDefinitionContext) {
        if(javaSourceFileDefinitionContext instanceof EnumDefinitionContext) {
            fillEnum(jClass, (EnumDefinitionContext) javaSourceFileDefinitionContext);
        } else if(javaSourceFileDefinitionContext instanceof PojoClassDefinitionContext) {
            fillClass(jClass, (PojoClassDefinitionContext) javaSourceFileDefinitionContext);
        }
    }

    protected void fillEnum(JDefinedClass jClass, EnumDefinitionContext enumDefinitionContext) {
        // https://jensknipper.de/blog/generating-enums-in-java-with-jcodemodel/
        for(String enumValueName: enumDefinitionContext.getElemNames()) {
            jClass.enumConstant(enumValueName);
        }
    }

    protected void fillClass(JDefinedClass jClass, PojoClassDefinitionContext pojoClassDefinitionContext) {
        addFields(jClass, pojoClassDefinitionContext);
        addFieldFunctions(jClass, pojoClassDefinitionContext);

        if(getCommandLineArgs().isToAddToString()) {
            createToStringFunction(jClass);
        }
    }

    protected void addFields(JDefinedClass jClass, PojoClassDefinitionContext pojoClassDefinitionContext) {
        // https://sookocheff.com/post/java/generating-java-with-jcodemodel/
        String attributeName = null;
        Object attributeType = null;
        String className = null;
        Class<?> clazz = null;
        AbstractJType jType = null;
        MyParameterizedType parameterizedType = null;
        for(Map.Entry<String, AttributeContext> entry: pojoClassDefinitionContext.getAttributeDescriptionMap().entrySet()) {
            attributeName = entry.getKey();
            attributeType = entry.getValue().getAttributeType();

            jType = getJType(attributeType, pojoClassDefinitionContext);
            jClass.field(JMod.PRIVATE, jType, attributeName);
        }
    }

    protected AbstractJType getJType(Object attributeType, PojoClassDefinitionContext pojoClassDefinitionContext) {
        AbstractJType result = null;
        if(attributeType instanceof String) {
            String className = (String) attributeType;
            result = getJClass(className);
        } else if(attributeType instanceof Class) {
            Class<?> clazz = (Class<?>) attributeType;
            result = this.modelResult.ref(clazz);
        } else if(attributeType instanceof MyParameterizedType) {
            MyParameterizedType parameterizedType = (MyParameterizedType) attributeType;

            // https://jensknipper.de/blog/dealing-with-generic-fields-in-jcodemodel/
            result = getNarrowedClass(pojoClassDefinitionContext.getDefinitionClass(), parameterizedType);
        }
        return result;
    }

    protected Object getAttributeType(Type attribType, Class<?> inputPackageClass) {
        return getClassFunctions().getAttributeType(attribType, inputPackageClass);
    }

    protected AbstractJClass getNarrowedClass(Class<?> containerClazz, Object attributeType) {
        AbstractJClass result = null;
        if(attributeType instanceof String) {
            String className = (String) attributeType;
            result = getJClass(className);
        } else if(attributeType instanceof Class) {
            result = this.modelResult
                    .ref((Class<?>) attributeType);
        } else if(attributeType instanceof MyParameterizedType) {
            MyParameterizedType myParameterizedType = (MyParameterizedType) attributeType;
            result = getNarrowedClass(containerClazz, myParameterizedType.getRawType());

            // https://jensknipper.de/blog/dealing-with-generic-fields-in-jcodemodel/
            for(Object paramType: myParameterizedType.getTypeParameters()) {
                result = result.narrow(getNarrowedClass(containerClazz, paramType));
            }
        } else {
            throw new IllegalArgumentException("Not expected");
        }

        return result;
    }

    protected JDefinedClass getJClass(String className) {
        IJClassContainer classContainer = jPackage;

        for(String simpleClassName: className.split("\\$")) {
            classContainer = classContainer.classes()
                    .stream()
                    .filter(jcl -> Objects.equals(jcl.name(), simpleClassName))
                    .findFirst()
                    .orElse(null);
        }

        return (classContainer instanceof JDefinedClass) ?
                (JDefinedClass) classContainer :
                null;
    }

    protected void addFieldFunctions(JDefinedClass jClass,
                                     PojoClassDefinitionContext pojoClassDefinitionContext) {
        String attribName = null;
        AttributeContext attributeContext = null;
        for(Map.Entry<String, AttributeContext> entry: pojoClassDefinitionContext.getAttributeDescriptionMap().entrySet()) {
            attribName = entry.getKey();
            attributeContext = entry.getValue();
            addFieldFunctions(jClass, attribName, attributeContext, pojoClassDefinitionContext);
        }
    }

    protected void addFieldFunctions(JDefinedClass jClass, String fieldName,
                                     AttributeContext attributeContext,
                                     PojoClassDefinitionContext pojoClassDefinitionContext) {
        addGetter(jClass, fieldName, attributeContext);
        addSetter(jClass, fieldName, attributeContext);

        if(getCommandLineArgs().isToAddBuilderStyle()) {
            addBuilder(jClass, fieldName);
        }

        if(getCommandLineArgs().isToAddListItemAdder() &&
            isParameterizedList(attributeContext.getAttributeType())) {
            addListItemAdder(jClass, fieldName, attributeContext, pojoClassDefinitionContext);
        }
    }

    protected Object getFirstParameter(Object attributeType) {
        return getClassFunctions().getFirstParameter(attributeType);
    }

    protected String getListItemAdderFunctionName(String fieldName) {
        return String.format("add%sItem", getAttribNameForFunctions(fieldName));
    }

    protected JMethod addListItemAdder(JDefinedClass jClass, String fieldName,
                                       AttributeContext attributeContext,
                                       PojoClassDefinitionContext pojoClassDefinitionContext) {
        // https://sookocheff.com/post/java/generating-java-with-jcodemodel/
        String functionName = getListItemAdderFunctionName(fieldName);
        JMethod result = null;
        if(getCommandLineArgs().isToAddBuilderStyle()) {
            result = jClass.method(JMod.PUBLIC, jClass, functionName);
        } else {
            result = jClass.method(JMod.PUBLIC, this.modelResult.VOID, functionName);
        }
        AbstractJType elemType = getJType(getFirstParameter(attributeContext.getAttributeType()), pojoClassDefinitionContext);
        JVar param = result.param(elemType, "item");

        JFieldVar jField = jClass.fields().get(fieldName);
        JConditional condition = result.body()._if(JExpr._this().ref(jField.name()).eqNull());
        condition._then().assign(
                JExpr._this().ref(jField.name()),
                JExpr._new(getListJType(attributeContext, pojoClassDefinitionContext)));

        result.body().add(JExpr._this().ref(jField.name()).invoke("add").arg(param));

        if(getCommandLineArgs().isToAddBuilderStyle()) {
            result.body()._return(JExpr._this());
        }

        return result;
    }

    protected Class<?> getRawListClass(Object attributeType) {
        return getClassFunctions().getRawListClass(attributeType);
    }

    protected AbstractJClass getListJType(AttributeContext attributeContext, PojoClassDefinitionContext pojoClassDefinitionContext) {
        AbstractJClass result = null;

        Class<?> rawListClass = getRawListClass(attributeContext.getAttributeType());
        if(Objects.equals(List.class, rawListClass)) {
            result = this.modelResult.ref(ArrayList.class);
        } else {
            result = this.modelResult.ref(rawListClass);
        }
        return result;
    }

    protected boolean isParameterizedList(Object attributeType) {
        return getClassFunctions().isParameterizedList(attributeType);
    }

    protected JMethod addGetter(JDefinedClass jClass, String fieldName,
                                AttributeContext attributeContext) {
        // https://sookocheff.com/post/java/generating-java-with-jcodemodel/
        JMethod result = null;
        String getterFunctionName = getGetterName(fieldName, attributeContext);
        JFieldVar jField = jClass.fields().get(fieldName);
        result = jClass.method(JMod.PUBLIC, jField.type(), getterFunctionName);

        result.body()._return(jField);

        return result;
    }

    protected JMethod addSetter(JDefinedClass jClass, String fieldName,
                                AttributeContext attributeContext) {
        // https://sookocheff.com/post/java/generating-java-with-jcodemodel/
        String setterFunctionName = getSetterName(fieldName, attributeContext);
        JMethod result = jClass.method(JMod.PUBLIC, this.modelResult.VOID, setterFunctionName);
        JFieldVar jField = jClass.fields().get(fieldName);
        result.param(jField.type(), jField.name());

        result.body().assign(JExpr._this().ref(jField.name()), JExpr.ref(jField.name()));

        return result;
    }

    protected JMethod addBuilder(JDefinedClass jClass, String fieldName) {
        // https://sookocheff.com/post/java/generating-java-with-jcodemodel/
        String builderFunctionName = fieldName;
        JMethod result = jClass.method(JMod.PUBLIC, jClass, builderFunctionName);
        JFieldVar jField = jClass.fields().get(fieldName);
        result.param(jField.type(), jField.name());

        result.body().assign(JExpr._this().ref(jField.name()), JExpr.ref(jField.name()));
        result.body()._return(JExpr._this());

        return result;
    }

    protected JMethod createToStringFunction(JDefinedClass definedClass) {
        // https://stackoverflow.com/questions/47872206/use-jcodemodel-to-generate-tostring-method
        Map<String, JFieldVar> fields = definedClass.fields();
        JMethod toString =
                definedClass.method(JMod.PUBLIC, String.class, "toString");
        toString.annotate(Override.class);

        JBlock body = toString.body();

        IJExpression expression = JExpr.lit(definedClass.name() + " {");

        boolean first = true;
        for (JFieldVar fieldVar : fields.values())
        {
            if ((fieldVar.mods().getValue() & JMod.STATIC) == JMod.STATIC)
            {
                continue;
            }
//            if (excludedFieldNames.contains(fieldVar.name()))
//            {
//                continue;
//            }
            if (!first)
            {
                expression = expression.plus(JExpr.lit(", "));
            }
            expression = expression.plus(JExpr.lit(fieldVar.name()+" = "));
            expression = expression.plus(JExpr.ref(fieldVar.name()));
            first = false;
        }
        expression = expression.plus(JExpr.lit("}"));

        body._return(expression);

        return toString;
    }

    protected CommandLineArgs getCommandLineArgs() {
        return commandLineArgs;
    }

    protected Map<String, JavaSourceFileDefinitionContext> getSuperPojoMap() {
        return superPojoMap;
    }

    protected JCodeModel createJCodeModel() {
        try {
            return createJCodeModelInternal();
        } catch(Exception ex) {
            throw new RuntimeException("Error creating JCodeModel", ex);
        }
    }

    protected JCodeModel createJCodeModelInternal() throws JClassAlreadyExistsException {
        // https://sookocheff.com/post/java/generating-java-with-jcodemodel/
        JCodeModel result = new JCodeModel();

        JPackage jPackage = result._package(getCommandLineArgs().getOutputPackage());

        boolean isNested = false;
        String className = null;
        JavaSourceFileDefinitionContext sourceFileDefinitionContext = null;
        for(Map.Entry<String, JavaSourceFileDefinitionContext> entry: getSuperPojoMap().entrySet()) {
            className = entry.getKey();

            if(!isNestedClass(className)) {
                sourceFileDefinitionContext = entry.getValue();

                addEnumOrClassWithNestedClasses(jPackage, isNested, sourceFileDefinitionContext);
            }
        }

        this.jPackage = jPackage;

        return result;
    }

    protected void addEnumOrClassWithNestedClasses(IJClassContainer classContainer, boolean isNested,
                                                   JavaSourceFileDefinitionContext sourceFileDefinitionContext) throws JClassAlreadyExistsException {
        String simpleClassName = sourceFileDefinitionContext.getDefinitionClass().getSimpleName();

        if(sourceFileDefinitionContext instanceof PojoClassDefinitionContext) {
            PojoClassDefinitionContext pojoClassDefinitionContext = (PojoClassDefinitionContext) sourceFileDefinitionContext;
            IJClassContainer newClassContainer = null;

            if(isNested) {
                newClassContainer = classContainer._class(JMod.PUBLIC | JMod.STATIC, simpleClassName);
            } else {
                newClassContainer = classContainer._class(JMod.PUBLIC, simpleClassName);
            }

            boolean isNested2 = true;
            for(JavaSourceFileDefinitionContext nestedDefinitionContext: pojoClassDefinitionContext.getNestedClasses()) {
                addEnumOrClassWithNestedClasses(newClassContainer, isNested2, nestedDefinitionContext);
            }
        } else if(sourceFileDefinitionContext instanceof EnumDefinitionContext) {
            // https://jensknipper.de/blog/generating-enums-in-java-with-jcodemodel/
            if(isNested) {
                ((JDefinedClass)classContainer)._enum(JMod.PUBLIC | JMod.STATIC, simpleClassName);
            } else {
                classContainer._enum(simpleClassName);
            }
        } else {
            throw new IllegalArgumentException("sourceFileDefinitionContext type not expected: " + sourceFileDefinitionContext);
        }
    }

    protected ClassFunctions getClassFunctions() {
        return ClassFunctions.instance();
    }

    protected boolean isNestedClass(String className) {
        return getClassFunctions().isNestedClass(className);
    }

    protected String getGetterName(String fieldName,
                                   AttributeContext attributeContext) {
        String result = getFirstMethodName(attributeContext.getGetters());
        if(result == null) {
            result = defaultGetterFunctionName(fieldName, attributeContext.getAttributeClass());
        }

        return result;
    }

    protected String getSetterName(String fieldName,
                                   AttributeContext attributeContext) {
        String result = getFirstMethodName(attributeContext.getSetters());
        if(result == null) {
            result = defaultSetterFunctionName(fieldName);
        }

        return result;
    }

    protected String getFirstMethodName(List<Method> methods) {
        return methods.isEmpty() ? null : methods.get(0).getName();
    }

    protected String getAttribNameForFunctions(String attribName) {
        return attribName.substring(0, 1).toUpperCase() + attribName.substring(1);
    }

    protected String getterFunctionNamePrefix(Class<?> resultType) {
        return resultType == boolean.class ? "is" : "get";
    }

    protected String defaultGetterFunctionName(String fieldName, Class<?> resultType) {
        return getterFunctionNamePrefix(resultType) + getAttribNameForFunctions(fieldName);
    }

    protected String defaultSetterFunctionName(String fieldName) {
        return "set" + getAttribNameForFunctions(fieldName);
    }
}
