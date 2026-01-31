package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: com.google.android.gms.internal.ads.fc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2834fc0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f19216a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1295Eb0 f19217b = InterfaceC1295Eb0.zza;

    public static String zza(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f19216a) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace(Q7.X.LF, "\n  ") + Q7.X.LF;
    }

    public static void zzb(String str, String str2) {
        synchronized (f19216a) {
            zza(str2, null);
        }
    }

    public static void zzc(String str, String str2) {
        synchronized (f19216a) {
            Log.e(str, zza(str2, null));
        }
    }

    public static void zzd(String str, String str2, Throwable th) {
        synchronized (f19216a) {
            Log.e(str, zza(str2, th));
        }
    }

    public static void zze(String str, String str2) {
        synchronized (f19216a) {
            zza(str2, null);
        }
    }

    public static void zzf(String str, String str2) {
        synchronized (f19216a) {
            Log.w(str, zza(str2, null));
        }
    }

    public static void zzg(String str, String str2, Throwable th) {
        synchronized (f19216a) {
            Log.w(str, zza(str2, th));
        }
    }
}
