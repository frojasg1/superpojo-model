
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class Tai {
    private String nid;
    private String tac;
    private PlmnId plmnId;

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public Tai nid(String nid) {
        this.nid = nid;
        return this;
    }

    public String getTac() {
        return tac;
    }

    public void setTac(String tac) {
        this.tac = tac;
    }

    public Tai tac(String tac) {
        this.tac = tac;
        return this;
    }

    public PlmnId getPlmnId() {
        return plmnId;
    }

    public void setPlmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
    }

    public Tai plmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("Tai {"+"nid = ")+ nid)+", ")+"tac = ")+ tac)+", ")+"plmnId = ")+ plmnId)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(nid, tac, plmnId);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        Tai castThat = ((Tai) that);
        return ((Objects.equals(this.nid, castThat.nid)&&Objects.equals(this.tac, castThat.tac))&&Objects.equals(this.plmnId, castThat.plmnId));
    }
}
