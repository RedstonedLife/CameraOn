package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.bss.inc.cameraon.utils.net.angryscan.ScanningSubject;
import com.bss.inc.cameraon.utils.net.angryscan.values.NotScanned;
import com.bss.inc.cameraon.utils.net.angryscan.values.NumericRangeList;

import java.util.SortedSet;

public class FilteredPortsFetcher extends PortsFetcher {

    public FilteredPortsFetcher() {
        super();
    }

    public String getId() {
        return "fetcher.ports.filtered";
    }

    public Object scan(ScanningSubject subject) {
        boolean portsScanned = scanPorts(subject);
        if (!portsScanned)
            return NotScanned.VALUE;

        SortedSet<Integer> filteredPorts = getFilteredPorts(subject);
        return filteredPorts.size() > 0 ? new NumericRangeList(filteredPorts, displayAsRanges) : null;
    }
}