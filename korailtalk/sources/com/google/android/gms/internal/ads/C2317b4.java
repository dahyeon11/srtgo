package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2317b4 {
    public final int zzd;

    public C2317b4(int i8) {
        this.zzd = i8;
    }

    public static int zze(int i8) {
        return (i8 >> 24) & 255;
    }

    public static String zzf(int i8) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i8 >> 24) & 255));
        sb.append((char) ((i8 >> 16) & 255));
        sb.append((char) ((i8 >> 8) & 255));
        sb.append((char) (i8 & 255));
        return sb.toString();
    }

    public String toString() {
        return zzf(this.zzd);
    }
}
