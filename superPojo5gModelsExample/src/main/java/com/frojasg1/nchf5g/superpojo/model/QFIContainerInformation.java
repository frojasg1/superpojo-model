
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class QFIContainerInformation {
    private RatType rATType;
    private QosCharacteristics qoSCharacteristics;
    private String uetimeZone;
    private List<String> enhancedDiagnostics;
    private UserLocation userLocationInformation;
    private List<ServingNetworkFunctionID> servingNetworkFunctionID;
    private Integer diagnostics;
    private Date timeofLastUsage;
    private Map<String, PresenceInfo> presenceReportingAreaInformation;
    private Integer qFI;
    private Date timeofFirstUsage;
    private QosData qoSInformation;
    private Date reportTime;

    public RatType getrATType() {
        return rATType;
    }

    public void setrATType(RatType rATType) {
        this.rATType = rATType;
    }

    public QFIContainerInformation rATType(RatType rATType) {
        this.rATType = rATType;
        return this;
    }

    public QosCharacteristics getQoSCharacteristics() {
        return qoSCharacteristics;
    }

    public void setQoSCharacteristics(QosCharacteristics qoSCharacteristics) {
        this.qoSCharacteristics = qoSCharacteristics;
    }

    public QFIContainerInformation qoSCharacteristics(QosCharacteristics qoSCharacteristics) {
        this.qoSCharacteristics = qoSCharacteristics;
        return this;
    }

    public String getUetimeZone() {
        return uetimeZone;
    }

    public void setUetimeZone(String uetimeZone) {
        this.uetimeZone = uetimeZone;
    }

    public QFIContainerInformation uetimeZone(String uetimeZone) {
        this.uetimeZone = uetimeZone;
        return this;
    }

    public List<String> getEnhancedDiagnostics() {
        return enhancedDiagnostics;
    }

    public void setEnhancedDiagnostics(List<String> enhancedDiagnostics) {
        this.enhancedDiagnostics = enhancedDiagnostics;
    }

    public QFIContainerInformation enhancedDiagnostics(List<String> enhancedDiagnostics) {
        this.enhancedDiagnostics = enhancedDiagnostics;
        return this;
    }

    public QFIContainerInformation addEnhancedDiagnosticsItem(String item) {
        if (this.enhancedDiagnostics == null) {
            this.enhancedDiagnostics = new ArrayList();
        }
        this.enhancedDiagnostics.add(item);
        return this;
    }

    public UserLocation getUserLocationInformation() {
        return userLocationInformation;
    }

    public void setUserLocationInformation(UserLocation userLocationInformation) {
        this.userLocationInformation = userLocationInformation;
    }

    public QFIContainerInformation userLocationInformation(UserLocation userLocationInformation) {
        this.userLocationInformation = userLocationInformation;
        return this;
    }

    public List<ServingNetworkFunctionID> getServingNetworkFunctionID() {
        return servingNetworkFunctionID;
    }

    public void setServingNetworkFunctionID(List<ServingNetworkFunctionID> servingNetworkFunctionID) {
        this.servingNetworkFunctionID = servingNetworkFunctionID;
    }

    public QFIContainerInformation servingNetworkFunctionID(List<ServingNetworkFunctionID> servingNetworkFunctionID) {
        this.servingNetworkFunctionID = servingNetworkFunctionID;
        return this;
    }

    public QFIContainerInformation addServingNetworkFunctionIDItem(ServingNetworkFunctionID item) {
        if (this.servingNetworkFunctionID == null) {
            this.servingNetworkFunctionID = new ArrayList();
        }
        this.servingNetworkFunctionID.add(item);
        return this;
    }

    public Integer getDiagnostics() {
        return diagnostics;
    }

    public void setDiagnostics(Integer diagnostics) {
        this.diagnostics = diagnostics;
    }

    public QFIContainerInformation diagnostics(Integer diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }

    public Date getTimeofLastUsage() {
        return timeofLastUsage;
    }

    public void setTimeofLastUsage(Date timeofLastUsage) {
        this.timeofLastUsage = timeofLastUsage;
    }

    public QFIContainerInformation timeofLastUsage(Date timeofLastUsage) {
        this.timeofLastUsage = timeofLastUsage;
        return this;
    }

    public Map<String, PresenceInfo> getPresenceReportingAreaInformation() {
        return presenceReportingAreaInformation;
    }

    public void setPresenceReportingAreaInformation(Map<String, PresenceInfo> presenceReportingAreaInformation) {
        this.presenceReportingAreaInformation = presenceReportingAreaInformation;
    }

    public QFIContainerInformation presenceReportingAreaInformation(Map<String, PresenceInfo> presenceReportingAreaInformation) {
        this.presenceReportingAreaInformation = presenceReportingAreaInformation;
        return this;
    }

    public Integer getqFI() {
        return qFI;
    }

    public void setqFI(Integer qFI) {
        this.qFI = qFI;
    }

    public QFIContainerInformation qFI(Integer qFI) {
        this.qFI = qFI;
        return this;
    }

    public Date getTimeofFirstUsage() {
        return timeofFirstUsage;
    }

    public void setTimeofFirstUsage(Date timeofFirstUsage) {
        this.timeofFirstUsage = timeofFirstUsage;
    }

    public QFIContainerInformation timeofFirstUsage(Date timeofFirstUsage) {
        this.timeofFirstUsage = timeofFirstUsage;
        return this;
    }

    public QosData getQoSInformation() {
        return qoSInformation;
    }

    public void setQoSInformation(QosData qoSInformation) {
        this.qoSInformation = qoSInformation;
    }

    public QFIContainerInformation qoSInformation(QosData qoSInformation) {
        this.qoSInformation = qoSInformation;
        return this;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public QFIContainerInformation reportTime(Date reportTime) {
        this.reportTime = reportTime;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((((((((((((((((((((("QFIContainerInformation {"+"rATType = ")+ rATType)+", ")+"qoSCharacteristics = ")+ qoSCharacteristics)+", ")+"uetimeZone = ")+ uetimeZone)+", ")+"enhancedDiagnostics = ")+ enhancedDiagnostics)+", ")+"userLocationInformation = ")+ userLocationInformation)+", ")+"servingNetworkFunctionID = ")+ servingNetworkFunctionID)+", ")+"diagnostics = ")+ diagnostics)+", ")+"timeofLastUsage = ")+ timeofLastUsage)+", ")+"presenceReportingAreaInformation = ")+ presenceReportingAreaInformation)+", ")+"qFI = ")+ qFI)+", ")+"timeofFirstUsage = ")+ timeofFirstUsage)+", ")+"qoSInformation = ")+ qoSInformation)+", ")+"reportTime = ")+ reportTime)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(rATType, qoSCharacteristics, uetimeZone, enhancedDiagnostics, userLocationInformation, servingNetworkFunctionID, diagnostics, timeofLastUsage, presenceReportingAreaInformation, qFI, timeofFirstUsage, qoSInformation, reportTime);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        QFIContainerInformation castThat = ((QFIContainerInformation) that);
        return ((((((((((((Objects.equals(this.rATType, castThat.rATType)&&Objects.equals(this.qoSCharacteristics, castThat.qoSCharacteristics))&&Objects.equals(this.uetimeZone, castThat.uetimeZone))&&Objects.equals(this.enhancedDiagnostics, castThat.enhancedDiagnostics))&&Objects.equals(this.userLocationInformation, castThat.userLocationInformation))&&Objects.equals(this.servingNetworkFunctionID, castThat.servingNetworkFunctionID))&&Objects.equals(this.diagnostics, castThat.diagnostics))&&Objects.equals(this.timeofLastUsage, castThat.timeofLastUsage))&&Objects.equals(this.presenceReportingAreaInformation, castThat.presenceReportingAreaInformation))&&Objects.equals(this.qFI, castThat.qFI))&&Objects.equals(this.timeofFirstUsage, castThat.timeofFirstUsage))&&Objects.equals(this.qoSInformation, castThat.qoSInformation))&&Objects.equals(this.reportTime, castThat.reportTime));
    }
}
