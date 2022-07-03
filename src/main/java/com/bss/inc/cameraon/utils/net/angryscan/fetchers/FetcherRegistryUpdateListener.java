package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

public interface FetcherRegistryUpdateListener {

    /**
     * This method is called when the list of selected Fetchers was changed.
     * @param fetcherRegistry
     */
    void handleUpdateOfSelectedFetchers(FetcherRegistry fetcherRegistry);

}
