package com.bss.inc.cameraon.utils.net.angryscan.feeders;

public class FeederException extends IllegalArgumentException {

    static final long serialVersionUID = 746237846273847L;

    public FeederException(String message) {
        super(message);
    }

    public FeederException(String message, Throwable cause) {
        super(message);
        initCause(cause);
    }

}
