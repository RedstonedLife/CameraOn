package com.bss.inc.cameraon.utils.net.angryscan.config;

import com.bss.inc.cameraon.utils.net.angryscan.di.Injector;
import com.bss.inc.cameraon.utils.net.angryscan.fetchers.*;

public class ComponentRegistry {
    public void register(Injector i) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        i.register(IPFetcher.class, PingFetcher.class, PingTTLFetcher.class, HostnameFetcher.class, PortsFetcher.class);
        i.register(MACFetcher.class, (MACFetcher) Class.forName(MACFetcher.class.getPackage().getName() +
                (Platform.WINDOWS ? ".WinMACFetcher" : Platform.LINUX ? ".LinuxMACFetcher" : ".UnixMACFetcher")).newInstance());
        i.register(FilteredPortsFetcher.class, WebDetectFetcher.class, HTTPSenderFetcher.class,
                NetBIOSInfoFetcher.class, PacketLossFetcher.class, HTTPProxyFetcher.class, MACVendorFetcher.class);
    }

    public Injector init() throws Exception {
        Injector injector = new Injector();
        new ComponentRegistry().register(injector);
        return injector;
    }
}
