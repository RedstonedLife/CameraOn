package com.bss.inc.cameraon.utils.net.angryscan;

import com.bss.inc.cameraon.utils.net.angryscan.feeders.Feeder;
import com.bss.inc.cameraon.utils.net.angryscan.fetchers.Fetcher;
import com.bss.inc.cameraon.utils.net.angryscan.fetchers.FetcherRegistry;
import com.bss.inc.cameraon.utils.net.angryscan.fetchers.HostnameFetcher;
import com.bss.inc.cameraon.utils.net.angryscan.fetchers.IPFetcher;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.ScanningState;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.StateMachine;
import com.bss.inc.cameraon.utils.net.angryscan.state.state.StateTransitionListener;

import java.net.InetAddress;
import java.util.*;

public class ScanningResultList implements Iterable<ScanningResult> {
    private static final int RESULT_LIST_INITIAL_SIZE = 1024;

    private FetcherRegistry fetcherRegistry;
    // selected fetchers are cached here, because they may be changed in the registry already
    private List<Fetcher> selectedFetchers = Arrays.asList(new HostnameFetcher(), new IPFetcher());

    private List<ScanningResult> resultList = new ArrayList<>(RESULT_LIST_INITIAL_SIZE);
    private Map<InetAddress, Integer> resultIndexes = new HashMap<>(RESULT_LIST_INITIAL_SIZE);

    /** Feeder information that was used for this scan */
    private String feederInfo;
    /** Feeder name that was used for this scan */
    private String feederName;

    /** Information and statistics about the last scan */
    ScanInfo info;

    private ScanningResultComparator resultsComparator = new ScanningResultComparator();

    public ScanningResultList() {
        this.fetcherRegistry = new FetcherRegistry();
    }

    public ScanningResultList(StateMachine stateMachine) {
        this();
        stateMachine.addTransitionListener(new StopScanningListener());
    }

    /**
     * @return selected fetchers that were used for the last scan
     * Note: they may be different from {@link FetcherRegistry#getSelectedFetchers()}
     */
    public List<Fetcher> getFetchers() {
        return selectedFetchers;
    }

    /**
     * @return true if scanning results are available and can be used
     */
    public boolean areResultsAvailable() {
        return !resultList.isEmpty();
    }

    /**
     * @return true if scanning info is available and can be used
     */
    public boolean isInfoAvailable() {
        return info != null;
    }

    /**
     * @return feeder configuration information that was used for the last scan
     */
    public String getFeederInfo() {
        return feederInfo;
    }

    /**
     * @return feeder name that was used for the last scan
     */
    public String getFeederName() {
        return feederName;
    }

    /**
     * Creates the new results holder for particular address or returns an existing one.
     * @return pre-initialized empty ScanningResult
     */
    public synchronized ScanningResult createResult(InetAddress address) {
        info.numScanned++;
        Integer index = resultIndexes.get(address);
        if (index == null) {
            return new ScanningResult(address, fetcherRegistry.getSelectedFetchers().size(), this);
        }
        return resultList.get(index);
    }

    /**
     * Registers the provided results holder at the specified index in this list.
     * This index will later be used to retrieve the result when redrawing items.
     * TODO: index parameter is not really needed here - add method with index will not work with sparse lists anyway
     */
    public synchronized void registerAtIndex(int index, ScanningResult result) {
        if (resultIndexes.put(result.getAddress(), index) != null)
            throw new IllegalStateException(result.getAddress() + " is already registered in the list");

        result.resultList = this;
        resultList.add(index, result);

        // if the result is already ready, then update statistics right away
        // otherwise it will be done later
        if (result.isReady())
            updateStatistics(result);
    }

    /**
     * @return true if the provided result holder exists in the list.
     */
    public synchronized boolean isRegistered(ScanningResult result) {
        return resultIndexes.containsKey(result.getAddress());
    }

    /**
     * Updates statistics.
     * @return the index of the result in the list, if it is registered.
     */
    public synchronized int update(ScanningResult result) {
        // if now the result is ready, we need to update statistics
        if (result.isReady())
            updateStatistics(result);

        return resultIndexes.get(result.getAddress());
    }

    /**
     * Clears previous scanning results, prepares for a new scan.
     */
    public synchronized void clear() {
        // clear the results
        resultList.clear();
        resultIndexes.clear();
    }

    /**
     * Prepares for a new scan. Note: previous results are not automatically cleared.
     * @param feeder the feeder that will be used for the scan
     */
    public synchronized void initNewScan(Feeder feeder) {
        // reload currently selected fetchers
        selectedFetchers = new ArrayList<>(fetcherRegistry.getSelectedFetchers());
        // store feeder info for later
        this.feederInfo = feeder.getInfo();
        this.feederName = feeder.getName();
        // recreate info
        this.info = new ScanInfo();
    }

    /**
     * @return ScanInfo instance that contains some additional information about the last scan.
     */
    public ScanInfo getScanInfo() {
        return info;
    }

    /**
     * @return an Iterator of scanning results
     *
     * Note: the returned Iterator is not synchronized
     */
    public synchronized Iterator<ScanningResult> iterator() {
        return resultList.iterator();
    }

    /**
     * @return the results of the IP address, corresponding to an index
     */
    public synchronized ScanningResult getResult(int index) {
        return resultList.get(index);
    }

    /**
     * Removes the elements by the provided indices
     * @param indices a sorted list of indices to remove
     */
    public synchronized void remove(int[] indices) {
        // this rebuild is faster than a number of calls to remove()
        // however, a further speedup may be obtained by using a Set instead of binarySearch()
        List<ScanningResult> newList = new ArrayList<>(RESULT_LIST_INITIAL_SIZE);
        Map<InetAddress, Integer> newMap = new HashMap<>(RESULT_LIST_INITIAL_SIZE);
        for (int i = 0; i < resultList.size(); i++) {
            if (Arrays.binarySearch(indices, i) < 0) {
                newList.add(resultList.get(i));
                newMap.put(resultList.get(i).getAddress(), newList.size()-1);
            }
        }
        resultList = newList;
        resultIndexes = newMap;
    }

    /**
     * Sorts by the specified column index.
     */
    public synchronized void sort(int columnIndex, boolean ascending) {
        // setup comparator
        resultsComparator.byIndex(columnIndex, ascending);
        resultList.sort(resultsComparator);

        // now rebuild indexes
        resultIndexes = new HashMap<>(RESULT_LIST_INITIAL_SIZE);
        for (int i = 0; i < resultList.size(); i++) {
            resultIndexes.put(resultList.get(i).getAddress(), i);
        }
    }

    /**
     * Finds the text in the result list (case-insensitive).
     * @param text the text to find
     * @param startIndex the element to start from
     * @return the index of found element, or -1
     */
    public int findText(String text, int startIndex) {
        text = text.toLowerCase();
        for (int i = startIndex; i < resultList.size(); i++) {
            ScanningResult scanningResult = getResult(i);

            for (Object value : scanningResult.getValues()) {
                if (value != null && value.toString().toLowerCase().contains(text)) {
                    return i;
                }
            }
        }
        // not found
        return -1;
    }

    private void updateStatistics(ScanningResult result) {
        if (info == null) {
            return;
        }
        if (result.getType() == ScanningResult.ResultType.ALIVE) {
            info.numAlive++;
        }
        else if (result.getType() == ScanningResult.ResultType.WITH_PORTS) {
            info.numAlive++;
            info.numWithPorts++;
        }
    }

    public int getFetcherIndex(String fetcherId) {
        int index = 0;
        for (Fetcher fetcher : getFetchers()) {
            if (fetcherId.equals(fetcher.getId())) return index;
            index++;
        }
        return -1;
    }

    public List<ScanningResult> getResultList() {
        return resultList;
    }

    /**
     * Additional information about the last scan
     */
    public static class ScanInfo {
        protected boolean scanFinished;
        protected boolean scanAborted;

        protected long startTime = System.currentTimeMillis();
        private long endTime;
        protected int numScanned;
        protected int numAlive;
        protected int numWithPorts;

        /**
         * @return total scan time, in milliseconds.
         * If scan is not finished yet, then shows the time from start until now.
         */
        public long getScanTime() {
            long endTime = this.endTime;
            if (endTime == 0)
                endTime = System.currentTimeMillis();
            return endTime - startTime;
        }

        /**
         * @return total number of scanned hosts
         */
        public int getHostCount() {
            return numScanned;
        }

        /**
         * @return number of alive hosts
         */
        public int getAliveCount() {
            return numAlive;
        }

        /**
         * @return number of hosts with some scanned ports open
         */
        public int getWithPortsCount() {
            return numWithPorts;
        }

        /**
         * @return true if the scan is completed (not aborted)
         */
        public boolean isCompletedNormally() {
            return scanFinished && !scanAborted;
        }
    }

    class StopScanningListener implements StateTransitionListener {
        public void transitionTo(ScanningState state, StateMachine.Transition transition) {
            synchronized (ScanningResultList.this) {
                if (transition == StateMachine.Transition.COMPLETE && state == ScanningState.IDLE) {
                    info.endTime = System.currentTimeMillis();
                    info.scanFinished = true;
                }
                else
                if (state == ScanningState.KILLING) {
                    info.scanAborted = true;
                }
            }
        }
    }
}
