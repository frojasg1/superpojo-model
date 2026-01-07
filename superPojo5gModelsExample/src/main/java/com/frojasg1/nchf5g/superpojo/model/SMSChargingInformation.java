
package com.frojasg1.nchf5g.superpojo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class SMSChargingInformation {
    public RoamerInOut roamerInOut;
    public String messageReference;
    public RatType rATType;
    public Date sMDischargeTime;
    public String sMSCAddress;
    public SMPriority sMPriority;
    public String uetimeZone;
    public OriginatorInfo originatorInfo;
    public Integer sMDataCodingScheme;
    public SMMessageType sMMessageType;
    public Date submissionTime;
    public DeliveryReportRequested deliveryReportRequested;
    public String userEquipmentInfo;
    public String sMStatus;
    public SMServiceType sMServiceType;
    public ReplyPathRequested sMReplyPathRequested;
    public MessageClass messageClass;
    public List<RecipientInfo> recipientInfo;
    public Integer messageSize;
    public Integer sMSequenceNumber;
    public Integer sMSresult;
    public UserLocation userLocationinfo;
    public String sMUserDataHeader;
    public Integer numberofMessagesSent;

    public RoamerInOut getRoamerInOut() {
        return roamerInOut;
    }

    public void setRoamerInOut(RoamerInOut roamerInOut) {
        this.roamerInOut = roamerInOut;
    }

    public SMSChargingInformation roamerInOut(RoamerInOut roamerInOut) {
        this.roamerInOut = roamerInOut;
        return this;
    }

    public String getMessageReference() {
        return messageReference;
    }

    public void setMessageReference(String messageReference) {
        this.messageReference = messageReference;
    }

    public SMSChargingInformation messageReference(String messageReference) {
        this.messageReference = messageReference;
        return this;
    }

    public RatType getrATType() {
        return rATType;
    }

    public void setrATType(RatType rATType) {
        this.rATType = rATType;
    }

    public SMSChargingInformation rATType(RatType rATType) {
        this.rATType = rATType;
        return this;
    }

    public Date getsMDischargeTime() {
        return sMDischargeTime;
    }

    public void setsMDischargeTime(Date sMDischargeTime) {
        this.sMDischargeTime = sMDischargeTime;
    }

    public SMSChargingInformation sMDischargeTime(Date sMDischargeTime) {
        this.sMDischargeTime = sMDischargeTime;
        return this;
    }

    public String getsMSCAddress() {
        return sMSCAddress;
    }

    public void setsMSCAddress(String sMSCAddress) {
        this.sMSCAddress = sMSCAddress;
    }

    public SMSChargingInformation sMSCAddress(String sMSCAddress) {
        this.sMSCAddress = sMSCAddress;
        return this;
    }

    public SMPriority getsMPriority() {
        return sMPriority;
    }

    public void setsMPriority(SMPriority sMPriority) {
        this.sMPriority = sMPriority;
    }

    public SMSChargingInformation sMPriority(SMPriority sMPriority) {
        this.sMPriority = sMPriority;
        return this;
    }

    public String getUetimeZone() {
        return uetimeZone;
    }

    public void setUetimeZone(String uetimeZone) {
        this.uetimeZone = uetimeZone;
    }

    public SMSChargingInformation uetimeZone(String uetimeZone) {
        this.uetimeZone = uetimeZone;
        return this;
    }

    public OriginatorInfo getOriginatorInfo() {
        return originatorInfo;
    }

    public void setOriginatorInfo(OriginatorInfo originatorInfo) {
        this.originatorInfo = originatorInfo;
    }

    public SMSChargingInformation originatorInfo(OriginatorInfo originatorInfo) {
        this.originatorInfo = originatorInfo;
        return this;
    }

    public Integer getsMDataCodingScheme() {
        return sMDataCodingScheme;
    }

    public void setsMDataCodingScheme(Integer sMDataCodingScheme) {
        this.sMDataCodingScheme = sMDataCodingScheme;
    }

    public SMSChargingInformation sMDataCodingScheme(Integer sMDataCodingScheme) {
        this.sMDataCodingScheme = sMDataCodingScheme;
        return this;
    }

    public SMMessageType getsMMessageType() {
        return sMMessageType;
    }

    public void setsMMessageType(SMMessageType sMMessageType) {
        this.sMMessageType = sMMessageType;
    }

    public SMSChargingInformation sMMessageType(SMMessageType sMMessageType) {
        this.sMMessageType = sMMessageType;
        return this;
    }

    public Date getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(Date submissionTime) {
        this.submissionTime = submissionTime;
    }

    public SMSChargingInformation submissionTime(Date submissionTime) {
        this.submissionTime = submissionTime;
        return this;
    }

    public DeliveryReportRequested getDeliveryReportRequested() {
        return deliveryReportRequested;
    }

    public void setDeliveryReportRequested(DeliveryReportRequested deliveryReportRequested) {
        this.deliveryReportRequested = deliveryReportRequested;
    }

    public SMSChargingInformation deliveryReportRequested(DeliveryReportRequested deliveryReportRequested) {
        this.deliveryReportRequested = deliveryReportRequested;
        return this;
    }

    public String getUserEquipmentInfo() {
        return userEquipmentInfo;
    }

    public void setUserEquipmentInfo(String userEquipmentInfo) {
        this.userEquipmentInfo = userEquipmentInfo;
    }

    public SMSChargingInformation userEquipmentInfo(String userEquipmentInfo) {
        this.userEquipmentInfo = userEquipmentInfo;
        return this;
    }

    public String getsMStatus() {
        return sMStatus;
    }

    public void setsMStatus(String sMStatus) {
        this.sMStatus = sMStatus;
    }

    public SMSChargingInformation sMStatus(String sMStatus) {
        this.sMStatus = sMStatus;
        return this;
    }

    public SMServiceType getsMServiceType() {
        return sMServiceType;
    }

    public void setsMServiceType(SMServiceType sMServiceType) {
        this.sMServiceType = sMServiceType;
    }

    public SMSChargingInformation sMServiceType(SMServiceType sMServiceType) {
        this.sMServiceType = sMServiceType;
        return this;
    }

    public ReplyPathRequested getsMReplyPathRequested() {
        return sMReplyPathRequested;
    }

    public void setsMReplyPathRequested(ReplyPathRequested sMReplyPathRequested) {
        this.sMReplyPathRequested = sMReplyPathRequested;
    }

    public SMSChargingInformation sMReplyPathRequested(ReplyPathRequested sMReplyPathRequested) {
        this.sMReplyPathRequested = sMReplyPathRequested;
        return this;
    }

    public MessageClass getMessageClass() {
        return messageClass;
    }

    public void setMessageClass(MessageClass messageClass) {
        this.messageClass = messageClass;
    }

    public SMSChargingInformation messageClass(MessageClass messageClass) {
        this.messageClass = messageClass;
        return this;
    }

    public List<RecipientInfo> getRecipientInfo() {
        return recipientInfo;
    }

    public void setRecipientInfo(List<RecipientInfo> recipientInfo) {
        this.recipientInfo = recipientInfo;
    }

    public SMSChargingInformation recipientInfo(List<RecipientInfo> recipientInfo) {
        this.recipientInfo = recipientInfo;
        return this;
    }

    public SMSChargingInformation addRecipientInfoItem(RecipientInfo item) {
        if (this.recipientInfo == null) {
            this.recipientInfo = new ArrayList();
        }
        this.recipientInfo.add(item);
        return this;
    }

    public Integer getMessageSize() {
        return messageSize;
    }

    public void setMessageSize(Integer messageSize) {
        this.messageSize = messageSize;
    }

    public SMSChargingInformation messageSize(Integer messageSize) {
        this.messageSize = messageSize;
        return this;
    }

    public Integer getsMSequenceNumber() {
        return sMSequenceNumber;
    }

    public void setsMSequenceNumber(Integer sMSequenceNumber) {
        this.sMSequenceNumber = sMSequenceNumber;
    }

    public SMSChargingInformation sMSequenceNumber(Integer sMSequenceNumber) {
        this.sMSequenceNumber = sMSequenceNumber;
        return this;
    }

    public Integer getsMSresult() {
        return sMSresult;
    }

    public void setsMSresult(Integer sMSresult) {
        this.sMSresult = sMSresult;
    }

    public SMSChargingInformation sMSresult(Integer sMSresult) {
        this.sMSresult = sMSresult;
        return this;
    }

    public UserLocation getUserLocationinfo() {
        return userLocationinfo;
    }

    public void setUserLocationinfo(UserLocation userLocationinfo) {
        this.userLocationinfo = userLocationinfo;
    }

    public SMSChargingInformation userLocationinfo(UserLocation userLocationinfo) {
        this.userLocationinfo = userLocationinfo;
        return this;
    }

    public String getsMUserDataHeader() {
        return sMUserDataHeader;
    }

    public void setsMUserDataHeader(String sMUserDataHeader) {
        this.sMUserDataHeader = sMUserDataHeader;
    }

    public SMSChargingInformation sMUserDataHeader(String sMUserDataHeader) {
        this.sMUserDataHeader = sMUserDataHeader;
        return this;
    }

    public Integer getNumberofMessagesSent() {
        return numberofMessagesSent;
    }

    public void setNumberofMessagesSent(Integer numberofMessagesSent) {
        this.numberofMessagesSent = numberofMessagesSent;
    }

    public SMSChargingInformation numberofMessagesSent(Integer numberofMessagesSent) {
        this.numberofMessagesSent = numberofMessagesSent;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((("SMSChargingInformation {"+"roamerInOut = ")+ roamerInOut)+", ")+"messageReference = ")+ messageReference)+", ")+"rATType = ")+ rATType)+", ")+"sMDischargeTime = ")+ sMDischargeTime)+", ")+"sMSCAddress = ")+ sMSCAddress)+", ")+"sMPriority = ")+ sMPriority)+", ")+"uetimeZone = ")+ uetimeZone)+", ")+"originatorInfo = ")+ originatorInfo)+", ")+"sMDataCodingScheme = ")+ sMDataCodingScheme)+", ")+"sMMessageType = ")+ sMMessageType)+", ")+"submissionTime = ")+ submissionTime)+", ")+"deliveryReportRequested = ")+ deliveryReportRequested)+", ")+"userEquipmentInfo = ")+ userEquipmentInfo)+", ")+"sMStatus = ")+ sMStatus)+", ")+"sMServiceType = ")+ sMServiceType)+", ")+"sMReplyPathRequested = ")+ sMReplyPathRequested)+", ")+"messageClass = ")+ messageClass)+", ")+"recipientInfo = ")+ recipientInfo)+", ")+"messageSize = ")+ messageSize)+", ")+"sMSequenceNumber = ")+ sMSequenceNumber)+", ")+"sMSresult = ")+ sMSresult)+", ")+"userLocationinfo = ")+ userLocationinfo)+", ")+"sMUserDataHeader = ")+ sMUserDataHeader)+", ")+"numberofMessagesSent = ")+ numberofMessagesSent)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(roamerInOut, messageReference, rATType, sMDischargeTime, sMSCAddress, sMPriority, uetimeZone, originatorInfo, sMDataCodingScheme, sMMessageType, submissionTime, deliveryReportRequested, userEquipmentInfo, sMStatus, sMServiceType, sMReplyPathRequested, messageClass, recipientInfo, messageSize, sMSequenceNumber, sMSresult, userLocationinfo, sMUserDataHeader, numberofMessagesSent);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        SMSChargingInformation castThat = ((SMSChargingInformation) that);
        return (((((((((((((((((((((((Objects.equals(this.roamerInOut, castThat.roamerInOut)&&Objects.equals(this.messageReference, castThat.messageReference))&&Objects.equals(this.rATType, castThat.rATType))&&Objects.equals(this.sMDischargeTime, castThat.sMDischargeTime))&&Objects.equals(this.sMSCAddress, castThat.sMSCAddress))&&Objects.equals(this.sMPriority, castThat.sMPriority))&&Objects.equals(this.uetimeZone, castThat.uetimeZone))&&Objects.equals(this.originatorInfo, castThat.originatorInfo))&&Objects.equals(this.sMDataCodingScheme, castThat.sMDataCodingScheme))&&Objects.equals(this.sMMessageType, castThat.sMMessageType))&&Objects.equals(this.submissionTime, castThat.submissionTime))&&Objects.equals(this.deliveryReportRequested, castThat.deliveryReportRequested))&&Objects.equals(this.userEquipmentInfo, castThat.userEquipmentInfo))&&Objects.equals(this.sMStatus, castThat.sMStatus))&&Objects.equals(this.sMServiceType, castThat.sMServiceType))&&Objects.equals(this.sMReplyPathRequested, castThat.sMReplyPathRequested))&&Objects.equals(this.messageClass, castThat.messageClass))&&Objects.equals(this.recipientInfo, castThat.recipientInfo))&&Objects.equals(this.messageSize, castThat.messageSize))&&Objects.equals(this.sMSequenceNumber, castThat.sMSequenceNumber))&&Objects.equals(this.sMSresult, castThat.sMSresult))&&Objects.equals(this.userLocationinfo, castThat.userLocationinfo))&&Objects.equals(this.sMUserDataHeader, castThat.sMUserDataHeader))&&Objects.equals(this.numberofMessagesSent, castThat.numberofMessagesSent));
    }
}
