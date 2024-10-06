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
