
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class N3gaLocation {
    public HfcNodeId hfcNodeId;
    public TwapId twapId;
    public String ueIpv4Addr;
    public TransportProtocol protocol;
    public byte[] gli;
    public LineType w5gbanLineType;
    public TnapId tnapId;
    public Tai n3gppTai;
    public String gci;
    public Ipv6Addr ueIpv6Addr;
    public String n3IwfId;
    public Integer portNumber;

    public HfcNodeId getHfcNodeId() {
        return hfcNodeId;
    }

    public void setHfcNodeId(HfcNodeId hfcNodeId) {
        this.hfcNodeId = hfcNodeId;
    }

    public N3gaLocation hfcNodeId(HfcNodeId hfcNodeId) {
        this.hfcNodeId = hfcNodeId;
        return this;
    }

    public TwapId getTwapId() {
        return twapId;
    }

    public void setTwapId(TwapId twapId) {
        this.twapId = twapId;
    }

    public N3gaLocation twapId(TwapId twapId) {
        this.twapId = twapId;
        return this;
    }

    public String getUeIpv4Addr() {
        return ueIpv4Addr;
    }

    public void setUeIpv4Addr(String ueIpv4Addr) {
        this.ueIpv4Addr = ueIpv4Addr;
    }

    public N3gaLocation ueIpv4Addr(String ueIpv4Addr) {
        this.ueIpv4Addr = ueIpv4Addr;
        return this;
    }

    public TransportProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(TransportProtocol protocol) {
        this.protocol = protocol;
    }

    public N3gaLocation protocol(TransportProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    public byte[] getGli() {
        return gli;
    }

    public void setGli(byte[] gli) {
        this.gli = gli;
    }

    public N3gaLocation gli(byte[] gli) {
        this.gli = gli;
        return this;
    }

    public LineType getW5gbanLineType() {
        return w5gbanLineType;
    }

    public void setW5gbanLineType(LineType w5gbanLineType) {
        this.w5gbanLineType = w5gbanLineType;
    }

    public N3gaLocation w5gbanLineType(LineType w5gbanLineType) {
        this.w5gbanLineType = w5gbanLineType;
        return this;
    }

    public TnapId getTnapId() {
        return tnapId;
    }

    public void setTnapId(TnapId tnapId) {
        this.tnapId = tnapId;
    }

    public N3gaLocation tnapId(TnapId tnapId) {
        this.tnapId = tnapId;
        return this;
    }

    public Tai getN3gppTai() {
        return n3gppTai;
    }

    public void setN3gppTai(Tai n3gppTai) {
        this.n3gppTai = n3gppTai;
    }

    public N3gaLocation n3gppTai(Tai n3gppTai) {
        this.n3gppTai = n3gppTai;
        return this;
    }

    public String getGci() {
        return gci;
    }

    public void setGci(String gci) {
        this.gci = gci;
    }

    public N3gaLocation gci(String gci) {
        this.gci = gci;
        return this;
    }

    public Ipv6Addr getUeIpv6Addr() {
        return ueIpv6Addr;
    }

    public void setUeIpv6Addr(Ipv6Addr ueIpv6Addr) {
        this.ueIpv6Addr = ueIpv6Addr;
    }

    public N3gaLocation ueIpv6Addr(Ipv6Addr ueIpv6Addr) {
        this.ueIpv6Addr = ueIpv6Addr;
        return this;
    }

    public String getN3IwfId() {
        return n3IwfId;
    }

    public void setN3IwfId(String n3IwfId) {
        this.n3IwfId = n3IwfId;
    }

    public N3gaLocation n3IwfId(String n3IwfId) {
        this.n3IwfId = n3IwfId;
        return this;
    }

    public Integer getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
    }

    public N3gaLocation portNumber(Integer portNumber) {
        this.portNumber = portNumber;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((((((((((((((("N3gaLocation {"+"hfcNodeId = ")+ hfcNodeId)+", ")+"twapId = ")+ twapId)+", ")+"ueIpv4Addr = ")+ ueIpv4Addr)+", ")+"protocol = ")+ protocol)+", ")+"gli = ")+ gli)+", ")+"w5gbanLineType = ")+ w5gbanLineType)+", ")+"tnapId = ")+ tnapId)+", ")+"n3gppTai = ")+ n3gppTai)+", ")+"gci = ")+ gci)+", ")+"ueIpv6Addr = ")+ ueIpv6Addr)+", ")+"n3IwfId = ")+ n3IwfId)+", ")+"portNumber = ")+ portNumber)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(hfcNodeId, twapId, ueIpv4Addr, protocol, gli, w5gbanLineType, tnapId, n3gppTai, gci, ueIpv6Addr, n3IwfId, portNumber);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        N3gaLocation castThat = ((N3gaLocation) that);
        return (((((((((((Objects.equals(this.hfcNodeId, castThat.hfcNodeId)&&Objects.equals(this.twapId, castThat.twapId))&&Objects.equals(this.ueIpv4Addr, castThat.ueIpv4Addr))&&Objects.equals(this.protocol, castThat.protocol))&&Objects.equals(this.gli, castThat.gli))&&Objects.equals(this.w5gbanLineType, castThat.w5gbanLineType))&&Objects.equals(this.tnapId, castThat.tnapId))&&Objects.equals(this.n3gppTai, castThat.n3gppTai))&&Objects.equals(this.gci, castThat.gci))&&Objects.equals(this.ueIpv6Addr, castThat.ueIpv6Addr))&&Objects.equals(this.n3IwfId, castThat.n3IwfId))&&Objects.equals(this.portNumber, castThat.portNumber));
    }
}
