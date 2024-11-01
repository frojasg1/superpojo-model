
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class AtsssCapability {
    private Boolean atsssLL;
    private Boolean mptcp;
    private Boolean rttWithoutPmf;

    public Boolean getAtsssLL() {
        return atsssLL;
    }

    public void setAtsssLL(Boolean atsssLL) {
        this.atsssLL = atsssLL;
    }

    public AtsssCapability atsssLL(Boolean atsssLL) {
        this.atsssLL = atsssLL;
        return this;
    }

    public Boolean getMptcp() {
        return mptcp;
    }

    public void setMptcp(Boolean mptcp) {
        this.mptcp = mptcp;
    }

    public AtsssCapability mptcp(Boolean mptcp) {
        this.mptcp = mptcp;
        return this;
    }

    public Boolean getRttWithoutPmf() {
        return rttWithoutPmf;
    }

    public void setRttWithoutPmf(Boolean rttWithoutPmf) {
        this.rttWithoutPmf = rttWithoutPmf;
    }

    public AtsssCapability rttWithoutPmf(Boolean rttWithoutPmf) {
        this.rttWithoutPmf = rttWithoutPmf;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("AtsssCapability {"+"atsssLL = ")+ atsssLL)+", ")+"mptcp = ")+ mptcp)+", ")+"rttWithoutPmf = ")+ rttWithoutPmf)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(atsssLL, mptcp, rttWithoutPmf);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        AtsssCapability castThat = ((AtsssCapability) that);
        return ((Objects.equals(this.atsssLL, castThat.atsssLL)&&Objects.equals(this.mptcp, castThat.mptcp))&&Objects.equals(this.rttWithoutPmf, castThat.rttWithoutPmf));
    }
}
