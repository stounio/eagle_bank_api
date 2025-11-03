package com.bank.eagle.gen.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("BankAccountResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-03T14:29:53.586085Z[Europe/London]", comments = "Generator version: 7.17.0")
public class BankAccountResponse   {
  private String accountNumber;
  public enum SortCodeEnum {

    _10_10_10(String.valueOf("10-10-10"));


    private String value;

    SortCodeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static SortCodeEnum fromString(String s) {
        for (SortCodeEnum b : SortCodeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static SortCodeEnum fromValue(String value) {
        for (SortCodeEnum b : SortCodeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private SortCodeEnum sortCode;
  private String name;
  public enum AccountTypeEnum {

    PERSONAL(String.valueOf("personal"));


    private String value;

    AccountTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static AccountTypeEnum fromString(String s) {
        for (AccountTypeEnum b : AccountTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static AccountTypeEnum fromValue(String value) {
        for (AccountTypeEnum b : AccountTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private AccountTypeEnum accountType;
  private Double balance;
  public enum CurrencyEnum {

    GBP(String.valueOf("GBP"));


    private String value;

    CurrencyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static CurrencyEnum fromString(String s) {
        for (CurrencyEnum b : CurrencyEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static CurrencyEnum fromValue(String value) {
        for (CurrencyEnum b : CurrencyEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private CurrencyEnum currency;
  private Date createdTimestamp;
  private Date updatedTimestamp;

  protected BankAccountResponse(BankAccountResponseBuilder<?, ?> b) {
    this.accountNumber = b.accountNumber;
    this.sortCode = b.sortCode;
    this.name = b.name;
    this.accountType = b.accountType;
    this.balance = b.balance;
    this.currency = b.currency;
    this.createdTimestamp = b.createdTimestamp;
    this.updatedTimestamp = b.updatedTimestamp;
  }

  public BankAccountResponse() {
  }

  @JsonCreator
  public BankAccountResponse(
    @JsonProperty(required = true, value = "accountNumber") String accountNumber,
    @JsonProperty(required = true, value = "sortCode") SortCodeEnum sortCode,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "accountType") AccountTypeEnum accountType,
    @JsonProperty(required = true, value = "balance") Double balance,
    @JsonProperty(required = true, value = "currency") CurrencyEnum currency,
    @JsonProperty(required = true, value = "createdTimestamp") Date createdTimestamp,
    @JsonProperty(required = true, value = "updatedTimestamp") Date updatedTimestamp
  ) {
    this.accountNumber = accountNumber;
    this.sortCode = sortCode;
    this.name = name;
    this.accountType = accountType;
    this.balance = balance;
    this.currency = currency;
    this.createdTimestamp = createdTimestamp;
    this.updatedTimestamp = updatedTimestamp;
  }

  /**
   **/
  public BankAccountResponse accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "accountNumber")
  @NotNull public String getAccountNumber() {
    return accountNumber;
  }

  @JsonProperty(required = true, value = "accountNumber")
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   **/
  public BankAccountResponse sortCode(SortCodeEnum sortCode) {
    this.sortCode = sortCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "sortCode")
  @NotNull public SortCodeEnum getSortCode() {
    return sortCode;
  }

  @JsonProperty(required = true, value = "sortCode")
  public void setSortCode(SortCodeEnum sortCode) {
    this.sortCode = sortCode;
  }

  /**
   **/
  public BankAccountResponse name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public BankAccountResponse accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "accountType")
  @NotNull public AccountTypeEnum getAccountType() {
    return accountType;
  }

  @JsonProperty(required = true, value = "accountType")
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  /**
   * Currency amount with up to two decimal places
   * minimum: 0.0
   * maximum: 10000.0
   **/
  public BankAccountResponse balance(Double balance) {
    this.balance = balance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Currency amount with up to two decimal places")
  @JsonProperty(required = true, value = "balance")
  @NotNull  @DecimalMin("0.0") @DecimalMax("10000.0")public Double getBalance() {
    return balance;
  }

  @JsonProperty(required = true, value = "balance")
  public void setBalance(Double balance) {
    this.balance = balance;
  }

  /**
   **/
  public BankAccountResponse currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "currency")
  @NotNull public CurrencyEnum getCurrency() {
    return currency;
  }

  @JsonProperty(required = true, value = "currency")
  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  /**
   **/
  public BankAccountResponse createdTimestamp(Date createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "createdTimestamp")
  @NotNull public Date getCreatedTimestamp() {
    return createdTimestamp;
  }

  @JsonProperty(required = true, value = "createdTimestamp")
  public void setCreatedTimestamp(Date createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  /**
   **/
  public BankAccountResponse updatedTimestamp(Date updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "updatedTimestamp")
  @NotNull public Date getUpdatedTimestamp() {
    return updatedTimestamp;
  }

  @JsonProperty(required = true, value = "updatedTimestamp")
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


  public static BankAccountResponseBuilder<?, ?> builder() {
    return new BankAccountResponseBuilderImpl();
  }

  private static final class BankAccountResponseBuilderImpl extends BankAccountResponseBuilder<BankAccountResponse, BankAccountResponseBuilderImpl> {

    @Override
    protected BankAccountResponseBuilderImpl self() {
      return this;
    }

    @Override
    public BankAccountResponse build() {
      return new BankAccountResponse(this);
    }
  }

  public static abstract class BankAccountResponseBuilder<C extends BankAccountResponse, B extends BankAccountResponseBuilder<C, B>>  {
    private String accountNumber;
    private SortCodeEnum sortCode;
    private String name;
    private AccountTypeEnum accountType;
    private Double balance;
    private CurrencyEnum currency;
    private Date createdTimestamp;
    private Date updatedTimestamp;
    protected abstract B self();

    public abstract C build();

    public B accountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
      return self();
    }
    public B sortCode(SortCodeEnum sortCode) {
      this.sortCode = sortCode;
      return self();
    }
    public B name(String name) {
      this.name = name;
      return self();
    }
    public B accountType(AccountTypeEnum accountType) {
      this.accountType = accountType;
      return self();
    }
    public B balance(Double balance) {
      this.balance = balance;
      return self();
    }
    public B currency(CurrencyEnum currency) {
      this.currency = currency;
      return self();
    }
    public B createdTimestamp(Date createdTimestamp) {
      this.createdTimestamp = createdTimestamp;
      return self();
    }
    public B updatedTimestamp(Date updatedTimestamp) {
      this.updatedTimestamp = updatedTimestamp;
      return self();
    }
  }
}

