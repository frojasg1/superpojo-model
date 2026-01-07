
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServiceAreaRestriction {
    public Integer maxNumOfTAsForNotAllowedAreas;
    public Integer maxNumOfTAs;
    public List<Area> areas;
    public RestrictionType restrictionType;

    public Integer getMaxNumOfTAsForNotAllowedAreas() {
        return maxNumOfTAsForNotAllowedAreas;
    }

    public void setMaxNumOfTAsForNotAllowedAreas(Integer maxNumOfTAsForNotAllowedAreas) {
        this.maxNumOfTAsForNotAllowedAreas = maxNumOfTAsForNotAllowedAreas;
    }

    public ServiceAreaRestriction maxNumOfTAsForNotAllowedAreas(Integer maxNumOfTAsForNotAllowedAreas) {
        this.maxNumOfTAsForNotAllowedAreas = maxNumOfTAsForNotAllowedAreas;
        return this;
    }

    public Integer getMaxNumOfTAs() {
        return maxNumOfTAs;
    }

    public void setMaxNumOfTAs(Integer maxNumOfTAs) {
        this.maxNumOfTAs = maxNumOfTAs;
    }

    public ServiceAreaRestriction maxNumOfTAs(Integer maxNumOfTAs) {
        this.maxNumOfTAs = maxNumOfTAs;
        return this;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public ServiceAreaRestriction areas(List<Area> areas) {
        this.areas = areas;
        return this;
    }

    public ServiceAreaRestriction addAreasItem(Area item) {
        if (this.areas == null) {
            this.areas = new ArrayList();
        }
        this.areas.add(item);
        return this;
    }

    public RestrictionType getRestrictionType() {
        return restrictionType;
    }

    public void setRestrictionType(RestrictionType restrictionType) {
        this.restrictionType = restrictionType;
    }

    public ServiceAreaRestriction restrictionType(RestrictionType restrictionType) {
        this.restrictionType = restrictionType;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((("ServiceAreaRestriction {"+"maxNumOfTAsForNotAllowedAreas = ")+ maxNumOfTAsForNotAllowedAreas)+", ")+"maxNumOfTAs = ")+ maxNumOfTAs)+", ")+"areas = ")+ areas)+", ")+"restrictionType = ")+ restrictionType)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxNumOfTAsForNotAllowedAreas, maxNumOfTAs, areas, restrictionType);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        ServiceAreaRestriction castThat = ((ServiceAreaRestriction) that);
        return (((Objects.equals(this.maxNumOfTAsForNotAllowedAreas, castThat.maxNumOfTAsForNotAllowedAreas)&&Objects.equals(this.maxNumOfTAs, castThat.maxNumOfTAs))&&Objects.equals(this.areas, castThat.areas))&&Objects.equals(this.restrictionType, castThat.restrictionType));
    }
}
