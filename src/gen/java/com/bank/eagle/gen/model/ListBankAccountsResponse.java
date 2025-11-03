package com.bank.eagle.gen.model;

import com.bank.eagle.gen.model.BankAccountResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ListBankAccountsResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-03T15:19:25.171821Z[Europe/London]", comments = "Generator version: 7.17.0")
public class ListBankAccountsResponse   {
  private @Valid List<@Valid BankAccountResponse> accounts = new ArrayList<>();

  protected ListBankAccountsResponse(ListBankAccountsResponseBuilder<?, ?> b) {
    this.accounts = b.accounts;
  }

  public ListBankAccountsResponse() {
  }

  @JsonCreator
  public ListBankAccountsResponse(
    @JsonProperty(required = true, value = "accounts") List<@Valid BankAccountResponse> accounts
  ) {
    this.accounts = accounts;
  }

  /**
   **/
  public ListBankAccountsResponse accounts(List<@Valid BankAccountResponse> accounts) {
    this.accounts = accounts;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "accounts")
  @NotNull @Valid public List<@Valid BankAccountResponse> getAccounts() {
    return accounts;
  }

  @JsonProperty(required = true, value = "accounts")
  public void setAccounts(List<@Valid BankAccountResponse> accounts) {
    this.accounts = accounts;
  }

  public ListBankAccountsResponse addAccountsItem(BankAccountResponse accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }

    this.accounts.add(accountsItem);
    return this;
  }

  public ListBankAccountsResponse removeAccountsItem(BankAccountResponse accountsItem) {
    if (accountsItem != null && this.accounts != null) {
      this.accounts.remove(accountsItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBankAccountsResponse listBankAccountsResponse = (ListBankAccountsResponse) o;
    return Objects.equals(this.accounts, listBankAccountsResponse.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBankAccountsResponse {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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


  public static ListBankAccountsResponseBuilder<?, ?> builder() {
    return new ListBankAccountsResponseBuilderImpl();
  }

  private static final class ListBankAccountsResponseBuilderImpl extends ListBankAccountsResponseBuilder<ListBankAccountsResponse, ListBankAccountsResponseBuilderImpl> {

    @Override
    protected ListBankAccountsResponseBuilderImpl self() {
      return this;
    }

    @Override
    public ListBankAccountsResponse build() {
      return new ListBankAccountsResponse(this);
    }
  }

  public static abstract class ListBankAccountsResponseBuilder<C extends ListBankAccountsResponse, B extends ListBankAccountsResponseBuilder<C, B>>  {
    private List<BankAccountResponse> accounts = new ArrayList<>();
    protected abstract B self();

    public abstract C build();

    public B accounts(List<BankAccountResponse> accounts) {
      this.accounts = accounts;
      return self();
    }
  }
}

