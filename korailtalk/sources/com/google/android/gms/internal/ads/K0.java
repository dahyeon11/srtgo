package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class K0 {
    public static final K0 zza = new K0(-3, -9223372036854775807L, -1);

    /* renamed from: a, reason: collision with root package name */
    private final int f13719a;

    /* renamed from: b, reason: collision with root package name */
    private final long f13720b;

    /* renamed from: c, reason: collision with root package name */
    private final long f13721c;

    private K0(int i8, long j8, long j9) {
        this.f13719a = i8;
        this.f13720b = j8;
        this.f13721c = j9;
    }

    public static K0 zzd(long j8, long j9) {
        return new K0(-1, j8, j9);
    }

    public static K0 zze(long j8) {
        return new K0(0, -9223372036854775807L, j8);
    }

    public static K0 zzf(long j8, long j9) {
        return new K0(-2, j8, j9);
    }
}
