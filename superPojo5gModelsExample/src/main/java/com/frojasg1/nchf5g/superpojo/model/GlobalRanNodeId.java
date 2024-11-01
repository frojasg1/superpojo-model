
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class GlobalRanNodeId {
    private String eNbId;
    private String wagfId;
    private String tngfId;
    private GNbId gNbId;
    private String nid;
    private PlmnId plmnId;
    private String n3IwfId;
    private String ngeNbId;

    public String geteNbId() {
        return eNbId;
    }

    public void seteNbId(String eNbId) {
        this.eNbId = eNbId;
    }

    public GlobalRanNodeId eNbId(String eNbId) {
        this.eNbId = eNbId;
        return this;
    }

    public String getWagfId() {
        return wagfId;
    }

    public void setWagfId(String wagfId) {
        this.wagfId = wagfId;
    }

    public GlobalRanNodeId wagfId(String wagfId) {
        this.wagfId = wagfId;
        return this;
    }

    public String getTngfId() {
        return tngfId;
    }

    public void setTngfId(String tngfId) {
        this.tngfId = tngfId;
    }

    public GlobalRanNodeId tngfId(String tngfId) {
        this.tngfId = tngfId;
        return this;
    }

    public GNbId getgNbId() {
        return gNbId;
    }

    public void setgNbId(GNbId gNbId) {
        this.gNbId = gNbId;
    }

    public GlobalRanNodeId gNbId(GNbId gNbId) {
        this.gNbId = gNbId;
        return this;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public GlobalRanNodeId nid(String nid) {
        this.nid = nid;
        return this;
    }

    public PlmnId getPlmnId() {
        return plmnId;
    }

    public void setPlmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
    }

    public GlobalRanNodeId plmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
        return this;
    }

    public String getN3IwfId() {
        return n3IwfId;
    }

    public void setN3IwfId(String n3IwfId) {
        this.n3IwfId = n3IwfId;
    }

    public GlobalRanNodeId n3IwfId(String n3IwfId) {
        this.n3IwfId = n3IwfId;
        return this;
    }

    public String getNgeNbId() {
        return ngeNbId;
    }

    public void setNgeNbId(String ngeNbId) {
        this.ngeNbId = ngeNbId;
    }

    public GlobalRanNodeId ngeNbId(String ngeNbId) {
        this.ngeNbId = ngeNbId;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((("GlobalRanNodeId {"+"eNbId = ")+ eNbId)+", ")+"wagfId = ")+ wagfId)+", ")+"tngfId = ")+ tngfId)+", ")+"gNbId = ")+ gNbId)+", ")+"nid = ")+ nid)+", ")+"plmnId = ")+ plmnId)+", ")+"n3IwfId = ")+ n3IwfId)+", ")+"ngeNbId = ")+ ngeNbId)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(eNbId, wagfId, tngfId, gNbId, nid, plmnId, n3IwfId, ngeNbId);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        GlobalRanNodeId castThat = ((GlobalRanNodeId) that);
        return (((((((Objects.equals(this.eNbId, castThat.eNbId)&&Objects.equals(this.wagfId, castThat.wagfId))&&Objects.equals(this.tngfId, castThat.tngfId))&&Objects.equals(this.gNbId, castThat.gNbId))&&Objects.equals(this.nid, castThat.nid))&&Objects.equals(this.plmnId, castThat.plmnId))&&Objects.equals(this.n3IwfId, castThat.n3IwfId))&&Objects.equals(this.ngeNbId, castThat.ngeNbId));
    }
}
