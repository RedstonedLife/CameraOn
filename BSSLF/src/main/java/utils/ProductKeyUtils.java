package utils;

public class ProductKeyUtils {
    public static native String buildHexStr(final int expectedLength, final long content);

    static {
        System.loadLibrary("ProductKeyUtils");
    }
}
