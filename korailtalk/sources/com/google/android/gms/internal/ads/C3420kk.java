package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kk */
/* loaded from: classes2.dex */
public final class C3420kk {

    /* renamed from: a */
    private final B1.n f20457a;

    /* renamed from: b */
    private final B1.m f20458b;

    /* renamed from: c */
    private C5013yj f20459c;

    public C3420kk(B1.n nVar, B1.m mVar) {
        this.f20457a = nVar;
        this.f20458b = mVar;
    }

    public final synchronized C5013yj d(InterfaceC4899xj interfaceC4899xj) {
        C5013yj c5013yj = this.f20459c;
        if (c5013yj != null) {
            return c5013yj;
        }
        C5013yj c5013yj2 = new C5013yj(interfaceC4899xj);
        this.f20459c = c5013yj2;
        return c5013yj2;
    }

    public final InterfaceC1433Hj zzc() {
        if (this.f20458b == null) {
            return null;
        }
        return new BinderC2964gk(this, null);
    }

    public final InterfaceC1597Lj zzd() {
        return new BinderC3193ik(this, null);
    }
}
