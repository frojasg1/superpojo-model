
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class ServingNetworkFunctionID {
    private NFIdentification servingNetworkFunctionInformation;
    private String aMFId;

    public NFIdentification getServingNetworkFunctionInformation() {
        return servingNetworkFunctionInformation;
    }

    public void setServingNetworkFunctionInformation(NFIdentification servingNetworkFunctionInformation) {
        this.servingNetworkFunctionInformation = servingNetworkFunctionInformation;
    }

    public ServingNetworkFunctionID servingNetworkFunctionInformation(NFIdentification servingNetworkFunctionInformation) {
        this.servingNetworkFunctionInformation = servingNetworkFunctionInformation;
        return this;
    }

    public String getaMFId() {
        return aMFId;
    }

    public void setaMFId(String aMFId) {
        this.aMFId = aMFId;
    }

    public ServingNetworkFunctionID aMFId(String aMFId) {
        this.aMFId = aMFId;
        return this;
    }

    @Override
    public String toString() {
        return (((((("ServingNetworkFunctionID {"+"servingNetworkFunctionInformation = ")+ servingNetworkFunctionInformation)+", ")+"aMFId = ")+ aMFId)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(servingNetworkFunctionInformation, aMFId);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        ServingNetworkFunctionID castThat = ((ServingNetworkFunctionID) that);
        return (Objects.equals(this.servingNetworkFunctionInformation, castThat.servingNetworkFunctionInformation)&&Objects.equals(this.aMFId, castThat.aMFId));
    }
}
