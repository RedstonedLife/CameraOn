package com.bss.inc.cameraon.utils.net.angryscan.fetchers;

import com.bss.inc.cameraon.utils.net.angryscan.core.UserErrorException;

public class FetcherException extends UserErrorException {
    public FetcherException(String label, Throwable cause) {
        super(label, cause);
    }

    public FetcherException(String label) {
        super(label);
    }

    public FetcherException(Throwable cause) {
        super(cause);
    }
}
