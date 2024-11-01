package com.frojasg1.superpojomodel.mapper.mapper.impl;

import com.frojasg1.applications.superpojomodel.processor.helper.ReflectionFunctions;
import com.frojasg1.superpojomodel.mapper.mapper.ObjectMapper;
import com.frojasg1.superpojomodel.mapper.translator.Translator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import org.checkerframework.checker.units.qual.C;

public class ObjectMapperImpl implements ObjectMapper {

    protected Map<Class<?>, Map<Class<?>, Translator>> translationMap = new ConcurrentHashMap<>();

    protected List<ObjectMapper> extraMappers = new ArrayList<>();

    public ObjectMapperImpl init() {
        initTranslationMap();

        return this;
    }

    protected void initTranslationMap() {
        addClonner(Byte.class, Translator.identity());
        addClonner(Short.class, Translator.identity());
        addClonner(Integer.class, Translator.identity());
        addClonner(Long.class, Translator.identity());
        addClonner(String.class, Translator.identity());
        addClonner(Boolean.class, Translator.identity());
        addClonner(Date.class, date -> new Date(date.getTime()));
        addClonner(List.class, this::cloneList);
    }

    public <I, R> void addTranslator(Class<I> inputClass, Class<R> resultClass, Translator<I, R> translator) {
        getTranslationMap().computeIfAbsent(
                inputClass, ic -> new ConcurrentHashMap<>())
                .put(resultClass, translator);
    }

    public <C> void addClonner(Class<C> clazz, Translator<C, C> clonner) {
        addTranslator(clazz, clazz, clonner);
    }

    public void addExtraMapper(ObjectMapper extraMapper) {
        getExtraMappers().add(extraMapper);
    }

    protected List<ObjectMapper> getExtraMappers() {
        return extraMappers;
    }

    protected Map<Class<?>, Map<Class<?>, Translator>> getTranslationMap() {
        return translationMap;
    }

    @Override
    public <IC, RC> RC translate(Object obj, Class<IC> inputClass, Class<RC> resultClass) {
        RC result = null;

        if(obj != null) {
            result = directTranslation(obj, inputClass, resultClass);

            if(result == null) {
                result = computeExtraMapping(obj, inputClass, resultClass);
            }

            if(result == null) {
                throw new RuntimeException(String.format("No translator found from %s to %s", inputClass, resultClass));
            }
        }

        return result;
    }

    protected <IC, RC> RC directTranslation(Object obj, Class<IC> inputClass, Class<RC> resultClass) {
        RC result = null;
        if(obj != null) {
            Translator<IC, RC> translator = getTranslator(inputClass, resultClass);
            if(translator != null) {
                result = translator.apply(inputClass.cast(obj));
            }
        }

        return result;
    }

    protected <IC, RC> Translator<IC, RC> getDirectTranslator(Class<IC> inputClass, Class<RC> resultClass) {
        Map<Class<?>, Translator> map = getTranslationMap().get(inputClass);
        Translator result = null;
        if(map != null) {
            result = map.get(resultClass);
        }
        return result;
    }

    protected List<Class<?>> getSuperClasses(Class<?> clazz) {
        return ReflectionFunctions.instance().getAllSuper(clazz);
    }

    protected <IC, RC> Translator<IC, RC> getTranslator(Class<IC> inputClass, Class<RC> resultClass) {
        Translator result = getSuperClasses(inputClass)
                .stream()
                .map(inClass -> getDirectTranslator(inClass, resultClass))
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(null);

        return result;
    }

    protected <IC, RC> RC computeExtraMapping(Object obj, Class<IC> inputClass, Class<RC> resultClass) {
        RC result = null;
        for(ObjectMapper mapper: getExtraMappers()) {
            result = mapper.translate(obj, inputClass, resultClass);
            if(result != null) {
                break;
            }
        }
        return result;
    }

    @Override
    public <RC> RC translate(Object obj, Class<RC> resultClass) {
        RC result = null;
        if(obj != null) {
            result = translate(obj, obj.getClass(), resultClass);
        }
        return result;
    }

    protected <I> List<I> cloneList(List<I> inputList) {
        List<I> result = null;
        if(inputList != null) {
            result = createEmptyCollectionDefaultConstructor(inputList.getClass());
            for(I elem: inputList) {
                if(elem != null) {
                    result.add((I) translate(elem, elem.getClass()));
                }
            }
        }
        return result;
    }

    protected <I, C extends List<I>> C createEmptyCollectionDefaultConstructor(Class<C> clazz) {
        return createEmptyCopyDefaultConstructor(clazz);
    }

    protected <C> C createEmptyCopyDefaultConstructor(Class<C> clazz) {
        try {
            return clazz.newInstance();
        } catch(Exception ex) {
            throw new RuntimeException("Error using default constructor of: " + clazz);
        }
    }
}
