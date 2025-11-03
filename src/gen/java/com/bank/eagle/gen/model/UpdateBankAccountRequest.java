package com.bank.eagle.gen.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UpdateBankAccountRequest")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-03T15:19:25.171821Z[Europe/London]", comments = "Generator version: 7.17.0")
public class UpdateBankAccountRequest   {
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

  protected UpdateBankAccountRequest(UpdateBankAccountRequestBuilder<?, ?> b) {
    this.name = b.name;
    this.accountType = b.accountType;
  }

  public UpdateBankAccountRequest() {
  }

  /**
   **/
  public UpdateBankAccountRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public UpdateBankAccountRequest accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("accountType")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  @JsonProperty("accountType")
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBankAccountRequest updateBankAccountRequest = (UpdateBankAccountRequest) o;
    return Objects.equals(this.name, updateBankAccountRequest.name) &&
        Objects.equals(this.accountType, updateBankAccountRequest.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBankAccountRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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


  public static UpdateBankAccountRequestBuilder<?, ?> builder() {
    return new UpdateBankAccountRequestBuilderImpl();
  }

  private static final class UpdateBankAccountRequestBuilderImpl extends UpdateBankAccountRequestBuilder<UpdateBankAccountRequest, UpdateBankAccountRequestBuilderImpl> {

    @Override
    protected UpdateBankAccountRequestBuilderImpl self() {
      return this;
    }

    @Override
    public UpdateBankAccountRequest build() {
      return new UpdateBankAccountRequest(this);
    }
  }

  public static abstract class UpdateBankAccountRequestBuilder<C extends UpdateBankAccountRequest, B extends UpdateBankAccountRequestBuilder<C, B>>  {
    private String name;
    private AccountTypeEnum accountType;
    protected abstract B self();

    public abstract C build();

    public B name(String name) {
      this.name = name;
      return self();
    }
    public B accountType(AccountTypeEnum accountType) {
      this.accountType = accountType;
      return self();
    }
  }
}

