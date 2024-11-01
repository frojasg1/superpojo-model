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
 * SMInterface
 */
@JsonPropertyOrder({
  SMInterface.JSON_PROPERTY_INTERFACE_ID,
  SMInterface.JSON_PROPERTY_INTERFACE_TEXT,
  SMInterface.JSON_PROPERTY_INTERFACE_PORT,
  SMInterface.JSON_PROPERTY_INTERFACE_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-24T14:40:31.217597300+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class SMInterface   {
  public static final String JSON_PROPERTY_INTERFACE_ID = "interfaceId";
  @JsonProperty(JSON_PROPERTY_INTERFACE_ID)
  private String interfaceId;

  public static final String JSON_PROPERTY_INTERFACE_TEXT = "interfaceText";
  @JsonProperty(JSON_PROPERTY_INTERFACE_TEXT)
  private String interfaceText;

  public static final String JSON_PROPERTY_INTERFACE_PORT = "interfacePort";
  @JsonProperty(JSON_PROPERTY_INTERFACE_PORT)
  private String interfacePort;

  public static final String JSON_PROPERTY_INTERFACE_TYPE = "interfaceType";
  @JsonProperty(JSON_PROPERTY_INTERFACE_TYPE)
  private InterfaceType interfaceType;

  public SMInterface interfaceId(String interfaceId) {
    this.interfaceId = interfaceId;
    return this;
  }

  /**
   * Get interfaceId
   * @return interfaceId
   **/
  @JsonProperty(value = "interfaceId")
  @ApiModelProperty(value = "")
  
  public String getInterfaceId() {
    return interfaceId;
  }

  public void setInterfaceId(String interfaceId) {
    this.interfaceId = interfaceId;
  }

  public SMInterface interfaceText(String interfaceText) {
    this.interfaceText = interfaceText;
    return this;
  }

  /**
   * Get interfaceText
   * @return interfaceText
   **/
  @JsonProperty(value = "interfaceText")
  @ApiModelProperty(value = "")
  
  public String getInterfaceText() {
    return interfaceText;
  }

  public void setInterfaceText(String interfaceText) {
    this.interfaceText = interfaceText;
  }

  public SMInterface interfacePort(String interfacePort) {
    this.interfacePort = interfacePort;
    return this;
  }

  /**
   * Get interfacePort
   * @return interfacePort
   **/
  @JsonProperty(value = "interfacePort")
  @ApiModelProperty(value = "")
  
  public String getInterfacePort() {
    return interfacePort;
  }

  public void setInterfacePort(String interfacePort) {
    this.interfacePort = interfacePort;
  }

  public SMInterface interfaceType(InterfaceType interfaceType) {
    this.interfaceType = interfaceType;
    return this;
  }

  /**
   * Get interfaceType
   * @return interfaceType
   **/
  @JsonProperty(value = "interfaceType")
  @ApiModelProperty(value = "")
  
  public InterfaceType getInterfaceType() {
    return interfaceType;
  }

  public void setInterfaceType(InterfaceType interfaceType) {
    this.interfaceType = interfaceType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMInterface smInterface = (SMInterface) o;
    return Objects.equals(this.interfaceId, smInterface.interfaceId) &&
        Objects.equals(this.interfaceText, smInterface.interfaceText) &&
        Objects.equals(this.interfacePort, smInterface.interfacePort) &&
        Objects.equals(this.interfaceType, smInterface.interfaceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceId, interfaceText, interfacePort, interfaceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMInterface {\n");
    
    sb.append("    interfaceId: ").append(toIndentedString(interfaceId)).append("\n");
    sb.append("    interfaceText: ").append(toIndentedString(interfaceText)).append("\n");
    sb.append("    interfacePort: ").append(toIndentedString(interfacePort)).append("\n");
    sb.append("    interfaceType: ").append(toIndentedString(interfaceType)).append("\n");
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
