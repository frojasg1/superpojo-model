
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class Ecgi {
    private String nid;
    private String eutraCellId;
    private PlmnId plmnId;

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public Ecgi nid(String nid) {
        this.nid = nid;
        return this;
    }

    public String getEutraCellId() {
        return eutraCellId;
    }

    public void setEutraCellId(String eutraCellId) {
        this.eutraCellId = eutraCellId;
    }

    public Ecgi eutraCellId(String eutraCellId) {
        this.eutraCellId = eutraCellId;
        return this;
    }

    public PlmnId getPlmnId() {
        return plmnId;
    }

    public void setPlmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
    }

    public Ecgi plmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("Ecgi {"+"nid = ")+ nid)+", ")+"eutraCellId = ")+ eutraCellId)+", ")+"plmnId = ")+ plmnId)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(nid, eutraCellId, plmnId);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        Ecgi castThat = ((Ecgi) that);
        return ((Objects.equals(this.nid, castThat.nid)&&Objects.equals(this.eutraCellId, castThat.eutraCellId))&&Objects.equals(this.plmnId, castThat.plmnId));
    }
}
