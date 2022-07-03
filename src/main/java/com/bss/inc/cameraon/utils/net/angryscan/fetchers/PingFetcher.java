package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.redsoftware.ltd.bnc.utils.logging.Logger;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.ScanningResult.ResultType;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.ScanningSubject;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.config.LoggerFactory;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.config.ScannerConfig;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.feeders.Feeder;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.net.PingResult;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.net.Pinger;
import com.redsoftware.ltd.bnc.utils.logging.Level;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.net.PingerRegistry;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.values.IntegerWithUnit;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import static com.redsoftware.ltd.bnc.utils.networking.angryscan.ScanningSubject.PARAMETER_PING_RESULT;

public class PingFetcher extends AbstractFetcher {
    public static final String ID = "fetcher.ping";

    private static final Logger LOG = LoggerFactory.getLogger();

    private ScannerConfig config;

    /** The shared pinger - this one must be static, because PingTTLFetcher will use it as well */
    private static volatile Pinger pinger;
    private static volatile AtomicInteger pingerUsers = new AtomicInteger();

    /** The registry used for creation of Pinger instances */
    private PingerRegistry pingerRegistry;

    public PingFetcher(PingerRegistry pingerRegistry, ScannerConfig scannerConfig) {
        this.pingerRegistry = pingerRegistry;
        this.config = scannerConfig;
    }

    public String getId() {
        return ID;
    }

    protected PingResult executePing(ScanningSubject subject) {
        if (subject.hasParameter(PARAMETER_PING_RESULT))
            return (PingResult) subject.getParameter(PARAMETER_PING_RESULT);

        PingResult result;
        try {
            result = pinger.ping(subject, config.pingCount);
        }
        catch (IOException e) {
            // if this is not a timeout
            LOG.log(Level.WARN, "Pinging failed", e);
            // return an empty ping result
            result = new PingResult(subject.getAddress(), 0);
        }
        // remember the result for other fetchers to use
        subject.setParameter(PARAMETER_PING_RESULT, result);
        return result;
    }

    @Override
    public Object scan(ScanningSubject subject) {
        PingResult result = executePing(subject);
        subject.setResultType(result.isAlive() ? ResultType.ALIVE : ResultType.DEAD);

        if (!result.isAlive() && !config.scanDeadHosts) {
            // the host is dead, we are not going to continue...
            subject.abortAddressScanning();
        }

        return result.isAlive() ? new IntegerWithUnit(result.getAverageTime(), "ms") : null;
    }

    public void init(Feeder feeder) {
        if (pinger == null) {
            pinger = pingerRegistry.createPinger(feeder.isLocalNetwork());
            pingerUsers.set(1);
        }
        else
            pingerUsers.incrementAndGet();
    }

    public void cleanup() {
        try {
            if (pingerUsers.decrementAndGet() <= 0 && pinger != null) {
                pinger.close();
                pinger = null;
            }
        }
        catch (IOException e) {
            pinger = null;
            throw new FetcherException(e);
        }
    }
}
