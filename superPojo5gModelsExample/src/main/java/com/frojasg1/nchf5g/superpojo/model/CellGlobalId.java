
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class CellGlobalId {
    private PlmnId plmnId;
    private String cellId;
    private String lac;

    public PlmnId getPlmnId() {
        return plmnId;
    }

    public void setPlmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
    }

    public CellGlobalId plmnId(PlmnId plmnId) {
        this.plmnId = plmnId;
        return this;
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    public CellGlobalId cellId(String cellId) {
        this.cellId = cellId;
        return this;
    }

    public String getLac() {
        return lac;
    }

    public void setLac(String lac) {
        this.lac = lac;
    }

    public CellGlobalId lac(String lac) {
        this.lac = lac;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("CellGlobalId {"+"plmnId = ")+ plmnId)+", ")+"cellId = ")+ cellId)+", ")+"lac = ")+ lac)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(plmnId, cellId, lac);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        CellGlobalId castThat = ((CellGlobalId) that);
        return ((Objects.equals(this.plmnId, castThat.plmnId)&&Objects.equals(this.cellId, castThat.cellId))&&Objects.equals(this.lac, castThat.lac));
    }
}
