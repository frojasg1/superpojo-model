
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class MAPDUSessionInformation {
    private AtsssCapability aTSSSCapability;
    private MaPduIndication mAPDUSessionIndicator;

    public AtsssCapability getaTSSSCapability() {
        return aTSSSCapability;
    }

    public void setaTSSSCapability(AtsssCapability aTSSSCapability) {
        this.aTSSSCapability = aTSSSCapability;
    }

    public MAPDUSessionInformation aTSSSCapability(AtsssCapability aTSSSCapability) {
        this.aTSSSCapability = aTSSSCapability;
        return this;
    }

    public MaPduIndication getmAPDUSessionIndicator() {
        return mAPDUSessionIndicator;
    }

    public void setmAPDUSessionIndicator(MaPduIndication mAPDUSessionIndicator) {
        this.mAPDUSessionIndicator = mAPDUSessionIndicator;
    }

    public MAPDUSessionInformation mAPDUSessionIndicator(MaPduIndication mAPDUSessionIndicator) {
        this.mAPDUSessionIndicator = mAPDUSessionIndicator;
        return this;
    }

    @Override
    public String toString() {
        return (((((("MAPDUSessionInformation {"+"aTSSSCapability = ")+ aTSSSCapability)+", ")+"mAPDUSessionIndicator = ")+ mAPDUSessionIndicator)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(aTSSSCapability, mAPDUSessionIndicator);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        MAPDUSessionInformation castThat = ((MAPDUSessionInformation) that);
        return (Objects.equals(this.aTSSSCapability, castThat.aTSSSCapability)&&Objects.equals(this.mAPDUSessionIndicator, castThat.mAPDUSessionIndicator));
    }
}
