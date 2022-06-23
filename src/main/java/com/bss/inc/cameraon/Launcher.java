package com.bss.inc.cameraon;

import com.bss.inc.cameraon.display.controllers.Settings;
import com.bss.inc.cameraon.exceptions.UnknownOS;
import com.bss.inc.cameraon.logging.LogManager;
import com.bss.inc.cameraon.logging.Logger;

import java.io.FileNotFoundException;

public class Launcher {
    static LogManager _LM;
    public static void main(String[] args) throws UnknownOS {
        _LM = new LogManager();
        LogManager.addLogger("BNC", new Logger("BNC"));
        Settings settings = new Settings("test", "{}");
        try {
            settings.Load();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Logger.getLogger("BNC").info("Value of TestValue: " + settings.getValue("TestValue"));
    }
}
