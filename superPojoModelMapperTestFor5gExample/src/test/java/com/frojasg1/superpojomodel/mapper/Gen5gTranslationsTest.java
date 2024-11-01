package com.frojasg1.superpojomodel.mapper;

import com.frojasg1.nchf5g.superpojo.model.ChargingDataRequest;
import com.frojasg1.nchf5g.superpojo.model.InvocationResult;
import com.frojasg1.nchf5g.superpojo.model.ProblemDetails;
import com.frojasg1.nchf5g.superpojo.model.ResultCode;
import com.frojasg1.nchf5g.superpojo.model.UsedUnitContainer;
import com.frojasg1.superpojomodel.mapper.attributecache.AttributeCache;
import com.frojasg1.superpojomodel.mapper.attributecache.AttributeCacheBuilder;
import com.frojasg1.superpojomodel.mapper.mapper.ObjectMapper;
import com.frojasg1.superpojomodel.mapper.mapper.impl.ObjectMapperImpl;
import com.frojasg1.superpojomodel.mapper.mapper.impl.SuperPojoObjectMapperImpl;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class Gen5gTranslationsTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(Gen5gTranslationsTest.class);

    protected ObjectMapper superPojoObjectMapper;
    protected ObjectMapperImpl instance;

    @Before
    public void setUp() {
        instance = new ObjectMapperImpl().init();
        superPojoObjectMapper = new SuperPojoObjectMapperImpl(createAttributeCache(), instance,
                getPackageName(ChargingDataRequest.class),
                getPackageName(com.frojasg1.nchf5g.rel16_15_0.openapi.model.ChargingDataRequest.class),
                getPackageName(com.frojasg1.nchf5g.rel15.openapi.model.ChargingDataRequest.class));

        instance.addExtraMapper(superPojoObjectMapper);
    }

    protected String getPackageName(Class<?> clazz) {
        return clazz.getPackage().getName();
    }

    protected AttributeCache createAttributeCache() {
        return new AttributeCacheBuilder().createCache();
    }

    @Test
    public void simpleEnumTest1() {

        com.frojasg1.nchf5g.rel15.openapi.model.ResultCode resultCode1 = com.frojasg1.nchf5g.rel15.openapi.model.ResultCode.SUCCESS;
        com.frojasg1.nchf5g.rel16_15_0.openapi.model.ResultCode resultCode2 = com.frojasg1.nchf5g.rel16_15_0.openapi.model.ResultCode.SUCCESS;

        ResultCode result1 = instance.translate(resultCode1, ResultCode.class);
        ResultCode result2 = instance.translate(resultCode2, ResultCode.class);

        com.frojasg1.nchf5g.rel15.openapi.model.ResultCode resultCode12 = instance.translate(result1, com.frojasg1.nchf5g.rel15.openapi.model.ResultCode.class);
        com.frojasg1.nchf5g.rel16_15_0.openapi.model.ResultCode resultCode22 = instance.translate(result2, com.frojasg1.nchf5g.rel16_15_0.openapi.model.ResultCode.class);

        assertEquals(resultCode1.name(), result1.name());
        assertSame(result1, result2);

        assertSame(resultCode1, resultCode12);
        assertSame(resultCode2, resultCode22);
    }

    @Test
    public void compoundPojoTest1() {
        com.frojasg1.nchf5g.rel15.openapi.model.ProblemDetails problemDetails1 = createRel15ProblemDetails();
        com.frojasg1.nchf5g.rel16_15_0.openapi.model.ProblemDetails problemDetails2 = createRel16_15ProblemDetails();

        ProblemDetails result1 = instance.translate(problemDetails1, ProblemDetails.class);
        ProblemDetails result2 = instance.translate(problemDetails2, ProblemDetails.class);

        com.frojasg1.nchf5g.rel15.openapi.model.ProblemDetails problemDetails12 =
                instance.translate(result1, com.frojasg1.nchf5g.rel15.openapi.model.ProblemDetails.class);
        com.frojasg1.nchf5g.rel16_15_0.openapi.model.ProblemDetails problemDetails22 =
                instance.translate(result2, com.frojasg1.nchf5g.rel16_15_0.openapi.model.ProblemDetails.class);

        assertEquals(result1, result2);
        assertEquals(problemDetails1, problemDetails12);
        assertEquals(problemDetails2, problemDetails22);
    }

    @Test
    public void compoundPojoTest2() {
        com.frojasg1.nchf5g.rel15.openapi.model.InvocationResult invocationResult1 = createRel15InvocationResult();
        com.frojasg1.nchf5g.rel16_15_0.openapi.model.InvocationResult invocationResult2 = createRel16_15InvocationResult();

        InvocationResult result1 = instance.translate(invocationResult1, InvocationResult.class);
        InvocationResult result2 = instance.translate(invocationResult2, InvocationResult.class);

        com.frojasg1.nchf5g.rel15.openapi.model.InvocationResult invocationResult12 =
                instance.translate(result1, com.frojasg1.nchf5g.rel15.openapi.model.InvocationResult.class);
        com.frojasg1.nchf5g.rel16_15_0.openapi.model.InvocationResult invocationResult22 =
                instance.translate(result2, com.frojasg1.nchf5g.rel16_15_0.openapi.model.InvocationResult.class);

        assertEquals(result1, result2);
        assertEquals(invocationResult1, invocationResult12);
        assertEquals(invocationResult2, invocationResult22);
    }

    @Test
    public void scalarToListAndListToScalarTest1() {

        com.frojasg1.nchf5g.rel15.openapi.model.UsedUnitContainer usedUnitContainer1 =
                new com.frojasg1.nchf5g.rel15.openapi.model.UsedUnitContainer()
                        .eventTimeStamps(new Date(1000));

        com.frojasg1.nchf5g.rel16_15_0.openapi.model.UsedUnitContainer usedUnitContainer2 =
                new com.frojasg1.nchf5g.rel16_15_0.openapi.model.UsedUnitContainer()
                        .addEventTimeStampsItem(new Date(1000));

        UsedUnitContainer result1 = instance.translate(usedUnitContainer1, UsedUnitContainer.class);
        UsedUnitContainer result2 = instance.translate(usedUnitContainer2, UsedUnitContainer.class);

        com.frojasg1.nchf5g.rel15.openapi.model.UsedUnitContainer usedUnitContainer12 =
                instance.translate(result1, com.frojasg1.nchf5g.rel15.openapi.model.UsedUnitContainer.class);
        com.frojasg1.nchf5g.rel16_15_0.openapi.model.UsedUnitContainer usedUnitContainer22 =
                instance.translate(result2, com.frojasg1.nchf5g.rel16_15_0.openapi.model.UsedUnitContainer.class);

        assertEquals(usedUnitContainer1, usedUnitContainer12);
        assertEquals(usedUnitContainer2, usedUnitContainer22);
        assertEquals(result1, result2);
    }

    @Test
    public void listToScalarExceptionTest1() {

        com.frojasg1.nchf5g.rel16_15_0.openapi.model.UsedUnitContainer usedUnitContainer2 =
                new com.frojasg1.nchf5g.rel16_15_0.openapi.model.UsedUnitContainer()
                        .addEventTimeStampsItem(new Date(1000))
                        .addEventTimeStampsItem(new Date(2000));

        UsedUnitContainer superpojoUsedUnitContainer = instance.translate(usedUnitContainer2, UsedUnitContainer.class);

        boolean exceptionThrown = false;
        try {
            com.frojasg1.nchf5g.rel15.openapi.model.UsedUnitContainer usedUnitContainer12 =
                    instance.translate(superpojoUsedUnitContainer, com.frojasg1.nchf5g.rel15.openapi.model.UsedUnitContainer.class);
        } catch(Exception ex) {
            exceptionThrown = true;
            LOGGER.error("Exception when translating pojo", ex);
        }
        com.frojasg1.nchf5g.rel16_15_0.openapi.model.UsedUnitContainer usedUnitContainer22 =
                instance.translate(superpojoUsedUnitContainer, com.frojasg1.nchf5g.rel16_15_0.openapi.model.UsedUnitContainer.class);

        assertEquals(usedUnitContainer2, usedUnitContainer22);
        assertTrue(exceptionThrown);
    }

    protected com.frojasg1.nchf5g.rel15.openapi.model.ProblemDetails createRel15ProblemDetails() {
        return new com.frojasg1.nchf5g.rel15.openapi.model.ProblemDetails()
                .title("title")
                .type("type")
                .detail("detail")
                .cause("cause")
                .instance("instance")
                .status(7)
                .addInvalidParamsItem(new com.frojasg1.nchf5g.rel15.openapi.model.InvalidParam()
                        .param("param")
                        .reason("reason"))
                .supportedFeatures("FFFFF");
    }

    protected com.frojasg1.nchf5g.rel16_15_0.openapi.model.ProblemDetails createRel16_15ProblemDetails() {
        return new com.frojasg1.nchf5g.rel16_15_0.openapi.model.ProblemDetails()
                .title("title")
                .type("type")
                .detail("detail")
                .cause("cause")
                .instance("instance")
                .status(7)
                .addInvalidParamsItem(new com.frojasg1.nchf5g.rel16_15_0.openapi.model.InvalidParam()
                        .param("param")
                        .reason("reason"))
                .supportedFeatures("FFFFF");
    }

    protected com.frojasg1.nchf5g.rel15.openapi.model.InvocationResult createRel15InvocationResult() {
        return new com.frojasg1.nchf5g.rel15.openapi.model.InvocationResult()
                .error(createRel15ProblemDetails())
                .failureHandling(com.frojasg1.nchf5g.rel15.openapi.model.FailureHandling.TERMINATE);
    }

    protected com.frojasg1.nchf5g.rel16_15_0.openapi.model.InvocationResult createRel16_15InvocationResult() {
        return new com.frojasg1.nchf5g.rel16_15_0.openapi.model.InvocationResult()
                .error(createRel16_15ProblemDetails())
                .failureHandling(com.frojasg1.nchf5g.rel16_15_0.openapi.model.FailureHandling.TERMINATE);
    }
}
