package com.bank.eagle.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

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
            .statusCode(201);
    }
}