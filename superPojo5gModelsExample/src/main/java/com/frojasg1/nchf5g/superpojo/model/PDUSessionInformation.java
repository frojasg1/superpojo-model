
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class PDUSessionInformation {
    public String chargingCharacteristics;
    public PlmnId servingCNPlmnId;
    public Ambr subscribedSessionAMBR;
    public PDUAddress pduAddress;
    public SscMode sscMode;
    public Ambr authorizedSessionAMBR;
    public ChargingCharacteristicsSelectionMode chargingCharacteristicsSelectionMode;
    public RatType ratType;
    public NetworkSlicingInfo networkSlicingInfo;
    public String dnnId;
    public List<RanNasRelCause> enhancedDiagnostics;
    public PduSessionType pduType;
    public MAPDUSessionInformation mAPDUSessionInformation;
    public PlmnId hPlmnId;
    public ServingNetworkFunctionID servingNetworkFunctionID;
    public Integer diagnostics;
    public DnnSelectionMode dnnSelectionMode;
    public RatType mAPDUNon3GPPRATType;
    public AuthorizedDefaultQos authorizedQoSInformation;
    public Date startTime;
    public Date stopTime;
    public Boolean sessionStopIndicator;
    public Integer pduSessionID;
    public SubscribedDefaultQos subscribedQoSInformation;

    public String getChargingCharacteristics() {
        return chargingCharacteristics;
    }

    public void setChargingCharacteristics(String chargingCharacteristics) {
        this.chargingCharacteristics = chargingCharacteristics;
    }

    public PDUSessionInformation chargingCharacteristics(String chargingCharacteristics) {
        this.chargingCharacteristics = chargingCharacteristics;
        return this;
    }

    public PlmnId getServingCNPlmnId() {
        return servingCNPlmnId;
    }

    public void setServingCNPlmnId(PlmnId servingCNPlmnId) {
        this.servingCNPlmnId = servingCNPlmnId;
    }

    public PDUSessionInformation servingCNPlmnId(PlmnId servingCNPlmnId) {
        this.servingCNPlmnId = servingCNPlmnId;
        return this;
    }

    public Ambr getSubscribedSessionAMBR() {
        return subscribedSessionAMBR;
    }

    public void setSubscribedSessionAMBR(Ambr subscribedSessionAMBR) {
        this.subscribedSessionAMBR = subscribedSessionAMBR;
    }

    public PDUSessionInformation subscribedSessionAMBR(Ambr subscribedSessionAMBR) {
        this.subscribedSessionAMBR = subscribedSessionAMBR;
        return this;
    }

    public PDUAddress getPduAddress() {
        return pduAddress;
    }

    public void setPduAddress(PDUAddress pduAddress) {
        this.pduAddress = pduAddress;
    }

    public PDUSessionInformation pduAddress(PDUAddress pduAddress) {
        this.pduAddress = pduAddress;
        return this;
    }

    public SscMode getSscMode() {
        return sscMode;
    }

    public void setSscMode(SscMode sscMode) {
        this.sscMode = sscMode;
    }

    public PDUSessionInformation sscMode(SscMode sscMode) {
        this.sscMode = sscMode;
        return this;
    }

    public Ambr getAuthorizedSessionAMBR() {
        return authorizedSessionAMBR;
    }

    public void setAuthorizedSessionAMBR(Ambr authorizedSessionAMBR) {
        this.authorizedSessionAMBR = authorizedSessionAMBR;
    }

    public PDUSessionInformation authorizedSessionAMBR(Ambr authorizedSessionAMBR) {
        this.authorizedSessionAMBR = authorizedSessionAMBR;
        return this;
    }

    public ChargingCharacteristicsSelectionMode getChargingCharacteristicsSelectionMode() {
        return chargingCharacteristicsSelectionMode;
    }

    public void setChargingCharacteristicsSelectionMode(ChargingCharacteristicsSelectionMode chargingCharacteristicsSelectionMode) {
        this.chargingCharacteristicsSelectionMode = chargingCharacteristicsSelectionMode;
    }

    public PDUSessionInformation chargingCharacteristicsSelectionMode(ChargingCharacteristicsSelectionMode chargingCharacteristicsSelectionMode) {
        this.chargingCharacteristicsSelectionMode = chargingCharacteristicsSelectionMode;
        return this;
    }

    public RatType getRatType() {
        return ratType;
    }

    public void setRatType(RatType ratType) {
        this.ratType = ratType;
    }

    public PDUSessionInformation ratType(RatType ratType) {
        this.ratType = ratType;
        return this;
    }

    public NetworkSlicingInfo getNetworkSlicingInfo() {
        return networkSlicingInfo;
    }

    public void setNetworkSlicingInfo(NetworkSlicingInfo networkSlicingInfo) {
        this.networkSlicingInfo = networkSlicingInfo;
    }

    public PDUSessionInformation networkSlicingInfo(NetworkSlicingInfo networkSlicingInfo) {
        this.networkSlicingInfo = networkSlicingInfo;
        return this;
    }

    public String getDnnId() {
        return dnnId;
    }

    public void setDnnId(String dnnId) {
        this.dnnId = dnnId;
    }

    public PDUSessionInformation dnnId(String dnnId) {
        this.dnnId = dnnId;
        return this;
    }

    public List<RanNasRelCause> getEnhancedDiagnostics() {
        return enhancedDiagnostics;
    }

    public void setEnhancedDiagnostics(List<RanNasRelCause> enhancedDiagnostics) {
        this.enhancedDiagnostics = enhancedDiagnostics;
    }

    public PDUSessionInformation enhancedDiagnostics(List<RanNasRelCause> enhancedDiagnostics) {
        this.enhancedDiagnostics = enhancedDiagnostics;
        return this;
    }

    public PDUSessionInformation addEnhancedDiagnosticsItem(RanNasRelCause item) {
        if (this.enhancedDiagnostics == null) {
            this.enhancedDiagnostics = new ArrayList();
        }
        this.enhancedDiagnostics.add(item);
        return this;
    }

    public PduSessionType getPduType() {
        return pduType;
    }

    public void setPduType(PduSessionType pduType) {
        this.pduType = pduType;
    }

    public PDUSessionInformation pduType(PduSessionType pduType) {
        this.pduType = pduType;
        return this;
    }

    public MAPDUSessionInformation getmAPDUSessionInformation() {
        return mAPDUSessionInformation;
    }

    public void setmAPDUSessionInformation(MAPDUSessionInformation mAPDUSessionInformation) {
        this.mAPDUSessionInformation = mAPDUSessionInformation;
    }

    public PDUSessionInformation mAPDUSessionInformation(MAPDUSessionInformation mAPDUSessionInformation) {
        this.mAPDUSessionInformation = mAPDUSessionInformation;
        return this;
    }

    public PlmnId gethPlmnId() {
        return hPlmnId;
    }

    public void sethPlmnId(PlmnId hPlmnId) {
        this.hPlmnId = hPlmnId;
    }

    public PDUSessionInformation hPlmnId(PlmnId hPlmnId) {
        this.hPlmnId = hPlmnId;
        return this;
    }

    public ServingNetworkFunctionID getServingNetworkFunctionID() {
        return servingNetworkFunctionID;
    }

    public void setServingNetworkFunctionID(ServingNetworkFunctionID servingNetworkFunctionID) {
        this.servingNetworkFunctionID = servingNetworkFunctionID;
    }

    public PDUSessionInformation servingNetworkFunctionID(ServingNetworkFunctionID servingNetworkFunctionID) {
        this.servingNetworkFunctionID = servingNetworkFunctionID;
        return this;
    }

    public Integer getDiagnostics() {
        return diagnostics;
    }

    public void setDiagnostics(Integer diagnostics) {
        this.diagnostics = diagnostics;
    }

    public PDUSessionInformation diagnostics(Integer diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }

    public DnnSelectionMode getDnnSelectionMode() {
        return dnnSelectionMode;
    }

    public void setDnnSelectionMode(DnnSelectionMode dnnSelectionMode) {
        this.dnnSelectionMode = dnnSelectionMode;
    }

    public PDUSessionInformation dnnSelectionMode(DnnSelectionMode dnnSelectionMode) {
        this.dnnSelectionMode = dnnSelectionMode;
        return this;
    }

    public RatType getmAPDUNon3GPPRATType() {
        return mAPDUNon3GPPRATType;
    }

    public void setmAPDUNon3GPPRATType(RatType mAPDUNon3GPPRATType) {
        this.mAPDUNon3GPPRATType = mAPDUNon3GPPRATType;
    }

    public PDUSessionInformation mAPDUNon3GPPRATType(RatType mAPDUNon3GPPRATType) {
        this.mAPDUNon3GPPRATType = mAPDUNon3GPPRATType;
        return this;
    }

    public AuthorizedDefaultQos getAuthorizedQoSInformation() {
        return authorizedQoSInformation;
    }

    public void setAuthorizedQoSInformation(AuthorizedDefaultQos authorizedQoSInformation) {
        this.authorizedQoSInformation = authorizedQoSInformation;
    }

    public PDUSessionInformation authorizedQoSInformation(AuthorizedDefaultQos authorizedQoSInformation) {
        this.authorizedQoSInformation = authorizedQoSInformation;
        return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public PDUSessionInformation startTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public PDUSessionInformation stopTime(Date stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    public Boolean getSessionStopIndicator() {
        return sessionStopIndicator;
    }

    public void setSessionStopIndicator(Boolean sessionStopIndicator) {
        this.sessionStopIndicator = sessionStopIndicator;
    }

    public PDUSessionInformation sessionStopIndicator(Boolean sessionStopIndicator) {
        this.sessionStopIndicator = sessionStopIndicator;
        return this;
    }

    public Integer getPduSessionID() {
        return pduSessionID;
    }

    public void setPduSessionID(Integer pduSessionID) {
        this.pduSessionID = pduSessionID;
    }

    public PDUSessionInformation pduSessionID(Integer pduSessionID) {
        this.pduSessionID = pduSessionID;
        return this;
    }

    public SubscribedDefaultQos getSubscribedQoSInformation() {
        return subscribedQoSInformation;
    }

    public void setSubscribedQoSInformation(SubscribedDefaultQos subscribedQoSInformation) {
        this.subscribedQoSInformation = subscribedQoSInformation;
    }

    public PDUSessionInformation subscribedQoSInformation(SubscribedDefaultQos subscribedQoSInformation) {
        this.subscribedQoSInformation = subscribedQoSInformation;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((("PDUSessionInformation {"+"chargingCharacteristics = ")+ chargingCharacteristics)+", ")+"servingCNPlmnId = ")+ servingCNPlmnId)+", ")+"subscribedSessionAMBR = ")+ subscribedSessionAMBR)+", ")+"pduAddress = ")+ pduAddress)+", ")+"sscMode = ")+ sscMode)+", ")+"authorizedSessionAMBR = ")+ authorizedSessionAMBR)+", ")+"chargingCharacteristicsSelectionMode = ")+ chargingCharacteristicsSelectionMode)+", ")+"ratType = ")+ ratType)+", ")+"networkSlicingInfo = ")+ networkSlicingInfo)+", ")+"dnnId = ")+ dnnId)+", ")+"enhancedDiagnostics = ")+ enhancedDiagnostics)+", ")+"pduType = ")+ pduType)+", ")+"mAPDUSessionInformation = ")+ mAPDUSessionInformation)+", ")+"hPlmnId = ")+ hPlmnId)+", ")+"servingNetworkFunctionID = ")+ servingNetworkFunctionID)+", ")+"diagnostics = ")+ diagnostics)+", ")+"dnnSelectionMode = ")+ dnnSelectionMode)+", ")+"mAPDUNon3GPPRATType = ")+ mAPDUNon3GPPRATType)+", ")+"authorizedQoSInformation = ")+ authorizedQoSInformation)+", ")+"startTime = ")+ startTime)+", ")+"stopTime = ")+ stopTime)+", ")+"sessionStopIndicator = ")+ sessionStopIndicator)+", ")+"pduSessionID = ")+ pduSessionID)+", ")+"subscribedQoSInformation = ")+ subscribedQoSInformation)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingCharacteristics, servingCNPlmnId, subscribedSessionAMBR, pduAddress, sscMode, authorizedSessionAMBR, chargingCharacteristicsSelectionMode, ratType, networkSlicingInfo, dnnId, enhancedDiagnostics, pduType, mAPDUSessionInformation, hPlmnId, servingNetworkFunctionID, diagnostics, dnnSelectionMode, mAPDUNon3GPPRATType, authorizedQoSInformation, startTime, stopTime, sessionStopIndicator, pduSessionID, subscribedQoSInformation);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        PDUSessionInformation castThat = ((PDUSessionInformation) that);
        return (((((((((((((((((((((((Objects.equals(this.chargingCharacteristics, castThat.chargingCharacteristics)&&Objects.equals(this.servingCNPlmnId, castThat.servingCNPlmnId))&&Objects.equals(this.subscribedSessionAMBR, castThat.subscribedSessionAMBR))&&Objects.equals(this.pduAddress, castThat.pduAddress))&&Objects.equals(this.sscMode, castThat.sscMode))&&Objects.equals(this.authorizedSessionAMBR, castThat.authorizedSessionAMBR))&&Objects.equals(this.chargingCharacteristicsSelectionMode, castThat.chargingCharacteristicsSelectionMode))&&Objects.equals(this.ratType, castThat.ratType))&&Objects.equals(this.networkSlicingInfo, castThat.networkSlicingInfo))&&Objects.equals(this.dnnId, castThat.dnnId))&&Objects.equals(this.enhancedDiagnostics, castThat.enhancedDiagnostics))&&Objects.equals(this.pduType, castThat.pduType))&&Objects.equals(this.mAPDUSessionInformation, castThat.mAPDUSessionInformation))&&Objects.equals(this.hPlmnId, castThat.hPlmnId))&&Objects.equals(this.servingNetworkFunctionID, castThat.servingNetworkFunctionID))&&Objects.equals(this.diagnostics, castThat.diagnostics))&&Objects.equals(this.dnnSelectionMode, castThat.dnnSelectionMode))&&Objects.equals(this.mAPDUNon3GPPRATType, castThat.mAPDUNon3GPPRATType))&&Objects.equals(this.authorizedQoSInformation, castThat.authorizedQoSInformation))&&Objects.equals(this.startTime, castThat.startTime))&&Objects.equals(this.stopTime, castThat.stopTime))&&Objects.equals(this.sessionStopIndicator, castThat.sessionStopIndicator))&&Objects.equals(this.pduSessionID, castThat.pduSessionID))&&Objects.equals(this.subscribedQoSInformation, castThat.subscribedQoSInformation));
    }
}
