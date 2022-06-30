package com.bss.inc.cameraon.utils.net.angryscan.core;

import com.redsoftware.ltd.bnc.i18n.I18n;

public class UserErrorException extends RuntimeException {
    public UserErrorException(String label) {
        super(label);
    }

    public UserErrorException(String label, Throwable cause) {
        super(label, cause);
    }

    public UserErrorException(Throwable cause) {
        super(cause);
    }

    public UserErrorException(String label, String rawInfo) {
        super(I18n.tl("exception.UserErrorException." + label) + rawInfo);
    }
}
