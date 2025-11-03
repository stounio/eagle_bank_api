package com.bank.eagle.auth;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

class AuthenticationResourceTest {
    @Test
    void registerUserSuccess() {
        given()
                .contentType("application/json")
                .body("""
                            {"username": "newuser", "password": "newpassword"}
                        """)
                .when()
                .post("/auth/register")
                .then()
                .statusCode(201)
                .body("message", equalTo("User registered successfully"))
                .body("username", equalTo("newuser"));
    }

    @Test
    void registerUserMissingFields() {
        given()
                .contentType("application/json")
                .body("""
                            {"username": ""}
                        """)
                .when()
                .post("/auth/register")
                .then()
                .statusCode(400)
                .body("error", equalTo("Username and password are required"));
    }

    @Test
    void loginSuccess() {
        given()
                .contentType("application/json")
                .body("""
                            {"username": "user", "password": "password"}
                        """)
                .when()
                .post("/auth/login")
                .then()
                .statusCode(200)
                .body("token", notNullValue())
                .body("tokenType", equalTo("Bearer"));
    }

    @Test
    void loginFailure() {
        given()
                .contentType("application/json")
                .body("""
                            {"username": "user", "password": "wrongpassword"}
                        """)
                .when()
                .post("/auth/login")
                .then()
                .statusCode(401)
                .body("error", equalTo("Invalid credentials"));
    }
}

