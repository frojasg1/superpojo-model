
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class Arp {
    private PreemptionVulnerability preemptVuln;
    private Integer priorityLevel;
    private PreemptionCapability preemptCap;

    public PreemptionVulnerability getPreemptVuln() {
        return preemptVuln;
    }

    public void setPreemptVuln(PreemptionVulnerability preemptVuln) {
        this.preemptVuln = preemptVuln;
    }

    public Arp preemptVuln(PreemptionVulnerability preemptVuln) {
        this.preemptVuln = preemptVuln;
        return this;
    }

    public Integer getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public Arp priorityLevel(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
        return this;
    }

    public PreemptionCapability getPreemptCap() {
        return preemptCap;
    }

    public void setPreemptCap(PreemptionCapability preemptCap) {
        this.preemptCap = preemptCap;
    }

    public Arp preemptCap(PreemptionCapability preemptCap) {
        this.preemptCap = preemptCap;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("Arp {"+"preemptVuln = ")+ preemptVuln)+", ")+"priorityLevel = ")+ priorityLevel)+", ")+"preemptCap = ")+ preemptCap)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(preemptVuln, priorityLevel, preemptCap);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        Arp castThat = ((Arp) that);
        return ((Objects.equals(this.preemptVuln, castThat.preemptVuln)&&Objects.equals(this.priorityLevel, castThat.priorityLevel))&&Objects.equals(this.preemptCap, castThat.preemptCap));
    }
}
