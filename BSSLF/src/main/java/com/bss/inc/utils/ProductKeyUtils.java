package com.bss.inc.utils;

public class ProductKeyUtils {
    private native String buildHexStr();

    static {
        System.loadLibrary("ProductKeyUtils");
    }
}
