package com.bss.inc.cameraon;

import com.bss.inc.cameraon.display.controllers.Settings;
import com.bss.inc.cameraon.exceptions.UnknownOS;

public class Launcher {
    public static void main(String[] args) throws UnknownOS {
        //MainClass.launch(args);
        Settings settings = new Settings("test", "{}");
    }
}
