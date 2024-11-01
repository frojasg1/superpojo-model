
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProblemDetails {
    private String instance;
    private String supportedFeatures;
    private AccessTokenReq accessTokenRequest;
    private List<InvalidParam> invalidParams;
    private String cause;
    private String detail;
    private String type;
    private String title;
    private AccessTokenErr accessTokenError;
    private String nrfId;
    private Integer status;

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public ProblemDetails instance(String instance) {
        this.instance = instance;
        return this;
    }

    public String getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }

    public ProblemDetails supportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
        return this;
    }

    public AccessTokenReq getAccessTokenRequest() {
        return accessTokenRequest;
    }

    public void setAccessTokenRequest(AccessTokenReq accessTokenRequest) {
        this.accessTokenRequest = accessTokenRequest;
    }

    public ProblemDetails accessTokenRequest(AccessTokenReq accessTokenRequest) {
        this.accessTokenRequest = accessTokenRequest;
        return this;
    }

    public List<InvalidParam> getInvalidParams() {
        return invalidParams;
    }

    public void setInvalidParams(List<InvalidParam> invalidParams) {
        this.invalidParams = invalidParams;
    }

    public ProblemDetails invalidParams(List<InvalidParam> invalidParams) {
        this.invalidParams = invalidParams;
        return this;
    }

    public ProblemDetails addInvalidParamsItem(InvalidParam item) {
        if (this.invalidParams == null) {
            this.invalidParams = new ArrayList();
        }
        this.invalidParams.add(item);
        return this;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public ProblemDetails cause(String cause) {
        this.cause = cause;
        return this;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ProblemDetails detail(String detail) {
        this.detail = detail;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProblemDetails type(String type) {
        this.type = type;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProblemDetails title(String title) {
        this.title = title;
        return this;
    }

    public AccessTokenErr getAccessTokenError() {
        return accessTokenError;
    }

    public void setAccessTokenError(AccessTokenErr accessTokenError) {
        this.accessTokenError = accessTokenError;
    }

    public ProblemDetails accessTokenError(AccessTokenErr accessTokenError) {
        this.accessTokenError = accessTokenError;
        return this;
    }

    public String getNrfId() {
        return nrfId;
    }

    public void setNrfId(String nrfId) {
        this.nrfId = nrfId;
    }

    public ProblemDetails nrfId(String nrfId) {
        this.nrfId = nrfId;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ProblemDetails status(Integer status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((((((((((((((("ProblemDetails {"+"instance = ")+ instance)+", ")+"supportedFeatures = ")+ supportedFeatures)+", ")+"accessTokenRequest = ")+ accessTokenRequest)+", ")+"invalidParams = ")+ invalidParams)+", ")+"cause = ")+ cause)+", ")+"detail = ")+ detail)+", ")+"type = ")+ type)+", ")+"title = ")+ title)+", ")+"accessTokenError = ")+ accessTokenError)+", ")+"nrfId = ")+ nrfId)+", ")+"status = ")+ status)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, supportedFeatures, accessTokenRequest, invalidParams, cause, detail, type, title, accessTokenError, nrfId, status);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        ProblemDetails castThat = ((ProblemDetails) that);
        return ((((((((((Objects.equals(this.instance, castThat.instance)&&Objects.equals(this.supportedFeatures, castThat.supportedFeatures))&&Objects.equals(this.accessTokenRequest, castThat.accessTokenRequest))&&Objects.equals(this.invalidParams, castThat.invalidParams))&&Objects.equals(this.cause, castThat.cause))&&Objects.equals(this.detail, castThat.detail))&&Objects.equals(this.type, castThat.type))&&Objects.equals(this.title, castThat.title))&&Objects.equals(this.accessTokenError, castThat.accessTokenError))&&Objects.equals(this.nrfId, castThat.nrfId))&&Objects.equals(this.status, castThat.status));
    }
}
