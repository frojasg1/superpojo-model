# Super pojos' library

### Motivation

In some cases, you will need to deal with several model versions of the same api

As for instance, when you have a standard interface, which has several versions, every one specified with a set of yamls which you can transform with openapi generator into a backbone for that api in your chosen programming language

For every api version, you will have a model made of a set of pojos, which might be identical across versions, but the classes are different, as they are in different packages (the ones that open api generated)

If you have to provide service for several of those api versions, you will have to make a decision:

* To duplicate the business logic for every api version, and make them totally independent
* Or to try to unify all models in a super pojos model, and program a common business logic slightly specialized for every api version

Super pojos' library can be useful in that latest case.

The way to proceed would be:

1) To translate the input pojos into super pojos
2) To invoke the business logic with those super pojos
3) Eventually, to generate a super pojo answer
4) In that case, to translate the super pojo answer into the appropriate api version pojo answer before answering to the client

But the super pojos have to be generated first from your api version models pojos

You will have to use the super pojo generator


## Super pojo generator

### Source

The super pojo generator code is divided into the library with the bussiness logic and the main artifact

```
./superPojoModelGeneratorLib

./superPojoModelGeneratorMain
```

The library is used by the main artifact

By adding the dependency at its pom.xml

```
		<dependency>
			<groupId>com.frojasg1</groupId>
			<artifactId>super-pojo-model-generator-lib</artifactId>
			<version>v1.0-SNAPSHOT</version>
		</dependency>
```

### Example

There is an input couple of versions of input model pojos which will be used as an example to which the generator has been applied and superpojos have been generated

```
./inputModelsToSuperPojo5gExample
```

They are the first version of a couple of 5G rating specification versions, and have been automatically created with openapi generator from the specification yamls


### Requirements

The requirements for super pojo generator to work is that the input pojo models are compatible.

The only allowed differences between two compatible pojos with the same simple class name but in different packages (different versions), are:
* adding attributes.
* removing attributes.


### Execution

Once the generator is compiled you can invoke it.

Here is an example of invocation, assuming that you are located at the root directory and the generator has been compiled and making use of the example pojo models library as input.

```
java -jar superPojoModelGeneratorMain/target/super-pojo-model-generator-main-v1.0-SNAPSHOT-all.jar \
                -inputJar ./inputModelsToSuperPojo5gExample/target/input-models-to-super-pojo-5g-example-v1.0-SNAPSHOT.jar \
                -inputPackage com.frojasg1.nchf5g.rel15.openapi.model \
                -inputPackage com.frojasg1.nchf5g.rel16_15_0.openapi.model \
                -outputFolder superPojo5gModelsExample/src/main/java \
                -outputPackage com.frojasg1.nchf5g.superpojo.model \
                -addBuilderStyle \
                -toString \
                -ignoreErrors \
                -elementAndListOfElementsAreCompatible \
                -addListItemAdder \
                -hashcodeAndEquals
```

You have to specify one or more jars, where the models pojos are located.

Then to specify the packages of your models of the api versions

Then an output folder, and an output package for the generated superpojos

You can optionally specify the regular expressions for matching and extracting the attribute name for getters and setters.

The name of the attribute will be the last defined group, with the first letter in lowercase:
* -getterRegex. By default: "^(is|get)(\[a-zA-z_]\[a-zA-Z_0-9]*)$"
* -setterRegex. By default: "^set(\[a-zA-z_]\[a-zA-Z_0-9]*)$"

Then, you can specify any combination of the following flags optionally:

* -addBuilderStyle.  If you want to have a kind of setter functions that emulate a builder
* -toString. For including the toString function
* -elementAndListOfElementsAreCompatible. Forcing that an element and a list of those kind of elements are compatible (choosing the list for the super pojo)
* -addListItemAdder. For including a function for adding an item to a list attribute.
* -hashcodeAndEquals. For including hashcode and equals functions 
* -ignoreErrors. If you want the generator work with best effort style, trying to ignore the errors that appear



## Super pojo translation library

For being able to use super pojos in your business logic:

* First you have to generate the super pojos
* Then you have to translate the input pojos of your particular versions into super pojos
* Process the translated input super pojos, eventually creating a super pojo response
* If the super pojo response is created, then you will have to translate the super pojo response to the particular response pojo before answering to the client


### Code

Super pojo translation library code is located at:

```
./superPojoModelGeneratorLib
./superPojoModelMapperLib
```

For including it in your application, you will need to add those libraries (the sources) to your project, and to add the dependency in your pom.xml:

```
		<dependency>
			<groupId>com.frojasg1</groupId>
			<artifactId>super-pojo-model-mapper-lib</artifactId>
			<version>v1.0-SNAPSHOT</version>
		</dependency>
```


### Unit tests

There are some basic unit tests that test the library happy path.

They make use of the input pojos, the generated super pojos and the super pojo translation library.

You can find its source code at:

```
./superPojoModelMapperTestFor5gExample
```

### How to use it

You have to first create the global and one or more superpojo translators.

After that, you will be able to invoke them whenever you need.


```
    protected String getPackageName(Class<?> clazz) {
        return clazz.getPackage().getName();
    }

 ...

// mappers creation
ObjectMapperImpl globalMapper = new ObjectMapperImpl().init();
ObjectMapper superPojoObjectMapper = new SuperPojoObjectMapperImpl(createAttributeCache(), instance,
                getPackageName(com.frojasg1.nchf5g.superpojo.openapi.model.ChargingDataRequest.class),
                getPackageName(com.frojasg1.nchf5g.rel16_15_0.openapi.model.ChargingDataRequest.class),
                getPackageName(com.frojasg1.nchf5g.rel15.openapi.model.ChargingDataRequest.class));
globalMapper.addExtraMapper(superPojoObjectMapper);

// enums

com.frojasg1.nchf5g.rel15.openapi.model.ResultCode rel15ResultCode1 = com.frojasg1.nchf5g.rel15.openapi.model.ResultCode.SUCCESS;
// from particular pojo to super pojo
com.frojasg1.nchf5g.superpojo.openapi.model.ResultCode superpojoResultCode1 = instance.translate(rel15ResultCode1, com.frojasg1.nchf5g.superpojo.openapi.model.ResultCode.class);
// from super pojo to particular pojo
com.frojasg1.nchf5g.rel16_15_0.openapi.model.ResultCode rel16ResultCode1 = instance.translate(superpojoResultCode1, com.frojasg1.nchf5g.rel16_15_0.openapi.model.ResultCode.class);;


// pojos

com.frojasg1.nchf5g.rel15.openapi.model.ProblemDetails rel15ProblemDetails1 = createRel15ProblemDetails();
// from particular pojo to super pojo
com.frojasg1.nchf5g.superpojo.openapi.model.ProblemDetails superpojoProblemDetails1 = instance.translate(rel15ProblemDetails1, com.frojasg1.nchf5g.superpojo.openapi.model.ProblemDetails.class);
// from super pojo to particular pojo
com.frojasg1.nchf5g.rel16_15_0.openapi.model.ProblemDetails rel16ProblemDetails1 = instance.translate(superpojoProblemDetails1, com.frojasg1.nchf5g.rel16_15_0.openapi.model.ProblemDetails.class);;

...
```
