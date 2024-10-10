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

package com.frojasg1.applications.superpojomodel.processor;

import com.frojasg1.applications.superpojomodel.config.SuperPojoModelGeneratorConfiguration;
import com.frojasg1.applications.superpojomodel.processor.utils.classnamescalculator.SuperPojoClassNamesCalculator;
import com.frojasg1.applications.superpojomodel.processor.utils.codegeneration.CodeGenerator;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.SuperPojoClassNamesSuitability;
import com.frojasg1.applications.superpojomodel.processor.utils.suitability.context.JavaSourceFileDefinitionContext;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;

public class Processor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class);

    protected SuperPojoModelGeneratorConfiguration commandLineArgs;
    protected URLClassLoader urlClassLoader;

    public Processor(SuperPojoModelGeneratorConfiguration commandLineArgs) {
        this.commandLineArgs = commandLineArgs;
    }

    public void process() {
        LOGGER.info("Starting processing");

        urlClassLoader = createURLClassLoader();

        // https://stackoverflow.com/questions/15204913/how-to-add-an-external-jar-file-to-the-classpath-dynamically-at-runtime
        List<String> superPojoSimpleClassNames = getSuperPojoSimpleClassNames(urlClassLoader);

        SuperPojoClassNamesSuitability superPojoClassNamesSuitability = checkSuperPojoClassListSuitability(superPojoSimpleClassNames);

        superPojoClassNamesSuitability.errLog("");
        superPojoClassNamesSuitability.errLog("");
        superPojoClassNamesSuitability.errLog("Errors: " + superPojoClassNamesSuitability.getNumErrors());
        superPojoClassNamesSuitability.errLog("Warnings: " + superPojoClassNamesSuitability.getNumWarnings());

        if(superPojoClassNamesSuitability.getNumErrors() > 0) {
            if(getCommandLineArgs().isToIgnoreErrors()) {
                superPojoClassNamesSuitability.errLog("Errors at processing. Ignoring them ...");
            } else {
                superPojoClassNamesSuitability.errLog("Errors at processing. Exiting ...");
                System.exit(1);
            }
        }

        Map<String, JavaSourceFileDefinitionContext> superPojoMap = superPojoClassNamesSuitability.getJavaClassDefinitionResultMap();
        generateCode(superPojoMap);
    }

    protected SuperPojoClassNamesCalculator getSuperPojoClassNamesCalculator() {
        return SuperPojoClassNamesCalculator.instance();
    }

    protected List<String> getSuperPojoSimpleClassNames(URLClassLoader urlClassLoader) {
        return getSuperPojoClassNamesCalculator().process(urlClassLoader, getInputPackages());
    }

    protected SuperPojoClassNamesSuitability createSuperPojoClassNamesSuitability(List<String> superPojoSimpleClasses) {
        return new SuperPojoClassNamesSuitability(getUrlClassLoader(), superPojoSimpleClasses, getCommandLineArgs());
    }

    protected SuperPojoClassNamesSuitability checkSuperPojoClassListSuitability(List<String> superPojoSimpleClassNames) {
        return createSuperPojoClassNamesSuitability(superPojoSimpleClassNames).process();
    }

    public URLClassLoader getUrlClassLoader() {
        return urlClassLoader;
    }

    protected SuperPojoModelGeneratorConfiguration getCommandLineArgs() {
        return commandLineArgs;
    }

    protected String[] getInputJars() {
        return getCommandLineArgs().getInputJars();
    }

    protected String[] getInputPackages() {
        return getCommandLineArgs().getInputPackages();
    }

    protected String getOutputFolder() {
        return getCommandLineArgs().getOutputFolder();
    }

    protected String getOutputPackage() {
        return getCommandLineArgs().getOutputPackage();
    }

    protected Pattern getGetterRegexPattern() {
        return getCommandLineArgs().getGetterRegexPattern();
    }

    protected Pattern getSetterRegexPattern() {
        return getCommandLineArgs().getSetterRegexPattern();
    }

    protected URL toURL(String fileName) {
        try {
            return new File(fileName).toURI().toURL();
        } catch(Exception ex) {
            throw new RuntimeException("error getting URL from: " + fileName, ex);
        }
    }

    protected URLClassLoader createURLClassLoader() {
        return createURLClassLoader(getInputJars());
    }

    protected URLClassLoader createURLClassLoader(String[] jarFileNames) {
        URL[] jarUrls = Arrays.stream(jarFileNames)
                .map(this::toURL)
                .collect(Collectors.toList())
                .toArray(new URL[0]);

        return new URLClassLoader(jarUrls, this.getClass().getClassLoader());
    }

    protected CodeGenerator createCodeGenerator(Map<String, JavaSourceFileDefinitionContext> superPojoMap) {
        return new CodeGenerator(getCommandLineArgs(), superPojoMap);
    }

    protected void generateCode(Map<String, JavaSourceFileDefinitionContext> superPojoMap) {
        createCodeGenerator(superPojoMap)
                .process();
    }
}
