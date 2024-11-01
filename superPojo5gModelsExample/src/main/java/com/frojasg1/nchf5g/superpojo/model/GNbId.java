
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class GNbId {
    private Integer bitLength;
    private String gNBValue;

    public Integer getBitLength() {
        return bitLength;
    }

    public void setBitLength(Integer bitLength) {
        this.bitLength = bitLength;
    }

    public GNbId bitLength(Integer bitLength) {
        this.bitLength = bitLength;
        return this;
    }

    public String getgNBValue() {
        return gNBValue;
    }

    public void setgNBValue(String gNBValue) {
        this.gNBValue = gNBValue;
    }

    public GNbId gNBValue(String gNBValue) {
        this.gNBValue = gNBValue;
        return this;
    }

    @Override
    public String toString() {
        return (((((("GNbId {"+"bitLength = ")+ bitLength)+", ")+"gNBValue = ")+ gNBValue)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(bitLength, gNBValue);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        GNbId castThat = ((GNbId) that);
        return (Objects.equals(this.bitLength, castThat.bitLength)&&Objects.equals(this.gNBValue, castThat.gNBValue));
    }
}
