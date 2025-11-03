package com.bank.eagle.gen.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
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



@JsonTypeName("BadRequestErrorResponse_details_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-03T14:29:53.586085Z[Europe/London]", comments = "Generator version: 7.17.0")
public class BadRequestErrorResponseDetailsInner   {
  private String field;
  private String message;
  private String type;

  protected BadRequestErrorResponseDetailsInner(BadRequestErrorResponseDetailsInnerBuilder<?, ?> b) {
    this.field = b.field;
    this.message = b.message;
    this.type = b.type;
  }

  public BadRequestErrorResponseDetailsInner() {
  }

  @JsonCreator
  public BadRequestErrorResponseDetailsInner(
    @JsonProperty(required = true, value = "field") String field,
    @JsonProperty(required = true, value = "message") String message,
    @JsonProperty(required = true, value = "type") String type
  ) {
    this.field = field;
    this.message = message;
    this.type = type;
  }

  /**
   **/
  public BadRequestErrorResponseDetailsInner field(String field) {
    this.field = field;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "field")
  @NotNull public String getField() {
    return field;
  }

  @JsonProperty(required = true, value = "field")
  public void setField(String field) {
    this.field = field;
  }

  /**
   **/
  public BadRequestErrorResponseDetailsInner message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "message")
  @NotNull public String getMessage() {
    return message;
  }

  @JsonProperty(required = true, value = "message")
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  public BadRequestErrorResponseDetailsInner type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "type")
  @NotNull public String getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadRequestErrorResponseDetailsInner badRequestErrorResponseDetailsInner = (BadRequestErrorResponseDetailsInner) o;
    return Objects.equals(this.field, badRequestErrorResponseDetailsInner.field) &&
        Objects.equals(this.message, badRequestErrorResponseDetailsInner.message) &&
        Objects.equals(this.type, badRequestErrorResponseDetailsInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, message, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequestErrorResponseDetailsInner {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


  public static BadRequestErrorResponseDetailsInnerBuilder<?, ?> builder() {
    return new BadRequestErrorResponseDetailsInnerBuilderImpl();
  }

  private static final class BadRequestErrorResponseDetailsInnerBuilderImpl extends BadRequestErrorResponseDetailsInnerBuilder<BadRequestErrorResponseDetailsInner, BadRequestErrorResponseDetailsInnerBuilderImpl> {

    @Override
    protected BadRequestErrorResponseDetailsInnerBuilderImpl self() {
      return this;
    }

    @Override
    public BadRequestErrorResponseDetailsInner build() {
      return new BadRequestErrorResponseDetailsInner(this);
    }
  }

  public static abstract class BadRequestErrorResponseDetailsInnerBuilder<C extends BadRequestErrorResponseDetailsInner, B extends BadRequestErrorResponseDetailsInnerBuilder<C, B>>  {
    private String field;
    private String message;
    private String type;
    protected abstract B self();

    public abstract C build();

    public B field(String field) {
      this.field = field;
      return self();
    }
    public B message(String message) {
      this.message = message;
      return self();
    }
    public B type(String type) {
      this.type = type;
      return self();
    }
  }
}

