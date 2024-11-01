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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * QFIContainerInformation
 */
@JsonPropertyOrder({
  QFIContainerInformation.JSON_PROPERTY_Q_F_I,
  QFIContainerInformation.JSON_PROPERTY_REPORT_TIME,
  QFIContainerInformation.JSON_PROPERTY_TIMEOF_FIRST_USAGE,
  QFIContainerInformation.JSON_PROPERTY_TIMEOF_LAST_USAGE,
  QFIContainerInformation.JSON_PROPERTY_QO_S_INFORMATION,
  QFIContainerInformation.JSON_PROPERTY_USER_LOCATION_INFORMATION,
  QFIContainerInformation.JSON_PROPERTY_UETIME_ZONE,
  QFIContainerInformation.JSON_PROPERTY_PRESENCE_REPORTING_AREA_INFORMATION,
  QFIContainerInformation.JSON_PROPERTY_R_A_T_TYPE,
  QFIContainerInformation.JSON_PROPERTY_SERVING_NETWORK_FUNCTION_I_D,
  QFIContainerInformation.JSON_PROPERTY_3GPP_P_S_DATA_OFF_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-17T08:24:27.361349500+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class QFIContainerInformation   {
  public static final String JSON_PROPERTY_Q_F_I = "qFI";
  @JsonProperty(JSON_PROPERTY_Q_F_I)
  private Integer qFI;

  public static final String JSON_PROPERTY_REPORT_TIME = "reportTime";
  @JsonProperty(JSON_PROPERTY_REPORT_TIME)
  private Date reportTime;

  public static final String JSON_PROPERTY_TIMEOF_FIRST_USAGE = "timeofFirstUsage";
  @JsonProperty(JSON_PROPERTY_TIMEOF_FIRST_USAGE)
  private Date timeofFirstUsage;

  public static final String JSON_PROPERTY_TIMEOF_LAST_USAGE = "timeofLastUsage";
  @JsonProperty(JSON_PROPERTY_TIMEOF_LAST_USAGE)
  private Date timeofLastUsage;

  public static final String JSON_PROPERTY_QO_S_INFORMATION = "qoSInformation";
  @JsonProperty(JSON_PROPERTY_QO_S_INFORMATION)
  private QosData qoSInformation;

  public static final String JSON_PROPERTY_USER_LOCATION_INFORMATION = "userLocationInformation";
  @JsonProperty(JSON_PROPERTY_USER_LOCATION_INFORMATION)
  private UserLocation userLocationInformation;

  public static final String JSON_PROPERTY_UETIME_ZONE = "uetimeZone";
  @JsonProperty(JSON_PROPERTY_UETIME_ZONE)
  private String uetimeZone;

  public static final String JSON_PROPERTY_PRESENCE_REPORTING_AREA_INFORMATION = "presenceReportingAreaInformation";
  @JsonProperty(JSON_PROPERTY_PRESENCE_REPORTING_AREA_INFORMATION)
  private Map<String, PresenceInfo> presenceReportingAreaInformation;

  public static final String JSON_PROPERTY_R_A_T_TYPE = "rATType";
  @JsonProperty(JSON_PROPERTY_R_A_T_TYPE)
  private RatType rATType;

  public static final String JSON_PROPERTY_SERVING_NETWORK_FUNCTION_I_D = "servingNetworkFunctionID";
  @JsonProperty(JSON_PROPERTY_SERVING_NETWORK_FUNCTION_I_D)
  private List<@Valid ServingNetworkFunctionID> servingNetworkFunctionID;

  public static final String JSON_PROPERTY_3GPP_P_S_DATA_OFF_STATUS = "3gppPSDataOffStatus";
  @JsonProperty(JSON_PROPERTY_3GPP_P_S_DATA_OFF_STATUS)
  private Model3GPPPSDataOffStatus _3gppPSDataOffStatus;

  public QFIContainerInformation qFI(Integer qFI) {
    this.qFI = qFI;
    return this;
  }

  /**
   * Get qFI
   * minimum: 0
   * maximum: 63
   * @return qFI
   **/
  @JsonProperty(value = "qFI")
  @ApiModelProperty(value = "")
   @Min(0) @Max(63)
  public Integer getqFI() {
    return qFI;
  }

  public void setqFI(Integer qFI) {
    this.qFI = qFI;
  }

  public QFIContainerInformation reportTime(Date reportTime) {
    this.reportTime = reportTime;
    return this;
  }

  /**
   * Get reportTime
   * @return reportTime
   **/
  @JsonProperty(value = "reportTime")
  @ApiModelProperty(value = "")
  
  public Date getReportTime() {
    return reportTime;
  }

  public void setReportTime(Date reportTime) {
    this.reportTime = reportTime;
  }

  public QFIContainerInformation timeofFirstUsage(Date timeofFirstUsage) {
    this.timeofFirstUsage = timeofFirstUsage;
    return this;
  }

  /**
   * Get timeofFirstUsage
   * @return timeofFirstUsage
   **/
  @JsonProperty(value = "timeofFirstUsage")
  @ApiModelProperty(value = "")
  
  public Date getTimeofFirstUsage() {
    return timeofFirstUsage;
  }

  public void setTimeofFirstUsage(Date timeofFirstUsage) {
    this.timeofFirstUsage = timeofFirstUsage;
  }

  public QFIContainerInformation timeofLastUsage(Date timeofLastUsage) {
    this.timeofLastUsage = timeofLastUsage;
    return this;
  }

  /**
   * Get timeofLastUsage
   * @return timeofLastUsage
   **/
  @JsonProperty(value = "timeofLastUsage")
  @ApiModelProperty(value = "")
  
  public Date getTimeofLastUsage() {
    return timeofLastUsage;
  }

  public void setTimeofLastUsage(Date timeofLastUsage) {
    this.timeofLastUsage = timeofLastUsage;
  }

  public QFIContainerInformation qoSInformation(QosData qoSInformation) {
    this.qoSInformation = qoSInformation;
    return this;
  }

  /**
   * Get qoSInformation
   * @return qoSInformation
   **/
  @JsonProperty(value = "qoSInformation")
  @ApiModelProperty(value = "")
  @Valid 
  public QosData getQoSInformation() {
    return qoSInformation;
  }

  public void setQoSInformation(QosData qoSInformation) {
    this.qoSInformation = qoSInformation;
  }

  public QFIContainerInformation userLocationInformation(UserLocation userLocationInformation) {
    this.userLocationInformation = userLocationInformation;
    return this;
  }

  /**
   * Get userLocationInformation
   * @return userLocationInformation
   **/
  @JsonProperty(value = "userLocationInformation")
  @ApiModelProperty(value = "")
  @Valid 
  public UserLocation getUserLocationInformation() {
    return userLocationInformation;
  }

  public void setUserLocationInformation(UserLocation userLocationInformation) {
    this.userLocationInformation = userLocationInformation;
  }

  public QFIContainerInformation uetimeZone(String uetimeZone) {
    this.uetimeZone = uetimeZone;
    return this;
  }

  /**
   * Get uetimeZone
   * @return uetimeZone
   **/
  @JsonProperty(value = "uetimeZone")
  @ApiModelProperty(value = "")
  
  public String getUetimeZone() {
    return uetimeZone;
  }

  public void setUetimeZone(String uetimeZone) {
    this.uetimeZone = uetimeZone;
  }

  public QFIContainerInformation presenceReportingAreaInformation(Map<String, PresenceInfo> presenceReportingAreaInformation) {
    this.presenceReportingAreaInformation = presenceReportingAreaInformation;
    return this;
  }

  public QFIContainerInformation putPresenceReportingAreaInformationItem(String key, PresenceInfo presenceReportingAreaInformationItem) {
    if (this.presenceReportingAreaInformation == null) {
      this.presenceReportingAreaInformation = new HashMap<>();
    }
    this.presenceReportingAreaInformation.put(key, presenceReportingAreaInformationItem);
    return this;
  }

  /**
   * Get presenceReportingAreaInformation
   * @return presenceReportingAreaInformation
   **/
  @JsonProperty(value = "presenceReportingAreaInformation")
  @ApiModelProperty(value = "")
  @Valid  @Size(min=0)
  public Map<String, PresenceInfo> getPresenceReportingAreaInformation() {
    return presenceReportingAreaInformation;
  }

  public void setPresenceReportingAreaInformation(Map<String, PresenceInfo> presenceReportingAreaInformation) {
    this.presenceReportingAreaInformation = presenceReportingAreaInformation;
  }

  public QFIContainerInformation rATType(RatType rATType) {
    this.rATType = rATType;
    return this;
  }

  /**
   * Get rATType
   * @return rATType
   **/
  @JsonProperty(value = "rATType")
  @ApiModelProperty(value = "")
  
  public RatType getrATType() {
    return rATType;
  }

  public void setrATType(RatType rATType) {
    this.rATType = rATType;
  }

  public QFIContainerInformation servingNetworkFunctionID(List<@Valid ServingNetworkFunctionID> servingNetworkFunctionID) {
    this.servingNetworkFunctionID = servingNetworkFunctionID;
    return this;
  }

  public QFIContainerInformation addServingNetworkFunctionIDItem(ServingNetworkFunctionID servingNetworkFunctionIDItem) {
    if (this.servingNetworkFunctionID == null) {
      this.servingNetworkFunctionID = new ArrayList<>();
    }
    this.servingNetworkFunctionID.add(servingNetworkFunctionIDItem);
    return this;
  }

  /**
   * Get servingNetworkFunctionID
   * @return servingNetworkFunctionID
   **/
  @JsonProperty(value = "servingNetworkFunctionID")
  @ApiModelProperty(value = "")
  @Valid  @Size(min=0)
  public List<@Valid ServingNetworkFunctionID> getServingNetworkFunctionID() {
    return servingNetworkFunctionID;
  }

  public void setServingNetworkFunctionID(List<@Valid ServingNetworkFunctionID> servingNetworkFunctionID) {
    this.servingNetworkFunctionID = servingNetworkFunctionID;
  }

  public QFIContainerInformation _3gppPSDataOffStatus(Model3GPPPSDataOffStatus _3gppPSDataOffStatus) {
    this._3gppPSDataOffStatus = _3gppPSDataOffStatus;
    return this;
  }

  /**
   * Get _3gppPSDataOffStatus
   * @return _3gppPSDataOffStatus
   **/
  @JsonProperty(value = "3gppPSDataOffStatus")
  @ApiModelProperty(value = "")
  
  public Model3GPPPSDataOffStatus get3gppPSDataOffStatus() {
    return _3gppPSDataOffStatus;
  }

  public void set3gppPSDataOffStatus(Model3GPPPSDataOffStatus _3gppPSDataOffStatus) {
    this._3gppPSDataOffStatus = _3gppPSDataOffStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QFIContainerInformation qfIContainerInformation = (QFIContainerInformation) o;
    return Objects.equals(this.qFI, qfIContainerInformation.qFI) &&
        Objects.equals(this.reportTime, qfIContainerInformation.reportTime) &&
        Objects.equals(this.timeofFirstUsage, qfIContainerInformation.timeofFirstUsage) &&
        Objects.equals(this.timeofLastUsage, qfIContainerInformation.timeofLastUsage) &&
        Objects.equals(this.qoSInformation, qfIContainerInformation.qoSInformation) &&
        Objects.equals(this.userLocationInformation, qfIContainerInformation.userLocationInformation) &&
        Objects.equals(this.uetimeZone, qfIContainerInformation.uetimeZone) &&
        Objects.equals(this.presenceReportingAreaInformation, qfIContainerInformation.presenceReportingAreaInformation) &&
        Objects.equals(this.rATType, qfIContainerInformation.rATType) &&
        Objects.equals(this.servingNetworkFunctionID, qfIContainerInformation.servingNetworkFunctionID) &&
        Objects.equals(this._3gppPSDataOffStatus, qfIContainerInformation._3gppPSDataOffStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qFI, reportTime, timeofFirstUsage, timeofLastUsage, qoSInformation, userLocationInformation, uetimeZone, presenceReportingAreaInformation, rATType, servingNetworkFunctionID, _3gppPSDataOffStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QFIContainerInformation {\n");
    
    sb.append("    qFI: ").append(toIndentedString(qFI)).append("\n");
    sb.append("    reportTime: ").append(toIndentedString(reportTime)).append("\n");
    sb.append("    timeofFirstUsage: ").append(toIndentedString(timeofFirstUsage)).append("\n");
    sb.append("    timeofLastUsage: ").append(toIndentedString(timeofLastUsage)).append("\n");
    sb.append("    qoSInformation: ").append(toIndentedString(qoSInformation)).append("\n");
    sb.append("    userLocationInformation: ").append(toIndentedString(userLocationInformation)).append("\n");
    sb.append("    uetimeZone: ").append(toIndentedString(uetimeZone)).append("\n");
    sb.append("    presenceReportingAreaInformation: ").append(toIndentedString(presenceReportingAreaInformation)).append("\n");
    sb.append("    rATType: ").append(toIndentedString(rATType)).append("\n");
    sb.append("    servingNetworkFunctionID: ").append(toIndentedString(servingNetworkFunctionID)).append("\n");
    sb.append("    _3gppPSDataOffStatus: ").append(toIndentedString(_3gppPSDataOffStatus)).append("\n");
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

