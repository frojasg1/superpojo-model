
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class AccessTokenErr {
    public String errorUri;
    public String errorDescription;
    public AccessTokenErr.ErrorEnum error;

    public String getErrorUri() {
        return errorUri;
    }

    public void setErrorUri(String errorUri) {
        this.errorUri = errorUri;
    }

    public AccessTokenErr errorUri(String errorUri) {
        this.errorUri = errorUri;
        return this;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public AccessTokenErr errorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }

    public AccessTokenErr.ErrorEnum getError() {
        return error;
    }

    public void setError(AccessTokenErr.ErrorEnum error) {
        this.error = error;
    }

    public AccessTokenErr error(AccessTokenErr.ErrorEnum error) {
        this.error = error;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((("AccessTokenErr {"+"errorUri = ")+ errorUri)+", ")+"errorDescription = ")+ errorDescription)+", ")+"error = ")+ error)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorUri, errorDescription, error);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        AccessTokenErr castThat = ((AccessTokenErr) that);
        return ((Objects.equals(this.errorUri, castThat.errorUri)&&Objects.equals(this.errorDescription, castThat.errorDescription))&&Objects.equals(this.error, castThat.error));
    }

    public static enum ErrorEnum {
        INVALID_REQUEST,
        INVALID_CLIENT,
        INVALID_GRANT,
        UNAUTHORIZED_CLIENT,
        UNSUPPORTED_GRANT_TYPE,
        INVALID_SCOPE;
    }
}
