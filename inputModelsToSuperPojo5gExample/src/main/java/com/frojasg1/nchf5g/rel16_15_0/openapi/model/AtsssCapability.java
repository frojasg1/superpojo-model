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
 * AtsssCapability
 */
@JsonPropertyOrder({
  AtsssCapability.JSON_PROPERTY_ATSSS_L_L,
  AtsssCapability.JSON_PROPERTY_MPTCP,
  AtsssCapability.JSON_PROPERTY_RTT_WITHOUT_PMF
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-24T14:40:31.217597300+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class AtsssCapability   {
  public static final String JSON_PROPERTY_ATSSS_L_L = "atsssLL";
  @JsonProperty(JSON_PROPERTY_ATSSS_L_L)
  private Boolean atsssLL = false;

  public static final String JSON_PROPERTY_MPTCP = "mptcp";
  @JsonProperty(JSON_PROPERTY_MPTCP)
  private Boolean mptcp = false;

  public static final String JSON_PROPERTY_RTT_WITHOUT_PMF = "rttWithoutPmf";
  @JsonProperty(JSON_PROPERTY_RTT_WITHOUT_PMF)
  private Boolean rttWithoutPmf = false;

  public AtsssCapability atsssLL(Boolean atsssLL) {
    this.atsssLL = atsssLL;
    return this;
  }

  /**
   * Get atsssLL
   * @return atsssLL
   **/
  @JsonProperty(value = "atsssLL")
  @ApiModelProperty(value = "")
  
  public Boolean getAtsssLL() {
    return atsssLL;
  }

  public void setAtsssLL(Boolean atsssLL) {
    this.atsssLL = atsssLL;
  }

  public AtsssCapability mptcp(Boolean mptcp) {
    this.mptcp = mptcp;
    return this;
  }

  /**
   * Get mptcp
   * @return mptcp
   **/
  @JsonProperty(value = "mptcp")
  @ApiModelProperty(value = "")
  
  public Boolean getMptcp() {
    return mptcp;
  }

  public void setMptcp(Boolean mptcp) {
    this.mptcp = mptcp;
  }

  public AtsssCapability rttWithoutPmf(Boolean rttWithoutPmf) {
    this.rttWithoutPmf = rttWithoutPmf;
    return this;
  }

  /**
   * Get rttWithoutPmf
   * @return rttWithoutPmf
   **/
  @JsonProperty(value = "rttWithoutPmf")
  @ApiModelProperty(value = "")
  
  public Boolean getRttWithoutPmf() {
    return rttWithoutPmf;
  }

  public void setRttWithoutPmf(Boolean rttWithoutPmf) {
    this.rttWithoutPmf = rttWithoutPmf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtsssCapability atsssCapability = (AtsssCapability) o;
    return Objects.equals(this.atsssLL, atsssCapability.atsssLL) &&
        Objects.equals(this.mptcp, atsssCapability.mptcp) &&
        Objects.equals(this.rttWithoutPmf, atsssCapability.rttWithoutPmf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atsssLL, mptcp, rttWithoutPmf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtsssCapability {\n");
    
    sb.append("    atsssLL: ").append(toIndentedString(atsssLL)).append("\n");
    sb.append("    mptcp: ").append(toIndentedString(mptcp)).append("\n");
    sb.append("    rttWithoutPmf: ").append(toIndentedString(rttWithoutPmf)).append("\n");
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

