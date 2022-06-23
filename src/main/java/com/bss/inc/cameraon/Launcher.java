package com.bss.inc.cameraon;

import com.bss.inc.cameraon.display.controllers.Settings;
import com.bss.inc.cameraon.exceptions.UnknownOS;
import com.bss.inc.cameraon.logging.LogManager;
import com.bss.inc.cameraon.logging.Logger;

import java.io.FileNotFoundException;

public class Launcher {
    private static LogManager LM;

    static {
        LM = new LogManager();
    }
    public static void main(String[] args) throws UnknownOS {

        MainClass.launch(args);
    }
}
