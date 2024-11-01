
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class SMAddressInfo {
    private SMAddressDomain sMaddressDomain;
    private SMAddressType sMaddressType;
    private String sMaddressData;

    public SMAddressDomain getsMaddressDomain() {
        return sMaddressDomain;
    }

    public void setsMaddressDomain(SMAddressDomain sMaddressDomain) {
        this.sMaddressDomain = sMaddressDomain;
    }

    public SMAddressInfo sMaddressDomain(SMAddressDomain sMaddressDomain) {
        this.sMaddressDomain = sMaddressDomain;
        return this;
    }

    public SMAddressType getsMaddressType() {
        return sMaddressType;
    }

    public void setsMaddressType(SMAddressType sMaddressType) {
        this.sMaddressType = sMaddressType;
    }

    public SMAddressInfo sMaddressType(SMAddressType sMaddressType) {
        this.sMaddressType = sMaddressType;
        return this;
    }

    public String getsMaddressData() {
        return sMaddressData;
    }

    public void setsMaddressData(String sMaddressData) {
        this.sMaddressData = sMaddressData;
    }

    public SMAddressInfo sMaddressData(String sMaddressData) {
        this.sMaddressData = sMaddressData;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("SMAddressInfo {"+"sMaddressDomain = ")+ sMaddressDomain)+", ")+"sMaddressType = ")+ sMaddressType)+", ")+"sMaddressData = ")+ sMaddressData)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(sMaddressDomain, sMaddressType, sMaddressData);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        SMAddressInfo castThat = ((SMAddressInfo) that);
        return ((Objects.equals(this.sMaddressDomain, castThat.sMaddressDomain)&&Objects.equals(this.sMaddressType, castThat.sMaddressType))&&Objects.equals(this.sMaddressData, castThat.sMaddressData));
    }
}
