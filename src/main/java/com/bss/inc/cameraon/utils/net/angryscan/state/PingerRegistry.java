package com.bss.inc.cameraon.utils.net.angryscan.state;

import com.redsoftware.ltd.bnc.utils.logging.Level;
import com.redsoftware.ltd.bnc.utils.logging.Logger;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.config.LoggerFactory;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.config.Platform;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.config.ScannerConfig;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.di.InjectException;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.di.Injector;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.fetchers.FetcherException;
import com.redsoftware.ltd.bnc.utils.networking.angryscan.fetchers.MACFetcher;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

public class PingerRegistry {
    private static final Logger LOG = LoggerFactory.getLogger();

    private ScannerConfig scannerConfig;
    private Injector injector;

    /** All available Pinger implementations */
    Map<String, Class<? extends Pinger>> pingers;

    @SuppressWarnings("unchecked")
    public PingerRegistry(ScannerConfig scannerConfig, Injector injector) throws ClassNotFoundException {
        this.scannerConfig = scannerConfig;
        this.injector = injector;

        pingers = new LinkedHashMap<>();
        if (Platform.WINDOWS)
            pingers.put("pinger.windows", (Class<Pinger>) Class.forName(getClass().getPackage().getName() + ".WindowsPinger"));
        pingers.put("pinger.udp", UDPPinger.class);
        pingers.put("pinger.tcp", TCPPinger.class);
        pingers.put("pinger.combined", CombinedUnprivilegedPinger.class);
        pingers.put("pinger.java", JavaPinger.class);
        pingers.put("pinger.arp", ARPPinger.class);
    }

    public String[] getRegisteredNames() {
        return pingers.keySet().toArray(new String[pingers.size()]);
    }

    /**
     * Creates the configured pinger with configured timeout
     */
    public Pinger createPinger(boolean isLAN) throws FetcherException {
        Class<? extends Pinger> pingerClass = pingers.get(scannerConfig.selectedPinger);
        if (pingerClass == null) {
            Map.Entry<String, Class<? extends Pinger>> first = pingers.entrySet().iterator().next();
            scannerConfig.selectedPinger = first.getKey();
            pingerClass = first.getValue();
        }
        Pinger mainPinger = createPinger(pingerClass, scannerConfig.pingTimeout);
        if (isLAN) return new ARPPinger(injector.require(MACFetcher.class), mainPinger);
        return mainPinger;
    }

    Pinger createPinger(String pingerName, int timeout) throws FetcherException {
        return createPinger(pingers.get(pingerName), timeout);
    }

    /**
     * Creates a specified pinger with specified timeout
     */
    Pinger createPinger(Class<? extends Pinger> pingerClass, int timeout) throws FetcherException {
        try {
            return injector.require(pingerClass);
        }
        catch (InjectException ie) {
            try {
                Constructor<? extends Pinger> constructor = pingerClass.getConstructor(int.class);
                Pinger pinger = constructor.newInstance(timeout);
                injector.register((Class<Pinger>) pingerClass, pinger);
                return pinger;
            }
            catch (Exception e) {
                Throwable t = e instanceof InvocationTargetException ? e.getCause() : e;
                String message = "Unable to create pinger: " + pingerClass.getSimpleName();
                LOG.log(Level.FATAL, message, t);
                if (t instanceof RuntimeException) throw (RuntimeException) t;
                throw new FetcherException("pingerCreateFailure");
            }
        }
    }
}
