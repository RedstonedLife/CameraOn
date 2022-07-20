package com.bss.inc.cameraon.utils;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;

public class HardwareUtils {
    private final SystemInfo systemInfo;
    public HardwareUtils() {this.systemInfo = new SystemInfo();}
    public HardwareAbstractionLayer getHardware() {return this.systemInfo.getHardware();}

    public static class CPU extends com.redsoftware.ltd.bnc.utils.CPU {
        public CPU(CentralProcessor.ProcessorIdentifier identifier) {
            super(identifier);
        }
    }

    public static class OS extends com.redsoftware.ltd.bnc.utils.OS {
        public OS(OperatingSystem OS, OperatingSystem.OSVersionInfo OS_Info) {
            super(OS, OS_Info);
        }
    }

    public static class FirmwareInfo extends com.redsoftware.ltd.bnc.utils.FirmwareInfo {
        public FirmwareInfo(Firmware firmware) {
            super(firmware);
        }
    }

    public static class ComputerInfo extends com.redsoftware.ltd.bnc.utils.ComputerInfo {
        public ComputerInfo(ComputerSystem cs) {
            super(cs);
        }
    }

    public static class BaseboardInfo extends com.redsoftware.ltd.bnc.utils.BaseboardInfo {
        public BaseboardInfo(Baseboard board) {
            super(board);
        }
    }

    public static class StorageDevice extends com.redsoftware.ltd.bnc.utils.StorageDevice {
        public StorageDevice(OSFileStore fileStore) {
            super(fileStore);
        }
    }
}
