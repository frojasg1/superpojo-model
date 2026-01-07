
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Date;
import java.util.Objects;

public class QosFlowsUsageReport {
    public Long uplinkVolume;
    public Long downlinkVolume;
    public Integer qFI;
    public Date endTimestamp;
    public Date startTimestamp;

    public Long getUplinkVolume() {
        return uplinkVolume;
    }

    public void setUplinkVolume(Long uplinkVolume) {
        this.uplinkVolume = uplinkVolume;
    }

    public QosFlowsUsageReport uplinkVolume(Long uplinkVolume) {
        this.uplinkVolume = uplinkVolume;
        return this;
    }

    public Long getDownlinkVolume() {
        return downlinkVolume;
    }

    public void setDownlinkVolume(Long downlinkVolume) {
        this.downlinkVolume = downlinkVolume;
    }

    public QosFlowsUsageReport downlinkVolume(Long downlinkVolume) {
        this.downlinkVolume = downlinkVolume;
        return this;
    }

    public Integer getqFI() {
        return qFI;
    }

    public void setqFI(Integer qFI) {
        this.qFI = qFI;
    }

    public QosFlowsUsageReport qFI(Integer qFI) {
        this.qFI = qFI;
        return this;
    }

    public Date getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public QosFlowsUsageReport endTimestamp(Date endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }

    public Date getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public QosFlowsUsageReport startTimestamp(Date startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((("QosFlowsUsageReport {"+"uplinkVolume = ")+ uplinkVolume)+", ")+"downlinkVolume = ")+ downlinkVolume)+", ")+"qFI = ")+ qFI)+", ")+"endTimestamp = ")+ endTimestamp)+", ")+"startTimestamp = ")+ startTimestamp)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(uplinkVolume, downlinkVolume, qFI, endTimestamp, startTimestamp);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        QosFlowsUsageReport castThat = ((QosFlowsUsageReport) that);
        return ((((Objects.equals(this.uplinkVolume, castThat.uplinkVolume)&&Objects.equals(this.downlinkVolume, castThat.downlinkVolume))&&Objects.equals(this.qFI, castThat.qFI))&&Objects.equals(this.endTimestamp, castThat.endTimestamp))&&Objects.equals(this.startTimestamp, castThat.startTimestamp));
    }
}
