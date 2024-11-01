package com.frojasg1.superpojomodel.mapper.translator;

import java.util.function.Function;

public interface Translator<IC, RC> extends Function<IC, RC>  {

    static <T> Translator<T, T> identity() {
        return t -> t;
    }
}
