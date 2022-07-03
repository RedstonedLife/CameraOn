package com.bss.inc.cameraon.utils.net.angryscan.state.state;

public enum ScanningState {

    IDLE,
    STARTING,
    SCANNING,
    STOPPING,
    KILLING,
    RESTARTING;

    /**
     * Transitions the state to the next one.
     * Note: not all states have the default next state;
     */
    ScanningState next() {
        switch (this) {
            case IDLE: return STARTING;
            case STARTING: return SCANNING;
            case SCANNING: return STOPPING;
            case STOPPING: return KILLING;
            case RESTARTING: return SCANNING;
            default: return null;
        }
    }
}
