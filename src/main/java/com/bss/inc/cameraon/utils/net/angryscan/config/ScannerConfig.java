package com.bss.inc.cameraon.utils.net.angryscan.config;

import com.bss.inc.cameraon.Launcher;
import com.bss.inc.cameraon.i18n.I18n;
import com.bss.inc.cameraon.logging.Logger;
import com.bss.inc.cameraon.utils.net.angryscan.enums.DisplayResultType;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.util.prefs.Preferences;

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

    public DisplayResultType displayResultType;

    public boolean askConfirmationBeforeScan;
    public boolean showInfoDialogAfterScan;

    /**
     * Package local constructor.
     * It loads all preferences.
     * @param preferences
     */
    public ScannerConfig(Preferences preferences) {
        this.preferences = preferences;
        boolean useDefault = false;
        Object[] data = new Object[16];

        if(Launcher.SettingsContainer.getValue("scanResultDisplay") == null || Launcher.SettingsContainer.getValue("scanSettings") == null) {
            Logger.getLogger("BNC").info("Could not find 'scanResultDisplay' column or 'scanSettings' column in 'app.settings.json'");
            Logger.getLogger("BNC").info("Reverting to default settings, and creating both columns!");
            Logger.getLogger("BNC").warn("If this issue persists contact support.");
            useDefault = true;
        }
        if (!useDefault) {
            data = LoadFromFile();
        }

        maxThreads = useDefault ? (int) data[0] : preferences.getInt("maxThreads", Platform.CRIPPLED_WINDOWS ? 10 : 255);
        threadDelay = useDefault ? (int) data[1] : preferences.getInt("threadDelay", 20);
        scanDeadHosts = useDefault ? (boolean) data[2] : preferences.getBoolean("scanDeadHosts", true);
        selectedPinger = useDefault ? (String) data[3] : preferences.get("selectedPinger", Platform.WINDOWS ? "pinger.windows" : "pinger.arp");
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
        JSONObject j_ = (JSONObject) Launcher.SettingsContainer.getValue("scanSettings");
        JSONObject rj_ = (JSONObject) Launcher.SettingsContainer.getValue("scanResultDisplay");
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
        JSONObject j_ = (JSONObject) Launcher.SettingsContainer.getValue("scanSettings");
        if(j_.has("threadDelay")) {
            j_.put("threadDelay", preferences.getInt("threadDelay", 20));
        } // Thread Delay         threadDelay           (Default 20 MS)             (int)
        if(j_.has("maxThreads")) {
            j_.put("maxThreads", preferences.getInt("maxThreads", 255));
        } // Max Threads          maxThreads            (Default 255 Threads)       (int)
        if(j_.has("scanDeadHosts")) {
            j_.put("scanDeadHosts", preferences.getBoolean("scanDeadHosts", true));
        } // Scan Dead Hosts      scanDeadHosts         (Default false)             (bool)
        if(j_.has("selectedPinger")) {
            j_.put("selectedPinger", preferences.get("selectedPinger", "pinger.arp"));
        } // Selected Pinger      selectedPinger        (Default "pinger.arp")      (string)
        if(j_.has("pingTimeout")) {
            j_.put("pingTimeout", preferences.getInt("pingTimeout", 20));
        } // Ping Timeout         pingTimeout           (Default 20 MS)             (int)
        if(j_.has("pingCount")) {
            j_.put("pingCount", preferences.getInt("pingCount", 3));
        } // Ping Count           pingCount             (Default 3 Probes/Packets)  (int)
        if(j_.has("skipBroadcastAddress")) {
            j_.put("skipBroadcastAddress", preferences.getBoolean("skipBroadcastAddress", true));
        } // Skip Broadcast IP    skipBroadcastAddress  (Default true)              (bool)
        if(j_.has("portTimeout")) {
            j_.put("portTimeout", preferences.getInt("portTimeout", 2000));
        } // Port Timeout         portTimeout           (Default 2000 MS, 2s)       (int)
        if(j_.has("adaptPortTimeout")) {
            j_.put("adaptPortTimeout", preferences.getBoolean("adaptPortTimeout", true));
        } // Adapt Port Timeout   adaptPortTimeout      (Default true)              (bool)
        if(j_.has("minPortTimeout")) {
            j_.put("minPortTimeout", preferences.getInt("minPortTimeout", 100));
        } // Min Port Timeout     minPortTimeout        (Default 100 MS, 0.1s)      (int)
        if(j_.has("portString")) {
            j_.put("portString", preferences.get("portString", "80,443,8080"));
        } // Port String          portString            (Default "80,443,8080")     (string)
        if(j_.has("useRequestedPorts")) {
            j_.put("useRequestedPorts", preferences.getBoolean("useRequestedPorts", true));
        } // Use Requested Ports  useRequestedPorts     (Default true)              (bool)
        Launcher.SettingsContainer.setValue("scanSettings", j_);
        j_ = (JSONObject) Launcher.SettingsContainer.getValue("scanResultDisplay");
        if(j_.has("displayResult")) {
            j_.put("displayResult", "ALL");
        }
        if(j_.has("valueNotAvailable")) {
            j_.put("valueNotAvailable", "[n/a]");
        }
        if(j_.has("valueNotScanned")) {
            j_.put("valueNotScanned", "[n/s]");
        }
        if(j_.has("askConfirmationBeforeScan")) {
            j_.put("askConfirmationBeforeScan", false);
        }
        if(j_.has("showInfoDialogAfterScan")) {
            j_.put("showInfoDialogAfterScan", false);
        }
        Launcher.SettingsContainer.Save();
    }
}
