package com.bank.eagle.gen.model;

import com.bank.eagle.gen.model.CreateUserRequestAddress;
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



@JsonTypeName("UserResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-03T14:29:53.586085Z[Europe/London]", comments = "Generator version: 7.17.0")
public class UserResponse   {
  private String id;
  private String name;
  private CreateUserRequestAddress address;
  private String phoneNumber;
  private String email;
  private Date createdTimestamp;
  private Date updatedTimestamp;

  protected UserResponse(UserResponseBuilder<?, ?> b) {
    this.id = b.id;
    this.name = b.name;
    this.address = b.address;
    this.phoneNumber = b.phoneNumber;
    this.email = b.email;
    this.createdTimestamp = b.createdTimestamp;
    this.updatedTimestamp = b.updatedTimestamp;
  }

  public UserResponse() {
  }

  @JsonCreator
  public UserResponse(
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "address") CreateUserRequestAddress address,
    @JsonProperty(required = true, value = "phoneNumber") String phoneNumber,
    @JsonProperty(required = true, value = "email") String email,
    @JsonProperty(required = true, value = "createdTimestamp") Date createdTimestamp,
    @JsonProperty(required = true, value = "updatedTimestamp") Date updatedTimestamp
  ) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.createdTimestamp = createdTimestamp;
    this.updatedTimestamp = updatedTimestamp;
  }

  /**
   **/
  public UserResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public UserResponse name(String name) {
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
  public UserResponse address(CreateUserRequestAddress address) {
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
  public UserResponse phoneNumber(String phoneNumber) {
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
  public UserResponse email(String email) {
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

  /**
   **/
  public UserResponse createdTimestamp(Date createdTimestamp) {
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
  public UserResponse updatedTimestamp(Date updatedTimestamp) {
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
    UserResponse userResponse = (UserResponse) o;
    return Objects.equals(this.id, userResponse.id) &&
        Objects.equals(this.name, userResponse.name) &&
        Objects.equals(this.address, userResponse.address) &&
        Objects.equals(this.phoneNumber, userResponse.phoneNumber) &&
        Objects.equals(this.email, userResponse.email) &&
        Objects.equals(this.createdTimestamp, userResponse.createdTimestamp) &&
        Objects.equals(this.updatedTimestamp, userResponse.updatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, phoneNumber, email, createdTimestamp, updatedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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


  public static UserResponseBuilder<?, ?> builder() {
    return new UserResponseBuilderImpl();
  }

  private static final class UserResponseBuilderImpl extends UserResponseBuilder<UserResponse, UserResponseBuilderImpl> {

    @Override
    protected UserResponseBuilderImpl self() {
      return this;
    }

    @Override
    public UserResponse build() {
      return new UserResponse(this);
    }
  }

  public static abstract class UserResponseBuilder<C extends UserResponse, B extends UserResponseBuilder<C, B>>  {
    private String id;
    private String name;
    private CreateUserRequestAddress address;
    private String phoneNumber;
    private String email;
    private Date createdTimestamp;
    private Date updatedTimestamp;
    protected abstract B self();

    public abstract C build();

    public B id(String id) {
      this.id = id;
      return self();
    }
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

