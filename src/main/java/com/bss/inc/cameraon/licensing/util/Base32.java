package com.bss.inc.cameraon.licensing.util;

public class Base32 {
    private static final int[] a = new int[] {
            255, 255, 26, 27, 28, 29, 30, 31, 255, 255, 255, 255, 255, 255, 255, 255, 255, 0, 1, 2, 3, 4, 5, 6, 7, 8,
            9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 255, 255, 255, 255, 255, 255, 0, 1, 2,
            3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,255,255,255,255,255};

    public static String encode(byte[] bytes) {
        byte b = 0;
        int i = 0;
        int j = 0;
        switch(bytes.length) {
            case 1:
                
        }
    }
}
