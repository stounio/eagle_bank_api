package com.bank.eagle.gen.api;

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

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Api(description = "the v1 API")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-03T15:19:25.171821Z[Europe/London]", comments = "Generator version: 7.17.0")
public interface V1Api {

    /**
     * Create a new bank account
     *
     * @param createBankAccountRequest Create a new bank account for the user
     * @return Bank Account has been created successfully
     * @return Invalid details supplied
     * @return Access token is missing or invalid
     * @return The user is not allowed to access the transaction
     * @return An unexpected error occurred
     */
    @POST
    @Path("/v1/accounts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Create a new bank account", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Bank Account has been created successfully", response = BankAccountResponse.class),
        @ApiResponse(code = 400, message = "Invalid details supplied", response = BadRequestErrorResponse.class),
        @ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "The user is not allowed to access the transaction", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    Response createAccount(@Valid @NotNull CreateBankAccountRequest createBankAccountRequest);


    /**
     * Create a transaction
     *
     * @param accountNumber Account number of the bank account
     * @param createTransactionRequest Create a new transaction
     * @return Transaction has been created successfully
     * @return Invalid details supplied
     * @return Access token is missing or invalid
     * @return The user is not allowed to delete the bank account details
     * @return Bank account was not found
     * @return Insufficient funds to process transaction
     * @return An unexpected error occurred
     */
    @POST
    @Path("/v1/accounts/{accountNumber}/transactions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Create a transaction", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "transaction" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Transaction has been created successfully", response = TransactionResponse.class),
        @ApiResponse(code = 400, message = "Invalid details supplied", response = BadRequestErrorResponse.class),
        @ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "The user is not allowed to delete the bank account details", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Bank account was not found", response = ErrorResponse.class),
        @ApiResponse(code = 422, message = "Insufficient funds to process transaction", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    Response createTransaction(@PathParam("accountNumber") @Pattern(regexp="^01\\d{6}$") @ApiParam("Account number of the bank account") String accountNumber,@Valid @NotNull CreateTransactionRequest createTransactionRequest);


    /**
     * Create a new user
     *
     * @param createUserRequest Create a new user
     * @return User has been created successfully
     * @return Invalid details supplied
     * @return An unexpected error occurred
     */
    @POST
    @Path("/v1/users")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Create a new user", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "User has been created successfully", response = UserResponse.class),
        @ApiResponse(code = 400, message = "Invalid details supplied", response = Void.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    Response createUser(@Valid @NotNull CreateUserRequest createUserRequest);


    /**
     * Delete account by account number.
     *
     * @param accountNumber Account number of the bank account
     * @return The bank account has been deleted
     * @return The request didn't supply all the necessary data
     * @return Access token is missing or invalid
     * @return The user is not allowed to delete the bank account details
     * @return Bank account was not found
     * @return An unexpected error occurred
     */
    @DELETE
    @Path("/v1/accounts/{accountNumber}")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Delete account by account number.", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The bank account has been deleted", response = Void.class),
        @ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        @ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "The user is not allowed to delete the bank account details", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Bank account was not found", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    Response deleteAccountByAccountNumber(@PathParam("accountNumber") @Pattern(regexp="^01\\d{6}$") @ApiParam("Account number of the bank account") String accountNumber);


    /**
     * Delete user by ID.
     *
     * @param userId ID of the user
     * @return The user has been deleted
     * @return The request didn't supply all the necessary data
     * @return User was not found
     * @return Access token is missing or invalid
     * @return The user is not allowed to access the transaction
     * @return A user cannot be deleted when they are associated with a bank account
     * @return An unexpected error occurred
     */
    @DELETE
    @Path("/v1/users/{userId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Delete user by ID.", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The user has been deleted", response = Void.class),
        @ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        @ApiResponse(code = 404, message = "User was not found", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "The user is not allowed to access the transaction", response = ErrorResponse.class),
        @ApiResponse(code = 409, message = "A user cannot be deleted when they are associated with a bank account", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    Response deleteUserByID(@PathParam("userId") @Pattern(regexp="^usr-[A-Za-z0-9]+$") @ApiParam("ID of the user") String userId);


    /**
     * Fetch account by account number.
     *
     * @param accountNumber Account number of the bank account
     * @return The bank account details
     * @return The request didn't supply all the necessary data
     * @return The user was not authenticated
     * @return The user is not allowed to access the bank account details
     * @return Bank account was not found
     * @return An unexpected error occurred
     */
    @GET
    @Path("/v1/accounts/{accountNumber}")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Fetch account by account number.", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The bank account details", response = BankAccountResponse.class),
        @ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        @ApiResponse(code = 401, message = "The user was not authenticated", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "The user is not allowed to access the bank account details", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Bank account was not found", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    Response fetchAccountByAccountNumber(@PathParam("accountNumber") @Pattern(regexp="^01\\d{6}$") @ApiParam("Account number of the bank account") String accountNumber);


    /**
     * Fetch transaction by ID.
     *
     * @param accountNumber Account number of the bank account
     * @param transactionId ID of the transaction
     * @return The transaction details
     * @return The request didn't supply all the necessary data
     * @return Access token is missing or invalid
     * @return The user is not allowed to access the transaction
     * @return Bank account was not found
     * @return An unexpected error occurred
     */
    @GET
    @Path("/v1/accounts/{accountNumber}/transactions/{transactionId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Fetch transaction by ID.", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "transaction" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The transaction details", response = TransactionResponse.class),
        @ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        @ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "The user is not allowed to access the transaction", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Bank account was not found", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    Response fetchAccountTransactionByID(@PathParam("accountNumber") @Pattern(regexp="^01\\d{6}$") @ApiParam("Account number of the bank account") String accountNumber,@PathParam("transactionId") @Pattern(regexp="^tan-[A-Za-z0-9]$") @ApiParam("ID of the transaction") String transactionId);


    /**
     * Fetch user by ID.
     *
     * @param userId ID of the user
     * @return The user details
     * @return The request didn't supply all the necessary data
     * @return Access token is missing or invalid
     * @return The user is not allowed to access the transaction
     * @return User was not found
     * @return An unexpected error occurred
     */
    @GET
    @Path("/v1/users/{userId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Fetch user by ID.", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The user details", response = UserResponse.class),
        @ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        @ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "The user is not allowed to access the transaction", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "User was not found", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    Response fetchUserByID(@PathParam("userId") @Pattern(regexp="^usr-[A-Za-z0-9]+$") @ApiParam("ID of the user") String userId);


    /**
     * List transactions
     *
     * @param accountNumber Account number of the bank account
     * @return The list of transaction details
     * @return The request didn't supply all the necessary data
     * @return Access token is missing or invalid
     * @return The user is not allowed to access the transactions
     * @return Bank account was not found
     * @return An unexpected error occurred
     */
    @GET
    @Path("/v1/accounts/{accountNumber}/transactions")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "List transactions", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "transaction" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The list of transaction details", response = ListTransactionsResponse.class),
        @ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        @ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "The user is not allowed to access the transactions", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Bank account was not found", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    Response listAccountTransaction(@PathParam("accountNumber") @Pattern(regexp="^01\\d{6}$") @ApiParam("Account number of the bank account") String accountNumber);


    /**
     * List accounts
     *
     * @return The list of bank accounts
     * @return Access token is missing or invalid
     * @return An unexpected error occurred
     */
    @GET
    @Path("/v1/accounts")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "List accounts", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The list of bank accounts", response = ListBankAccountsResponse.class),
        @ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    Response listAccounts();


    /**
     * Update account by account number.
     *
     * @param accountNumber Account number of the bank account
     * @param updateBankAccountRequest Update bank account details for the user
     * @return The updated bank account details
     * @return The request didn't supply all the necessary data
     * @return Access token is missing or invalid
     * @return The user is not allowed to update the bank account details
     * @return Bank account was not found
     * @return An unexpected error occurred
     */
    @PATCH
    @Path("/v1/accounts/{accountNumber}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Update account by account number.", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated bank account details", response = BankAccountResponse.class),
        @ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        @ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "The user is not allowed to update the bank account details", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Bank account was not found", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    Response updateAccountByAccountNumber(@PathParam("accountNumber") @Pattern(regexp="^01\\d{6}$") @ApiParam("Account number of the bank account") String accountNumber,@Valid @NotNull UpdateBankAccountRequest updateBankAccountRequest);


    /**
     * Update user by ID.
     *
     * @param userId ID of the user
     * @param updateUserRequest Update user details
     * @return The updated user details
     * @return The request didn't supply all the necessary data
     * @return Access token is missing or invalid
     * @return The user is not allowed to access the transaction
     * @return User was not found
     * @return An unexpected error occurred
     */
    @PATCH
    @Path("/v1/users/{userId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "Update user by ID.", authorizations = {
        
        @Authorization(value = "bearerAuth")
         }, tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated user details", response = UserResponse.class),
        @ApiResponse(code = 400, message = "The request didn't supply all the necessary data", response = BadRequestErrorResponse.class),
        @ApiResponse(code = 401, message = "Access token is missing or invalid", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "The user is not allowed to access the transaction", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "User was not found", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "An unexpected error occurred", response = ErrorResponse.class) })
    Response updateUserByID(@PathParam("userId") @Pattern(regexp="^usr-[A-Za-z0-9]+$") @ApiParam("ID of the user") String userId,@Valid @NotNull UpdateUserRequest updateUserRequest);

}
