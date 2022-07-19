package com.bss.inc.cameraon.licensing.exceptions;

public class EncodingDataNotCompleteException {
    /* PRIVATE CONSTANTS */
    private static final long serialVersionUID = 1L;

    /* CONSTRUCTORS */
    /**
     * This will create a new instance of a {@link EncodingDataNotCompleteException}.
     */
    public EncodingDataNotCompleteException()
    {
        super("Encoding-data must be complete for generating product-keys.");
    }
}
