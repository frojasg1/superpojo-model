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

package com.frojasg1.applications.superpojomodel.args;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandLineArgs {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommandLineArgs.class);

    protected static final Pattern DEFAULT_GETTER_ATTRIBUTE_NAME_GETTER = Pattern.compile("^(is|get)([a-zA-z_][a-zA-Z_0-9]*)$");
    protected static final Pattern DEFAULT_SETTER_ATTRIBUTE_NAME_GETTER = Pattern.compile("^set([a-zA-z_][a-zA-Z_0-9]*)$");

    protected String applicationName;

    protected String[] arguments;
    protected Options options;
    protected String usagesTextHeader;
    protected CommandLine commandLine;

    protected boolean allowEmptyCommandLineArguments;

    public CommandLineArgs(String applicationName, String usagesTextHeader) {
        this.applicationName = applicationName;
        this.usagesTextHeader = usagesTextHeader;
    }

    protected CommandLine getCommandLine() {
        return commandLine;
    }

    protected String getApplicationName() {
        return applicationName;
    }

    protected String getUsagesTextHeader() {
        return usagesTextHeader;
    }

    public boolean isAllowEmptyCommandLineArguments() {
        return allowEmptyCommandLineArguments;
    }

    public void setAllowEmptyCommandLineArguments(boolean allowEmptyCommandLineArguments) {
        this.allowEmptyCommandLineArguments = allowEmptyCommandLineArguments;
    }

    protected String getHeaderString(Exception ex) {
        return String.format("ERROR: %s\n%s", ex.getMessage(), getUsagesTextHeader());
    }

    protected void printUsage(Options options, Exception ex) {
        createHelpFormatter().printHelp(getApplicationName(), getHeaderString(ex),
                options, null, true);
    }

    protected Integer getJlineTerminalColumnWidth() {
        return safeFunctionExecution(() -> org.jline.terminal.TerminalBuilder.terminal().getWidth(), true);
    }

    protected <CC> CC safeFunctionExecution( UnsafeFunction<CC> run, boolean traceException )
    {
        CC result = null;
        try
        {
            if( ! Thread.currentThread().isInterrupted() )
                result = run.run();
        }
        catch (InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        catch( Exception | LinkageError ex )
        {
            if( traceException )
                ex.printStackTrace();
        }

        return( result );
    }

    protected Integer getTerminalColumnWidth() {
        Integer result = getJlineTerminalColumnWidth();
        if(Objects.equals(result, 0)) {
            result = null;
        }
        return result;
    }
    protected HelpFormatter createHelpFormatter() {
        HelpFormatter result = new HelpFormatter();
        Integer terminalColumnWidth = getTerminalColumnWidth();
        if(terminalColumnWidth != null) {
            result.setWidth(terminalColumnWidth);
        }

        return result;
    }

    public CommandLine createCommandLine(String[] args) {
        CommandLine result = null;
        try {
            result = createCommandLineInternal(args);
        } catch (Exception ex) {
            printUsage(options, ex);
            result = null;
            LOGGER.error("CommandLine arguments parsing error");
//            throw new RuntimeException("CommandLine arguments parsing error", ex);
        }

        return result;
    }

    public CommandLine createCommandLineInternal(String[] args) throws ParseException {
        arguments = args;

        options = configureOptions();

        commandLine = createCommandLine(options, args);

        validate(commandLine);

        return commandLine;
    }

    protected void validate(CommandLine cl) {
        checkOptions(cl);
    }

    protected CommandLine createCommandLine(Options opts, String[] args) throws ParseException {
        return new DefaultParser().parse(opts, args);
    }

    protected Options configureOptions() {
        Options options = new Options();

        options.addOption(Option.builder("inputJar")
                .optionalArg(false)
                .hasArg()
                .numberOfArgs(Option.UNLIMITED_VALUES)
                .argName("inputJar")
                .desc("Jars which contain input models").build());

        options.addOption(Option.builder("inputPackage")
                .optionalArg(false)
                .hasArg()
                .numberOfArgs(Option.UNLIMITED_VALUES)
                .argName("inputPackage")
                .desc("Different model input packages (the pojos of every model must be in the same package)").build());

        options.addOption(Option.builder("outputFolder")
                .optionalArg(false)
                .hasArg()
                .argName("outputFolder")
                .numberOfArgs(1)
                .desc("Output folder").build());

        options.addOption(Option.builder("outputPackage")
                .optionalArg(false)
                .hasArg()
                .argName("outputPackage")
                .numberOfArgs(1)
                .desc("Output package").build());

        options.addOption(Option.builder("getterRegex")
                .optionalArg(true)
                .hasArg()
                .argName("getterRegex")
                .numberOfArgs(1)
                .desc("getter regex. Example: '^(is|get)([a-zA-z_][a-zA-Z_0-9]*)$'").build());

        options.addOption(Option.builder("setterRegex")
                .optionalArg(true)
                .hasArg()
                .argName("setterRegex")
                .numberOfArgs(1)
                .desc("getter regex. Example: '^set([a-zA-z_][a-zA-Z_0-9]*)$'").build());

        options.addOption(Option.builder("toString")
                .optionalArg(true)
                .hasArg(false)
                .numberOfArgs(0)
                .desc("flag to tell if toString function is going to be created").build());

        options.addOption(Option.builder("addBuilderStyle")
                .optionalArg(true)
                .hasArg(false)
                .numberOfArgs(0)
                .desc("flag to tell whether pojos will include builder style or not").build());

        options.addOption(Option.builder("ignoreErrors")
                .optionalArg(true)
                .hasArg(false)
                .numberOfArgs(0)
                .desc("flag to tell if when error number is greater than zero the output is generated or not").build());

        return options;
    }

    protected void validateOptionalGen(String value, String paramName, Consumer<String> validator) {
        boolean valid = (value == null);
        if(!valid) {
            try {
                validator.accept(value);
            } catch(Exception ex) {
                new RuntimeException(String.format("%s not valid: %s", paramName, value));
            }
        }
    }

    protected String getString(String argName, String defaultResult) {
        return getGenValue(argName, Function.identity(), defaultResult);
    }

    protected <V> V getGenValue(String argName, Function<String, V> parseFunction, V defaultResult) {
        V result = defaultResult;
        String stringValue = commandLine.getOptionValue(argName);
        if(stringValue != null) {
            result = parseFunction.apply(stringValue);
            if(result == null) {
                throw new IllegalArgumentException(String.format("Argument -%s did not have an appropriate value '%s'",
                        argName, stringValue));
            }
        }
        return result;
    }

    protected boolean isFile(String filename) {
        return new File(filename).isFile();
    }

    protected String getExtension(String filename) {
        String[] parts = filename.split("\\.");

        return parts[parts.length - 1];
    }

    protected void checkIsJarFile(String filename, String paramName) {
        if(!isFile(filename)) {
            throw new IllegalArgumentException(String.format("'%s' is not a .jar file at -%s param name", filename, paramName));
        }

        if(!Objects.equals(getExtension(filename), "jar")) {
            throw new IllegalArgumentException(String.format("'%s' is not a .jar file at -%s param name", filename, paramName));
        }
    }

    protected void checkExistingJarFiles(String[] filenames, String paramName) {
        for(String filename: filenames) {
            checkIsJarFile(filename, paramName);
        }
    }

    protected boolean isFolder(String foldername) {
        return new File(foldername).isDirectory();
    }

    protected void checkExistingFolder(String foldername, String paramName) {
        if(!isFolder(foldername)) {
            throw new IllegalArgumentException(String.format("'%s' is not a directory at -%s option", foldername, paramName));
        }
    }

    protected Pattern createRegex(String regexStr) {
        return Pattern.compile(regexStr);
    }

    protected void checkRegex(String regexStr, String paramName) {
        try {
            if(regexStr != null) {
                createRegex(regexStr);
            }
        } catch(Exception ex) {
            throw new IllegalArgumentException(
                    String.format("'%s' string does not seem to be a regex at -%s option", regexStr, paramName), ex);
        }
    }

    protected void checkOptions(CommandLine cl) {
        if (!isAllowEmptyCommandLineArguments() && (cl.getOptions().length == 0)) {
            throw new RuntimeException("No arguments were given");
        }

        checkExistingJarFiles(cl.getOptionValues("inputJar"), "inputJar");
        checkExistingFolder(cl.getOptionValue("outputFolder"), "outputFolder");
        checkRegex(cl.getOptionValue("getterRegex"), "getterRegex");
        checkRegex(cl.getOptionValue("setterRegex"), "setterRegex");
    }

    public String[] getInputJars() {
        return getCommandLine().getOptionValues("inputJar");
    }

    public String[] getInputPackages() {
        return getCommandLine().getOptionValues("inputPackage");
    }

    public String getOutputFolder() {
        return getCommandLine().getOptionValue("outputFolder");
    }

    public String getOutputPackage() {
        return getCommandLine().getOptionValue("outputPackage");
    }

    public Pattern getGetterRegexPattern() {
        return getOptionPattern("getterRegex", DEFAULT_GETTER_ATTRIBUTE_NAME_GETTER);
    }

    public Pattern getSetterRegexPattern() {
        return getOptionPattern("setterRegex", DEFAULT_SETTER_ATTRIBUTE_NAME_GETTER);
    }

    protected Pattern getOptionPattern(String optionName, Pattern defaultPattern) {
        Pattern result = defaultPattern;
        String configuredPattern = getCommandLine().getOptionValue(optionName);
        if(configuredPattern != null) {
            result = createRegex(configuredPattern);
        }
        return result;
    }

    public boolean isToString() {
        return getCommandLine().hasOption("toString");
    }

    public boolean isBuilderStyle() {
        return getCommandLine().hasOption("addBuilderStyle");
    }
    public boolean isIgnoreErrors() {
        return getCommandLine().hasOption("ignoreErrors");
    }

    public interface UnsafeFunction<CC>
    {
        public CC run() throws Exception;
    }
}
