
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class NSPAChargingInformation {
    private Snssai singleNSSAI;

    public Snssai getSingleNSSAI() {
        return singleNSSAI;
    }

    public void setSingleNSSAI(Snssai singleNSSAI) {
        this.singleNSSAI = singleNSSAI;
    }

    public NSPAChargingInformation singleNSSAI(Snssai singleNSSAI) {
        this.singleNSSAI = singleNSSAI;
        return this;
    }

    @Override
    public String toString() {
        return ((("NSPAChargingInformation {"+"singleNSSAI = ")+ singleNSSAI)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(singleNSSAI);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        NSPAChargingInformation castThat = ((NSPAChargingInformation) that);
        return Objects.equals(this.singleNSSAI, castThat.singleNSSAI);
    }
}
