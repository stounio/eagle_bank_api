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



@JsonTypeName("CreateTransactionRequest")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-03T14:29:53.586085Z[Europe/London]", comments = "Generator version: 7.17.0")
public class CreateTransactionRequest   {
  private Double amount;
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
  public enum TypeEnum {

    DEPOSIT(String.valueOf("deposit")), WITHDRAWAL(String.valueOf("withdrawal"));


    private String value;

    TypeEnum (String v) {
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
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private TypeEnum type;
  private String reference;

  protected CreateTransactionRequest(CreateTransactionRequestBuilder<?, ?> b) {
    this.amount = b.amount;
    this.currency = b.currency;
    this.type = b.type;
    this.reference = b.reference;
  }

  public CreateTransactionRequest() {
  }

  @JsonCreator
  public CreateTransactionRequest(
    @JsonProperty(required = true, value = "amount") Double amount,
    @JsonProperty(required = true, value = "currency") CurrencyEnum currency,
    @JsonProperty(required = true, value = "type") TypeEnum type
  ) {
    this.amount = amount;
    this.currency = currency;
    this.type = type;
  }

  /**
   * Currency amount with up to two decimal places
   * minimum: 0.0
   * maximum: 10000.0
   **/
  public CreateTransactionRequest amount(Double amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Currency amount with up to two decimal places")
  @JsonProperty(required = true, value = "amount")
  @NotNull  @DecimalMin("0.0") @DecimalMax("10000.0")public Double getAmount() {
    return amount;
  }

  @JsonProperty(required = true, value = "amount")
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  /**
   **/
  public CreateTransactionRequest currency(CurrencyEnum currency) {
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
  public CreateTransactionRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public CreateTransactionRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }

  @JsonProperty("reference")
  public void setReference(String reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransactionRequest createTransactionRequest = (CreateTransactionRequest) o;
    return Objects.equals(this.amount, createTransactionRequest.amount) &&
        Objects.equals(this.currency, createTransactionRequest.currency) &&
        Objects.equals(this.type, createTransactionRequest.type) &&
        Objects.equals(this.reference, createTransactionRequest.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, type, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransactionRequest {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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


  public static CreateTransactionRequestBuilder<?, ?> builder() {
    return new CreateTransactionRequestBuilderImpl();
  }

  private static final class CreateTransactionRequestBuilderImpl extends CreateTransactionRequestBuilder<CreateTransactionRequest, CreateTransactionRequestBuilderImpl> {

    @Override
    protected CreateTransactionRequestBuilderImpl self() {
      return this;
    }

    @Override
    public CreateTransactionRequest build() {
      return new CreateTransactionRequest(this);
    }
  }

  public static abstract class CreateTransactionRequestBuilder<C extends CreateTransactionRequest, B extends CreateTransactionRequestBuilder<C, B>>  {
    private Double amount;
    private CurrencyEnum currency;
    private TypeEnum type;
    private String reference;
    protected abstract B self();

    public abstract C build();

    public B amount(Double amount) {
      this.amount = amount;
      return self();
    }
    public B currency(CurrencyEnum currency) {
      this.currency = currency;
      return self();
    }
    public B type(TypeEnum type) {
      this.type = type;
      return self();
    }
    public B reference(String reference) {
      this.reference = reference;
      return self();
    }
  }
}

