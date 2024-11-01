/*
 * Nchf_ConvergedCharging
 * ConvergedCharging Service    © 2023, 3GPP Organizational Partners (ARIB, ATIS, CCSA, ETSI, TSDSI, TTA, TTC). All rights reserved. 
 *
 * The version of the OpenAPI document: 3.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.frojasg1.nchf5g.rel16_15_0.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * GNbId
 */
@JsonPropertyOrder({
  GNbId.JSON_PROPERTY_BIT_LENGTH,
  GNbId.JSON_PROPERTY_G_N_B_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-24T14:40:31.217597300+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class GNbId   {
  public static final String JSON_PROPERTY_BIT_LENGTH = "bitLength";
  @JsonProperty(JSON_PROPERTY_BIT_LENGTH)
  private Integer bitLength;

  public static final String JSON_PROPERTY_G_N_B_VALUE = "gNBValue";
  @JsonProperty(JSON_PROPERTY_G_N_B_VALUE)
  private String gNBValue;

  public GNbId bitLength(Integer bitLength) {
    this.bitLength = bitLength;
    return this;
  }

  /**
   * Get bitLength
   * minimum: 22
   * maximum: 32
   * @return bitLength
   **/
  @JsonProperty(value = "bitLength")
  @ApiModelProperty(required = true, value = "")
  @NotNull  @Min(22) @Max(32)
  public Integer getBitLength() {
    return bitLength;
  }

  public void setBitLength(Integer bitLength) {
    this.bitLength = bitLength;
  }

  public GNbId gNBValue(String gNBValue) {
    this.gNBValue = gNBValue;
    return this;
  }

  /**
   * Get gNBValue
   * @return gNBValue
   **/
  @JsonProperty(value = "gNBValue")
  @ApiModelProperty(required = true, value = "")
  @NotNull  @Pattern(regexp="^[A-Fa-f0-9]{6,8}$")
  public String getgNBValue() {
    return gNBValue;
  }

  public void setgNBValue(String gNBValue) {
    this.gNBValue = gNBValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GNbId gnbId = (GNbId) o;
    return Objects.equals(this.bitLength, gnbId.bitLength) &&
        Objects.equals(this.gNBValue, gnbId.gNBValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitLength, gNBValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GNbId {\n");
    
    sb.append("    bitLength: ").append(toIndentedString(bitLength)).append("\n");
    sb.append("    gNBValue: ").append(toIndentedString(gNBValue)).append("\n");
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

