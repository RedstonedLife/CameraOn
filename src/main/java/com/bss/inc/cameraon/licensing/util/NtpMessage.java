package com.bss.inc.cameraon.licensing.util;

public class NtpMessage {
    private byte a = 0;

    private byte b = 3;

    private byte c = 0;

    private short d = 0;

    private byte e = 0;

    private byte f = 0;

    private double g = 0.0D;

    private double h = 0.0D;

    private final byte[] i = new byte[] { 0, 0, 0, 0 };

    private double j = 0.0D;

    private double k = 0.0D;

    public double receiveTimestamp = 0.0D;

    private double l = 0.0D;

    public NtpMessage(byte[] array) {
        this.a = (byte)(array[0] >> 6 & 0x3);
        this.b = (byte)(array[0] >> 3 & 0x7);
        this.c = (byte)(array[0] & 0x7);
        this.d = a(array[1]);
        this.e = array[2];
        this.f = array[3];
        this.g = array[4] * 256.0D + a(array[5]) + a(array[6]) / 256.0D + a(array[7]) / 65536.0D;
        this.h = a(array[8]) * 256.0D + a(array[9]) + a(array[10]) / 256.0D + a(array[11]) / 65536.0D;
        this.i[0] = array[12];
        this.i[1] = array[13];
        this.i[2] = array[14];
        this.i[3] = array[15];
        this.j = a(array, 16);
        this.k = a(array, 24);
        this.receiveTimestamp = a(array, 32);
        this.l = a(array, 40);
    }

    public NtpMessage() {
        this.c = 3;
        this.l = System.currentTimeMillis() / 1000.0D + 2.2089888E9D;
    }

    public byte[] toByteArray() {
        byte[] arrayOfByte;
        (arrayOfByte = new byte[48])[0] = (byte)(this.a << 6 | this.b << 3 | this.c);
        arrayOfByte[1] = (byte)this.d;
        arrayOfByte[2] = this.e;
        arrayOfByte[3] = this.f;
        int i = (int)(this.g * 65536.0D);
        arrayOfByte[4] = i >> 24;
        arrayOfByte[5] = (byte)(i >> 16);
        arrayOfByte[6] = (byte)(i >> 8);
        arrayOfByte[7] = (byte)i;
        long l = (long)(this.h * 65536.0D);
        arrayOfByte[8] = (byte)(int)(l >> 24L & 0xFFL);
        arrayOfByte[9] = (byte)(int)(l >> 16L & 0xFFL);
        arrayOfByte[10] = (byte)(int)(l >> 8L & 0xFFL);
        arrayOfByte[11] = (byte)(int)(l & 0xFFL);
        arrayOfByte[12] = this.i[0];
        arrayOfByte[13] = this.i[1];
        arrayOfByte[14] = this.i[2];
        arrayOfByte[15] = this.i[3];
        encodeTimestamp(arrayOfByte, 16, this.j);
        encodeTimestamp(arrayOfByte, 24, this.k);
        encodeTimestamp(arrayOfByte, 32, this.receiveTimestamp);
        encodeTimestamp(arrayOfByte, 40, this.l);
        return arrayOfByte;
    }

    private static short a(byte paramByte) {
        if ((paramByte & 0x80) == 128)
            return (short)(128 + (paramByte & Byte.MAX_VALUE));
        return (short)paramByte;
    }

    private static double a(byte[] paramArrayOfbyte, int paramInt) {
        double d = 0.0D;
        for (byte b = 0; b < 8; b++)
            d += a(paramArrayOfbyte[paramInt + b]) * Math.pow(2.0D, (3 - b << 3));
        return d;
    }

    public static void encodeTimestamp(byte[] array, int pointer, double timestamp) {
        for (byte b = 0; b < 8; b++) {
            double d = Math.pow(2.0D, (3 - b << 3));
            array[pointer + b] = (byte)(int)(timestamp / d);
            timestamp -= a(array[pointer + b]) * d;
        }
        array[7] = (byte)(int)(Math.random() * 255.0D);
    }
}
