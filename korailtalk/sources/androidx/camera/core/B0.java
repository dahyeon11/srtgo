package androidx.camera.core;

import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class B0 {

    /* renamed from: a, reason: collision with root package name */
    private static int f7381a = 3;

    private static boolean a(String str, int i8) {
        return f7381a <= i8 || Log.isLoggable(str, i8);
    }

    static void b() {
        f7381a = 3;
    }

    static void c(int i8) {
        f7381a = i8;
    }

    public static void d(String str, String str2) {
        a(f(str), 3);
    }

    public static void e(String str, String str2) {
        String strF = f(str);
        if (a(strF, 6)) {
            Log.e(strF, str2);
        }
    }

    private static String f(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void i(String str, String str2) {
        a(f(str), 4);
    }

    public static boolean isDebugEnabled(String str) {
        return a(f(str), 3);
    }

    public static boolean isErrorEnabled(String str) {
        return a(f(str), 6);
    }

    public static boolean isInfoEnabled(String str) {
        return a(f(str), 4);
    }

    public static boolean isWarnEnabled(String str) {
        return a(f(str), 5);
    }

    public static void w(String str, String str2) {
        String strF = f(str);
        if (a(strF, 5)) {
            Log.w(strF, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        a(f(str), 3);
    }

    public static void i(String str, String str2, Throwable th) {
        a(f(str), 4);
    }

    public static void e(String str, String str2, Throwable th) {
        String strF = f(str);
        if (a(strF, 6)) {
            Log.e(strF, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        String strF = f(str);
        if (a(strF, 5)) {
            Log.w(strF, str2, th);
        }
    }
}
