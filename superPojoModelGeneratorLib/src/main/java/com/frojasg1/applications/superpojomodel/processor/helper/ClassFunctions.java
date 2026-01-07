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

package com.frojasg1.applications.superpojomodel.processor.helper;

import com.frojasg1.applications.superpojomodel.contexts.MyParameterizedType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
//import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

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

    public Class<?> classForName( String className )
    {
        try {
            return Class.forName(className);
        } catch(Exception ex) {
            throw new RuntimeException("Error loading class with name: " + className);
        }
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
//        if(typeClassParameters instanceof ParameterizedTypeImpl) {
            MyParameterizedType myParameterizedType = new MyParameterizedType(result);

            for(Type parameterType: typeClassParameters.getActualTypeArguments()) {
                myParameterizedType.addTypeParameter(getAttributeType(parameterType, inputPackageClass));
            }
            result = myParameterizedType;
//        }

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

    public Object getFirstParameter(Object attributeType) {
        Object result = null;
        MyParameterizedType type = cast(attributeType, MyParameterizedType.class);
        if(type != null) {
            if(!type.getTypeParameters().isEmpty()) {
                result = type.getTypeParameters().get(0);
            }
        }
        return result;
    }

    public <C> C cast(Object object, Class<C> clazz) {
        C result = null;
        if(clazz.isInstance(object)) {
            result = clazz.cast(object);
        }
        return result;
    }

    public boolean isParameterizedList(Object attributeType) {
        boolean result = false;
        Class<?> rawType = getRawListClass(attributeType);
        if(rawType != null) {
            result = List.class.isAssignableFrom(rawType);
        }
        return result;
    }

    public Class<?> getRawListClass(Object attributeType) {
        Class<?> result = null;
        MyParameterizedType type = cast(attributeType, MyParameterizedType.class);
        if(type != null) {
            result = cast(type.getRawType(), Class.class);
        }
        return result;
    }
}
