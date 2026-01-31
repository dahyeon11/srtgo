package ai.maum.m2u.cdk.utils;

import Q7.X;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes.dex */
public class StringUtil {
    private static final String TAG = "StringUtil";

    private StringUtil() {
    }

    public static boolean isBlank(String str) {
        String strNullToBlankTrim = nullToBlankTrim(str);
        strNullToBlankTrim.replaceAll(X.CR, "");
        strNullToBlankTrim.replaceAll(X.LF, "");
        strNullToBlankTrim.replaceAll("&nbsp;", "");
        return strNullToBlankTrim.equals("");
    }

    public static boolean isEmpty(String str) {
        return "".equals(str) || str == null;
    }

    public static String nullToBlank(String str) {
        return (str == null || str.equals("null")) ? "" : str;
    }

    public static String nullToBlankTrim(String str) {
        return nullToBlank(str).trim();
    }

    public static byte[] toByteArray(Object obj) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
            objectOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            LogUtil.e(TAG, "toByteArray : ", e8);
            return null;
        }
    }

    public static Object toObject(byte[] bArr) throws Throwable {
        try {
            return new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
        } catch (IOException e8) {
            LogUtil.e(TAG, e8.getMessage());
            return null;
        } catch (ClassNotFoundException e9) {
            LogUtil.e(TAG, e9.getMessage());
            return null;
        }
    }
}
