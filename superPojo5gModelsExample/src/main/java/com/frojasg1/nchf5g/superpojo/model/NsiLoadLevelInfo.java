
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class NsiLoadLevelInfo {
    private Snssai snssai;
    private Integer loadLevelInformation;
    private String nsiId;

    public Snssai getSnssai() {
        return snssai;
    }

    public void setSnssai(Snssai snssai) {
        this.snssai = snssai;
    }

    public NsiLoadLevelInfo snssai(Snssai snssai) {
        this.snssai = snssai;
        return this;
    }

    public Integer getLoadLevelInformation() {
        return loadLevelInformation;
    }

    public void setLoadLevelInformation(Integer loadLevelInformation) {
        this.loadLevelInformation = loadLevelInformation;
    }

    public NsiLoadLevelInfo loadLevelInformation(Integer loadLevelInformation) {
        this.loadLevelInformation = loadLevelInformation;
        return this;
    }

    public String getNsiId() {
        return nsiId;
    }

    public void setNsiId(String nsiId) {
        this.nsiId = nsiId;
    }

    public NsiLoadLevelInfo nsiId(String nsiId) {
        this.nsiId = nsiId;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("NsiLoadLevelInfo {"+"snssai = ")+ snssai)+", ")+"loadLevelInformation = ")+ loadLevelInformation)+", ")+"nsiId = ")+ nsiId)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(snssai, loadLevelInformation, nsiId);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        NsiLoadLevelInfo castThat = ((NsiLoadLevelInfo) that);
        return ((Objects.equals(this.snssai, castThat.snssai)&&Objects.equals(this.loadLevelInformation, castThat.loadLevelInformation))&&Objects.equals(this.nsiId, castThat.nsiId));
    }
}
