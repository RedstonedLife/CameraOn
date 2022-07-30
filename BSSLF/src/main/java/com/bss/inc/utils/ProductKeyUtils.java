package com.bss.inc.utils;

public class ProductKeyUtils {
    public native String buildHexStr(final int expectedLength, final long content);

    static {
        System.loadLibrary("ProductKeyUtils");
    }
}
