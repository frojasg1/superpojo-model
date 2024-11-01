
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class NSPAContainerInformation {
    private Integer theNumberOfPDUSessions;
    private Integer latency;
    private Integer theNumberOfRegisteredSubscribers;
    private Throughput throughput;
    private String maximumPacketLossRate;
    private ServiceExperienceInfo serviceExperienceStatisticsData;
    private NsiLoadLevelInfo loadLevel;

    public Integer getTheNumberOfPDUSessions() {
        return theNumberOfPDUSessions;
    }

    public void setTheNumberOfPDUSessions(Integer theNumberOfPDUSessions) {
        this.theNumberOfPDUSessions = theNumberOfPDUSessions;
    }

    public NSPAContainerInformation theNumberOfPDUSessions(Integer theNumberOfPDUSessions) {
        this.theNumberOfPDUSessions = theNumberOfPDUSessions;
        return this;
    }

    public Integer getLatency() {
        return latency;
    }

    public void setLatency(Integer latency) {
        this.latency = latency;
    }

    public NSPAContainerInformation latency(Integer latency) {
        this.latency = latency;
        return this;
    }

    public Integer getTheNumberOfRegisteredSubscribers() {
        return theNumberOfRegisteredSubscribers;
    }

    public void setTheNumberOfRegisteredSubscribers(Integer theNumberOfRegisteredSubscribers) {
        this.theNumberOfRegisteredSubscribers = theNumberOfRegisteredSubscribers;
    }

    public NSPAContainerInformation theNumberOfRegisteredSubscribers(Integer theNumberOfRegisteredSubscribers) {
        this.theNumberOfRegisteredSubscribers = theNumberOfRegisteredSubscribers;
        return this;
    }

    public Throughput getThroughput() {
        return throughput;
    }

    public void setThroughput(Throughput throughput) {
        this.throughput = throughput;
    }

    public NSPAContainerInformation throughput(Throughput throughput) {
        this.throughput = throughput;
        return this;
    }

    public String getMaximumPacketLossRate() {
        return maximumPacketLossRate;
    }

    public void setMaximumPacketLossRate(String maximumPacketLossRate) {
        this.maximumPacketLossRate = maximumPacketLossRate;
    }

    public NSPAContainerInformation maximumPacketLossRate(String maximumPacketLossRate) {
        this.maximumPacketLossRate = maximumPacketLossRate;
        return this;
    }

    public ServiceExperienceInfo getServiceExperienceStatisticsData() {
        return serviceExperienceStatisticsData;
    }

    public void setServiceExperienceStatisticsData(ServiceExperienceInfo serviceExperienceStatisticsData) {
        this.serviceExperienceStatisticsData = serviceExperienceStatisticsData;
    }

    public NSPAContainerInformation serviceExperienceStatisticsData(ServiceExperienceInfo serviceExperienceStatisticsData) {
        this.serviceExperienceStatisticsData = serviceExperienceStatisticsData;
        return this;
    }

    public NsiLoadLevelInfo getLoadLevel() {
        return loadLevel;
    }

    public void setLoadLevel(NsiLoadLevelInfo loadLevel) {
        this.loadLevel = loadLevel;
    }

    public NSPAContainerInformation loadLevel(NsiLoadLevelInfo loadLevel) {
        this.loadLevel = loadLevel;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((("NSPAContainerInformation {"+"theNumberOfPDUSessions = ")+ theNumberOfPDUSessions)+", ")+"latency = ")+ latency)+", ")+"theNumberOfRegisteredSubscribers = ")+ theNumberOfRegisteredSubscribers)+", ")+"throughput = ")+ throughput)+", ")+"maximumPacketLossRate = ")+ maximumPacketLossRate)+", ")+"serviceExperienceStatisticsData = ")+ serviceExperienceStatisticsData)+", ")+"loadLevel = ")+ loadLevel)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(theNumberOfPDUSessions, latency, theNumberOfRegisteredSubscribers, throughput, maximumPacketLossRate, serviceExperienceStatisticsData, loadLevel);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        NSPAContainerInformation castThat = ((NSPAContainerInformation) that);
        return ((((((Objects.equals(this.theNumberOfPDUSessions, castThat.theNumberOfPDUSessions)&&Objects.equals(this.latency, castThat.latency))&&Objects.equals(this.theNumberOfRegisteredSubscribers, castThat.theNumberOfRegisteredSubscribers))&&Objects.equals(this.throughput, castThat.throughput))&&Objects.equals(this.maximumPacketLossRate, castThat.maximumPacketLossRate))&&Objects.equals(this.serviceExperienceStatisticsData, castThat.serviceExperienceStatisticsData))&&Objects.equals(this.loadLevel, castThat.loadLevel));
    }
}
