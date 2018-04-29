package com.annotation.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.rules.Timeout;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;


@Slf4j
public class JsonPropertyAnnotationTest {
    static JsonPropertyAnnotation annotation;
    static ObjectMapper objectMapper;
    static long start, end, diff;
    @Rule
    public Timeout globalTimeout = Timeout.seconds(10000);


    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        log.info("beforeAll-->");
        annotation = new JsonPropertyAnnotation();
        objectMapper = new ObjectMapper();
    }

    @AfterAll
    public static void tearDown() throws Exception {
        log.info("tearDown-->");
        objectMapper = null;
        annotation = null;
    }

    @BeforeEach
    void setUpBeforeEach() throws Exception {
        log.info("setUpBeforeEach-->");

    }

    @AfterEach
    void setUpAfterEach() throws Exception {
        log.info("setUpAfterEach-->");

    }

    @Test
    @DisplayName("Test Serializing With JsonIgnore")
    @RepeatedTest(1)
    public void testSerializingWithJsonIgnore() throws JsonProcessingException {

        final String jsonString = objectMapper.writeValueAsString(annotation);
        log.info("jsonString-->" + jsonString);

        Assert.assertThat(jsonString, containsString("SunilSoni"));
        assertThat(jsonString, not(containsString("-1")));
        log.info("diff-->" + diff);
    }

    @Test
    public void testDeSerializingWithJsonIgnore() {

        log.info("diff-->" + diff);
    }

}