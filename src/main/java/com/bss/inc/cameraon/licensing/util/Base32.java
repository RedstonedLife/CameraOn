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
            case 1 -> j = 6;
            case 2 -> j = 4;
            case 3 -> j = 3;
            case 4 -> j = 1;
        }
        StringBuffer stringBuffer = new StringBuffer((bytes.length + 7 << 3) / 5 + j);
        while (b < bytes.length) {
            j = (bytes[b] >= 0) ? bytes[b] : (bytes[b] + 256);
            if (i > 3) {
                int bool;
                if (b + 1 < bytes.length) {
                    bool = (bytes[b + 1] >= 0) ? bytes[b + 1] : (bytes[b + 1] + 256);
                } else {
                    bool = -Integer.MIN_VALUE;
                }
                j &= 255 >> i;
                i = (i + 5) % 8;
                j = j << i | bool >> 8 - i;
                b++;
            } else {
                j = j >> 8 - i + 5 & 0x1F;
                if ((i = (i + 5) % 8) == 0)
                    b++;
            }
            stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".charAt(j));
        }
        switch (bytes.length) {
            case 1:
                stringBuffer.append("======");
                break;
            case 2:
                stringBuffer.append("====");
                break;
            case 3:
                stringBuffer.append("===");
                break;
            case 4:
                stringBuffer.append("=");
                break;
        }
        return stringBuffer.toString();
    }
}
