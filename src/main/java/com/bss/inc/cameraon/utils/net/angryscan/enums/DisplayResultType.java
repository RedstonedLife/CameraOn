package com.bss.inc.cameraon.utils.net.angryscan.enums;

public enum DisplayResultType {
    ALL,
    ALIVE,
    OPEN_PORTS_ONLY;

    private String string;
    DisplayResultType(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
