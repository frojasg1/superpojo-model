
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Date;
import java.util.Objects;

public class EutraLocation {
    public String geographicalInformation;
    public GlobalRanNodeId globalNgenbId;
    public Integer ageOfLocationInformation;
    public Boolean ignoreEcgi;
    public GlobalRanNodeId globalENbId;
    public Boolean ignoreTai;
    public Date ueLocationTimestamp;
    public Tai tai;
    public String geodeticInformation;
    public Ecgi ecgi;

    public String getGeographicalInformation() {
        return geographicalInformation;
    }

    public void setGeographicalInformation(String geographicalInformation) {
        this.geographicalInformation = geographicalInformation;
    }

    public EutraLocation geographicalInformation(String geographicalInformation) {
        this.geographicalInformation = geographicalInformation;
        return this;
    }

    public GlobalRanNodeId getGlobalNgenbId() {
        return globalNgenbId;
    }

    public void setGlobalNgenbId(GlobalRanNodeId globalNgenbId) {
        this.globalNgenbId = globalNgenbId;
    }

    public EutraLocation globalNgenbId(GlobalRanNodeId globalNgenbId) {
        this.globalNgenbId = globalNgenbId;
        return this;
    }

    public Integer getAgeOfLocationInformation() {
        return ageOfLocationInformation;
    }

    public void setAgeOfLocationInformation(Integer ageOfLocationInformation) {
        this.ageOfLocationInformation = ageOfLocationInformation;
    }

    public EutraLocation ageOfLocationInformation(Integer ageOfLocationInformation) {
        this.ageOfLocationInformation = ageOfLocationInformation;
        return this;
    }

    public Boolean getIgnoreEcgi() {
        return ignoreEcgi;
    }

    public void setIgnoreEcgi(Boolean ignoreEcgi) {
        this.ignoreEcgi = ignoreEcgi;
    }

    public EutraLocation ignoreEcgi(Boolean ignoreEcgi) {
        this.ignoreEcgi = ignoreEcgi;
        return this;
    }

    public GlobalRanNodeId getGlobalENbId() {
        return globalENbId;
    }

    public void setGlobalENbId(GlobalRanNodeId globalENbId) {
        this.globalENbId = globalENbId;
    }

    public EutraLocation globalENbId(GlobalRanNodeId globalENbId) {
        this.globalENbId = globalENbId;
        return this;
    }

    public Boolean getIgnoreTai() {
        return ignoreTai;
    }

    public void setIgnoreTai(Boolean ignoreTai) {
        this.ignoreTai = ignoreTai;
    }

    public EutraLocation ignoreTai(Boolean ignoreTai) {
        this.ignoreTai = ignoreTai;
        return this;
    }

    public Date getUeLocationTimestamp() {
        return ueLocationTimestamp;
    }

    public void setUeLocationTimestamp(Date ueLocationTimestamp) {
        this.ueLocationTimestamp = ueLocationTimestamp;
    }

    public EutraLocation ueLocationTimestamp(Date ueLocationTimestamp) {
        this.ueLocationTimestamp = ueLocationTimestamp;
        return this;
    }

    public Tai getTai() {
        return tai;
    }

    public void setTai(Tai tai) {
        this.tai = tai;
    }

    public EutraLocation tai(Tai tai) {
        this.tai = tai;
        return this;
    }

    public String getGeodeticInformation() {
        return geodeticInformation;
    }

    public void setGeodeticInformation(String geodeticInformation) {
        this.geodeticInformation = geodeticInformation;
    }

    public EutraLocation geodeticInformation(String geodeticInformation) {
        this.geodeticInformation = geodeticInformation;
        return this;
    }

    public Ecgi getEcgi() {
        return ecgi;
    }

    public void setEcgi(Ecgi ecgi) {
        this.ecgi = ecgi;
    }

    public EutraLocation ecgi(Ecgi ecgi) {
        this.ecgi = ecgi;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((((((((("EutraLocation {"+"geographicalInformation = ")+ geographicalInformation)+", ")+"globalNgenbId = ")+ globalNgenbId)+", ")+"ageOfLocationInformation = ")+ ageOfLocationInformation)+", ")+"ignoreEcgi = ")+ ignoreEcgi)+", ")+"globalENbId = ")+ globalENbId)+", ")+"ignoreTai = ")+ ignoreTai)+", ")+"ueLocationTimestamp = ")+ ueLocationTimestamp)+", ")+"tai = ")+ tai)+", ")+"geodeticInformation = ")+ geodeticInformation)+", ")+"ecgi = ")+ ecgi)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(geographicalInformation, globalNgenbId, ageOfLocationInformation, ignoreEcgi, globalENbId, ignoreTai, ueLocationTimestamp, tai, geodeticInformation, ecgi);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        EutraLocation castThat = ((EutraLocation) that);
        return (((((((((Objects.equals(this.geographicalInformation, castThat.geographicalInformation)&&Objects.equals(this.globalNgenbId, castThat.globalNgenbId))&&Objects.equals(this.ageOfLocationInformation, castThat.ageOfLocationInformation))&&Objects.equals(this.ignoreEcgi, castThat.ignoreEcgi))&&Objects.equals(this.globalENbId, castThat.globalENbId))&&Objects.equals(this.ignoreTai, castThat.ignoreTai))&&Objects.equals(this.ueLocationTimestamp, castThat.ueLocationTimestamp))&&Objects.equals(this.tai, castThat.tai))&&Objects.equals(this.geodeticInformation, castThat.geodeticInformation))&&Objects.equals(this.ecgi, castThat.ecgi));
    }
}
