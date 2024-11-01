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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * MAPDUSessionInformation
 */
@JsonPropertyOrder({
  MAPDUSessionInformation.JSON_PROPERTY_M_A_P_D_U_SESSION_INDICATOR,
  MAPDUSessionInformation.JSON_PROPERTY_A_T_S_S_S_CAPABILITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-24T14:40:31.217597300+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class MAPDUSessionInformation   {
  public static final String JSON_PROPERTY_M_A_P_D_U_SESSION_INDICATOR = "mAPDUSessionIndicator";
  @JsonProperty(JSON_PROPERTY_M_A_P_D_U_SESSION_INDICATOR)
  private MaPduIndication mAPDUSessionIndicator;

  public static final String JSON_PROPERTY_A_T_S_S_S_CAPABILITY = "aTSSSCapability";
  @JsonProperty(JSON_PROPERTY_A_T_S_S_S_CAPABILITY)
  private AtsssCapability aTSSSCapability;

  public MAPDUSessionInformation mAPDUSessionIndicator(MaPduIndication mAPDUSessionIndicator) {
    this.mAPDUSessionIndicator = mAPDUSessionIndicator;
    return this;
  }

  /**
   * Get mAPDUSessionIndicator
   * @return mAPDUSessionIndicator
   **/
  @JsonProperty(value = "mAPDUSessionIndicator")
  @ApiModelProperty(value = "")
  
  public MaPduIndication getmAPDUSessionIndicator() {
    return mAPDUSessionIndicator;
  }

  public void setmAPDUSessionIndicator(MaPduIndication mAPDUSessionIndicator) {
    this.mAPDUSessionIndicator = mAPDUSessionIndicator;
  }

  public MAPDUSessionInformation aTSSSCapability(AtsssCapability aTSSSCapability) {
    this.aTSSSCapability = aTSSSCapability;
    return this;
  }

  /**
   * Get aTSSSCapability
   * @return aTSSSCapability
   **/
  @JsonProperty(value = "aTSSSCapability")
  @ApiModelProperty(value = "")
  @Valid 
  public AtsssCapability getaTSSSCapability() {
    return aTSSSCapability;
  }

  public void setaTSSSCapability(AtsssCapability aTSSSCapability) {
    this.aTSSSCapability = aTSSSCapability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MAPDUSessionInformation maPDUSessionInformation = (MAPDUSessionInformation) o;
    return Objects.equals(this.mAPDUSessionIndicator, maPDUSessionInformation.mAPDUSessionIndicator) &&
        Objects.equals(this.aTSSSCapability, maPDUSessionInformation.aTSSSCapability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mAPDUSessionIndicator, aTSSSCapability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MAPDUSessionInformation {\n");
    
    sb.append("    mAPDUSessionIndicator: ").append(toIndentedString(mAPDUSessionIndicator)).append("\n");
    sb.append("    aTSSSCapability: ").append(toIndentedString(aTSSSCapability)).append("\n");
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
