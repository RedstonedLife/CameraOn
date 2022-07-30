package com.bss.inc.cameraon.utils.net.angryscan.config;

import com.bss.inc.cameraon.logging.Logger;

public class LoggerFactory {

    /**
     * @return Logger instance initialized to the name of the calling class.
     */
    public static Logger getLogger() {
        Throwable t = new Throwable();
        StackTraceElement directCaller = t.getStackTrace()[1];
        return Logger.getLogger("BNC");
    }

}
