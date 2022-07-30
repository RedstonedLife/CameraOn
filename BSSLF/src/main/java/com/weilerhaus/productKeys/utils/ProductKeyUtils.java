package com.weilerhaus.productKeys.utils;

public class ProductKeyUtils {
	private native String buildHexStr(int expectedLength, long content);

	public static String buildHexString(int exp, long cont) {
		return new ProductKeyUtils().buildHexStr(exp, cont);
	}

	static {
		System.loadLibrary("ProductKeyUtils");
	}
}