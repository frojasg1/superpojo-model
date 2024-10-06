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

package com.frojasg1.applications.superpojomodel.contexts;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyParameterizedType {

    protected Object rawType;

    protected List<Object> typeParameters = new ArrayList<>();

    public MyParameterizedType(Object rawType) {
        this.rawType = rawType;
    }

    public Object getRawType() {
        return rawType;
    }

    public List<Object> getTypeParameters() {
        return typeParameters;
    }

    public void addTypeParameter(Object typeParameter) {
        getTypeParameters().add(typeParameter);
    }

    @Override
    public String toString() {
        return "MyParameterizedType{" +
                "rawType=" + rawType +
                ", typeParameters=" + typeParameters +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyParameterizedType that = (MyParameterizedType) o;
        return Objects.equals(getRawType(), that.getRawType()) && Objects.equals(getTypeParameters(), that.getTypeParameters());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRawType(), getTypeParameters());
    }
}
