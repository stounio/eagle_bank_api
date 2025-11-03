package com.bank.eagle.auth.service;

import com.bank.eagle.auth.model.RegisteredUser;

import java.util.Optional;

public interface RegisteredUserService {
    void registerUser(RegisteredUser registeredUser);

    Optional<RegisteredUser> findUser(String username);
}
