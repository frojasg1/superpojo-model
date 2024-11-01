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
 * AuthorizedDefaultQos
 */
@JsonPropertyOrder({
  AuthorizedDefaultQos.JSON_PROPERTY_5QI,
  AuthorizedDefaultQos.JSON_PROPERTY_ARP,
  AuthorizedDefaultQos.JSON_PROPERTY_PRIORITY_LEVEL,
  AuthorizedDefaultQos.JSON_PROPERTY_AVER_WINDOW,
  AuthorizedDefaultQos.JSON_PROPERTY_MAX_DATA_BURST_VOL,
  AuthorizedDefaultQos.JSON_PROPERTY_MAXBR_UL,
  AuthorizedDefaultQos.JSON_PROPERTY_MAXBR_DL,
  AuthorizedDefaultQos.JSON_PROPERTY_GBR_UL,
  AuthorizedDefaultQos.JSON_PROPERTY_GBR_DL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-17T08:24:27.361349500+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class AuthorizedDefaultQos   {
  public static final String JSON_PROPERTY_5QI = "5qi";
  @JsonProperty(JSON_PROPERTY_5QI)
  private Integer _5qi;

  public static final String JSON_PROPERTY_ARP = "arp";
  @JsonProperty(JSON_PROPERTY_ARP)
  private Arp arp;

  public static final String JSON_PROPERTY_PRIORITY_LEVEL = "priorityLevel";
  @JsonProperty(JSON_PROPERTY_PRIORITY_LEVEL)
  private Integer priorityLevel;

  public static final String JSON_PROPERTY_AVER_WINDOW = "averWindow";
  @JsonProperty(JSON_PROPERTY_AVER_WINDOW)
  private Integer averWindow = 2000;

  public static final String JSON_PROPERTY_MAX_DATA_BURST_VOL = "maxDataBurstVol";
  @JsonProperty(JSON_PROPERTY_MAX_DATA_BURST_VOL)
  private Integer maxDataBurstVol;

  public static final String JSON_PROPERTY_MAXBR_UL = "maxbrUl";
  @JsonProperty(JSON_PROPERTY_MAXBR_UL)
  private String maxbrUl;

  public static final String JSON_PROPERTY_MAXBR_DL = "maxbrDl";
  @JsonProperty(JSON_PROPERTY_MAXBR_DL)
  private String maxbrDl;

  public static final String JSON_PROPERTY_GBR_UL = "gbrUl";
  @JsonProperty(JSON_PROPERTY_GBR_UL)
  private String gbrUl;

  public static final String JSON_PROPERTY_GBR_DL = "gbrDl";
  @JsonProperty(JSON_PROPERTY_GBR_DL)
  private String gbrDl;

  public AuthorizedDefaultQos _5qi(Integer _5qi) {
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
  @ApiModelProperty(value = "")
   @Min(0) @Max(255)
  public Integer get5qi() {
    return _5qi;
  }

  public void set5qi(Integer _5qi) {
    this._5qi = _5qi;
  }

  public AuthorizedDefaultQos arp(Arp arp) {
    this.arp = arp;
    return this;
  }

  /**
   * Get arp
   * @return arp
   **/
  @JsonProperty(value = "arp")
  @ApiModelProperty(value = "")
  @Valid 
  public Arp getArp() {
    return arp;
  }

  public void setArp(Arp arp) {
    this.arp = arp;
  }

  public AuthorizedDefaultQos priorityLevel(Integer priorityLevel) {
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

  public AuthorizedDefaultQos averWindow(Integer averWindow) {
    this.averWindow = averWindow;
    return this;
  }

  /**
   * Get averWindow
   * minimum: 1
   * maximum: 4095
   * @return averWindow
   **/
  @JsonProperty(value = "averWindow")
  @ApiModelProperty(value = "")
   @Min(1) @Max(4095)
  public Integer getAverWindow() {
    return averWindow;
  }

  public void setAverWindow(Integer averWindow) {
    this.averWindow = averWindow;
  }

  public AuthorizedDefaultQos maxDataBurstVol(Integer maxDataBurstVol) {
    this.maxDataBurstVol = maxDataBurstVol;
    return this;
  }

  /**
   * Get maxDataBurstVol
   * minimum: 1
   * maximum: 4095
   * @return maxDataBurstVol
   **/
  @JsonProperty(value = "maxDataBurstVol")
  @ApiModelProperty(value = "")
   @Min(1) @Max(4095)
  public Integer getMaxDataBurstVol() {
    return maxDataBurstVol;
  }

  public void setMaxDataBurstVol(Integer maxDataBurstVol) {
    this.maxDataBurstVol = maxDataBurstVol;
  }

  public AuthorizedDefaultQos maxbrUl(String maxbrUl) {
    this.maxbrUl = maxbrUl;
    return this;
  }

  /**
   * Get maxbrUl
   * @return maxbrUl
   **/
  @JsonProperty(value = "maxbrUl")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$")
  public String getMaxbrUl() {
    return maxbrUl;
  }

  public void setMaxbrUl(String maxbrUl) {
    this.maxbrUl = maxbrUl;
  }

  public AuthorizedDefaultQos maxbrDl(String maxbrDl) {
    this.maxbrDl = maxbrDl;
    return this;
  }

  /**
   * Get maxbrDl
   * @return maxbrDl
   **/
  @JsonProperty(value = "maxbrDl")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$")
  public String getMaxbrDl() {
    return maxbrDl;
  }

  public void setMaxbrDl(String maxbrDl) {
    this.maxbrDl = maxbrDl;
  }

  public AuthorizedDefaultQos gbrUl(String gbrUl) {
    this.gbrUl = gbrUl;
    return this;
  }

  /**
   * Get gbrUl
   * @return gbrUl
   **/
  @JsonProperty(value = "gbrUl")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$")
  public String getGbrUl() {
    return gbrUl;
  }

  public void setGbrUl(String gbrUl) {
    this.gbrUl = gbrUl;
  }

  public AuthorizedDefaultQos gbrDl(String gbrDl) {
    this.gbrDl = gbrDl;
    return this;
  }

  /**
   * Get gbrDl
   * @return gbrDl
   **/
  @JsonProperty(value = "gbrDl")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^\\d+(\\.\\d+)? (bps|Kbps|Mbps|Gbps|Tbps)$")
  public String getGbrDl() {
    return gbrDl;
  }

  public void setGbrDl(String gbrDl) {
    this.gbrDl = gbrDl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizedDefaultQos authorizedDefaultQos = (AuthorizedDefaultQos) o;
    return Objects.equals(this._5qi, authorizedDefaultQos._5qi) &&
        Objects.equals(this.arp, authorizedDefaultQos.arp) &&
        Objects.equals(this.priorityLevel, authorizedDefaultQos.priorityLevel) &&
        Objects.equals(this.averWindow, authorizedDefaultQos.averWindow) &&
        Objects.equals(this.maxDataBurstVol, authorizedDefaultQos.maxDataBurstVol) &&
        Objects.equals(this.maxbrUl, authorizedDefaultQos.maxbrUl) &&
        Objects.equals(this.maxbrDl, authorizedDefaultQos.maxbrDl) &&
        Objects.equals(this.gbrUl, authorizedDefaultQos.gbrUl) &&
        Objects.equals(this.gbrDl, authorizedDefaultQos.gbrDl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_5qi, arp, priorityLevel, averWindow, maxDataBurstVol, maxbrUl, maxbrDl, gbrUl, gbrDl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizedDefaultQos {\n");
    
    sb.append("    _5qi: ").append(toIndentedString(_5qi)).append("\n");
    sb.append("    arp: ").append(toIndentedString(arp)).append("\n");
    sb.append("    priorityLevel: ").append(toIndentedString(priorityLevel)).append("\n");
    sb.append("    averWindow: ").append(toIndentedString(averWindow)).append("\n");
    sb.append("    maxDataBurstVol: ").append(toIndentedString(maxDataBurstVol)).append("\n");
    sb.append("    maxbrUl: ").append(toIndentedString(maxbrUl)).append("\n");
    sb.append("    maxbrDl: ").append(toIndentedString(maxbrDl)).append("\n");
    sb.append("    gbrUl: ").append(toIndentedString(gbrUl)).append("\n");
    sb.append("    gbrDl: ").append(toIndentedString(gbrDl)).append("\n");
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

