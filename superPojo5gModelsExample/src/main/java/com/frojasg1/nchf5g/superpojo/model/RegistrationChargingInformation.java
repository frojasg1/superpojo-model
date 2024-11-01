
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RegistrationChargingInformation {
    private SmsIndication smsIndication;
    private RegistrationMessageType registrationMessagetype;
    private GlobalRanNodeId ranNodeId;
    private List<Snssai> allowedNSSAI;
    private PSCellInformation pSCellInformation;
    private RatType rATType;
    private String uetimeZone;
    private MICOModeIndication mICOModeIndication;
    private Integer ranUeNgapId;
    private Integer amfUeNgapId;
    private List<NSSAIMap> nSSAIMapList;
    private UserInformation userInformation;
    private List<ServiceAreaRestriction> serviceAreaRestriction;
    private List<Snssai> requestedNSSAI;
    private List<Tai> taiList;
    private List<Snssai> rejectedNSSAI;
    private UserLocation userLocationinfo;

    public SmsIndication getSmsIndication() {
        return smsIndication;
    }

    public void setSmsIndication(SmsIndication smsIndication) {
        this.smsIndication = smsIndication;
    }

    public RegistrationChargingInformation smsIndication(SmsIndication smsIndication) {
        this.smsIndication = smsIndication;
        return this;
    }

    public RegistrationMessageType getRegistrationMessagetype() {
        return registrationMessagetype;
    }

    public void setRegistrationMessagetype(RegistrationMessageType registrationMessagetype) {
        this.registrationMessagetype = registrationMessagetype;
    }

    public RegistrationChargingInformation registrationMessagetype(RegistrationMessageType registrationMessagetype) {
        this.registrationMessagetype = registrationMessagetype;
        return this;
    }

    public GlobalRanNodeId getRanNodeId() {
        return ranNodeId;
    }

    public void setRanNodeId(GlobalRanNodeId ranNodeId) {
        this.ranNodeId = ranNodeId;
    }

    public RegistrationChargingInformation ranNodeId(GlobalRanNodeId ranNodeId) {
        this.ranNodeId = ranNodeId;
        return this;
    }

    public List<Snssai> getAllowedNSSAI() {
        return allowedNSSAI;
    }

    public void setAllowedNSSAI(List<Snssai> allowedNSSAI) {
        this.allowedNSSAI = allowedNSSAI;
    }

    public RegistrationChargingInformation allowedNSSAI(List<Snssai> allowedNSSAI) {
        this.allowedNSSAI = allowedNSSAI;
        return this;
    }

    public RegistrationChargingInformation addAllowedNSSAIItem(Snssai item) {
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

    public RegistrationChargingInformation pSCellInformation(PSCellInformation pSCellInformation) {
        this.pSCellInformation = pSCellInformation;
        return this;
    }

    public RatType getrATType() {
        return rATType;
    }

    public void setrATType(RatType rATType) {
        this.rATType = rATType;
    }

    public RegistrationChargingInformation rATType(RatType rATType) {
        this.rATType = rATType;
        return this;
    }

    public String getUetimeZone() {
        return uetimeZone;
    }

    public void setUetimeZone(String uetimeZone) {
        this.uetimeZone = uetimeZone;
    }

    public RegistrationChargingInformation uetimeZone(String uetimeZone) {
        this.uetimeZone = uetimeZone;
        return this;
    }

    public MICOModeIndication getmICOModeIndication() {
        return mICOModeIndication;
    }

    public void setmICOModeIndication(MICOModeIndication mICOModeIndication) {
        this.mICOModeIndication = mICOModeIndication;
    }

    public RegistrationChargingInformation mICOModeIndication(MICOModeIndication mICOModeIndication) {
        this.mICOModeIndication = mICOModeIndication;
        return this;
    }

    public Integer getRanUeNgapId() {
        return ranUeNgapId;
    }

    public void setRanUeNgapId(Integer ranUeNgapId) {
        this.ranUeNgapId = ranUeNgapId;
    }

    public RegistrationChargingInformation ranUeNgapId(Integer ranUeNgapId) {
        this.ranUeNgapId = ranUeNgapId;
        return this;
    }

    public Integer getAmfUeNgapId() {
        return amfUeNgapId;
    }

    public void setAmfUeNgapId(Integer amfUeNgapId) {
        this.amfUeNgapId = amfUeNgapId;
    }

    public RegistrationChargingInformation amfUeNgapId(Integer amfUeNgapId) {
        this.amfUeNgapId = amfUeNgapId;
        return this;
    }

    public List<NSSAIMap> getnSSAIMapList() {
        return nSSAIMapList;
    }

    public void setnSSAIMapList(List<NSSAIMap> nSSAIMapList) {
        this.nSSAIMapList = nSSAIMapList;
    }

    public RegistrationChargingInformation nSSAIMapList(List<NSSAIMap> nSSAIMapList) {
        this.nSSAIMapList = nSSAIMapList;
        return this;
    }

    public RegistrationChargingInformation addNSSAIMapListItem(NSSAIMap item) {
        if (this.nSSAIMapList == null) {
            this.nSSAIMapList = new ArrayList();
        }
        this.nSSAIMapList.add(item);
        return this;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    public RegistrationChargingInformation userInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
        return this;
    }

    public List<ServiceAreaRestriction> getServiceAreaRestriction() {
        return serviceAreaRestriction;
    }

    public void setServiceAreaRestriction(List<ServiceAreaRestriction> serviceAreaRestriction) {
        this.serviceAreaRestriction = serviceAreaRestriction;
    }

    public RegistrationChargingInformation serviceAreaRestriction(List<ServiceAreaRestriction> serviceAreaRestriction) {
        this.serviceAreaRestriction = serviceAreaRestriction;
        return this;
    }

    public RegistrationChargingInformation addServiceAreaRestrictionItem(ServiceAreaRestriction item) {
        if (this.serviceAreaRestriction == null) {
            this.serviceAreaRestriction = new ArrayList();
        }
        this.serviceAreaRestriction.add(item);
        return this;
    }

    public List<Snssai> getRequestedNSSAI() {
        return requestedNSSAI;
    }

    public void setRequestedNSSAI(List<Snssai> requestedNSSAI) {
        this.requestedNSSAI = requestedNSSAI;
    }

    public RegistrationChargingInformation requestedNSSAI(List<Snssai> requestedNSSAI) {
        this.requestedNSSAI = requestedNSSAI;
        return this;
    }

    public RegistrationChargingInformation addRequestedNSSAIItem(Snssai item) {
        if (this.requestedNSSAI == null) {
            this.requestedNSSAI = new ArrayList();
        }
        this.requestedNSSAI.add(item);
        return this;
    }

    public List<Tai> getTaiList() {
        return taiList;
    }

    public void setTaiList(List<Tai> taiList) {
        this.taiList = taiList;
    }

    public RegistrationChargingInformation taiList(List<Tai> taiList) {
        this.taiList = taiList;
        return this;
    }

    public RegistrationChargingInformation addTaiListItem(Tai item) {
        if (this.taiList == null) {
            this.taiList = new ArrayList();
        }
        this.taiList.add(item);
        return this;
    }

    public List<Snssai> getRejectedNSSAI() {
        return rejectedNSSAI;
    }

    public void setRejectedNSSAI(List<Snssai> rejectedNSSAI) {
        this.rejectedNSSAI = rejectedNSSAI;
    }

    public RegistrationChargingInformation rejectedNSSAI(List<Snssai> rejectedNSSAI) {
        this.rejectedNSSAI = rejectedNSSAI;
        return this;
    }

    public RegistrationChargingInformation addRejectedNSSAIItem(Snssai item) {
        if (this.rejectedNSSAI == null) {
            this.rejectedNSSAI = new ArrayList();
        }
        this.rejectedNSSAI.add(item);
        return this;
    }

    public UserLocation getUserLocationinfo() {
        return userLocationinfo;
    }

    public void setUserLocationinfo(UserLocation userLocationinfo) {
        this.userLocationinfo = userLocationinfo;
    }

    public RegistrationChargingInformation userLocationinfo(UserLocation userLocationinfo) {
        this.userLocationinfo = userLocationinfo;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((("RegistrationChargingInformation {"+"smsIndication = ")+ smsIndication)+", ")+"registrationMessagetype = ")+ registrationMessagetype)+", ")+"ranNodeId = ")+ ranNodeId)+", ")+"allowedNSSAI = ")+ allowedNSSAI)+", ")+"pSCellInformation = ")+ pSCellInformation)+", ")+"rATType = ")+ rATType)+", ")+"uetimeZone = ")+ uetimeZone)+", ")+"mICOModeIndication = ")+ mICOModeIndication)+", ")+"ranUeNgapId = ")+ ranUeNgapId)+", ")+"amfUeNgapId = ")+ amfUeNgapId)+", ")+"nSSAIMapList = ")+ nSSAIMapList)+", ")+"userInformation = ")+ userInformation)+", ")+"serviceAreaRestriction = ")+ serviceAreaRestriction)+", ")+"requestedNSSAI = ")+ requestedNSSAI)+", ")+"taiList = ")+ taiList)+", ")+"rejectedNSSAI = ")+ rejectedNSSAI)+", ")+"userLocationinfo = ")+ userLocationinfo)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(smsIndication, registrationMessagetype, ranNodeId, allowedNSSAI, pSCellInformation, rATType, uetimeZone, mICOModeIndication, ranUeNgapId, amfUeNgapId, nSSAIMapList, userInformation, serviceAreaRestriction, requestedNSSAI, taiList, rejectedNSSAI, userLocationinfo);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        RegistrationChargingInformation castThat = ((RegistrationChargingInformation) that);
        return ((((((((((((((((Objects.equals(this.smsIndication, castThat.smsIndication)&&Objects.equals(this.registrationMessagetype, castThat.registrationMessagetype))&&Objects.equals(this.ranNodeId, castThat.ranNodeId))&&Objects.equals(this.allowedNSSAI, castThat.allowedNSSAI))&&Objects.equals(this.pSCellInformation, castThat.pSCellInformation))&&Objects.equals(this.rATType, castThat.rATType))&&Objects.equals(this.uetimeZone, castThat.uetimeZone))&&Objects.equals(this.mICOModeIndication, castThat.mICOModeIndication))&&Objects.equals(this.ranUeNgapId, castThat.ranUeNgapId))&&Objects.equals(this.amfUeNgapId, castThat.amfUeNgapId))&&Objects.equals(this.nSSAIMapList, castThat.nSSAIMapList))&&Objects.equals(this.userInformation, castThat.userInformation))&&Objects.equals(this.serviceAreaRestriction, castThat.serviceAreaRestriction))&&Objects.equals(this.requestedNSSAI, castThat.requestedNSSAI))&&Objects.equals(this.taiList, castThat.taiList))&&Objects.equals(this.rejectedNSSAI, castThat.rejectedNSSAI))&&Objects.equals(this.userLocationinfo, castThat.userLocationinfo));
    }
}
