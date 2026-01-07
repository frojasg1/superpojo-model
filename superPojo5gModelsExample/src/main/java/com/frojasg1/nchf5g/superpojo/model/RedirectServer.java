
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class RedirectServer {
    public RedirectAddressType redirectAddressType;
    public String redirectServerAddress;

    public RedirectAddressType getRedirectAddressType() {
        return redirectAddressType;
    }

    public void setRedirectAddressType(RedirectAddressType redirectAddressType) {
        this.redirectAddressType = redirectAddressType;
    }

    public RedirectServer redirectAddressType(RedirectAddressType redirectAddressType) {
        this.redirectAddressType = redirectAddressType;
        return this;
    }

    public String getRedirectServerAddress() {
        return redirectServerAddress;
    }

    public void setRedirectServerAddress(String redirectServerAddress) {
        this.redirectServerAddress = redirectServerAddress;
    }

    public RedirectServer redirectServerAddress(String redirectServerAddress) {
        this.redirectServerAddress = redirectServerAddress;
        return this;
    }

    @Override
    public String toString() {
        return (((((("RedirectServer {"+"redirectAddressType = ")+ redirectAddressType)+", ")+"redirectServerAddress = ")+ redirectServerAddress)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(redirectAddressType, redirectServerAddress);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        RedirectServer castThat = ((RedirectServer) that);
        return (Objects.equals(this.redirectAddressType, castThat.redirectAddressType)&&Objects.equals(this.redirectServerAddress, castThat.redirectServerAddress));
    }
}
