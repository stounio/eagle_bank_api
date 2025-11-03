package com.bank.eagle.auth;

import io.smallrye.jwt.build.Jwt;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

import java.time.Duration;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;
import static jakarta.ws.rs.core.Response.Status.*;
import static jakarta.ws.rs.core.Response.status;

// Request and response models
class RegisterUserRequest {
    public String username;
    public String password;
}
class RegisterUserResponse {
    public String message;
    public String username;
}
class LoginRequest {
    public String username;
    public String password;
}
class LoginResponse {
    public String token;
    public String tokenType;
}
class ErrorResponse {
    public String error;
}

@Path("/auth")
public class AuthenticationResource {
    @POST
    @Path("/register")
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response register(RegisterUserRequest request) {
        if (request.username == null || request.password == null || request.username.isBlank() || request.password.isBlank()) {
            ErrorResponse error = new ErrorResponse();
            error.error = "Username and password are required";
            return status(BAD_REQUEST).entity(error).build();
        }
        RegisterUserResponse response = new RegisterUserResponse();
        response.message = "User registered successfully";
        response.username = request.username;
        return status(CREATED).entity(response).build();
    }

    @POST
    @Path("/login")
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response login(LoginRequest request) {
        // Stub authentication: accept username 'user' and password 'password'
        if ("user".equals(request.username) && "password".equals(request.password)) {
            LoginResponse response = new LoginResponse();
            response.token = Jwt.issuer("eagle-api")
                    .subject(request.username)
                    .upn(request.username)
                    .expiresIn(Duration.ofHours(1))
                    .sign();
            response.tokenType = "Bearer";
            return Response.ok(response).build();
        } else {
            ErrorResponse error = new ErrorResponse();
            error.error = "Invalid credentials";
            return status(UNAUTHORIZED).entity(error).build();
        }
    }
}
