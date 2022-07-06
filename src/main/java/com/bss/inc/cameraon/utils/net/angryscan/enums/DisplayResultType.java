package com.bss.inc.cameraon.utils.net.angryscan.enums;

public enum DisplayResultType {
    ALL("ALL"),
    ALIVE("ALIVE"),
    OPEN_PORTS_ONLY("OPEN_PORTS_ONLY");

    private String string;

    DisplayResultType(String string) {
        this.string = string;
    }

    public DisplayResultType fromString(String string) {
        return DisplayResultType()
    }

    @Override public String toString() {return super.toString();}
}
