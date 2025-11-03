package com.bank.eagle.api;

import com.bank.eagle.gen.api.V1Api;
import com.bank.eagle.gen.model.*;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.Date;

import static jakarta.ws.rs.core.Response.Status.CREATED;
import static java.util.UUID.randomUUID;

@Path("/api")
public class V1ApiImpl implements V1Api {

    @Override
    public Response createAccount(CreateBankAccountRequest createBankAccountRequest) {
        return null;
    }

    @Override
    public Response createTransaction(String accountNumber, CreateTransactionRequest createTransactionRequest) {
        return null;
    }

    @Override
    public Response createUser(CreateUserRequest createUserRequest) {
        UserResponse userResponse = UserResponse.builder()
                .name(createUserRequest.getName())
                .address(createUserRequest.getAddress())
                .phoneNumber(createUserRequest.getPhoneNumber())
                .email(createUserRequest.getEmail())
                .id(randomUUID().toString())
                .createdTimestamp(new Date())
                .build();
        return Response.status(CREATED).entity(userResponse).build();
    }

    @Override
    public Response deleteAccountByAccountNumber(String accountNumber) {
        return null;
    }

    @Override
    public Response deleteUserByID(String userId) {
        return null;
    }

    @Override
    public Response fetchAccountByAccountNumber(String accountNumber) {
        return null;
    }

    @Override
    public Response fetchAccountTransactionByID(String accountNumber, String transactionId) {
        return null;
    }

    @Override
    public Response fetchUserByID(String userId) {
        return null;
    }

    @Override
    public Response listAccountTransaction(String accountNumber) {
        return null;
    }

    @Override
    public Response listAccounts() {
        return null;
    }

    @Override
    public Response updateAccountByAccountNumber(String accountNumber, UpdateBankAccountRequest updateBankAccountRequest) {
        return null;
    }

    @Override
    public Response updateUserByID(String userId, UpdateUserRequest updateUserRequest) {
        return null;
    }
}
