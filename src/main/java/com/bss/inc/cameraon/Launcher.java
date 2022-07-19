package com.bss.inc.cameraon;

import com.bss.inc.cameraon.exceptions.UnknownOS;
import com.bss.inc.cameraon.i18n.I18n;
import com.bss.inc.cameraon.logging.LogManager;
import com.bss.inc.cameraon.logging.Logger;
import com.bss.inc.cameraon.settings.Settings;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Set;

import static com.bss.inc.cameraon.i18n.I18n.tl;

public class Launcher {
    private static LogManager LM;
    private static I18n _i18n = new I18n(Launcher.class);
    public static final LocalDateTime _INIT_TIME = LocalDateTime.now();
    public static final Settings SettingsContainer;

    static {
        try {
            SettingsContainer = new Settings("app.settings","{\"appLanguage\":0,\"cameraSettings\":{},\"scanSettings\":{},\"scanResultDisplay\":{}}");
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
        if(!j_.has("frameRate")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","frameRate","cameraSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","frameRate","30 frames per second"));
            j_.put("frameRate",30);}
        if(!j_.has("resolution")) {
			Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","resolution","cameraSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","resolution","1920x1080 (1080p)"));
            j_.put("resolution",0);}
        if(!j_.has("bitrate")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","bitrate","cameraSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","bitrate","2048 Kb/s (2 Mb/s)"));
            j_.put("bitrate",0);}
        if(!j_.has("videnc")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","videnc","cameraSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","videnc","H.264 Video Encoding Algorithm"));
            j_.put("videnc",0);}
        SettingsContainer.setValue("cameraSettings",j_);
        j_ = (JSONObject) SettingsContainer.getValue("scanSettings");
        if(!j_.has("threadDelay")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","threadDelay","scanSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","threadDelay","20 MS"));
            j_.put("threadDelay", 20);
        } // Thread Delay         threadDelay           (Default 20 MS)             (int)
        if(!j_.has("maxThreads")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","maxThreads","scanSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","maxTheads","255 Threads"));
            j_.put("maxThreads", 255);
        } // Max Threads          maxThreads            (Default 255 Threads)       (int)
        if(!j_.has("scanDeadHosts")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","scanDeadHosts","scanSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","scanDEadHosts","true"));
            j_.put("scanDeadHosts", true);
        } // Scan Dead Hosts      scanDeadHosts         (Default true)             (bool)
        if(!j_.has("selectedPinger")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","selectPinger","scanSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","selectPinger","pinger.arp"));
            j_.put("selectedPinger", "pinger.arp");
        } // Selected Pinger      selectedPinger        (Default "pinger.arp")      (string)
        if(!j_.has("pingTimeout")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","pingTimeout","scanSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","pingTimeout","20 MS"));
            j_.put("pingTimeout", 20);
        } // Ping Timeout         pingTimeout           (Default 20 MS)             (int)
        if(!j_.has("pingCount")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","pingCount","scanSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","pingCount","3 Packets"));
            j_.put("pingCount", 3);
        } // Ping Count           pingCount             (Default 3 Probes/Packets)  (int)
        if(!j_.has("skipBroadcastAddress")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","skipBroadcastAddress","scanSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","skipBroadcastAddress","true"));
            j_.put("skipBroadcastAddress", true);
        } // Skip Broadcast IP    skipBroadcastAddress  (Default true)              (bool)
        if(!j_.has("portTimeout")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","portTimeout","scanSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","portTimeout","2000 MS (2 Seconds)"));
            j_.put("portTimeout", 2000);
        } // Port Timeout         portTimeout           (Default 2000 MS, 2s)       (int)
        if(!j_.has("adaptPortTimeout")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","adaptPortTimeout","scanSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","adaptPortTimeout","true"));
            j_.put("adaptPortTimeout", true);
        } // Adapt Port Timeout   adaptPortTimeout      (Default true)              (bool)
        if(!j_.has("minPortTimeout")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","minPortTimeout","scanSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","minPortTimeout","100 MS (0.1 Seconds)"));
            j_.put("minPortTimeout", 100);
        } // Min Port Timeout     minPortTimeout        (Default 100 MS, 0.1s)      (int)
        if(!j_.has("portString")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","portString","scanSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","portString","80,443,8080"));
            j_.put("portString", "80,443,8080");
        } // Port String          portString            (Default "80,443,8080")     (string)
        if(!j_.has("useRequestedPorts")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","useRequestedPorts","scanSettings"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","useRequestedPorts","true"));
            j_.put("useRequestedPorts", true);
        } // Use Requested Ports  useRequestedPorts     (Default true)              (bool)
        SettingsContainer.setValue("scanSettings", j_);
        if(SettingsContainer.getValue("scanResultDisplay")==null) {SettingsContainer.setValue("scanResultDisplay",new JSONObject("{}"));}
        j_ = (JSONObject) SettingsContainer.getValue("scanResultDisplay");
        if(!j_.has("displayResult")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","displayResult","scanResultDisplay"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","displayResult","all"));
            j_.put("displayResult", "ALL");
        }
        if(!j_.has("valueNotAvailable")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","valueNotAvailable","scanResultDisplay"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","valueNotAvailable","[n/a]"));
            j_.put("valueNotAvailable", "[n/a]");
            if(j_.getString("valueNotAvailable").equals("")) {j_.put("valueNotAvailable", "[n/a]");}
        }
        if(!j_.has("valueNotScanned")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","valueNotScanned","scanResultDisplay"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","valueNotScanned","[n/s]"));
            j_.put("valueNotScanned", "[n/s]");
            if(j_.getString("valueNotScanned").equals("")) {j_.put("valueNotScanned", "[n/s]");}
        }
        if(!j_.has("askConfirmationBeforeScan")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","askConfirmationBeforeScan","scanResultDisplay"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","askConfirmationBeforeScan","false"));
            j_.put("askConfirmationBeforeScan", false);
        }
        if(!j_.has("showInfoDialogAfterScan")) {
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind1","showInfoDialogAfterScan","scanResultDisplay"));
            Logger.getLogger("BNC").info(tl("launcher.couldnotfind2","showInfoDialogAfterScan","false"));
            j_.put("showInfoDialogAfterScan", false);
        }
        SettingsContainer.setValue("scanResultDisplay", j_);
        SettingsContainer.Save();
    }

    public static void main(String[] args) throws UnknownOS, FileNotFoundException {
        _i18n.OnStart();
        _i18n.updateLocale("en");
        setSettings();
        MainClass.main(args);
    }
}
