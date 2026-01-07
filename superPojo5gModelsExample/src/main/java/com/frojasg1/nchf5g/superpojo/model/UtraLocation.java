
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Date;
import java.util.Objects;

public class UtraLocation {
    public String geographicalInformation;
    public Integer ageOfLocationInformation;
    public CellGlobalId cgi;
    public LocationAreaId lai;
    public ServiceAreaId sai;
    public RoutingAreaId rai;
    public Date ueLocationTimestamp;
    public String geodeticInformation;

    public String getGeographicalInformation() {
        return geographicalInformation;
    }

    public void setGeographicalInformation(String geographicalInformation) {
        this.geographicalInformation = geographicalInformation;
    }

    public UtraLocation geographicalInformation(String geographicalInformation) {
        this.geographicalInformation = geographicalInformation;
        return this;
    }

    public Integer getAgeOfLocationInformation() {
        return ageOfLocationInformation;
    }

    public void setAgeOfLocationInformation(Integer ageOfLocationInformation) {
        this.ageOfLocationInformation = ageOfLocationInformation;
    }

    public UtraLocation ageOfLocationInformation(Integer ageOfLocationInformation) {
        this.ageOfLocationInformation = ageOfLocationInformation;
        return this;
    }

    public CellGlobalId getCgi() {
        return cgi;
    }

    public void setCgi(CellGlobalId cgi) {
        this.cgi = cgi;
    }

    public UtraLocation cgi(CellGlobalId cgi) {
        this.cgi = cgi;
        return this;
    }

    public LocationAreaId getLai() {
        return lai;
    }

    public void setLai(LocationAreaId lai) {
        this.lai = lai;
    }

    public UtraLocation lai(LocationAreaId lai) {
        this.lai = lai;
        return this;
    }

    public ServiceAreaId getSai() {
        return sai;
    }

    public void setSai(ServiceAreaId sai) {
        this.sai = sai;
    }

    public UtraLocation sai(ServiceAreaId sai) {
        this.sai = sai;
        return this;
    }

    public RoutingAreaId getRai() {
        return rai;
    }

    public void setRai(RoutingAreaId rai) {
        this.rai = rai;
    }

    public UtraLocation rai(RoutingAreaId rai) {
        this.rai = rai;
        return this;
    }

    public Date getUeLocationTimestamp() {
        return ueLocationTimestamp;
    }

    public void setUeLocationTimestamp(Date ueLocationTimestamp) {
        this.ueLocationTimestamp = ueLocationTimestamp;
    }

    public UtraLocation ueLocationTimestamp(Date ueLocationTimestamp) {
        this.ueLocationTimestamp = ueLocationTimestamp;
        return this;
    }

    public String getGeodeticInformation() {
        return geodeticInformation;
    }

    public void setGeodeticInformation(String geodeticInformation) {
        this.geodeticInformation = geodeticInformation;
    }

    public UtraLocation geodeticInformation(String geodeticInformation) {
        this.geodeticInformation = geodeticInformation;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((("UtraLocation {"+"geographicalInformation = ")+ geographicalInformation)+", ")+"ageOfLocationInformation = ")+ ageOfLocationInformation)+", ")+"cgi = ")+ cgi)+", ")+"lai = ")+ lai)+", ")+"sai = ")+ sai)+", ")+"rai = ")+ rai)+", ")+"ueLocationTimestamp = ")+ ueLocationTimestamp)+", ")+"geodeticInformation = ")+ geodeticInformation)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(geographicalInformation, ageOfLocationInformation, cgi, lai, sai, rai, ueLocationTimestamp, geodeticInformation);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        UtraLocation castThat = ((UtraLocation) that);
        return (((((((Objects.equals(this.geographicalInformation, castThat.geographicalInformation)&&Objects.equals(this.ageOfLocationInformation, castThat.ageOfLocationInformation))&&Objects.equals(this.cgi, castThat.cgi))&&Objects.equals(this.lai, castThat.lai))&&Objects.equals(this.sai, castThat.sai))&&Objects.equals(this.rai, castThat.rai))&&Objects.equals(this.ueLocationTimestamp, castThat.ueLocationTimestamp))&&Objects.equals(this.geodeticInformation, castThat.geodeticInformation));
    }
}
