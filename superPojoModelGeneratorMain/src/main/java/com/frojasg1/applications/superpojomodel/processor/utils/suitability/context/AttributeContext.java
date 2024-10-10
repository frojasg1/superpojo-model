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

package com.frojasg1.applications.superpojomodel.processor.utils.suitability.context;

import com.frojasg1.applications.superpojomodel.contexts.MyParameterizedType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AttributeContext {

    protected Class<?> containerClass;
    protected Class<?> attributeClass;
    protected String attributeSimpleClassName;
    protected MyParameterizedType attributeParameterizedType;
    protected List<Method> getters = new ArrayList<>();
    protected List<Method> setters = new ArrayList<>();


    public AttributeContext(Class<?> containerClass, Object attributeType) {
        this.containerClass = containerClass;
        if(attributeType instanceof String) {
            this.attributeSimpleClassName = (String) attributeType;
        } else if(attributeType instanceof Class) {
            this.attributeClass = (Class<?>) attributeType;
        } else if(attributeType instanceof MyParameterizedType) {
            this.attributeParameterizedType = (MyParameterizedType) attributeType;
        } else {
            throw new IllegalArgumentException(String.format("attributeType '%s' not of the expected type", attributeType));
        }
    }

    public MyParameterizedType getAttributeParameterizedType() {
        return attributeParameterizedType;
    }

    public Object getAttributeType() {
        Object result = getAttributeClass();
        if(result == null) {
            result = getAttributeSimpleClassName();
        }
        if(result == null) {
            result = getAttributeParameterizedType();
        }

        return result;
    }

    public Class<?> getContainerClass() {
        return containerClass;
    }

    public Class<?> getAttributeClass() {
        return attributeClass;
    }

    public String getAttributeSimpleClassName() {
        return attributeSimpleClassName;
    }

    public List<Method> getGetters() {
        return getters;
    }

    public List<Method> getSetters() {
        return setters;
    }

    public void addGetter(Method getter) {
        getGetters().add(getter);
    }

    public void addSetter(Method setter) {
        getSetters().add(setter);
    }

    @Override
    public String toString() {
        return "AttributeContext{" +
                "containerClass=" + containerClass +
                ", attributeClass=" + attributeClass +
                ", attributeSimpleClassName='" + attributeSimpleClassName + '\'' +
                '}';
    }
}
