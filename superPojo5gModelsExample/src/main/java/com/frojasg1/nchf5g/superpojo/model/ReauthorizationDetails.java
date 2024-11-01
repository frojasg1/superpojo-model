
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class ReauthorizationDetails {
    private QuotaManagementIndicator quotaManagementIndicator;
    private Integer serviceId;
    private Integer ratingGroup;

    public QuotaManagementIndicator getQuotaManagementIndicator() {
        return quotaManagementIndicator;
    }

    public void setQuotaManagementIndicator(QuotaManagementIndicator quotaManagementIndicator) {
        this.quotaManagementIndicator = quotaManagementIndicator;
    }

    public ReauthorizationDetails quotaManagementIndicator(QuotaManagementIndicator quotaManagementIndicator) {
        this.quotaManagementIndicator = quotaManagementIndicator;
        return this;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public ReauthorizationDetails serviceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public Integer getRatingGroup() {
        return ratingGroup;
    }

    public void setRatingGroup(Integer ratingGroup) {
        this.ratingGroup = ratingGroup;
    }

    public ReauthorizationDetails ratingGroup(Integer ratingGroup) {
        this.ratingGroup = ratingGroup;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("ReauthorizationDetails {"+"quotaManagementIndicator = ")+ quotaManagementIndicator)+", ")+"serviceId = ")+ serviceId)+", ")+"ratingGroup = ")+ ratingGroup)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaManagementIndicator, serviceId, ratingGroup);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        ReauthorizationDetails castThat = ((ReauthorizationDetails) that);
        return ((Objects.equals(this.quotaManagementIndicator, castThat.quotaManagementIndicator)&&Objects.equals(this.serviceId, castThat.serviceId))&&Objects.equals(this.ratingGroup, castThat.ratingGroup));
    }
}
