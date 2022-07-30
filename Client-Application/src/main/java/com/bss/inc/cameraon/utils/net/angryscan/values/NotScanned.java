package com.bss.inc.cameraon.utils.net.angryscan.values;

import com.bss.inc.cameraon.MainClass;

public class NotScanned extends Empty {
    public static final NotScanned VALUE = new NotScanned();

    private NotScanned() {}

    /**
     * Displays a user-friendly text string :-)
     */
    public String toString() {
        return MainClass.getConfig().forScanner().notScannedText;
    }

    @Override
    public int compareTo(Object that) {
        // n/s > n/a
        if (that == NotAvailable.VALUE)
            return sortDirection;
        return super.compareTo(that);
    }
}
