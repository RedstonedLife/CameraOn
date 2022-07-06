package com.bss.inc.cameraon.licensing.util;

import com.bss.inc.cameraon.logging.Level;
import com.bss.inc.cameraon.logging.Logger;
import org.apache.commons.codec.binary.Hex;

import javax.crypto.*;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class Crypto {
    private static String a = null;
    private static Logger logger;

    static {
        logger = Logger.getLogger(Crypto.class.getName())
    }

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

    private static String a(String paramString1, String paramString2) throws NoSuchAlgorithmException, NoSuchPaddingException,
            InvalidKeySpecException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException,
            InvalidAlgorithmParameterException, UnsupportedEncodingException {
        byte[] arrayOfByte = { -57, 115, 33, -116, 126, -56, -18, -103 };
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(arrayOfByte, 10);
        PBEKeySpec pBEKeySpec = new PBEKeySpec(paramString2.toCharArray());
        SecretKey secretKey = SecretKeyFactory.getInstance(new String(Base32.decode("KBBEKV3JORUE2RBVIFXGIRCFKM"))).generateSecret(pBEKeySpec);
        Cipher cipher;
        (cipher = Cipher.getInstance(new String(Base32.decode("KBBEKV3JORUE2RBVIFXGIRCFKM")))).init(1, secretKey, pBEParameterSpec);
        paramString1 = Hex.encodeHexString(cipher.doFinal(paramString1.getBytes("UTF-8")));
        String str = "";
        if (paramString1.length() > 60) {
            byte b = 0;
            while (b <= paramString1.length() - 60) {
                str = str + paramString1.substring(b, b + 60) + "\n";
                b += 60;
            }
            if (paramString1.length() > b - 60)
                str = str + paramString1.substring(b, paramString1.length()) + "\n";
        } else {
            str = paramString1;
        }
        return str;
    }

    public static String decrypt(String data, String key) throws NoSuchAlgorithmException, InvalidKeySpecException,
            NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException,
            InvalidAlgorithmParameterException {
        a = key + key.substring(key.length() - 4, key.length()) + key.substring(0, 5);
        return b(data, a);
    }

    public static String decrypt(String data) throws NoSuchAlgorithmException, InvalidKeySpecException,
            NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException,
            InvalidAlgorithmParameterException {
        return b(data, "SHA512withRSA");
    }

    private static String b(String paramString1, String paramString2) throws NoSuchAlgorithmException,
            InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException,
            InvalidKeyException, InvalidAlgorithmParameterException {
        paramString1 = paramString1.replace("\r\n", "").replace("\n", "").substring((paramString1 = paramString1.replace("\r\n", "").replace("\n", "")).indexOf(")") + 1, paramString1.length());
        String str = "";
        byte[] arrayOfByte = { -57, 115, 33, -116, 126, -56, -18, -103 };
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(arrayOfByte, 10);
        PBEKeySpec pBEKeySpec = new PBEKeySpec(paramString2.toCharArray());
        SecretKey secretKey = SecretKeyFactory.getInstance(new String(Base32.decode("KBBEKV3JORUE2RBVIFXGIRCFKM"))).generateSecret(pBEKeySpec);
        Cipher cipher;
        (cipher = Cipher.getInstance(new String(Base32.decode("KBBEKV3JORUE2RBVIFXGIRCFKM")))).init(2, secretKey, pBEParameterSpec);
        try {
            str = new String(cipher.doFinal(Hex.decodeHex(paramString1.toCharArray())), "UTF-8");
        } catch (Exception exception) {
            logger.log(logger, Level.ERROR, "Decryption Error. " % exception.getMessage());
        }
        return str;
    }
}
