
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class Ipv6Prefix {

    @Override
    public String toString() {
        return ("Ipv6Prefix {"+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        Ipv6Prefix castThat = ((Ipv6Prefix) that);
        return true;
    }
}
