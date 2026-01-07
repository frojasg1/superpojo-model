
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class MultipleUnitInformation {
    public Integer quotaHoldingTime;
    public UUID uPFID;
    public Integer timeQuotaThreshold;
    public Integer validityTime;
    public FinalUnitIndication finalUnitIndication;
    public GrantedUnit grantedUnit;
    public Integer ratingGroup;
    public ResultCode resultCode;
    public Long volumeQuotaThreshold;
    public List<Trigger> triggers;
    public Integer unitQuotaThreshold;

    public Integer getQuotaHoldingTime() {
        return quotaHoldingTime;
    }

    public void setQuotaHoldingTime(Integer quotaHoldingTime) {
        this.quotaHoldingTime = quotaHoldingTime;
    }

    public MultipleUnitInformation quotaHoldingTime(Integer quotaHoldingTime) {
        this.quotaHoldingTime = quotaHoldingTime;
        return this;
    }

    public UUID getuPFID() {
        return uPFID;
    }

    public void setuPFID(UUID uPFID) {
        this.uPFID = uPFID;
    }

    public MultipleUnitInformation uPFID(UUID uPFID) {
        this.uPFID = uPFID;
        return this;
    }

    public Integer getTimeQuotaThreshold() {
        return timeQuotaThreshold;
    }

    public void setTimeQuotaThreshold(Integer timeQuotaThreshold) {
        this.timeQuotaThreshold = timeQuotaThreshold;
    }

    public MultipleUnitInformation timeQuotaThreshold(Integer timeQuotaThreshold) {
        this.timeQuotaThreshold = timeQuotaThreshold;
        return this;
    }

    public Integer getValidityTime() {
        return validityTime;
    }

    public void setValidityTime(Integer validityTime) {
        this.validityTime = validityTime;
    }

    public MultipleUnitInformation validityTime(Integer validityTime) {
        this.validityTime = validityTime;
        return this;
    }

    public FinalUnitIndication getFinalUnitIndication() {
        return finalUnitIndication;
    }

    public void setFinalUnitIndication(FinalUnitIndication finalUnitIndication) {
        this.finalUnitIndication = finalUnitIndication;
    }

    public MultipleUnitInformation finalUnitIndication(FinalUnitIndication finalUnitIndication) {
        this.finalUnitIndication = finalUnitIndication;
        return this;
    }

    public GrantedUnit getGrantedUnit() {
        return grantedUnit;
    }

    public void setGrantedUnit(GrantedUnit grantedUnit) {
        this.grantedUnit = grantedUnit;
    }

    public MultipleUnitInformation grantedUnit(GrantedUnit grantedUnit) {
        this.grantedUnit = grantedUnit;
        return this;
    }

    public Integer getRatingGroup() {
        return ratingGroup;
    }

    public void setRatingGroup(Integer ratingGroup) {
        this.ratingGroup = ratingGroup;
    }

    public MultipleUnitInformation ratingGroup(Integer ratingGroup) {
        this.ratingGroup = ratingGroup;
        return this;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public MultipleUnitInformation resultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    public Long getVolumeQuotaThreshold() {
        return volumeQuotaThreshold;
    }

    public void setVolumeQuotaThreshold(Long volumeQuotaThreshold) {
        this.volumeQuotaThreshold = volumeQuotaThreshold;
    }

    public MultipleUnitInformation volumeQuotaThreshold(Long volumeQuotaThreshold) {
        this.volumeQuotaThreshold = volumeQuotaThreshold;
        return this;
    }

    public List<Trigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    public MultipleUnitInformation triggers(List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public MultipleUnitInformation addTriggersItem(Trigger item) {
        if (this.triggers == null) {
            this.triggers = new ArrayList();
        }
        this.triggers.add(item);
        return this;
    }

    public Integer getUnitQuotaThreshold() {
        return unitQuotaThreshold;
    }

    public void setUnitQuotaThreshold(Integer unitQuotaThreshold) {
        this.unitQuotaThreshold = unitQuotaThreshold;
    }

    public MultipleUnitInformation unitQuotaThreshold(Integer unitQuotaThreshold) {
        this.unitQuotaThreshold = unitQuotaThreshold;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((((((((((((((("MultipleUnitInformation {"+"quotaHoldingTime = ")+ quotaHoldingTime)+", ")+"uPFID = ")+ uPFID)+", ")+"timeQuotaThreshold = ")+ timeQuotaThreshold)+", ")+"validityTime = ")+ validityTime)+", ")+"finalUnitIndication = ")+ finalUnitIndication)+", ")+"grantedUnit = ")+ grantedUnit)+", ")+"ratingGroup = ")+ ratingGroup)+", ")+"resultCode = ")+ resultCode)+", ")+"volumeQuotaThreshold = ")+ volumeQuotaThreshold)+", ")+"triggers = ")+ triggers)+", ")+"unitQuotaThreshold = ")+ unitQuotaThreshold)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaHoldingTime, uPFID, timeQuotaThreshold, validityTime, finalUnitIndication, grantedUnit, ratingGroup, resultCode, volumeQuotaThreshold, triggers, unitQuotaThreshold);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        MultipleUnitInformation castThat = ((MultipleUnitInformation) that);
        return ((((((((((Objects.equals(this.quotaHoldingTime, castThat.quotaHoldingTime)&&Objects.equals(this.uPFID, castThat.uPFID))&&Objects.equals(this.timeQuotaThreshold, castThat.timeQuotaThreshold))&&Objects.equals(this.validityTime, castThat.validityTime))&&Objects.equals(this.finalUnitIndication, castThat.finalUnitIndication))&&Objects.equals(this.grantedUnit, castThat.grantedUnit))&&Objects.equals(this.ratingGroup, castThat.ratingGroup))&&Objects.equals(this.resultCode, castThat.resultCode))&&Objects.equals(this.volumeQuotaThreshold, castThat.volumeQuotaThreshold))&&Objects.equals(this.triggers, castThat.triggers))&&Objects.equals(this.unitQuotaThreshold, castThat.unitQuotaThreshold));
    }
}
