
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class RanNasRelCause {
    public String epsCause;
    public NgApCause ngApCause;

    public String getEpsCause() {
        return epsCause;
    }

    public void setEpsCause(String epsCause) {
        this.epsCause = epsCause;
    }

    public RanNasRelCause epsCause(String epsCause) {
        this.epsCause = epsCause;
        return this;
    }

    public NgApCause getNgApCause() {
        return ngApCause;
    }

    public void setNgApCause(NgApCause ngApCause) {
        this.ngApCause = ngApCause;
    }

    public RanNasRelCause ngApCause(NgApCause ngApCause) {
        this.ngApCause = ngApCause;
        return this;
    }

    @Override
    public String toString() {
        return (((((("RanNasRelCause {"+"epsCause = ")+ epsCause)+", ")+"ngApCause = ")+ ngApCause)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(epsCause, ngApCause);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        RanNasRelCause castThat = ((RanNasRelCause) that);
        return (Objects.equals(this.epsCause, castThat.epsCause)&&Objects.equals(this.ngApCause, castThat.ngApCause));
    }
}
