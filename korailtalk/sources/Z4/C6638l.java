package z4;

import android.util.Base64;
import com.korail.talk.network.BaseRequest;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: z4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6638l {
    public static String encryptAES(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String strSubstring = str.substring(0, 16);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(strSubstring.getBytes()));
        return new String(Base64.encode(cipher.doFinal(str2.getBytes("UTF-8")), 0), "UTF-8");
    }

    public static String getSid() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            return encryptAES("2485dd54d9deaa36", BaseRequest.ANDROID + ("" + new Date().getTime()));
        } catch (Exception e8) {
            t.e(e8.getMessage());
            return "";
        }
    }
}
