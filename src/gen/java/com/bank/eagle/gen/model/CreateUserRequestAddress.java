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



@JsonTypeName("CreateUserRequest_address")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-11-03T14:29:53.586085Z[Europe/London]", comments = "Generator version: 7.17.0")
public class CreateUserRequestAddress   {
  private String line1;
  private String line2;
  private String line3;
  private String town;
  private String county;
  private String postcode;

  protected CreateUserRequestAddress(CreateUserRequestAddressBuilder<?, ?> b) {
    this.line1 = b.line1;
    this.line2 = b.line2;
    this.line3 = b.line3;
    this.town = b.town;
    this.county = b.county;
    this.postcode = b.postcode;
  }

  public CreateUserRequestAddress() {
  }

  @JsonCreator
  public CreateUserRequestAddress(
    @JsonProperty(required = true, value = "line1") String line1,
    @JsonProperty(required = true, value = "town") String town,
    @JsonProperty(required = true, value = "county") String county,
    @JsonProperty(required = true, value = "postcode") String postcode
  ) {
    this.line1 = line1;
    this.town = town;
    this.county = county;
    this.postcode = postcode;
  }

  /**
   **/
  public CreateUserRequestAddress line1(String line1) {
    this.line1 = line1;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "line1")
  @NotNull public String getLine1() {
    return line1;
  }

  @JsonProperty(required = true, value = "line1")
  public void setLine1(String line1) {
    this.line1 = line1;
  }

  /**
   **/
  public CreateUserRequestAddress line2(String line2) {
    this.line2 = line2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("line2")
  public String getLine2() {
    return line2;
  }

  @JsonProperty("line2")
  public void setLine2(String line2) {
    this.line2 = line2;
  }

  /**
   **/
  public CreateUserRequestAddress line3(String line3) {
    this.line3 = line3;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("line3")
  public String getLine3() {
    return line3;
  }

  @JsonProperty("line3")
  public void setLine3(String line3) {
    this.line3 = line3;
  }

  /**
   **/
  public CreateUserRequestAddress town(String town) {
    this.town = town;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "town")
  @NotNull public String getTown() {
    return town;
  }

  @JsonProperty(required = true, value = "town")
  public void setTown(String town) {
    this.town = town;
  }

  /**
   **/
  public CreateUserRequestAddress county(String county) {
    this.county = county;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "county")
  @NotNull public String getCounty() {
    return county;
  }

  @JsonProperty(required = true, value = "county")
  public void setCounty(String county) {
    this.county = county;
  }

  /**
   **/
  public CreateUserRequestAddress postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "postcode")
  @NotNull public String getPostcode() {
    return postcode;
  }

  @JsonProperty(required = true, value = "postcode")
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserRequestAddress createUserRequestAddress = (CreateUserRequestAddress) o;
    return Objects.equals(this.line1, createUserRequestAddress.line1) &&
        Objects.equals(this.line2, createUserRequestAddress.line2) &&
        Objects.equals(this.line3, createUserRequestAddress.line3) &&
        Objects.equals(this.town, createUserRequestAddress.town) &&
        Objects.equals(this.county, createUserRequestAddress.county) &&
        Objects.equals(this.postcode, createUserRequestAddress.postcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line1, line2, line3, town, county, postcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRequestAddress {\n");
    
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
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


  public static CreateUserRequestAddressBuilder<?, ?> builder() {
    return new CreateUserRequestAddressBuilderImpl();
  }

  private static final class CreateUserRequestAddressBuilderImpl extends CreateUserRequestAddressBuilder<CreateUserRequestAddress, CreateUserRequestAddressBuilderImpl> {

    @Override
    protected CreateUserRequestAddressBuilderImpl self() {
      return this;
    }

    @Override
    public CreateUserRequestAddress build() {
      return new CreateUserRequestAddress(this);
    }
  }

  public static abstract class CreateUserRequestAddressBuilder<C extends CreateUserRequestAddress, B extends CreateUserRequestAddressBuilder<C, B>>  {
    private String line1;
    private String line2;
    private String line3;
    private String town;
    private String county;
    private String postcode;
    protected abstract B self();

    public abstract C build();

    public B line1(String line1) {
      this.line1 = line1;
      return self();
    }
    public B line2(String line2) {
      this.line2 = line2;
      return self();
    }
    public B line3(String line3) {
      this.line3 = line3;
      return self();
    }
    public B town(String town) {
      this.town = town;
      return self();
    }
    public B county(String county) {
      this.county = county;
      return self();
    }
    public B postcode(String postcode) {
      this.postcode = postcode;
      return self();
    }
  }
}

