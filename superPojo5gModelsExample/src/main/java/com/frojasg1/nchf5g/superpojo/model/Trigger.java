
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Date;
import java.util.Objects;

public class Trigger {
    public Integer timeLimit;
    public Date tariffTimeChange;
    public Long volumeLimit64;
    public Integer maxNumberOfccc;
    public Integer eventLimit;
    public Integer volumeLimit;
    public TriggerType triggerType;
    public TriggerCategory triggerCategory;

    public Integer getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Trigger timeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
        return this;
    }

    public Date getTariffTimeChange() {
        return tariffTimeChange;
    }

    public void setTariffTimeChange(Date tariffTimeChange) {
        this.tariffTimeChange = tariffTimeChange;
    }

    public Trigger tariffTimeChange(Date tariffTimeChange) {
        this.tariffTimeChange = tariffTimeChange;
        return this;
    }

    public Long getVolumeLimit64() {
        return volumeLimit64;
    }

    public void setVolumeLimit64(Long volumeLimit64) {
        this.volumeLimit64 = volumeLimit64;
    }

    public Trigger volumeLimit64(Long volumeLimit64) {
        this.volumeLimit64 = volumeLimit64;
        return this;
    }

    public Integer getMaxNumberOfccc() {
        return maxNumberOfccc;
    }

    public void setMaxNumberOfccc(Integer maxNumberOfccc) {
        this.maxNumberOfccc = maxNumberOfccc;
    }

    public Trigger maxNumberOfccc(Integer maxNumberOfccc) {
        this.maxNumberOfccc = maxNumberOfccc;
        return this;
    }

    public Integer getEventLimit() {
        return eventLimit;
    }

    public void setEventLimit(Integer eventLimit) {
        this.eventLimit = eventLimit;
    }

    public Trigger eventLimit(Integer eventLimit) {
        this.eventLimit = eventLimit;
        return this;
    }

    public Integer getVolumeLimit() {
        return volumeLimit;
    }

    public void setVolumeLimit(Integer volumeLimit) {
        this.volumeLimit = volumeLimit;
    }

    public Trigger volumeLimit(Integer volumeLimit) {
        this.volumeLimit = volumeLimit;
        return this;
    }

    public TriggerType getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(TriggerType triggerType) {
        this.triggerType = triggerType;
    }

    public Trigger triggerType(TriggerType triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    public TriggerCategory getTriggerCategory() {
        return triggerCategory;
    }

    public void setTriggerCategory(TriggerCategory triggerCategory) {
        this.triggerCategory = triggerCategory;
    }

    public Trigger triggerCategory(TriggerCategory triggerCategory) {
        this.triggerCategory = triggerCategory;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((("Trigger {"+"timeLimit = ")+ timeLimit)+", ")+"tariffTimeChange = ")+ tariffTimeChange)+", ")+"volumeLimit64 = ")+ volumeLimit64)+", ")+"maxNumberOfccc = ")+ maxNumberOfccc)+", ")+"eventLimit = ")+ eventLimit)+", ")+"volumeLimit = ")+ volumeLimit)+", ")+"triggerType = ")+ triggerType)+", ")+"triggerCategory = ")+ triggerCategory)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeLimit, tariffTimeChange, volumeLimit64, maxNumberOfccc, eventLimit, volumeLimit, triggerType, triggerCategory);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        Trigger castThat = ((Trigger) that);
        return (((((((Objects.equals(this.timeLimit, castThat.timeLimit)&&Objects.equals(this.tariffTimeChange, castThat.tariffTimeChange))&&Objects.equals(this.volumeLimit64, castThat.volumeLimit64))&&Objects.equals(this.maxNumberOfccc, castThat.maxNumberOfccc))&&Objects.equals(this.eventLimit, castThat.eventLimit))&&Objects.equals(this.volumeLimit, castThat.volumeLimit))&&Objects.equals(this.triggerType, castThat.triggerType))&&Objects.equals(this.triggerCategory, castThat.triggerCategory));
    }
}
