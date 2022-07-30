package com.bss.inc.cameraon.utils.net.angryscan.values;

import com.bss.inc.cameraon.MainClass;

public class NotAvailable extends Empty {
    public static final NotAvailable VALUE = new NotAvailable();

    private NotAvailable() {}

    /**
     * Displays a user-friendly text string :-)
     */
    public String toString() {
        return MainClass.getConfig().forScanner().notAvailableText;
    }

    @Override
    public int compareTo(Object that) {
        // n/a < n/s
        if (that == NotScanned.VALUE)
            return -sortDirection;
        return super.compareTo(that);
    }
}
