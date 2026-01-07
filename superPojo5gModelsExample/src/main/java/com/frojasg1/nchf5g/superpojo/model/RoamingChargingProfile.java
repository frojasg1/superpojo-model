
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RoamingChargingProfile {
    public List<Trigger> triggers;
    public PartialRecordMethod partialRecordMethod;

    public List<Trigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    public RoamingChargingProfile triggers(List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public RoamingChargingProfile addTriggersItem(Trigger item) {
        if (this.triggers == null) {
            this.triggers = new ArrayList();
        }
        this.triggers.add(item);
        return this;
    }

    public PartialRecordMethod getPartialRecordMethod() {
        return partialRecordMethod;
    }

    public void setPartialRecordMethod(PartialRecordMethod partialRecordMethod) {
        this.partialRecordMethod = partialRecordMethod;
    }

    public RoamingChargingProfile partialRecordMethod(PartialRecordMethod partialRecordMethod) {
        this.partialRecordMethod = partialRecordMethod;
        return this;
    }

    @Override
    public String toString() {
        return (((((("RoamingChargingProfile {"+"triggers = ")+ triggers)+", ")+"partialRecordMethod = ")+ partialRecordMethod)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggers, partialRecordMethod);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        RoamingChargingProfile castThat = ((RoamingChargingProfile) that);
        return (Objects.equals(this.triggers, castThat.triggers)&&Objects.equals(this.partialRecordMethod, castThat.partialRecordMethod));
    }
}
