#!/bin/bash


# java -cp superPojoModelGeneratorMain/target/super-pojo-model-generator-main-v1.0-SNAPSHOT-all.jar com.frojasg1.applications.superpojomodel.MainTest


java -jar superPojoModelGeneratorMain/target/super-pojo-model-generator-main-v1.0-SNAPSHOT-all.jar \
                -inputJar ./inputModelsToSuperPojo5gExample/target/input-models-to-super-pojo-5g-example-v1.0-SNAPSHOT.jar \
                -inputPackage com.frojasg1.nchf5g.rel15.openapi.model \
                -inputPackage com.frojasg1.nchf5g.rel16_15_0.openapi.model \
                -outputFolder superPojo5gModelsExample/src/main/java \
                -outputPackage com.frojasg1.nchf5g.superpojo.model \
                -addBuilderStyle \
                -toString \
                -addListItemAdder \
                -hashcodeAndEquals \
                -ignoreErrors \
                -elementAndListOfElementsAreCompatible

