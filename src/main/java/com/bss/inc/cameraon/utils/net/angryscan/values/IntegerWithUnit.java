package com.bss.inc.cameraon.utils.net.angryscan.values;

import com.redsoftware.ltd.bnc.i18n.I18n;

public class IntegerWithUnit implements Comparable<IntegerWithUnit> {

    private int value;
    private String unitLabel;

    public IntegerWithUnit(int value, String unitLabel) {
        this.value = value;
        this.unitLabel = unitLabel;
    }

    public int intValue() {
        return value;
    }

    public String toString() {
        return value + I18n.tl("unit." + unitLabel);
    }

    public int hashCode() {
        return value;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (obj instanceof IntegerWithUnit)
            return value == ((IntegerWithUnit) obj).value;
        return false;
    }

    public int compareTo(IntegerWithUnit n) {
        if (this == n)
            return 0;
        if (n == null)
            return 1;
        return value == n.value ? 0 : value > n.value ? 1 : -1;
    }

}
