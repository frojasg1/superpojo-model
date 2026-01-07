
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class PSCellInformation {
    public Ncgi nrcgi;
    public Ecgi ecgi;

    public Ncgi getNrcgi() {
        return nrcgi;
    }

    public void setNrcgi(Ncgi nrcgi) {
        this.nrcgi = nrcgi;
    }

    public PSCellInformation nrcgi(Ncgi nrcgi) {
        this.nrcgi = nrcgi;
        return this;
    }

    public Ecgi getEcgi() {
        return ecgi;
    }

    public void setEcgi(Ecgi ecgi) {
        this.ecgi = ecgi;
    }

    public PSCellInformation ecgi(Ecgi ecgi) {
        this.ecgi = ecgi;
        return this;
    }

    @Override
    public String toString() {
        return (((((("PSCellInformation {"+"nrcgi = ")+ nrcgi)+", ")+"ecgi = ")+ ecgi)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrcgi, ecgi);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        PSCellInformation castThat = ((PSCellInformation) that);
        return (Objects.equals(this.nrcgi, castThat.nrcgi)&&Objects.equals(this.ecgi, castThat.ecgi));
    }
}
