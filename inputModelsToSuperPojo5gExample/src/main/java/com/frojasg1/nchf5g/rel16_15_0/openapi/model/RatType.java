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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets RatType
 */
public enum RatType {
  
  NR("NR"),
  
  EUTRA("EUTRA"),
  
  WLAN("WLAN"),
  
  VIRTUAL("VIRTUAL"),
  
  NBIOT("NBIOT"),
  
  WIRELINE("WIRELINE"),
  
  WIRELINE_CABLE("WIRELINE_CABLE"),
  
  WIRELINE_BBF("WIRELINE_BBF"),
  
  LTE_M("LTE-M"),
  
  NR_U("NR_U"),
  
  EUTRA_U("EUTRA_U"),
  
  TRUSTED_N3_GA("TRUSTED_N3GA"),
  
  TRUSTED_WLAN("TRUSTED_WLAN"),
  
  UTRA("UTRA"),
  
  GERA("GERA");

  private String value;

  RatType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RatType fromValue(String value) {
    for (RatType b : RatType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
