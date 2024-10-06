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
