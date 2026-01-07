
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class SubscribedDefaultQos {
    public Integer priorityLevel;
    public Arp arp;

    public Integer getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public SubscribedDefaultQos priorityLevel(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
        return this;
    }

    public Arp getArp() {
        return arp;
    }

    public void setArp(Arp arp) {
        this.arp = arp;
    }

    public SubscribedDefaultQos arp(Arp arp) {
        this.arp = arp;
        return this;
    }

    @Override
    public String toString() {
        return (((((("SubscribedDefaultQos {"+"priorityLevel = ")+ priorityLevel)+", ")+"arp = ")+ arp)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(priorityLevel, arp);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        SubscribedDefaultQos castThat = ((SubscribedDefaultQos) that);
        return (Objects.equals(this.priorityLevel, castThat.priorityLevel)&&Objects.equals(this.arp, castThat.arp));
    }
}
