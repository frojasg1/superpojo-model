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
 * PlmnId
 */
@JsonPropertyOrder({
  PlmnId.JSON_PROPERTY_MCC,
  PlmnId.JSON_PROPERTY_MNC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-17T08:24:27.361349500+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class PlmnId   {
  public static final String JSON_PROPERTY_MCC = "mcc";
  @JsonProperty(JSON_PROPERTY_MCC)
  private String mcc;

  public static final String JSON_PROPERTY_MNC = "mnc";
  @JsonProperty(JSON_PROPERTY_MNC)
  private String mnc;

  public PlmnId mcc(String mcc) {
    this.mcc = mcc;
    return this;
  }

  /**
   * Get mcc
   * @return mcc
   **/
  @JsonProperty(value = "mcc")
  @ApiModelProperty(required = true, value = "")
  @NotNull  @Pattern(regexp="^\\d{3}$")
  public String getMcc() {
    return mcc;
  }

  public void setMcc(String mcc) {
    this.mcc = mcc;
  }

  public PlmnId mnc(String mnc) {
    this.mnc = mnc;
    return this;
  }

  /**
   * Get mnc
   * @return mnc
   **/
  @JsonProperty(value = "mnc")
  @ApiModelProperty(required = true, value = "")
  @NotNull  @Pattern(regexp="^\\d{2,3}$")
  public String getMnc() {
    return mnc;
  }

  public void setMnc(String mnc) {
    this.mnc = mnc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlmnId plmnId = (PlmnId) o;
    return Objects.equals(this.mcc, plmnId.mcc) &&
        Objects.equals(this.mnc, plmnId.mnc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, mnc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlmnId {\n");
    
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    mnc: ").append(toIndentedString(mnc)).append("\n");
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

