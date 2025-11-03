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



@JsonTypeName("TransactionResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-03T14:29:53.586085Z[Europe/London]", comments = "Generator version: 7.17.0")
public class TransactionResponse   {
  private String id;
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
  private String userId;
  private Date createdTimestamp;

  protected TransactionResponse(TransactionResponseBuilder<?, ?> b) {
    this.id = b.id;
    this.amount = b.amount;
    this.currency = b.currency;
    this.type = b.type;
    this.reference = b.reference;
    this.userId = b.userId;
    this.createdTimestamp = b.createdTimestamp;
  }

  public TransactionResponse() {
  }

  @JsonCreator
  public TransactionResponse(
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "amount") Double amount,
    @JsonProperty(required = true, value = "currency") CurrencyEnum currency,
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "createdTimestamp") Date createdTimestamp
  ) {
    this.id = id;
    this.amount = amount;
    this.currency = currency;
    this.type = type;
    this.createdTimestamp = createdTimestamp;
  }

  /**
   **/
  public TransactionResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^tan-[A-Za-z0-9]$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * minimum: 0.0
   * maximum: 10000.0
   **/
  public TransactionResponse amount(Double amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
  public TransactionResponse currency(CurrencyEnum currency) {
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
  public TransactionResponse type(TypeEnum type) {
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
  public TransactionResponse reference(String reference) {
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

  /**
   **/
  public TransactionResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  @JsonProperty("userId")
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   **/
  public TransactionResponse createdTimestamp(Date createdTimestamp) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResponse transactionResponse = (TransactionResponse) o;
    return Objects.equals(this.id, transactionResponse.id) &&
        Objects.equals(this.amount, transactionResponse.amount) &&
        Objects.equals(this.currency, transactionResponse.currency) &&
        Objects.equals(this.type, transactionResponse.type) &&
        Objects.equals(this.reference, transactionResponse.reference) &&
        Objects.equals(this.userId, transactionResponse.userId) &&
        Objects.equals(this.createdTimestamp, transactionResponse.createdTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, currency, type, reference, userId, createdTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
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


  public static TransactionResponseBuilder<?, ?> builder() {
    return new TransactionResponseBuilderImpl();
  }

  private static final class TransactionResponseBuilderImpl extends TransactionResponseBuilder<TransactionResponse, TransactionResponseBuilderImpl> {

    @Override
    protected TransactionResponseBuilderImpl self() {
      return this;
    }

    @Override
    public TransactionResponse build() {
      return new TransactionResponse(this);
    }
  }

  public static abstract class TransactionResponseBuilder<C extends TransactionResponse, B extends TransactionResponseBuilder<C, B>>  {
    private String id;
    private Double amount;
    private CurrencyEnum currency;
    private TypeEnum type;
    private String reference;
    private String userId;
    private Date createdTimestamp;
    protected abstract B self();

    public abstract C build();

    public B id(String id) {
      this.id = id;
      return self();
    }
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
    public B userId(String userId) {
      this.userId = userId;
      return self();
    }
    public B createdTimestamp(Date createdTimestamp) {
      this.createdTimestamp = createdTimestamp;
      return self();
    }
  }
}

