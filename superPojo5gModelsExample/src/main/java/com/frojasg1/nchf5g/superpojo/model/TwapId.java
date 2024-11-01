
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class TwapId {
    private byte[] civicAddress;
    private String ssId;
    private String bssId;

    public byte[] getCivicAddress() {
        return civicAddress;
    }

    public void setCivicAddress(byte[] civicAddress) {
        this.civicAddress = civicAddress;
    }

    public TwapId civicAddress(byte[] civicAddress) {
        this.civicAddress = civicAddress;
        return this;
    }

    public String getSsId() {
        return ssId;
    }

    public void setSsId(String ssId) {
        this.ssId = ssId;
    }

    public TwapId ssId(String ssId) {
        this.ssId = ssId;
        return this;
    }

    public String getBssId() {
        return bssId;
    }

    public void setBssId(String bssId) {
        this.bssId = bssId;
    }

    public TwapId bssId(String bssId) {
        this.bssId = bssId;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("TwapId {"+"civicAddress = ")+ civicAddress)+", ")+"ssId = ")+ ssId)+", ")+"bssId = ")+ bssId)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(civicAddress, ssId, bssId);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        TwapId castThat = ((TwapId) that);
        return ((Objects.equals(this.civicAddress, castThat.civicAddress)&&Objects.equals(this.ssId, castThat.ssId))&&Objects.equals(this.bssId, castThat.bssId));
    }
}
