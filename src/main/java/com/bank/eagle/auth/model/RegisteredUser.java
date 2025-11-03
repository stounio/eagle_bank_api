package com.bank.eagle.auth.model;

public class RegisteredUser {
    private final String username;
    private final String password;

    public RegisteredUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
}
