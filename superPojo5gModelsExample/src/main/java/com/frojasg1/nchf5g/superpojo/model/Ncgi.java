
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class Ncgi {
    private String nid;
    private PlmnId plmnId;
    private String nrCellId;

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public Ncgi nid(String nid) {
        this.nid = nid;
        return this;
    }

    public PlmnId getPlmnId() {
        return plmnId;
    }

    public void setPlmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
    }

    public Ncgi plmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
        return this;
    }

    public String getNrCellId() {
        return nrCellId;
    }

    public void setNrCellId(String nrCellId) {
        this.nrCellId = nrCellId;
    }

    public Ncgi nrCellId(String nrCellId) {
        this.nrCellId = nrCellId;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("Ncgi {"+"nid = ")+ nid)+", ")+"plmnId = ")+ plmnId)+", ")+"nrCellId = ")+ nrCellId)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(nid, plmnId, nrCellId);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        Ncgi castThat = ((Ncgi) that);
        return ((Objects.equals(this.nid, castThat.nid)&&Objects.equals(this.plmnId, castThat.plmnId))&&Objects.equals(this.nrCellId, castThat.nrCellId));
    }
}
