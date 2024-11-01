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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ReauthorizationDetails
 */
@JsonPropertyOrder({
  ReauthorizationDetails.JSON_PROPERTY_SERVICE_ID,
  ReauthorizationDetails.JSON_PROPERTY_RATING_GROUP,
  ReauthorizationDetails.JSON_PROPERTY_QUOTA_MANAGEMENT_INDICATOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-17T08:24:27.361349500+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class ReauthorizationDetails   {
  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  private Integer serviceId;

  public static final String JSON_PROPERTY_RATING_GROUP = "ratingGroup";
  @JsonProperty(JSON_PROPERTY_RATING_GROUP)
  private Integer ratingGroup;

  public static final String JSON_PROPERTY_QUOTA_MANAGEMENT_INDICATOR = "quotaManagementIndicator";
  @JsonProperty(JSON_PROPERTY_QUOTA_MANAGEMENT_INDICATOR)
  private QuotaManagementIndicator quotaManagementIndicator;

  public ReauthorizationDetails serviceId(Integer serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * minimum: 0
   * @return serviceId
   **/
  @JsonProperty(value = "serviceId")
  @ApiModelProperty(value = "")
   @Min(0)
  public Integer getServiceId() {
    return serviceId;
  }

  public void setServiceId(Integer serviceId) {
    this.serviceId = serviceId;
  }

  public ReauthorizationDetails ratingGroup(Integer ratingGroup) {
    this.ratingGroup = ratingGroup;
    return this;
  }

  /**
   * Get ratingGroup
   * minimum: 0
   * @return ratingGroup
   **/
  @JsonProperty(value = "ratingGroup")
  @ApiModelProperty(value = "")
   @Min(0)
  public Integer getRatingGroup() {
    return ratingGroup;
  }

  public void setRatingGroup(Integer ratingGroup) {
    this.ratingGroup = ratingGroup;
  }

  public ReauthorizationDetails quotaManagementIndicator(QuotaManagementIndicator quotaManagementIndicator) {
    this.quotaManagementIndicator = quotaManagementIndicator;
    return this;
  }

  /**
   * Get quotaManagementIndicator
   * @return quotaManagementIndicator
   **/
  @JsonProperty(value = "quotaManagementIndicator")
  @ApiModelProperty(value = "")
  
  public QuotaManagementIndicator getQuotaManagementIndicator() {
    return quotaManagementIndicator;
  }

  public void setQuotaManagementIndicator(QuotaManagementIndicator quotaManagementIndicator) {
    this.quotaManagementIndicator = quotaManagementIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReauthorizationDetails reauthorizationDetails = (ReauthorizationDetails) o;
    return Objects.equals(this.serviceId, reauthorizationDetails.serviceId) &&
        Objects.equals(this.ratingGroup, reauthorizationDetails.ratingGroup) &&
        Objects.equals(this.quotaManagementIndicator, reauthorizationDetails.quotaManagementIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, ratingGroup, quotaManagementIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReauthorizationDetails {\n");
    
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    ratingGroup: ").append(toIndentedString(ratingGroup)).append("\n");
    sb.append("    quotaManagementIndicator: ").append(toIndentedString(quotaManagementIndicator)).append("\n");
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

