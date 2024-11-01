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

package com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.impl;

import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.JavaSourceFileDefinitionContext;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnumDefinitionContext implements JavaSourceFileDefinitionContext {

    protected Class<?> definitionClass;

    protected List<String> elemNames = new ArrayList<>();

    protected Method nameFunction;
    protected Method valueOfFunction;


    public EnumDefinitionContext(Class<?> definitionClass) {
        this.definitionClass = definitionClass;

        try {
            nameFunction = definitionClass.getMethod("name");
        } catch(Exception ex) {
            throw new RuntimeException(String.format("%s does not seem to be an enum. It does not have name() function", definitionClass), ex);
        }

        try {
            valueOfFunction = definitionClass.getMethod("valueOf", String.class);
        } catch(Exception ex) {
            throw new RuntimeException(String.format("%s does not seem to be an enum. It does not have valueOf() function", definitionClass), ex);
        }
    }

    public List<String> getElemNames() {
        return elemNames;
    }

    public void addElemName(String elemName) {
        getElemNames().add(elemName);
    }

    @Override
    public Class<?> getDefinitionClass() {
        return definitionClass;
    }

    @Override
    public EnumDefinitionContext createCopy() {
        EnumDefinitionContext result = new EnumDefinitionContext(getDefinitionClass());

        result.copyFrom(this);

        return result;
    }

    public void copyFrom(EnumDefinitionContext that) {
        if(that != this) {
            this.definitionClass = that.definitionClass;
            this.getElemNames().clear();
            this.getElemNames().addAll(that.getElemNames());
        }
    }

    @Override
    public String toString() {
        return "EnumDefinitionContext{" +
                "definitionClass=" + definitionClass +
                '}';
    }

    public String name(Object enumElementOfThisClass) {
        try {
            return (String) nameFunction.invoke(enumElementOfThisClass);
        } catch(Exception ex) {
            throw new IllegalArgumentException(
                    String.format("%s does not seem to be of enum: %s",
                            enumElementOfThisClass, getDefinitionClass()),
                    ex);
        }
    }

    public Object valueOf(String elemName) {
        try {
            return valueOfFunction.invoke(null, elemName);
        } catch(Exception ex) {
            throw new IllegalArgumentException(
                    String.format("%s does not seem to be the name of an element of enum: %s",
                            elemName, getDefinitionClass()),
                    ex);
        }
    }
}
