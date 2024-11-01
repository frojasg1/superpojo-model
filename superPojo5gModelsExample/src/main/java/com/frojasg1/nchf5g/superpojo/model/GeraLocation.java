
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Date;
import java.util.Objects;

public class GeraLocation {
    private String geographicalInformation;
    private Integer ageOfLocationInformation;
    private CellGlobalId cgi;
    private LocationAreaId lai;
    private String mscNumber;
    private ServiceAreaId sai;
    private String vlrNumber;
    private RoutingAreaId rai;
    private String locationNumber;
    private Date ueLocationTimestamp;
    private String geodeticInformation;

    public String getGeographicalInformation() {
        return geographicalInformation;
    }

    public void setGeographicalInformation(String geographicalInformation) {
        this.geographicalInformation = geographicalInformation;
    }

    public GeraLocation geographicalInformation(String geographicalInformation) {
        this.geographicalInformation = geographicalInformation;
        return this;
    }

    public Integer getAgeOfLocationInformation() {
        return ageOfLocationInformation;
    }

    public void setAgeOfLocationInformation(Integer ageOfLocationInformation) {
        this.ageOfLocationInformation = ageOfLocationInformation;
    }

    public GeraLocation ageOfLocationInformation(Integer ageOfLocationInformation) {
        this.ageOfLocationInformation = ageOfLocationInformation;
        return this;
    }

    public CellGlobalId getCgi() {
        return cgi;
    }

    public void setCgi(CellGlobalId cgi) {
        this.cgi = cgi;
    }

    public GeraLocation cgi(CellGlobalId cgi) {
        this.cgi = cgi;
        return this;
    }

    public LocationAreaId getLai() {
        return lai;
    }

    public void setLai(LocationAreaId lai) {
        this.lai = lai;
    }

    public GeraLocation lai(LocationAreaId lai) {
        this.lai = lai;
        return this;
    }

    public String getMscNumber() {
        return mscNumber;
    }

    public void setMscNumber(String mscNumber) {
        this.mscNumber = mscNumber;
    }

    public GeraLocation mscNumber(String mscNumber) {
        this.mscNumber = mscNumber;
        return this;
    }

    public ServiceAreaId getSai() {
        return sai;
    }

    public void setSai(ServiceAreaId sai) {
        this.sai = sai;
    }

    public GeraLocation sai(ServiceAreaId sai) {
        this.sai = sai;
        return this;
    }

    public String getVlrNumber() {
        return vlrNumber;
    }

    public void setVlrNumber(String vlrNumber) {
        this.vlrNumber = vlrNumber;
    }

    public GeraLocation vlrNumber(String vlrNumber) {
        this.vlrNumber = vlrNumber;
        return this;
    }

    public RoutingAreaId getRai() {
        return rai;
    }

    public void setRai(RoutingAreaId rai) {
        this.rai = rai;
    }

    public GeraLocation rai(RoutingAreaId rai) {
        this.rai = rai;
        return this;
    }

    public String getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(String locationNumber) {
        this.locationNumber = locationNumber;
    }

    public GeraLocation locationNumber(String locationNumber) {
        this.locationNumber = locationNumber;
        return this;
    }

    public Date getUeLocationTimestamp() {
        return ueLocationTimestamp;
    }

    public void setUeLocationTimestamp(Date ueLocationTimestamp) {
        this.ueLocationTimestamp = ueLocationTimestamp;
    }

    public GeraLocation ueLocationTimestamp(Date ueLocationTimestamp) {
        this.ueLocationTimestamp = ueLocationTimestamp;
        return this;
    }

    public String getGeodeticInformation() {
        return geodeticInformation;
    }

    public void setGeodeticInformation(String geodeticInformation) {
        this.geodeticInformation = geodeticInformation;
    }

    public GeraLocation geodeticInformation(String geodeticInformation) {
        this.geodeticInformation = geodeticInformation;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((((((((((((((("GeraLocation {"+"geographicalInformation = ")+ geographicalInformation)+", ")+"ageOfLocationInformation = ")+ ageOfLocationInformation)+", ")+"cgi = ")+ cgi)+", ")+"lai = ")+ lai)+", ")+"mscNumber = ")+ mscNumber)+", ")+"sai = ")+ sai)+", ")+"vlrNumber = ")+ vlrNumber)+", ")+"rai = ")+ rai)+", ")+"locationNumber = ")+ locationNumber)+", ")+"ueLocationTimestamp = ")+ ueLocationTimestamp)+", ")+"geodeticInformation = ")+ geodeticInformation)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(geographicalInformation, ageOfLocationInformation, cgi, lai, mscNumber, sai, vlrNumber, rai, locationNumber, ueLocationTimestamp, geodeticInformation);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        GeraLocation castThat = ((GeraLocation) that);
        return ((((((((((Objects.equals(this.geographicalInformation, castThat.geographicalInformation)&&Objects.equals(this.ageOfLocationInformation, castThat.ageOfLocationInformation))&&Objects.equals(this.cgi, castThat.cgi))&&Objects.equals(this.lai, castThat.lai))&&Objects.equals(this.mscNumber, castThat.mscNumber))&&Objects.equals(this.sai, castThat.sai))&&Objects.equals(this.vlrNumber, castThat.vlrNumber))&&Objects.equals(this.rai, castThat.rai))&&Objects.equals(this.locationNumber, castThat.locationNumber))&&Objects.equals(this.ueLocationTimestamp, castThat.ueLocationTimestamp))&&Objects.equals(this.geodeticInformation, castThat.geodeticInformation));
    }
}
