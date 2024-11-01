
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class SMAddressDomain {
    private String domainName;

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public SMAddressDomain domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    @Override
    public String toString() {
        return ((("SMAddressDomain {"+"domainName = ")+ domainName)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        SMAddressDomain castThat = ((SMAddressDomain) that);
        return Objects.equals(this.domainName, castThat.domainName);
    }
}
