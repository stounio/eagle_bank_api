package com.bank.eagle.gen.api;

import com.bank.eagle.gen.model.*;
import jakarta.ws.rs.Path;

@Path("/api")
public class V1ApiImpl implements V1Api {
    @Override
    public BankAccountResponse createAccount(CreateBankAccountRequest createBankAccountRequest) {
        return null;
    }

    @Override
    public TransactionResponse createTransaction(String accountNumber, CreateTransactionRequest createTransactionRequest) {
        return null;
    }

    @Override
    public UserResponse createUser(CreateUserRequest createUserRequest) {
        return null;
    }

    @Override
    public void deleteAccountByAccountNumber(String accountNumber) {

    }

    @Override
    public void deleteUserByID(String userId) {

    }

    @Override
    public BankAccountResponse fetchAccountByAccountNumber(String accountNumber) {
        return null;
    }

    @Override
    public TransactionResponse fetchAccountTransactionByID(String accountNumber, String transactionId) {
        return null;
    }

    @Override
    public UserResponse fetchUserByID(String userId) {
        return null;
    }

    @Override
    public ListTransactionsResponse listAccountTransaction(String accountNumber) {
        return null;
    }

    @Override
    public ListBankAccountsResponse listAccounts() {
        return null;
    }

    @Override
    public BankAccountResponse updateAccountByAccountNumber(String accountNumber, UpdateBankAccountRequest updateBankAccountRequest) {
        return null;
    }

    @Override
    public UserResponse updateUserByID(String userId, UpdateUserRequest updateUserRequest) {
        return null;
    }
}
