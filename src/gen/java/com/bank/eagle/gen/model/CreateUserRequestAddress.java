package com.bank.eagle.gen.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import io.swagger.annotations.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2025-11-03T11:08:10.131371Z[Europe/London]", comments = "Generator version: 7.17.0")
public class CreateUserRequestAddress   {
  
  private String line1;
  private String line2;
  private String line3;
  private String town;
  private String county;
  private String postcode;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("line1")
  @NotNull
  public String getLine1() {
    return line1;
  }
  public void setLine1(String line1) {
    this.line1 = line1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("line2")
  public String getLine2() {
    return line2;
  }
  public void setLine2(String line2) {
    this.line2 = line2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("line3")
  public String getLine3() {
    return line3;
  }
  public void setLine3(String line3) {
    this.line3 = line3;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("town")
  @NotNull
  public String getTown() {
    return town;
  }
  public void setTown(String town) {
    this.town = town;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("county")
  @NotNull
  public String getCounty() {
    return county;
  }
  public void setCounty(String county) {
    this.county = county;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("postcode")
  @NotNull
  public String getPostcode() {
    return postcode;
  }
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
}

