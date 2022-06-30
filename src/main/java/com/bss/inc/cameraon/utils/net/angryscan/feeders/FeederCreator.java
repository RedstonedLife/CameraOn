package com.bss.inc.cameraon.utils.net.angryscan.feeders;

public interface FeederCreator {
    /**
     * Initializes a Feeder instance using the parameters, provided by the GUI.
     * @return initialized feeder instance
     */
    Feeder createFeeder();

    /**
     * @return the feeder id
     */
    String getFeederId();

    /**
     * @return the feeder name
     */
    String getFeederName();

    /**
     * @return serialized settings to a String
     */
    String[] serialize();

    /**
     * Restores previously serialized settings.
     * @param parts
     */
    void unserialize(String... parts);

    /**
     * @return labels corresponding to parts during serialization.
     * Used for command-line usage help, etc.
     */
    String[] serializePartsLabels();

}
