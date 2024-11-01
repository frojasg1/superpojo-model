
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class NetworkSlicingInfo {
    private Snssai sNSSAI;

    public Snssai getsNSSAI() {
        return sNSSAI;
    }

    public void setsNSSAI(Snssai sNSSAI) {
        this.sNSSAI = sNSSAI;
    }

    public NetworkSlicingInfo sNSSAI(Snssai sNSSAI) {
        this.sNSSAI = sNSSAI;
        return this;
    }

    @Override
    public String toString() {
        return ((("NetworkSlicingInfo {"+"sNSSAI = ")+ sNSSAI)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(sNSSAI);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        NetworkSlicingInfo castThat = ((NetworkSlicingInfo) that);
        return Objects.equals(this.sNSSAI, castThat.sNSSAI);
    }
}
