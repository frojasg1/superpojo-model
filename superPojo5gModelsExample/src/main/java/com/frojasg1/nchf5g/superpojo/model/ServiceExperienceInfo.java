
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServiceExperienceInfo {
    private NetworkAreaInfo networkArea;
    private Snssai snssai;
    private Float svcExprcVariance;
    private List<String> supis;
    private SvcExperience svcExprc;
    private String dnn;
    private Integer confidence;
    private String appId;
    private String nsiId;
    private Integer ratio;

    public NetworkAreaInfo getNetworkArea() {
        return networkArea;
    }

    public void setNetworkArea(NetworkAreaInfo networkArea) {
        this.networkArea = networkArea;
    }

    public ServiceExperienceInfo networkArea(NetworkAreaInfo networkArea) {
        this.networkArea = networkArea;
        return this;
    }

    public Snssai getSnssai() {
        return snssai;
    }

    public void setSnssai(Snssai snssai) {
        this.snssai = snssai;
    }

    public ServiceExperienceInfo snssai(Snssai snssai) {
        this.snssai = snssai;
        return this;
    }

    public Float getSvcExprcVariance() {
        return svcExprcVariance;
    }

    public void setSvcExprcVariance(Float svcExprcVariance) {
        this.svcExprcVariance = svcExprcVariance;
    }

    public ServiceExperienceInfo svcExprcVariance(Float svcExprcVariance) {
        this.svcExprcVariance = svcExprcVariance;
        return this;
    }

    public List<String> getSupis() {
        return supis;
    }

    public void setSupis(List<String> supis) {
        this.supis = supis;
    }

    public ServiceExperienceInfo supis(List<String> supis) {
        this.supis = supis;
        return this;
    }

    public ServiceExperienceInfo addSupisItem(String item) {
        if (this.supis == null) {
            this.supis = new ArrayList();
        }
        this.supis.add(item);
        return this;
    }

    public SvcExperience getSvcExprc() {
        return svcExprc;
    }

    public void setSvcExprc(SvcExperience svcExprc) {
        this.svcExprc = svcExprc;
    }

    public ServiceExperienceInfo svcExprc(SvcExperience svcExprc) {
        this.svcExprc = svcExprc;
        return this;
    }

    public String getDnn() {
        return dnn;
    }

    public void setDnn(String dnn) {
        this.dnn = dnn;
    }

    public ServiceExperienceInfo dnn(String dnn) {
        this.dnn = dnn;
        return this;
    }

    public Integer getConfidence() {
        return confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    public ServiceExperienceInfo confidence(Integer confidence) {
        this.confidence = confidence;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ServiceExperienceInfo appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getNsiId() {
        return nsiId;
    }

    public void setNsiId(String nsiId) {
        this.nsiId = nsiId;
    }

    public ServiceExperienceInfo nsiId(String nsiId) {
        this.nsiId = nsiId;
        return this;
    }

    public Integer getRatio() {
        return ratio;
    }

    public void setRatio(Integer ratio) {
        this.ratio = ratio;
    }

    public ServiceExperienceInfo ratio(Integer ratio) {
        this.ratio = ratio;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((((((((("ServiceExperienceInfo {"+"networkArea = ")+ networkArea)+", ")+"snssai = ")+ snssai)+", ")+"svcExprcVariance = ")+ svcExprcVariance)+", ")+"supis = ")+ supis)+", ")+"svcExprc = ")+ svcExprc)+", ")+"dnn = ")+ dnn)+", ")+"confidence = ")+ confidence)+", ")+"appId = ")+ appId)+", ")+"nsiId = ")+ nsiId)+", ")+"ratio = ")+ ratio)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkArea, snssai, svcExprcVariance, supis, svcExprc, dnn, confidence, appId, nsiId, ratio);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        ServiceExperienceInfo castThat = ((ServiceExperienceInfo) that);
        return (((((((((Objects.equals(this.networkArea, castThat.networkArea)&&Objects.equals(this.snssai, castThat.snssai))&&Objects.equals(this.svcExprcVariance, castThat.svcExprcVariance))&&Objects.equals(this.supis, castThat.supis))&&Objects.equals(this.svcExprc, castThat.svcExprc))&&Objects.equals(this.dnn, castThat.dnn))&&Objects.equals(this.confidence, castThat.confidence))&&Objects.equals(this.appId, castThat.appId))&&Objects.equals(this.nsiId, castThat.nsiId))&&Objects.equals(this.ratio, castThat.ratio));
    }
}
