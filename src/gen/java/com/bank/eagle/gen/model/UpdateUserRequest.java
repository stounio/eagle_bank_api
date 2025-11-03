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



@JsonTypeName("UpdateUserRequest")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-03T14:29:53.586085Z[Europe/London]", comments = "Generator version: 7.17.0")
public class UpdateUserRequest   {
  private String name;
  private CreateUserRequestAddress address;
  private String phoneNumber;
  private String email;

  protected UpdateUserRequest(UpdateUserRequestBuilder<?, ?> b) {
    this.name = b.name;
    this.address = b.address;
    this.phoneNumber = b.phoneNumber;
    this.email = b.email;
  }

  public UpdateUserRequest() {
  }

  /**
   **/
  public UpdateUserRequest name(String name) {
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
  public UpdateUserRequest address(CreateUserRequestAddress address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  @Valid public CreateUserRequestAddress getAddress() {
    return address;
  }

  @JsonProperty("address")
  public void setAddress(CreateUserRequestAddress address) {
    this.address = address;
  }

  /**
   **/
  public UpdateUserRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  @JsonProperty("phoneNumber")
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   **/
  public UpdateUserRequest email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
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
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    return Objects.equals(this.name, updateUserRequest.name) &&
        Objects.equals(this.address, updateUserRequest.address) &&
        Objects.equals(this.phoneNumber, updateUserRequest.phoneNumber) &&
        Objects.equals(this.email, updateUserRequest.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, phoneNumber, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequest {\n");
    
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


  public static UpdateUserRequestBuilder<?, ?> builder() {
    return new UpdateUserRequestBuilderImpl();
  }

  private static final class UpdateUserRequestBuilderImpl extends UpdateUserRequestBuilder<UpdateUserRequest, UpdateUserRequestBuilderImpl> {

    @Override
    protected UpdateUserRequestBuilderImpl self() {
      return this;
    }

    @Override
    public UpdateUserRequest build() {
      return new UpdateUserRequest(this);
    }
  }

  public static abstract class UpdateUserRequestBuilder<C extends UpdateUserRequest, B extends UpdateUserRequestBuilder<C, B>>  {
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

