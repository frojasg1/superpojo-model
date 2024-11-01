
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ChargingDataRequest {
    private SMSChargingInformation sMSChargingInformation;
    private String supportedFeatures;
    private String serviceSpecificationInfo;
    private NFIdentification nfConsumerIdentification;
    private Integer chargingId;
    private NSPAChargingInformation nSPAChargingInformation;
    private NEFChargingInformation nEFChargingInformation;
    private RegistrationChargingInformation registrationChargingInformation;
    private Date invocationTimeStamp;
    private PDUSessionChargingInformation pDUSessionChargingInformation;
    private Boolean retransmissionIndicator;
    private OneTimeEventType oneTimeEventType;
    private List<Trigger> triggers;
    private String subscriberIdentifier;
    private Integer invocationSequenceNumber;
    private N2ConnectionChargingInformation n2ConnectionChargingInformation;
    private String mnSConsumerIdentifier;
    private RoamingQBCInformation roamingQBCInformation;
    private List<MultipleUnitUsage> multipleUnitUsage;
    private String notifyUri;
    private NSMChargingInformation nSMChargingInformation;
    private LocationReportingChargingInformation locationReportingChargingInformation;
    private Boolean oneTimeEvent;
    private String tenantIdentifier;

    public SMSChargingInformation getsMSChargingInformation() {
        return sMSChargingInformation;
    }

    public void setsMSChargingInformation(SMSChargingInformation sMSChargingInformation) {
        this.sMSChargingInformation = sMSChargingInformation;
    }

    public ChargingDataRequest sMSChargingInformation(SMSChargingInformation sMSChargingInformation) {
        this.sMSChargingInformation = sMSChargingInformation;
        return this;
    }

    public String getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }

    public ChargingDataRequest supportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
        return this;
    }

    public String getServiceSpecificationInfo() {
        return serviceSpecificationInfo;
    }

    public void setServiceSpecificationInfo(String serviceSpecificationInfo) {
        this.serviceSpecificationInfo = serviceSpecificationInfo;
    }

    public ChargingDataRequest serviceSpecificationInfo(String serviceSpecificationInfo) {
        this.serviceSpecificationInfo = serviceSpecificationInfo;
        return this;
    }

    public NFIdentification getNfConsumerIdentification() {
        return nfConsumerIdentification;
    }

    public void setNfConsumerIdentification(NFIdentification nfConsumerIdentification) {
        this.nfConsumerIdentification = nfConsumerIdentification;
    }

    public ChargingDataRequest nfConsumerIdentification(NFIdentification nfConsumerIdentification) {
        this.nfConsumerIdentification = nfConsumerIdentification;
        return this;
    }

    public Integer getChargingId() {
        return chargingId;
    }

    public void setChargingId(Integer chargingId) {
        this.chargingId = chargingId;
    }

    public ChargingDataRequest chargingId(Integer chargingId) {
        this.chargingId = chargingId;
        return this;
    }

    public NSPAChargingInformation getnSPAChargingInformation() {
        return nSPAChargingInformation;
    }

    public void setnSPAChargingInformation(NSPAChargingInformation nSPAChargingInformation) {
        this.nSPAChargingInformation = nSPAChargingInformation;
    }

    public ChargingDataRequest nSPAChargingInformation(NSPAChargingInformation nSPAChargingInformation) {
        this.nSPAChargingInformation = nSPAChargingInformation;
        return this;
    }

    public NEFChargingInformation getnEFChargingInformation() {
        return nEFChargingInformation;
    }

    public void setnEFChargingInformation(NEFChargingInformation nEFChargingInformation) {
        this.nEFChargingInformation = nEFChargingInformation;
    }

    public ChargingDataRequest nEFChargingInformation(NEFChargingInformation nEFChargingInformation) {
        this.nEFChargingInformation = nEFChargingInformation;
        return this;
    }

    public RegistrationChargingInformation getRegistrationChargingInformation() {
        return registrationChargingInformation;
    }

    public void setRegistrationChargingInformation(RegistrationChargingInformation registrationChargingInformation) {
        this.registrationChargingInformation = registrationChargingInformation;
    }

    public ChargingDataRequest registrationChargingInformation(RegistrationChargingInformation registrationChargingInformation) {
        this.registrationChargingInformation = registrationChargingInformation;
        return this;
    }

    public Date getInvocationTimeStamp() {
        return invocationTimeStamp;
    }

    public void setInvocationTimeStamp(Date invocationTimeStamp) {
        this.invocationTimeStamp = invocationTimeStamp;
    }

    public ChargingDataRequest invocationTimeStamp(Date invocationTimeStamp) {
        this.invocationTimeStamp = invocationTimeStamp;
        return this;
    }

    public PDUSessionChargingInformation getpDUSessionChargingInformation() {
        return pDUSessionChargingInformation;
    }

    public void setpDUSessionChargingInformation(PDUSessionChargingInformation pDUSessionChargingInformation) {
        this.pDUSessionChargingInformation = pDUSessionChargingInformation;
    }

    public ChargingDataRequest pDUSessionChargingInformation(PDUSessionChargingInformation pDUSessionChargingInformation) {
        this.pDUSessionChargingInformation = pDUSessionChargingInformation;
        return this;
    }

    public Boolean getRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    public void setRetransmissionIndicator(Boolean retransmissionIndicator) {
        this.retransmissionIndicator = retransmissionIndicator;
    }

    public ChargingDataRequest retransmissionIndicator(Boolean retransmissionIndicator) {
        this.retransmissionIndicator = retransmissionIndicator;
        return this;
    }

    public OneTimeEventType getOneTimeEventType() {
        return oneTimeEventType;
    }

    public void setOneTimeEventType(OneTimeEventType oneTimeEventType) {
        this.oneTimeEventType = oneTimeEventType;
    }

    public ChargingDataRequest oneTimeEventType(OneTimeEventType oneTimeEventType) {
        this.oneTimeEventType = oneTimeEventType;
        return this;
    }

    public List<Trigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    public ChargingDataRequest triggers(List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public ChargingDataRequest addTriggersItem(Trigger item) {
        if (this.triggers == null) {
            this.triggers = new ArrayList();
        }
        this.triggers.add(item);
        return this;
    }

    public String getSubscriberIdentifier() {
        return subscriberIdentifier;
    }

    public void setSubscriberIdentifier(String subscriberIdentifier) {
        this.subscriberIdentifier = subscriberIdentifier;
    }

    public ChargingDataRequest subscriberIdentifier(String subscriberIdentifier) {
        this.subscriberIdentifier = subscriberIdentifier;
        return this;
    }

    public Integer getInvocationSequenceNumber() {
        return invocationSequenceNumber;
    }

    public void setInvocationSequenceNumber(Integer invocationSequenceNumber) {
        this.invocationSequenceNumber = invocationSequenceNumber;
    }

    public ChargingDataRequest invocationSequenceNumber(Integer invocationSequenceNumber) {
        this.invocationSequenceNumber = invocationSequenceNumber;
        return this;
    }

    public N2ConnectionChargingInformation getN2ConnectionChargingInformation() {
        return n2ConnectionChargingInformation;
    }

    public void setN2ConnectionChargingInformation(N2ConnectionChargingInformation n2ConnectionChargingInformation) {
        this.n2ConnectionChargingInformation = n2ConnectionChargingInformation;
    }

    public ChargingDataRequest n2ConnectionChargingInformation(N2ConnectionChargingInformation n2ConnectionChargingInformation) {
        this.n2ConnectionChargingInformation = n2ConnectionChargingInformation;
        return this;
    }

    public String getMnSConsumerIdentifier() {
        return mnSConsumerIdentifier;
    }

    public void setMnSConsumerIdentifier(String mnSConsumerIdentifier) {
        this.mnSConsumerIdentifier = mnSConsumerIdentifier;
    }

    public ChargingDataRequest mnSConsumerIdentifier(String mnSConsumerIdentifier) {
        this.mnSConsumerIdentifier = mnSConsumerIdentifier;
        return this;
    }

    public RoamingQBCInformation getRoamingQBCInformation() {
        return roamingQBCInformation;
    }

    public void setRoamingQBCInformation(RoamingQBCInformation roamingQBCInformation) {
        this.roamingQBCInformation = roamingQBCInformation;
    }

    public ChargingDataRequest roamingQBCInformation(RoamingQBCInformation roamingQBCInformation) {
        this.roamingQBCInformation = roamingQBCInformation;
        return this;
    }

    public List<MultipleUnitUsage> getMultipleUnitUsage() {
        return multipleUnitUsage;
    }

    public void setMultipleUnitUsage(List<MultipleUnitUsage> multipleUnitUsage) {
        this.multipleUnitUsage = multipleUnitUsage;
    }

    public ChargingDataRequest multipleUnitUsage(List<MultipleUnitUsage> multipleUnitUsage) {
        this.multipleUnitUsage = multipleUnitUsage;
        return this;
    }

    public ChargingDataRequest addMultipleUnitUsageItem(MultipleUnitUsage item) {
        if (this.multipleUnitUsage == null) {
            this.multipleUnitUsage = new ArrayList();
        }
        this.multipleUnitUsage.add(item);
        return this;
    }

    public String getNotifyUri() {
        return notifyUri;
    }

    public void setNotifyUri(String notifyUri) {
        this.notifyUri = notifyUri;
    }

    public ChargingDataRequest notifyUri(String notifyUri) {
        this.notifyUri = notifyUri;
        return this;
    }

    public NSMChargingInformation getnSMChargingInformation() {
        return nSMChargingInformation;
    }

    public void setnSMChargingInformation(NSMChargingInformation nSMChargingInformation) {
        this.nSMChargingInformation = nSMChargingInformation;
    }

    public ChargingDataRequest nSMChargingInformation(NSMChargingInformation nSMChargingInformation) {
        this.nSMChargingInformation = nSMChargingInformation;
        return this;
    }

    public LocationReportingChargingInformation getLocationReportingChargingInformation() {
        return locationReportingChargingInformation;
    }

    public void setLocationReportingChargingInformation(LocationReportingChargingInformation locationReportingChargingInformation) {
        this.locationReportingChargingInformation = locationReportingChargingInformation;
    }

    public ChargingDataRequest locationReportingChargingInformation(LocationReportingChargingInformation locationReportingChargingInformation) {
        this.locationReportingChargingInformation = locationReportingChargingInformation;
        return this;
    }

    public Boolean getOneTimeEvent() {
        return oneTimeEvent;
    }

    public void setOneTimeEvent(Boolean oneTimeEvent) {
        this.oneTimeEvent = oneTimeEvent;
    }

    public ChargingDataRequest oneTimeEvent(Boolean oneTimeEvent) {
        this.oneTimeEvent = oneTimeEvent;
        return this;
    }

    public String getTenantIdentifier() {
        return tenantIdentifier;
    }

    public void setTenantIdentifier(String tenantIdentifier) {
        this.tenantIdentifier = tenantIdentifier;
    }

    public ChargingDataRequest tenantIdentifier(String tenantIdentifier) {
        this.tenantIdentifier = tenantIdentifier;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((("ChargingDataRequest {"+"sMSChargingInformation = ")+ sMSChargingInformation)+", ")+"supportedFeatures = ")+ supportedFeatures)+", ")+"serviceSpecificationInfo = ")+ serviceSpecificationInfo)+", ")+"nfConsumerIdentification = ")+ nfConsumerIdentification)+", ")+"chargingId = ")+ chargingId)+", ")+"nSPAChargingInformation = ")+ nSPAChargingInformation)+", ")+"nEFChargingInformation = ")+ nEFChargingInformation)+", ")+"registrationChargingInformation = ")+ registrationChargingInformation)+", ")+"invocationTimeStamp = ")+ invocationTimeStamp)+", ")+"pDUSessionChargingInformation = ")+ pDUSessionChargingInformation)+", ")+"retransmissionIndicator = ")+ retransmissionIndicator)+", ")+"oneTimeEventType = ")+ oneTimeEventType)+", ")+"triggers = ")+ triggers)+", ")+"subscriberIdentifier = ")+ subscriberIdentifier)+", ")+"invocationSequenceNumber = ")+ invocationSequenceNumber)+", ")+"n2ConnectionChargingInformation = ")+ n2ConnectionChargingInformation)+", ")+"mnSConsumerIdentifier = ")+ mnSConsumerIdentifier)+", ")+"roamingQBCInformation = ")+ roamingQBCInformation)+", ")+"multipleUnitUsage = ")+ multipleUnitUsage)+", ")+"notifyUri = ")+ notifyUri)+", ")+"nSMChargingInformation = ")+ nSMChargingInformation)+", ")+"locationReportingChargingInformation = ")+ locationReportingChargingInformation)+", ")+"oneTimeEvent = ")+ oneTimeEvent)+", ")+"tenantIdentifier = ")+ tenantIdentifier)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(sMSChargingInformation, supportedFeatures, serviceSpecificationInfo, nfConsumerIdentification, chargingId, nSPAChargingInformation, nEFChargingInformation, registrationChargingInformation, invocationTimeStamp, pDUSessionChargingInformation, retransmissionIndicator, oneTimeEventType, triggers, subscriberIdentifier, invocationSequenceNumber, n2ConnectionChargingInformation, mnSConsumerIdentifier, roamingQBCInformation, multipleUnitUsage, notifyUri, nSMChargingInformation, locationReportingChargingInformation, oneTimeEvent, tenantIdentifier);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        ChargingDataRequest castThat = ((ChargingDataRequest) that);
        return (((((((((((((((((((((((Objects.equals(this.sMSChargingInformation, castThat.sMSChargingInformation)&&Objects.equals(this.supportedFeatures, castThat.supportedFeatures))&&Objects.equals(this.serviceSpecificationInfo, castThat.serviceSpecificationInfo))&&Objects.equals(this.nfConsumerIdentification, castThat.nfConsumerIdentification))&&Objects.equals(this.chargingId, castThat.chargingId))&&Objects.equals(this.nSPAChargingInformation, castThat.nSPAChargingInformation))&&Objects.equals(this.nEFChargingInformation, castThat.nEFChargingInformation))&&Objects.equals(this.registrationChargingInformation, castThat.registrationChargingInformation))&&Objects.equals(this.invocationTimeStamp, castThat.invocationTimeStamp))&&Objects.equals(this.pDUSessionChargingInformation, castThat.pDUSessionChargingInformation))&&Objects.equals(this.retransmissionIndicator, castThat.retransmissionIndicator))&&Objects.equals(this.oneTimeEventType, castThat.oneTimeEventType))&&Objects.equals(this.triggers, castThat.triggers))&&Objects.equals(this.subscriberIdentifier, castThat.subscriberIdentifier))&&Objects.equals(this.invocationSequenceNumber, castThat.invocationSequenceNumber))&&Objects.equals(this.n2ConnectionChargingInformation, castThat.n2ConnectionChargingInformation))&&Objects.equals(this.mnSConsumerIdentifier, castThat.mnSConsumerIdentifier))&&Objects.equals(this.roamingQBCInformation, castThat.roamingQBCInformation))&&Objects.equals(this.multipleUnitUsage, castThat.multipleUnitUsage))&&Objects.equals(this.notifyUri, castThat.notifyUri))&&Objects.equals(this.nSMChargingInformation, castThat.nSMChargingInformation))&&Objects.equals(this.locationReportingChargingInformation, castThat.locationReportingChargingInformation))&&Objects.equals(this.oneTimeEvent, castThat.oneTimeEvent))&&Objects.equals(this.tenantIdentifier, castThat.tenantIdentifier));
    }
}
