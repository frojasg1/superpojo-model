
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Area {
    public String areaCode;
    public List<String> tacs;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Area areaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    public List<String> getTacs() {
        return tacs;
    }

    public void setTacs(List<String> tacs) {
        this.tacs = tacs;
    }

    public Area tacs(List<String> tacs) {
        this.tacs = tacs;
        return this;
    }

    public Area addTacsItem(String item) {
        if (this.tacs == null) {
            this.tacs = new ArrayList();
        }
        this.tacs.add(item);
        return this;
    }

    @Override
    public String toString() {
        return (((((("Area {"+"areaCode = ")+ areaCode)+", ")+"tacs = ")+ tacs)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, tacs);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        Area castThat = ((Area) that);
        return (Objects.equals(this.areaCode, castThat.areaCode)&&Objects.equals(this.tacs, castThat.tacs));
    }
}
