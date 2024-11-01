
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ChargingDataResponse {
    private List<MultipleUnitInformation> multipleUnitInformation;
    private InvocationResult invocationResult;
    private SessionFailover sessionFailover;
    private String supportedFeatures;
    private Integer invocationSequenceNumber;
    private Date invocationTimeStamp;
    private RoamingQBCInformation roamingQBCInformation;
    private PDUSessionChargingInformation pDUSessionChargingInformation;
    private List<Trigger> triggers;
    private LocationReportingChargingInformation locationReportingChargingInformation;

    public List<MultipleUnitInformation> getMultipleUnitInformation() {
        return multipleUnitInformation;
    }

    public void setMultipleUnitInformation(List<MultipleUnitInformation> multipleUnitInformation) {
        this.multipleUnitInformation = multipleUnitInformation;
    }

    public ChargingDataResponse multipleUnitInformation(List<MultipleUnitInformation> multipleUnitInformation) {
        this.multipleUnitInformation = multipleUnitInformation;
        return this;
    }

    public ChargingDataResponse addMultipleUnitInformationItem(MultipleUnitInformation item) {
        if (this.multipleUnitInformation == null) {
            this.multipleUnitInformation = new ArrayList();
        }
        this.multipleUnitInformation.add(item);
        return this;
    }

    public InvocationResult getInvocationResult() {
        return invocationResult;
    }

    public void setInvocationResult(InvocationResult invocationResult) {
        this.invocationResult = invocationResult;
    }

    public ChargingDataResponse invocationResult(InvocationResult invocationResult) {
        this.invocationResult = invocationResult;
        return this;
    }

    public SessionFailover getSessionFailover() {
        return sessionFailover;
    }

    public void setSessionFailover(SessionFailover sessionFailover) {
        this.sessionFailover = sessionFailover;
    }

    public ChargingDataResponse sessionFailover(SessionFailover sessionFailover) {
        this.sessionFailover = sessionFailover;
        return this;
    }

    public String getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }

    public ChargingDataResponse supportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
        return this;
    }

    public Integer getInvocationSequenceNumber() {
        return invocationSequenceNumber;
    }

    public void setInvocationSequenceNumber(Integer invocationSequenceNumber) {
        this.invocationSequenceNumber = invocationSequenceNumber;
    }

    public ChargingDataResponse invocationSequenceNumber(Integer invocationSequenceNumber) {
        this.invocationSequenceNumber = invocationSequenceNumber;
        return this;
    }

    public Date getInvocationTimeStamp() {
        return invocationTimeStamp;
    }

    public void setInvocationTimeStamp(Date invocationTimeStamp) {
        this.invocationTimeStamp = invocationTimeStamp;
    }

    public ChargingDataResponse invocationTimeStamp(Date invocationTimeStamp) {
        this.invocationTimeStamp = invocationTimeStamp;
        return this;
    }

    public RoamingQBCInformation getRoamingQBCInformation() {
        return roamingQBCInformation;
    }

    public void setRoamingQBCInformation(RoamingQBCInformation roamingQBCInformation) {
        this.roamingQBCInformation = roamingQBCInformation;
    }

    public ChargingDataResponse roamingQBCInformation(RoamingQBCInformation roamingQBCInformation) {
        this.roamingQBCInformation = roamingQBCInformation;
        return this;
    }

    public PDUSessionChargingInformation getpDUSessionChargingInformation() {
        return pDUSessionChargingInformation;
    }

    public void setpDUSessionChargingInformation(PDUSessionChargingInformation pDUSessionChargingInformation) {
        this.pDUSessionChargingInformation = pDUSessionChargingInformation;
    }

    public ChargingDataResponse pDUSessionChargingInformation(PDUSessionChargingInformation pDUSessionChargingInformation) {
        this.pDUSessionChargingInformation = pDUSessionChargingInformation;
        return this;
    }

    public List<Trigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    public ChargingDataResponse triggers(List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public ChargingDataResponse addTriggersItem(Trigger item) {
        if (this.triggers == null) {
            this.triggers = new ArrayList();
        }
        this.triggers.add(item);
        return this;
    }

    public LocationReportingChargingInformation getLocationReportingChargingInformation() {
        return locationReportingChargingInformation;
    }

    public void setLocationReportingChargingInformation(LocationReportingChargingInformation locationReportingChargingInformation) {
        this.locationReportingChargingInformation = locationReportingChargingInformation;
    }

    public ChargingDataResponse locationReportingChargingInformation(LocationReportingChargingInformation locationReportingChargingInformation) {
        this.locationReportingChargingInformation = locationReportingChargingInformation;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((((((((("ChargingDataResponse {"+"multipleUnitInformation = ")+ multipleUnitInformation)+", ")+"invocationResult = ")+ invocationResult)+", ")+"sessionFailover = ")+ sessionFailover)+", ")+"supportedFeatures = ")+ supportedFeatures)+", ")+"invocationSequenceNumber = ")+ invocationSequenceNumber)+", ")+"invocationTimeStamp = ")+ invocationTimeStamp)+", ")+"roamingQBCInformation = ")+ roamingQBCInformation)+", ")+"pDUSessionChargingInformation = ")+ pDUSessionChargingInformation)+", ")+"triggers = ")+ triggers)+", ")+"locationReportingChargingInformation = ")+ locationReportingChargingInformation)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(multipleUnitInformation, invocationResult, sessionFailover, supportedFeatures, invocationSequenceNumber, invocationTimeStamp, roamingQBCInformation, pDUSessionChargingInformation, triggers, locationReportingChargingInformation);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        ChargingDataResponse castThat = ((ChargingDataResponse) that);
        return (((((((((Objects.equals(this.multipleUnitInformation, castThat.multipleUnitInformation)&&Objects.equals(this.invocationResult, castThat.invocationResult))&&Objects.equals(this.sessionFailover, castThat.sessionFailover))&&Objects.equals(this.supportedFeatures, castThat.supportedFeatures))&&Objects.equals(this.invocationSequenceNumber, castThat.invocationSequenceNumber))&&Objects.equals(this.invocationTimeStamp, castThat.invocationTimeStamp))&&Objects.equals(this.roamingQBCInformation, castThat.roamingQBCInformation))&&Objects.equals(this.pDUSessionChargingInformation, castThat.pDUSessionChargingInformation))&&Objects.equals(this.triggers, castThat.triggers))&&Objects.equals(this.locationReportingChargingInformation, castThat.locationReportingChargingInformation));
    }
}
