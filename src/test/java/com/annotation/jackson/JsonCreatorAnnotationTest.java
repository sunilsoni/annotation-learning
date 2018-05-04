package com.annotation.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

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
    public void testJsonAlias_JsonToObject() throws IOException {

    }

}