package com.bank.eagle.gen.model;

import com.bank.eagle.gen.model.CreateUserRequestAddress;
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



@JsonTypeName("CreateUserRequest")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-03T14:29:53.586085Z[Europe/London]", comments = "Generator version: 7.17.0")
public class CreateUserRequest   {
  private String name;
  private CreateUserRequestAddress address;
  private String phoneNumber;
  private String email;

  protected CreateUserRequest(CreateUserRequestBuilder<?, ?> b) {
    this.name = b.name;
    this.address = b.address;
    this.phoneNumber = b.phoneNumber;
    this.email = b.email;
  }

  public CreateUserRequest() {
  }

  @JsonCreator
  public CreateUserRequest(
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "address") CreateUserRequestAddress address,
    @JsonProperty(required = true, value = "phoneNumber") String phoneNumber,
    @JsonProperty(required = true, value = "email") String email
  ) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

  /**
   **/
  public CreateUserRequest name(String name) {
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
  public CreateUserRequest address(CreateUserRequestAddress address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "address")
  @NotNull @Valid public CreateUserRequestAddress getAddress() {
    return address;
  }

  @JsonProperty(required = true, value = "address")
  public void setAddress(CreateUserRequestAddress address) {
    this.address = address;
  }

  /**
   **/
  public CreateUserRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "phoneNumber")
  @NotNull public String getPhoneNumber() {
    return phoneNumber;
  }

  @JsonProperty(required = true, value = "phoneNumber")
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   **/
  public CreateUserRequest email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "email")
  @NotNull public String getEmail() {
    return email;
  }

  @JsonProperty(required = true, value = "email")
  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserRequest createUserRequest = (CreateUserRequest) o;
    return Objects.equals(this.name, createUserRequest.name) &&
        Objects.equals(this.address, createUserRequest.address) &&
        Objects.equals(this.phoneNumber, createUserRequest.phoneNumber) &&
        Objects.equals(this.email, createUserRequest.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, phoneNumber, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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


  public static CreateUserRequestBuilder<?, ?> builder() {
    return new CreateUserRequestBuilderImpl();
  }

  private static final class CreateUserRequestBuilderImpl extends CreateUserRequestBuilder<CreateUserRequest, CreateUserRequestBuilderImpl> {

    @Override
    protected CreateUserRequestBuilderImpl self() {
      return this;
    }

    @Override
    public CreateUserRequest build() {
      return new CreateUserRequest(this);
    }
  }

  public static abstract class CreateUserRequestBuilder<C extends CreateUserRequest, B extends CreateUserRequestBuilder<C, B>>  {
    private String name;
    private CreateUserRequestAddress address;
    private String phoneNumber;
    private String email;
    protected abstract B self();

    public abstract C build();

    public B name(String name) {
      this.name = name;
      return self();
    }
    public B address(CreateUserRequestAddress address) {
      this.address = address;
      return self();
    }
    public B phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return self();
    }
    public B email(String email) {
      this.email = email;
      return self();
    }
  }
}

