package com.bank.eagle.gen.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import io.swagger.annotations.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2025-11-03T11:08:10.131371Z[Europe/London]", comments = "Generator version: 7.17.0")
public class BankAccountResponse   {
  
  private String accountNumber;

  /**
   * Gets or Sets sortCode
   */
  public enum SortCodeEnum {
    _10_10_10("10-10-10");
    private String value;

    SortCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SortCodeEnum sortCode;
  private String name;

  /**
   * Gets or Sets accountType
   */
  public enum AccountTypeEnum {
    PERSONAL("personal");
    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private AccountTypeEnum accountType;
  private Double balance;

  /**
   * Gets or Sets currency
   */
  public enum CurrencyEnum {
    GBP("GBP");
    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CurrencyEnum currency;
  private Date createdTimestamp;
  private Date updatedTimestamp;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accountNumber")
  @NotNull
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sortCode")
  @NotNull
  public SortCodeEnum getSortCode() {
    return sortCode;
  }
  public void setSortCode(SortCodeEnum sortCode) {
    this.sortCode = sortCode;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accountType")
  @NotNull
  public AccountTypeEnum getAccountType() {
    return accountType;
  }
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  /**
   * Currency amount with up to two decimal places
   * minimum: 0.0
   * maximum: 10000.0
   **/
  
  @ApiModelProperty(required = true, value = "Currency amount with up to two decimal places")
  @JsonProperty("balance")
  @NotNull
 @DecimalMin("0.0") @DecimalMax("10000.0")  public Double getBalance() {
    return balance;
  }
  public void setBalance(Double balance) {
    this.balance = balance;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("currency")
  @NotNull
  public CurrencyEnum getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("createdTimestamp")
  @NotNull
  public Date getCreatedTimestamp() {
    return createdTimestamp;
  }
  public void setCreatedTimestamp(Date createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("updatedTimestamp")
  @NotNull
  public Date getUpdatedTimestamp() {
    return updatedTimestamp;
  }
  public void setUpdatedTimestamp(Date updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountResponse bankAccountResponse = (BankAccountResponse) o;
    return Objects.equals(this.accountNumber, bankAccountResponse.accountNumber) &&
        Objects.equals(this.sortCode, bankAccountResponse.sortCode) &&
        Objects.equals(this.name, bankAccountResponse.name) &&
        Objects.equals(this.accountType, bankAccountResponse.accountType) &&
        Objects.equals(this.balance, bankAccountResponse.balance) &&
        Objects.equals(this.currency, bankAccountResponse.currency) &&
        Objects.equals(this.createdTimestamp, bankAccountResponse.createdTimestamp) &&
        Objects.equals(this.updatedTimestamp, bankAccountResponse.updatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, sortCode, name, accountType, balance, currency, createdTimestamp, updatedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountResponse {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

