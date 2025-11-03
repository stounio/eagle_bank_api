package com.bank.eagle.gen.api;

import com.bank.eagle.gen.api.*;
import com.bank.eagle.gen.model.*;


import com.bank.eagle.gen.model.BadRequestErrorResponse;
import com.bank.eagle.gen.model.BankAccountResponse;
import com.bank.eagle.gen.model.CreateBankAccountRequest;
import com.bank.eagle.gen.model.CreateTransactionRequest;
import com.bank.eagle.gen.model.CreateUserRequest;
import com.bank.eagle.gen.model.ErrorResponse;
import com.bank.eagle.gen.model.ListBankAccountsResponse;
import com.bank.eagle.gen.model.ListTransactionsResponse;
import com.bank.eagle.gen.model.TransactionResponse;
import com.bank.eagle.gen.model.UpdateBankAccountRequest;
import com.bank.eagle.gen.model.UpdateUserRequest;
import com.bank.eagle.gen.model.UserResponse;

import java.util.List;
import com.bank.eagle.gen.api.NotFoundException;

import java.io.InputStream;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2025-11-03T11:08:10.131371Z[Europe/London]", comments = "Generator version: 7.17.0")
public interface V1ApiService {
      Response createAccount(CreateBankAccountRequest createBankAccountRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createTransaction(String accountNumber,CreateTransactionRequest createTransactionRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createUser(CreateUserRequest createUserRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteAccountByAccountNumber(String accountNumber,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteUserByID(String userId,SecurityContext securityContext)
      throws NotFoundException;
      Response fetchAccountByAccountNumber(String accountNumber,SecurityContext securityContext)
      throws NotFoundException;
      Response fetchAccountTransactionByID(String accountNumber,String transactionId,SecurityContext securityContext)
      throws NotFoundException;
      Response fetchUserByID(String userId,SecurityContext securityContext)
      throws NotFoundException;
      Response listAccountTransaction(String accountNumber,SecurityContext securityContext)
      throws NotFoundException;
      Response listAccounts(SecurityContext securityContext)
      throws NotFoundException;
      Response updateAccountByAccountNumber(String accountNumber,UpdateBankAccountRequest updateBankAccountRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response updateUserByID(String userId,UpdateUserRequest updateUserRequest,SecurityContext securityContext)
      throws NotFoundException;
}
