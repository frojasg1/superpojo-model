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
 * GlobalRanNodeId
 */
@JsonPropertyOrder({
  GlobalRanNodeId.JSON_PROPERTY_PLMN_ID,
  GlobalRanNodeId.JSON_PROPERTY_N3_IWF_ID,
  GlobalRanNodeId.JSON_PROPERTY_G_NB_ID,
  GlobalRanNodeId.JSON_PROPERTY_NGE_NB_ID,
  GlobalRanNodeId.JSON_PROPERTY_WAGF_ID,
  GlobalRanNodeId.JSON_PROPERTY_TNGF_ID,
  GlobalRanNodeId.JSON_PROPERTY_NID,
  GlobalRanNodeId.JSON_PROPERTY_E_NB_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-24T14:40:31.217597300+02:00[Europe/Madrid]", comments = "Generator version: 7.7.0")
public class GlobalRanNodeId   {
  public static final String JSON_PROPERTY_PLMN_ID = "plmnId";
  @JsonProperty(JSON_PROPERTY_PLMN_ID)
  private PlmnId plmnId;

  public static final String JSON_PROPERTY_N3_IWF_ID = "n3IwfId";
  @JsonProperty(JSON_PROPERTY_N3_IWF_ID)
  private String n3IwfId;

  public static final String JSON_PROPERTY_G_NB_ID = "gNbId";
  @JsonProperty(JSON_PROPERTY_G_NB_ID)
  private GNbId gNbId;

  public static final String JSON_PROPERTY_NGE_NB_ID = "ngeNbId";
  @JsonProperty(JSON_PROPERTY_NGE_NB_ID)
  private String ngeNbId;

  public static final String JSON_PROPERTY_WAGF_ID = "wagfId";
  @JsonProperty(JSON_PROPERTY_WAGF_ID)
  private String wagfId;

  public static final String JSON_PROPERTY_TNGF_ID = "tngfId";
  @JsonProperty(JSON_PROPERTY_TNGF_ID)
  private String tngfId;

  public static final String JSON_PROPERTY_NID = "nid";
  @JsonProperty(JSON_PROPERTY_NID)
  private String nid;

  public static final String JSON_PROPERTY_E_NB_ID = "eNbId";
  @JsonProperty(JSON_PROPERTY_E_NB_ID)
  private String eNbId;

  public GlobalRanNodeId plmnId(PlmnId plmnId) {
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

  public GlobalRanNodeId n3IwfId(String n3IwfId) {
    this.n3IwfId = n3IwfId;
    return this;
  }

  /**
   * Get n3IwfId
   * @return n3IwfId
   **/
  @JsonProperty(value = "n3IwfId")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^[A-Fa-f0-9]+$")
  public String getN3IwfId() {
    return n3IwfId;
  }

  public void setN3IwfId(String n3IwfId) {
    this.n3IwfId = n3IwfId;
  }

  public GlobalRanNodeId gNbId(GNbId gNbId) {
    this.gNbId = gNbId;
    return this;
  }

  /**
   * Get gNbId
   * @return gNbId
   **/
  @JsonProperty(value = "gNbId")
  @ApiModelProperty(value = "")
  @Valid 
  public GNbId getgNbId() {
    return gNbId;
  }

  public void setgNbId(GNbId gNbId) {
    this.gNbId = gNbId;
  }

  public GlobalRanNodeId ngeNbId(String ngeNbId) {
    this.ngeNbId = ngeNbId;
    return this;
  }

  /**
   * Get ngeNbId
   * @return ngeNbId
   **/
  @JsonProperty(value = "ngeNbId")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^(MacroNGeNB-[A-Fa-f0-9]{5}|LMacroNGeNB-[A-Fa-f0-9]{6}|SMacroNGeNB-[A-Fa-f0-9]{5})$")
  public String getNgeNbId() {
    return ngeNbId;
  }

  public void setNgeNbId(String ngeNbId) {
    this.ngeNbId = ngeNbId;
  }

  public GlobalRanNodeId wagfId(String wagfId) {
    this.wagfId = wagfId;
    return this;
  }

  /**
   * Get wagfId
   * @return wagfId
   **/
  @JsonProperty(value = "wagfId")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^[A-Fa-f0-9]+$")
  public String getWagfId() {
    return wagfId;
  }

  public void setWagfId(String wagfId) {
    this.wagfId = wagfId;
  }

  public GlobalRanNodeId tngfId(String tngfId) {
    this.tngfId = tngfId;
    return this;
  }

  /**
   * Get tngfId
   * @return tngfId
   **/
  @JsonProperty(value = "tngfId")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^[A-Fa-f0-9]+$")
  public String getTngfId() {
    return tngfId;
  }

  public void setTngfId(String tngfId) {
    this.tngfId = tngfId;
  }

  public GlobalRanNodeId nid(String nid) {
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

  public GlobalRanNodeId eNbId(String eNbId) {
    this.eNbId = eNbId;
    return this;
  }

  /**
   * Get eNbId
   * @return eNbId
   **/
  @JsonProperty(value = "eNbId")
  @ApiModelProperty(value = "")
   @Pattern(regexp="^(MacroeNB-[A-Fa-f0-9]{5}|LMacroeNB-[A-Fa-f0-9]{6}|SMacroeNB-[A-Fa-f0-9]{5}|HomeeNB-[A-Fa-f0-9]{7})$")
  public String geteNbId() {
    return eNbId;
  }

  public void seteNbId(String eNbId) {
    this.eNbId = eNbId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalRanNodeId globalRanNodeId = (GlobalRanNodeId) o;
    return Objects.equals(this.plmnId, globalRanNodeId.plmnId) &&
        Objects.equals(this.n3IwfId, globalRanNodeId.n3IwfId) &&
        Objects.equals(this.gNbId, globalRanNodeId.gNbId) &&
        Objects.equals(this.ngeNbId, globalRanNodeId.ngeNbId) &&
        Objects.equals(this.wagfId, globalRanNodeId.wagfId) &&
        Objects.equals(this.tngfId, globalRanNodeId.tngfId) &&
        Objects.equals(this.nid, globalRanNodeId.nid) &&
        Objects.equals(this.eNbId, globalRanNodeId.eNbId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plmnId, n3IwfId, gNbId, ngeNbId, wagfId, tngfId, nid, eNbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalRanNodeId {\n");
    
    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
    sb.append("    n3IwfId: ").append(toIndentedString(n3IwfId)).append("\n");
    sb.append("    gNbId: ").append(toIndentedString(gNbId)).append("\n");
    sb.append("    ngeNbId: ").append(toIndentedString(ngeNbId)).append("\n");
    sb.append("    wagfId: ").append(toIndentedString(wagfId)).append("\n");
    sb.append("    tngfId: ").append(toIndentedString(tngfId)).append("\n");
    sb.append("    nid: ").append(toIndentedString(nid)).append("\n");
    sb.append("    eNbId: ").append(toIndentedString(eNbId)).append("\n");
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
