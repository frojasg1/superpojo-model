
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NetworkAreaInfo {
    public List<Ncgi> ncgis;
    public List<Tai> tais;
    public List<Ecgi> ecgis;
    public List<GlobalRanNodeId> gRanNodeIds;

    public List<Ncgi> getNcgis() {
        return ncgis;
    }

    public void setNcgis(List<Ncgi> ncgis) {
        this.ncgis = ncgis;
    }

    public NetworkAreaInfo ncgis(List<Ncgi> ncgis) {
        this.ncgis = ncgis;
        return this;
    }

    public NetworkAreaInfo addNcgisItem(Ncgi item) {
        if (this.ncgis == null) {
            this.ncgis = new ArrayList();
        }
        this.ncgis.add(item);
        return this;
    }

    public List<Tai> getTais() {
        return tais;
    }

    public void setTais(List<Tai> tais) {
        this.tais = tais;
    }

    public NetworkAreaInfo tais(List<Tai> tais) {
        this.tais = tais;
        return this;
    }

    public NetworkAreaInfo addTaisItem(Tai item) {
        if (this.tais == null) {
            this.tais = new ArrayList();
        }
        this.tais.add(item);
        return this;
    }

    public List<Ecgi> getEcgis() {
        return ecgis;
    }

    public void setEcgis(List<Ecgi> ecgis) {
        this.ecgis = ecgis;
    }

    public NetworkAreaInfo ecgis(List<Ecgi> ecgis) {
        this.ecgis = ecgis;
        return this;
    }

    public NetworkAreaInfo addEcgisItem(Ecgi item) {
        if (this.ecgis == null) {
            this.ecgis = new ArrayList();
        }
        this.ecgis.add(item);
        return this;
    }

    public List<GlobalRanNodeId> getgRanNodeIds() {
        return gRanNodeIds;
    }

    public void setgRanNodeIds(List<GlobalRanNodeId> gRanNodeIds) {
        this.gRanNodeIds = gRanNodeIds;
    }

    public NetworkAreaInfo gRanNodeIds(List<GlobalRanNodeId> gRanNodeIds) {
        this.gRanNodeIds = gRanNodeIds;
        return this;
    }

    public NetworkAreaInfo addGRanNodeIdsItem(GlobalRanNodeId item) {
        if (this.gRanNodeIds == null) {
            this.gRanNodeIds = new ArrayList();
        }
        this.gRanNodeIds.add(item);
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((("NetworkAreaInfo {"+"ncgis = ")+ ncgis)+", ")+"tais = ")+ tais)+", ")+"ecgis = ")+ ecgis)+", ")+"gRanNodeIds = ")+ gRanNodeIds)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(ncgis, tais, ecgis, gRanNodeIds);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        NetworkAreaInfo castThat = ((NetworkAreaInfo) that);
        return (((Objects.equals(this.ncgis, castThat.ncgis)&&Objects.equals(this.tais, castThat.tais))&&Objects.equals(this.ecgis, castThat.ecgis))&&Objects.equals(this.gRanNodeIds, castThat.gRanNodeIds));
    }
}
