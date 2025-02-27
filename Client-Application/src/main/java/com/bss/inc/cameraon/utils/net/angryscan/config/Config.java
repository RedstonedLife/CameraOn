package com.bss.inc.cameraon.utils.net.angryscan.config;

import com.bss.inc.cameraon.settings.Settings;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.UUID;
import java.util.prefs.Preferences;

/**
 * This class encapsulates preferences of the program.
 * It is a singleton class.
 *
 * @author Anton Keks
 */
public final class Config {
    private Preferences preferences;
    public String language;
    public String uuid;
    public boolean allowReports;

    /** easily accessible scanner configuration */
    private ScannerConfig scannerConfig;

    public Config(Settings settings) {
        preferences = Preferences.userRoot().node("com.bss.inc.cameraon");
        scannerConfig = new ScannerConfig(preferences,settings);
        language = preferences.get("language", "en");
        uuid = preferences.get("uuid", null);
        if (uuid == null) {
            uuid = UUID.randomUUID().toString();
            preferences.put("uuid", uuid);
        }
        allowReports = preferences.getBoolean("allowReports", true);
    }

    public void store() {
        preferences.put("language", language);
        preferences.put("uuid", uuid);
        preferences.putBoolean("allowReports", allowReports);
        scannerConfig.store();
    }

    public Preferences getPreferences() {
        return preferences;
    }

    /**
     * @return ScannerConfig instance (quick access)
     */
    public ScannerConfig forScanner() {
        return scannerConfig;
    }

    public Locale getLocale() {
        if (language == null || "en".equals(language)) {
            return System.getProperty("locale") == null ? Locale.getDefault() : createLocale(System.getProperty("locale"));
        }
        else {
            return createLocale(language);
        }
    }

    private Locale createLocale(String locale) {
        return Locale.forLanguageTag(locale.replace('_', '-'));
    }

    public String getUUID() {
        return uuid;
    }

    public void onExit() throws FileNotFoundException {
        forScanner().onExit();
    }
}
