package com.annotation.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import java.io.IOException;

@Slf4j
class JsonIgnoreAnnotationTest {

    ObjectMapper objectMapper;

    @BeforeClass
    void setUp() {
        objectMapper = new ObjectMapper();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testSerializingWithJsonIgnore()
            throws JsonProcessingException {
        final String jsonString = objectMapper.writeValueAsString(new JsonIgnoreAnnotation());
        System.out.println(jsonString);


        // Assert.assertThat(jsonString, Matchers.containsString("James Clark"));
        // Assert.assertThat(jsonString, not(containsString("productId")));
    }

    @Test
    public void testDeSerializingWithJsonIgnore() throws IOException {
        final String jsonString = "{\"personId\": 231, \"name\": \"Mary Parker\"}";
        final ObjectMapper mapper = new ObjectMapper();
        final JsonIgnoreAnnotation bean = objectMapper.readValue(jsonString, JsonIgnoreAnnotation.class);
        System.out.println(bean);
        //assertThat(bean.name, is(equalTo("Mary Parker")));
        // assertThat(bean.personId, is(not(equalTo(231L))));
    }
}