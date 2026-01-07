
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Map;
import java.util.Objects;

public class LocationReportingChargingInformation {
    public Map<String, PresenceInfo> presenceReportingAreaInformation;
    public PSCellInformation pSCellInformation;
    public RatType rATType;
    public UserInformation userInformation;
    public String uetimeZone;
    public UserLocation userLocationinfo;
    public Integer locationReportingMessageType;

    public Map<String, PresenceInfo> getPresenceReportingAreaInformation() {
        return presenceReportingAreaInformation;
    }

    public void setPresenceReportingAreaInformation(Map<String, PresenceInfo> presenceReportingAreaInformation) {
        this.presenceReportingAreaInformation = presenceReportingAreaInformation;
    }

    public LocationReportingChargingInformation presenceReportingAreaInformation(Map<String, PresenceInfo> presenceReportingAreaInformation) {
        this.presenceReportingAreaInformation = presenceReportingAreaInformation;
        return this;
    }

    public PSCellInformation getpSCellInformation() {
        return pSCellInformation;
    }

    public void setpSCellInformation(PSCellInformation pSCellInformation) {
        this.pSCellInformation = pSCellInformation;
    }

    public LocationReportingChargingInformation pSCellInformation(PSCellInformation pSCellInformation) {
        this.pSCellInformation = pSCellInformation;
        return this;
    }

    public RatType getrATType() {
        return rATType;
    }

    public void setrATType(RatType rATType) {
        this.rATType = rATType;
    }

    public LocationReportingChargingInformation rATType(RatType rATType) {
        this.rATType = rATType;
        return this;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    public LocationReportingChargingInformation userInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
        return this;
    }

    public String getUetimeZone() {
        return uetimeZone;
    }

    public void setUetimeZone(String uetimeZone) {
        this.uetimeZone = uetimeZone;
    }

    public LocationReportingChargingInformation uetimeZone(String uetimeZone) {
        this.uetimeZone = uetimeZone;
        return this;
    }

    public UserLocation getUserLocationinfo() {
        return userLocationinfo;
    }

    public void setUserLocationinfo(UserLocation userLocationinfo) {
        this.userLocationinfo = userLocationinfo;
    }

    public LocationReportingChargingInformation userLocationinfo(UserLocation userLocationinfo) {
        this.userLocationinfo = userLocationinfo;
        return this;
    }

    public Integer getLocationReportingMessageType() {
        return locationReportingMessageType;
    }

    public void setLocationReportingMessageType(Integer locationReportingMessageType) {
        this.locationReportingMessageType = locationReportingMessageType;
    }

    public LocationReportingChargingInformation locationReportingMessageType(Integer locationReportingMessageType) {
        this.locationReportingMessageType = locationReportingMessageType;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((("LocationReportingChargingInformation {"+"presenceReportingAreaInformation = ")+ presenceReportingAreaInformation)+", ")+"pSCellInformation = ")+ pSCellInformation)+", ")+"rATType = ")+ rATType)+", ")+"userInformation = ")+ userInformation)+", ")+"uetimeZone = ")+ uetimeZone)+", ")+"userLocationinfo = ")+ userLocationinfo)+", ")+"locationReportingMessageType = ")+ locationReportingMessageType)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(presenceReportingAreaInformation, pSCellInformation, rATType, userInformation, uetimeZone, userLocationinfo, locationReportingMessageType);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        LocationReportingChargingInformation castThat = ((LocationReportingChargingInformation) that);
        return ((((((Objects.equals(this.presenceReportingAreaInformation, castThat.presenceReportingAreaInformation)&&Objects.equals(this.pSCellInformation, castThat.pSCellInformation))&&Objects.equals(this.rATType, castThat.rATType))&&Objects.equals(this.userInformation, castThat.userInformation))&&Objects.equals(this.uetimeZone, castThat.uetimeZone))&&Objects.equals(this.userLocationinfo, castThat.userLocationinfo))&&Objects.equals(this.locationReportingMessageType, castThat.locationReportingMessageType));
    }
}
