/*
 * Nchf_ConvergedCharging
 * ConvergedCharging Service © 2020, 3GPP Organizational Partners (ARIB, ATIS, CCSA, ETSI, TSDSI, TTA, TTC). All rights reserved.
 *
 * The version of the OpenAPI document: 2.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.frojasg1.nchf5g.rel15.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Snssai
 */
@JsonPropertyOrder({
  Snssai.JSON_PROPERTY_SST,
  Snssai.JSON_PROPERTY_SD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-17T08:24:27.361349500+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class Snssai   {
  public static final String JSON_PROPERTY_SST = "sst";
  @JsonProperty(JSON_PROPERTY_SST)
  private Integer sst;

  public static final String JSON_PROPERTY_SD = "sd";
  @JsonProperty(JSON_PROPERTY_SD)
  private String sd;

  public Snssai sst(Integer sst) {
    this.sst = sst;
    return this;
  }

  /**
   * Get sst
   * minimum: 0
   * maximum: 255
   * @return sst
   **/
  @JsonProperty(value = "sst")
  @ApiModelProperty(required = true, value = "")
  @NotNull  @Min(0) @Max(255)
  public Integer getSst() {
    return sst;
  }

  public void setSst(Integer sst) {
    this.sst = sst;
  }

  public Snssai sd(String sd) {
    this.sd = sd;
    return this;
  }

  /**
   * Get sd
   * @return sd
   **/
  @JsonProperty(value = "sd")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^[A-Fa-f0-9]{6}$")
  public String getSd() {
    return sd;
  }

  public void setSd(String sd) {
    this.sd = sd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snssai snssai = (Snssai) o;
    return Objects.equals(this.sst, snssai.sst) &&
        Objects.equals(this.sd, snssai.sd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sst, sd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snssai {\n");
    
    sb.append("    sst: ").append(toIndentedString(sst)).append("\n");
    sb.append("    sd: ").append(toIndentedString(sd)).append("\n");
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

