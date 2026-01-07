
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class Ambr {
    public String downlink;
    public String uplink;

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

    @Override
    public String toString() {
        return (((((("Ambr {"+"downlink = ")+ downlink)+", ")+"uplink = ")+ uplink)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(downlink, uplink);
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
        return (Objects.equals(this.downlink, castThat.downlink)&&Objects.equals(this.uplink, castThat.uplink));
    }
}
