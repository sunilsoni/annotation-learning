package com.annotation.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.rules.Timeout;

import static org.hamcrest.Matchers.*;
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
    //@RepeatedTest(1)
    public void testSerializingWithJsonIgnore() throws JsonProcessingException {
        annotation = new JsonPropertyAnnotation();
        objectMapper = new ObjectMapper();

        final String jsonString = objectMapper.writeValueAsString(annotation);
        log.info("jsonString-->" + jsonString);

        Assert.assertThat(jsonString, containsString("SunilSoni"));
        assertThat(jsonString, not(containsString("-1")));
        log.info("diff-->" + diff);
    }

    @Test
    @DisplayName("Test DeSerializing With JsonIgnore")
    public void testDeSerializingWithJsonIgnore() throws Exception {
        annotation = new JsonPropertyAnnotation();
        objectMapper = new ObjectMapper();

        final String jsonString = "{\"type\": \"Male\", \"username\": \"SunilSoni\", \"newUser\": false, \"text\": \"Sunil Soni\", \"id\": \"123\", \"date\": \"2018-04-29\"}";
        final JsonPropertyAnnotation jsonPropertyAnnotation = objectMapper.readValue(jsonString, JsonPropertyAnnotation.class);
        log.info("jsonPropertyAnnotation-->" + jsonPropertyAnnotation);

        assertThat(jsonPropertyAnnotation.Type, is(equalTo("Male")));
        assertThat(jsonPropertyAnnotation.Username, is(equalTo("SunilSoni")));

    }

}