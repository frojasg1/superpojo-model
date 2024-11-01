
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class MultipleQFIcontainer {
    private Long totalVolume;
    private Long downlinkVolume;
    private Long uplinkVolume;
    private Integer time;
    private QFIContainerInformation qFIContainerInformation;
    private List<Trigger> triggers;
    private Integer localSequenceNumber;
    private Date triggerTimestamp;

    public Long getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(Long totalVolume) {
        this.totalVolume = totalVolume;
    }

    public MultipleQFIcontainer totalVolume(Long totalVolume) {
        this.totalVolume = totalVolume;
        return this;
    }

    public Long getDownlinkVolume() {
        return downlinkVolume;
    }

    public void setDownlinkVolume(Long downlinkVolume) {
        this.downlinkVolume = downlinkVolume;
    }

    public MultipleQFIcontainer downlinkVolume(Long downlinkVolume) {
        this.downlinkVolume = downlinkVolume;
        return this;
    }

    public Long getUplinkVolume() {
        return uplinkVolume;
    }

    public void setUplinkVolume(Long uplinkVolume) {
        this.uplinkVolume = uplinkVolume;
    }

    public MultipleQFIcontainer uplinkVolume(Long uplinkVolume) {
        this.uplinkVolume = uplinkVolume;
        return this;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public MultipleQFIcontainer time(Integer time) {
        this.time = time;
        return this;
    }

    public QFIContainerInformation getqFIContainerInformation() {
        return qFIContainerInformation;
    }

    public void setqFIContainerInformation(QFIContainerInformation qFIContainerInformation) {
        this.qFIContainerInformation = qFIContainerInformation;
    }

    public MultipleQFIcontainer qFIContainerInformation(QFIContainerInformation qFIContainerInformation) {
        this.qFIContainerInformation = qFIContainerInformation;
        return this;
    }

    public List<Trigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    public MultipleQFIcontainer triggers(List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public MultipleQFIcontainer addTriggersItem(Trigger item) {
        if (this.triggers == null) {
            this.triggers = new ArrayList();
        }
        this.triggers.add(item);
        return this;
    }

    public Integer getLocalSequenceNumber() {
        return localSequenceNumber;
    }

    public void setLocalSequenceNumber(Integer localSequenceNumber) {
        this.localSequenceNumber = localSequenceNumber;
    }

    public MultipleQFIcontainer localSequenceNumber(Integer localSequenceNumber) {
        this.localSequenceNumber = localSequenceNumber;
        return this;
    }

    public Date getTriggerTimestamp() {
        return triggerTimestamp;
    }

    public void setTriggerTimestamp(Date triggerTimestamp) {
        this.triggerTimestamp = triggerTimestamp;
    }

    public MultipleQFIcontainer triggerTimestamp(Date triggerTimestamp) {
        this.triggerTimestamp = triggerTimestamp;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((("MultipleQFIcontainer {"+"totalVolume = ")+ totalVolume)+", ")+"downlinkVolume = ")+ downlinkVolume)+", ")+"uplinkVolume = ")+ uplinkVolume)+", ")+"time = ")+ time)+", ")+"qFIContainerInformation = ")+ qFIContainerInformation)+", ")+"triggers = ")+ triggers)+", ")+"localSequenceNumber = ")+ localSequenceNumber)+", ")+"triggerTimestamp = ")+ triggerTimestamp)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalVolume, downlinkVolume, uplinkVolume, time, qFIContainerInformation, triggers, localSequenceNumber, triggerTimestamp);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        MultipleQFIcontainer castThat = ((MultipleQFIcontainer) that);
        return (((((((Objects.equals(this.totalVolume, castThat.totalVolume)&&Objects.equals(this.downlinkVolume, castThat.downlinkVolume))&&Objects.equals(this.uplinkVolume, castThat.uplinkVolume))&&Objects.equals(this.time, castThat.time))&&Objects.equals(this.qFIContainerInformation, castThat.qFIContainerInformation))&&Objects.equals(this.triggers, castThat.triggers))&&Objects.equals(this.localSequenceNumber, castThat.localSequenceNumber))&&Objects.equals(this.triggerTimestamp, castThat.triggerTimestamp));
    }
}
