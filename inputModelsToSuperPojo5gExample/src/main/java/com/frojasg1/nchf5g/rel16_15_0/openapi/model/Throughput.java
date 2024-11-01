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
 * Throughput
 */
@JsonPropertyOrder({
  Throughput.JSON_PROPERTY_GUARANTEED_THPT,
  Throughput.JSON_PROPERTY_MAXIMUM_THPT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-24T14:40:31.217597300+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class Throughput   {
  public static final String JSON_PROPERTY_GUARANTEED_THPT = "guaranteedThpt";
  @JsonProperty(JSON_PROPERTY_GUARANTEED_THPT)
  private Float guaranteedThpt;

  public static final String JSON_PROPERTY_MAXIMUM_THPT = "maximumThpt";
  @JsonProperty(JSON_PROPERTY_MAXIMUM_THPT)
  private Float maximumThpt;

  public Throughput guaranteedThpt(Float guaranteedThpt) {
    this.guaranteedThpt = guaranteedThpt;
    return this;
  }

  /**
   * Get guaranteedThpt
   * @return guaranteedThpt
   **/
  @JsonProperty(value = "guaranteedThpt")
  @ApiModelProperty(value = "")
  
  public Float getGuaranteedThpt() {
    return guaranteedThpt;
  }

  public void setGuaranteedThpt(Float guaranteedThpt) {
    this.guaranteedThpt = guaranteedThpt;
  }

  public Throughput maximumThpt(Float maximumThpt) {
    this.maximumThpt = maximumThpt;
    return this;
  }

  /**
   * Get maximumThpt
   * @return maximumThpt
   **/
  @JsonProperty(value = "maximumThpt")
  @ApiModelProperty(value = "")
  
  public Float getMaximumThpt() {
    return maximumThpt;
  }

  public void setMaximumThpt(Float maximumThpt) {
    this.maximumThpt = maximumThpt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Throughput throughput = (Throughput) o;
    return Objects.equals(this.guaranteedThpt, throughput.guaranteedThpt) &&
        Objects.equals(this.maximumThpt, throughput.maximumThpt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guaranteedThpt, maximumThpt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Throughput {\n");
    
    sb.append("    guaranteedThpt: ").append(toIndentedString(guaranteedThpt)).append("\n");
    sb.append("    maximumThpt: ").append(toIndentedString(maximumThpt)).append("\n");
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
