package com.bank.eagle.gen.api;

import com.bank.eagle.gen.model.*;
import com.bank.eagle.gen.api.V1ApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

import java.util.Map;
import java.util.List;
import com.bank.eagle.gen.api.NotFoundException;

import java.io.InputStream;

import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;
import jakarta.ws.rs.*;
import jakarta.inject.Inject;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/v1")


@io.swagger.annotations.Api(description = "the v1 API")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2025-11-03T11:08:10.131371Z[Europe/London]", comments = "Generator version: 7.17.0")
public class V1Api  {

    @Inject V1ApiService service;

    @POST
    @Path("/accounts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Create a new bank account", response = BankAccountResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Bank Account has been created successfully", response = BankAccountResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid details supplied", response = BadRequestErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The user is not allowed to access the transaction", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    public Response createAccount(@ApiParam(value = "Create a new bank account for the user" ,required=true) @NotNull @Valid CreateBankAccountRequest createBankAccountRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createAccount(createBankAccountRequest,securityContext);
    }
    @POST
    @Path("/accounts/{accountNumber}/transactions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Create a transaction", response = TransactionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "transaction", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Transaction has been created successfully", response = TransactionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid details supplied", response = BadRequestErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The user is not allowed to delete the bank account details", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Bank account was not found", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 422, message = "Insufficient funds to process transaction", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    public Response createTransaction( @Pattern(regexp="^01\\d{6}$") @PathParam("accountNumber") String accountNumber,@ApiParam(value = "Create a new transaction" ,required=true) @NotNull @Valid CreateTransactionRequest createTransactionRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createTransaction(accountNumber,createTransactionRequest,securityContext);
    }
    @POST
    @Path("/users")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Create a new user", response = UserResponse.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "User has been created successfully", response = UserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid details supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    public Response createUser(@ApiParam(value = "Create a new user" ,required=true) @NotNull @Valid CreateUserRequest createUserRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createUser(createUserRequest,securityContext);
    }
    @DELETE
    @Path("/accounts/{accountNumber}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Delete account by account number.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The bank account has been deleted", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The user is not allowed to delete the bank account details", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Bank account was not found", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    public Response deleteAccountByAccountNumber( @Pattern(regexp="^01\\d{6}$") @PathParam("accountNumber") String accountNumber,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteAccountByAccountNumber(accountNumber,securityContext);
    }
    @DELETE
    @Path("/users/{userId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Delete user by ID.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The user has been deleted", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User was not found", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The user is not allowed to access the transaction", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "A user cannot be deleted when they are associated with a bank account", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    public Response deleteUserByID( @Pattern(regexp="^usr-[A-Za-z0-9]+$") @PathParam("userId") String userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteUserByID(userId,securityContext);
    }
    @GET
    @Path("/accounts/{accountNumber}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Fetch account by account number.", response = BankAccountResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The bank account details", response = BankAccountResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "The user was not authenticated", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The user is not allowed to access the bank account details", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Bank account was not found", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    public Response fetchAccountByAccountNumber( @Pattern(regexp="^01\\d{6}$") @PathParam("accountNumber") String accountNumber,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.fetchAccountByAccountNumber(accountNumber,securityContext);
    }
    @GET
    @Path("/accounts/{accountNumber}/transactions/{transactionId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Fetch transaction by ID.", response = TransactionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "transaction", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The transaction details", response = TransactionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The user is not allowed to access the transaction", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Bank account was not found", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    public Response fetchAccountTransactionByID( @Pattern(regexp="^01\\d{6}$") @PathParam("accountNumber") String accountNumber, @Pattern(regexp="^tan-[A-Za-z0-9]$") @PathParam("transactionId") String transactionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.fetchAccountTransactionByID(accountNumber,transactionId,securityContext);
    }
    @GET
    @Path("/users/{userId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Fetch user by ID.", response = UserResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The user details", response = UserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The user is not allowed to access the transaction", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User was not found", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    public Response fetchUserByID( @Pattern(regexp="^usr-[A-Za-z0-9]+$") @PathParam("userId") String userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.fetchUserByID(userId,securityContext);
    }
    @GET
    @Path("/accounts/{accountNumber}/transactions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "List transactions", response = ListTransactionsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "transaction", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The list of transaction details", response = ListTransactionsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The user is not allowed to access the transactions", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Bank account was not found", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    public Response listAccountTransaction( @Pattern(regexp="^01\\d{6}$") @PathParam("accountNumber") String accountNumber,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listAccountTransaction(accountNumber,securityContext);
    }
    @GET
    @Path("/accounts")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "List accounts", response = ListBankAccountsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The list of bank accounts", response = ListBankAccountsResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    public Response listAccounts(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listAccounts(securityContext);
    }
    @PATCH
    @Path("/accounts/{accountNumber}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update account by account number.", response = BankAccountResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The updated bank account details", response = BankAccountResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The user is not allowed to update the bank account details", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Bank account was not found", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    public Response updateAccountByAccountNumber( @Pattern(regexp="^01\\d{6}$") @PathParam("accountNumber") String accountNumber,@ApiParam(value = "Update bank account details for the user" ,required=true) @NotNull @Valid UpdateBankAccountRequest updateBankAccountRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateAccountByAccountNumber(accountNumber,updateBankAccountRequest,securityContext);
    }
    @PATCH
    @Path("/users/{userId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Update user by ID.", response = UserResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "bearerAuth")
    }, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The updated user details", response = UserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The user is not allowed to access the transaction", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "User was not found", response = ErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    public Response updateUserByID( @Pattern(regexp="^usr-[A-Za-z0-9]+$") @PathParam("userId") String userId,@ApiParam(value = "Update user details" ,required=true) @NotNull @Valid UpdateUserRequest updateUserRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateUserByID(userId,updateUserRequest,securityContext);
    }
}
