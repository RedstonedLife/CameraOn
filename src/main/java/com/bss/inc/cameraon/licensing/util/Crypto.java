package com.bss.inc.cameraon.licensing.util;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class Crypto {
    private static String a = null;

    public static String encrypt(String data) throws NoSuchAlgorithmException, NoSuchPaddingException,
            InvalidKeySpecException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException,
            InvalidAlgorithmParameterException, UnsupportedEncodingException {
        return a(data, "SHA512withRSA");
    }

    public static String encrypt(String data, String key) throws NoSuchAlgorithmException, NoSuchPaddingException,
            InvalidKeySpecException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException,
            InvalidAlgorithmParameterException, UnsupportedEncodingException {
        a = key + key.substring(key.length() - 4, key.length()) + key.substring(0, 5);
        return a(data, a);
    }

    
}
