
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class RequestedUnit {
    private Long totalVolume;
    private Long uplinkVolume;
    private Long downlinkVolume;
    private Long serviceSpecificUnits;
    private Integer time;

    public Long getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(Long totalVolume) {
        this.totalVolume = totalVolume;
    }

    public RequestedUnit totalVolume(Long totalVolume) {
        this.totalVolume = totalVolume;
        return this;
    }

    public Long getUplinkVolume() {
        return uplinkVolume;
    }

    public void setUplinkVolume(Long uplinkVolume) {
        this.uplinkVolume = uplinkVolume;
    }

    public RequestedUnit uplinkVolume(Long uplinkVolume) {
        this.uplinkVolume = uplinkVolume;
        return this;
    }

    public Long getDownlinkVolume() {
        return downlinkVolume;
    }

    public void setDownlinkVolume(Long downlinkVolume) {
        this.downlinkVolume = downlinkVolume;
    }

    public RequestedUnit downlinkVolume(Long downlinkVolume) {
        this.downlinkVolume = downlinkVolume;
        return this;
    }

    public Long getServiceSpecificUnits() {
        return serviceSpecificUnits;
    }

    public void setServiceSpecificUnits(Long serviceSpecificUnits) {
        this.serviceSpecificUnits = serviceSpecificUnits;
    }

    public RequestedUnit serviceSpecificUnits(Long serviceSpecificUnits) {
        this.serviceSpecificUnits = serviceSpecificUnits;
        return this;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public RequestedUnit time(Integer time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((("RequestedUnit {"+"totalVolume = ")+ totalVolume)+", ")+"uplinkVolume = ")+ uplinkVolume)+", ")+"downlinkVolume = ")+ downlinkVolume)+", ")+"serviceSpecificUnits = ")+ serviceSpecificUnits)+", ")+"time = ")+ time)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalVolume, uplinkVolume, downlinkVolume, serviceSpecificUnits, time);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        RequestedUnit castThat = ((RequestedUnit) that);
        return ((((Objects.equals(this.totalVolume, castThat.totalVolume)&&Objects.equals(this.uplinkVolume, castThat.uplinkVolume))&&Objects.equals(this.downlinkVolume, castThat.downlinkVolume))&&Objects.equals(this.serviceSpecificUnits, castThat.serviceSpecificUnits))&&Objects.equals(this.time, castThat.time));
    }
}
