package com.redsoftware.ltd.bnc.utils.networking.angryscan.core;

public interface Plugin {
    /**
     * @return unique ID of the pluggable, representing it
     */
    String getId();

    /**
     * @return localized name of this pluggable (most likely resolved using it's id)
     */
    String getName();

}
