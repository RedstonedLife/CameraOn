package com.bss.inc.cameraon.utils.net.angryscan;

import com.bss.inc.cameraon.utils.net.angryscan.fetchers.Fetcher;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ScanningResult {
    public enum ResultType {
        UNKNOWN, DEAD, ALIVE, WITH_PORTS;

        public boolean matches(ResultType that) {
            if (this.ordinal() <= DEAD.ordinal())
                return that.ordinal() <= DEAD.ordinal();
            return this.ordinal() <= that.ordinal();
        }
    }

    private InetAddress address;
    private String mac;

    /** Scanning results, result of each Fetcher is an element */
    private Object[] values;
    /** Scanning result type */
    private ResultType type;

    /** reference to the containing list */
    ScanningResultList resultList;

    /**
     * Creates a new instance, initializing the first value to the
     * provided address
     * @param numberOfFetchers the number of currently available fetchers
     */
    public ScanningResult(InetAddress address, int numberOfFetchers, ScanningResultList resultList) {
        this.address = address;
        this.resultList = resultList;
        values = new Object[numberOfFetchers];
        values[0] = address.getHostAddress();
        type = ResultType.UNKNOWN;
    }

    /**
     * Resets scanned data: returns the result to the "just created" state.
     * Used for rescanning.
     */
    public void reset() {
        values = new Object[values.length];
        values[0] = address.getHostAddress();
        type = ResultType.UNKNOWN;
    }

    public InetAddress getAddress() {
        return address;
    }

    /**
     * @return true if the result is ready (completely scanned)
     */
    public boolean isReady() {
        return type != ResultType.UNKNOWN;
    }

    /**
     * @return the scanning results as an unmodifiable List, result of each Fetcher is an element
     */
    public List<Object> getValues() {
        return Arrays.asList(values);
    }

    public void setValues(Object[] values) {
        this.values = values;
    }

    /**
     * Sets scanning result type
     */
    public void setType(ResultType type) {
        this.type = type;
    }

    /**
     * @return the scanning result type
     */
    public ResultType getType() {
        return type;
    }

    /**
     * Sets the value returned by the specified fetcher
     */
    public void setValue(int fetcherIndex, Object value) {
        values[fetcherIndex] = value;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getMac() {
        return mac;
    }

    /**
     * Returns all results for this IP address as a String.
     * This is used in showing the IP Details dialog box.
     * @return human-friendly text representation of results
     */
    public String toString() {
        StringBuilder details = new StringBuilder(1024);
        Iterator<?> iterator = getValues().iterator();
        List<Fetcher> fetchers = resultList.getFetchers();
        for (int i = 0; iterator.hasNext(); i++) {
            String fetcherName = fetchers.get(i).getName();
            details.append(fetcherName).append(":\t");
            Object value = iterator.next();
            details.append(value != null ? value : "");
        }
        details.append("Type: \t");
        details.append(this.type.toString());
        return details.toString();
    }
}
