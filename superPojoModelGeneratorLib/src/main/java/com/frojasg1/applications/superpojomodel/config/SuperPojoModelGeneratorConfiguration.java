/*
 * Copyright (c) 2024. Francisco Javier Rojas Garrido <frojasg1@hotmail.com>
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 3.0 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You may obtain a copy of the License at
 *
 *       http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 */

package com.frojasg1.applications.superpojomodel.config;

import com.frojasg1.applications.superpojomodel.patterns.SuperPojoCommonPatterns;
import java.util.regex.Pattern;

public class SuperPojoModelGeneratorConfiguration {
    protected boolean isToAddListItemAdder;
    protected boolean isToAddToString;
    protected boolean isToAddHashcodeAndEquals;
    protected boolean isToAddBuilderStyle;
    protected boolean isToIgnoreErrors;
    protected boolean elementAndListOfElementsAreCompatible;

    protected Pattern setterRegexPattern = SuperPojoCommonPatterns.DEFAULT_SETTER_ATTRIBUTE_NAME_GETTER;
    protected Pattern getterRegexPattern = SuperPojoCommonPatterns.DEFAULT_GETTER_ATTRIBUTE_NAME_GETTER;

    protected String[] inputJars;

    protected String[] inputPackages;

    protected String outputFolder;

    protected String outputPackage;
    protected String fieldModifier;

    public String[] getInputJars() {
        return inputJars;
    }

    public String[] getInputPackages() {
        return inputPackages;
    }

    public String getOutputFolder() {
        return outputFolder;
    }

    public String getOutputPackage() {
        return outputPackage;
    }

    public Pattern getGetterRegexPattern() {
        return getterRegexPattern;
    }

    public Pattern getSetterRegexPattern() {
        return setterRegexPattern;
    }

    public boolean isToAddToString() {
        return isToAddToString;
    }

    public boolean isToAddBuilderStyle() {
        return isToAddBuilderStyle;
    }
    public boolean isToIgnoreErrors() {
        return isToIgnoreErrors;
    }

    public boolean elementAndListOfElementsAreCompatible() {
        return elementAndListOfElementsAreCompatible;
    }

    public boolean isToAddListItemAdder() {
        return isToAddListItemAdder;
    }

    public boolean isToAddHashcodeAndEquals() {
        return isToAddHashcodeAndEquals;
    }

    public SuperPojoModelGeneratorConfiguration setToAddListItemAdder(boolean toAddListItemAdder) {
        isToAddListItemAdder = toAddListItemAdder;
        return this;
    }

    public SuperPojoModelGeneratorConfiguration setToAddToString(boolean toAddToString) {
        isToAddToString = toAddToString;
        return this;
    }

    public SuperPojoModelGeneratorConfiguration setToAddHashcodeAndEquals(boolean toAddHashcodeAndEquals) {
        isToAddHashcodeAndEquals = toAddHashcodeAndEquals;
        return this;
    }

    public SuperPojoModelGeneratorConfiguration setToAddBuilderStyle(boolean toAddBuilderStyle) {
        isToAddBuilderStyle = toAddBuilderStyle;
        return this;
    }

    public SuperPojoModelGeneratorConfiguration setToIgnoreErrors(boolean toIgnoreErrors) {
        isToIgnoreErrors = toIgnoreErrors;
        return this;
    }

    public SuperPojoModelGeneratorConfiguration setElementAndListOfElementsAreCompatible(boolean elementAndListOfElementsAreCompatible) {
        this.elementAndListOfElementsAreCompatible = elementAndListOfElementsAreCompatible;
        return this;
    }

    public SuperPojoModelGeneratorConfiguration setSetterRegexPattern(Pattern setterRegexPattern) {
        this.setterRegexPattern = setterRegexPattern;
        return this;
    }

    public SuperPojoModelGeneratorConfiguration setGetterRegexPattern(Pattern getterRegexPattern) {
        this.getterRegexPattern = getterRegexPattern;
        return this;
    }

    public SuperPojoModelGeneratorConfiguration setInputJars(String[] inputJars) {
        this.inputJars = inputJars;
        return this;
    }

    public SuperPojoModelGeneratorConfiguration setInputPackages(String[] inputPackages) {
        this.inputPackages = inputPackages;
        return this;
    }

    public SuperPojoModelGeneratorConfiguration setOutputFolder(String outputFolder) {
        this.outputFolder = outputFolder;
        return this;
    }

    public SuperPojoModelGeneratorConfiguration setOutputPackage(String outputPackage) {
        this.outputPackage = outputPackage;
        return this;
    }

    public String getFieldModifier() {
        return fieldModifier;
    }

    public SuperPojoModelGeneratorConfiguration setFieldModifier(String fieldModifier) {
        this.fieldModifier = fieldModifier;
        return this;
    }
}
