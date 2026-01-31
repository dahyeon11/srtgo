package com.google.android.gms.internal.ads;

import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.wN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4753wN0 extends AbstractC3726nM0 implements InterfaceC3728nN0 {

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3335jy0 f23486h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC2925gL0 f23487i;

    /* renamed from: j, reason: collision with root package name */
    private final int f23488j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23489k = true;

    /* renamed from: l, reason: collision with root package name */
    private long f23490l = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private boolean f23491m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f23492n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC4279sE0 f23493o;

    /* renamed from: p, reason: collision with root package name */
    private C3658mp f23494p;

    /* renamed from: q, reason: collision with root package name */
    private final C4411tN0 f23495q;

    /* renamed from: r, reason: collision with root package name */
    private final C3163iP0 f23496r;

    /* synthetic */ C4753wN0(C3658mp c3658mp, InterfaceC3335jy0 interfaceC3335jy0, C4411tN0 c4411tN0, InterfaceC2925gL0 interfaceC2925gL0, C3163iP0 c3163iP0, int i8, AbstractC4639vN0 abstractC4639vN0) {
        this.f23494p = c3658mp;
        this.f23486h = interfaceC3335jy0;
        this.f23495q = c4411tN0;
        this.f23487i = interfaceC2925gL0;
        this.f23496r = c3163iP0;
        this.f23488j = i8;
    }

    private final void k() {
        long j8 = this.f23490l;
        boolean z8 = this.f23491m;
        boolean z9 = this.f23492n;
        C3658mp c3658mpZzJ = zzJ();
        KN0 kn0 = new KN0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j8, j8, 0L, 0L, z8, false, false, null, c3658mpZzJ, z9 ? c3658mpZzJ.zzf : null);
        i(this.f23489k ? new C4297sN0(this, kn0) : kn0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0
    protected final void h(InterfaceC4279sE0 interfaceC4279sE0) {
        this.f23493o = interfaceC4279sE0;
        Looper.myLooper().getClass();
        a();
        k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final void zzG(LM0 lm0) {
        ((C4183rN0) lm0).zzN();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final LM0 zzI(NM0 nm0, C2703eP0 c2703eP0, long j8) {
        Ky0 ky0Zza = this.f23486h.zza();
        InterfaceC4279sE0 interfaceC4279sE0 = this.f23493o;
        if (interfaceC4279sE0 != null) {
            ky0Zza.zzf(interfaceC4279sE0);
        }
        C1478Il c1478Il = zzJ().zzd;
        c1478Il.getClass();
        C4411tN0 c4411tN0 = this.f23495q;
        a();
        return new C4183rN0(c1478Il.zzb, ky0Zza, new C3840oM0(c4411tN0.zza), this.f23487i, b(nm0), this.f23496r, d(nm0), this, c2703eP0, null, this.f23488j, AbstractC2281am0.zzr(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final synchronized C3658mp zzJ() {
        return this.f23494p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3728nN0
    public final void zza(long j8, boolean z8, boolean z9) {
        if (j8 == -9223372036854775807L) {
            j8 = this.f23490l;
        }
        if (!this.f23489k && this.f23490l == j8 && this.f23491m == z8 && this.f23492n == z9) {
            return;
        }
        this.f23490l = j8;
        this.f23491m = z8;
        this.f23492n = z9;
        this.f23489k = false;
        k();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0
    protected final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final synchronized void zzt(C3658mp c3658mp) {
        this.f23494p = c3658mp;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final void zzz() {
    }
}
