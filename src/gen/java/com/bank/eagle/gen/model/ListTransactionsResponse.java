package com.bank.eagle.gen.model;

import com.bank.eagle.gen.model.TransactionResponse;
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



@JsonTypeName("ListTransactionsResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-03T14:29:53.586085Z[Europe/London]", comments = "Generator version: 7.17.0")
public class ListTransactionsResponse   {
  private @Valid List<@Valid TransactionResponse> transactions = new ArrayList<>();

  protected ListTransactionsResponse(ListTransactionsResponseBuilder<?, ?> b) {
    this.transactions = b.transactions;
  }

  public ListTransactionsResponse() {
  }

  @JsonCreator
  public ListTransactionsResponse(
    @JsonProperty(required = true, value = "transactions") List<@Valid TransactionResponse> transactions
  ) {
    this.transactions = transactions;
  }

  /**
   **/
  public ListTransactionsResponse transactions(List<@Valid TransactionResponse> transactions) {
    this.transactions = transactions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "transactions")
  @NotNull @Valid public List<@Valid TransactionResponse> getTransactions() {
    return transactions;
  }

  @JsonProperty(required = true, value = "transactions")
  public void setTransactions(List<@Valid TransactionResponse> transactions) {
    this.transactions = transactions;
  }

  public ListTransactionsResponse addTransactionsItem(TransactionResponse transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }

    this.transactions.add(transactionsItem);
    return this;
  }

  public ListTransactionsResponse removeTransactionsItem(TransactionResponse transactionsItem) {
    if (transactionsItem != null && this.transactions != null) {
      this.transactions.remove(transactionsItem);
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
    ListTransactionsResponse listTransactionsResponse = (ListTransactionsResponse) o;
    return Objects.equals(this.transactions, listTransactionsResponse.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsResponse {\n");
    
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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


  public static ListTransactionsResponseBuilder<?, ?> builder() {
    return new ListTransactionsResponseBuilderImpl();
  }

  private static final class ListTransactionsResponseBuilderImpl extends ListTransactionsResponseBuilder<ListTransactionsResponse, ListTransactionsResponseBuilderImpl> {

    @Override
    protected ListTransactionsResponseBuilderImpl self() {
      return this;
    }

    @Override
    public ListTransactionsResponse build() {
      return new ListTransactionsResponse(this);
    }
  }

  public static abstract class ListTransactionsResponseBuilder<C extends ListTransactionsResponse, B extends ListTransactionsResponseBuilder<C, B>>  {
    private List<TransactionResponse> transactions = new ArrayList<>();
    protected abstract B self();

    public abstract C build();

    public B transactions(List<TransactionResponse> transactions) {
      this.transactions = transactions;
      return self();
    }
  }
}

