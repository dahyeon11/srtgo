package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.ads.ch, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2499ch {
    private static int a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return 0;
        }
        try {
            return sharedPreferences.getInt(str, 0);
        } catch (ClassCastException unused) {
            return 0;
        }
    }

    private static void b(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt(str, a(context, str) + 1).commit();
    }

    public static int zza(Context context) {
        return a(context, "crash_without_write");
    }

    public static int zzb(Context context) {
        return a(context, "init_without_write");
    }

    public static void zzc(Context context) {
        b(context, "crash_without_write");
    }

    public static void zzd(Context context) {
        b(context, "init_without_write");
    }

    public static void zze(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }
}
