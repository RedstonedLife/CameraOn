package com.bss.inc.cameraon.utils;

import com.bss.inc.cameraon.constants.FilePaths;
import com.bss.inc.cameraon.constants.FrontendPaths;
import com.bss.inc.cameraon.logging.Logger;
import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.FileSystem;
import oshi.software.os.OSFileStore;
import oshi.software.os.OperatingSystem;
import oshi.util.FormatUtil;

import java.util.ArrayList;
import java.util.List;

import static com.bss.inc.cameraon.i18n.I18n.tl;

public class HardwareUtils {
    private final SystemInfo systemInfo;
    public HardwareUtils() {this.systemInfo = new SystemInfo();}
    public HardwareAbstractionLayer getHardware() {return this.systemInfo.getHardware();}
    public ComputerSystem getComputerSystem() {return getHardware().getComputerSystem();}
    public Baseboard getBaseboard() {return getComputerSystem().getBaseboard();} /* Motherboard */
    public Firmware getFirmware() {return getComputerSystem().getFirmware();} /* Computer Firmware/BIOS */
    public GlobalMemory getMemory() {return getHardware().getMemory();}
    public CentralProcessor getProcessor() {return getHardware().getProcessor();}
    public CentralProcessor.ProcessorIdentifier getProcIdentifier() {return getProcessor().getProcessorIdentifier();}
    public OperatingSystem getOperatingSystem() {return systemInfo.getOperatingSystem();}
    public OperatingSystem.OSVersionInfo getOperatingSystemInfo() {return getOperatingSystem().getVersionInfo();}
    public FileSystem getFileSystem() {return getOperatingSystem().getFileSystem();}
    public List<OSFileStore> getFileStores() {return getFileSystem().getFileStores();}
    public CPU getCPU() {return new CPU(getProcIdentifier());}
    public OS getOS() {return new OS(getOperatingSystem(), getOperatingSystemInfo());}
    public FirmwareInfo getFirmwareInfo() {return new FirmwareInfo(getFirmware());}
    public ComputerInfo getComputerInfo() {return new ComputerInfo(getComputerSystem());}
    public BaseboardInfo getBaseboardInfo() {return new BaseboardInfo(getBaseboard());}
    public List<StorageDevice> getStorageDevices() {
        ArrayList<StorageDevice> devices = new ArrayList<StorageDevice>();
        for (OSFileStore file : getFileStores()) {devices.add(new StorageDevice(file));}
        return devices.stream().toList();
    }
    public void LogInfo() {
        CPU cpu = getCPU();
        BaseboardInfo baseboardInfo = getBaseboardInfo();
        List<StorageDevice> storageDevices = getStorageDevices();
        OS os = getOS();
        FirmwareInfo firmwareInfo = getFirmwareInfo();
        Logger.getLogger("BNC").info(tl("hardwareinfo.line1"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.line2"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.line3"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.cpu"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.cpu.vendor", cpu.getVendor()));
        Logger.getLogger("BNC").info(tl("hardwareinfo.cpu.name", cpu.getName()));
        Logger.getLogger("BNC").info(tl("hardwareinfo.cpu.id", cpu.getId()));
        Logger.getLogger("BNC").info(tl("hardwareinfo.cpu.identifier", cpu.getIdentifier()));
        Logger.getLogger("BNC").info(tl("hardwareinfo.cpu.microarchitecture", cpu.getMca()));
        Logger.getLogger("BNC").info(tl("hardwareinfo.cpu.operatingfrequency", cpu.getVendorGFreqSTR()));
        Logger.getLogger("BNC").info(tl("hardwareinfo.baseboard"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.baseboard.manufacturer", baseboardInfo.getManufacturer()));
        Logger.getLogger("BNC").info(tl("hardwareinfo.baseboard.model", baseboardInfo.getModel()));
        Logger.getLogger("BNC").info(tl("hardwareinfo.baseboard.serial", baseboardInfo.getSerial()));
        Logger.getLogger("BNC").info(tl("hardwareinfo.baseboard.version", baseboardInfo.getVersion()));
        Logger.getLogger("BNC").info(tl("hardwareinfo.storage.line1"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.storage.line2"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.storage.line3"));
        for(StorageDevice sdev : storageDevices) {
            Logger.getLogger("BNC").info(tl("hardwareinfo.storage.device", sdev.getMount()));
            Logger.getLogger("BNC").info(tl("hardwareinfo.storage.description", sdev.getDescription()));
            Logger.getLogger("BNC").info(tl("hardwareinfo.storage.label", sdev.getLabel()));
            Logger.getLogger("BNC").info(tl("hardwareinfo.storage.logicalvolume", sdev.getLogicalVolume()));
            Logger.getLogger("BNC").info(tl("hardwareinfo.storage.mount", sdev.getMount()));
            Logger.getLogger("BNC").info(tl("hardwareinfo.storage.name", sdev.getName()));
            Logger.getLogger("BNC").info(tl("hardwareinfo.storage.options", sdev.getOptions()));
            Logger.getLogger("BNC").info(tl("hardwareinfo.storage.type", sdev.getType()));
            Logger.getLogger("BNC").info(tl("hardwareinfo.storage.uuid", sdev.getUUID()));
            Logger.getLogger("BNC").info(tl("hardwareinfo.storage.volume", sdev.getVolume()));
            Logger.getLogger("BNC").info(tl("hardwareinfo.storage.space", FormatUtil.formatBytes(sdev.getFreeSpace()), FormatUtil.formatBytes(sdev.getTotalSpace()), FormatUtil.formatBytes(sdev.getUsableSpace())));
        }
        Logger.getLogger("BNC").info(tl("hardwareinfo.firmware.line1"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.firmware.line2"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.firmware.line3"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.firmware.os"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.firmware.osname", os.getOSF()));
        Logger.getLogger("BNC").info(tl("hardwareinfo.firmware.osfamily", os.getFamily()));
        Logger.getLogger("BNC").info(tl("hardwareinfo.firmware.osmanufacturer", os.getManufacturer()));
        Logger.getLogger("BNC").info(tl("hardwareinfo.firmware.osbitarchitecture", os.getBits()));
        Logger.getLogger("BNC").info(tl("hardwareinfo.firmware"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.line1"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.line1"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.line1"));
        Logger.getLogger("BNC").info(tl("hardwareinfo.line1"));
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

    public String getDescription() {return Description;}
    public void setDescription(String description) {Description = description;}
    public String getManufacturer() {return Manufacturer;}
    public void setManufacturer(String manufacturer) {Manufacturer = manufacturer;}
    public String getName() {return Name;}
    public void setName(String name) {Name = name;}
    public String getReleaseDate() {return ReleaseDate;}
    public void setReleaseDate(String releaseDate) {ReleaseDate = releaseDate;}
    public String getVersion() {return Version;}
    public void setVersion(String version) {Version = version;}
}

class BaseboardInfo {
    String Manufacturer, Model, Serial, Version;

    public BaseboardInfo(Baseboard board) {
        setManufacturer(board.getManufacturer());
        setModel(board.getModel());
        setSerial(board.getSerialNumber());
        setVersion(board.getVersion());
    }

    public String getManufacturer() {return Manufacturer;}
    public void setManufacturer(String manufacturer) {Manufacturer = manufacturer;}
    public String getModel() {return Model;}
    public void setModel(String model) {Model = model;}
    public String getSerial() {return Serial;}
    public void setSerial(String serial) {Serial = serial;}
    public String getVersion() {return Version;}
    public void setVersion(String version) {Version = version;}
}

class ComputerInfo {
    String UUID, Manufacturer, Model, Serial;

    public ComputerInfo(ComputerSystem cs) {
        setUUID(cs.getHardwareUUID());
        setManufacturer(cs.getManufacturer());
        setModel(cs.getModel());
        setSerial(cs.getSerialNumber());
    }

    public String getUUID() {return UUID;}
    public void setUUID(String UUID) {this.UUID = UUID;}
    public String getManufacturer() {return Manufacturer;}
    public void setManufacturer(String manufacturer) {Manufacturer = manufacturer;}
    public String getModel() {return Model;}
    public void setModel(String model) {Model = model;}
    public String getSerial() {return Serial;}
    public void setSerial(String serial) {Serial = serial;}
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

    public String getDescription() {return Description;}
    public void setDescription(String description) {Description = description;}
    public String getLabel() {return Label;}
    public void setLabel(String label) {Label = label;}
    public String getLogicalVolume() {return LogicalVolume;}
    public void setLogicalVolume(String logicalVolume) {LogicalVolume = logicalVolume;}
    public String getMount() {return Mount;}
    public void setMount(String mount) {Mount = mount;}
    public String getName() {return Name;}
    public void setName(String name) {Name = name;}
    public String getOptions() {return Options;}
    public void setOptions(String options) {Options = options;}
    public String getType() {return Type;}
    public void setType(String type) {Type = type;}
    public String getUUID() {return UUID;}
    public void setUUID(String UUID) {this.UUID = UUID;}
    public String getVolume() {return Volume;}
    public void setVolume(String volume) {Volume = volume;}
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