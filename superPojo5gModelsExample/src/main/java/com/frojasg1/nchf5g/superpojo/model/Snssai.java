
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class Snssai {
    public String sd;
    public Integer sst;

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public Snssai sd(String sd) {
        this.sd = sd;
        return this;
    }

    public Integer getSst() {
        return sst;
    }

    public void setSst(Integer sst) {
        this.sst = sst;
    }

    public Snssai sst(Integer sst) {
        this.sst = sst;
        return this;
    }

    @Override
    public String toString() {
        return (((((("Snssai {"+"sd = ")+ sd)+", ")+"sst = ")+ sst)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(sd, sst);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        Snssai castThat = ((Snssai) that);
        return (Objects.equals(this.sd, castThat.sd)&&Objects.equals(this.sst, castThat.sst));
    }
}
