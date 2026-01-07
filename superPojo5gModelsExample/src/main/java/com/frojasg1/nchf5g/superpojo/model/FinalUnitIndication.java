
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class FinalUnitIndication {
    public String filterId;
    public FinalUnitAction finalUnitAction;
    public String restrictionFilterRule;
    public RedirectServer redirectServer;

    public String getFilterId() {
        return filterId;
    }

    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }

    public FinalUnitIndication filterId(String filterId) {
        this.filterId = filterId;
        return this;
    }

    public FinalUnitAction getFinalUnitAction() {
        return finalUnitAction;
    }

    public void setFinalUnitAction(FinalUnitAction finalUnitAction) {
        this.finalUnitAction = finalUnitAction;
    }

    public FinalUnitIndication finalUnitAction(FinalUnitAction finalUnitAction) {
        this.finalUnitAction = finalUnitAction;
        return this;
    }

    public String getRestrictionFilterRule() {
        return restrictionFilterRule;
    }

    public void setRestrictionFilterRule(String restrictionFilterRule) {
        this.restrictionFilterRule = restrictionFilterRule;
    }

    public FinalUnitIndication restrictionFilterRule(String restrictionFilterRule) {
        this.restrictionFilterRule = restrictionFilterRule;
        return this;
    }

    public RedirectServer getRedirectServer() {
        return redirectServer;
    }

    public void setRedirectServer(RedirectServer redirectServer) {
        this.redirectServer = redirectServer;
    }

    public FinalUnitIndication redirectServer(RedirectServer redirectServer) {
        this.redirectServer = redirectServer;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((("FinalUnitIndication {"+"filterId = ")+ filterId)+", ")+"finalUnitAction = ")+ finalUnitAction)+", ")+"restrictionFilterRule = ")+ restrictionFilterRule)+", ")+"redirectServer = ")+ redirectServer)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterId, finalUnitAction, restrictionFilterRule, redirectServer);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        FinalUnitIndication castThat = ((FinalUnitIndication) that);
        return (((Objects.equals(this.filterId, castThat.filterId)&&Objects.equals(this.finalUnitAction, castThat.finalUnitAction))&&Objects.equals(this.restrictionFilterRule, castThat.restrictionFilterRule))&&Objects.equals(this.redirectServer, castThat.redirectServer));
    }
}
