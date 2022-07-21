package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.bss.inc.cameraon.MainClass;
import org.apache.tools.ant.Main;

import java.util.*;

import static java.util.Arrays.asList;

public class FetcherRegistry {

    private Fetcher ipFetcher;
    private PingFetcher pingFetcher;
    private HostnameFetcher hostnameFetcher;
    private PortsFetcher portsFetcher;
    /** All available Fetcher implementations, List of Fetcher instances */
    private Map<String, Fetcher> registeredFetchers;

    /** Selected for scanning Fetcher implementations, keys are fetcher labels, values are Fetcher instances */
    private Map<String, Fetcher> selectedFetchers;

    /** A collection of update listeners - observers of FetcherRegistry */
    private List<FetcherRegistryUpdateListener> updateListeners = new ArrayList<>();

    public FetcherRegistry() {
        ipFetcher = new IPFetcher();
        pingFetcher = new PingFetcher(MainClass.getPingerRegistry(), MainClass.getConfig().forScanner());
        hostnameFetcher = new HostnameFetcher();
        portsFetcher = new PortsFetcher(MainClass.getConfig().forScanner());
        registeredFetchers = createFetchersMap(asList(ipFetcher, pingFetcher, hostnameFetcher, portsFetcher));
        loadSelectedFetchers();
    }

    private Map<String, Fetcher> createFetchersMap(List<Fetcher> fetchers) {
        Map<String, Fetcher> registeredFetchers = new LinkedHashMap<>(fetchers.size());
        for (Fetcher fetcher : fetchers) {
            registeredFetchers.put(fetcher.getId(), fetcher);
        }
        return Collections.unmodifiableMap(registeredFetchers);
    }

    private void loadSelectedFetchers() {
            selectedFetchers = new LinkedHashMap<>();
            selectedFetchers.put(IPFetcher.ID, registeredFetchers.get(IPFetcher.ID));
            selectedFetchers.put(PingFetcher.ID, registeredFetchers.get(PingFetcher.ID));
            selectedFetchers.put(HostnameFetcher.ID, registeredFetchers.get(HostnameFetcher.ID));
            selectedFetchers.put(PortsFetcher.ID, registeredFetchers.get(PortsFetcher.ID));
    }


    /**
     * Adds a listener to observe FetcherRegistry events, like modification of selected fetchers.
     */
    public void addListener(FetcherRegistryUpdateListener listener) {
        updateListeners.add(listener);
    }

    /**
     * @return a List of all registered Fetchers
     */
    public Collection<Fetcher> getRegisteredFetchers() {
        return registeredFetchers.values();
    }

    /**
     * @return a List of selected Fetchers only
     */
    public Collection<Fetcher> getSelectedFetchers() {
        return selectedFetchers.values();
    }

    /**
     * Searches for selected fetcher with the given label
     * @return the index, if found, or -1
     */
    public int getSelectedFetcherIndex(String id) {
        int index = 0;
        for (Fetcher fetcher : selectedFetchers.values()) {
            if (id.equals(fetcher.getId())) return index;
            index++;
        }
        return -1;
    }

}
