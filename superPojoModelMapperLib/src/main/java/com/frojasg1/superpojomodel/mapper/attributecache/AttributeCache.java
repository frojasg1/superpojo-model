package com.frojasg1.superpojomodel.mapper.attributecache;

import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.JavaSourceFileDefinitionContext;
import com.frojasg1.superpojomodel.mapper.cache.PersistentCache;
import com.google.common.cache.CacheLoader;

public class AttributeCache extends PersistentCache<Class<?>, JavaSourceFileDefinitionContext> {

    public AttributeCache(CacheLoader<Class<?>, JavaSourceFileDefinitionContext> loader) {
        super(loader);
    }

    @Override
    public AttributeCache init() {
        super.init();

        return this;
    }
}
