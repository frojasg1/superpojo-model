
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class InvalidParam {
    public String reason;
    public String param;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public InvalidParam reason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public InvalidParam param(String param) {
        this.param = param;
        return this;
    }

    @Override
    public String toString() {
        return (((((("InvalidParam {"+"reason = ")+ reason)+", ")+"param = ")+ param)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, param);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        InvalidParam castThat = ((InvalidParam) that);
        return (Objects.equals(this.reason, castThat.reason)&&Objects.equals(this.param, castThat.param));
    }
}
