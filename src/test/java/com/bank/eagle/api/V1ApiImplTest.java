package com.bank.eagle.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class V1ApiImplTest {

    @Test
    void createNewUser() {
        given()
                .contentType("application/json")
                .body("""
                        {
                          "name": "John Doe",
                          "address": {
                            "line1": "Flat 11 The Boathouse",
                            "line2": "36 Edge Row ",
                            "line3": "Ground floor",
                            "town": "London",
                            "county": "UK",
                            "postcode": "E5 6FD"
                          },
                          "phoneNumber": "0987654321",
                          "email": "john.doe@email.com"
                        }
                        """)
                .when()
                .post("/api/v1/users")
                .then()
                .statusCode(201)
                .body("id", notNullValue())
                .body("createdTimestamp", notNullValue())
                .body("updatedTimestamp", nullValue())
                .body("name", equalTo("John Doe"))
                .body("address.line1", equalTo("Flat 11 The Boathouse"))
                .body("address.line2", equalTo("36 Edge Row "))
                .body("address.line3", equalTo("Ground floor"))
                .body("address.town", equalTo("London"))
                .body("address.county", equalTo("UK"))
                .body("address.postcode", equalTo("E5 6FD"))
                .body("phoneNumber", equalTo("0987654321"))
                .body("email", equalTo("john.doe@email.com"));
    }

    @Test
    void createNewUserWithoutAllRequiredData() {
        given()
                .contentType("application/json")
                .body("""
                        {}
                        """)
                .when()
                .post("/api/v1/users")
                .then()
                .statusCode(400)
                .body("objectName", equalTo("Class"))
                .body("attributeName", equalTo("name"))
                .body("line", equalTo(1))
                .body("column", equalTo(2))
                .body("value", nullValue());
    }
}