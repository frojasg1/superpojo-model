package com.frojasg1.superpojomodel.mapper.attributecache;

import com.frojasg1.applications.superpojomodel.config.SuperPojoModelGeneratorConfiguration;
import com.frojasg1.applications.superpojomodel.patterns.SuperPojoCommonPatterns;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.SuperPojoClassNamesSuitability;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.JavaSourceFileDefinitionContext;
import com.google.common.cache.CacheLoader;
import java.util.Collections;
import java.util.regex.Pattern;

public class AttributeCacheBuilder {

    public AttributeCache createCache() {
        return createCache(SuperPojoCommonPatterns.DEFAULT_GETTER_ATTRIBUTE_NAME_GETTER,
                SuperPojoCommonPatterns.DEFAULT_SETTER_ATTRIBUTE_NAME_GETTER);
    }

    public AttributeCache createCache(Pattern getterAttributeNameGetter, Pattern setterAttributeNameGetter) {
        return createCache(createConfiguration(getterAttributeNameGetter, setterAttributeNameGetter));
    }

    public AttributeCache createCache(SuperPojoModelGeneratorConfiguration config) {
        return new AttributeCache(createCacheLoader(config))
                .init();
    }

    protected SuperPojoModelGeneratorConfiguration createDefaultConfiguration() {
        return new SuperPojoModelGeneratorConfiguration();
    }

    public SuperPojoModelGeneratorConfiguration createConfiguration(Pattern getterAttributeNameGetter,
                                                                    Pattern setterAttributeNameGetter) {
        return createDefaultConfiguration()
                .setGetterRegexPattern(getterAttributeNameGetter)
                .setSetterRegexPattern(setterAttributeNameGetter);
    }


    protected AttributeCacheLoader createCacheLoader(SuperPojoModelGeneratorConfiguration config) {
        return new AttributeCacheLoader(createSuperPojoClassNamesSuitability(config));
    }

    protected SuperPojoClassNamesSuitability createSuperPojoClassNamesSuitability(SuperPojoModelGeneratorConfiguration config) {
        return new SuperPojoClassNamesSuitability(this.getClass().getClassLoader(), Collections.emptyList(), config);
    }

    protected static class AttributeCacheLoader extends CacheLoader<Class<?>, JavaSourceFileDefinitionContext> {
        protected SuperPojoClassNamesSuitability superPojoClassNamesSuitability;

        public AttributeCacheLoader(SuperPojoClassNamesSuitability superPojoClassNamesSuitability) {
            this.superPojoClassNamesSuitability = superPojoClassNamesSuitability;
        }

        @Override
        public JavaSourceFileDefinitionContext load(Class<?> key) {
            return getSuperPojoClassNamesSuitability().calculateCurrentJavaDefinition(key);
        }

        protected SuperPojoClassNamesSuitability getSuperPojoClassNamesSuitability() {
            return superPojoClassNamesSuitability;
        }
    }
}
