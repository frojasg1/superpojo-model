
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class OriginatorInfo {
    public String originatorSUPI;
    public String sMOriginatorProtocolId;
    public String originatorGPSI;
    public SMAddressInfo originatorReceivedAddress;
    public SMInterface sMOriginatorInterface;
    public SMAddressInfo originatorOtherAddress;
    public String originatorSCCPAddress;

    public String getOriginatorSUPI() {
        return originatorSUPI;
    }

    public void setOriginatorSUPI(String originatorSUPI) {
        this.originatorSUPI = originatorSUPI;
    }

    public OriginatorInfo originatorSUPI(String originatorSUPI) {
        this.originatorSUPI = originatorSUPI;
        return this;
    }

    public String getsMOriginatorProtocolId() {
        return sMOriginatorProtocolId;
    }

    public void setsMOriginatorProtocolId(String sMOriginatorProtocolId) {
        this.sMOriginatorProtocolId = sMOriginatorProtocolId;
    }

    public OriginatorInfo sMOriginatorProtocolId(String sMOriginatorProtocolId) {
        this.sMOriginatorProtocolId = sMOriginatorProtocolId;
        return this;
    }

    public String getOriginatorGPSI() {
        return originatorGPSI;
    }

    public void setOriginatorGPSI(String originatorGPSI) {
        this.originatorGPSI = originatorGPSI;
    }

    public OriginatorInfo originatorGPSI(String originatorGPSI) {
        this.originatorGPSI = originatorGPSI;
        return this;
    }

    public SMAddressInfo getOriginatorReceivedAddress() {
        return originatorReceivedAddress;
    }

    public void setOriginatorReceivedAddress(SMAddressInfo originatorReceivedAddress) {
        this.originatorReceivedAddress = originatorReceivedAddress;
    }

    public OriginatorInfo originatorReceivedAddress(SMAddressInfo originatorReceivedAddress) {
        this.originatorReceivedAddress = originatorReceivedAddress;
        return this;
    }

    public SMInterface getsMOriginatorInterface() {
        return sMOriginatorInterface;
    }

    public void setsMOriginatorInterface(SMInterface sMOriginatorInterface) {
        this.sMOriginatorInterface = sMOriginatorInterface;
    }

    public OriginatorInfo sMOriginatorInterface(SMInterface sMOriginatorInterface) {
        this.sMOriginatorInterface = sMOriginatorInterface;
        return this;
    }

    public SMAddressInfo getOriginatorOtherAddress() {
        return originatorOtherAddress;
    }

    public void setOriginatorOtherAddress(SMAddressInfo originatorOtherAddress) {
        this.originatorOtherAddress = originatorOtherAddress;
    }

    public OriginatorInfo originatorOtherAddress(SMAddressInfo originatorOtherAddress) {
        this.originatorOtherAddress = originatorOtherAddress;
        return this;
    }

    public String getOriginatorSCCPAddress() {
        return originatorSCCPAddress;
    }

    public void setOriginatorSCCPAddress(String originatorSCCPAddress) {
        this.originatorSCCPAddress = originatorSCCPAddress;
    }

    public OriginatorInfo originatorSCCPAddress(String originatorSCCPAddress) {
        this.originatorSCCPAddress = originatorSCCPAddress;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((("OriginatorInfo {"+"originatorSUPI = ")+ originatorSUPI)+", ")+"sMOriginatorProtocolId = ")+ sMOriginatorProtocolId)+", ")+"originatorGPSI = ")+ originatorGPSI)+", ")+"originatorReceivedAddress = ")+ originatorReceivedAddress)+", ")+"sMOriginatorInterface = ")+ sMOriginatorInterface)+", ")+"originatorOtherAddress = ")+ originatorOtherAddress)+", ")+"originatorSCCPAddress = ")+ originatorSCCPAddress)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(originatorSUPI, sMOriginatorProtocolId, originatorGPSI, originatorReceivedAddress, sMOriginatorInterface, originatorOtherAddress, originatorSCCPAddress);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        OriginatorInfo castThat = ((OriginatorInfo) that);
        return ((((((Objects.equals(this.originatorSUPI, castThat.originatorSUPI)&&Objects.equals(this.sMOriginatorProtocolId, castThat.sMOriginatorProtocolId))&&Objects.equals(this.originatorGPSI, castThat.originatorGPSI))&&Objects.equals(this.originatorReceivedAddress, castThat.originatorReceivedAddress))&&Objects.equals(this.sMOriginatorInterface, castThat.sMOriginatorInterface))&&Objects.equals(this.originatorOtherAddress, castThat.originatorOtherAddress))&&Objects.equals(this.originatorSCCPAddress, castThat.originatorSCCPAddress));
    }
}
