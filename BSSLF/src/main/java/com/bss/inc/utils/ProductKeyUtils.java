package com.bss.inc.utils;

public class ProductKeyUtils {
    public native String buildHexStr(final int expectedLength, final long content);

    static {
        System.loadLibrary("ProductKeyUtils");
    }

    public static String bhs(final int expectedLength, final long content)
    {
        String hexStr = String.format("%0" + expectedLength + "X", content);

        if (hexStr.length() > expectedLength)
        {
            hexStr = hexStr.substring(hexStr.length() - expectedLength);
        }

        while (hexStr.length() < expectedLength)
        {
            hexStr = "0" + hexStr;
        }

        return hexStr;
    }
}
