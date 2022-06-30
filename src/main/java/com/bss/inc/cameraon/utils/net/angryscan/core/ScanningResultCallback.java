package com.bss.inc.cameraon.utils.net.angryscan.core;

import com.redsoftware.ltd.bnc.utils.networking.angryscan.ScanningResult;

public interface ScanningResultCallback {

    /**
     * This method is called just before starting to retrieve
     * scanning results for the specified address.
     * @param result empty results holder for a single address
     * @return the method should return an int
     */
    void prepareForResults(ScanningResult result);

    /**
     * This method is called when scanning results are ready.
     * @param results filled results holder for a single address
     */
    void consumeResults(ScanningResult results);

}
