package com.annotation.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.rules.Timeout;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


@Slf4j
public class JsonPropertyAnnotationTest {
    static JsonPropertyAnnotation annotation;
    static ObjectMapper objectMapper;
    @Rule
    public Timeout globalTimeout = Timeout.seconds(10000);
    long start, end, diff;

    //@BeforeAll
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {//not working
        log.info("beforeAll-->");
        annotation = new JsonPropertyAnnotation();
        objectMapper = new ObjectMapper();
    }

    // @AfterAll
    @AfterClass
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


        final String jsonString = objectMapper.writeValueAsString(annotation);
        log.info("jsonString-->" + jsonString);

        Assert.assertThat(jsonString, containsString("SunilSoni"));
        assertThat(jsonString, not(containsString("-1")));
        log.info("diff-->" + diff);
    }

    @Test
    @DisplayName("Test DeSerializing With JsonIgnore")
    public void testDeSerializingWithJsonIgnore() throws Exception {

        final String jsonString = "{\"type\": \"Male\", \"username\": \"SunilSoni\", \"newUser\": false, \"text\": \"Sunil Soni\", \"id\": \"123\", \"date\": \"2018-04-29\"}";
        final JsonPropertyAnnotation jsonPropertyAnnotation = objectMapper.readValue(jsonString, JsonPropertyAnnotation.class);
        log.info("jsonPropertyAnnotation-->" + jsonPropertyAnnotation);

        assertThat(jsonPropertyAnnotation.Type, is(equalTo("Male")));
        assertThat(jsonPropertyAnnotation.Username, is(equalTo("SunilSoni")));

    }

}