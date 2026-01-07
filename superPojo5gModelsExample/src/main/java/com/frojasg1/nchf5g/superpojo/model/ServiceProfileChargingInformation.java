
package com.frojasg1.nchf5g.superpojo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServiceProfileChargingInformation {
    public Integer supportedAccessTechnology;
    public Integer maxNumberofUEs;
    public Integer latency;
    public String reliability;
    public String serviceProfileIdentifier;
    public Throughput dLThptPerSlice;
    public BigDecimal availability;
    public String kPIMonitoringList;
    public List<Snssai> sNSSAIList;
    public Integer jitter;
    public Throughput dLThptPerUE;
    public Throughput uLThptPerUE;
    public String addServiceProfileInfo;
    public Integer maxNumberofPDUsessions;
    public Throughput uLThptPerSlice;
    public String coverageArea;

    public Integer getSupportedAccessTechnology() {
        return supportedAccessTechnology;
    }

    public void setSupportedAccessTechnology(Integer supportedAccessTechnology) {
        this.supportedAccessTechnology = supportedAccessTechnology;
    }

    public ServiceProfileChargingInformation supportedAccessTechnology(Integer supportedAccessTechnology) {
        this.supportedAccessTechnology = supportedAccessTechnology;
        return this;
    }

    public Integer getMaxNumberofUEs() {
        return maxNumberofUEs;
    }

    public void setMaxNumberofUEs(Integer maxNumberofUEs) {
        this.maxNumberofUEs = maxNumberofUEs;
    }

    public ServiceProfileChargingInformation maxNumberofUEs(Integer maxNumberofUEs) {
        this.maxNumberofUEs = maxNumberofUEs;
        return this;
    }

    public Integer getLatency() {
        return latency;
    }

    public void setLatency(Integer latency) {
        this.latency = latency;
    }

    public ServiceProfileChargingInformation latency(Integer latency) {
        this.latency = latency;
        return this;
    }

    public String getReliability() {
        return reliability;
    }

    public void setReliability(String reliability) {
        this.reliability = reliability;
    }

    public ServiceProfileChargingInformation reliability(String reliability) {
        this.reliability = reliability;
        return this;
    }

    public String getServiceProfileIdentifier() {
        return serviceProfileIdentifier;
    }

    public void setServiceProfileIdentifier(String serviceProfileIdentifier) {
        this.serviceProfileIdentifier = serviceProfileIdentifier;
    }

    public ServiceProfileChargingInformation serviceProfileIdentifier(String serviceProfileIdentifier) {
        this.serviceProfileIdentifier = serviceProfileIdentifier;
        return this;
    }

    public Throughput getdLThptPerSlice() {
        return dLThptPerSlice;
    }

    public void setdLThptPerSlice(Throughput dLThptPerSlice) {
        this.dLThptPerSlice = dLThptPerSlice;
    }

    public ServiceProfileChargingInformation dLThptPerSlice(Throughput dLThptPerSlice) {
        this.dLThptPerSlice = dLThptPerSlice;
        return this;
    }

    public BigDecimal getAvailability() {
        return availability;
    }

    public void setAvailability(BigDecimal availability) {
        this.availability = availability;
    }

    public ServiceProfileChargingInformation availability(BigDecimal availability) {
        this.availability = availability;
        return this;
    }

    public String getkPIMonitoringList() {
        return kPIMonitoringList;
    }

    public void setkPIMonitoringList(String kPIMonitoringList) {
        this.kPIMonitoringList = kPIMonitoringList;
    }

    public ServiceProfileChargingInformation kPIMonitoringList(String kPIMonitoringList) {
        this.kPIMonitoringList = kPIMonitoringList;
        return this;
    }

    public List<Snssai> getsNSSAIList() {
        return sNSSAIList;
    }

    public void setsNSSAIList(List<Snssai> sNSSAIList) {
        this.sNSSAIList = sNSSAIList;
    }

    public ServiceProfileChargingInformation sNSSAIList(List<Snssai> sNSSAIList) {
        this.sNSSAIList = sNSSAIList;
        return this;
    }

    public ServiceProfileChargingInformation addSNSSAIListItem(Snssai item) {
        if (this.sNSSAIList == null) {
            this.sNSSAIList = new ArrayList();
        }
        this.sNSSAIList.add(item);
        return this;
    }

    public Integer getJitter() {
        return jitter;
    }

    public void setJitter(Integer jitter) {
        this.jitter = jitter;
    }

    public ServiceProfileChargingInformation jitter(Integer jitter) {
        this.jitter = jitter;
        return this;
    }

    public Throughput getdLThptPerUE() {
        return dLThptPerUE;
    }

    public void setdLThptPerUE(Throughput dLThptPerUE) {
        this.dLThptPerUE = dLThptPerUE;
    }

    public ServiceProfileChargingInformation dLThptPerUE(Throughput dLThptPerUE) {
        this.dLThptPerUE = dLThptPerUE;
        return this;
    }

    public Throughput getuLThptPerUE() {
        return uLThptPerUE;
    }

    public void setuLThptPerUE(Throughput uLThptPerUE) {
        this.uLThptPerUE = uLThptPerUE;
    }

    public ServiceProfileChargingInformation uLThptPerUE(Throughput uLThptPerUE) {
        this.uLThptPerUE = uLThptPerUE;
        return this;
    }

    public String getAddServiceProfileInfo() {
        return addServiceProfileInfo;
    }

    public void setAddServiceProfileInfo(String addServiceProfileInfo) {
        this.addServiceProfileInfo = addServiceProfileInfo;
    }

    public ServiceProfileChargingInformation addServiceProfileInfo(String addServiceProfileInfo) {
        this.addServiceProfileInfo = addServiceProfileInfo;
        return this;
    }

    public Integer getMaxNumberofPDUsessions() {
        return maxNumberofPDUsessions;
    }

    public void setMaxNumberofPDUsessions(Integer maxNumberofPDUsessions) {
        this.maxNumberofPDUsessions = maxNumberofPDUsessions;
    }

    public ServiceProfileChargingInformation maxNumberofPDUsessions(Integer maxNumberofPDUsessions) {
        this.maxNumberofPDUsessions = maxNumberofPDUsessions;
        return this;
    }

    public Throughput getuLThptPerSlice() {
        return uLThptPerSlice;
    }

    public void setuLThptPerSlice(Throughput uLThptPerSlice) {
        this.uLThptPerSlice = uLThptPerSlice;
    }

    public ServiceProfileChargingInformation uLThptPerSlice(Throughput uLThptPerSlice) {
        this.uLThptPerSlice = uLThptPerSlice;
        return this;
    }

    public String getCoverageArea() {
        return coverageArea;
    }

    public void setCoverageArea(String coverageArea) {
        this.coverageArea = coverageArea;
    }

    public ServiceProfileChargingInformation coverageArea(String coverageArea) {
        this.coverageArea = coverageArea;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((((((((((((((((((((((((((("ServiceProfileChargingInformation {"+"supportedAccessTechnology = ")+ supportedAccessTechnology)+", ")+"maxNumberofUEs = ")+ maxNumberofUEs)+", ")+"latency = ")+ latency)+", ")+"reliability = ")+ reliability)+", ")+"serviceProfileIdentifier = ")+ serviceProfileIdentifier)+", ")+"dLThptPerSlice = ")+ dLThptPerSlice)+", ")+"availability = ")+ availability)+", ")+"kPIMonitoringList = ")+ kPIMonitoringList)+", ")+"sNSSAIList = ")+ sNSSAIList)+", ")+"jitter = ")+ jitter)+", ")+"dLThptPerUE = ")+ dLThptPerUE)+", ")+"uLThptPerUE = ")+ uLThptPerUE)+", ")+"addServiceProfileInfo = ")+ addServiceProfileInfo)+", ")+"maxNumberofPDUsessions = ")+ maxNumberofPDUsessions)+", ")+"uLThptPerSlice = ")+ uLThptPerSlice)+", ")+"coverageArea = ")+ coverageArea)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportedAccessTechnology, maxNumberofUEs, latency, reliability, serviceProfileIdentifier, dLThptPerSlice, availability, kPIMonitoringList, sNSSAIList, jitter, dLThptPerUE, uLThptPerUE, addServiceProfileInfo, maxNumberofPDUsessions, uLThptPerSlice, coverageArea);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        ServiceProfileChargingInformation castThat = ((ServiceProfileChargingInformation) that);
        return (((((((((((((((Objects.equals(this.supportedAccessTechnology, castThat.supportedAccessTechnology)&&Objects.equals(this.maxNumberofUEs, castThat.maxNumberofUEs))&&Objects.equals(this.latency, castThat.latency))&&Objects.equals(this.reliability, castThat.reliability))&&Objects.equals(this.serviceProfileIdentifier, castThat.serviceProfileIdentifier))&&Objects.equals(this.dLThptPerSlice, castThat.dLThptPerSlice))&&Objects.equals(this.availability, castThat.availability))&&Objects.equals(this.kPIMonitoringList, castThat.kPIMonitoringList))&&Objects.equals(this.sNSSAIList, castThat.sNSSAIList))&&Objects.equals(this.jitter, castThat.jitter))&&Objects.equals(this.dLThptPerUE, castThat.dLThptPerUE))&&Objects.equals(this.uLThptPerUE, castThat.uLThptPerUE))&&Objects.equals(this.addServiceProfileInfo, castThat.addServiceProfileInfo))&&Objects.equals(this.maxNumberofPDUsessions, castThat.maxNumberofPDUsessions))&&Objects.equals(this.uLThptPerSlice, castThat.uLThptPerSlice))&&Objects.equals(this.coverageArea, castThat.coverageArea));
    }
}
