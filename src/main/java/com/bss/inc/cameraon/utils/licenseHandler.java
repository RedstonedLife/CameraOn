package com.bss.inc.cameraon.utils;

import com.weilerhaus.productKeys.enums.ProductKeyState;
import com.weilerhaus.productKeys.impl.BasicProductKeyGenerator;
import com.weilerhaus.productKeys.impl.beans.BasicProductKeyEncodingData;

public class licenseHandler {
    private static BasicProductKeyGenerator kgen;

    static {
        new BasicProductKeyGenerator(
                null,
                new BasicProductKeyEncodingData((byte) 15, (byte) 211, (byte) 68),
                null,
                null,
                new BasicProductKeyEncodingData((byte) 142, (byte) 350, (byte) 17),
                null,
                null,
                null,
                new BasicProductKeyEncodingData((byte) 302, (byte) 109, (byte) 308),
                null
        );
    }

    public static ProductKeyState verifyProductKey(final String s) {
        return kgen.verifyProductKey(s);
    }
}
