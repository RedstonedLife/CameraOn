package com.bss.inc.cameraon.utils.net.angryscan.config;

import com.bss.inc.cameraon.logging.Logger;
import com.bss.inc.cameraon.settings.Settings;
import com.bss.inc.cameraon.utils.net.angryscan.enums.DisplayResultType;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.util.prefs.Preferences;

import static com.bss.inc.cameraon.i18n.I18n.tl;

public class ScannerConfig {
    private Preferences preferences;

    public int maxThreads = 255; // DEFAULT VALUE 255
    public int threadDelay = 20; // DELAY (MS) DEFAULT VALUE 20
    public boolean scanDeadHosts = true; // DEFAULT FALSE
    public String selectedPinger = "pinger.arp"; // DEFAULT VALUE pinger.arp for ARP (LAN only) Pinging Method
    public int pingTimeout = 20; // DEFAULT (MS) 20
    public int pingCount = 3; // DEFAULT 3 PING PROBES (PACKETS TO SEND)
    public boolean skipBroadcastAddresses = true; // DEFAULT TRUE
    public int portTimeout = 2000; // DEFAULT (MS) 2000 (2 Seconds)
    public boolean adaptPortTimeout = true; // DEFAULT TRUE (Adapt timeout to ping roundtrip time (if available)
    public int minPortTimeout = 100; // DEFAULT (MS) 100 (0.1 Second)
    public String portString = "80,443,8080"; // DEFAULT ports to be scanned
    public boolean useRequestedPorts = true; // DEFAULT true
    public String notAvailableText;
    public String notScannedText;
    public String username,password;
    public Settings SettingsContainer;
    public DisplayResultType displayResultType;

    public boolean askConfirmationBeforeScan;
    public boolean showInfoDialogAfterScan;

    /**
     * Package local constructor.
     * It loads all preferences.
     * @param preferences
     */
    public ScannerConfig(Preferences preferences, Settings SettingsContainer) {
        Logger.getLogger("BNC").info("Initializing ScannerConfig");
        this.SettingsContainer = SettingsContainer;
        this.preferences = preferences;
        boolean useDefault = false;
        Object[] data = new Object[16];

        if(SettingsContainer.getValue("scanResultDisplay") == null || SettingsContainer.getValue("scanSettings") == null) {
            Logger.getLogger("BNC").info("Could not find 'scanResultDisplay' column or 'scanSettings' column in 'app.settings.json'");
            Logger.getLogger("BNC").info("Reverting to default settings, and creating both columns!");
            Logger.getLogger("BNC").warn("If this issue persists contact support.");
            useDefault = true;
        }
        if (!useDefault) {
            Logger.getLogger("BNC").info("Columns 'scanResultDisplay' and 'scanSettings' found in app.settings.json");
            Logger.getLogger("BNC").info("resorting to app.settings.json values in the ScannerConfig preferences");
            data = LoadFromFile();
        }

        maxThreads = useDefault ? (int) data[0] : preferences.getInt("maxThreads", Platform.CRIPPLED_WINDOWS ? 10 : 255);
        threadDelay = useDefault ? (int) data[1] : preferences.getInt("threadDelay", 20);
        scanDeadHosts = useDefault ? (boolean) data[2] : preferences.getBoolean("scanDeadHosts", true);
        selectedPinger = useDefault ? (String) data[3] : preferences.get("selectedPinger", "pinger.java");
        pingTimeout = useDefault ? (int) data[4] : preferences.getInt("pingTimeout", 2000);
        pingCount = useDefault ? (int) data[5] : preferences.getInt("pingCount", 3);
        skipBroadcastAddresses = useDefault ? (boolean) data[6] : preferences.getBoolean("skipBroadcastAddress", true);
        portTimeout = useDefault ? (int) data[7] : preferences.getInt("portTimeout", 2000);
        adaptPortTimeout = useDefault ? (boolean) data[8] : preferences.getBoolean("adaptPortTimeout", Platform.CRIPPLED_WINDOWS);
        minPortTimeout = useDefault ? (int) data[9] : preferences.getInt("minPortTimeout", 100);
        portString = useDefault ? (String) data[10] : preferences.get("portString", "80,443,8080");
        useRequestedPorts = useDefault ? (boolean) data[11] : preferences.getBoolean("useRequestedPorts", true);
        notAvailableText = useDefault ? (String) data[12] : preferences.get("notAvailableText", "[n/a]");
        notScannedText = useDefault ? (String) data[13] : preferences.get("notScannedText", "[n/s]");
        displayResultType = useDefault ? (DisplayResultType) data[14] : DisplayResultType.fromString(preferences.get("displayResult", "ALL"));
        askConfirmationBeforeScan = useDefault ? (boolean) data[15] : preferences.getBoolean("askConfirmationBeforeScan", false);
        showInfoDialogAfterScan = useDefault ? (boolean) data[16] : preferences.getBoolean("showInfoDialogAfterScan", false);
    }

    /**
     * Stores all the internal properties to the storage media
     */
    public void store() {
        preferences.putInt("maxThreads", maxThreads);
        preferences.putInt("threadDelay", threadDelay);
        preferences.putBoolean("scanDeadHosts", scanDeadHosts);
        preferences.put("selectedPinger", selectedPinger);
        preferences.putInt("pingTimeout", pingTimeout);
        preferences.putInt("pingCount", pingCount);
        preferences.putBoolean("skipBroadcastAddress", skipBroadcastAddresses);
        preferences.putInt("portTimeout", portTimeout);
        preferences.putBoolean("adaptPortTimeout", adaptPortTimeout);
        preferences.putInt("minPortTimeout", minPortTimeout);
        preferences.put("portString", portString);
        preferences.putBoolean("useRequestedPorts", useRequestedPorts);
        preferences.put("notAvailableText", notAvailableText);
        preferences.put("notScannedText", notScannedText);
        preferences.put("displayResult", displayResultType.toString());
        preferences.putBoolean("askConfirmationBeforeScan", askConfirmationBeforeScan);
        preferences.putBoolean("showInfoDialogAfterScan", showInfoDialogAfterScan);

    }

    public Object[] LoadFromFile() {
        Logger.getLogger("BNC").info("Loading settings from app.settings.json");
        JSONObject j_ = (JSONObject) SettingsContainer.getValue("scanSettings");
        JSONObject rj_ = (JSONObject) SettingsContainer.getValue("scanResultDisplay");
        return new Object[] {
                j_.getInt("maxThreads"),
                j_.getInt("threadDelay"),
                j_.getBoolean("scanDeadHosts"),
                j_.getString("selectedPinger"),
                j_.getInt("pingTimeout"),
                j_.getInt("pingCount"),
                j_.getBoolean("skipBroadcastAddress"),
                j_.getInt("portTimeout"),
                j_.getBoolean("adaptPortTimeout"),
                j_.getInt("minPortTimeout"),
                j_.getString("portString"),
                j_.getBoolean("useRequestedPorts"),
                rj_.getString("valueNotAvailable"),
                rj_.getString("valueNotScanned"),
                DisplayResultType.fromString(rj_.getString("displayResult")),
                rj_.getBoolean("askConfirmationBeforeScan"),
                rj_.getBoolean("showInfoDialogAfterScan")
        };
    }

    public void onExit() throws FileNotFoundException {
        JSONObject j_ = (JSONObject) SettingsContainer.getValue("scanSettings");
        if(j_.has("threadDelay")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","threadDelay","scanSettings"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","threadDelay"));
            j_.put("threadDelay", preferences.getInt("threadDelay", 20));
        } // Thread Delay         threadDelay           (Default 20 MS)             (int)
        if(j_.has("maxThreads")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","maxThreads","scanSettings"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","maxThreads"));
            j_.put("maxThreads", preferences.getInt("maxThreads", 255));
        } // Max Threads          maxThreads            (Default 255 Threads)       (int)
        if(j_.has("scanDeadHosts")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","scanDeadHosts","scanSettings"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","scanDeadHosts"));
            j_.put("scanDeadHosts", preferences.getBoolean("scanDeadHosts", true));
        } // Scan Dead Hosts      scanDeadHosts         (Default false)             (bool)
        if(j_.has("selectedPinger")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","selectedPinger","scanSettings"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","selectedPinger"));
            j_.put("selectedPinger", preferences.get("selectedPinger", "pinger.arp"));
        } // Selected Pinger      selectedPinger        (Default "pinger.arp")      (string)
        if(j_.has("pingTimeout")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","pingTimeout","scanSettings"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","pingTimeout"));
            j_.put("pingTimeout", preferences.getInt("pingTimeout", 20));
        } // Ping Timeout         pingTimeout           (Default 20 MS)             (int)
        if(j_.has("pingCount")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","pingCount","scanSettings"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","pingCount"));
            j_.put("pingCount", preferences.getInt("pingCount", 3));
        } // Ping Count           pingCount             (Default 3 Probes/Packets)  (int)
        if(j_.has("skipBroadcastAddress")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","skipBroadcastAddress","scanSettings"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","skipBroadcastAddress"));
            j_.put("skipBroadcastAddress", preferences.getBoolean("skipBroadcastAddress", true));
        } // Skip Broadcast IP    skipBroadcastAddress  (Default true)              (bool)
        if(j_.has("portTimeout")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","portTimeout","scanSettings"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","portTimeout"));
            j_.put("portTimeout", preferences.getInt("portTimeout", 2000));
        } // Port Timeout         portTimeout           (Default 2000 MS, 2s)       (int)
        if(j_.has("adaptPortTimeout")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","adaptPortTimeout","scanSettings"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","adaptPortTimeout"));
            j_.put("adaptPortTimeout", preferences.getBoolean("adaptPortTimeout", true));
        } // Adapt Port Timeout   adaptPortTimeout      (Default true)              (bool)
        if(j_.has("minPortTimeout")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","minPortTimeout","scanSettings"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","minPortTimeout"));
            j_.put("minPortTimeout", preferences.getInt("minPortTimeout", 100));
        } // Min Port Timeout     minPortTimeout        (Default 100 MS, 0.1s)      (int)
        if(j_.has("portString")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","portString","scanSettings"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","portString"));
            j_.put("portString", preferences.get("portString", "80,443,8080"));
        } // Port String          portString            (Default "80,443,8080")     (string)
        if(j_.has("useRequestedPorts")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","useRequestedPorts","scanSettings"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","useRequestedPorts"));
            j_.put("useRequestedPorts", preferences.getBoolean("useRequestedPorts", true));
        } // Use Requested Ports  useRequestedPorts     (Default true)              (bool)
        SettingsContainer.setValue("scanSettings", j_);
        j_ = (JSONObject) SettingsContainer.getValue("scanResultDisplay");
        if(j_.has("displayResult")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","displayResult","scanResultDisplay"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","displayResult"));
            j_.put("displayResult", preferences.get("displayResult", "ALL"));
        }
        if(j_.has("valueNotAvailable")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","valueNotAvailable","scanResultDisplay"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","valueNotAvailable"));
            j_.put("valueNotAvailable", preferences.get("notAvailableText", "[n/a]"));
        }
        if(j_.has("valueNotScanned")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","valueNotScanned","scanResultDisplay"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","valueNotScanned"));
            j_.put("valueNotScanned", preferences.get("notScannedText", "[n/s]"));
        }
        if(j_.has("askConfirmationBeforeScan")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","askConfirmationBeforeScan","scanResultDisplay"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","askConfirmationBeforeScan"));
            j_.put("askConfirmationBeforeScan", preferences.getBoolean("askConfirmationBeforeScan", false));
        }
        if(j_.has("showInfoDialogAfterScan")) {
            Logger.getLogger("BNC").info(tl("scannerconfig.found1","showInfoDialogAfterScan","scanResultDisplay"));
            Logger.getLogger("BNC").info(tl("scannerconfig.found2","showInfoDialogAfterScan"));
            j_.put("showInfoDialogAfterScan",   preferences.getBoolean("showInfoDialogAfterScan", false));
        }
        SettingsContainer.Save();
    }
}
