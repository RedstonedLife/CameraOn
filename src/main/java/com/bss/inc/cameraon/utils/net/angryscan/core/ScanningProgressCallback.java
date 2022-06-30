package com.bss.inc.cameraon.utils.net.angryscan.core;

import java.net.InetAddress;

public interface ScanningProgressCallback {

    /**
     * This method is called on scanning progress updates.
     * There are no guarantees that this method is called on every
     * scanning iteration.
     *
     * @param currentAddress currently scanned IP address, can be null
     * @param runningThreads number of currently running threads
     * @param percentageComplete value from 0 to 100, showing how much work
     * 		is already done.
     */
    void updateProgress(InetAddress currentAddress, int runningThreads, int percentageComplete);
}
