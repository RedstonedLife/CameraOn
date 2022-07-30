package com.bss.inc.utils;

public class ProductKeyUtils {
    public native String buildHexStr();

    static {
        System.loadLibrary("ProductKeyUtils");
    }
}
