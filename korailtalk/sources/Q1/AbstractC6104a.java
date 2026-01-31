package q1;

import android.util.Log;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6104a {
    private static String a(String str) {
        return "TransportRuntime." + str;
    }

    public static void d(String str, String str2) {
        a(str);
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(a(str), str2, th);
    }

    public static void i(String str, String str2) {
        a(str);
    }

    public static void w(String str, String str2, Object obj) {
        Log.w(a(str), String.format(str2, obj));
    }

    public static void d(String str, String str2, Object obj) {
        a(str);
        String.format(str2, obj);
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        a(str);
        String.format(str2, obj, obj2);
    }

    public static void d(String str, String str2, Object... objArr) {
        a(str);
        String.format(str2, objArr);
    }
}
