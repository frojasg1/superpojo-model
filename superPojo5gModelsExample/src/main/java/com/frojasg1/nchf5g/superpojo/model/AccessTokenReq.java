
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class AccessTokenReq {
    private UUID nfInstanceId;
    private String targetNfSetId;
    private NFType nfType;
    private List<PlmnIdNid> requesterSnpnList;
    private PlmnId requesterPlmn;
    private NFType targetNfType;
    private PlmnId targetPlmn;
    private UUID targetNfInstanceId;
    private List<Snssai> requesterSnssaiList;
    private String targetNfServiceSetId;
    private String scope;
    private List<String> targetNsiList;
    private List<Snssai> targetSnssaiList;
    private List<PlmnId> requesterPlmnList;
    private AccessTokenReq.GrantTypeEnum grantType;
    private String requesterFqdn;

    public UUID getNfInstanceId() {
        return nfInstanceId;
    }

    public void setNfInstanceId(UUID nfInstanceId) {
        this.nfInstanceId = nfInstanceId;
    }

    public AccessTokenReq nfInstanceId(UUID nfInstanceId) {
        this.nfInstanceId = nfInstanceId;
        return this;
    }

    public String getTargetNfSetId() {
        return targetNfSetId;
    }

    public void setTargetNfSetId(String targetNfSetId) {
        this.targetNfSetId = targetNfSetId;
    }

    public AccessTokenReq targetNfSetId(String targetNfSetId) {
        this.targetNfSetId = targetNfSetId;
        return this;
    }

    public NFType getNfType() {
        return nfType;
    }

    public void setNfType(NFType nfType) {
        this.nfType = nfType;
    }

    public AccessTokenReq nfType(NFType nfType) {
        this.nfType = nfType;
        return this;
    }

    public List<PlmnIdNid> getRequesterSnpnList() {
        return requesterSnpnList;
    }

    public void setRequesterSnpnList(List<PlmnIdNid> requesterSnpnList) {
        this.requesterSnpnList = requesterSnpnList;
    }

    public AccessTokenReq requesterSnpnList(List<PlmnIdNid> requesterSnpnList) {
        this.requesterSnpnList = requesterSnpnList;
        return this;
    }

    public AccessTokenReq addRequesterSnpnListItem(PlmnIdNid item) {
        if (this.requesterSnpnList == null) {
            this.requesterSnpnList = new ArrayList();
        }
        this.requesterSnpnList.add(item);
        return this;
    }

    public PlmnId getRequesterPlmn() {
        return requesterPlmn;
    }

    public void setRequesterPlmn(PlmnId requesterPlmn) {
        this.requesterPlmn = requesterPlmn;
    }

    public AccessTokenReq requesterPlmn(PlmnId requesterPlmn) {
        this.requesterPlmn = requesterPlmn;
        return this;
    }

    public NFType getTargetNfType() {
        return targetNfType;
    }

    public void setTargetNfType(NFType targetNfType) {
        this.targetNfType = targetNfType;
    }

    public AccessTokenReq targetNfType(NFType targetNfType) {
        this.targetNfType = targetNfType;
        return this;
    }

    public PlmnId getTargetPlmn() {
        return targetPlmn;
    }

    public void setTargetPlmn(PlmnId targetPlmn) {
        this.targetPlmn = targetPlmn;
    }

    public AccessTokenReq targetPlmn(PlmnId targetPlmn) {
        this.targetPlmn = targetPlmn;
        return this;
    }

    public UUID getTargetNfInstanceId() {
        return targetNfInstanceId;
    }

    public void setTargetNfInstanceId(UUID targetNfInstanceId) {
        this.targetNfInstanceId = targetNfInstanceId;
    }

    public AccessTokenReq targetNfInstanceId(UUID targetNfInstanceId) {
        this.targetNfInstanceId = targetNfInstanceId;
        return this;
    }

    public List<Snssai> getRequesterSnssaiList() {
        return requesterSnssaiList;
    }

    public void setRequesterSnssaiList(List<Snssai> requesterSnssaiList) {
        this.requesterSnssaiList = requesterSnssaiList;
    }

    public AccessTokenReq requesterSnssaiList(List<Snssai> requesterSnssaiList) {
        this.requesterSnssaiList = requesterSnssaiList;
        return this;
    }

    public AccessTokenReq addRequesterSnssaiListItem(Snssai item) {
        if (this.requesterSnssaiList == null) {
            this.requesterSnssaiList = new ArrayList();
        }
        this.requesterSnssaiList.add(item);
        return this;
    }

    public String getTargetNfServiceSetId() {
        return targetNfServiceSetId;
    }

    public void setTargetNfServiceSetId(String targetNfServiceSetId) {
        this.targetNfServiceSetId = targetNfServiceSetId;
    }

    public AccessTokenReq targetNfServiceSetId(String targetNfServiceSetId) {
        this.targetNfServiceSetId = targetNfServiceSetId;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public AccessTokenReq scope(String scope) {
        this.scope = scope;
        return this;
    }

    public List<String> getTargetNsiList() {
        return targetNsiList;
    }

    public void setTargetNsiList(List<String> targetNsiList) {
        this.targetNsiList = targetNsiList;
    }

    public AccessTokenReq targetNsiList(List<String> targetNsiList) {
        this.targetNsiList = targetNsiList;
        return this;
    }

    public AccessTokenReq addTargetNsiListItem(String item) {
        if (this.targetNsiList == null) {
            this.targetNsiList = new ArrayList();
        }
        this.targetNsiList.add(item);
        return this;
    }

    public List<Snssai> getTargetSnssaiList() {
        return targetSnssaiList;
    }

    public void setTargetSnssaiList(List<Snssai> targetSnssaiList) {
        this.targetSnssaiList = targetSnssaiList;
    }

    public AccessTokenReq targetSnssaiList(List<Snssai> targetSnssaiList) {
        this.targetSnssaiList = targetSnssaiList;
        return this;
    }

    public AccessTokenReq addTargetSnssaiListItem(Snssai item) {
        if (this.targetSnssaiList == null) {
            this.targetSnssaiList = new ArrayList();
        }
        this.targetSnssaiList.add(item);
        return this;
    }

    public List<PlmnId> getRequesterPlmnList() {
        return requesterPlmnList;
    }

    public void setRequesterPlmnList(List<PlmnId> requesterPlmnList) {
        this.requesterPlmnList = requesterPlmnList;
    }

    public AccessTokenReq requesterPlmnList(List<PlmnId> requesterPlmnList) {
        this.requesterPlmnList = requesterPlmnList;
        return this;
    }

    public AccessTokenReq addRequesterPlmnListItem(PlmnId item) {
        if (this.requesterPlmnList == null) {
            this.requesterPlmnList = new ArrayList();
        }
        this.requesterPlmnList.add(item);
        return this;
    }

    public AccessTokenReq.GrantTypeEnum getGrantType() {
        return grantType;
    }

    public void setGrantType(AccessTokenReq.GrantTypeEnum grantType) {
        this.grantType = grantType;
    }

    public AccessTokenReq grantType(AccessTokenReq.GrantTypeEnum grantType) {
        this.grantType = grantType;
        return this;
    }

    public String getRequesterFqdn() {
        return requesterFqdn;
    }

    public void setRequesterFqdn(String requesterFqdn) {
        this.requesterFqdn = requesterFqdn;
    }

    public AccessTokenReq requesterFqdn(String requesterFqdn) {
        this.requesterFqdn = requesterFqdn;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((((((((((((((((((((((((((("AccessTokenReq {"+"nfInstanceId = ")+ nfInstanceId)+", ")+"targetNfSetId = ")+ targetNfSetId)+", ")+"nfType = ")+ nfType)+", ")+"requesterSnpnList = ")+ requesterSnpnList)+", ")+"requesterPlmn = ")+ requesterPlmn)+", ")+"targetNfType = ")+ targetNfType)+", ")+"targetPlmn = ")+ targetPlmn)+", ")+"targetNfInstanceId = ")+ targetNfInstanceId)+", ")+"requesterSnssaiList = ")+ requesterSnssaiList)+", ")+"targetNfServiceSetId = ")+ targetNfServiceSetId)+", ")+"scope = ")+ scope)+", ")+"targetNsiList = ")+ targetNsiList)+", ")+"targetSnssaiList = ")+ targetSnssaiList)+", ")+"requesterPlmnList = ")+ requesterPlmnList)+", ")+"grantType = ")+ grantType)+", ")+"requesterFqdn = ")+ requesterFqdn)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(nfInstanceId, targetNfSetId, nfType, requesterSnpnList, requesterPlmn, targetNfType, targetPlmn, targetNfInstanceId, requesterSnssaiList, targetNfServiceSetId, scope, targetNsiList, targetSnssaiList, requesterPlmnList, grantType, requesterFqdn);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        AccessTokenReq castThat = ((AccessTokenReq) that);
        return (((((((((((((((Objects.equals(this.nfInstanceId, castThat.nfInstanceId)&&Objects.equals(this.targetNfSetId, castThat.targetNfSetId))&&Objects.equals(this.nfType, castThat.nfType))&&Objects.equals(this.requesterSnpnList, castThat.requesterSnpnList))&&Objects.equals(this.requesterPlmn, castThat.requesterPlmn))&&Objects.equals(this.targetNfType, castThat.targetNfType))&&Objects.equals(this.targetPlmn, castThat.targetPlmn))&&Objects.equals(this.targetNfInstanceId, castThat.targetNfInstanceId))&&Objects.equals(this.requesterSnssaiList, castThat.requesterSnssaiList))&&Objects.equals(this.targetNfServiceSetId, castThat.targetNfServiceSetId))&&Objects.equals(this.scope, castThat.scope))&&Objects.equals(this.targetNsiList, castThat.targetNsiList))&&Objects.equals(this.targetSnssaiList, castThat.targetSnssaiList))&&Objects.equals(this.requesterPlmnList, castThat.requesterPlmnList))&&Objects.equals(this.grantType, castThat.grantType))&&Objects.equals(this.requesterFqdn, castThat.requesterFqdn));
    }

    public static enum GrantTypeEnum {
        CLIENT_CREDENTIALS;
    }
}
