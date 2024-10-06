package com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.impl;

import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.JavaSourceFileDefinitionContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnumDefinitionContext implements JavaSourceFileDefinitionContext {

    protected Class<?> definitionClass;

    protected List<String> elemNames = new ArrayList<>();

    public EnumDefinitionContext(Class<?> definitionClass) {
        this.definitionClass = definitionClass;
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
}
