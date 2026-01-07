
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class RoutingAreaId {
    public PlmnId plmnId;
    public String rac;
    public String lac;

    public PlmnId getPlmnId() {
        return plmnId;
    }

    public void setPlmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
    }

    public RoutingAreaId plmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
        return this;
    }

    public String getRac() {
        return rac;
    }

    public void setRac(String rac) {
        this.rac = rac;
    }

    public RoutingAreaId rac(String rac) {
        this.rac = rac;
        return this;
    }

    public String getLac() {
        return lac;
    }

    public void setLac(String lac) {
        this.lac = lac;
    }

    public RoutingAreaId lac(String lac) {
        this.lac = lac;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("RoutingAreaId {"+"plmnId = ")+ plmnId)+", ")+"rac = ")+ rac)+", ")+"lac = ")+ lac)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(plmnId, rac, lac);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        RoutingAreaId castThat = ((RoutingAreaId) that);
        return ((Objects.equals(this.plmnId, castThat.plmnId)&&Objects.equals(this.rac, castThat.rac))&&Objects.equals(this.lac, castThat.lac));
    }
}
