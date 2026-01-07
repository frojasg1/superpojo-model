
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Date;
import java.util.Objects;

public class NrLocation {
    public Boolean ignoreNcgi;
    public String geographicalInformation;
    public GlobalRanNodeId globalGnbId;
    public Integer ageOfLocationInformation;
    public Ncgi ncgi;
    public Date ueLocationTimestamp;
    public Tai tai;
    public String geodeticInformation;

    public Boolean getIgnoreNcgi() {
        return ignoreNcgi;
    }

    public void setIgnoreNcgi(Boolean ignoreNcgi) {
        this.ignoreNcgi = ignoreNcgi;
    }

    public NrLocation ignoreNcgi(Boolean ignoreNcgi) {
        this.ignoreNcgi = ignoreNcgi;
        return this;
    }

    public String getGeographicalInformation() {
        return geographicalInformation;
    }

    public void setGeographicalInformation(String geographicalInformation) {
        this.geographicalInformation = geographicalInformation;
    }

    public NrLocation geographicalInformation(String geographicalInformation) {
        this.geographicalInformation = geographicalInformation;
        return this;
    }

    public GlobalRanNodeId getGlobalGnbId() {
        return globalGnbId;
    }

    public void setGlobalGnbId(GlobalRanNodeId globalGnbId) {
        this.globalGnbId = globalGnbId;
    }

    public NrLocation globalGnbId(GlobalRanNodeId globalGnbId) {
        this.globalGnbId = globalGnbId;
        return this;
    }

    public Integer getAgeOfLocationInformation() {
        return ageOfLocationInformation;
    }

    public void setAgeOfLocationInformation(Integer ageOfLocationInformation) {
        this.ageOfLocationInformation = ageOfLocationInformation;
    }

    public NrLocation ageOfLocationInformation(Integer ageOfLocationInformation) {
        this.ageOfLocationInformation = ageOfLocationInformation;
        return this;
    }

    public Ncgi getNcgi() {
        return ncgi;
    }

    public void setNcgi(Ncgi ncgi) {
        this.ncgi = ncgi;
    }

    public NrLocation ncgi(Ncgi ncgi) {
        this.ncgi = ncgi;
        return this;
    }

    public Date getUeLocationTimestamp() {
        return ueLocationTimestamp;
    }

    public void setUeLocationTimestamp(Date ueLocationTimestamp) {
        this.ueLocationTimestamp = ueLocationTimestamp;
    }

    public NrLocation ueLocationTimestamp(Date ueLocationTimestamp) {
        this.ueLocationTimestamp = ueLocationTimestamp;
        return this;
    }

    public Tai getTai() {
        return tai;
    }

    public void setTai(Tai tai) {
        this.tai = tai;
    }

    public NrLocation tai(Tai tai) {
        this.tai = tai;
        return this;
    }

    public String getGeodeticInformation() {
        return geodeticInformation;
    }

    public void setGeodeticInformation(String geodeticInformation) {
        this.geodeticInformation = geodeticInformation;
    }

    public NrLocation geodeticInformation(String geodeticInformation) {
        this.geodeticInformation = geodeticInformation;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((("NrLocation {"+"ignoreNcgi = ")+ ignoreNcgi)+", ")+"geographicalInformation = ")+ geographicalInformation)+", ")+"globalGnbId = ")+ globalGnbId)+", ")+"ageOfLocationInformation = ")+ ageOfLocationInformation)+", ")+"ncgi = ")+ ncgi)+", ")+"ueLocationTimestamp = ")+ ueLocationTimestamp)+", ")+"tai = ")+ tai)+", ")+"geodeticInformation = ")+ geodeticInformation)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(ignoreNcgi, geographicalInformation, globalGnbId, ageOfLocationInformation, ncgi, ueLocationTimestamp, tai, geodeticInformation);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        NrLocation castThat = ((NrLocation) that);
        return (((((((Objects.equals(this.ignoreNcgi, castThat.ignoreNcgi)&&Objects.equals(this.geographicalInformation, castThat.geographicalInformation))&&Objects.equals(this.globalGnbId, castThat.globalGnbId))&&Objects.equals(this.ageOfLocationInformation, castThat.ageOfLocationInformation))&&Objects.equals(this.ncgi, castThat.ncgi))&&Objects.equals(this.ueLocationTimestamp, castThat.ueLocationTimestamp))&&Objects.equals(this.tai, castThat.tai))&&Objects.equals(this.geodeticInformation, castThat.geodeticInformation));
    }
}
