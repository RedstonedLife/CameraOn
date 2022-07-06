package com.bss.inc.cameraon.licensing.util;

public class Hex {
    private static final char[] a = new char[] {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f' };

    public static byte[] decodeHex(char[] data) {
        int i;
        byte[] arrayOfByte = new byte[(i = data.length) >> 1];
        for (byte b1 = 0, b2 = 0; b2 < i; b1++) {
            int j = toDigit(data[b2], b2) << 4;
            b2++;
            j |= toDigit(data[b2], b2);
            b2++;
            arrayOfByte[b1] = (byte)j;
        }
        return arrayOfByte;
    }

    public static String encodeHexString(byte[] data) {
        int i;
        char[] arrayOfChar = new char[(i = data.length) << 1];
        for (byte b1 = 0, b2 = 0; b1 < i; b1++) {
            arrayOfChar[b2++] = a[(0xF0 & data[b1]) >>> 4];
            arrayOfChar[b2++] = a[0xF & data[b1]];
        }
        return new String(arrayOfChar);
    }

    protected static int toDigit(char ch, int index) {
        return Character.digit(ch, 16);
    }
}

