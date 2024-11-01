
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class UsedUnitContainer {
    private NSPAContainerInformation nSPAContainerInformation;
    private Long totalVolume;
    private QuotaManagementIndicator quotaManagementIndicator;
    private List<Trigger> triggers;
    private PDUContainerInformation pDUContainerInformation;
    private Integer localSequenceNumber;
    private List<Date> eventTimeStamps;
    private Long downlinkVolume;
    private Long serviceSpecificUnits;
    private Long uplinkVolume;
    private Integer time;
    private Integer serviceId;
    private Date triggerTimestamp;

    public NSPAContainerInformation getnSPAContainerInformation() {
        return nSPAContainerInformation;
    }

    public void setnSPAContainerInformation(NSPAContainerInformation nSPAContainerInformation) {
        this.nSPAContainerInformation = nSPAContainerInformation;
    }

    public UsedUnitContainer nSPAContainerInformation(NSPAContainerInformation nSPAContainerInformation) {
        this.nSPAContainerInformation = nSPAContainerInformation;
        return this;
    }

    public Long getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(Long totalVolume) {
        this.totalVolume = totalVolume;
    }

    public UsedUnitContainer totalVolume(Long totalVolume) {
        this.totalVolume = totalVolume;
        return this;
    }

    public QuotaManagementIndicator getQuotaManagementIndicator() {
        return quotaManagementIndicator;
    }

    public void setQuotaManagementIndicator(QuotaManagementIndicator quotaManagementIndicator) {
        this.quotaManagementIndicator = quotaManagementIndicator;
    }

    public UsedUnitContainer quotaManagementIndicator(QuotaManagementIndicator quotaManagementIndicator) {
        this.quotaManagementIndicator = quotaManagementIndicator;
        return this;
    }

    public List<Trigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    public UsedUnitContainer triggers(List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public UsedUnitContainer addTriggersItem(Trigger item) {
        if (this.triggers == null) {
            this.triggers = new ArrayList();
        }
        this.triggers.add(item);
        return this;
    }

    public PDUContainerInformation getpDUContainerInformation() {
        return pDUContainerInformation;
    }

    public void setpDUContainerInformation(PDUContainerInformation pDUContainerInformation) {
        this.pDUContainerInformation = pDUContainerInformation;
    }

    public UsedUnitContainer pDUContainerInformation(PDUContainerInformation pDUContainerInformation) {
        this.pDUContainerInformation = pDUContainerInformation;
        return this;
    }

    public Integer getLocalSequenceNumber() {
        return localSequenceNumber;
    }

    public void setLocalSequenceNumber(Integer localSequenceNumber) {
        this.localSequenceNumber = localSequenceNumber;
    }

    public UsedUnitContainer localSequenceNumber(Integer localSequenceNumber) {
        this.localSequenceNumber = localSequenceNumber;
        return this;
    }

    public List<Date> getEventTimeStamps() {
        return eventTimeStamps;
    }

    public void setEventTimeStamps(List<Date> eventTimeStamps) {
        this.eventTimeStamps = eventTimeStamps;
    }

    public UsedUnitContainer eventTimeStamps(List<Date> eventTimeStamps) {
        this.eventTimeStamps = eventTimeStamps;
        return this;
    }

    public UsedUnitContainer addEventTimeStampsItem(Date item) {
        if (this.eventTimeStamps == null) {
            this.eventTimeStamps = new ArrayList();
        }
        this.eventTimeStamps.add(item);
        return this;
    }

    public Long getDownlinkVolume() {
        return downlinkVolume;
    }

    public void setDownlinkVolume(Long downlinkVolume) {
        this.downlinkVolume = downlinkVolume;
    }

    public UsedUnitContainer downlinkVolume(Long downlinkVolume) {
        this.downlinkVolume = downlinkVolume;
        return this;
    }

    public Long getServiceSpecificUnits() {
        return serviceSpecificUnits;
    }

    public void setServiceSpecificUnits(Long serviceSpecificUnits) {
        this.serviceSpecificUnits = serviceSpecificUnits;
    }

    public UsedUnitContainer serviceSpecificUnits(Long serviceSpecificUnits) {
        this.serviceSpecificUnits = serviceSpecificUnits;
        return this;
    }

    public Long getUplinkVolume() {
        return uplinkVolume;
    }

    public void setUplinkVolume(Long uplinkVolume) {
        this.uplinkVolume = uplinkVolume;
    }

    public UsedUnitContainer uplinkVolume(Long uplinkVolume) {
        this.uplinkVolume = uplinkVolume;
        return this;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public UsedUnitContainer time(Integer time) {
        this.time = time;
        return this;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public UsedUnitContainer serviceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public Date getTriggerTimestamp() {
        return triggerTimestamp;
    }

    public void setTriggerTimestamp(Date triggerTimestamp) {
        this.triggerTimestamp = triggerTimestamp;
    }

    public UsedUnitContainer triggerTimestamp(Date triggerTimestamp) {
        this.triggerTimestamp = triggerTimestamp;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((((((((((((((((((((("UsedUnitContainer {"+"nSPAContainerInformation = ")+ nSPAContainerInformation)+", ")+"totalVolume = ")+ totalVolume)+", ")+"quotaManagementIndicator = ")+ quotaManagementIndicator)+", ")+"triggers = ")+ triggers)+", ")+"pDUContainerInformation = ")+ pDUContainerInformation)+", ")+"localSequenceNumber = ")+ localSequenceNumber)+", ")+"eventTimeStamps = ")+ eventTimeStamps)+", ")+"downlinkVolume = ")+ downlinkVolume)+", ")+"serviceSpecificUnits = ")+ serviceSpecificUnits)+", ")+"uplinkVolume = ")+ uplinkVolume)+", ")+"time = ")+ time)+", ")+"serviceId = ")+ serviceId)+", ")+"triggerTimestamp = ")+ triggerTimestamp)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(nSPAContainerInformation, totalVolume, quotaManagementIndicator, triggers, pDUContainerInformation, localSequenceNumber, eventTimeStamps, downlinkVolume, serviceSpecificUnits, uplinkVolume, time, serviceId, triggerTimestamp);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        UsedUnitContainer castThat = ((UsedUnitContainer) that);
        return ((((((((((((Objects.equals(this.nSPAContainerInformation, castThat.nSPAContainerInformation)&&Objects.equals(this.totalVolume, castThat.totalVolume))&&Objects.equals(this.quotaManagementIndicator, castThat.quotaManagementIndicator))&&Objects.equals(this.triggers, castThat.triggers))&&Objects.equals(this.pDUContainerInformation, castThat.pDUContainerInformation))&&Objects.equals(this.localSequenceNumber, castThat.localSequenceNumber))&&Objects.equals(this.eventTimeStamps, castThat.eventTimeStamps))&&Objects.equals(this.downlinkVolume, castThat.downlinkVolume))&&Objects.equals(this.serviceSpecificUnits, castThat.serviceSpecificUnits))&&Objects.equals(this.uplinkVolume, castThat.uplinkVolume))&&Objects.equals(this.time, castThat.time))&&Objects.equals(this.serviceId, castThat.serviceId))&&Objects.equals(this.triggerTimestamp, castThat.triggerTimestamp));
    }
}
