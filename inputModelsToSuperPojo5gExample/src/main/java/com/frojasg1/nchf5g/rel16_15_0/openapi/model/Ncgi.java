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
 * Ncgi
 */
@JsonPropertyOrder({
  Ncgi.JSON_PROPERTY_PLMN_ID,
  Ncgi.JSON_PROPERTY_NR_CELL_ID,
  Ncgi.JSON_PROPERTY_NID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-24T14:40:31.217597300+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class Ncgi   {
  public static final String JSON_PROPERTY_PLMN_ID = "plmnId";
  @JsonProperty(JSON_PROPERTY_PLMN_ID)
  private PlmnId plmnId;

  public static final String JSON_PROPERTY_NR_CELL_ID = "nrCellId";
  @JsonProperty(JSON_PROPERTY_NR_CELL_ID)
  private String nrCellId;

  public static final String JSON_PROPERTY_NID = "nid";
  @JsonProperty(JSON_PROPERTY_NID)
  private String nid;

  public Ncgi plmnId(PlmnId plmnId) {
    this.plmnId = plmnId;
    return this;
  }

  /**
   * Get plmnId
   * @return plmnId
   **/
  @JsonProperty(value = "plmnId")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public PlmnId getPlmnId() {
    return plmnId;
  }

  public void setPlmnId(PlmnId plmnId) {
    this.plmnId = plmnId;
  }

  public Ncgi nrCellId(String nrCellId) {
    this.nrCellId = nrCellId;
    return this;
  }

  /**
   * Get nrCellId
   * @return nrCellId
   **/
  @JsonProperty(value = "nrCellId")
  @ApiModelProperty(required = true, value = "")
  @NotNull  @Pattern(regexp="^[A-Fa-f0-9]{9}$")
  public String getNrCellId() {
    return nrCellId;
  }

  public void setNrCellId(String nrCellId) {
    this.nrCellId = nrCellId;
  }

  public Ncgi nid(String nid) {
    this.nid = nid;
    return this;
  }

  /**
   * Get nid
   * @return nid
   **/
  @JsonProperty(value = "nid")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^[A-Fa-f0-9]{11}$")
  public String getNid() {
    return nid;
  }

  public void setNid(String nid) {
    this.nid = nid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ncgi ncgi = (Ncgi) o;
    return Objects.equals(this.plmnId, ncgi.plmnId) &&
        Objects.equals(this.nrCellId, ncgi.nrCellId) &&
        Objects.equals(this.nid, ncgi.nid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plmnId, nrCellId, nid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ncgi {\n");
    
    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
    sb.append("    nrCellId: ").append(toIndentedString(nrCellId)).append("\n");
    sb.append("    nid: ").append(toIndentedString(nid)).append("\n");
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

