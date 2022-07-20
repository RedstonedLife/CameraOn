package com.bss.inc.cameraon.licensing.utils;

public class ProductKeyUtils {
    public static String buildHexStr(final int expectedLength, final long content) {
        String hexStr = String.format("%0" + expectedLength + "X", content);
        if (hexStr.length() > expectedLength) hexStr.substring(hexStr.length() - expectedLength);
        while(hexStr.length() < expectedLength) hexStr = "0" + hexStr;
        return hexStr;
    }
}
