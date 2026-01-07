
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class UserInformation {
    public RoamerInOut roamerInOut;
    public Boolean unauthenticatedFlag;
    public String servedGPSI;
    public String servedPEI;

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

    @Override
    public String toString() {
        return (((((((((((("UserInformation {"+"roamerInOut = ")+ roamerInOut)+", ")+"unauthenticatedFlag = ")+ unauthenticatedFlag)+", ")+"servedGPSI = ")+ servedGPSI)+", ")+"servedPEI = ")+ servedPEI)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(roamerInOut, unauthenticatedFlag, servedGPSI, servedPEI);
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
        return (((Objects.equals(this.roamerInOut, castThat.roamerInOut)&&Objects.equals(this.unauthenticatedFlag, castThat.unauthenticatedFlag))&&Objects.equals(this.servedGPSI, castThat.servedGPSI))&&Objects.equals(this.servedPEI, castThat.servedPEI));
    }
}
