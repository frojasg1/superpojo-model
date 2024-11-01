
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class NSSAIMap {
    private Snssai servingSnssai;
    private Snssai homeSnssai;

    public Snssai getServingSnssai() {
        return servingSnssai;
    }

    public void setServingSnssai(Snssai servingSnssai) {
        this.servingSnssai = servingSnssai;
    }

    public NSSAIMap servingSnssai(Snssai servingSnssai) {
        this.servingSnssai = servingSnssai;
        return this;
    }

    public Snssai getHomeSnssai() {
        return homeSnssai;
    }

    public void setHomeSnssai(Snssai homeSnssai) {
        this.homeSnssai = homeSnssai;
    }

    public NSSAIMap homeSnssai(Snssai homeSnssai) {
        this.homeSnssai = homeSnssai;
        return this;
    }

    @Override
    public String toString() {
        return (((((("NSSAIMap {"+"servingSnssai = ")+ servingSnssai)+", ")+"homeSnssai = ")+ homeSnssai)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(servingSnssai, homeSnssai);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        NSSAIMap castThat = ((NSSAIMap) that);
        return (Objects.equals(this.servingSnssai, castThat.servingSnssai)&&Objects.equals(this.homeSnssai, castThat.homeSnssai));
    }
}
