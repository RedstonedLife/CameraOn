package com.bss.inc.cameraon.utils.net.angryscan.config;

import com.bss.inc.cameraon.Launcher;
import com.bss.inc.cameraon.i18n.I18n;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.util.prefs.Preferences;

public class ScannerConfig {
    private Preferences preferences;

    public int maxThreads = 255; // DEFAULT VALUE 255
    public int threadDelay = 20; // DELAY (MS) DEFAULT VALUE 20
    public boolean scanDeadHosts = false; // DEFAULT FALSE
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

    /**
     * Package local constructor.
     * It loads all preferences.
     * @param preferences
     */
    public ScannerConfig(Preferences preferences) {
        this.preferences = preferences;

        maxThreads = preferences.getInt("maxThreads", Platform.CRIPPLED_WINDOWS ? 10 : 255);
        threadDelay = preferences.getInt("threadDelay", 20);
        scanDeadHosts = preferences.getBoolean("scanDeadHosts", false);
        selectedPinger = preferences.get("selectedPinger", Platform.WINDOWS ? "pinger.windows" : "pinger.arp");
        pingTimeout = preferences.getInt("pingTimeout", 2000);
        pingCount = preferences.getInt("pingCount", 3);
        skipBroadcastAddresses = preferences.getBoolean("skipBroadcastAddresses", true);
        portTimeout = preferences.getInt("portTimeout", 2000);
        adaptPortTimeout = preferences.getBoolean("adaptPortTimeout", !Platform.CRIPPLED_WINDOWS);
        minPortTimeout = preferences.getInt("minPortTimeout", 100);
        portString = preferences.get("portString", "80,443,8080");
        useRequestedPorts = preferences.getBoolean("useRequestedPorts", true);
        notAvailableText = preferences.get("notAvailableText", I18n.tl("fetcher.value.notAvailable"));
        notScannedText = preferences.get("notScannedText", I18n.tl("fetcher.value.notScanned"));
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
        preferences.putBoolean("skipBroadcastAddresses", skipBroadcastAddresses);
        preferences.putInt("portTimeout", portTimeout);
        preferences.putBoolean("adaptPortTimeout", adaptPortTimeout);
        preferences.putInt("minPortTimeout", minPortTimeout);
        preferences.put("portString", portString);
        preferences.putBoolean("useRequestedPorts", useRequestedPorts);
        preferences.put("notAvailableText", notAvailableText);
        preferences.put("notScannedText", notScannedText);
    }

    public void onExit() throws FileNotFoundException {
        JSONObject j_ = (JSONObject) Launcher.SettingsContainer.getValue("scanSettings");
        if(!j_.has("threadDelay")) {
            j_.put("threadDelay", preferences.getInt("threadDelay", 20));
        } // Thread Delay         threadDelay           (Default 20 MS)             (int)
        if(!j_.has("maxThreads")) {
            j_.put("maxThreads", preferences.getInt("maxThreads", 255));
        } // Max Threads          maxThreads            (Default 255 Threads)       (int)
        if(!j_.has("scanDeadHosts")) {
            j_.put("scanDeadHosts", preferences.getBoolean("scanDeadHosts", false));
        } // Scan Dead Hosts      scanDeadHosts         (Default false)             (bool)
        if(!j_.has("selectedPinger")) {
            j_.put("selectedPinger", preferences.get("selectedPinger", "pinger.arp"));
        } // Selected Pinger      selectedPinger        (Default "pinger.arp")      (string)
        if(!j_.has("pingTimeout")) {
            j_.put("pingTimeout", 20);
        } // Ping Timeout         pingTimeout           (Default 20 MS)             (int)
        if(!j_.has("pingCount")) {
            j_.put("pingCount", 3);
        } // Ping Count           pingCount             (Default 3 Probes/Packets)  (int)
        if(!j_.has("skipBroadcastAddress")) {
            j_.put("skipBroadcastAddress", true);
        } // Skip Broadcast IP    skipBroadcastAddress  (Default true)              (bool)
        if(!j_.has("portTimeout")) {
            j_.put("portTimeout", 2000);
        } // Port Timeout         portTimeout           (Default 2000 MS, 2s)       (int)
        if(!j_.has("adaptPortTimeout")) {
            j_.put("adaptPortTimeout", true);
        } // Adapt Port Timeout   adaptPortTimeout      (Default true)              (bool)
        if(!j_.has("minPortTimeout")) {
            j_.put("minPortTimeout", 100);
        } // Min Port Timeout     minPortTimeout        (Default 100 MS, 0.1s)      (int)
        if(!j_.has("portString")) {
            j_.put("portString", "80,443,8080");
        } // Port String          portString            (Default "80,443,8080")     (string)
        if(!j_.has("useRequestedPorts")) {
            j_.put("useRequestedPorts", true);
        } // Use Requested Ports  useRequestedPorts     (Default true)              (bool)
        Launcher.SettingsContainer.setValue("scanSettings", j_);
        Launcher.SettingsContainer.Save();
    }
}
