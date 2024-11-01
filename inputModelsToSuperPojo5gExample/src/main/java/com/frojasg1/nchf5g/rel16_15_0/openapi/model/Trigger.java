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
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Trigger
 */
@JsonPropertyOrder({
  Trigger.JSON_PROPERTY_TRIGGER_TYPE,
  Trigger.JSON_PROPERTY_TRIGGER_CATEGORY,
  Trigger.JSON_PROPERTY_TIME_LIMIT,
  Trigger.JSON_PROPERTY_VOLUME_LIMIT,
  Trigger.JSON_PROPERTY_VOLUME_LIMIT64,
  Trigger.JSON_PROPERTY_EVENT_LIMIT,
  Trigger.JSON_PROPERTY_MAX_NUMBER_OFCCC,
  Trigger.JSON_PROPERTY_TARIFF_TIME_CHANGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-24T14:40:31.217597300+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class Trigger   {
  public static final String JSON_PROPERTY_TRIGGER_TYPE = "triggerType";
  @JsonProperty(JSON_PROPERTY_TRIGGER_TYPE)
  private TriggerType triggerType;

  public static final String JSON_PROPERTY_TRIGGER_CATEGORY = "triggerCategory";
  @JsonProperty(JSON_PROPERTY_TRIGGER_CATEGORY)
  private TriggerCategory triggerCategory;

  public static final String JSON_PROPERTY_TIME_LIMIT = "timeLimit";
  @JsonProperty(JSON_PROPERTY_TIME_LIMIT)
  private Integer timeLimit;

  public static final String JSON_PROPERTY_VOLUME_LIMIT = "volumeLimit";
  @JsonProperty(JSON_PROPERTY_VOLUME_LIMIT)
  private Integer volumeLimit;

  public static final String JSON_PROPERTY_VOLUME_LIMIT64 = "volumeLimit64";
  @JsonProperty(JSON_PROPERTY_VOLUME_LIMIT64)
  private Long volumeLimit64;

  public static final String JSON_PROPERTY_EVENT_LIMIT = "eventLimit";
  @JsonProperty(JSON_PROPERTY_EVENT_LIMIT)
  private Integer eventLimit;

  public static final String JSON_PROPERTY_MAX_NUMBER_OFCCC = "maxNumberOfccc";
  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OFCCC)
  private Integer maxNumberOfccc;

  public static final String JSON_PROPERTY_TARIFF_TIME_CHANGE = "tariffTimeChange";
  @JsonProperty(JSON_PROPERTY_TARIFF_TIME_CHANGE)
  private Date tariffTimeChange;

  public Trigger triggerType(TriggerType triggerType) {
    this.triggerType = triggerType;
    return this;
  }

  /**
   * Get triggerType
   * @return triggerType
   **/
  @JsonProperty(value = "triggerType")
  @ApiModelProperty(value = "")
  
  public TriggerType getTriggerType() {
    return triggerType;
  }

  public void setTriggerType(TriggerType triggerType) {
    this.triggerType = triggerType;
  }

  public Trigger triggerCategory(TriggerCategory triggerCategory) {
    this.triggerCategory = triggerCategory;
    return this;
  }

  /**
   * Get triggerCategory
   * @return triggerCategory
   **/
  @JsonProperty(value = "triggerCategory")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public TriggerCategory getTriggerCategory() {
    return triggerCategory;
  }

  public void setTriggerCategory(TriggerCategory triggerCategory) {
    this.triggerCategory = triggerCategory;
  }

  public Trigger timeLimit(Integer timeLimit) {
    this.timeLimit = timeLimit;
    return this;
  }

  /**
   * Get timeLimit
   * @return timeLimit
   **/
  @JsonProperty(value = "timeLimit")
  @ApiModelProperty(value = "")
  
  public Integer getTimeLimit() {
    return timeLimit;
  }

  public void setTimeLimit(Integer timeLimit) {
    this.timeLimit = timeLimit;
  }

  public Trigger volumeLimit(Integer volumeLimit) {
    this.volumeLimit = volumeLimit;
    return this;
  }

  /**
   * Get volumeLimit
   * minimum: 0
   * maximum: 4294967295
   * @return volumeLimit
   **/
  @JsonProperty(value = "volumeLimit")
  @ApiModelProperty(value = "")
   @Min(0) @Max(4294967295L)
  public Integer getVolumeLimit() {
    return volumeLimit;
  }

  public void setVolumeLimit(Integer volumeLimit) {
    this.volumeLimit = volumeLimit;
  }

  public Trigger volumeLimit64(Long volumeLimit64) {
    this.volumeLimit64 = volumeLimit64;
    return this;
  }

  /**
   * Get volumeLimit64
   * minimum: 0
   * @return volumeLimit64
   **/
  @JsonProperty(value = "volumeLimit64")
  @ApiModelProperty(value = "")
   @Min(0L)
  public Long getVolumeLimit64() {
    return volumeLimit64;
  }

  public void setVolumeLimit64(Long volumeLimit64) {
    this.volumeLimit64 = volumeLimit64;
  }

  public Trigger eventLimit(Integer eventLimit) {
    this.eventLimit = eventLimit;
    return this;
  }

  /**
   * Get eventLimit
   * minimum: 0
   * maximum: 4294967295
   * @return eventLimit
   **/
  @JsonProperty(value = "eventLimit")
  @ApiModelProperty(value = "")
   @Min(0) @Max(4294967295L)
  public Integer getEventLimit() {
    return eventLimit;
  }

  public void setEventLimit(Integer eventLimit) {
    this.eventLimit = eventLimit;
  }

  public Trigger maxNumberOfccc(Integer maxNumberOfccc) {
    this.maxNumberOfccc = maxNumberOfccc;
    return this;
  }

  /**
   * Get maxNumberOfccc
   * minimum: 0
   * maximum: 4294967295
   * @return maxNumberOfccc
   **/
  @JsonProperty(value = "maxNumberOfccc")
  @ApiModelProperty(value = "")
   @Min(0) @Max(4294967295L)
  public Integer getMaxNumberOfccc() {
    return maxNumberOfccc;
  }

  public void setMaxNumberOfccc(Integer maxNumberOfccc) {
    this.maxNumberOfccc = maxNumberOfccc;
  }

  public Trigger tariffTimeChange(Date tariffTimeChange) {
    this.tariffTimeChange = tariffTimeChange;
    return this;
  }

  /**
   * Get tariffTimeChange
   * @return tariffTimeChange
   **/
  @JsonProperty(value = "tariffTimeChange")
  @ApiModelProperty(value = "")
  
  public Date getTariffTimeChange() {
    return tariffTimeChange;
  }

  public void setTariffTimeChange(Date tariffTimeChange) {
    this.tariffTimeChange = tariffTimeChange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trigger trigger = (Trigger) o;
    return Objects.equals(this.triggerType, trigger.triggerType) &&
        Objects.equals(this.triggerCategory, trigger.triggerCategory) &&
        Objects.equals(this.timeLimit, trigger.timeLimit) &&
        Objects.equals(this.volumeLimit, trigger.volumeLimit) &&
        Objects.equals(this.volumeLimit64, trigger.volumeLimit64) &&
        Objects.equals(this.eventLimit, trigger.eventLimit) &&
        Objects.equals(this.maxNumberOfccc, trigger.maxNumberOfccc) &&
        Objects.equals(this.tariffTimeChange, trigger.tariffTimeChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triggerType, triggerCategory, timeLimit, volumeLimit, volumeLimit64, eventLimit, maxNumberOfccc, tariffTimeChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trigger {\n");
    
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    triggerCategory: ").append(toIndentedString(triggerCategory)).append("\n");
    sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
    sb.append("    volumeLimit: ").append(toIndentedString(volumeLimit)).append("\n");
    sb.append("    volumeLimit64: ").append(toIndentedString(volumeLimit64)).append("\n");
    sb.append("    eventLimit: ").append(toIndentedString(eventLimit)).append("\n");
    sb.append("    maxNumberOfccc: ").append(toIndentedString(maxNumberOfccc)).append("\n");
    sb.append("    tariffTimeChange: ").append(toIndentedString(tariffTimeChange)).append("\n");
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

