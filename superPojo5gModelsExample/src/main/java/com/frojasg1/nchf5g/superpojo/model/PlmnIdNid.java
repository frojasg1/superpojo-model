
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class PlmnIdNid {
    private String nid;
    private String mnc;
    private String mcc;

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public PlmnIdNid nid(String nid) {
        this.nid = nid;
        return this;
    }

    public String getMnc() {
        return mnc;
    }

    public void setMnc(String mnc) {
        this.mnc = mnc;
    }

    public PlmnIdNid mnc(String mnc) {
        this.mnc = mnc;
        return this;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public PlmnIdNid mcc(String mcc) {
        this.mcc = mcc;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("PlmnIdNid {"+"nid = ")+ nid)+", ")+"mnc = ")+ mnc)+", ")+"mcc = ")+ mcc)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(nid, mnc, mcc);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        PlmnIdNid castThat = ((PlmnIdNid) that);
        return ((Objects.equals(this.nid, castThat.nid)&&Objects.equals(this.mnc, castThat.mnc))&&Objects.equals(this.mcc, castThat.mcc));
    }
}
