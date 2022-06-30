package com.bss.inc.cameraon;

import com.bss.inc.cameraon.exceptions.UnknownOS;
import com.bss.inc.cameraon.logging.LogManager;
import com.bss.inc.cameraon.logging.Logger;
import com.bss.inc.cameraon.settings.Settings;
import org.json.JSONObject;

import java.time.LocalDateTime;

public class Launcher {
    private static LogManager LM;
    public static final LocalDateTime _INIT_TIME = LocalDateTime.now();
    public static final Settings SettingsContainer;

    static {
        try {
            SettingsContainer = new Settings("app.settings","{\"appLanguage\":0,\"cameraSettings\":{}}");
        } catch (UnknownOS e) {
            throw new RuntimeException(e);
        }
        LM = new LogManager();
        LogManager.addLogger("BNC", new Logger("BNC"));
    }
    public static void main(String[] args) throws UnknownOS {
        SettingsContainer.Setup();
        JSONObject j_ = (JSONObject) SettingsContainer.getValue("cameraSettings");
        if(!j_.has("frameRate")) {j_.put("frameRate",30);}
        if(!j_.has("resolution")) {j_.put("resolution",0);}
        if(!j_.has("bitrate")) {j_.put("bitrate",0);}
        if(!)
        MainClass.main(args);
    }
}
