
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;
import java.util.UUID;

public class NFIdentification {
    private Ipv6Addr nFIPv6Address;
    private String nFIPv4Address;
    private UUID nFName;
    private NodeFunctionality nodeFunctionality;
    private String nFFqdn;
    private PlmnId nFPLMNID;

    public Ipv6Addr getnFIPv6Address() {
        return nFIPv6Address;
    }

    public void setnFIPv6Address(Ipv6Addr nFIPv6Address) {
        this.nFIPv6Address = nFIPv6Address;
    }

    public NFIdentification nFIPv6Address(Ipv6Addr nFIPv6Address) {
        this.nFIPv6Address = nFIPv6Address;
        return this;
    }

    public String getnFIPv4Address() {
        return nFIPv4Address;
    }

    public void setnFIPv4Address(String nFIPv4Address) {
        this.nFIPv4Address = nFIPv4Address;
    }

    public NFIdentification nFIPv4Address(String nFIPv4Address) {
        this.nFIPv4Address = nFIPv4Address;
        return this;
    }

    public UUID getnFName() {
        return nFName;
    }

    public void setnFName(UUID nFName) {
        this.nFName = nFName;
    }

    public NFIdentification nFName(UUID nFName) {
        this.nFName = nFName;
        return this;
    }

    public NodeFunctionality getNodeFunctionality() {
        return nodeFunctionality;
    }

    public void setNodeFunctionality(NodeFunctionality nodeFunctionality) {
        this.nodeFunctionality = nodeFunctionality;
    }

    public NFIdentification nodeFunctionality(NodeFunctionality nodeFunctionality) {
        this.nodeFunctionality = nodeFunctionality;
        return this;
    }

    public String getnFFqdn() {
        return nFFqdn;
    }

    public void setnFFqdn(String nFFqdn) {
        this.nFFqdn = nFFqdn;
    }

    public NFIdentification nFFqdn(String nFFqdn) {
        this.nFFqdn = nFFqdn;
        return this;
    }

    public PlmnId getnFPLMNID() {
        return nFPLMNID;
    }

    public void setnFPLMNID(PlmnId nFPLMNID) {
        this.nFPLMNID = nFPLMNID;
    }

    public NFIdentification nFPLMNID(PlmnId nFPLMNID) {
        this.nFPLMNID = nFPLMNID;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((("NFIdentification {"+"nFIPv6Address = ")+ nFIPv6Address)+", ")+"nFIPv4Address = ")+ nFIPv4Address)+", ")+"nFName = ")+ nFName)+", ")+"nodeFunctionality = ")+ nodeFunctionality)+", ")+"nFFqdn = ")+ nFFqdn)+", ")+"nFPLMNID = ")+ nFPLMNID)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(nFIPv6Address, nFIPv4Address, nFName, nodeFunctionality, nFFqdn, nFPLMNID);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        NFIdentification castThat = ((NFIdentification) that);
        return (((((Objects.equals(this.nFIPv6Address, castThat.nFIPv6Address)&&Objects.equals(this.nFIPv4Address, castThat.nFIPv4Address))&&Objects.equals(this.nFName, castThat.nFName))&&Objects.equals(this.nodeFunctionality, castThat.nodeFunctionality))&&Objects.equals(this.nFFqdn, castThat.nFFqdn))&&Objects.equals(this.nFPLMNID, castThat.nFPLMNID));
    }
}
