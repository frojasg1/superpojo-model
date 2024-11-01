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
 * Gets or Sets NFType
 */
public enum NFType {
  
  NRF("NRF"),
  
  UDM("UDM"),
  
  AMF("AMF"),
  
  SMF("SMF"),
  
  AUSF("AUSF"),
  
  NEF("NEF"),
  
  PCF("PCF"),
  
  SMSF("SMSF"),
  
  NSSF("NSSF"),
  
  UDR("UDR"),
  
  LMF("LMF"),
  
  GMLC("GMLC"),
  
  _5_G_EIR("5G_EIR"),
  
  SEPP("SEPP"),
  
  UPF("UPF"),
  
  N3_IWF("N3IWF"),
  
  AF("AF"),
  
  UDSF("UDSF"),
  
  BSF("BSF"),
  
  CHF("CHF"),
  
  NWDAF("NWDAF"),
  
  PCSCF("PCSCF"),
  
  CBCF("CBCF"),
  
  HSS("HSS"),
  
  UCMF("UCMF"),
  
  SOR_AF("SOR_AF"),
  
  SPAF("SPAF"),
  
  MME("MME"),
  
  SCSAS("SCSAS"),
  
  SCEF("SCEF"),
  
  SCP("SCP"),
  
  NSSAAF("NSSAAF"),
  
  ICSCF("ICSCF"),
  
  SCSCF("SCSCF"),
  
  DRA("DRA"),
  
  IMS_AS("IMS_AS"),
  
  CEF("CEF");

  private String value;

  NFType(String value) {
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
  public static NFType fromValue(String value) {
    for (NFType b : NFType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
