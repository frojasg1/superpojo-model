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
 * OriginatorInfo
 */
@JsonPropertyOrder({
  OriginatorInfo.JSON_PROPERTY_ORIGINATOR_S_U_P_I,
  OriginatorInfo.JSON_PROPERTY_ORIGINATOR_G_P_S_I,
  OriginatorInfo.JSON_PROPERTY_ORIGINATOR_OTHER_ADDRESS,
  OriginatorInfo.JSON_PROPERTY_ORIGINATOR_RECEIVED_ADDRESS,
  OriginatorInfo.JSON_PROPERTY_ORIGINATOR_S_C_C_P_ADDRESS,
  OriginatorInfo.JSON_PROPERTY_S_M_ORIGINATOR_INTERFACE,
  OriginatorInfo.JSON_PROPERTY_S_M_ORIGINATOR_PROTOCOL_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-24T14:40:31.217597300+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class OriginatorInfo   {
  public static final String JSON_PROPERTY_ORIGINATOR_S_U_P_I = "originatorSUPI";
  @JsonProperty(JSON_PROPERTY_ORIGINATOR_S_U_P_I)
  private String originatorSUPI;

  public static final String JSON_PROPERTY_ORIGINATOR_G_P_S_I = "originatorGPSI";
  @JsonProperty(JSON_PROPERTY_ORIGINATOR_G_P_S_I)
  private String originatorGPSI;

  public static final String JSON_PROPERTY_ORIGINATOR_OTHER_ADDRESS = "originatorOtherAddress";
  @JsonProperty(JSON_PROPERTY_ORIGINATOR_OTHER_ADDRESS)
  private SMAddressInfo originatorOtherAddress;

  public static final String JSON_PROPERTY_ORIGINATOR_RECEIVED_ADDRESS = "originatorReceivedAddress";
  @JsonProperty(JSON_PROPERTY_ORIGINATOR_RECEIVED_ADDRESS)
  private SMAddressInfo originatorReceivedAddress;

  public static final String JSON_PROPERTY_ORIGINATOR_S_C_C_P_ADDRESS = "originatorSCCPAddress";
  @JsonProperty(JSON_PROPERTY_ORIGINATOR_S_C_C_P_ADDRESS)
  private String originatorSCCPAddress;

  public static final String JSON_PROPERTY_S_M_ORIGINATOR_INTERFACE = "sMOriginatorInterface";
  @JsonProperty(JSON_PROPERTY_S_M_ORIGINATOR_INTERFACE)
  private SMInterface sMOriginatorInterface;

  public static final String JSON_PROPERTY_S_M_ORIGINATOR_PROTOCOL_ID = "sMOriginatorProtocolId";
  @JsonProperty(JSON_PROPERTY_S_M_ORIGINATOR_PROTOCOL_ID)
  private String sMOriginatorProtocolId;

  public OriginatorInfo originatorSUPI(String originatorSUPI) {
    this.originatorSUPI = originatorSUPI;
    return this;
  }

  /**
   * Get originatorSUPI
   * @return originatorSUPI
   **/
  @JsonProperty(value = "originatorSUPI")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^(imsi-[0-9]{5,15}|nai-.+|gci-.+|gli-.+|.+)$")
  public String getOriginatorSUPI() {
    return originatorSUPI;
  }

  public void setOriginatorSUPI(String originatorSUPI) {
    this.originatorSUPI = originatorSUPI;
  }

  public OriginatorInfo originatorGPSI(String originatorGPSI) {
    this.originatorGPSI = originatorGPSI;
    return this;
  }

  /**
   * Get originatorGPSI
   * @return originatorGPSI
   **/
  @JsonProperty(value = "originatorGPSI")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^(msisdn-[0-9]{5,15}|extid-[^@]+@[^@]+|.+)$")
  public String getOriginatorGPSI() {
    return originatorGPSI;
  }

  public void setOriginatorGPSI(String originatorGPSI) {
    this.originatorGPSI = originatorGPSI;
  }

  public OriginatorInfo originatorOtherAddress(SMAddressInfo originatorOtherAddress) {
    this.originatorOtherAddress = originatorOtherAddress;
    return this;
  }

  /**
   * Get originatorOtherAddress
   * @return originatorOtherAddress
   **/
  @JsonProperty(value = "originatorOtherAddress")
  @ApiModelProperty(value = "")
  @Valid 
  public SMAddressInfo getOriginatorOtherAddress() {
    return originatorOtherAddress;
  }

  public void setOriginatorOtherAddress(SMAddressInfo originatorOtherAddress) {
    this.originatorOtherAddress = originatorOtherAddress;
  }

  public OriginatorInfo originatorReceivedAddress(SMAddressInfo originatorReceivedAddress) {
    this.originatorReceivedAddress = originatorReceivedAddress;
    return this;
  }

  /**
   * Get originatorReceivedAddress
   * @return originatorReceivedAddress
   **/
  @JsonProperty(value = "originatorReceivedAddress")
  @ApiModelProperty(value = "")
  @Valid 
  public SMAddressInfo getOriginatorReceivedAddress() {
    return originatorReceivedAddress;
  }

  public void setOriginatorReceivedAddress(SMAddressInfo originatorReceivedAddress) {
    this.originatorReceivedAddress = originatorReceivedAddress;
  }

  public OriginatorInfo originatorSCCPAddress(String originatorSCCPAddress) {
    this.originatorSCCPAddress = originatorSCCPAddress;
    return this;
  }

  /**
   * Get originatorSCCPAddress
   * @return originatorSCCPAddress
   **/
  @JsonProperty(value = "originatorSCCPAddress")
  @ApiModelProperty(value = "")
  
  public String getOriginatorSCCPAddress() {
    return originatorSCCPAddress;
  }

  public void setOriginatorSCCPAddress(String originatorSCCPAddress) {
    this.originatorSCCPAddress = originatorSCCPAddress;
  }

  public OriginatorInfo sMOriginatorInterface(SMInterface sMOriginatorInterface) {
    this.sMOriginatorInterface = sMOriginatorInterface;
    return this;
  }

  /**
   * Get sMOriginatorInterface
   * @return sMOriginatorInterface
   **/
  @JsonProperty(value = "sMOriginatorInterface")
  @ApiModelProperty(value = "")
  @Valid 
  public SMInterface getsMOriginatorInterface() {
    return sMOriginatorInterface;
  }

  public void setsMOriginatorInterface(SMInterface sMOriginatorInterface) {
    this.sMOriginatorInterface = sMOriginatorInterface;
  }

  public OriginatorInfo sMOriginatorProtocolId(String sMOriginatorProtocolId) {
    this.sMOriginatorProtocolId = sMOriginatorProtocolId;
    return this;
  }

  /**
   * Get sMOriginatorProtocolId
   * @return sMOriginatorProtocolId
   **/
  @JsonProperty(value = "sMOriginatorProtocolId")
  @ApiModelProperty(value = "")
  
  public String getsMOriginatorProtocolId() {
    return sMOriginatorProtocolId;
  }

  public void setsMOriginatorProtocolId(String sMOriginatorProtocolId) {
    this.sMOriginatorProtocolId = sMOriginatorProtocolId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginatorInfo originatorInfo = (OriginatorInfo) o;
    return Objects.equals(this.originatorSUPI, originatorInfo.originatorSUPI) &&
        Objects.equals(this.originatorGPSI, originatorInfo.originatorGPSI) &&
        Objects.equals(this.originatorOtherAddress, originatorInfo.originatorOtherAddress) &&
        Objects.equals(this.originatorReceivedAddress, originatorInfo.originatorReceivedAddress) &&
        Objects.equals(this.originatorSCCPAddress, originatorInfo.originatorSCCPAddress) &&
        Objects.equals(this.sMOriginatorInterface, originatorInfo.sMOriginatorInterface) &&
        Objects.equals(this.sMOriginatorProtocolId, originatorInfo.sMOriginatorProtocolId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originatorSUPI, originatorGPSI, originatorOtherAddress, originatorReceivedAddress, originatorSCCPAddress, sMOriginatorInterface, sMOriginatorProtocolId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginatorInfo {\n");
    
    sb.append("    originatorSUPI: ").append(toIndentedString(originatorSUPI)).append("\n");
    sb.append("    originatorGPSI: ").append(toIndentedString(originatorGPSI)).append("\n");
    sb.append("    originatorOtherAddress: ").append(toIndentedString(originatorOtherAddress)).append("\n");
    sb.append("    originatorReceivedAddress: ").append(toIndentedString(originatorReceivedAddress)).append("\n");
    sb.append("    originatorSCCPAddress: ").append(toIndentedString(originatorSCCPAddress)).append("\n");
    sb.append("    sMOriginatorInterface: ").append(toIndentedString(sMOriginatorInterface)).append("\n");
    sb.append("    sMOriginatorProtocolId: ").append(toIndentedString(sMOriginatorProtocolId)).append("\n");
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

