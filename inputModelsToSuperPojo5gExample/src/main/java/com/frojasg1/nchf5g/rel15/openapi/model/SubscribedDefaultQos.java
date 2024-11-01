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
 * SubscribedDefaultQos
 */
@JsonPropertyOrder({
  SubscribedDefaultQos.JSON_PROPERTY_5QI,
  SubscribedDefaultQos.JSON_PROPERTY_ARP,
  SubscribedDefaultQos.JSON_PROPERTY_PRIORITY_LEVEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-17T08:24:27.361349500+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class SubscribedDefaultQos   {
  public static final String JSON_PROPERTY_5QI = "5qi";
  @JsonProperty(JSON_PROPERTY_5QI)
  private Integer _5qi;

  public static final String JSON_PROPERTY_ARP = "arp";
  @JsonProperty(JSON_PROPERTY_ARP)
  private Arp arp;

  public static final String JSON_PROPERTY_PRIORITY_LEVEL = "priorityLevel";
  @JsonProperty(JSON_PROPERTY_PRIORITY_LEVEL)
  private Integer priorityLevel;

  public SubscribedDefaultQos _5qi(Integer _5qi) {
    this._5qi = _5qi;
    return this;
  }

  /**
   * Get _5qi
   * minimum: 0
   * maximum: 255
   * @return _5qi
   **/
  @JsonProperty(value = "5qi")
  @ApiModelProperty(required = true, value = "")
  @NotNull  @Min(0) @Max(255)
  public Integer get5qi() {
    return _5qi;
  }

  public void set5qi(Integer _5qi) {
    this._5qi = _5qi;
  }

  public SubscribedDefaultQos arp(Arp arp) {
    this.arp = arp;
    return this;
  }

  /**
   * Get arp
   * @return arp
   **/
  @JsonProperty(value = "arp")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public Arp getArp() {
    return arp;
  }

  public void setArp(Arp arp) {
    this.arp = arp;
  }

  public SubscribedDefaultQos priorityLevel(Integer priorityLevel) {
    this.priorityLevel = priorityLevel;
    return this;
  }

  /**
   * Get priorityLevel
   * minimum: 1
   * maximum: 127
   * @return priorityLevel
   **/
  @JsonProperty(value = "priorityLevel")
  @ApiModelProperty(value = "")
   @Min(1) @Max(127)
  public Integer getPriorityLevel() {
    return priorityLevel;
  }

  public void setPriorityLevel(Integer priorityLevel) {
    this.priorityLevel = priorityLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscribedDefaultQos subscribedDefaultQos = (SubscribedDefaultQos) o;
    return Objects.equals(this._5qi, subscribedDefaultQos._5qi) &&
        Objects.equals(this.arp, subscribedDefaultQos.arp) &&
        Objects.equals(this.priorityLevel, subscribedDefaultQos.priorityLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_5qi, arp, priorityLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribedDefaultQos {\n");
    
    sb.append("    _5qi: ").append(toIndentedString(_5qi)).append("\n");
    sb.append("    arp: ").append(toIndentedString(arp)).append("\n");
    sb.append("    priorityLevel: ").append(toIndentedString(priorityLevel)).append("\n");
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

