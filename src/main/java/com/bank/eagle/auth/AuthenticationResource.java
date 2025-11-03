package com.bank.eagle.auth;

import io.smallrye.jwt.build.Jwt;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

@Path("/auth")
public class AuthenticationResource {
    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");

        // Stub authentication: accept username 'user' and password 'password'
        if ("user".equals(username) && "password".equals(password)) {
            String token = Jwt.issuer("eagle-api")
                    .subject(username)
                    .upn(username)
                    .expiresIn(Duration.ofHours(1))
                    .sign();
            Map<String, String> response = new HashMap<>();
            response.put("token", token);
            response.put("tokenType", "Bearer");
            return Response.ok(response).build();
        } else {
            Map<String, String> error = new HashMap<>();
            error.put("error", "Invalid credentials");
            return Response.status(Response.Status.UNAUTHORIZED).entity(error).build();
        }
    }
}

