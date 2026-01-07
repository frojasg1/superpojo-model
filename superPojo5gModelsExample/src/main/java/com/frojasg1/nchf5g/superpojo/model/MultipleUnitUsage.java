
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class MultipleUnitUsage {
    public PDUAddress multihomedPDUAddress;
    public UUID uPFID;
    public List<UsedUnitContainer> usedUnitContainer;
    public Integer ratingGroup;
    public RequestedUnit requestedUnit;

    public PDUAddress getMultihomedPDUAddress() {
        return multihomedPDUAddress;
    }

    public void setMultihomedPDUAddress(PDUAddress multihomedPDUAddress) {
        this.multihomedPDUAddress = multihomedPDUAddress;
    }

    public MultipleUnitUsage multihomedPDUAddress(PDUAddress multihomedPDUAddress) {
        this.multihomedPDUAddress = multihomedPDUAddress;
        return this;
    }

    public UUID getuPFID() {
        return uPFID;
    }

    public void setuPFID(UUID uPFID) {
        this.uPFID = uPFID;
    }

    public MultipleUnitUsage uPFID(UUID uPFID) {
        this.uPFID = uPFID;
        return this;
    }

    public List<UsedUnitContainer> getUsedUnitContainer() {
        return usedUnitContainer;
    }

    public void setUsedUnitContainer(List<UsedUnitContainer> usedUnitContainer) {
        this.usedUnitContainer = usedUnitContainer;
    }

    public MultipleUnitUsage usedUnitContainer(List<UsedUnitContainer> usedUnitContainer) {
        this.usedUnitContainer = usedUnitContainer;
        return this;
    }

    public MultipleUnitUsage addUsedUnitContainerItem(UsedUnitContainer item) {
        if (this.usedUnitContainer == null) {
            this.usedUnitContainer = new ArrayList();
        }
        this.usedUnitContainer.add(item);
        return this;
    }

    public Integer getRatingGroup() {
        return ratingGroup;
    }

    public void setRatingGroup(Integer ratingGroup) {
        this.ratingGroup = ratingGroup;
    }

    public MultipleUnitUsage ratingGroup(Integer ratingGroup) {
        this.ratingGroup = ratingGroup;
        return this;
    }

    public RequestedUnit getRequestedUnit() {
        return requestedUnit;
    }

    public void setRequestedUnit(RequestedUnit requestedUnit) {
        this.requestedUnit = requestedUnit;
    }

    public MultipleUnitUsage requestedUnit(RequestedUnit requestedUnit) {
        this.requestedUnit = requestedUnit;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((("MultipleUnitUsage {"+"multihomedPDUAddress = ")+ multihomedPDUAddress)+", ")+"uPFID = ")+ uPFID)+", ")+"usedUnitContainer = ")+ usedUnitContainer)+", ")+"ratingGroup = ")+ ratingGroup)+", ")+"requestedUnit = ")+ requestedUnit)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(multihomedPDUAddress, uPFID, usedUnitContainer, ratingGroup, requestedUnit);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        MultipleUnitUsage castThat = ((MultipleUnitUsage) that);
        return ((((Objects.equals(this.multihomedPDUAddress, castThat.multihomedPDUAddress)&&Objects.equals(this.uPFID, castThat.uPFID))&&Objects.equals(this.usedUnitContainer, castThat.usedUnitContainer))&&Objects.equals(this.ratingGroup, castThat.ratingGroup))&&Objects.equals(this.requestedUnit, castThat.requestedUnit));
    }
}
