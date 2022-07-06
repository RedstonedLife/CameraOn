package com.bss.inc.cameraon.logging;

import java.util.HashMap;

public class LogManager {

    private static Logger fallbackLogger = new Logger("fallback-Logger");
    private static HashMap<String, Logger> loggers = new HashMap<>();
    private static final LogFileManager _LFM = new LogFileManager();

    public LogManager() {
        fallbackLogger = new Logger("fallback-Logger");
        loggers = new HashMap<>();
    }

    public static LogFileManager getLFM() {return _LFM; }
    public static void addLogger(String name, Logger logger) {loggers.put(name, logger);}
    public static Logger getLogger(final String name) {
        if(loggers.containsKey(name))
            return loggers.get(name);
        else
            
    }


}
