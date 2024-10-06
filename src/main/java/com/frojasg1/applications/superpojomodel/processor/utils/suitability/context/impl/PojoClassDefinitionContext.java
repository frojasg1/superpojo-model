package com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.impl;

import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.AttributeContext;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.JavaSourceFileDefinitionContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PojoClassDefinitionContext implements JavaSourceFileDefinitionContext {

    protected Class<?> definitionClass;

    protected Map<String, AttributeContext> attributeDescriptionMap = new HashMap<>();

    protected List<JavaSourceFileDefinitionContext> nestedClasses = new ArrayList<>();

    public PojoClassDefinitionContext(Class<?> definitionClass) {
        this.definitionClass = definitionClass;
    }

    public Object getAttributeDescription(String attributeName) {
        return getAttributeDescriptionMap().get(attributeName);
    }

    public void putAttributeDescription(String attributeName, AttributeContext attributeDescription) {
        getAttributeDescriptionMap().put(attributeName, attributeDescription);
    }

    public Map<String, AttributeContext> getAttributeDescriptionMap() {
        return attributeDescriptionMap;
    }

    @Override
    public Class<?> getDefinitionClass() {
        return definitionClass;
    }

    @Override
    public PojoClassDefinitionContext createCopy() {
        PojoClassDefinitionContext result = new PojoClassDefinitionContext(getDefinitionClass());

        result.copyFrom(this);

        return result;
    }

    public void copyFrom(PojoClassDefinitionContext that) {
        if(that != this) {
            this.definitionClass = that.definitionClass;

            this.getAttributeDescriptionMap().clear();
            this.getAttributeDescriptionMap().putAll(that.getAttributeDescriptionMap());

            this.getNestedClasses().clear();
            for(JavaSourceFileDefinitionContext nestedClass: that.getNestedClasses()) {
                this.getNestedClasses().add(nestedClass.createCopy());
            }
        }
    }

    public List<JavaSourceFileDefinitionContext> getNestedClasses() {
        return nestedClasses;
    }

    public void addNestedClass(JavaSourceFileDefinitionContext nestedClass) {
        getNestedClasses().add(nestedClass);
    }

    @Override
    public String toString() {
        return "PojoClassDefinitionContext{" +
                "definitionClass=" + definitionClass +
                '}';
    }
}
