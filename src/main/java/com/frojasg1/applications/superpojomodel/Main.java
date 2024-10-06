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

package com.frojasg1.applications.superpojomodel;


import com.frojasg1.applications.superpojomodel.args.CommandLineArgs;
import com.frojasg1.applications.superpojomodel.processor.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static final String APPLICATION_NAME = "super-pojo-model";

    protected String[] args;

    public Main(String[] args) {
        this.args = args;
    }

    public static void main(String[] args) {
        try {
            new Main(args).process();
        } catch(Exception ex) {
            LOGGER.error("Error running application", ex);
        }
    }

    protected void process() {
        CommandLineArgs commandLineArgs = createCommandLine();
        if (commandLineArgs != null) {
            new Processor(commandLineArgs).process();

            LOGGER.info("Successful execution");
        }
    }

    public String[] getArgs() {
        return args;
    }
    protected CommandLineArgs createCommandLine () {
        CommandLineArgs result = null;
        result = new CommandLineArgs(APPLICATION_NAME, " when parsing command line arguments");
        if (result.createCommandLine(getArgs()) == null) {
            result = null;
        }
        return result;
    }
}
