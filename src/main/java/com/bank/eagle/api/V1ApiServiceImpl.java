package com.bank.eagle.api;

import com.bank.eagle.gen.api.NotFoundException;
import com.bank.eagle.gen.api.V1ApiService;
import com.bank.eagle.gen.model.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;

@ApplicationScoped
public class V1ApiServiceImpl implements V1ApiService {
    @Override
    public Response createAccount(CreateBankAccountRequest createBankAccountRequest, SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @Override
    public Response createTransaction(String accountNumber, CreateTransactionRequest createTransactionRequest, SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @Override
    public Response createUser(CreateUserRequest createUserRequest, SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @Override
    public Response deleteAccountByAccountNumber(String accountNumber, SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @Override
    public Response deleteUserByID(String userId, SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @Override
    public Response fetchAccountByAccountNumber(String accountNumber, SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @Override
    public Response fetchAccountTransactionByID(String accountNumber, String transactionId, SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @Override
    public Response fetchUserByID(String userId, SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @Override
    public Response listAccountTransaction(String accountNumber, SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @Override
    public Response listAccounts(SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @Override
    public Response updateAccountByAccountNumber(String accountNumber, UpdateBankAccountRequest updateBankAccountRequest, SecurityContext securityContext) throws NotFoundException {
        return null;
    }

    @Override
    public Response updateUserByID(String userId, UpdateUserRequest updateUserRequest, SecurityContext securityContext) throws NotFoundException {
        return null;
    }
}
