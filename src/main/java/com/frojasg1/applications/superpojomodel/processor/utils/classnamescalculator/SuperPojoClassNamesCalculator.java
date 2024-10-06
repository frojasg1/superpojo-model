package com.frojasg1.applications.superpojomodel.processor.utils.classnamescalculator;

import com.frojasg1.applications.superpojomodel.processor.helper.ClassFunctions;
import com.google.common.reflect.ClassPath;
import java.io.IOException;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SuperPojoClassNamesCalculator {

    protected static SuperPojoClassNamesCalculator INSTANCE = new SuperPojoClassNamesCalculator();

    public static SuperPojoClassNamesCalculator instance() {
        return INSTANCE;
    }

    public List<String> process(URLClassLoader urlClassLoader, String[] inputPackageNames) {
        try {
            return processInternal(urlClassLoader, inputPackageNames);
        } catch(Exception ex) {
            throw new RuntimeException("Error calculating super-pojo class names", ex);
        }
    }

    protected List<String> processInternal(URLClassLoader urlClassLoader,
                                           String[] inputPackageNames) throws IOException {
        Set<String> set = new HashSet<>();

        // https://stackoverflow.com/questions/15720822/how-to-get-names-of-classes-inside-a-jar-file
//        ClassPath cp= ClassPath.from(Thread.currentThread().getContextClassLoader());
        ClassPath cp= ClassPath.from(urlClassLoader);
        for(String inputPackageName: inputPackageNames) {
            for(ClassPath.ClassInfo info : cp.getTopLevelClasses(inputPackageName)) {
                addClassClasses(set, loadClass(urlClassLoader, info));
            }
        }

        List<String> result = new ArrayList<>(set);
        Collections.sort(result);

        return result;
    }

    protected Class<?> loadClass(URLClassLoader urlClassLoader, ClassPath.ClassInfo classInfo) {
        try {
            return urlClassLoader.loadClass(classInfo.getName());
        } catch(Exception ex) {
            throw new RuntimeException("Cannot load class: " + classInfo.getName(), ex);
        }
    }

    protected ClassFunctions getClassFunctions() {
        return ClassFunctions.instance();
    }

    protected String getNestedClassName(Class<?> clazz) {
        return getClassFunctions().getNestedClassName(clazz);
    }

    protected List<Class<?>> getPublicStaticNestedClasses(Class<?> clazz) {
        return getClassFunctions().getPublicStaticNestedClasses(clazz);
    }

    protected void addClassClasses(Set<String> set, Class<?> clazz) {
        set.add(getNestedClassName(clazz));

        for(Class<?> nestedClass: getPublicStaticNestedClasses(clazz)) {
            addClassClasses(set, nestedClass);
        }
    }
}
