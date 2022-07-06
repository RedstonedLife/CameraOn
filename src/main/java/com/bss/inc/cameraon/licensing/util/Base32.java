package com.bss.inc.cameraon.licensing.util;

public class Base32 {
    private static final int[] a = new int[] {
            255, 255, 26, 27, 28, 29, 30, 31, 255, 255,
            255, 255, 255, 255, 255, 255, 255, 0, 1, 2,
            3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
            13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
            23, 24, 25, 255, 255, 255, 255, 255, 255, 0,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 255, 255, 255, 255, 255 };

    public static String encode(byte[] bytes) {
        byte b = 0;
        int i = 0;
        int j = 0;
        switch (bytes.length) {
            case 1:
                j = 6;
                break;
            case 2:
                j = 4;
                break;
            case 3:
                j = 3;
                break;
            case 4:
                j = 1;
                break;
        }
        StringBuffer stringBuffer = new StringBuffer((bytes.length + 7 << 3) / 5 + j);
        while (b < bytes.length) {
            j = (bytes[b] >= 0) ? bytes[b] : (bytes[b] + 256);
            if (i > 3) {
                boolean bool;
                if (b + 1 < bytes.length) {
                    bool = (bytes[b + 1] >= 0) ? Boolean.valueOf(bytes[b + 1]) : (bytes[b + 1] + 256);
                } else {
                    bool = false;
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

    public static byte[] decode(String base32) {
        byte[] arrayOfByte = new byte[base32.length() * 5 / 8];
        byte b1;
        int i;
        byte b2;
        for (b1 = 0, i = 0, b2 = 0; b1 < base32.length(); b1++) {
            int j;
            if ((j = base32.charAt(b1) - 48) >= 0 && j < 80)
                if ((j = a[j]) != 255)
                    if (i <= 3) {
                        if ((i = (i + 5) % 8) == 0) {
                            arrayOfByte[b2] = (byte)(arrayOfByte[b2] | j);
                            b2++;
                            if (b2 >= arrayOfByte.length)
                                break;
                        } else {
                            arrayOfByte[b2] = (byte)(arrayOfByte[b2] | j << 8 - i);
                        }
                    } else {
                        i = (i + 5) % 8;
                        arrayOfByte[b2] = (byte)(arrayOfByte[b2] | j >>> i);
                        b2++;
                        if (b2 < arrayOfByte.length) {
                            arrayOfByte[b2] = (byte)(arrayOfByte[b2] | j << 8 - i);
                        } else {
                            break;
                        }
                    }
        }
        return arrayOfByte;
    }
}

