package com.frojasg1.applications.superpojomodel.processor.utils.suitability.context;

public interface JavaSourceFileDefinitionContext {

    public Class<?> getDefinitionClass();

    public JavaSourceFileDefinitionContext createCopy();
}
