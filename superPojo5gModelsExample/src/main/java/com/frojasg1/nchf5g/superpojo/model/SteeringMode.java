
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class SteeringMode {
    private AccessType active;
    private SteerModeValue steerModeValue;
    private AccessType prioAcc;
    private AccessType standby;

    public AccessType getActive() {
        return active;
    }

    public void setActive(AccessType active) {
        this.active = active;
    }

    public SteeringMode active(AccessType active) {
        this.active = active;
        return this;
    }

    public SteerModeValue getSteerModeValue() {
        return steerModeValue;
    }

    public void setSteerModeValue(SteerModeValue steerModeValue) {
        this.steerModeValue = steerModeValue;
    }

    public SteeringMode steerModeValue(SteerModeValue steerModeValue) {
        this.steerModeValue = steerModeValue;
        return this;
    }

    public AccessType getPrioAcc() {
        return prioAcc;
    }

    public void setPrioAcc(AccessType prioAcc) {
        this.prioAcc = prioAcc;
    }

    public SteeringMode prioAcc(AccessType prioAcc) {
        this.prioAcc = prioAcc;
        return this;
    }

    public AccessType getStandby() {
        return standby;
    }

    public void setStandby(AccessType standby) {
        this.standby = standby;
    }

    public SteeringMode standby(AccessType standby) {
        this.standby = standby;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((("SteeringMode {"+"active = ")+ active)+", ")+"steerModeValue = ")+ steerModeValue)+", ")+"prioAcc = ")+ prioAcc)+", ")+"standby = ")+ standby)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, steerModeValue, prioAcc, standby);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        SteeringMode castThat = ((SteeringMode) that);
        return (((Objects.equals(this.active, castThat.active)&&Objects.equals(this.steerModeValue, castThat.steerModeValue))&&Objects.equals(this.prioAcc, castThat.prioAcc))&&Objects.equals(this.standby, castThat.standby));
    }
}
