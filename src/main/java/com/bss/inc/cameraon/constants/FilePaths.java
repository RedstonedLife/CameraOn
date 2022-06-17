package com.bss.inc.cameraon.constants;

public class FilePaths {
    public static final String UNIX_CONFIG_LOCATION = "/.config/BNC/";
    public static final String WIN_CONFIG_LOCATION = "/AppData/Local/BNC/";
    public static final String MAC_CONFIG_LOCATION = "/Library/ApplicationSupport/BNC/";
    public static final String HOME_LOCATION = System.getProperty("user.home");
    public static final String SETTINGS_FOLDER = OSValidator.IS_WINDOWS ? HOME_LOCATION + WIN_CONFIG_LOCATION :
            OSValidator.IS_UNIX ? HOME_LOCATION + UNIX_CONFIG_LOCATION : OSValidator.IS_MAC ?
                    HOME_LOCATION + MAC_CONFIG_LOCATION : "UKNS";
    public static final long GIGAHERTZ = (long) 0x3B9ACA00;
}
