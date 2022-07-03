package com.redsoftware.ltd.bnc.utils.networking.angryscan.values;

public abstract class Empty implements Comparable<Object> {

    static int sortDirection = 1;

    /**
     * @param ascending changes the sorting behavior of all Empty objects,
     * passing true here will make all Empty objects to be greater than any other objects,
     * passing false will do otherwise. This needs to be set to make all Empty objects always
     * appear at the end of the sorted list.
     */
    public static void setSortDirection(boolean ascending) {
        Empty.sortDirection = ascending ? 1 : -1;
    }

    public int compareTo(Object that) {
        if (this == that)
            return 0;
        // this value is either smaller or greater than any other object (except null)
        return sortDirection;
    }
}
