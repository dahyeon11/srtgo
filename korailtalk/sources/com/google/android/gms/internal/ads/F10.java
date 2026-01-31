package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class F10 {
    public static int zza(int i8, int i9, int i10) {
        if (i8 < 0 || i8 >= i10) {
            throw new IndexOutOfBoundsException();
        }
        return i8;
    }

    public static Object zzb(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static String zzc(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static void zzd(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzf(boolean z8) {
        if (!z8) {
            throw new IllegalStateException();
        }
    }

    public static void zzg(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalStateException((String) obj);
        }
    }
}
