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
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * NrLocation
 */
@JsonPropertyOrder({
  NrLocation.JSON_PROPERTY_TAI,
  NrLocation.JSON_PROPERTY_NCGI,
  NrLocation.JSON_PROPERTY_IGNORE_NCGI,
  NrLocation.JSON_PROPERTY_AGE_OF_LOCATION_INFORMATION,
  NrLocation.JSON_PROPERTY_UE_LOCATION_TIMESTAMP,
  NrLocation.JSON_PROPERTY_GEOGRAPHICAL_INFORMATION,
  NrLocation.JSON_PROPERTY_GEODETIC_INFORMATION,
  NrLocation.JSON_PROPERTY_GLOBAL_GNB_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-24T14:40:31.217597300+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class NrLocation   {
  public static final String JSON_PROPERTY_TAI = "tai";
  @JsonProperty(JSON_PROPERTY_TAI)
  private Tai tai;

  public static final String JSON_PROPERTY_NCGI = "ncgi";
  @JsonProperty(JSON_PROPERTY_NCGI)
  private Ncgi ncgi;

  public static final String JSON_PROPERTY_IGNORE_NCGI = "ignoreNcgi";
  @JsonProperty(JSON_PROPERTY_IGNORE_NCGI)
  private Boolean ignoreNcgi = false;

  public static final String JSON_PROPERTY_AGE_OF_LOCATION_INFORMATION = "ageOfLocationInformation";
  @JsonProperty(JSON_PROPERTY_AGE_OF_LOCATION_INFORMATION)
  private Integer ageOfLocationInformation;

  public static final String JSON_PROPERTY_UE_LOCATION_TIMESTAMP = "ueLocationTimestamp";
  @JsonProperty(JSON_PROPERTY_UE_LOCATION_TIMESTAMP)
  private Date ueLocationTimestamp;

  public static final String JSON_PROPERTY_GEOGRAPHICAL_INFORMATION = "geographicalInformation";
  @JsonProperty(JSON_PROPERTY_GEOGRAPHICAL_INFORMATION)
  private String geographicalInformation;

  public static final String JSON_PROPERTY_GEODETIC_INFORMATION = "geodeticInformation";
  @JsonProperty(JSON_PROPERTY_GEODETIC_INFORMATION)
  private String geodeticInformation;

  public static final String JSON_PROPERTY_GLOBAL_GNB_ID = "globalGnbId";
  @JsonProperty(JSON_PROPERTY_GLOBAL_GNB_ID)
  private GlobalRanNodeId globalGnbId;

  public NrLocation tai(Tai tai) {
    this.tai = tai;
    return this;
  }

  /**
   * Get tai
   * @return tai
   **/
  @JsonProperty(value = "tai")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public Tai getTai() {
    return tai;
  }

  public void setTai(Tai tai) {
    this.tai = tai;
  }

  public NrLocation ncgi(Ncgi ncgi) {
    this.ncgi = ncgi;
    return this;
  }

  /**
   * Get ncgi
   * @return ncgi
   **/
  @JsonProperty(value = "ncgi")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public Ncgi getNcgi() {
    return ncgi;
  }

  public void setNcgi(Ncgi ncgi) {
    this.ncgi = ncgi;
  }

  public NrLocation ignoreNcgi(Boolean ignoreNcgi) {
    this.ignoreNcgi = ignoreNcgi;
    return this;
  }

  /**
   * Get ignoreNcgi
   * @return ignoreNcgi
   **/
  @JsonProperty(value = "ignoreNcgi")
  @ApiModelProperty(value = "")
  
  public Boolean getIgnoreNcgi() {
    return ignoreNcgi;
  }

  public void setIgnoreNcgi(Boolean ignoreNcgi) {
    this.ignoreNcgi = ignoreNcgi;
  }

  public NrLocation ageOfLocationInformation(Integer ageOfLocationInformation) {
    this.ageOfLocationInformation = ageOfLocationInformation;
    return this;
  }

  /**
   * Get ageOfLocationInformation
   * minimum: 0
   * maximum: 32767
   * @return ageOfLocationInformation
   **/
  @JsonProperty(value = "ageOfLocationInformation")
  @ApiModelProperty(value = "")
   @Min(0) @Max(32767)
  public Integer getAgeOfLocationInformation() {
    return ageOfLocationInformation;
  }

  public void setAgeOfLocationInformation(Integer ageOfLocationInformation) {
    this.ageOfLocationInformation = ageOfLocationInformation;
  }

  public NrLocation ueLocationTimestamp(Date ueLocationTimestamp) {
    this.ueLocationTimestamp = ueLocationTimestamp;
    return this;
  }

  /**
   * Get ueLocationTimestamp
   * @return ueLocationTimestamp
   **/
  @JsonProperty(value = "ueLocationTimestamp")
  @ApiModelProperty(value = "")
  
  public Date getUeLocationTimestamp() {
    return ueLocationTimestamp;
  }

  public void setUeLocationTimestamp(Date ueLocationTimestamp) {
    this.ueLocationTimestamp = ueLocationTimestamp;
  }

  public NrLocation geographicalInformation(String geographicalInformation) {
    this.geographicalInformation = geographicalInformation;
    return this;
  }

  /**
   * Get geographicalInformation
   * @return geographicalInformation
   **/
  @JsonProperty(value = "geographicalInformation")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^[0-9A-F]{16}$")
  public String getGeographicalInformation() {
    return geographicalInformation;
  }

  public void setGeographicalInformation(String geographicalInformation) {
    this.geographicalInformation = geographicalInformation;
  }

  public NrLocation geodeticInformation(String geodeticInformation) {
    this.geodeticInformation = geodeticInformation;
    return this;
  }

  /**
   * Get geodeticInformation
   * @return geodeticInformation
   **/
  @JsonProperty(value = "geodeticInformation")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^[0-9A-F]{20}$")
  public String getGeodeticInformation() {
    return geodeticInformation;
  }

  public void setGeodeticInformation(String geodeticInformation) {
    this.geodeticInformation = geodeticInformation;
  }

  public NrLocation globalGnbId(GlobalRanNodeId globalGnbId) {
    this.globalGnbId = globalGnbId;
    return this;
  }

  /**
   * Get globalGnbId
   * @return globalGnbId
   **/
  @JsonProperty(value = "globalGnbId")
  @ApiModelProperty(value = "")
  @Valid 
  public GlobalRanNodeId getGlobalGnbId() {
    return globalGnbId;
  }

  public void setGlobalGnbId(GlobalRanNodeId globalGnbId) {
    this.globalGnbId = globalGnbId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NrLocation nrLocation = (NrLocation) o;
    return Objects.equals(this.tai, nrLocation.tai) &&
        Objects.equals(this.ncgi, nrLocation.ncgi) &&
        Objects.equals(this.ignoreNcgi, nrLocation.ignoreNcgi) &&
        Objects.equals(this.ageOfLocationInformation, nrLocation.ageOfLocationInformation) &&
        Objects.equals(this.ueLocationTimestamp, nrLocation.ueLocationTimestamp) &&
        Objects.equals(this.geographicalInformation, nrLocation.geographicalInformation) &&
        Objects.equals(this.geodeticInformation, nrLocation.geodeticInformation) &&
        Objects.equals(this.globalGnbId, nrLocation.globalGnbId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tai, ncgi, ignoreNcgi, ageOfLocationInformation, ueLocationTimestamp, geographicalInformation, geodeticInformation, globalGnbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NrLocation {\n");
    
    sb.append("    tai: ").append(toIndentedString(tai)).append("\n");
    sb.append("    ncgi: ").append(toIndentedString(ncgi)).append("\n");
    sb.append("    ignoreNcgi: ").append(toIndentedString(ignoreNcgi)).append("\n");
    sb.append("    ageOfLocationInformation: ").append(toIndentedString(ageOfLocationInformation)).append("\n");
    sb.append("    ueLocationTimestamp: ").append(toIndentedString(ueLocationTimestamp)).append("\n");
    sb.append("    geographicalInformation: ").append(toIndentedString(geographicalInformation)).append("\n");
    sb.append("    geodeticInformation: ").append(toIndentedString(geodeticInformation)).append("\n");
    sb.append("    globalGnbId: ").append(toIndentedString(globalGnbId)).append("\n");
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

