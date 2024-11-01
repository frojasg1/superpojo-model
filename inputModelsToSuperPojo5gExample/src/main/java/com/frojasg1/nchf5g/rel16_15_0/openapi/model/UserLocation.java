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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * UserLocation
 */
@JsonPropertyOrder({
  UserLocation.JSON_PROPERTY_EUTRA_LOCATION,
  UserLocation.JSON_PROPERTY_NR_LOCATION,
  UserLocation.JSON_PROPERTY_N3GA_LOCATION,
  UserLocation.JSON_PROPERTY_UTRA_LOCATION,
  UserLocation.JSON_PROPERTY_GERA_LOCATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-24T14:40:31.217597300+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class UserLocation   {
  public static final String JSON_PROPERTY_EUTRA_LOCATION = "eutraLocation";
  @JsonProperty(JSON_PROPERTY_EUTRA_LOCATION)
  private EutraLocation eutraLocation;

  public static final String JSON_PROPERTY_NR_LOCATION = "nrLocation";
  @JsonProperty(JSON_PROPERTY_NR_LOCATION)
  private NrLocation nrLocation;

  public static final String JSON_PROPERTY_N3GA_LOCATION = "n3gaLocation";
  @JsonProperty(JSON_PROPERTY_N3GA_LOCATION)
  private N3gaLocation n3gaLocation;

  public static final String JSON_PROPERTY_UTRA_LOCATION = "utraLocation";
  @JsonProperty(JSON_PROPERTY_UTRA_LOCATION)
  private UtraLocation utraLocation;

  public static final String JSON_PROPERTY_GERA_LOCATION = "geraLocation";
  @JsonProperty(JSON_PROPERTY_GERA_LOCATION)
  private GeraLocation geraLocation;

  public UserLocation eutraLocation(EutraLocation eutraLocation) {
    this.eutraLocation = eutraLocation;
    return this;
  }

  /**
   * Get eutraLocation
   * @return eutraLocation
   **/
  @JsonProperty(value = "eutraLocation")
  @ApiModelProperty(value = "")
  @Valid 
  public EutraLocation getEutraLocation() {
    return eutraLocation;
  }

  public void setEutraLocation(EutraLocation eutraLocation) {
    this.eutraLocation = eutraLocation;
  }

  public UserLocation nrLocation(NrLocation nrLocation) {
    this.nrLocation = nrLocation;
    return this;
  }

  /**
   * Get nrLocation
   * @return nrLocation
   **/
  @JsonProperty(value = "nrLocation")
  @ApiModelProperty(value = "")
  @Valid 
  public NrLocation getNrLocation() {
    return nrLocation;
  }

  public void setNrLocation(NrLocation nrLocation) {
    this.nrLocation = nrLocation;
  }

  public UserLocation n3gaLocation(N3gaLocation n3gaLocation) {
    this.n3gaLocation = n3gaLocation;
    return this;
  }

  /**
   * Get n3gaLocation
   * @return n3gaLocation
   **/
  @JsonProperty(value = "n3gaLocation")
  @ApiModelProperty(value = "")
  @Valid 
  public N3gaLocation getN3gaLocation() {
    return n3gaLocation;
  }

  public void setN3gaLocation(N3gaLocation n3gaLocation) {
    this.n3gaLocation = n3gaLocation;
  }

  public UserLocation utraLocation(UtraLocation utraLocation) {
    this.utraLocation = utraLocation;
    return this;
  }

  /**
   * Get utraLocation
   * @return utraLocation
   **/
  @JsonProperty(value = "utraLocation")
  @ApiModelProperty(value = "")
  @Valid 
  public UtraLocation getUtraLocation() {
    return utraLocation;
  }

  public void setUtraLocation(UtraLocation utraLocation) {
    this.utraLocation = utraLocation;
  }

  public UserLocation geraLocation(GeraLocation geraLocation) {
    this.geraLocation = geraLocation;
    return this;
  }

  /**
   * Get geraLocation
   * @return geraLocation
   **/
  @JsonProperty(value = "geraLocation")
  @ApiModelProperty(value = "")
  @Valid 
  public GeraLocation getGeraLocation() {
    return geraLocation;
  }

  public void setGeraLocation(GeraLocation geraLocation) {
    this.geraLocation = geraLocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLocation userLocation = (UserLocation) o;
    return Objects.equals(this.eutraLocation, userLocation.eutraLocation) &&
        Objects.equals(this.nrLocation, userLocation.nrLocation) &&
        Objects.equals(this.n3gaLocation, userLocation.n3gaLocation) &&
        Objects.equals(this.utraLocation, userLocation.utraLocation) &&
        Objects.equals(this.geraLocation, userLocation.geraLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eutraLocation, nrLocation, n3gaLocation, utraLocation, geraLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLocation {\n");
    
    sb.append("    eutraLocation: ").append(toIndentedString(eutraLocation)).append("\n");
    sb.append("    nrLocation: ").append(toIndentedString(nrLocation)).append("\n");
    sb.append("    n3gaLocation: ").append(toIndentedString(n3gaLocation)).append("\n");
    sb.append("    utraLocation: ").append(toIndentedString(utraLocation)).append("\n");
    sb.append("    geraLocation: ").append(toIndentedString(geraLocation)).append("\n");
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

