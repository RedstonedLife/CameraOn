package com.bss.inc.cameraon.utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SHA512 {
    public static String getSecureSHA(final String string, final byte[] salt) {
        String temp = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt);
            byte[] bytes = md.digest(string.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            temp = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return temp;
    }

    public static byte[] getSalt() throws NoSuchAlgorithmException {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return salt;
    }
}
