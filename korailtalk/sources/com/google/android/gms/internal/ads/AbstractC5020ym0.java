package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ym0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5020ym0 {
    public static char zza(long j8) {
        char c9 = (char) j8;
        AbstractC1188Bj0.zzg(((long) c9) == j8, "Out of range: %s", j8);
        return c9;
    }

    public static char zzb(byte b9, byte b10) {
        return (char) ((b9 << 8) | (b10 & 255));
    }
}
