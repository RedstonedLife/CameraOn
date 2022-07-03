package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.redsoftware.ltd.bnc.utils.networking.angryscan.ScanningSubject;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.core.Plugin;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.feeders.Feeder;

public interface Fetcher extends Cloneable, Plugin {

    /**
     * @return full name to be displayed in the result table column.
     * It may contain a suffix useful to inform users about the fetcher's preferences.
     */
    String getFullName();

    /**
     * @return localized help text about the fetcher
     */
    String getInfo();

    /**
     * @return the preferences class that may be used for editing of this fetcher's preferences
     * or null if no preferences editing is possible
     */
    Class<? extends FetcherPrefs> getPreferencesClass();

    /**
     * Does the actual fetching.
     * @param subject the scanning subject, containing an IP address
     * @return the fetched data (a String in most cases), null in case of any error.
     * Special values may also be returned, such as {@link NotAvailable} or {@link NotScanned}
     */
    Object scan(ScanningSubject subject);

    /**
     * Called before scanning has started to do any initialization stuff
     */
    default void init(Feeder feeder) {
        init();
    }

    default void init() {}

    /**
     * Called after the scanning has been completed to do any cleanup needed
     */
    void cleanup();
}
