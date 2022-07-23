package com.bss.inc.cameraon.constants;

import com.bss.inc.cameraon.utils.OSValidator;

import java.time.format.DateTimeFormatter;

public class LoggingConstants {
    public static final String LOG_FOLDER = FilePaths.SETTINGS_FOLDER + "logs/";
    public static final String SCAN_FOLDER = FilePaths.SETTINGS_FOLDER + "scans/"
    public static final String LOG_LATEST = "latest.log";
    public static final String LOG_CLASSED_FORMAT = "[%s](%s)-%s: %s";
    public static final String LOG_UNCLASSED_FORMAT = "[%s](%s): %s";
    public static final String LOG_SUPER_FORMAT = "[%s/%s](%s)->(%s): %s";
    public static final String LOG_NAME_FORMAT = "log-%s.log";
    public static final String LOG_NAME_DUPLICATE_FORMAT = "log-%s-%s.log";
    public static final String LOG_NAME_DUPLICATE_FORMAT = "scan-%s-%s.scan";
    public static final DateTimeFormatter LOG_DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yy");
    public static final DateTimeFormatter LOG_TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");
    public static final String SETTINGS_LOCATION = OSValidator.IS_WINDOWS ? FilePaths.HOME_LOCATION + FilePaths.WIN_CONFIG_LOCATION + "settings.json" :
            OSValidator.IS_UNIX ? FilePaths.UNIX_CONFIG_LOCATION + FilePaths.UNIX_CONFIG_LOCATION + "settings.json" : OSValidator.IS_MAC ?
                    FilePaths.HOME_LOCATION + FilePaths.MAC_CONFIG_LOCATION + "settings.json" : "UKNS";
    public static final String CAM_SETTINGS_LOCATION = OSValidator.IS_WINDOWS ? FilePaths.HOME_LOCATION + FilePaths.WIN_CONFIG_LOCATION + "cam_settings.json" :
            OSValidator.IS_UNIX ? FilePaths.HOME_LOCATION + FilePaths.UNIX_CONFIG_LOCATION + "cam_settings.json" : OSValidator.IS_MAC ?
                    FilePaths.HOME_LOCATION + FilePaths.MAC_CONFIG_LOCATION + "cam_settings.json" : "UKNS";
}
