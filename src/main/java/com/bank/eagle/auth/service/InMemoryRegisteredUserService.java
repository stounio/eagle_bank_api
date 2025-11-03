package com.bank.eagle.auth.service;

import com.bank.eagle.auth.model.RegisteredUser;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@ApplicationScoped
public class InMemoryRegisteredUserService implements RegisteredUserService {

    private final Map<String, RegisteredUser> registeredUsers = new ConcurrentHashMap<>();

    @Override
    public void registerUser(RegisteredUser registeredUser) {
        if (registeredUsers.containsKey(registeredUser.getUsername())) {
            throw new IllegalArgumentException("User already exists");
        }
        registeredUsers.put(registeredUser.getUsername(), registeredUser);
    }

    @Override
    public Optional<RegisteredUser> findUser(String username) {
        return Optional.of(registeredUsers.get(username));
    }
}
