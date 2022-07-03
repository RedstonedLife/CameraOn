package com.bss.inc.cameraon.utils.net.angryscan.state;

import com.redsoftware.ltd.bnc.utils.networking.angryscan.ScanningSubject;

import java.io.IOException;

/**
 * Pingers check if hosts are alive
 *
 * @author Anton Keks
 */
public interface Pinger extends AutoCloseable {
    /**
     * Issues the specified number of pings and
     * waits for replies.
     *
     * @param count number of pings to perform
     */
    PingResult ping(ScanningSubject subject, int count) throws IOException;

    @Override default void close() throws IOException {}
}
