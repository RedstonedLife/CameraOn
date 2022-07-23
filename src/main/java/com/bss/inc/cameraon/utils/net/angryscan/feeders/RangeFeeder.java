package com.bss.inc.cameraon.utils.net.angryscan.feeders;

import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;
import com.bss.inc.cameraon.utils.net.angryscan.utils.InetAddressUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static com.bss.inc.cameraon.utils.net.angryscan.utils.OctetConverter.octetsToInt;

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
        initPercentageIncrement();
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

    public double percentageComplete() {
        return percentageIncrement;
    }

    /**
     * Initalizes fields, used for computation of percentage of completion.
     */
    private void initPercentageIncrement() {
        byte[] endAddress = this.endIP.getAddress();
        long rawEndIP = octetsToInt(endAddress, endAddress.length - 4);
        long rawStartIP = octetsToInt(this.startIP.getAddress(), endAddress.length - 4);
        // make 32-bit unsigned values
        rawEndIP = rawEndIP >= 0 ? rawEndIP : rawEndIP + Integer.MAX_VALUE;
        rawStartIP = rawStartIP >= 0 ? rawStartIP : rawStartIP + Integer.MAX_VALUE;
        // compute 1% of the whole range
        percentageIncrement = Math.abs(100.0 / (rawEndIP - rawStartIP + 1));
        percentageComplete = 0;
    }

    public String getInfo() {
        // let's return the range
        return startIP.getHostAddress() + " - " + originalEndIP.getHostAddress();
    }
}
