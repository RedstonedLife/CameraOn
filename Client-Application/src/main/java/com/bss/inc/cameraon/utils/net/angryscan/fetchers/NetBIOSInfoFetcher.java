package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.bss.inc.cameraon.logging.Logger;
import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;
import com.bss.inc.cameraon.utils.net.angryscan.config.LoggerFactory;
import com.bss.inc.cameraon.utils.net.angryscan.utils.NetBIOSResolver;

import java.net.SocketException;
import java.net.SocketTimeoutException;

import static com.bss.inc.cameraon.logging.Level.WARN;

public class NetBIOSInfoFetcher extends AbstractFetcher {
    public NetBIOSInfoFetcher() {}

    private static final Logger LOG = LoggerFactory.getLogger();

    public String getId() {
        return "fetcher.netbios";
    }

    public Object scan(ScanningSubject subject) {
        try (NetBIOSResolver netbios = new NetBIOSResolver(subject.getAdaptedPortTimeout())) {
            String[] names = netbios.resolve(subject.getAddress());
            if (names == null) return null;

            String computerName = names[0];
            String userName = names[1];
            String groupName = names[2];
            String macAddress = names[3];

            return (groupName != null ? groupName + "\\" : "") +
                    (userName != null ? userName + "@" : "") +
                    (computerName != null ? computerName + ' ' : "") + '[' + macAddress + ']';
        }
        catch (SocketTimeoutException e) {
            // this is not a derivative of SocketException
            return null;
        }
        catch (SocketException e) {
            // this includes PortUnreachableException
            return null;
        }
        catch (Exception e) {
            // bugs?
            LOG.log(WARN, null, e);
            return null;
        }
    }
}
