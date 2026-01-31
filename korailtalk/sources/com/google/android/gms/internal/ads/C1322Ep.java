package com.google.android.gms.internal.ads;

import Q1.f;

/* renamed from: com.google.android.gms.internal.ads.Ep */
/* loaded from: classes2.dex */
public final class C1322Ep {

    /* renamed from: a */
    private Q1.f f12861a;

    public C1322Ep(f.c cVar, f.b bVar) {
    }

    static /* bridge */ /* synthetic */ f.c a(C1322Ep c1322Ep) {
        c1322Ep.getClass();
        return null;
    }

    public final synchronized Q1.f c(InterfaceC4899xj interfaceC4899xj) {
        Q1.f fVar = this.f12861a;
        if (fVar != null) {
            return fVar;
        }
        C1363Fp c1363Fp = new C1363Fp(interfaceC4899xj);
        this.f12861a = c1363Fp;
        return c1363Fp;
    }

    public final InterfaceC1433Hj zza() {
        return null;
    }

    public final InterfaceC1597Lj zzb() {
        return new BinderC1281Dp(this, null);
    }
}
