
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class SvcExperience {
    private Float mos;
    private Float lowerRange;
    private Float upperRange;

    public Float getMos() {
        return mos;
    }

    public void setMos(Float mos) {
        this.mos = mos;
    }

    public SvcExperience mos(Float mos) {
        this.mos = mos;
        return this;
    }

    public Float getLowerRange() {
        return lowerRange;
    }

    public void setLowerRange(Float lowerRange) {
        this.lowerRange = lowerRange;
    }

    public SvcExperience lowerRange(Float lowerRange) {
        this.lowerRange = lowerRange;
        return this;
    }

    public Float getUpperRange() {
        return upperRange;
    }

    public void setUpperRange(Float upperRange) {
        this.upperRange = upperRange;
    }

    public SvcExperience upperRange(Float upperRange) {
        this.upperRange = upperRange;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("SvcExperience {"+"mos = ")+ mos)+", ")+"lowerRange = ")+ lowerRange)+", ")+"upperRange = ")+ upperRange)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(mos, lowerRange, upperRange);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        SvcExperience castThat = ((SvcExperience) that);
        return ((Objects.equals(this.mos, castThat.mos)&&Objects.equals(this.lowerRange, castThat.lowerRange))&&Objects.equals(this.upperRange, castThat.upperRange));
    }
}
