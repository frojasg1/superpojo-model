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
 * PlmnIdNid
 */
@JsonPropertyOrder({
  PlmnIdNid.JSON_PROPERTY_MCC,
  PlmnIdNid.JSON_PROPERTY_MNC,
  PlmnIdNid.JSON_PROPERTY_NID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-24T14:40:31.217597300+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class PlmnIdNid   {
  public static final String JSON_PROPERTY_MCC = "mcc";
  @JsonProperty(JSON_PROPERTY_MCC)
  private String mcc;

  public static final String JSON_PROPERTY_MNC = "mnc";
  @JsonProperty(JSON_PROPERTY_MNC)
  private String mnc;

  public static final String JSON_PROPERTY_NID = "nid";
  @JsonProperty(JSON_PROPERTY_NID)
  private String nid;

  public PlmnIdNid mcc(String mcc) {
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

  public PlmnIdNid mnc(String mnc) {
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

  public PlmnIdNid nid(String nid) {
    this.nid = nid;
    return this;
  }

  /**
   * Get nid
   * @return nid
   **/
  @JsonProperty(value = "nid")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^[A-Fa-f0-9]{11}$")
  public String getNid() {
    return nid;
  }

  public void setNid(String nid) {
    this.nid = nid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlmnIdNid plmnIdNid = (PlmnIdNid) o;
    return Objects.equals(this.mcc, plmnIdNid.mcc) &&
        Objects.equals(this.mnc, plmnIdNid.mnc) &&
        Objects.equals(this.nid, plmnIdNid.nid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, mnc, nid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlmnIdNid {\n");
    
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    mnc: ").append(toIndentedString(mnc)).append("\n");
    sb.append("    nid: ").append(toIndentedString(nid)).append("\n");
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
