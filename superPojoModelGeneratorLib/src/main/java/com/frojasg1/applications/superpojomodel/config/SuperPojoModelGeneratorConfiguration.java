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

import java.util.regex.Pattern;

public class SuperPojoModelGeneratorConfiguration {
    protected boolean isToAddListItemAdder;
    protected boolean isToAddToString;
    protected boolean isToAddBuilderStyle;
    protected boolean isToIgnoreErrors;
    protected boolean elementAndListOfElementsAreCompatible;

    protected Pattern setterRegexPattern;
    protected Pattern getterRegexPattern;

    protected String[] inputJars;

    protected String[] inputPackages;

    protected String outputFolder;

    protected String outputPackage;

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

    public void setToAddListItemAdder(boolean toAddListItemAdder) {
        isToAddListItemAdder = toAddListItemAdder;
    }

    public void setToAddToString(boolean toAddToString) {
        isToAddToString = toAddToString;
    }

    public void setToAddBuilderStyle(boolean toAddBuilderStyle) {
        isToAddBuilderStyle = toAddBuilderStyle;
    }

    public void setToIgnoreErrors(boolean toIgnoreErrors) {
        isToIgnoreErrors = toIgnoreErrors;
    }

    public void setElementAndListOfElementsAreCompatible(boolean elementAndListOfElementsAreCompatible) {
        this.elementAndListOfElementsAreCompatible = elementAndListOfElementsAreCompatible;
    }

    public void setSetterRegexPattern(Pattern setterRegexPattern) {
        this.setterRegexPattern = setterRegexPattern;
    }

    public void setGetterRegexPattern(Pattern getterRegexPattern) {
        this.getterRegexPattern = getterRegexPattern;
    }

    public void setInputJars(String[] inputJars) {
        this.inputJars = inputJars;
    }

    public void setInputPackages(String[] inputPackages) {
        this.inputPackages = inputPackages;
    }

    public void setOutputFolder(String outputFolder) {
        this.outputFolder = outputFolder;
    }

    public void setOutputPackage(String outputPackage) {
        this.outputPackage = outputPackage;
    }
}
