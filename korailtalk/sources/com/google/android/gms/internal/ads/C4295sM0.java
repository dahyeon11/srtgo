package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.sM0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4295sM0 implements XM0, InterfaceC2466cL0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f22626a;

    /* renamed from: b, reason: collision with root package name */
    private WM0 f22627b;

    /* renamed from: c, reason: collision with root package name */
    private C2352bL0 f22628c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC4523uM0 f22629d;

    public C4295sM0(AbstractC4523uM0 abstractC4523uM0, Object obj) {
        this.f22629d = abstractC4523uM0;
        this.f22627b = abstractC4523uM0.d(null);
        this.f22628c = abstractC4523uM0.b(null);
        this.f22626a = obj;
    }

    private final JM0 a(JM0 jm0, NM0 nm0) {
        AbstractC4523uM0 abstractC4523uM0 = this.f22629d;
        Object obj = this.f22626a;
        long j8 = jm0.zzc;
        abstractC4523uM0.n(obj, j8, nm0);
        AbstractC4523uM0 abstractC4523uM02 = this.f22629d;
        Object obj2 = this.f22626a;
        long j9 = jm0.zzd;
        abstractC4523uM02.n(obj2, j9, nm0);
        return (j8 == jm0.zzc && j9 == jm0.zzd) ? jm0 : new JM0(1, jm0.zza, jm0.zzb, 0, null, j8, j9);
    }

    private final boolean b(int i8, NM0 nm0) {
        NM0 nm0O;
        if (nm0 != null) {
            nm0O = this.f22629d.o(this.f22626a, nm0);
            if (nm0O == null) {
                return false;
            }
        } else {
            nm0O = null;
        }
        this.f22629d.m(this.f22626a, 0);
        WM0 wm0 = this.f22627b;
        int i9 = wm0.zza;
        if (!AbstractC2281am0.zzG(wm0.zzb, nm0O)) {
            this.f22627b = this.f22629d.e(0, nm0O);
        }
        C2352bL0 c2352bL0 = this.f22628c;
        int i10 = c2352bL0.zza;
        if (AbstractC2281am0.zzG(c2352bL0.zzb, nm0O)) {
            return true;
        }
        this.f22628c = this.f22629d.c(0, nm0O);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.XM0
    public final void zzae(int i8, NM0 nm0, JM0 jm0) {
        if (b(0, nm0)) {
            this.f22627b.zzc(a(jm0, nm0));
        }
    }

    @Override // com.google.android.gms.internal.ads.XM0
    public final void zzaf(int i8, NM0 nm0, EM0 em0, JM0 jm0) {
        if (b(0, nm0)) {
            this.f22627b.zzd(em0, a(jm0, nm0));
        }
    }

    @Override // com.google.android.gms.internal.ads.XM0
    public final void zzag(int i8, NM0 nm0, EM0 em0, JM0 jm0) {
        if (b(0, nm0)) {
            this.f22627b.zze(em0, a(jm0, nm0));
        }
    }

    @Override // com.google.android.gms.internal.ads.XM0
    public final void zzah(int i8, NM0 nm0, EM0 em0, JM0 jm0, IOException iOException, boolean z8) {
        if (b(0, nm0)) {
            this.f22627b.zzf(em0, a(jm0, nm0), iOException, z8);
        }
    }

    @Override // com.google.android.gms.internal.ads.XM0
    public final void zzai(int i8, NM0 nm0, EM0 em0, JM0 jm0) {
        if (b(0, nm0)) {
            this.f22627b.zzg(em0, a(jm0, nm0));
        }
    }
}
