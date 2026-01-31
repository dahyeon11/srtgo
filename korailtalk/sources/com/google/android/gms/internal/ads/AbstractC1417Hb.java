package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;
import e3.AbstractC5358c;

/* renamed from: com.google.android.gms.internal.ads.Hb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1417Hb {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f13329a = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zza = 0;

    public static long zza(double d9, int i8, DisplayMetrics displayMetrics) {
        return Math.round(d9 / displayMetrics.density);
    }

    public static String zzb(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            byte b9 = bArr[i8];
            char[] cArr2 = f13329a;
            int i9 = i8 + i8;
            cArr[i9] = cArr2[(b9 & 255) >>> 4];
            cArr[i9 + 1] = cArr2[b9 & AbstractC5358c.SI];
        }
        return new String(cArr);
    }

    public static boolean zzc() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean zzd(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean zze(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static byte[] zzf(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i8 = 0; i8 < length; i8 += 2) {
            bArr[i8 / 2] = (byte) ((Character.digit(str.charAt(i8), 16) << 4) + Character.digit(str.charAt(i8 + 1), 16));
        }
        return bArr;
    }
}
