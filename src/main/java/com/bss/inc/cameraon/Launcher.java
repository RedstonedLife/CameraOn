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
        settings.setValue("TestValue", 2500);
        settings.setValue("Float", 2.5f);
        settings.setValue("Double", 2.55d);
        settings.setValue("Bool", true);
        settings.setValue("LongString","This is a long string");
        try {
            settings.Save();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
