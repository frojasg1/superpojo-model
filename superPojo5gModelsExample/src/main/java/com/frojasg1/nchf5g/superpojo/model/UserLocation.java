
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class UserLocation {
    private GeraLocation geraLocation;
    private NrLocation nrLocation;
    private UtraLocation utraLocation;
    private N3gaLocation n3gaLocation;
    private EutraLocation eutraLocation;

    public GeraLocation getGeraLocation() {
        return geraLocation;
    }

    public void setGeraLocation(GeraLocation geraLocation) {
        this.geraLocation = geraLocation;
    }

    public UserLocation geraLocation(GeraLocation geraLocation) {
        this.geraLocation = geraLocation;
        return this;
    }

    public NrLocation getNrLocation() {
        return nrLocation;
    }

    public void setNrLocation(NrLocation nrLocation) {
        this.nrLocation = nrLocation;
    }

    public UserLocation nrLocation(NrLocation nrLocation) {
        this.nrLocation = nrLocation;
        return this;
    }

    public UtraLocation getUtraLocation() {
        return utraLocation;
    }

    public void setUtraLocation(UtraLocation utraLocation) {
        this.utraLocation = utraLocation;
    }

    public UserLocation utraLocation(UtraLocation utraLocation) {
        this.utraLocation = utraLocation;
        return this;
    }

    public N3gaLocation getN3gaLocation() {
        return n3gaLocation;
    }

    public void setN3gaLocation(N3gaLocation n3gaLocation) {
        this.n3gaLocation = n3gaLocation;
    }

    public UserLocation n3gaLocation(N3gaLocation n3gaLocation) {
        this.n3gaLocation = n3gaLocation;
        return this;
    }

    public EutraLocation getEutraLocation() {
        return eutraLocation;
    }

    public void setEutraLocation(EutraLocation eutraLocation) {
        this.eutraLocation = eutraLocation;
    }

    public UserLocation eutraLocation(EutraLocation eutraLocation) {
        this.eutraLocation = eutraLocation;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((("UserLocation {"+"geraLocation = ")+ geraLocation)+", ")+"nrLocation = ")+ nrLocation)+", ")+"utraLocation = ")+ utraLocation)+", ")+"n3gaLocation = ")+ n3gaLocation)+", ")+"eutraLocation = ")+ eutraLocation)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(geraLocation, nrLocation, utraLocation, n3gaLocation, eutraLocation);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        UserLocation castThat = ((UserLocation) that);
        return ((((Objects.equals(this.geraLocation, castThat.geraLocation)&&Objects.equals(this.nrLocation, castThat.nrLocation))&&Objects.equals(this.utraLocation, castThat.utraLocation))&&Objects.equals(this.n3gaLocation, castThat.n3gaLocation))&&Objects.equals(this.eutraLocation, castThat.eutraLocation));
    }
}
