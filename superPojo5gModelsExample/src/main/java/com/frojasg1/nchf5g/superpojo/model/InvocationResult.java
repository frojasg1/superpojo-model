
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class InvocationResult {
    public ProblemDetails error;
    public FailureHandling failureHandling;

    public ProblemDetails getError() {
        return error;
    }

    public void setError(ProblemDetails error) {
        this.error = error;
    }

    public InvocationResult error(ProblemDetails error) {
        this.error = error;
        return this;
    }

    public FailureHandling getFailureHandling() {
        return failureHandling;
    }

    public void setFailureHandling(FailureHandling failureHandling) {
        this.failureHandling = failureHandling;
    }

    public InvocationResult failureHandling(FailureHandling failureHandling) {
        this.failureHandling = failureHandling;
        return this;
    }

    @Override
    public String toString() {
        return (((((("InvocationResult {"+"error = ")+ error)+", ")+"failureHandling = ")+ failureHandling)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, failureHandling);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        InvocationResult castThat = ((InvocationResult) that);
        return (Objects.equals(this.error, castThat.error)&&Objects.equals(this.failureHandling, castThat.failureHandling));
    }
}
