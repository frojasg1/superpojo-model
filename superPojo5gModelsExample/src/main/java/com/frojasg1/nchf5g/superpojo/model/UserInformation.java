
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class UserInformation {
    private RoamerInOut roamerInOut;
    private Boolean unauthenticatedFlag;
    private String servedPEI;
    private String servedGPSI;

    public RoamerInOut getRoamerInOut() {
        return roamerInOut;
    }

    public void setRoamerInOut(RoamerInOut roamerInOut) {
        this.roamerInOut = roamerInOut;
    }

    public UserInformation roamerInOut(RoamerInOut roamerInOut) {
        this.roamerInOut = roamerInOut;
        return this;
    }

    public Boolean getUnauthenticatedFlag() {
        return unauthenticatedFlag;
    }

    public void setUnauthenticatedFlag(Boolean unauthenticatedFlag) {
        this.unauthenticatedFlag = unauthenticatedFlag;
    }

    public UserInformation unauthenticatedFlag(Boolean unauthenticatedFlag) {
        this.unauthenticatedFlag = unauthenticatedFlag;
        return this;
    }

    public String getServedPEI() {
        return servedPEI;
    }

    public void setServedPEI(String servedPEI) {
        this.servedPEI = servedPEI;
    }

    public UserInformation servedPEI(String servedPEI) {
        this.servedPEI = servedPEI;
        return this;
    }

    public String getServedGPSI() {
        return servedGPSI;
    }

    public void setServedGPSI(String servedGPSI) {
        this.servedGPSI = servedGPSI;
    }

    public UserInformation servedGPSI(String servedGPSI) {
        this.servedGPSI = servedGPSI;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((("UserInformation {"+"roamerInOut = ")+ roamerInOut)+", ")+"unauthenticatedFlag = ")+ unauthenticatedFlag)+", ")+"servedPEI = ")+ servedPEI)+", ")+"servedGPSI = ")+ servedGPSI)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(roamerInOut, unauthenticatedFlag, servedPEI, servedGPSI);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        UserInformation castThat = ((UserInformation) that);
        return (((Objects.equals(this.roamerInOut, castThat.roamerInOut)&&Objects.equals(this.unauthenticatedFlag, castThat.unauthenticatedFlag))&&Objects.equals(this.servedPEI, castThat.servedPEI))&&Objects.equals(this.servedGPSI, castThat.servedGPSI));
    }
}
