package com.bss.inc.cameraon.utils.net.angryscan.state;

import com.bss.inc.cameraon.logging.Level;
import com.bss.inc.cameraon.logging.Logger;
import com.bss.inc.cameraon.utils.net.angryscan.config.LoggerFactory;
import com.bss.inc.cameraon.utils.net.angryscan.config.Platform;
import com.bss.inc.cameraon.utils.net.angryscan.config.ScannerConfig;
import com.bss.inc.cameraon.utils.net.angryscan.di.InjectException;
import com.bss.inc.cameraon.utils.net.angryscan.di.Injector;
import com.bss.inc.cameraon.utils.net.angryscan.fetchers.*;

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
        // DARK VOODOO MAGIC, IDK WTF I AM DOING
        try {
            injector.register(MACFetcher.class, (MACFetcher) Class.forName(MACFetcher.class.getPackage().getName() +
                    (Platform.WINDOWS ? ".WinMACFetcher" : Platform.LINUX ? ".LinuxMACFetcher" : ".UnixMACFetcher")).newInstance());
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //
        pingers = new LinkedHashMap<>();
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
        Pinger mainPinger = createPinger(pingerClass, scannerConfig);
        if (isLAN) return new ARPPinger(injector.require(MACFetcher.class), mainPinger);
        return mainPinger;
    }

    Pinger createPinger(String pingerName, ScannerConfig timeout) throws FetcherException {
        return createPinger(pingers.get(pingerName), timeout);
    }

    /**
     * Creates a specified pinger with specified timeout
     */
    Pinger createPinger(Class<? extends Pinger> pingerClass, ScannerConfig timeout) throws FetcherException {
        try {
            return injector.require(pingerClass);
        }
        catch (InjectException ie) {
            try {
                Constructor<? extends Pinger> constructor = pingerClass.getConstructor(ScannerConfig.class);
                Pinger pinger = constructor.newInstance(timeout);
                injector.register((Class<Pinger>) pingerClass, pinger);
                return pinger;
            }
            catch (Exception e) {
                Throwable t = e instanceof InvocationTargetException ? e.getCause() : e;
                String message = "Unable to create pinger: " + pingerClass.getSimpleName();
                LOG.log(Level.FATAL, message, e);
                if (t instanceof RuntimeException) throw (RuntimeException) t;
                throw new FetcherException("pingerCreateFailure");
            }
        }
    }
}
