package com.bss.inc.cameraon;

import com.bss.inc.cameraon.display.controllers.Settings;
import com.bss.inc.cameraon.exceptions.UnknownOS;
import com.bss.inc.cameraon.logging.LogManager;
import com.bss.inc.cameraon.logging.Logger;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class Launcher {
    private static LogManager LM;
    public static final LocalDateTime _INIT_TIME = LocalDateTime.now();

    static {
        LM = new LogManager();
        LogManager.addLogger("BNC", new Logger("BNC"));
    }
    public static void main(String[] args) throws UnknownOS {
        MainClass.launch(args);
    }
}
