
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class N2ConnectionChargingInformation {
    private List<CoreNetworkType> restrictedCnList;
    private Integer n2ConnectionMessageType;
    private GlobalRanNodeId ranNodeId;
    private List<Snssai> allowedNSSAI;
    private PSCellInformation pSCellInformation;
    private RatType rATType;
    private String uetimeZone;
    private Integer ranUeNgapId;
    private List<Area> forbiddenAreaList;
    private Integer amfUeNgapId;
    private String rrcEstCause;
    private UserInformation userInformation;
    private List<RatType> restrictedRatList;
    private List<ServiceAreaRestriction> serviceAreaRestriction;
    private UserLocation userLocationinfo;

    public List<CoreNetworkType> getRestrictedCnList() {
        return restrictedCnList;
    }

    public void setRestrictedCnList(List<CoreNetworkType> restrictedCnList) {
        this.restrictedCnList = restrictedCnList;
    }

    public N2ConnectionChargingInformation restrictedCnList(List<CoreNetworkType> restrictedCnList) {
        this.restrictedCnList = restrictedCnList;
        return this;
    }

    public N2ConnectionChargingInformation addRestrictedCnListItem(CoreNetworkType item) {
        if (this.restrictedCnList == null) {
            this.restrictedCnList = new ArrayList();
        }
        this.restrictedCnList.add(item);
        return this;
    }

    public Integer getN2ConnectionMessageType() {
        return n2ConnectionMessageType;
    }

    public void setN2ConnectionMessageType(Integer n2ConnectionMessageType) {
        this.n2ConnectionMessageType = n2ConnectionMessageType;
    }

    public N2ConnectionChargingInformation n2ConnectionMessageType(Integer n2ConnectionMessageType) {
        this.n2ConnectionMessageType = n2ConnectionMessageType;
        return this;
    }

    public GlobalRanNodeId getRanNodeId() {
        return ranNodeId;
    }

    public void setRanNodeId(GlobalRanNodeId ranNodeId) {
        this.ranNodeId = ranNodeId;
    }

    public N2ConnectionChargingInformation ranNodeId(GlobalRanNodeId ranNodeId) {
        this.ranNodeId = ranNodeId;
        return this;
    }

    public List<Snssai> getAllowedNSSAI() {
        return allowedNSSAI;
    }

    public void setAllowedNSSAI(List<Snssai> allowedNSSAI) {
        this.allowedNSSAI = allowedNSSAI;
    }

    public N2ConnectionChargingInformation allowedNSSAI(List<Snssai> allowedNSSAI) {
        this.allowedNSSAI = allowedNSSAI;
        return this;
    }

    public N2ConnectionChargingInformation addAllowedNSSAIItem(Snssai item) {
        if (this.allowedNSSAI == null) {
            this.allowedNSSAI = new ArrayList();
        }
        this.allowedNSSAI.add(item);
        return this;
    }

    public PSCellInformation getpSCellInformation() {
        return pSCellInformation;
    }

    public void setpSCellInformation(PSCellInformation pSCellInformation) {
        this.pSCellInformation = pSCellInformation;
    }

    public N2ConnectionChargingInformation pSCellInformation(PSCellInformation pSCellInformation) {
        this.pSCellInformation = pSCellInformation;
        return this;
    }

    public RatType getrATType() {
        return rATType;
    }

    public void setrATType(RatType rATType) {
        this.rATType = rATType;
    }

    public N2ConnectionChargingInformation rATType(RatType rATType) {
        this.rATType = rATType;
        return this;
    }

    public String getUetimeZone() {
        return uetimeZone;
    }

    public void setUetimeZone(String uetimeZone) {
        this.uetimeZone = uetimeZone;
    }

    public N2ConnectionChargingInformation uetimeZone(String uetimeZone) {
        this.uetimeZone = uetimeZone;
        return this;
    }

    public Integer getRanUeNgapId() {
        return ranUeNgapId;
    }

    public void setRanUeNgapId(Integer ranUeNgapId) {
        this.ranUeNgapId = ranUeNgapId;
    }

    public N2ConnectionChargingInformation ranUeNgapId(Integer ranUeNgapId) {
        this.ranUeNgapId = ranUeNgapId;
        return this;
    }

    public List<Area> getForbiddenAreaList() {
        return forbiddenAreaList;
    }

    public void setForbiddenAreaList(List<Area> forbiddenAreaList) {
        this.forbiddenAreaList = forbiddenAreaList;
    }

    public N2ConnectionChargingInformation forbiddenAreaList(List<Area> forbiddenAreaList) {
        this.forbiddenAreaList = forbiddenAreaList;
        return this;
    }

    public N2ConnectionChargingInformation addForbiddenAreaListItem(Area item) {
        if (this.forbiddenAreaList == null) {
            this.forbiddenAreaList = new ArrayList();
        }
        this.forbiddenAreaList.add(item);
        return this;
    }

    public Integer getAmfUeNgapId() {
        return amfUeNgapId;
    }

    public void setAmfUeNgapId(Integer amfUeNgapId) {
        this.amfUeNgapId = amfUeNgapId;
    }

    public N2ConnectionChargingInformation amfUeNgapId(Integer amfUeNgapId) {
        this.amfUeNgapId = amfUeNgapId;
        return this;
    }

    public String getRrcEstCause() {
        return rrcEstCause;
    }

    public void setRrcEstCause(String rrcEstCause) {
        this.rrcEstCause = rrcEstCause;
    }

    public N2ConnectionChargingInformation rrcEstCause(String rrcEstCause) {
        this.rrcEstCause = rrcEstCause;
        return this;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    public N2ConnectionChargingInformation userInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
        return this;
    }

    public List<RatType> getRestrictedRatList() {
        return restrictedRatList;
    }

    public void setRestrictedRatList(List<RatType> restrictedRatList) {
        this.restrictedRatList = restrictedRatList;
    }

    public N2ConnectionChargingInformation restrictedRatList(List<RatType> restrictedRatList) {
        this.restrictedRatList = restrictedRatList;
        return this;
    }

    public N2ConnectionChargingInformation addRestrictedRatListItem(RatType item) {
        if (this.restrictedRatList == null) {
            this.restrictedRatList = new ArrayList();
        }
        this.restrictedRatList.add(item);
        return this;
    }

    public List<ServiceAreaRestriction> getServiceAreaRestriction() {
        return serviceAreaRestriction;
    }

    public void setServiceAreaRestriction(List<ServiceAreaRestriction> serviceAreaRestriction) {
        this.serviceAreaRestriction = serviceAreaRestriction;
    }

    public N2ConnectionChargingInformation serviceAreaRestriction(List<ServiceAreaRestriction> serviceAreaRestriction) {
        this.serviceAreaRestriction = serviceAreaRestriction;
        return this;
    }

    public N2ConnectionChargingInformation addServiceAreaRestrictionItem(ServiceAreaRestriction item) {
        if (this.serviceAreaRestriction == null) {
            this.serviceAreaRestriction = new ArrayList();
        }
        this.serviceAreaRestriction.add(item);
        return this;
    }

    public UserLocation getUserLocationinfo() {
        return userLocationinfo;
    }

    public void setUserLocationinfo(UserLocation userLocationinfo) {
        this.userLocationinfo = userLocationinfo;
    }

    public N2ConnectionChargingInformation userLocationinfo(UserLocation userLocationinfo) {
        this.userLocationinfo = userLocationinfo;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((((((((((((((((((((((((((("N2ConnectionChargingInformation {"+"restrictedCnList = ")+ restrictedCnList)+", ")+"n2ConnectionMessageType = ")+ n2ConnectionMessageType)+", ")+"ranNodeId = ")+ ranNodeId)+", ")+"allowedNSSAI = ")+ allowedNSSAI)+", ")+"pSCellInformation = ")+ pSCellInformation)+", ")+"rATType = ")+ rATType)+", ")+"uetimeZone = ")+ uetimeZone)+", ")+"ranUeNgapId = ")+ ranUeNgapId)+", ")+"forbiddenAreaList = ")+ forbiddenAreaList)+", ")+"amfUeNgapId = ")+ amfUeNgapId)+", ")+"rrcEstCause = ")+ rrcEstCause)+", ")+"userInformation = ")+ userInformation)+", ")+"restrictedRatList = ")+ restrictedRatList)+", ")+"serviceAreaRestriction = ")+ serviceAreaRestriction)+", ")+"userLocationinfo = ")+ userLocationinfo)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(restrictedCnList, n2ConnectionMessageType, ranNodeId, allowedNSSAI, pSCellInformation, rATType, uetimeZone, ranUeNgapId, forbiddenAreaList, amfUeNgapId, rrcEstCause, userInformation, restrictedRatList, serviceAreaRestriction, userLocationinfo);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        N2ConnectionChargingInformation castThat = ((N2ConnectionChargingInformation) that);
        return ((((((((((((((Objects.equals(this.restrictedCnList, castThat.restrictedCnList)&&Objects.equals(this.n2ConnectionMessageType, castThat.n2ConnectionMessageType))&&Objects.equals(this.ranNodeId, castThat.ranNodeId))&&Objects.equals(this.allowedNSSAI, castThat.allowedNSSAI))&&Objects.equals(this.pSCellInformation, castThat.pSCellInformation))&&Objects.equals(this.rATType, castThat.rATType))&&Objects.equals(this.uetimeZone, castThat.uetimeZone))&&Objects.equals(this.ranUeNgapId, castThat.ranUeNgapId))&&Objects.equals(this.forbiddenAreaList, castThat.forbiddenAreaList))&&Objects.equals(this.amfUeNgapId, castThat.amfUeNgapId))&&Objects.equals(this.rrcEstCause, castThat.rrcEstCause))&&Objects.equals(this.userInformation, castThat.userInformation))&&Objects.equals(this.restrictedRatList, castThat.restrictedRatList))&&Objects.equals(this.serviceAreaRestriction, castThat.serviceAreaRestriction))&&Objects.equals(this.userLocationinfo, castThat.userLocationinfo));
    }
}
