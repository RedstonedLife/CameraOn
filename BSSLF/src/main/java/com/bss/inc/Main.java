package com.bss.inc;

public class Main {
    private native String buildHexStr();
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    static {
        System.loadLibrary("ProductKeyUtils");
    }
}