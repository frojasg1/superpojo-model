package com.frojasg1.superpojomodel.mapper.mapper.impl;

import com.frojasg1.applications.superpojomodel.contexts.MyParameterizedType;
import com.frojasg1.applications.superpojomodel.processor.helper.ClassFunctions;
import com.frojasg1.applications.superpojomodel.processor.helper.ReflectionFunctions;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.AttributeContext;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.JavaSourceFileDefinitionContext;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.impl.EnumDefinitionContext;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.impl.PojoClassDefinitionContext;
import com.frojasg1.superpojomodel.mapper.attributecache.AttributeCache;
import com.frojasg1.superpojomodel.mapper.mapper.ObjectMapper;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class SuperPojoObjectMapperImpl implements ObjectMapper {

    protected AttributeCache attributeCache;
    protected String superPojoPackageName;
    protected Set<String> pojoPackageNames;

    protected ObjectMapper genericObjectMapper;

    public SuperPojoObjectMapperImpl(AttributeCache attributeCache,
                                     ObjectMapper genericObjectMapper,
                                     String superPojoPackageName,
                                     String ... pojoPackageNames) {
        this.attributeCache = attributeCache;
        this.genericObjectMapper = genericObjectMapper;
        this.superPojoPackageName = superPojoPackageName;
        this.pojoPackageNames = Arrays.stream(pojoPackageNames)
                .collect(Collectors.toSet());
    }

    @Override
    public <IC, RC> RC translate(Object obj, Class<IC> inputClass, Class<RC> resultClass) {
        RC result = null;
        if(obj != null) {
            if(isSuperPojoTranslation(inputClass, resultClass)) {
                result = translateInternal(obj, inputClass, resultClass);
            }
        }
        return result;
    }

    @Override
    public <RC> RC translate(Object obj, Class<RC> resultClass) {
        RC result = null;
        if(obj != null) {
            result = translate(obj, obj.getClass(), resultClass);
        }
        return result;
    }

    protected boolean isSuperPojoTranslation(Class<?> inputClass, Class<?> resultClass) {
        return isSuperPojoClass(inputClass) && isNormalPojoClass(resultClass) ||
                isNormalPojoClass(inputClass) && isSuperPojoClass(resultClass);
    }

    protected String getPackageName(Class<?> clazz) {
        return clazz.getPackage().getName();
    }

    protected boolean isSuperPojoClass(Class<?> clazz) {
        return Objects.equals(getSuperPojoPackageName(), getPackageName(clazz));
    }

    protected boolean isNormalPojoClass(Class<?> clazz) {
        return getPojoPackageNames().contains(getPackageName(clazz));
    }

    protected String getSuperPojoPackageName() {
        return superPojoPackageName;
    }

    protected Set<String> getPojoPackageNames() {
        return pojoPackageNames;
    }

    protected ObjectMapper getGenericObjectMapper() {
        return genericObjectMapper;
    }

    protected ReflectionFunctions getReflectionFunctions() {
        return ReflectionFunctions.instance();
    }

    protected <C> C newInstance(Class<C> clazz) {
        return getReflectionFunctions().newInstance(clazz);
    }

    protected List translateList(List inputList, AttributeContext rAttrCtx) {
        Class<?> elemClass = getRawAttributeClass(rAttrCtx.getContainerClass(),
                rAttrCtx.getAttributeParameterizedType().getTypeParameters().get(0));

        List result = newInstance(inputList.getClass());
        for(Object elem: inputList) {
            result.add(genTranslation(elem, elemClass));
        }
        return result;
    }

    protected boolean isList(Class<?> clazz) {
        return List.class.isAssignableFrom(clazz);
    }

    protected Object genTranslation(Object obj, AttributeContext iAttrCtx, AttributeContext rAttrCtx) {
        Object result = null;
        if(obj != null) {
            Class<?> inputClass = getRawAttributeClass(iAttrCtx);
            Class<?> resultClass = getRawAttributeClass(rAttrCtx);
            if (isList(inputClass) && isList(resultClass)) {
                List inputList = (List) obj;
                result = listToList(inputList, iAttrCtx, rAttrCtx);
            } else if (isList(inputClass)) {
                List inputList = (List) obj;
                result = listToScalar(inputList, iAttrCtx, rAttrCtx, resultClass);
            } else if (isList(resultClass)) {
                result = scalarToList(obj, iAttrCtx, rAttrCtx);
            } else {
                result = scalarToScalar(obj, iAttrCtx, rAttrCtx, resultClass);
            }
        }
        return result;
    }

    protected Object scalarToScalar(Object obj, AttributeContext iAttrCtx, AttributeContext rAttrCtx, Class<?> resultClass) {
        Object inputAttributeType = iAttrCtx.getAttributeType();
        Object resultAttributeType = rAttrCtx.getAttributeType();
        checkAttributeTypesMatch(inputAttributeType, resultAttributeType);

        return genTranslation(obj, resultClass);
    }

    protected Object scalarToList(Object obj, AttributeContext iAttrCtx, AttributeContext rAttrCtx) {
        Object inputAttributeType = iAttrCtx.getAttributeType();
        Object resultListParamType = getFirstParamAttributeType(rAttrCtx);
        checkAttributeTypesMatch(inputAttributeType, resultListParamType);

        return Collections.singletonList(genTranslation(obj, getRawFirstParamClass(rAttrCtx)));
    }

    protected Object listToScalar(List inputList, AttributeContext iAttrCtx, AttributeContext rAttrCtx, Class<?> resultClass) {
        Object result = null;

        Object inputListParamType = getFirstParamAttributeType(iAttrCtx);
        Object resultAttributeType = rAttrCtx.getAttributeType();
        checkAttributeTypesMatch(inputListParamType, resultAttributeType);

        if(inputList.size() == 1) {
            result = genTranslation(inputList.get(0), resultClass);
        } else if(inputList.size() > 1) {
            throw new RuntimeException(
                    String.format("Error, input list had: %d elements, and the output was a single element",
                            inputList.size()));
        }
        return result;
    }

    protected Object listToList(List inputList, AttributeContext iAttrCtx, AttributeContext rAttrCtx) {
        Object inputListParamType = getFirstParamAttributeType(iAttrCtx);
        Object resultListParamType = getFirstParamAttributeType(rAttrCtx);
        checkAttributeTypesMatch(inputListParamType, resultListParamType);

        return translateList(inputList, rAttrCtx);
    }

    protected void checkAttributeTypesMatch(Object attributeType1, Object attributeType2) {
        if(!Objects.equals(attributeType1, attributeType2)) {
            throw new RuntimeException(
                    String.format("Attribute types do not match: '%s' != '%s'",
                            attributeType1, attributeType2));
        }
    }

    protected <RC> RC genTranslation(Object obj, Class<RC> resultClass) {
        RC result = null;
        if(obj != null) {
            result = getGenericObjectMapper().translate(obj, resultClass);
        }
        return result;
    }

    protected AttributeCache getAttributeCache() {
        return attributeCache;
    }

    protected JavaSourceFileDefinitionContext getAttributeContext(Class<?> clazz) {
        return getAttributeCache().get(clazz);
    }

    protected <IC, RC> RC translateInternal(Object obj, Class<IC> inputClass, Class<RC> resultClass) {
        JavaSourceFileDefinitionContext inputAttributeContext = getAttributeContext(inputClass);
        JavaSourceFileDefinitionContext resultAttributeContext = getAttributeContext(resultClass);

        return translateInternal(obj, inputClass, resultClass, inputAttributeContext, resultAttributeContext);
    }

    protected <IC, RC> RC translateInternal(Object obj, Class<IC> inputClass, Class<RC> resultClass,
                                            JavaSourceFileDefinitionContext inputAttributeContext,
                                            JavaSourceFileDefinitionContext resultAttributeContext) {
        RC result = null;
        if(inputAttributeContext.getClass() != resultAttributeContext.getClass()) {
            throw new RuntimeException(String.format("Classes are not of same type: inputClass: '%s', resultClass: '%s'", inputClass, resultClass));
        } else if (inputAttributeContext instanceof EnumDefinitionContext) {
            result = translateEnum(obj, inputClass, resultClass,
                    (EnumDefinitionContext) inputAttributeContext,
                    (EnumDefinitionContext) resultAttributeContext);
        } else if(inputAttributeContext instanceof PojoClassDefinitionContext) {
            result = translatePojo(obj, inputClass, resultClass,
                    (PojoClassDefinitionContext) inputAttributeContext,
                    (PojoClassDefinitionContext) resultAttributeContext);
        } else {
            throw new RuntimeException(String.format("JavaSourceFileDefinitionContext derived class not recognized: %s", inputAttributeContext));
        }
        return result;
    }

    // not loop safe
    protected <IC, RC> RC translatePojo(Object obj, Class<IC> inputClass, Class<RC> resultClass,
                                        PojoClassDefinitionContext inputAttributeContext,
                                        PojoClassDefinitionContext resultAttributeContext) {
        RC result = createEmptyObject(resultClass);

        Map<String, AttributeContext> rAttrMap = resultAttributeContext.getAttributeDescriptionMap();
        String iAttrName = null;
        AttributeContext iAttrCtx = null;
        AttributeContext rAttrCtx = null;
        Object iAttrVal = null;
        for(Map.Entry<String, AttributeContext> entry: inputAttributeContext.getAttributeDescriptionMap().entrySet()) {
            iAttrName = entry.getKey();
            iAttrCtx = entry.getValue();

            iAttrVal = getAttribValue(obj, iAttrCtx);
            if(iAttrVal != null) {
                rAttrCtx = rAttrMap.get(iAttrName);
                if(rAttrCtx == null) {
                    throw new RuntimeException(String.format("Attrib: '%s' not found at class '%s', cannot set attrib", iAttrName, resultClass));
                }
                setValue(result, iAttrCtx, rAttrCtx, iAttrVal);
            }
        }

        return result;
    }

    protected Object getAttribValue(Object obj, AttributeContext attrCtx) {
        Method getter = null;
        try {
            getter = attrCtx.getGetters().get(0);
            return getter.invoke(obj);
        } catch(Exception ex) {
            throw new RuntimeException(String.format("error applying getter: '%s' to object: '%s'", getter, obj), ex);
        }
    }

    protected <RC> RC createEmptyObject(Class<RC> resultClass) {
        try {
            return resultClass.newInstance();
        } catch(Exception ex) {
            throw new RuntimeException(String.format("Error creating result class: %s", resultClass), ex);
        }
    }

    protected Method getSetter(AttributeContext rAttrCtx) {
        return rAttrCtx.getSetters().get(0);
    }

    protected void setValue(Object result, AttributeContext iAttrCtx, AttributeContext rAttrCtx, Object iAttrVal) {
        Method setter = getSetter(rAttrCtx);
        setValue(result, setter,
                genTranslation(iAttrVal, iAttrCtx, rAttrCtx));
    }

    protected void setValue(Object result, Method setter, Object rAttrVal) {
        try {
            setter.invoke(result, rAttrVal);
        } catch(Exception ex) {
            throw new RuntimeException(
                    String.format("Error invoking setter ('%s') with attribValue: '%s' to object: %s",
                            setter, rAttrVal, result),
                    ex);
        }
    }

    protected Class<?> getRawAttributeClass(AttributeContext rAttrCtx) {
        return getRawAttributeClass(rAttrCtx.getContainerClass(), rAttrCtx.getAttributeType());
    }

    protected Object getFirstParamAttributeType(AttributeContext attrCtx) {
        return attrCtx.getAttributeParameterizedType().getTypeParameters().get(0);
    }

    protected Class<?> getRawFirstParamClass(AttributeContext attrCtx) {
        return getRawAttributeClass(attrCtx.getContainerClass(), getFirstParamAttributeType(attrCtx));
    }

    protected Class<?> getRawAttributeClass(Class<?> containerClazz, Object attributeType) {
        Class<?> result = null;
        if(attributeType instanceof String) {
            String className = (String) attributeType;
            result = getPackageClass(getPackageName(containerClazz), className);
        } else if(attributeType instanceof Class) {
            result = (Class<?>) attributeType;
        } else if(attributeType instanceof MyParameterizedType) {
            MyParameterizedType myParameterizedType = (MyParameterizedType) attributeType;
            result = getRawAttributeClass(containerClazz, myParameterizedType.getRawType());
        } else {
            throw new IllegalArgumentException("Not expected");
        }

        return result;
    }

    protected ClassFunctions getClassFunctions() {
        return ClassFunctions.instance();
    }

    protected Class<?> getPackageClass(String packageName, String simpleClassName) {
        return getClassFunctions().classForName(String.format("%s.%s", packageName, simpleClassName));
    }

    protected <IC, RC> RC translateEnum(Object obj, Class<IC> inputClass, Class<RC> resultClass,
                                        EnumDefinitionContext inputAttributeContext,
                                        EnumDefinitionContext resultAttributeContext) {
        return (RC) resultAttributeContext.valueOf(inputAttributeContext.name(obj));
    }
}
