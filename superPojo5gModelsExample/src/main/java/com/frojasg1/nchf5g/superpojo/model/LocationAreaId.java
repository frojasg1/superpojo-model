
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class LocationAreaId {
    public PlmnId plmnId;
    public String lac;

    public PlmnId getPlmnId() {
        return plmnId;
    }

    public void setPlmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
    }

    public LocationAreaId plmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
        return this;
    }

    public String getLac() {
        return lac;
    }

    public void setLac(String lac) {
        this.lac = lac;
    }

    public LocationAreaId lac(String lac) {
        this.lac = lac;
        return this;
    }

    @Override
    public String toString() {
        return (((((("LocationAreaId {"+"plmnId = ")+ plmnId)+", ")+"lac = ")+ lac)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(plmnId, lac);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        LocationAreaId castThat = ((LocationAreaId) that);
        return (Objects.equals(this.plmnId, castThat.plmnId)&&Objects.equals(this.lac, castThat.lac));
    }
}
