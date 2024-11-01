
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class ServiceAreaId {
    private PlmnId plmnId;
    private String sac;
    private String lac;

    public PlmnId getPlmnId() {
        return plmnId;
    }

    public void setPlmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
    }

    public ServiceAreaId plmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
        return this;
    }

    public String getSac() {
        return sac;
    }

    public void setSac(String sac) {
        this.sac = sac;
    }

    public ServiceAreaId sac(String sac) {
        this.sac = sac;
        return this;
    }

    public String getLac() {
        return lac;
    }

    public void setLac(String lac) {
        this.lac = lac;
    }

    public ServiceAreaId lac(String lac) {
        this.lac = lac;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("ServiceAreaId {"+"plmnId = ")+ plmnId)+", ")+"sac = ")+ sac)+", ")+"lac = ")+ lac)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(plmnId, sac, lac);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        ServiceAreaId castThat = ((ServiceAreaId) that);
        return ((Objects.equals(this.plmnId, castThat.plmnId)&&Objects.equals(this.sac, castThat.sac))&&Objects.equals(this.lac, castThat.lac));
    }
}
