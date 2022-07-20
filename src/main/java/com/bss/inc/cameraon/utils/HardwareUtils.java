package com.bss.inc.cameraon.utils;

import com.bss.inc.cameraon.constants.FilePaths;
import com.bss.inc.cameraon.constants.FrontendPaths;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

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

/*
    Class Linkers linking outside local class to inner-class HardwareUtils
    @TODO Test every class except CPU
 */
class FirmwareInfo {
    String Description, Manufacturer, Name, ReleaseDate, Version;

    public FirmwareInfo(Firmware firmware) {
        setDescription(firmware.getDescription());
        setManufacturer(firmware.getManufacturer());
        setName(firmware.getName());
        setReleaseDate(firmware.getReleaseDate());
        setVersion(firmware.getVersion());
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }
}

class BaseboardInfo {
    String Manufacturer, Model, Serial, Version;

    public BaseboardInfo(Baseboard board) {
        setManufacturer(board.getManufacturer());
        setModel(board.getModel());
        setSerial(board.getSerialNumber());
        setVersion(board.getVersion());
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }
}

class ComputerInfo {
    String UUID, Manufacturer, Model, Serial;

    public ComputerInfo(ComputerSystem cs) {
        setUUID(cs.getHardwareUUID());
        setManufacturer(cs.getManufacturer());
        setModel(cs.getModel());
        setSerial(cs.getSerialNumber());
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }
}

class StorageDevice {
    String Description, Label, LogicalVolume, Mount, Name, Options, Type, UUID, Volume;
    long freeSpace, totalSpace, usableSpace;

    public StorageDevice(OSFileStore fileStore) {
        setDescription(fileStore.getDescription());
        setLabel(fileStore.getLabel());
        setLogicalVolume(fileStore.getLogicalVolume());
        setMount(fileStore.getMount());
        setName(fileStore.getName());
        setOptions(fileStore.getOptions());
        setType(fileStore.getType());
        setUUID(fileStore.getUUID());
        setVolume(fileStore.getVolume());
        setFreeSpace(fileStore.getFreeSpace());
        setTotalSpace(fileStore.getTotalSpace());
        setUsableSpace(fileStore.getUsableSpace());
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public String getLogicalVolume() {
        return LogicalVolume;
    }

    public void setLogicalVolume(String logicalVolume) {
        LogicalVolume = logicalVolume;
    }

    public String getMount() {
        return Mount;
    }

    public void setMount(String mount) {
        Mount = mount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOptions() {
        return Options;
    }

    public void setOptions(String options) {
        Options = options;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String volume) {
        Volume = volume;
    }

    public long getFreeSpace() {return freeSpace;}
    public void setFreeSpace(long freeSpace) {this.freeSpace = freeSpace;}
    public long getTotalSpace() {return totalSpace;}
    public void setTotalSpace(long totalSpace) {this.totalSpace = totalSpace;}
    public long getUsableSpace() {return usableSpace;}
    public void setUsableSpace(long usableSpace) {this.usableSpace = usableSpace;}
}

class OS {
    String OSF, Family, Manufacturer, Version, Codename, Build_Number;
    int bits;

    public OS(OperatingSystem OS, OperatingSystem.OSVersionInfo OS_Info) {
        setOSF(OS.toString());
        setBits(OS.getBitness());
        setFamily(OS.getFamily());
        setManufacturer(OS.getManufacturer());
        setVersion(OS_Info.getVersion());
        setCodename(OS_Info.getCodeName());
        setBuild_Number(OS_Info.getBuildNumber());
    }

    public String getOSF() {return OSF;}
    public void setOSF(String OSF) {this.OSF = OSF;}
    public String getFamily() {return Family;}
    public void setFamily(String family) {Family = family;}
    public String getManufacturer() {return Manufacturer;}
    public void setManufacturer(String manufacturer) {Manufacturer = manufacturer;}
    public int getBits() {return bits;}
    public void setBits(int bits) {bits = bits;}
    public String getVersion() {return Version;}
    public void setVersion(String version) {Version = version;}
    public String getCodename() {return Codename;}
    public void setCodename(String codename) {Codename = codename;}
    public String getBuild_Number() {return Build_Number;}
    public void setBuild_Number(String build_Number) {Build_Number = build_Number;}
}

class CPU {
    String vendor, name, id, identifier, mca;
    long vendorFreq, vendorGFreq;
    public CPU(CentralProcessor.ProcessorIdentifier identifier) {
        setVendor(identifier.getVendor());
        setName(identifier.getName());
        setId(identifier.getProcessorID());
        setIdentifier(identifier.getIdentifier());
        setMca(identifier.getMicroarchitecture());
        setVendorFreq(identifier.getVendorFreq());
        setVendorGFreq(identifier.getVendorFreq() / FilePaths.GIGAHERTZ);
    }

    @Deprecated(since = "27/02/2022", forRemoval = true) public CPU getParsed() {return this;}
    public String getVendor() {return vendor;}
    public void setVendor(String vendor) {this.vendor = vendor;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getIdentifier() {return identifier;}
    public void setIdentifier(String identifier) {this.identifier = identifier;}
    public String getMca() {return mca;}
    public void setMca(String mca) {this.mca = mca;}
    public long getVendorFreq() {return vendorFreq;}
    public void setVendorFreq(long vendorFreq) {this.vendorFreq = vendorFreq;}
    public String getVendorFreqSTR() {return String.valueOf(vendorFreq);}
    public long getVendorGFreq() {return vendorGFreq;}
    public void setVendorGFreq(long vendorGFreq) {this.vendorGFreq = vendorGFreq;}
    public String getVendorGFreqSTR() {return String.valueOf(vendorGFreq);}
}