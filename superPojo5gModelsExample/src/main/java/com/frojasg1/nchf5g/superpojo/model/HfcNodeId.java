
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class HfcNodeId {
    private String hfcNId;

    public String getHfcNId() {
        return hfcNId;
    }

    public void setHfcNId(String hfcNId) {
        this.hfcNId = hfcNId;
    }

    public HfcNodeId hfcNId(String hfcNId) {
        this.hfcNId = hfcNId;
        return this;
    }

    @Override
    public String toString() {
        return ((("HfcNodeId {"+"hfcNId = ")+ hfcNId)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(hfcNId);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        HfcNodeId castThat = ((HfcNodeId) that);
        return Objects.equals(this.hfcNId, castThat.hfcNId);
    }
}
