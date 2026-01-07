
package com.frojasg1.nchf5g.superpojo.model;

import java.util.Objects;

public class NgApCause {
    public Integer value;
    public Integer group;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public NgApCause value(Integer value) {
        this.value = value;
        return this;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public NgApCause group(Integer group) {
        this.group = group;
        return this;
    }

    @Override
    public String toString() {
        return (((((("NgApCause {"+"value = ")+ value)+", ")+"group = ")+ group)+"}");
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, group);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if ((that == null)||(this.getClass()!= that.getClass())) {
            return false;
        }
        NgApCause castThat = ((NgApCause) that);
        return (Objects.equals(this.value, castThat.value)&&Objects.equals(this.group, castThat.group));
    }
}
