package com.frojasg1.superpojomodel.mapper.mapper;

public interface ObjectMapper {

    public <IC, RC> RC translate(Object obj, Class<IC> inputClass, Class<RC> resultClass);
    public <RC> RC translate(Object obj, Class<RC> resultClass);
}
