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


public class MainTest {

    public static void main(String[] args) {
        args = new String[] {
                "-inputJar",
                "../../../tmp/tmp/superpojo_src/diameter-5g-receiver-10.2.0-SNAPSHOT-cj8-jar-with-dependencies.jar",
                "-inputPackage",
                "com.telefonica.iot.diameter5greceiver.nchf.rel15.openapi.model",
                "-inputPackage",
                "com.telefonica.iot.diameter5greceiver.nchf.rel16_15_0.openapi.model",
                "-outputFolder",
                "../../../tmp/tmp/superpojo_src",
                "-outputPackage",
                "com.telefonica.iot.diameter5greceiver.nchf.superpojos.openapi.model",
                "-addBuilderStyle",
                "-toString",
                "-ignoreErrors"
        };

        Main.main(args);
    }
}
