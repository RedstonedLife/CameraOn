package com.bss.inc.cameraon.licensing.utils;

public class ProductKeyUtils {
    public static String buildHexStr(final int expectedLength, final long content) {
        String hexStr = String.format("%0" + expectedLength + "X", content);
    }
}
