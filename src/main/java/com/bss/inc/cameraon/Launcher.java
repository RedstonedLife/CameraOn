package com.bss.inc.cameraon;

import com.bss.inc.cameraon.exceptions.UnknownOS;
import com.bss.inc.cameraon.logging.LogManager;
import com.bss.inc.cameraon.logging.Logger;
import com.bss.inc.cameraon.settings.Settings;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Set;

public class Launcher {
    private static LogManager LM;
    public static final LocalDateTime _INIT_TIME = LocalDateTime.now();
    public static final Settings SettingsContainer;

    static {
        try {
            SettingsContainer = new Settings("app.settings","{\"appLanguage\":0,\"cameraSettings\":{},\"scanSettings\":{}}");
        } catch (UnknownOS e) {
            throw new RuntimeException(e);
        }
        LM = new LogManager();
        LogManager.addLogger("BNC", new Logger("BNC"));
    }

    public static void setSettings() throws FileNotFoundException {
        SettingsContainer.Setup();
        JSONObject j_ = (JSONObject) SettingsContainer.getValue("cameraSettings");
        if(SettingsContainer.getValue("scanSettings")==null) {SettingsContainer.setValue("scanSettings",new JSONObject("{}"));}
        if(!j_.has("frameRate")) {j_.put("frameRate",30);}
        if(!j_.has("resolution")) {j_.put("resolution",0);}
        if(!j_.has("bitrate")) {j_.put("bitrate",0);}
        if(!j_.has("videnc")) {j_.put("videnc",0);}
        SettingsContainer.setValue("cameraSettings",j_);
        j_ = (JSONObject) SettingsContainer.getValue("scanSettings");
        if(!j_.has("")) {} // Thread Delay       threadDelay           (Default 20 MS)             (int)
        if(!j_.has("")) {} // Max Threads        maxThreads            (Default 255 Threads)       (int)
        if(!j_.has("")) {} // Scan Dead Hosts    scanDeadHosts         (Default false)             (bool)
        if(!j_.has("")) {} // Selected Pinger    selectedPinger        (Default "pinger.arp")      (string)
        if(!j_.has("")) {} // Ping Timeout       pingTimeout           (Default 20 MS)             (int)
        if(!j_.has("")) {} // Ping Count         pingCount             (Default 3 Probes/Packets)  (int)
        if(!j_.has("")) {} // Skip Broadcast IP  skipBroadcastAddress  (Default true)              (bool)
        if(!j_.has("")) {} // Port Timeout       portTimeout           (Default 2000 MS, 2s)       (int)
        if(!j_.has("")) {} // Adapt Port Timeout adaptPortTimeout      (Default true)              (bool)
        if(!j_.has("")) {} // 
        if(!j_.has("")) {} // Thread Delay threadDelay (20 MS Default)
        if(!j_.has("")) {} // Thread Delay threadDelay (20 MS Default)
        if(!j_.has("")) {} // Thread Delay threadDelay (20 MS Default)
        if(!j_.has("")) {} // Thread Delay threadDelay (20 MS Default)
        if(!j_.has("")) {} // Thread Delay threadDelay (20 MS Default)

        SettingsContainer.Save();
    }

    public static void main(String[] args) throws UnknownOS, FileNotFoundException {

        MainClass.main(args);
    }
}
