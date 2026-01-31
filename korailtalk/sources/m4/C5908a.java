package m4;

import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5908a {
    private static byte[] a(Context context) {
        return Arrays.copyOf(UUID.nameUUIDFromBytes(Settings.Secure.getString(context.getContentResolver(), "android_id").getBytes("UTF-8")).toString().getBytes("UTF-8"), 16);
    }

    public static String decryptAES(Context context, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(2, new SecretKeySpec(a(context), "AES"));
            return new String(cipher.doFinal(Base64.decode(str.getBytes("UTF-8"), 0)), "UTF-8");
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static String decryptBase64(String str) {
        return new String(Base64.decode(str, 2));
    }

    public static String encryptAES(Context context, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(a(context), "AES"));
            return new String(Base64.encode(cipher.doFinal(str.getBytes("UTF8")), 0), "UTF-8");
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static String encryptBase64(String str) {
        return Base64.encodeToString(str.getBytes("UTF-8"), 2);
    }
}
