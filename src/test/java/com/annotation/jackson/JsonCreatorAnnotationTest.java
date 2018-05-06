package com.annotation.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class JsonCreatorAnnotationTest {

    static ObjectMapper mapper;


    @BeforeClass
    public static void setUp() throws Exception {
        mapper = new ObjectMapper();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        mapper = null;
    }

    @Test
    public void testDeSerializingWithJsonCreator() throws Exception {
        final String jsonString = "{\"firstName\": \"Sunil\", \"lastName\": \"Soni\"}";

        final JsonCreatorAnnotation bean = mapper.readValue(jsonString, JsonCreatorAnnotation.class);

        Assert.assertThat(bean.firstName, Is.is(CoreMatchers.equalTo("Sunil")));
        Assert.assertThat(bean.lastName, Is.is(CoreMatchers.equalTo("Soni")));
    }
}