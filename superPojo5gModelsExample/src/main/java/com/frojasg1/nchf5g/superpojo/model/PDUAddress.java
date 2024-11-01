
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PDUAddress {
    private Ipv6Addr pduIPv6AddresswithPrefix;
    private List<Ipv6Prefix> addIpv6AddrPrefixList;
    private Boolean iPv4dynamicAddressFlag;
    private Boolean iPv6dynamicPrefixFlag;
    private Ipv6Prefix addIpv6AddrPrefixes;
    private Integer pduAddressprefixlength;
    private String pduIPv4Address;

    public Ipv6Addr getPduIPv6AddresswithPrefix() {
        return pduIPv6AddresswithPrefix;
    }

    public void setPduIPv6AddresswithPrefix(Ipv6Addr pduIPv6AddresswithPrefix) {
        this.pduIPv6AddresswithPrefix = pduIPv6AddresswithPrefix;
    }

    public PDUAddress pduIPv6AddresswithPrefix(Ipv6Addr pduIPv6AddresswithPrefix) {
        this.pduIPv6AddresswithPrefix = pduIPv6AddresswithPrefix;
        return this;
    }

    public List<Ipv6Prefix> getAddIpv6AddrPrefixList() {
        return addIpv6AddrPrefixList;
    }

    public void setAddIpv6AddrPrefixList(List<Ipv6Prefix> addIpv6AddrPrefixList) {
        this.addIpv6AddrPrefixList = addIpv6AddrPrefixList;
    }

    public PDUAddress addIpv6AddrPrefixList(List<Ipv6Prefix> addIpv6AddrPrefixList) {
        this.addIpv6AddrPrefixList = addIpv6AddrPrefixList;
        return this;
    }

    public PDUAddress addAddIpv6AddrPrefixListItem(Ipv6Prefix item) {
        if (this.addIpv6AddrPrefixList == null) {
            this.addIpv6AddrPrefixList = new ArrayList();
        }
        this.addIpv6AddrPrefixList.add(item);
        return this;
    }

    public Boolean getiPv4dynamicAddressFlag() {
        return iPv4dynamicAddressFlag;
    }

    public void setiPv4dynamicAddressFlag(Boolean iPv4dynamicAddressFlag) {
        this.iPv4dynamicAddressFlag = iPv4dynamicAddressFlag;
    }

    public PDUAddress iPv4dynamicAddressFlag(Boolean iPv4dynamicAddressFlag) {
        this.iPv4dynamicAddressFlag = iPv4dynamicAddressFlag;
        return this;
    }

    public Boolean getiPv6dynamicPrefixFlag() {
        return iPv6dynamicPrefixFlag;
    }

    public void setiPv6dynamicPrefixFlag(Boolean iPv6dynamicPrefixFlag) {
        this.iPv6dynamicPrefixFlag = iPv6dynamicPrefixFlag;
    }

    public PDUAddress iPv6dynamicPrefixFlag(Boolean iPv6dynamicPrefixFlag) {
        this.iPv6dynamicPrefixFlag = iPv6dynamicPrefixFlag;
        return this;
    }

    public Ipv6Prefix getAddIpv6AddrPrefixes() {
        return addIpv6AddrPrefixes;
    }

    public void setAddIpv6AddrPrefixes(Ipv6Prefix addIpv6AddrPrefixes) {
        this.addIpv6AddrPrefixes = addIpv6AddrPrefixes;
    }

    public PDUAddress addIpv6AddrPrefixes(Ipv6Prefix addIpv6AddrPrefixes) {
        this.addIpv6AddrPrefixes = addIpv6AddrPrefixes;
        return this;
    }

    public Integer getPduAddressprefixlength() {
        return pduAddressprefixlength;
    }

    public void setPduAddressprefixlength(Integer pduAddressprefixlength) {
        this.pduAddressprefixlength = pduAddressprefixlength;
    }

    public PDUAddress pduAddressprefixlength(Integer pduAddressprefixlength) {
        this.pduAddressprefixlength = pduAddressprefixlength;
        return this;
    }

    public String getPduIPv4Address() {
        return pduIPv4Address;
    }

    public void setPduIPv4Address(String pduIPv4Address) {
        this.pduIPv4Address = pduIPv4Address;
    }

    public PDUAddress pduIPv4Address(String pduIPv4Address) {
        this.pduIPv4Address = pduIPv4Address;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((("PDUAddress {"+"pduIPv6AddresswithPrefix = ")+ pduIPv6AddresswithPrefix)+", ")+"addIpv6AddrPrefixList = ")+ addIpv6AddrPrefixList)+", ")+"iPv4dynamicAddressFlag = ")+ iPv4dynamicAddressFlag)+", ")+"iPv6dynamicPrefixFlag = ")+ iPv6dynamicPrefixFlag)+", ")+"addIpv6AddrPrefixes = ")+ addIpv6AddrPrefixes)+", ")+"pduAddressprefixlength = ")+ pduAddressprefixlength)+", ")+"pduIPv4Address = ")+ pduIPv4Address)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(pduIPv6AddresswithPrefix, addIpv6AddrPrefixList, iPv4dynamicAddressFlag, iPv6dynamicPrefixFlag, addIpv6AddrPrefixes, pduAddressprefixlength, pduIPv4Address);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        PDUAddress castThat = ((PDUAddress) that);
        return ((((((Objects.equals(this.pduIPv6AddresswithPrefix, castThat.pduIPv6AddresswithPrefix)&&Objects.equals(this.addIpv6AddrPrefixList, castThat.addIpv6AddrPrefixList))&&Objects.equals(this.iPv4dynamicAddressFlag, castThat.iPv4dynamicAddressFlag))&&Objects.equals(this.iPv6dynamicPrefixFlag, castThat.iPv6dynamicPrefixFlag))&&Objects.equals(this.addIpv6AddrPrefixes, castThat.addIpv6AddrPrefixes))&&Objects.equals(this.pduAddressprefixlength, castThat.pduAddressprefixlength))&&Objects.equals(this.pduIPv4Address, castThat.pduIPv4Address));
    }
}
