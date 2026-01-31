package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.j8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3241j8 {
    public static final String zza = "Volley";
    public static final boolean zzb = Log.isLoggable("Volley", 2);

    /* renamed from: a, reason: collision with root package name */
    private static final String f20199a = C3241j8.class.getName();

    private static String a(String str, Object... objArr) {
        String str2;
        String str3 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i8 = 2;
        while (true) {
            if (i8 >= stackTrace.length) {
                str2 = androidx.camera.core.r.IMPLEMENTATION_TYPE_UNKNOWN;
                break;
            }
            if (!stackTrace[i8].getClassName().equals(f20199a)) {
                String className = stackTrace[i8].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i8].getMethodName();
                break;
            }
            i8++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str3);
    }

    public static void zza(String str, Object... objArr) {
        a(str, objArr);
    }

    public static void zzb(String str, Object... objArr) {
        Log.e(zza, a(str, objArr));
    }

    public static void zzc(Throwable th, String str, Object... objArr) {
        Log.e(zza, a(str, objArr), th);
    }

    public static void zzd(String str, Object... objArr) {
        if (zzb) {
            a(str, objArr);
        }
    }
}
