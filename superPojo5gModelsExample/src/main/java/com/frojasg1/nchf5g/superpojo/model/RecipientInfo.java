
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class RecipientInfo {
    public String recipientGPSI;
    public String sMrecipientProtocolId;
    public SMAddressInfo recipientReceivedAddress;
    public String recipientSUPI;
    public SMAddressInfo recipientOtherAddress;
    public String recipientSCCPAddress;
    public SMInterface sMDestinationInterface;

    public String getRecipientGPSI() {
        return recipientGPSI;
    }

    public void setRecipientGPSI(String recipientGPSI) {
        this.recipientGPSI = recipientGPSI;
    }

    public RecipientInfo recipientGPSI(String recipientGPSI) {
        this.recipientGPSI = recipientGPSI;
        return this;
    }

    public String getsMrecipientProtocolId() {
        return sMrecipientProtocolId;
    }

    public void setsMrecipientProtocolId(String sMrecipientProtocolId) {
        this.sMrecipientProtocolId = sMrecipientProtocolId;
    }

    public RecipientInfo sMrecipientProtocolId(String sMrecipientProtocolId) {
        this.sMrecipientProtocolId = sMrecipientProtocolId;
        return this;
    }

    public SMAddressInfo getRecipientReceivedAddress() {
        return recipientReceivedAddress;
    }

    public void setRecipientReceivedAddress(SMAddressInfo recipientReceivedAddress) {
        this.recipientReceivedAddress = recipientReceivedAddress;
    }

    public RecipientInfo recipientReceivedAddress(SMAddressInfo recipientReceivedAddress) {
        this.recipientReceivedAddress = recipientReceivedAddress;
        return this;
    }

    public String getRecipientSUPI() {
        return recipientSUPI;
    }

    public void setRecipientSUPI(String recipientSUPI) {
        this.recipientSUPI = recipientSUPI;
    }

    public RecipientInfo recipientSUPI(String recipientSUPI) {
        this.recipientSUPI = recipientSUPI;
        return this;
    }

    public SMAddressInfo getRecipientOtherAddress() {
        return recipientOtherAddress;
    }

    public void setRecipientOtherAddress(SMAddressInfo recipientOtherAddress) {
        this.recipientOtherAddress = recipientOtherAddress;
    }

    public RecipientInfo recipientOtherAddress(SMAddressInfo recipientOtherAddress) {
        this.recipientOtherAddress = recipientOtherAddress;
        return this;
    }

    public String getRecipientSCCPAddress() {
        return recipientSCCPAddress;
    }

    public void setRecipientSCCPAddress(String recipientSCCPAddress) {
        this.recipientSCCPAddress = recipientSCCPAddress;
    }

    public RecipientInfo recipientSCCPAddress(String recipientSCCPAddress) {
        this.recipientSCCPAddress = recipientSCCPAddress;
        return this;
    }

    public SMInterface getsMDestinationInterface() {
        return sMDestinationInterface;
    }

    public void setsMDestinationInterface(SMInterface sMDestinationInterface) {
        this.sMDestinationInterface = sMDestinationInterface;
    }

    public RecipientInfo sMDestinationInterface(SMInterface sMDestinationInterface) {
        this.sMDestinationInterface = sMDestinationInterface;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((("RecipientInfo {"+"recipientGPSI = ")+ recipientGPSI)+", ")+"sMrecipientProtocolId = ")+ sMrecipientProtocolId)+", ")+"recipientReceivedAddress = ")+ recipientReceivedAddress)+", ")+"recipientSUPI = ")+ recipientSUPI)+", ")+"recipientOtherAddress = ")+ recipientOtherAddress)+", ")+"recipientSCCPAddress = ")+ recipientSCCPAddress)+", ")+"sMDestinationInterface = ")+ sMDestinationInterface)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipientGPSI, sMrecipientProtocolId, recipientReceivedAddress, recipientSUPI, recipientOtherAddress, recipientSCCPAddress, sMDestinationInterface);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        RecipientInfo castThat = ((RecipientInfo) that);
        return ((((((Objects.equals(this.recipientGPSI, castThat.recipientGPSI)&&Objects.equals(this.sMrecipientProtocolId, castThat.sMrecipientProtocolId))&&Objects.equals(this.recipientReceivedAddress, castThat.recipientReceivedAddress))&&Objects.equals(this.recipientSUPI, castThat.recipientSUPI))&&Objects.equals(this.recipientOtherAddress, castThat.recipientOtherAddress))&&Objects.equals(this.recipientSCCPAddress, castThat.recipientSCCPAddress))&&Objects.equals(this.sMDestinationInterface, castThat.sMDestinationInterface));
    }
}
