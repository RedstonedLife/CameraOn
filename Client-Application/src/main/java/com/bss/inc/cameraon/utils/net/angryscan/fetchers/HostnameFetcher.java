package com.bss.inc.cameraon.utils.net.angryscan.fetchers;


import com.bss.inc.cameraon.logging.Level;
import com.bss.inc.cameraon.logging.Logger;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;
import com.bss.inc.cameraon.utils.net.angryscan.config.LoggerFactory;
import com.bss.inc.cameraon.utils.net.angryscan.utils.MDNSResolver;
import com.bss.inc.cameraon.utils.net.angryscan.utils.NetBIOSResolver;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

public class HostnameFetcher extends AbstractFetcher {
    private static final Logger LOG = LoggerFactory.getLogger();

    private static Object inetAddressImpl;
    private static Method getHostByAddr;

    static {
        try {
            Field impl = InetAddress.class.getDeclaredField("impl");
            impl.setAccessible(true);
            inetAddressImpl = impl.get(null);
            getHostByAddr = inetAddressImpl.getClass().getDeclaredMethod("getHostByAddr", byte[].class);
            getHostByAddr.setAccessible(true);
        }
        catch (Exception e) {
            LOG.log(Level.WARN, "Could not get InetAddressImpl", e);
        }
    }

    public static final String ID = "fetcher.hostname";

    public HostnameFetcher() {}

    public String getId() {
        return ID;
    }

    @SuppressWarnings("PrimitiveArrayArgumentToVariableArgMethod")
    private String resolveWithRegularDNS(InetAddress ip) {
        try {
            // faster way to do lookup - getCanonicalHostName() actually does both reverse and forward lookups inside
            return (String) getHostByAddr.invoke(inetAddressImpl, ip.getAddress());
        }
        catch (Exception e) {
            if (e instanceof InvocationTargetException && e.getCause() instanceof UnknownHostException)
                return null;

            // return the returned hostname only if it is not the same as the IP address (this is how the above method works)
            String hostname = ip.getCanonicalHostName();
            return ip.getHostAddress().equals(hostname) ? null : hostname;
        }
    }

    private String resolveWithMulticastDNS(ScanningSubject subject) {
        try {
            MDNSResolver resolver = new MDNSResolver(subject.getAdaptedPortTimeout());
            String name = resolver.resolve(subject.getAddress());
            resolver.close();
            return name;
        }
        catch (SocketTimeoutException | SocketException e) {
            return null;
        }
        catch (Exception e) {
            LOG.log(Level.WARN, "Failed to query mDNS for " + subject, e);
            return null;
        }
    }

    private String resolveWithNetBIOS(ScanningSubject subject) {
        try {
            NetBIOSResolver resolver = new NetBIOSResolver(subject.getAdaptedPortTimeout());
            String[] names = resolver.resolve(subject.getAddress());
            resolver.close();
            return names == null ? null : names[0];
        }
        catch (SocketTimeoutException | SocketException e) {
            return null;
        }
        catch (Exception e) {
            LOG.log(Level.WARN, "Failed to query NetBIOS for " + subject, e);
            return null;
        }
    }

    public Object scan(ScanningSubject subject) {
        String name = resolveWithRegularDNS(subject.getAddress());
        if (name == null && subject.isLocal()) name = resolveWithMulticastDNS(subject);
        if (name == null && subject.isLocal()) name = resolveWithNetBIOS(subject);
        return name;
    }
}
