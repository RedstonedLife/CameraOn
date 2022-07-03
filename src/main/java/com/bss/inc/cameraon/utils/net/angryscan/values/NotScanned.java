package com.redsoftware.ltd.bnc.utils.networking.angryscan.values;

import com.redsoftware.ltd.bnc.utils.networking.angryscan.config.Config;

public class NotScanned extends Empty {
    public static final NotScanned VALUE = new NotScanned();

    private NotScanned() {}

    /**
     * Displays a user-friendly text string :-)
     */
    public String toString() {
        return Config.getConfig().forScanner().notScannedText;
    }

    @Override
    public int compareTo(Object that) {
        // n/s > n/a
        if (that == NotAvailable.VALUE)
            return sortDirection;
        return super.compareTo(that);
    }
}
