
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class Throughput {
    private Float maximumThpt;
    private Float guaranteedThpt;

    public Float getMaximumThpt() {
        return maximumThpt;
    }

    public void setMaximumThpt(Float maximumThpt) {
        this.maximumThpt = maximumThpt;
    }

    public Throughput maximumThpt(Float maximumThpt) {
        this.maximumThpt = maximumThpt;
        return this;
    }

    public Float getGuaranteedThpt() {
        return guaranteedThpt;
    }

    public void setGuaranteedThpt(Float guaranteedThpt) {
        this.guaranteedThpt = guaranteedThpt;
    }

    public Throughput guaranteedThpt(Float guaranteedThpt) {
        this.guaranteedThpt = guaranteedThpt;
        return this;
    }

    @Override
    public String toString() {
        return (((((("Throughput {"+"maximumThpt = ")+ maximumThpt)+", ")+"guaranteedThpt = ")+ guaranteedThpt)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(maximumThpt, guaranteedThpt);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        Throughput castThat = ((Throughput) that);
        return (Objects.equals(this.maximumThpt, castThat.maximumThpt)&&Objects.equals(this.guaranteedThpt, castThat.guaranteedThpt));
    }
}
