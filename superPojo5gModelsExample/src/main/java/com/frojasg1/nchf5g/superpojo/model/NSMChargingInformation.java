
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NSMChargingInformation {
    private List<ServiceProfileChargingInformation> listOfserviceProfileChargingInformation;
    private ManagementOperation managementOperation;
    private ManagementOperationStatus managementOperationStatus;
    private String idNetworkSliceInstance;

    public List<ServiceProfileChargingInformation> getListOfserviceProfileChargingInformation() {
        return listOfserviceProfileChargingInformation;
    }

    public void setListOfserviceProfileChargingInformation(List<ServiceProfileChargingInformation> listOfserviceProfileChargingInformation) {
        this.listOfserviceProfileChargingInformation = listOfserviceProfileChargingInformation;
    }

    public NSMChargingInformation listOfserviceProfileChargingInformation(List<ServiceProfileChargingInformation> listOfserviceProfileChargingInformation) {
        this.listOfserviceProfileChargingInformation = listOfserviceProfileChargingInformation;
        return this;
    }

    public NSMChargingInformation addListOfserviceProfileChargingInformationItem(ServiceProfileChargingInformation item) {
        if (this.listOfserviceProfileChargingInformation == null) {
            this.listOfserviceProfileChargingInformation = new ArrayList();
        }
        this.listOfserviceProfileChargingInformation.add(item);
        return this;
    }

    public ManagementOperation getManagementOperation() {
        return managementOperation;
    }

    public void setManagementOperation(ManagementOperation managementOperation) {
        this.managementOperation = managementOperation;
    }

    public NSMChargingInformation managementOperation(ManagementOperation managementOperation) {
        this.managementOperation = managementOperation;
        return this;
    }

    public ManagementOperationStatus getManagementOperationStatus() {
        return managementOperationStatus;
    }

    public void setManagementOperationStatus(ManagementOperationStatus managementOperationStatus) {
        this.managementOperationStatus = managementOperationStatus;
    }

    public NSMChargingInformation managementOperationStatus(ManagementOperationStatus managementOperationStatus) {
        this.managementOperationStatus = managementOperationStatus;
        return this;
    }

    public String getIdNetworkSliceInstance() {
        return idNetworkSliceInstance;
    }

    public void setIdNetworkSliceInstance(String idNetworkSliceInstance) {
        this.idNetworkSliceInstance = idNetworkSliceInstance;
    }

    public NSMChargingInformation idNetworkSliceInstance(String idNetworkSliceInstance) {
        this.idNetworkSliceInstance = idNetworkSliceInstance;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((("NSMChargingInformation {"+"listOfserviceProfileChargingInformation = ")+ listOfserviceProfileChargingInformation)+", ")+"managementOperation = ")+ managementOperation)+", ")+"managementOperationStatus = ")+ managementOperationStatus)+", ")+"idNetworkSliceInstance = ")+ idNetworkSliceInstance)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfserviceProfileChargingInformation, managementOperation, managementOperationStatus, idNetworkSliceInstance);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        NSMChargingInformation castThat = ((NSMChargingInformation) that);
        return (((Objects.equals(this.listOfserviceProfileChargingInformation, castThat.listOfserviceProfileChargingInformation)&&Objects.equals(this.managementOperation, castThat.managementOperation))&&Objects.equals(this.managementOperationStatus, castThat.managementOperationStatus))&&Objects.equals(this.idNetworkSliceInstance, castThat.idNetworkSliceInstance));
    }
}
