package org.example;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    public void emptyPassedTest() {
        Assertions.assertTrue(true);
    }

    @Test
    public void emptyFailedTest() {
        Assertions.assertTrue(false, "Sample test failed!");
    }

    @Test
    public void sampleApiTest() {
        RestAssured.
                given().
                    log().all()
                    .get("https://swapi.dev/api/people/1/")
                .then()
                    .log().all();
    }

}
