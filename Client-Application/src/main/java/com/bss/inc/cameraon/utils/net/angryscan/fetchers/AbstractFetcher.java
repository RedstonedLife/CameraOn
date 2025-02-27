package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.bss.inc.cameraon.MainClass;
import com.bss.inc.cameraon.i18n.I18n;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;

import java.util.MissingResourceException;
import java.util.prefs.Preferences;

public abstract class AbstractFetcher implements Fetcher {

    public String getName() {
        return I18n.tl(getId());
    }

    public String getFullName() {
        return getName();
    }

    public String getInfo() {
        try {
            return I18n.tl(getId() + ".info");
        }
        catch (MissingResourceException e) {
            return null;
        }
    }

    public Preferences getPreferences() {
        return MainClass.getConfig().getPreferences().node(getId().replace("fetcher.", ""));
    }

    public Class<? extends FetcherPrefs> getPreferencesClass() {
        // no preferences by default
        return null;
    }

    public void init() {
        // nothing's here by default
    }

    public abstract Object scan(ScanningSubject subject);

    public void cleanup() {
        // nothing's here by default
    }
}
