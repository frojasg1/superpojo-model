
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class NEFChargingInformation {
    private Integer aPIResultCode;
    private NFIdentification aPITargetNetworkFunction;
    private String externalIndividualIdentifier;
    private String aPIContent;
    private String aPIReference;
    private String externalGroupIdentifier;
    private String groupIdentifier;
    private String aPIName;
    private APIDirection aPIDirection;

    public Integer getaPIResultCode() {
        return aPIResultCode;
    }

    public void setaPIResultCode(Integer aPIResultCode) {
        this.aPIResultCode = aPIResultCode;
    }

    public NEFChargingInformation aPIResultCode(Integer aPIResultCode) {
        this.aPIResultCode = aPIResultCode;
        return this;
    }

    public NFIdentification getaPITargetNetworkFunction() {
        return aPITargetNetworkFunction;
    }

    public void setaPITargetNetworkFunction(NFIdentification aPITargetNetworkFunction) {
        this.aPITargetNetworkFunction = aPITargetNetworkFunction;
    }

    public NEFChargingInformation aPITargetNetworkFunction(NFIdentification aPITargetNetworkFunction) {
        this.aPITargetNetworkFunction = aPITargetNetworkFunction;
        return this;
    }

    public String getExternalIndividualIdentifier() {
        return externalIndividualIdentifier;
    }

    public void setExternalIndividualIdentifier(String externalIndividualIdentifier) {
        this.externalIndividualIdentifier = externalIndividualIdentifier;
    }

    public NEFChargingInformation externalIndividualIdentifier(String externalIndividualIdentifier) {
        this.externalIndividualIdentifier = externalIndividualIdentifier;
        return this;
    }

    public String getaPIContent() {
        return aPIContent;
    }

    public void setaPIContent(String aPIContent) {
        this.aPIContent = aPIContent;
    }

    public NEFChargingInformation aPIContent(String aPIContent) {
        this.aPIContent = aPIContent;
        return this;
    }

    public String getaPIReference() {
        return aPIReference;
    }

    public void setaPIReference(String aPIReference) {
        this.aPIReference = aPIReference;
    }

    public NEFChargingInformation aPIReference(String aPIReference) {
        this.aPIReference = aPIReference;
        return this;
    }

    public String getExternalGroupIdentifier() {
        return externalGroupIdentifier;
    }

    public void setExternalGroupIdentifier(String externalGroupIdentifier) {
        this.externalGroupIdentifier = externalGroupIdentifier;
    }

    public NEFChargingInformation externalGroupIdentifier(String externalGroupIdentifier) {
        this.externalGroupIdentifier = externalGroupIdentifier;
        return this;
    }

    public String getGroupIdentifier() {
        return groupIdentifier;
    }

    public void setGroupIdentifier(String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }

    public NEFChargingInformation groupIdentifier(String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
        return this;
    }

    public String getaPIName() {
        return aPIName;
    }

    public void setaPIName(String aPIName) {
        this.aPIName = aPIName;
    }

    public NEFChargingInformation aPIName(String aPIName) {
        this.aPIName = aPIName;
        return this;
    }

    public APIDirection getaPIDirection() {
        return aPIDirection;
    }

    public void setaPIDirection(APIDirection aPIDirection) {
        this.aPIDirection = aPIDirection;
    }

    public NEFChargingInformation aPIDirection(APIDirection aPIDirection) {
        this.aPIDirection = aPIDirection;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((((((((("NEFChargingInformation {"+"aPIResultCode = ")+ aPIResultCode)+", ")+"aPITargetNetworkFunction = ")+ aPITargetNetworkFunction)+", ")+"externalIndividualIdentifier = ")+ externalIndividualIdentifier)+", ")+"aPIContent = ")+ aPIContent)+", ")+"aPIReference = ")+ aPIReference)+", ")+"externalGroupIdentifier = ")+ externalGroupIdentifier)+", ")+"groupIdentifier = ")+ groupIdentifier)+", ")+"aPIName = ")+ aPIName)+", ")+"aPIDirection = ")+ aPIDirection)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(aPIResultCode, aPITargetNetworkFunction, externalIndividualIdentifier, aPIContent, aPIReference, externalGroupIdentifier, groupIdentifier, aPIName, aPIDirection);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        NEFChargingInformation castThat = ((NEFChargingInformation) that);
        return ((((((((Objects.equals(this.aPIResultCode, castThat.aPIResultCode)&&Objects.equals(this.aPITargetNetworkFunction, castThat.aPITargetNetworkFunction))&&Objects.equals(this.externalIndividualIdentifier, castThat.externalIndividualIdentifier))&&Objects.equals(this.aPIContent, castThat.aPIContent))&&Objects.equals(this.aPIReference, castThat.aPIReference))&&Objects.equals(this.externalGroupIdentifier, castThat.externalGroupIdentifier))&&Objects.equals(this.groupIdentifier, castThat.groupIdentifier))&&Objects.equals(this.aPIName, castThat.aPIName))&&Objects.equals(this.aPIDirection, castThat.aPIDirection));
    }
}
