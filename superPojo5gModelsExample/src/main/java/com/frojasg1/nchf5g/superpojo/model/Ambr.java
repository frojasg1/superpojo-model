
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class Ambr {
    private String uplink;
    private String downlink;

    public String getUplink() {
        return uplink;
    }

    public void setUplink(String uplink) {
        this.uplink = uplink;
    }

    public Ambr uplink(String uplink) {
        this.uplink = uplink;
        return this;
    }

    public String getDownlink() {
        return downlink;
    }

    public void setDownlink(String downlink) {
        this.downlink = downlink;
    }

    public Ambr downlink(String downlink) {
        this.downlink = downlink;
        return this;
    }

    @Override
    public String toString() {
        return (((((("Ambr {"+"uplink = ")+ uplink)+", ")+"downlink = ")+ downlink)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(uplink, downlink);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        Ambr castThat = ((Ambr) that);
        return (Objects.equals(this.uplink, castThat.uplink)&&Objects.equals(this.downlink, castThat.downlink));
    }
}
