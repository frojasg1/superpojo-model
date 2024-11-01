package com.frojasg1.superpojomodel.mapper.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class PersistentCache<KK, VV> {

    protected LoadingCache<KK, VV> cache;

    protected CacheLoader<KK, VV> loader;

    public PersistentCache(CacheLoader<KK, VV> loader) {
        this.loader = loader;
    }

    public PersistentCache<KK, VV> init() {
        cache = createCache();

        return this;
    }

    protected LoadingCache<KK, VV> createCache() {
        return CacheBuilder.newBuilder().build(loader);
    }

    protected LoadingCache<KK, VV> getCache() {
        return cache;
    }

    public VV get(KK key) {
        try {
            return getCache().get(key);
        } catch(Exception ex) {
            throw new RuntimeException(String.format("Error getting cache value for: %s", key), ex);
        }
    }
}
