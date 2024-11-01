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
 * QosData
 */
@JsonPropertyOrder({
  QosData.JSON_PROPERTY_QOS_ID,
  QosData.JSON_PROPERTY_5QI,
  QosData.JSON_PROPERTY_MAXBR_UL,
  QosData.JSON_PROPERTY_MAXBR_DL,
  QosData.JSON_PROPERTY_GBR_UL,
  QosData.JSON_PROPERTY_GBR_DL,
  QosData.JSON_PROPERTY_ARP,
  QosData.JSON_PROPERTY_QNC,
  QosData.JSON_PROPERTY_PRIORITY_LEVEL,
  QosData.JSON_PROPERTY_AVER_WINDOW,
  QosData.JSON_PROPERTY_MAX_DATA_BURST_VOL,
  QosData.JSON_PROPERTY_REFLECTIVE_QOS,
  QosData.JSON_PROPERTY_SHARING_KEY_DL,
  QosData.JSON_PROPERTY_SHARING_KEY_UL,
  QosData.JSON_PROPERTY_MAX_PACKET_LOSS_RATE_DL,
  QosData.JSON_PROPERTY_MAX_PACKET_LOSS_RATE_UL,
  QosData.JSON_PROPERTY_DEF_QOS_FLOW_INDICATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-17T08:24:27.361349500+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class QosData   {
  public static final String JSON_PROPERTY_QOS_ID = "qosId";
  @JsonProperty(JSON_PROPERTY_QOS_ID)
  private String qosId;

  public static final String JSON_PROPERTY_5QI = "5qi";
  @JsonProperty(JSON_PROPERTY_5QI)
  private Integer _5qi;

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

  public static final String JSON_PROPERTY_ARP = "arp";
  @JsonProperty(JSON_PROPERTY_ARP)
  private Arp arp;

  public static final String JSON_PROPERTY_QNC = "qnc";
  @JsonProperty(JSON_PROPERTY_QNC)
  private Boolean qnc;

  public static final String JSON_PROPERTY_PRIORITY_LEVEL = "priorityLevel";
  @JsonProperty(JSON_PROPERTY_PRIORITY_LEVEL)
  private Integer priorityLevel;

  public static final String JSON_PROPERTY_AVER_WINDOW = "averWindow";
  @JsonProperty(JSON_PROPERTY_AVER_WINDOW)
  private Integer averWindow = 2000;

  public static final String JSON_PROPERTY_MAX_DATA_BURST_VOL = "maxDataBurstVol";
  @JsonProperty(JSON_PROPERTY_MAX_DATA_BURST_VOL)
  private Integer maxDataBurstVol;

  public static final String JSON_PROPERTY_REFLECTIVE_QOS = "reflectiveQos";
  @JsonProperty(JSON_PROPERTY_REFLECTIVE_QOS)
  private Boolean reflectiveQos;

  public static final String JSON_PROPERTY_SHARING_KEY_DL = "sharingKeyDl";
  @JsonProperty(JSON_PROPERTY_SHARING_KEY_DL)
  private String sharingKeyDl;

  public static final String JSON_PROPERTY_SHARING_KEY_UL = "sharingKeyUl";
  @JsonProperty(JSON_PROPERTY_SHARING_KEY_UL)
  private String sharingKeyUl;

  public static final String JSON_PROPERTY_MAX_PACKET_LOSS_RATE_DL = "maxPacketLossRateDl";
  @JsonProperty(JSON_PROPERTY_MAX_PACKET_LOSS_RATE_DL)
  private Integer maxPacketLossRateDl;

  public static final String JSON_PROPERTY_MAX_PACKET_LOSS_RATE_UL = "maxPacketLossRateUl";
  @JsonProperty(JSON_PROPERTY_MAX_PACKET_LOSS_RATE_UL)
  private Integer maxPacketLossRateUl;

  public static final String JSON_PROPERTY_DEF_QOS_FLOW_INDICATION = "defQosFlowIndication";
  @JsonProperty(JSON_PROPERTY_DEF_QOS_FLOW_INDICATION)
  private Boolean defQosFlowIndication;

  public QosData qosId(String qosId) {
    this.qosId = qosId;
    return this;
  }

  /**
   * Univocally identifies the QoS control policy data within a PDU session.
   * @return qosId
   **/
  @JsonProperty(value = "qosId")
  @ApiModelProperty(required = true, value = "Univocally identifies the QoS control policy data within a PDU session.")
  @NotNull 
  public String getQosId() {
    return qosId;
  }

  public void setQosId(String qosId) {
    this.qosId = qosId;
  }

  public QosData _5qi(Integer _5qi) {
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

  public QosData maxbrUl(String maxbrUl) {
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

  public QosData maxbrDl(String maxbrDl) {
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

  public QosData gbrUl(String gbrUl) {
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

  public QosData gbrDl(String gbrDl) {
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

  public QosData arp(Arp arp) {
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

  public QosData qnc(Boolean qnc) {
    this.qnc = qnc;
    return this;
  }

  /**
   * Indicates whether notifications are requested from 3GPP NG-RAN when the GFBR can no longer (or again) be guaranteed for a QoS Flow during the lifetime of the QoS Flow.
   * @return qnc
   **/
  @JsonProperty(value = "qnc")
  @ApiModelProperty(value = "Indicates whether notifications are requested from 3GPP NG-RAN when the GFBR can no longer (or again) be guaranteed for a QoS Flow during the lifetime of the QoS Flow.")
  
  public Boolean getQnc() {
    return qnc;
  }

  public void setQnc(Boolean qnc) {
    this.qnc = qnc;
  }

  public QosData priorityLevel(Integer priorityLevel) {
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

  public QosData averWindow(Integer averWindow) {
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

  public QosData maxDataBurstVol(Integer maxDataBurstVol) {
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

  public QosData reflectiveQos(Boolean reflectiveQos) {
    this.reflectiveQos = reflectiveQos;
    return this;
  }

  /**
   * Indicates whether the QoS information is reflective for the corresponding service data flow.
   * @return reflectiveQos
   **/
  @JsonProperty(value = "reflectiveQos")
  @ApiModelProperty(value = "Indicates whether the QoS information is reflective for the corresponding service data flow.")
  
  public Boolean getReflectiveQos() {
    return reflectiveQos;
  }

  public void setReflectiveQos(Boolean reflectiveQos) {
    this.reflectiveQos = reflectiveQos;
  }

  public QosData sharingKeyDl(String sharingKeyDl) {
    this.sharingKeyDl = sharingKeyDl;
    return this;
  }

  /**
   * Indicates, by containing the same value, what PCC rules may share resource in downlink direction.
   * @return sharingKeyDl
   **/
  @JsonProperty(value = "sharingKeyDl")
  @ApiModelProperty(value = "Indicates, by containing the same value, what PCC rules may share resource in downlink direction.")
  
  public String getSharingKeyDl() {
    return sharingKeyDl;
  }

  public void setSharingKeyDl(String sharingKeyDl) {
    this.sharingKeyDl = sharingKeyDl;
  }

  public QosData sharingKeyUl(String sharingKeyUl) {
    this.sharingKeyUl = sharingKeyUl;
    return this;
  }

  /**
   * Indicates, by containing the same value, what PCC rules may share resource in uplink direction.
   * @return sharingKeyUl
   **/
  @JsonProperty(value = "sharingKeyUl")
  @ApiModelProperty(value = "Indicates, by containing the same value, what PCC rules may share resource in uplink direction.")
  
  public String getSharingKeyUl() {
    return sharingKeyUl;
  }

  public void setSharingKeyUl(String sharingKeyUl) {
    this.sharingKeyUl = sharingKeyUl;
  }

  public QosData maxPacketLossRateDl(Integer maxPacketLossRateDl) {
    this.maxPacketLossRateDl = maxPacketLossRateDl;
    return this;
  }

  /**
   * Get maxPacketLossRateDl
   * minimum: 0
   * maximum: 1000
   * @return maxPacketLossRateDl
   **/
  @JsonProperty(value = "maxPacketLossRateDl")
  @ApiModelProperty(value = "")
   @Min(0) @Max(1000)
  public Integer getMaxPacketLossRateDl() {
    return maxPacketLossRateDl;
  }

  public void setMaxPacketLossRateDl(Integer maxPacketLossRateDl) {
    this.maxPacketLossRateDl = maxPacketLossRateDl;
  }

  public QosData maxPacketLossRateUl(Integer maxPacketLossRateUl) {
    this.maxPacketLossRateUl = maxPacketLossRateUl;
    return this;
  }

  /**
   * Get maxPacketLossRateUl
   * minimum: 0
   * maximum: 1000
   * @return maxPacketLossRateUl
   **/
  @JsonProperty(value = "maxPacketLossRateUl")
  @ApiModelProperty(value = "")
   @Min(0) @Max(1000)
  public Integer getMaxPacketLossRateUl() {
    return maxPacketLossRateUl;
  }

  public void setMaxPacketLossRateUl(Integer maxPacketLossRateUl) {
    this.maxPacketLossRateUl = maxPacketLossRateUl;
  }

  public QosData defQosFlowIndication(Boolean defQosFlowIndication) {
    this.defQosFlowIndication = defQosFlowIndication;
    return this;
  }

  /**
   * Indicates that the dynamic PCC rule shall always have its binding with the QoS Flow associated with the default QoS rule
   * @return defQosFlowIndication
   **/
  @JsonProperty(value = "defQosFlowIndication")
  @ApiModelProperty(value = "Indicates that the dynamic PCC rule shall always have its binding with the QoS Flow associated with the default QoS rule")
  
  public Boolean getDefQosFlowIndication() {
    return defQosFlowIndication;
  }

  public void setDefQosFlowIndication(Boolean defQosFlowIndication) {
    this.defQosFlowIndication = defQosFlowIndication;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QosData qosData = (QosData) o;
    return Objects.equals(this.qosId, qosData.qosId) &&
        Objects.equals(this._5qi, qosData._5qi) &&
        Objects.equals(this.maxbrUl, qosData.maxbrUl) &&
        Objects.equals(this.maxbrDl, qosData.maxbrDl) &&
        Objects.equals(this.gbrUl, qosData.gbrUl) &&
        Objects.equals(this.gbrDl, qosData.gbrDl) &&
        Objects.equals(this.arp, qosData.arp) &&
        Objects.equals(this.qnc, qosData.qnc) &&
        Objects.equals(this.priorityLevel, qosData.priorityLevel) &&
        Objects.equals(this.averWindow, qosData.averWindow) &&
        Objects.equals(this.maxDataBurstVol, qosData.maxDataBurstVol) &&
        Objects.equals(this.reflectiveQos, qosData.reflectiveQos) &&
        Objects.equals(this.sharingKeyDl, qosData.sharingKeyDl) &&
        Objects.equals(this.sharingKeyUl, qosData.sharingKeyUl) &&
        Objects.equals(this.maxPacketLossRateDl, qosData.maxPacketLossRateDl) &&
        Objects.equals(this.maxPacketLossRateUl, qosData.maxPacketLossRateUl) &&
        Objects.equals(this.defQosFlowIndication, qosData.defQosFlowIndication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qosId, _5qi, maxbrUl, maxbrDl, gbrUl, gbrDl, arp, qnc, priorityLevel, averWindow, maxDataBurstVol, reflectiveQos, sharingKeyDl, sharingKeyUl, maxPacketLossRateDl, maxPacketLossRateUl, defQosFlowIndication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QosData {\n");
    
    sb.append("    qosId: ").append(toIndentedString(qosId)).append("\n");
    sb.append("    _5qi: ").append(toIndentedString(_5qi)).append("\n");
    sb.append("    maxbrUl: ").append(toIndentedString(maxbrUl)).append("\n");
    sb.append("    maxbrDl: ").append(toIndentedString(maxbrDl)).append("\n");
    sb.append("    gbrUl: ").append(toIndentedString(gbrUl)).append("\n");
    sb.append("    gbrDl: ").append(toIndentedString(gbrDl)).append("\n");
    sb.append("    arp: ").append(toIndentedString(arp)).append("\n");
    sb.append("    qnc: ").append(toIndentedString(qnc)).append("\n");
    sb.append("    priorityLevel: ").append(toIndentedString(priorityLevel)).append("\n");
    sb.append("    averWindow: ").append(toIndentedString(averWindow)).append("\n");
    sb.append("    maxDataBurstVol: ").append(toIndentedString(maxDataBurstVol)).append("\n");
    sb.append("    reflectiveQos: ").append(toIndentedString(reflectiveQos)).append("\n");
    sb.append("    sharingKeyDl: ").append(toIndentedString(sharingKeyDl)).append("\n");
    sb.append("    sharingKeyUl: ").append(toIndentedString(sharingKeyUl)).append("\n");
    sb.append("    maxPacketLossRateDl: ").append(toIndentedString(maxPacketLossRateDl)).append("\n");
    sb.append("    maxPacketLossRateUl: ").append(toIndentedString(maxPacketLossRateUl)).append("\n");
    sb.append("    defQosFlowIndication: ").append(toIndentedString(defQosFlowIndication)).append("\n");
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

