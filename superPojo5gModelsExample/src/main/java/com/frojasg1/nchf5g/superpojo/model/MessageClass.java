
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class MessageClass {
    public String tokenText;
    public ClassIdentifier classIdentifier;

    public String getTokenText() {
        return tokenText;
    }

    public void setTokenText(String tokenText) {
        this.tokenText = tokenText;
    }

    public MessageClass tokenText(String tokenText) {
        this.tokenText = tokenText;
        return this;
    }

    public ClassIdentifier getClassIdentifier() {
        return classIdentifier;
    }

    public void setClassIdentifier(ClassIdentifier classIdentifier) {
        this.classIdentifier = classIdentifier;
    }

    public MessageClass classIdentifier(ClassIdentifier classIdentifier) {
        this.classIdentifier = classIdentifier;
        return this;
    }

    @Override
    public String toString() {
        return (((((("MessageClass {"+"tokenText = ")+ tokenText)+", ")+"classIdentifier = ")+ classIdentifier)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(tokenText, classIdentifier);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        MessageClass castThat = ((MessageClass) that);
        return (Objects.equals(this.tokenText, castThat.tokenText)&&Objects.equals(this.classIdentifier, castThat.classIdentifier));
    }
}
