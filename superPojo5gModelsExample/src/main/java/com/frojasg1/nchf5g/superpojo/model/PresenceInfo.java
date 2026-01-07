
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PresenceInfo {
    public String additionalPraId;
    public List<Ecgi> ecgiList;
    public List<GlobalRanNodeId> globalRanNodeIdList;
    public PresenceState presenceState;
    public String praId;
    public List<Ncgi> ncgiList;
    public List<Tai> trackingAreaList;
    public List<GlobalRanNodeId> globaleNbIdList;

    public String getAdditionalPraId() {
        return additionalPraId;
    }

    public void setAdditionalPraId(String additionalPraId) {
        this.additionalPraId = additionalPraId;
    }

    public PresenceInfo additionalPraId(String additionalPraId) {
        this.additionalPraId = additionalPraId;
        return this;
    }

    public List<Ecgi> getEcgiList() {
        return ecgiList;
    }

    public void setEcgiList(List<Ecgi> ecgiList) {
        this.ecgiList = ecgiList;
    }

    public PresenceInfo ecgiList(List<Ecgi> ecgiList) {
        this.ecgiList = ecgiList;
        return this;
    }

    public PresenceInfo addEcgiListItem(Ecgi item) {
        if (this.ecgiList == null) {
            this.ecgiList = new ArrayList();
        }
        this.ecgiList.add(item);
        return this;
    }

    public List<GlobalRanNodeId> getGlobalRanNodeIdList() {
        return globalRanNodeIdList;
    }

    public void setGlobalRanNodeIdList(List<GlobalRanNodeId> globalRanNodeIdList) {
        this.globalRanNodeIdList = globalRanNodeIdList;
    }

    public PresenceInfo globalRanNodeIdList(List<GlobalRanNodeId> globalRanNodeIdList) {
        this.globalRanNodeIdList = globalRanNodeIdList;
        return this;
    }

    public PresenceInfo addGlobalRanNodeIdListItem(GlobalRanNodeId item) {
        if (this.globalRanNodeIdList == null) {
            this.globalRanNodeIdList = new ArrayList();
        }
        this.globalRanNodeIdList.add(item);
        return this;
    }

    public PresenceState getPresenceState() {
        return presenceState;
    }

    public void setPresenceState(PresenceState presenceState) {
        this.presenceState = presenceState;
    }

    public PresenceInfo presenceState(PresenceState presenceState) {
        this.presenceState = presenceState;
        return this;
    }

    public String getPraId() {
        return praId;
    }

    public void setPraId(String praId) {
        this.praId = praId;
    }

    public PresenceInfo praId(String praId) {
        this.praId = praId;
        return this;
    }

    public List<Ncgi> getNcgiList() {
        return ncgiList;
    }

    public void setNcgiList(List<Ncgi> ncgiList) {
        this.ncgiList = ncgiList;
    }

    public PresenceInfo ncgiList(List<Ncgi> ncgiList) {
        this.ncgiList = ncgiList;
        return this;
    }

    public PresenceInfo addNcgiListItem(Ncgi item) {
        if (this.ncgiList == null) {
            this.ncgiList = new ArrayList();
        }
        this.ncgiList.add(item);
        return this;
    }

    public List<Tai> getTrackingAreaList() {
        return trackingAreaList;
    }

    public void setTrackingAreaList(List<Tai> trackingAreaList) {
        this.trackingAreaList = trackingAreaList;
    }

    public PresenceInfo trackingAreaList(List<Tai> trackingAreaList) {
        this.trackingAreaList = trackingAreaList;
        return this;
    }

    public PresenceInfo addTrackingAreaListItem(Tai item) {
        if (this.trackingAreaList == null) {
            this.trackingAreaList = new ArrayList();
        }
        this.trackingAreaList.add(item);
        return this;
    }

    public List<GlobalRanNodeId> getGlobaleNbIdList() {
        return globaleNbIdList;
    }

    public void setGlobaleNbIdList(List<GlobalRanNodeId> globaleNbIdList) {
        this.globaleNbIdList = globaleNbIdList;
    }

    public PresenceInfo globaleNbIdList(List<GlobalRanNodeId> globaleNbIdList) {
        this.globaleNbIdList = globaleNbIdList;
        return this;
    }

    public PresenceInfo addGlobaleNbIdListItem(GlobalRanNodeId item) {
        if (this.globaleNbIdList == null) {
            this.globaleNbIdList = new ArrayList();
        }
        this.globaleNbIdList.add(item);
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((("PresenceInfo {"+"additionalPraId = ")+ additionalPraId)+", ")+"ecgiList = ")+ ecgiList)+", ")+"globalRanNodeIdList = ")+ globalRanNodeIdList)+", ")+"presenceState = ")+ presenceState)+", ")+"praId = ")+ praId)+", ")+"ncgiList = ")+ ncgiList)+", ")+"trackingAreaList = ")+ trackingAreaList)+", ")+"globaleNbIdList = ")+ globaleNbIdList)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionalPraId, ecgiList, globalRanNodeIdList, presenceState, praId, ncgiList, trackingAreaList, globaleNbIdList);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        PresenceInfo castThat = ((PresenceInfo) that);
        return (((((((Objects.equals(this.additionalPraId, castThat.additionalPraId)&&Objects.equals(this.ecgiList, castThat.ecgiList))&&Objects.equals(this.globalRanNodeIdList, castThat.globalRanNodeIdList))&&Objects.equals(this.presenceState, castThat.presenceState))&&Objects.equals(this.praId, castThat.praId))&&Objects.equals(this.ncgiList, castThat.ncgiList))&&Objects.equals(this.trackingAreaList, castThat.trackingAreaList))&&Objects.equals(this.globaleNbIdList, castThat.globaleNbIdList));
    }
}
