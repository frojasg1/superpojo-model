
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class ChargingNotifyResponse {
    public InvocationResult invocationResult;

    public InvocationResult getInvocationResult() {
        return invocationResult;
    }

    public void setInvocationResult(InvocationResult invocationResult) {
        this.invocationResult = invocationResult;
    }

    public ChargingNotifyResponse invocationResult(InvocationResult invocationResult) {
        this.invocationResult = invocationResult;
        return this;
    }

    @Override
    public String toString() {
        return ((("ChargingNotifyResponse {"+"invocationResult = ")+ invocationResult)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(invocationResult);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        ChargingNotifyResponse castThat = ((ChargingNotifyResponse) that);
        return Objects.equals(this.invocationResult, castThat.invocationResult);
    }
}
