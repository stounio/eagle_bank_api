package com.bank.eagle.gen.model;

import com.bank.eagle.gen.model.BadRequestErrorResponseDetailsInner;
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



@JsonTypeName("BadRequestErrorResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-03T14:29:53.586085Z[Europe/London]", comments = "Generator version: 7.17.0")
public class BadRequestErrorResponse   {
  private String message;
  private @Valid List<@Valid BadRequestErrorResponseDetailsInner> details = new ArrayList<>();

  protected BadRequestErrorResponse(BadRequestErrorResponseBuilder<?, ?> b) {
    this.message = b.message;
    this.details = b.details;
  }

  public BadRequestErrorResponse() {
  }

  @JsonCreator
  public BadRequestErrorResponse(
    @JsonProperty(required = true, value = "message") String message,
    @JsonProperty(required = true, value = "details") List<@Valid BadRequestErrorResponseDetailsInner> details
  ) {
    this.message = message;
    this.details = details;
  }

  /**
   **/
  public BadRequestErrorResponse message(String message) {
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
  public BadRequestErrorResponse details(List<@Valid BadRequestErrorResponseDetailsInner> details) {
    this.details = details;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "details")
  @NotNull @Valid public List<@Valid BadRequestErrorResponseDetailsInner> getDetails() {
    return details;
  }

  @JsonProperty(required = true, value = "details")
  public void setDetails(List<@Valid BadRequestErrorResponseDetailsInner> details) {
    this.details = details;
  }

  public BadRequestErrorResponse addDetailsItem(BadRequestErrorResponseDetailsInner detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }

    this.details.add(detailsItem);
    return this;
  }

  public BadRequestErrorResponse removeDetailsItem(BadRequestErrorResponseDetailsInner detailsItem) {
    if (detailsItem != null && this.details != null) {
      this.details.remove(detailsItem);
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
    BadRequestErrorResponse badRequestErrorResponse = (BadRequestErrorResponse) o;
    return Objects.equals(this.message, badRequestErrorResponse.message) &&
        Objects.equals(this.details, badRequestErrorResponse.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequestErrorResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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


  public static BadRequestErrorResponseBuilder<?, ?> builder() {
    return new BadRequestErrorResponseBuilderImpl();
  }

  private static final class BadRequestErrorResponseBuilderImpl extends BadRequestErrorResponseBuilder<BadRequestErrorResponse, BadRequestErrorResponseBuilderImpl> {

    @Override
    protected BadRequestErrorResponseBuilderImpl self() {
      return this;
    }

    @Override
    public BadRequestErrorResponse build() {
      return new BadRequestErrorResponse(this);
    }
  }

  public static abstract class BadRequestErrorResponseBuilder<C extends BadRequestErrorResponse, B extends BadRequestErrorResponseBuilder<C, B>>  {
    private String message;
    private List<BadRequestErrorResponseDetailsInner> details = new ArrayList<>();
    protected abstract B self();

    public abstract C build();

    public B message(String message) {
      this.message = message;
      return self();
    }
    public B details(List<BadRequestErrorResponseDetailsInner> details) {
      this.details = details;
      return self();
    }
  }
}

