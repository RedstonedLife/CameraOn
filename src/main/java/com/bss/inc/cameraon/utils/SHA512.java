package com.bss.inc.cameraon.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA512 {
    public static String getSecureSHA(final String string, final byte[] salt) {
        String temp = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
