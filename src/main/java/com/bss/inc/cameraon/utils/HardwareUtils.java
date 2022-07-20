package com.bss.inc.cameraon.utils;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;

public class HardwareUtils {
    private final SystemInfo systemInfo;
    public HardwareUtils() {this.systemInfo = new SystemInfo();}
    public HardwareAbstractionLayer getHardware() {return this.systemInfo.getHardware();
    }
}
