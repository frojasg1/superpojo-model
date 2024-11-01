
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class RoamingQBCInformation {
    private UUID uPFID;
    private RoamingChargingProfile roamingChargingProfile;
    private List<MultipleQFIcontainer> multipleQFIcontainer;

    public UUID getuPFID() {
        return uPFID;
    }

    public void setuPFID(UUID uPFID) {
        this.uPFID = uPFID;
    }

    public RoamingQBCInformation uPFID(UUID uPFID) {
        this.uPFID = uPFID;
        return this;
    }

    public RoamingChargingProfile getRoamingChargingProfile() {
        return roamingChargingProfile;
    }

    public void setRoamingChargingProfile(RoamingChargingProfile roamingChargingProfile) {
        this.roamingChargingProfile = roamingChargingProfile;
    }

    public RoamingQBCInformation roamingChargingProfile(RoamingChargingProfile roamingChargingProfile) {
        this.roamingChargingProfile = roamingChargingProfile;
        return this;
    }

    public List<MultipleQFIcontainer> getMultipleQFIcontainer() {
        return multipleQFIcontainer;
    }

    public void setMultipleQFIcontainer(List<MultipleQFIcontainer> multipleQFIcontainer) {
        this.multipleQFIcontainer = multipleQFIcontainer;
    }

    public RoamingQBCInformation multipleQFIcontainer(List<MultipleQFIcontainer> multipleQFIcontainer) {
        this.multipleQFIcontainer = multipleQFIcontainer;
        return this;
    }

    public RoamingQBCInformation addMultipleQFIcontainerItem(MultipleQFIcontainer item) {
        if (this.multipleQFIcontainer == null) {
            this.multipleQFIcontainer = new ArrayList();
        }
        this.multipleQFIcontainer.add(item);
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("RoamingQBCInformation {"+"uPFID = ")+ uPFID)+", ")+"roamingChargingProfile = ")+ roamingChargingProfile)+", ")+"multipleQFIcontainer = ")+ multipleQFIcontainer)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(uPFID, roamingChargingProfile, multipleQFIcontainer);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        RoamingQBCInformation castThat = ((RoamingQBCInformation) that);
        return ((Objects.equals(this.uPFID, castThat.uPFID)&&Objects.equals(this.roamingChargingProfile, castThat.roamingChargingProfile))&&Objects.equals(this.multipleQFIcontainer, castThat.multipleQFIcontainer));
    }
}
