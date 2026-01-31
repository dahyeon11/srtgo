package o2;

import android.util.Base64;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* renamed from: o2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6031c {
    public static byte[] decode(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static byte[] decodeUrlSafe(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @ResultIgnorabilityUnspecified
    public static byte[] decodeUrlSafeNoPadding(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static String encode(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    public static String encodeUrlSafe(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    public static String encodeUrlSafeNoPadding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
