package com.bank.eagle.auth;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static java.lang.System.currentTimeMillis;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

class AuthenticationResourceTest {
    @Test
    void registerUserSuccess() {
        String randomUsername = "newuser" + currentTimeMillis();
        given()
                .contentType("application/json")
                .body("""
                            {"username": "%s", "password": "newpassword"}
                        """.formatted(randomUsername))
                .when()
                .post("/auth/register")
                .then()
                .statusCode(201)
                .body("message", equalTo("User registered successfully"))
                .body("username", equalTo(randomUsername));
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
        String randomUsername = "loginuser" + currentTimeMillis();
        String password = "password";
        // Register the user first
        given()
                .contentType("application/json")
                .body("""
                            {"username": "%s", "password": "%s"}
                        """.formatted(randomUsername, password))
                .when()
                .post("/auth/register")
                .then()
                .statusCode(201)
                .body("message", equalTo("User registered successfully"))
                .body("username", equalTo(randomUsername));
        // Now login with the same credentials
        given()
                .contentType("application/json")
                .body("""
                            {"username": "%s", "password": "%s"}
                        """.formatted(randomUsername, password))
                .when()
                .post("/auth/login")
                .then()
                .statusCode(200)
                .body("token", notNullValue())
                .body("tokenType", equalTo("Bearer"));
    }

    @Test
    void loginFailure() {
        String randomUsername = "failuser" + currentTimeMillis();
        // Register the user first
        given()
                .contentType("application/json")
                .body("""
                            {"username": "%s", "password": "%s"}
                        """.formatted(randomUsername, "correctpassword"))
                .when()
                .post("/auth/register")
                .then()
                .statusCode(201)
                .body("message", equalTo("User registered successfully"))
                .body("username", equalTo(randomUsername));
        // Attempt to login with incorrect password
        given()
                .contentType("application/json")
                .body("""
                            {"username": "%s", "password": "%s"}
                        """.formatted(randomUsername, "wrongpassword"))
                .when()
                .post("/auth/login")
                .then()
                .statusCode(401)
                .body("error", equalTo("Invalid credentials"));
    }

    @Test
    void registerUserDuplicateUsername() {
        String randomUsername = "user" + currentTimeMillis();
        // First registration should succeed
        given()
                .contentType("application/json")
                .body("""                            
                        {"username": "%s", "password": "password1"}
                        """.formatted(randomUsername))
                .when()
                .post("/auth/register")
                .then()
                .statusCode(201)
                .body("message", equalTo("User registered successfully"))
                .body("username", equalTo(randomUsername));

        // Second registration with same username should fail
        given()
                .contentType("application/json")
                .body("""
                            {"username": "%s", "password": "password2"}
                        """.formatted(randomUsername))
                .when()
                .post("/auth/register")
                .then()
                .statusCode(500);
    }
}
