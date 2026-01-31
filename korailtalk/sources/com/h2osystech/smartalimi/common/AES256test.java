package com.h2osystech.smartalimi.common;

import android.util.Base64;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class AES256test {
    private static final String AES_ENCRYPTION_ALGORITHM = "AES";
    private static final String CHARACTER_ENCODING = "UTF-8";
    private static final String CIPHER_TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static String ENCRYPT_IV = "E5FC9B8E8E0A9C076EEEFAD860A09C7F";
    private static String ENCRYPT_KEY = "195B614D17BB6C2E166A63BAE60DC49376FE6427D48D1898C3CDDA26B7D055D5";

    private static byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance(CIPHER_TRANSFORMATION);
        cipher.init(2, new SecretKeySpec(bArr2, AES_ENCRYPTION_ALGORITHM), new IvParameterSpec(bArr3));
        return cipher.doFinal(bArr);
    }

    public static String decryptBase64(String str) {
        return new String(decrypt(Base64.decode(str, 0), getKeyBytes(ENCRYPT_KEY), getKeyBytes(ENCRYPT_IV)), "UTF-8");
    }

    private static byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance(CIPHER_TRANSFORMATION);
        cipher.init(1, new SecretKeySpec(bArr2, AES_ENCRYPTION_ALGORITHM), new IvParameterSpec(bArr3));
        return cipher.doFinal(bArr);
    }

    public static String encryptBase64(String str) throws UnsupportedEncodingException {
        return new String(Base64.encode(encrypt(str.getBytes("UTF-8"), getKeyBytes(ENCRYPT_KEY), getKeyBytes(ENCRYPT_IV)), 0));
    }

    private static byte[] getKeyBytes(String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[16];
        byte[] bytes = str.getBytes("UTF-8");
        System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 16));
        return bArr;
    }

    public static void main(String[] strArr) {
        new AES256test();
        try {
            PrintStream printStream = System.out;
            printStream.println("str   ===========>[063-12-34-5678912]");
            String strEncryptBase64 = encryptBase64("063-12-34-5678912");
            printStream.println("encStr===========>[" + strEncryptBase64 + "]");
            printStream.println("decStr===========>[" + decryptBase64(strEncryptBase64) + "]");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
