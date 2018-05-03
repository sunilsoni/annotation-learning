package com.annotation.jackson.JsonAlias;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.IOException;

@Slf4j
public class JsonAliasAnnotationTest {

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

        final String jsonData =
                "{"
                        + "\"writerId\" : 100,"
                        + "\"writerName\" : \"Sunil\","
                        + "\"writerBook\" : {"
                        + "\"bookName\" : \"Jackson Annotation in Action\","
                        + "\"bookCat\" : \"Jackson\""
                        + "}"
                        + "}";
        final ObjectMapper mapper = new ObjectMapper();
        final Writer writer = mapper.readValue(jsonData, Writer.class);


        Assert.assertEquals("Sunil", writer.getName());
        log.info(writer.getId() + ", " + writer.getName());
        final Book book = writer.getBook();
        log.info(book.getName() + ", " + book.getCategory());

        Assert.assertEquals("Jackson", book.getCategory());

    }

    @Test
    public void testJsonAlias_ObjectToJSON() throws IOException, JSONException {
        final Book book = new Book("Jackson Annotation in Action", "Jackson");
        final Writer writer = new Writer(100, "Sunil", book);


        final String jsonWriter = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(writer);
        log.info(jsonWriter);

        final String jsonData =
                "{"
                        + "\"writerId\" : 100,"
                        + "\"writerName\" : \"Sunil\","
                        + "\"writerBook\" : {"
                        + "\"bookName\" : \"Jackson Annotation in Action\","
                        + "\"bookCategory\" : \"Jackson\""
                        + "}"
                        + "}";

        //  Assert.assertEquals(jsonData, jsonWriter);

        JSONAssert.assertEquals(jsonData, jsonWriter, false);

    }
}