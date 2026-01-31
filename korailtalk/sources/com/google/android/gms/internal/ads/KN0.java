package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class KN0 extends RG {

    /* renamed from: i */
    private static final Object f13791i = new Object();

    /* renamed from: j */
    private static final C3658mp f13792j;

    /* renamed from: d */
    private final long f13793d;

    /* renamed from: e */
    private final long f13794e;

    /* renamed from: f */
    private final boolean f13795f;

    /* renamed from: g */
    private final C3658mp f13796g;

    /* renamed from: h */
    private final C3306jk f13797h;

    static {
        C4881xa c4881xa = new C4881xa();
        c4881xa.zza("SinglePeriodTimeline");
        c4881xa.zzb(Uri.EMPTY);
        f13792j = c4881xa.zzc();
    }

    public KN0(long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z8, boolean z9, boolean z10, Object obj, C3658mp c3658mp, C3306jk c3306jk) {
        this.f13793d = j11;
        this.f13794e = j12;
        this.f13795f = z8;
        c3658mp.getClass();
        this.f13796g = c3658mp;
        this.f13797h = c3306jk;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final int zza(Object obj) {
        return f13791i.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final C3711nF zzd(int i8, C3711nF c3711nF, boolean z8) {
        F10.zza(i8, 0, 1);
        c3711nF.zzl(null, z8 ? f13791i : null, 0, this.f13793d, 0L, OF.zza, false);
        return c3711nF;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final C4055qG zze(int i8, C4055qG c4055qG, long j8) {
        F10.zza(i8, 0, 1);
        Object obj = C4055qG.zza;
        C3658mp c3658mp = this.f13796g;
        long j9 = this.f13794e;
        c4055qG.zza(obj, c3658mp, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f13795f, false, this.f13797h, 0L, j9, 0, 0, 0L);
        return c4055qG;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final Object zzf(int i8) {
        F10.zza(i8, 0, 1);
        return f13791i;
    }
}
