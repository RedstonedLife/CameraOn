package com.bss.inc.cameraon.utils.net.angryscan.feeders;

import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;
import com.bss.inc.cameraon.utils.net.angryscan.utils.InetAddressUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class RangeFeeder extends AbstractFeeder {

    private InetAddress startIP;
    private InetAddress endIP;
    private InetAddress originalEndIP;
    private InetAddress currentIP;
    boolean isReverse;

    double percentageComplete;
    double percentageIncrement;

    /**
     * @see Feeder#getId()
     */
    public String getId() {
        return "feeder.range";
    }

    public RangeFeeder() {
    }

    public RangeFeeder(String startIP, String endIP) {
        try {
            this.startIP = this.currentIP = InetAddress.getByName(startIP);
            this.endIP = this.originalEndIP = InetAddress.getByName(endIP);
            this.isReverse = false;
        }
        catch (UnknownHostException e) {
            throw new FeederException("malformedIP");
        }
        if (InetAddressUtils.greaterThan(this.startIP, this.endIP)) {
            this.isReverse = true;
            this.endIP = InetAddressUtils.decrement(InetAddressUtils
                    .decrement(this.endIP));
        }
        this.endIP = InetAddressUtils.increment(this.endIP);
    }

    /**
     * Initalizes fields, used for computation of percentage of completion.
     */
    public boolean hasNext() {
        // equals() is faster than greaterThan()
        return !currentIP.equals(endIP);
    }

    public ScanningSubject next() {
        percentageComplete += percentageIncrement;
        InetAddress prevIP = this.currentIP;
        if (this.isReverse) {
            this.currentIP = InetAddressUtils.decrement(prevIP);
        } else {
            this.currentIP = InetAddressUtils.increment(prevIP);
        }
        return new ScanningSubject(prevIP);
    }

    public float percentageComplete() {
        return (float)percentageComplete;
    }

    public String getInfo() {
        // let's return the range
        return startIP.getHostAddress() + " - " + originalEndIP.getHostAddress();
    }
}
