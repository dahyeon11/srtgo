package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class LG0 implements InterfaceC2800fG0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3002h20 f14270a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14271b;

    /* renamed from: c, reason: collision with root package name */
    private long f14272c;

    /* renamed from: d, reason: collision with root package name */
    private long f14273d;

    /* renamed from: e, reason: collision with root package name */
    private C2149Yx f14274e = C2149Yx.zza;

    public LG0(InterfaceC3002h20 interfaceC3002h20) {
        this.f14270a = interfaceC3002h20;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2800fG0
    public final long zza() {
        long j8 = this.f14272c;
        if (!this.f14271b) {
            return j8;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f14273d;
        C2149Yx c2149Yx = this.f14274e;
        return j8 + (c2149Yx.zzc == 1.0f ? AbstractC2281am0.zzr(jElapsedRealtime) : c2149Yx.zza(jElapsedRealtime));
    }

    public final void zzb(long j8) {
        this.f14272c = j8;
        if (this.f14271b) {
            this.f14273d = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2800fG0
    public final C2149Yx zzc() {
        return this.f14274e;
    }

    public final void zzd() {
        if (this.f14271b) {
            return;
        }
        this.f14273d = SystemClock.elapsedRealtime();
        this.f14271b = true;
    }

    public final void zze() {
        if (this.f14271b) {
            zzb(zza());
            this.f14271b = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2800fG0
    public final void zzg(C2149Yx c2149Yx) {
        if (this.f14271b) {
            zzb(zza());
        }
        this.f14274e = c2149Yx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2800fG0
    public final /* synthetic */ boolean zzj() {
        throw null;
    }
}
