
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Date;
import java.util.Objects;

public class GrantedUnit {
    private Long totalVolume;
    private Date tariffTimeChange;
    private Long downlinkVolume;
    private Long serviceSpecificUnits;
    private Long uplinkVolume;
    private Integer time;

    public Long getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(Long totalVolume) {
        this.totalVolume = totalVolume;
    }

    public GrantedUnit totalVolume(Long totalVolume) {
        this.totalVolume = totalVolume;
        return this;
    }

    public Date getTariffTimeChange() {
        return tariffTimeChange;
    }

    public void setTariffTimeChange(Date tariffTimeChange) {
        this.tariffTimeChange = tariffTimeChange;
    }

    public GrantedUnit tariffTimeChange(Date tariffTimeChange) {
        this.tariffTimeChange = tariffTimeChange;
        return this;
    }

    public Long getDownlinkVolume() {
        return downlinkVolume;
    }

    public void setDownlinkVolume(Long downlinkVolume) {
        this.downlinkVolume = downlinkVolume;
    }

    public GrantedUnit downlinkVolume(Long downlinkVolume) {
        this.downlinkVolume = downlinkVolume;
        return this;
    }

    public Long getServiceSpecificUnits() {
        return serviceSpecificUnits;
    }

    public void setServiceSpecificUnits(Long serviceSpecificUnits) {
        this.serviceSpecificUnits = serviceSpecificUnits;
    }

    public GrantedUnit serviceSpecificUnits(Long serviceSpecificUnits) {
        this.serviceSpecificUnits = serviceSpecificUnits;
        return this;
    }

    public Long getUplinkVolume() {
        return uplinkVolume;
    }

    public void setUplinkVolume(Long uplinkVolume) {
        this.uplinkVolume = uplinkVolume;
    }

    public GrantedUnit uplinkVolume(Long uplinkVolume) {
        this.uplinkVolume = uplinkVolume;
        return this;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public GrantedUnit time(Integer time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((("GrantedUnit {"+"totalVolume = ")+ totalVolume)+", ")+"tariffTimeChange = ")+ tariffTimeChange)+", ")+"downlinkVolume = ")+ downlinkVolume)+", ")+"serviceSpecificUnits = ")+ serviceSpecificUnits)+", ")+"uplinkVolume = ")+ uplinkVolume)+", ")+"time = ")+ time)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalVolume, tariffTimeChange, downlinkVolume, serviceSpecificUnits, uplinkVolume, time);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        GrantedUnit castThat = ((GrantedUnit) that);
        return (((((Objects.equals(this.totalVolume, castThat.totalVolume)&&Objects.equals(this.tariffTimeChange, castThat.tariffTimeChange))&&Objects.equals(this.downlinkVolume, castThat.downlinkVolume))&&Objects.equals(this.serviceSpecificUnits, castThat.serviceSpecificUnits))&&Objects.equals(this.uplinkVolume, castThat.uplinkVolume))&&Objects.equals(this.time, castThat.time));
    }
}
