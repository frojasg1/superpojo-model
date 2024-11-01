
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class PlmnId {
    private String mcc;
    private String mnc;

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public PlmnId mcc(String mcc) {
        this.mcc = mcc;
        return this;
    }

    public String getMnc() {
        return mnc;
    }

    public void setMnc(String mnc) {
        this.mnc = mnc;
    }

    public PlmnId mnc(String mnc) {
        this.mnc = mnc;
        return this;
    }

    @Override
    public String toString() {
        return (((((("PlmnId {"+"mcc = ")+ mcc)+", ")+"mnc = ")+ mnc)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(mcc, mnc);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        PlmnId castThat = ((PlmnId) that);
        return (Objects.equals(this.mcc, castThat.mcc)&&Objects.equals(this.mnc, castThat.mnc));
    }
}
