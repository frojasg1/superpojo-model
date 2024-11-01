
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class AuthorizedDefaultQos {
    private Integer extMaxDataBurstVol;
    private Integer priorityLevel;
    private String gbrDl;
    private Integer maxDataBurstVol;
    private String gbrUl;
    private String maxbrDl;
    private String maxbrUl;
    private Arp arp;
    private Integer averWindow;

    public Integer getExtMaxDataBurstVol() {
        return extMaxDataBurstVol;
    }

    public void setExtMaxDataBurstVol(Integer extMaxDataBurstVol) {
        this.extMaxDataBurstVol = extMaxDataBurstVol;
    }

    public AuthorizedDefaultQos extMaxDataBurstVol(Integer extMaxDataBurstVol) {
        this.extMaxDataBurstVol = extMaxDataBurstVol;
        return this;
    }

    public Integer getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public AuthorizedDefaultQos priorityLevel(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
        return this;
    }

    public String getGbrDl() {
        return gbrDl;
    }

    public void setGbrDl(String gbrDl) {
        this.gbrDl = gbrDl;
    }

    public AuthorizedDefaultQos gbrDl(String gbrDl) {
        this.gbrDl = gbrDl;
        return this;
    }

    public Integer getMaxDataBurstVol() {
        return maxDataBurstVol;
    }

    public void setMaxDataBurstVol(Integer maxDataBurstVol) {
        this.maxDataBurstVol = maxDataBurstVol;
    }

    public AuthorizedDefaultQos maxDataBurstVol(Integer maxDataBurstVol) {
        this.maxDataBurstVol = maxDataBurstVol;
        return this;
    }

    public String getGbrUl() {
        return gbrUl;
    }

    public void setGbrUl(String gbrUl) {
        this.gbrUl = gbrUl;
    }

    public AuthorizedDefaultQos gbrUl(String gbrUl) {
        this.gbrUl = gbrUl;
        return this;
    }

    public String getMaxbrDl() {
        return maxbrDl;
    }

    public void setMaxbrDl(String maxbrDl) {
        this.maxbrDl = maxbrDl;
    }

    public AuthorizedDefaultQos maxbrDl(String maxbrDl) {
        this.maxbrDl = maxbrDl;
        return this;
    }

    public String getMaxbrUl() {
        return maxbrUl;
    }

    public void setMaxbrUl(String maxbrUl) {
        this.maxbrUl = maxbrUl;
    }

    public AuthorizedDefaultQos maxbrUl(String maxbrUl) {
        this.maxbrUl = maxbrUl;
        return this;
    }

    public Arp getArp() {
        return arp;
    }

    public void setArp(Arp arp) {
        this.arp = arp;
    }

    public AuthorizedDefaultQos arp(Arp arp) {
        this.arp = arp;
        return this;
    }

    public Integer getAverWindow() {
        return averWindow;
    }

    public void setAverWindow(Integer averWindow) {
        this.averWindow = averWindow;
    }

    public AuthorizedDefaultQos averWindow(Integer averWindow) {
        this.averWindow = averWindow;
        return this;
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((((((((("AuthorizedDefaultQos {"+"extMaxDataBurstVol = ")+ extMaxDataBurstVol)+", ")+"priorityLevel = ")+ priorityLevel)+", ")+"gbrDl = ")+ gbrDl)+", ")+"maxDataBurstVol = ")+ maxDataBurstVol)+", ")+"gbrUl = ")+ gbrUl)+", ")+"maxbrDl = ")+ maxbrDl)+", ")+"maxbrUl = ")+ maxbrUl)+", ")+"arp = ")+ arp)+", ")+"averWindow = ")+ averWindow)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(extMaxDataBurstVol, priorityLevel, gbrDl, maxDataBurstVol, gbrUl, maxbrDl, maxbrUl, arp, averWindow);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        AuthorizedDefaultQos castThat = ((AuthorizedDefaultQos) that);
        return ((((((((Objects.equals(this.extMaxDataBurstVol, castThat.extMaxDataBurstVol)&&Objects.equals(this.priorityLevel, castThat.priorityLevel))&&Objects.equals(this.gbrDl, castThat.gbrDl))&&Objects.equals(this.maxDataBurstVol, castThat.maxDataBurstVol))&&Objects.equals(this.gbrUl, castThat.gbrUl))&&Objects.equals(this.maxbrDl, castThat.maxbrDl))&&Objects.equals(this.maxbrUl, castThat.maxbrUl))&&Objects.equals(this.arp, castThat.arp))&&Objects.equals(this.averWindow, castThat.averWindow));
    }
}
