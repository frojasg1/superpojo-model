
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class QosCharacteristics {
    private Integer extMaxDataBurstVol;
    private Integer priorityLevel;
    private Integer maxDataBurstVol;
    private String packetErrorRate;
    private Integer packetDelayBudget;
    private Integer averagingWindow;
    private QosResourceType resourceType;

    public Integer getExtMaxDataBurstVol() {
        return extMaxDataBurstVol;
    }

    public void setExtMaxDataBurstVol(Integer extMaxDataBurstVol) {
        this.extMaxDataBurstVol = extMaxDataBurstVol;
    }

    public QosCharacteristics extMaxDataBurstVol(Integer extMaxDataBurstVol) {
        this.extMaxDataBurstVol = extMaxDataBurstVol;
        return this;
    }

    public Integer getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public QosCharacteristics priorityLevel(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
        return this;
    }

    public Integer getMaxDataBurstVol() {
        return maxDataBurstVol;
    }

    public void setMaxDataBurstVol(Integer maxDataBurstVol) {
        this.maxDataBurstVol = maxDataBurstVol;
    }

    public QosCharacteristics maxDataBurstVol(Integer maxDataBurstVol) {
        this.maxDataBurstVol = maxDataBurstVol;
        return this;
    }

    public String getPacketErrorRate() {
        return packetErrorRate;
    }

    public void setPacketErrorRate(String packetErrorRate) {
        this.packetErrorRate = packetErrorRate;
    }

    public QosCharacteristics packetErrorRate(String packetErrorRate) {
        this.packetErrorRate = packetErrorRate;
        return this;
    }

    public Integer getPacketDelayBudget() {
        return packetDelayBudget;
    }

    public void setPacketDelayBudget(Integer packetDelayBudget) {
        this.packetDelayBudget = packetDelayBudget;
    }

    public QosCharacteristics packetDelayBudget(Integer packetDelayBudget) {
        this.packetDelayBudget = packetDelayBudget;
        return this;
    }

    public Integer getAveragingWindow() {
        return averagingWindow;
    }

    public void setAveragingWindow(Integer averagingWindow) {
        this.averagingWindow = averagingWindow;
    }

    public QosCharacteristics averagingWindow(Integer averagingWindow) {
        this.averagingWindow = averagingWindow;
        return this;
    }

    public QosResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(QosResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public QosCharacteristics resourceType(QosResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((("QosCharacteristics {"+"extMaxDataBurstVol = ")+ extMaxDataBurstVol)+", ")+"priorityLevel = ")+ priorityLevel)+", ")+"maxDataBurstVol = ")+ maxDataBurstVol)+", ")+"packetErrorRate = ")+ packetErrorRate)+", ")+"packetDelayBudget = ")+ packetDelayBudget)+", ")+"averagingWindow = ")+ averagingWindow)+", ")+"resourceType = ")+ resourceType)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(extMaxDataBurstVol, priorityLevel, maxDataBurstVol, packetErrorRate, packetDelayBudget, averagingWindow, resourceType);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        QosCharacteristics castThat = ((QosCharacteristics) that);
        return ((((((Objects.equals(this.extMaxDataBurstVol, castThat.extMaxDataBurstVol)&&Objects.equals(this.priorityLevel, castThat.priorityLevel))&&Objects.equals(this.maxDataBurstVol, castThat.maxDataBurstVol))&&Objects.equals(this.packetErrorRate, castThat.packetErrorRate))&&Objects.equals(this.packetDelayBudget, castThat.packetDelayBudget))&&Objects.equals(this.averagingWindow, castThat.averagingWindow))&&Objects.equals(this.resourceType, castThat.resourceType));
    }
}
