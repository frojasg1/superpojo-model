package com.frojasg1.applications.superpojomodel.patterns;

import java.util.regex.Pattern;

public class SuperPojoCommonPatterns {
    public static final Pattern DEFAULT_GETTER_ATTRIBUTE_NAME_GETTER = Pattern.compile("^(is|get)([a-zA-z_][a-zA-Z_0-9]*)$");
    public static final Pattern DEFAULT_SETTER_ATTRIBUTE_NAME_GETTER = Pattern.compile("^set([a-zA-z_][a-zA-Z_0-9]*)$");
}
