
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class SMInterface {
    private InterfaceType interfaceType;
    private String interfacePort;
    private String interfaceId;
    private String interfaceText;

    public InterfaceType getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(InterfaceType interfaceType) {
        this.interfaceType = interfaceType;
    }

    public SMInterface interfaceType(InterfaceType interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }

    public String getInterfacePort() {
        return interfacePort;
    }

    public void setInterfacePort(String interfacePort) {
        this.interfacePort = interfacePort;
    }

    public SMInterface interfacePort(String interfacePort) {
        this.interfacePort = interfacePort;
        return this;
    }

    public String getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public SMInterface interfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
        return this;
    }

    public String getInterfaceText() {
        return interfaceText;
    }

    public void setInterfaceText(String interfaceText) {
        this.interfaceText = interfaceText;
    }

    public SMInterface interfaceText(String interfaceText) {
        this.interfaceText = interfaceText;
        return this;
    }

    @Override
    public String toString() {
        return (((((((((((("SMInterface {"+"interfaceType = ")+ interfaceType)+", ")+"interfacePort = ")+ interfacePort)+", ")+"interfaceId = ")+ interfaceId)+", ")+"interfaceText = ")+ interfaceText)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(interfaceType, interfacePort, interfaceId, interfaceText);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        SMInterface castThat = ((SMInterface) that);
        return (((Objects.equals(this.interfaceType, castThat.interfaceType)&&Objects.equals(this.interfacePort, castThat.interfacePort))&&Objects.equals(this.interfaceId, castThat.interfaceId))&&Objects.equals(this.interfaceText, castThat.interfaceText));
    }
}
