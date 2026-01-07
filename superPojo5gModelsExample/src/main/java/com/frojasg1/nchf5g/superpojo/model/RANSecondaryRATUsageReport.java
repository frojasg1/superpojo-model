
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RANSecondaryRATUsageReport {
    public List<QosFlowsUsageReport> qosFlowsUsageReports;
    public RatType rANSecondaryRATType;

    public List<QosFlowsUsageReport> getQosFlowsUsageReports() {
        return qosFlowsUsageReports;
    }

    public void setQosFlowsUsageReports(List<QosFlowsUsageReport> qosFlowsUsageReports) {
        this.qosFlowsUsageReports = qosFlowsUsageReports;
    }

    public RANSecondaryRATUsageReport qosFlowsUsageReports(List<QosFlowsUsageReport> qosFlowsUsageReports) {
        this.qosFlowsUsageReports = qosFlowsUsageReports;
        return this;
    }

    public RANSecondaryRATUsageReport addQosFlowsUsageReportsItem(QosFlowsUsageReport item) {
        if (this.qosFlowsUsageReports == null) {
            this.qosFlowsUsageReports = new ArrayList();
        }
        this.qosFlowsUsageReports.add(item);
        return this;
    }

    public RatType getrANSecondaryRATType() {
        return rANSecondaryRATType;
    }

    public void setrANSecondaryRATType(RatType rANSecondaryRATType) {
        this.rANSecondaryRATType = rANSecondaryRATType;
    }

    public RANSecondaryRATUsageReport rANSecondaryRATType(RatType rANSecondaryRATType) {
        this.rANSecondaryRATType = rANSecondaryRATType;
        return this;
    }

    @Override
    public String toString() {
        return (((((("RANSecondaryRATUsageReport {"+"qosFlowsUsageReports = ")+ qosFlowsUsageReports)+", ")+"rANSecondaryRATType = ")+ rANSecondaryRATType)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(qosFlowsUsageReports, rANSecondaryRATType);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        RANSecondaryRATUsageReport castThat = ((RANSecondaryRATUsageReport) that);
        return (Objects.equals(this.qosFlowsUsageReports, castThat.qosFlowsUsageReports)&&Objects.equals(this.rANSecondaryRATType, castThat.rANSecondaryRATType));
    }
}
