
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class RecipientAddress {
    private SMAddressInfo recipientAddressInfo;
    private SMAddresseeType sMaddresseeType;

    public SMAddressInfo getRecipientAddressInfo() {
        return recipientAddressInfo;
    }

    public void setRecipientAddressInfo(SMAddressInfo recipientAddressInfo) {
        this.recipientAddressInfo = recipientAddressInfo;
    }

    public RecipientAddress recipientAddressInfo(SMAddressInfo recipientAddressInfo) {
        this.recipientAddressInfo = recipientAddressInfo;
        return this;
    }

    public SMAddresseeType getsMaddresseeType() {
        return sMaddresseeType;
    }

    public void setsMaddresseeType(SMAddresseeType sMaddresseeType) {
        this.sMaddresseeType = sMaddresseeType;
    }

    public RecipientAddress sMaddresseeType(SMAddresseeType sMaddresseeType) {
        this.sMaddresseeType = sMaddresseeType;
        return this;
    }

    @Override
    public String toString() {
        return (((((("RecipientAddress {"+"recipientAddressInfo = ")+ recipientAddressInfo)+", ")+"sMaddresseeType = ")+ sMaddresseeType)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipientAddressInfo, sMaddresseeType);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        RecipientAddress castThat = ((RecipientAddress) that);
        return (Objects.equals(this.recipientAddressInfo, castThat.recipientAddressInfo)&&Objects.equals(this.sMaddresseeType, castThat.sMaddresseeType));
    }
}
