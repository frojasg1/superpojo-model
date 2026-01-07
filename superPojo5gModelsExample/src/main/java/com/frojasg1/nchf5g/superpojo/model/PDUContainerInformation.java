
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PDUContainerInformation {
    public SteeringFunctionality mAPDUSteeringFunctionality;
    public String applicationserviceProviderIdentity;
    public SteeringMode mAPDUSteeringMode;
    public RatType rATType;
    public String chargingRuleBaseName;
    public QosCharacteristics qoSCharacteristics;
    public String afChargingIdString;
    public String uetimeZone;
    public UserLocation userLocationInformation;
    public Integer afChargingIdentifier;
    public Date timeofLastUsage;
    public Map<String, PresenceInfo> presenceReportingAreaInformation;
    public List<ServingNetworkFunctionID> servingNodeID;
    public String sponsorIdentity;
    public Date timeofFirstUsage;
    public QosData qoSInformation;
    public String aFCorrelationInformation;

    public SteeringFunctionality getmAPDUSteeringFunctionality() {
        return mAPDUSteeringFunctionality;
    }

    public void setmAPDUSteeringFunctionality(SteeringFunctionality mAPDUSteeringFunctionality) {
        this.mAPDUSteeringFunctionality = mAPDUSteeringFunctionality;
    }

    public PDUContainerInformation mAPDUSteeringFunctionality(SteeringFunctionality mAPDUSteeringFunctionality) {
        this.mAPDUSteeringFunctionality = mAPDUSteeringFunctionality;
        return this;
    }

    public String getApplicationserviceProviderIdentity() {
        return applicationserviceProviderIdentity;
    }

    public void setApplicationserviceProviderIdentity(String applicationserviceProviderIdentity) {
        this.applicationserviceProviderIdentity = applicationserviceProviderIdentity;
    }

    public PDUContainerInformation applicationserviceProviderIdentity(String applicationserviceProviderIdentity) {
        this.applicationserviceProviderIdentity = applicationserviceProviderIdentity;
        return this;
    }

    public SteeringMode getmAPDUSteeringMode() {
        return mAPDUSteeringMode;
    }

    public void setmAPDUSteeringMode(SteeringMode mAPDUSteeringMode) {
        this.mAPDUSteeringMode = mAPDUSteeringMode;
    }

    public PDUContainerInformation mAPDUSteeringMode(SteeringMode mAPDUSteeringMode) {
        this.mAPDUSteeringMode = mAPDUSteeringMode;
        return this;
    }

    public RatType getrATType() {
        return rATType;
    }

    public void setrATType(RatType rATType) {
        this.rATType = rATType;
    }

    public PDUContainerInformation rATType(RatType rATType) {
        this.rATType = rATType;
        return this;
    }

    public String getChargingRuleBaseName() {
        return chargingRuleBaseName;
    }

    public void setChargingRuleBaseName(String chargingRuleBaseName) {
        this.chargingRuleBaseName = chargingRuleBaseName;
    }

    public PDUContainerInformation chargingRuleBaseName(String chargingRuleBaseName) {
        this.chargingRuleBaseName = chargingRuleBaseName;
        return this;
    }

    public QosCharacteristics getQoSCharacteristics() {
        return qoSCharacteristics;
    }

    public void setQoSCharacteristics(QosCharacteristics qoSCharacteristics) {
        this.qoSCharacteristics = qoSCharacteristics;
    }

    public PDUContainerInformation qoSCharacteristics(QosCharacteristics qoSCharacteristics) {
        this.qoSCharacteristics = qoSCharacteristics;
        return this;
    }

    public String getAfChargingIdString() {
        return afChargingIdString;
    }

    public void setAfChargingIdString(String afChargingIdString) {
        this.afChargingIdString = afChargingIdString;
    }

    public PDUContainerInformation afChargingIdString(String afChargingIdString) {
        this.afChargingIdString = afChargingIdString;
        return this;
    }

    public String getUetimeZone() {
        return uetimeZone;
    }

    public void setUetimeZone(String uetimeZone) {
        this.uetimeZone = uetimeZone;
    }

    public PDUContainerInformation uetimeZone(String uetimeZone) {
        this.uetimeZone = uetimeZone;
        return this;
    }

    public UserLocation getUserLocationInformation() {
        return userLocationInformation;
    }

    public void setUserLocationInformation(UserLocation userLocationInformation) {
        this.userLocationInformation = userLocationInformation;
    }

    public PDUContainerInformation userLocationInformation(UserLocation userLocationInformation) {
        this.userLocationInformation = userLocationInformation;
        return this;
    }

    public Integer getAfChargingIdentifier() {
        return afChargingIdentifier;
    }

    public void setAfChargingIdentifier(Integer afChargingIdentifier) {
        this.afChargingIdentifier = afChargingIdentifier;
    }

    public PDUContainerInformation afChargingIdentifier(Integer afChargingIdentifier) {
        this.afChargingIdentifier = afChargingIdentifier;
        return this;
    }

    public Date getTimeofLastUsage() {
        return timeofLastUsage;
    }

    public void setTimeofLastUsage(Date timeofLastUsage) {
        this.timeofLastUsage = timeofLastUsage;
    }

    public PDUContainerInformation timeofLastUsage(Date timeofLastUsage) {
        this.timeofLastUsage = timeofLastUsage;
        return this;
    }

    public Map<String, PresenceInfo> getPresenceReportingAreaInformation() {
        return presenceReportingAreaInformation;
    }

    public void setPresenceReportingAreaInformation(Map<String, PresenceInfo> presenceReportingAreaInformation) {
        this.presenceReportingAreaInformation = presenceReportingAreaInformation;
    }

    public PDUContainerInformation presenceReportingAreaInformation(Map<String, PresenceInfo> presenceReportingAreaInformation) {
        this.presenceReportingAreaInformation = presenceReportingAreaInformation;
        return this;
    }

    public List<ServingNetworkFunctionID> getServingNodeID() {
        return servingNodeID;
    }

    public void setServingNodeID(List<ServingNetworkFunctionID> servingNodeID) {
        this.servingNodeID = servingNodeID;
    }

    public PDUContainerInformation servingNodeID(List<ServingNetworkFunctionID> servingNodeID) {
        this.servingNodeID = servingNodeID;
        return this;
    }

    public PDUContainerInformation addServingNodeIDItem(ServingNetworkFunctionID item) {
        if (this.servingNodeID == null) {
            this.servingNodeID = new ArrayList();
        }
        this.servingNodeID.add(item);
        return this;
    }

    public String getSponsorIdentity() {
        return sponsorIdentity;
    }

    public void setSponsorIdentity(String sponsorIdentity) {
        this.sponsorIdentity = sponsorIdentity;
    }

    public PDUContainerInformation sponsorIdentity(String sponsorIdentity) {
        this.sponsorIdentity = sponsorIdentity;
        return this;
    }

    public Date getTimeofFirstUsage() {
        return timeofFirstUsage;
    }

    public void setTimeofFirstUsage(Date timeofFirstUsage) {
        this.timeofFirstUsage = timeofFirstUsage;
    }

    public PDUContainerInformation timeofFirstUsage(Date timeofFirstUsage) {
        this.timeofFirstUsage = timeofFirstUsage;
        return this;
    }

    public QosData getQoSInformation() {
        return qoSInformation;
    }

    public void setQoSInformation(QosData qoSInformation) {
        this.qoSInformation = qoSInformation;
    }

    public PDUContainerInformation qoSInformation(QosData qoSInformation) {
        this.qoSInformation = qoSInformation;
        return this;
    }

    public String getaFCorrelationInformation() {
        return aFCorrelationInformation;
    }

    public void setaFCorrelationInformation(String aFCorrelationInformation) {
        this.aFCorrelationInformation = aFCorrelationInformation;
    }

    public PDUContainerInformation aFCorrelationInformation(String aFCorrelationInformation) {
        this.aFCorrelationInformation = aFCorrelationInformation;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((("PDUContainerInformation {"+"mAPDUSteeringFunctionality = ")+ mAPDUSteeringFunctionality)+", ")+"applicationserviceProviderIdentity = ")+ applicationserviceProviderIdentity)+", ")+"mAPDUSteeringMode = ")+ mAPDUSteeringMode)+", ")+"rATType = ")+ rATType)+", ")+"chargingRuleBaseName = ")+ chargingRuleBaseName)+", ")+"qoSCharacteristics = ")+ qoSCharacteristics)+", ")+"afChargingIdString = ")+ afChargingIdString)+", ")+"uetimeZone = ")+ uetimeZone)+", ")+"userLocationInformation = ")+ userLocationInformation)+", ")+"afChargingIdentifier = ")+ afChargingIdentifier)+", ")+"timeofLastUsage = ")+ timeofLastUsage)+", ")+"presenceReportingAreaInformation = ")+ presenceReportingAreaInformation)+", ")+"servingNodeID = ")+ servingNodeID)+", ")+"sponsorIdentity = ")+ sponsorIdentity)+", ")+"timeofFirstUsage = ")+ timeofFirstUsage)+", ")+"qoSInformation = ")+ qoSInformation)+", ")+"aFCorrelationInformation = ")+ aFCorrelationInformation)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(mAPDUSteeringFunctionality, applicationserviceProviderIdentity, mAPDUSteeringMode, rATType, chargingRuleBaseName, qoSCharacteristics, afChargingIdString, uetimeZone, userLocationInformation, afChargingIdentifier, timeofLastUsage, presenceReportingAreaInformation, servingNodeID, sponsorIdentity, timeofFirstUsage, qoSInformation, aFCorrelationInformation);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        PDUContainerInformation castThat = ((PDUContainerInformation) that);
        return ((((((((((((((((Objects.equals(this.mAPDUSteeringFunctionality, castThat.mAPDUSteeringFunctionality)&&Objects.equals(this.applicationserviceProviderIdentity, castThat.applicationserviceProviderIdentity))&&Objects.equals(this.mAPDUSteeringMode, castThat.mAPDUSteeringMode))&&Objects.equals(this.rATType, castThat.rATType))&&Objects.equals(this.chargingRuleBaseName, castThat.chargingRuleBaseName))&&Objects.equals(this.qoSCharacteristics, castThat.qoSCharacteristics))&&Objects.equals(this.afChargingIdString, castThat.afChargingIdString))&&Objects.equals(this.uetimeZone, castThat.uetimeZone))&&Objects.equals(this.userLocationInformation, castThat.userLocationInformation))&&Objects.equals(this.afChargingIdentifier, castThat.afChargingIdentifier))&&Objects.equals(this.timeofLastUsage, castThat.timeofLastUsage))&&Objects.equals(this.presenceReportingAreaInformation, castThat.presenceReportingAreaInformation))&&Objects.equals(this.servingNodeID, castThat.servingNodeID))&&Objects.equals(this.sponsorIdentity, castThat.sponsorIdentity))&&Objects.equals(this.timeofFirstUsage, castThat.timeofFirstUsage))&&Objects.equals(this.qoSInformation, castThat.qoSInformation))&&Objects.equals(this.aFCorrelationInformation, castThat.aFCorrelationInformation));
    }
}
