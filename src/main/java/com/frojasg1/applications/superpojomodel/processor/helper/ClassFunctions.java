package com.frojasg1.applications.superpojomodel.processor.helper;

import com.frojasg1.applications.superpojomodel.contexts.MyParameterizedType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

public class ClassFunctions {

    protected static ClassFunctions INSTANCE = new ClassFunctions();

    public static ClassFunctions instance() {
        return INSTANCE;
    }

    protected int lengthOfClassPrefix(Class<?> clazz) {
        int result = 0;
        Package myPackage = clazz.getPackage();
        if(myPackage != null && !myPackage.getName().isEmpty()) {
            // skipping the last dot
            result = myPackage.getName().length() + 1;
        }
        return result;
    }

    public String getNestedClassName(Class<?> clazz) {
        return clazz.getName().substring(lengthOfClassPrefix(clazz));
    }

    public List<Class<?>> getPublicStaticNestedClasses(Class<?> clazz) {
        return Arrays.stream(clazz.getDeclaredClasses())
                .filter(clz -> Modifier.isPublic(clz.getModifiers()))
                .filter(clz -> Modifier.isStatic(clz.getModifiers()))
                .collect(Collectors.toList());
    }

    public boolean isNestedClass(String className) {
        return className.contains("$");
    }

    public String getSimpleClassName(String nestedClassName) {
        int pos = nestedClassName.lastIndexOf('$');
        return nestedClassName.substring(pos + 1);
    }

    protected Object getSimpleAttributeType(Class<?> typeClass, Class<?> inputPackageClass) {
        Object result = typeClass;
        if(Objects.equals(typeClass.getPackage(), inputPackageClass.getPackage())) {
            result = getNestedClassName(typeClass);
        }
        return result;
    }

    protected Object getParametrizedType(ParameterizedType typeClassParameters, Class<?> inputPackageClass) {
        Object result = getAttributeType(typeClassParameters.getRawType(), inputPackageClass);
        if(typeClassParameters instanceof ParameterizedTypeImpl) {
            MyParameterizedType myParameterizedType = new MyParameterizedType(result);

            for(Type parameterType: typeClassParameters.getActualTypeArguments()) {
                myParameterizedType.addTypeParameter(getAttributeType(parameterType, inputPackageClass));
            }
            result = myParameterizedType;
        }

        return result;
    }

    public Object getAttributeType(Type type, Class<?> inputPackageClass) {
        Object result = null;

        if(type instanceof Class) {
            result = getSimpleAttributeType((Class<?>) type, inputPackageClass);
        } else if(type instanceof ParameterizedType) {
            result = getParametrizedType((ParameterizedType) type, inputPackageClass);
        } else {
            throw new IllegalArgumentException("not expected type: " + type);
        }

        return result;
    }
}