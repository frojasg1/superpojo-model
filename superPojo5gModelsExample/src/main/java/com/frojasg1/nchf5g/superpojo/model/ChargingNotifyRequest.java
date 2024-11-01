
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ChargingNotifyRequest {
    private List<ReauthorizationDetails> reauthorizationDetails;
    private NotificationType notificationType;

    public List<ReauthorizationDetails> getReauthorizationDetails() {
        return reauthorizationDetails;
    }

    public void setReauthorizationDetails(List<ReauthorizationDetails> reauthorizationDetails) {
        this.reauthorizationDetails = reauthorizationDetails;
    }

    public ChargingNotifyRequest reauthorizationDetails(List<ReauthorizationDetails> reauthorizationDetails) {
        this.reauthorizationDetails = reauthorizationDetails;
        return this;
    }

    public ChargingNotifyRequest addReauthorizationDetailsItem(ReauthorizationDetails item) {
        if (this.reauthorizationDetails == null) {
            this.reauthorizationDetails = new ArrayList();
        }
        this.reauthorizationDetails.add(item);
        return this;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public ChargingNotifyRequest notificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    @Override
    public String toString() {
        return (((((("ChargingNotifyRequest {"+"reauthorizationDetails = ")+ reauthorizationDetails)+", ")+"notificationType = ")+ notificationType)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(reauthorizationDetails, notificationType);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        ChargingNotifyRequest castThat = ((ChargingNotifyRequest) that);
        return (Objects.equals(this.reauthorizationDetails, castThat.reauthorizationDetails)&&Objects.equals(this.notificationType, castThat.notificationType));
    }
}
