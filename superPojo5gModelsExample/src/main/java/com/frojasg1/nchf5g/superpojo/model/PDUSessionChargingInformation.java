
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class PDUSessionChargingInformation {
    private PDUSessionInformation pduSessionInformation;
    private Date non3GPPUserLocationTime;
    private Map<String, PresenceInfo> presenceReportingAreaInformation;
    private Integer chargingId;
    private UserInformation userInformation;
    private UserLocation mAPDUNon3GPPUserLocationInfo;
    private String uetimeZone;
    private RANSecondaryRATUsageReport rANSecondaryRATUsageReport;
    private Date userLocationTime;
    private Integer homeProvidedChargingId;
    private Date mAPDUNon3GPPUserLocationTime;
    private Integer unitCountInactivityTimer;
    private UserLocation userLocationinfo;

    public PDUSessionInformation getPduSessionInformation() {
        return pduSessionInformation;
    }

    public void setPduSessionInformation(PDUSessionInformation pduSessionInformation) {
        this.pduSessionInformation = pduSessionInformation;
    }

    public PDUSessionChargingInformation pduSessionInformation(PDUSessionInformation pduSessionInformation) {
        this.pduSessionInformation = pduSessionInformation;
        return this;
    }

    public Date getNon3GPPUserLocationTime() {
        return non3GPPUserLocationTime;
    }

    public void setNon3GPPUserLocationTime(Date non3GPPUserLocationTime) {
        this.non3GPPUserLocationTime = non3GPPUserLocationTime;
    }

    public PDUSessionChargingInformation non3GPPUserLocationTime(Date non3GPPUserLocationTime) {
        this.non3GPPUserLocationTime = non3GPPUserLocationTime;
        return this;
    }

    public Map<String, PresenceInfo> getPresenceReportingAreaInformation() {
        return presenceReportingAreaInformation;
    }

    public void setPresenceReportingAreaInformation(Map<String, PresenceInfo> presenceReportingAreaInformation) {
        this.presenceReportingAreaInformation = presenceReportingAreaInformation;
    }

    public PDUSessionChargingInformation presenceReportingAreaInformation(Map<String, PresenceInfo> presenceReportingAreaInformation) {
        this.presenceReportingAreaInformation = presenceReportingAreaInformation;
        return this;
    }

    public Integer getChargingId() {
        return chargingId;
    }

    public void setChargingId(Integer chargingId) {
        this.chargingId = chargingId;
    }

    public PDUSessionChargingInformation chargingId(Integer chargingId) {
        this.chargingId = chargingId;
        return this;
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    public PDUSessionChargingInformation userInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
        return this;
    }

    public UserLocation getmAPDUNon3GPPUserLocationInfo() {
        return mAPDUNon3GPPUserLocationInfo;
    }

    public void setmAPDUNon3GPPUserLocationInfo(UserLocation mAPDUNon3GPPUserLocationInfo) {
        this.mAPDUNon3GPPUserLocationInfo = mAPDUNon3GPPUserLocationInfo;
    }

    public PDUSessionChargingInformation mAPDUNon3GPPUserLocationInfo(UserLocation mAPDUNon3GPPUserLocationInfo) {
        this.mAPDUNon3GPPUserLocationInfo = mAPDUNon3GPPUserLocationInfo;
        return this;
    }

    public String getUetimeZone() {
        return uetimeZone;
    }

    public void setUetimeZone(String uetimeZone) {
        this.uetimeZone = uetimeZone;
    }

    public PDUSessionChargingInformation uetimeZone(String uetimeZone) {
        this.uetimeZone = uetimeZone;
        return this;
    }

    public RANSecondaryRATUsageReport getrANSecondaryRATUsageReport() {
        return rANSecondaryRATUsageReport;
    }

    public void setrANSecondaryRATUsageReport(RANSecondaryRATUsageReport rANSecondaryRATUsageReport) {
        this.rANSecondaryRATUsageReport = rANSecondaryRATUsageReport;
    }

    public PDUSessionChargingInformation rANSecondaryRATUsageReport(RANSecondaryRATUsageReport rANSecondaryRATUsageReport) {
        this.rANSecondaryRATUsageReport = rANSecondaryRATUsageReport;
        return this;
    }

    public Date getUserLocationTime() {
        return userLocationTime;
    }

    public void setUserLocationTime(Date userLocationTime) {
        this.userLocationTime = userLocationTime;
    }

    public PDUSessionChargingInformation userLocationTime(Date userLocationTime) {
        this.userLocationTime = userLocationTime;
        return this;
    }

    public Integer getHomeProvidedChargingId() {
        return homeProvidedChargingId;
    }

    public void setHomeProvidedChargingId(Integer homeProvidedChargingId) {
        this.homeProvidedChargingId = homeProvidedChargingId;
    }

    public PDUSessionChargingInformation homeProvidedChargingId(Integer homeProvidedChargingId) {
        this.homeProvidedChargingId = homeProvidedChargingId;
        return this;
    }

    public Date getmAPDUNon3GPPUserLocationTime() {
        return mAPDUNon3GPPUserLocationTime;
    }

    public void setmAPDUNon3GPPUserLocationTime(Date mAPDUNon3GPPUserLocationTime) {
        this.mAPDUNon3GPPUserLocationTime = mAPDUNon3GPPUserLocationTime;
    }

    public PDUSessionChargingInformation mAPDUNon3GPPUserLocationTime(Date mAPDUNon3GPPUserLocationTime) {
        this.mAPDUNon3GPPUserLocationTime = mAPDUNon3GPPUserLocationTime;
        return this;
    }

    public Integer getUnitCountInactivityTimer() {
        return unitCountInactivityTimer;
    }

    public void setUnitCountInactivityTimer(Integer unitCountInactivityTimer) {
        this.unitCountInactivityTimer = unitCountInactivityTimer;
    }

    public PDUSessionChargingInformation unitCountInactivityTimer(Integer unitCountInactivityTimer) {
        this.unitCountInactivityTimer = unitCountInactivityTimer;
        return this;
    }

    public UserLocation getUserLocationinfo() {
        return userLocationinfo;
    }

    public void setUserLocationinfo(UserLocation userLocationinfo) {
        this.userLocationinfo = userLocationinfo;
    }

    public PDUSessionChargingInformation userLocationinfo(UserLocation userLocationinfo) {
        this.userLocationinfo = userLocationinfo;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((((((((((((((((((((("PDUSessionChargingInformation {"+"pduSessionInformation = ")+ pduSessionInformation)+", ")+"non3GPPUserLocationTime = ")+ non3GPPUserLocationTime)+", ")+"presenceReportingAreaInformation = ")+ presenceReportingAreaInformation)+", ")+"chargingId = ")+ chargingId)+", ")+"userInformation = ")+ userInformation)+", ")+"mAPDUNon3GPPUserLocationInfo = ")+ mAPDUNon3GPPUserLocationInfo)+", ")+"uetimeZone = ")+ uetimeZone)+", ")+"rANSecondaryRATUsageReport = ")+ rANSecondaryRATUsageReport)+", ")+"userLocationTime = ")+ userLocationTime)+", ")+"homeProvidedChargingId = ")+ homeProvidedChargingId)+", ")+"mAPDUNon3GPPUserLocationTime = ")+ mAPDUNon3GPPUserLocationTime)+", ")+"unitCountInactivityTimer = ")+ unitCountInactivityTimer)+", ")+"userLocationinfo = ")+ userLocationinfo)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(pduSessionInformation, non3GPPUserLocationTime, presenceReportingAreaInformation, chargingId, userInformation, mAPDUNon3GPPUserLocationInfo, uetimeZone, rANSecondaryRATUsageReport, userLocationTime, homeProvidedChargingId, mAPDUNon3GPPUserLocationTime, unitCountInactivityTimer, userLocationinfo);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        PDUSessionChargingInformation castThat = ((PDUSessionChargingInformation) that);
        return ((((((((((((Objects.equals(this.pduSessionInformation, castThat.pduSessionInformation)&&Objects.equals(this.non3GPPUserLocationTime, castThat.non3GPPUserLocationTime))&&Objects.equals(this.presenceReportingAreaInformation, castThat.presenceReportingAreaInformation))&&Objects.equals(this.chargingId, castThat.chargingId))&&Objects.equals(this.userInformation, castThat.userInformation))&&Objects.equals(this.mAPDUNon3GPPUserLocationInfo, castThat.mAPDUNon3GPPUserLocationInfo))&&Objects.equals(this.uetimeZone, castThat.uetimeZone))&&Objects.equals(this.rANSecondaryRATUsageReport, castThat.rANSecondaryRATUsageReport))&&Objects.equals(this.userLocationTime, castThat.userLocationTime))&&Objects.equals(this.homeProvidedChargingId, castThat.homeProvidedChargingId))&&Objects.equals(this.mAPDUNon3GPPUserLocationTime, castThat.mAPDUNon3GPPUserLocationTime))&&Objects.equals(this.unitCountInactivityTimer, castThat.unitCountInactivityTimer))&&Objects.equals(this.userLocationinfo, castThat.userLocationinfo));
    }
}
