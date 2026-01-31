package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class UN0 extends AbstractC4523uM0 {

    /* renamed from: k */
    protected final PM0 f16656k;

    protected UN0(PM0 pm0) {
        this.f16656k = pm0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0, com.google.android.gms.internal.ads.AbstractC3726nM0
    protected final void h(InterfaceC4279sE0 interfaceC4279sE0) {
        super.h(interfaceC4279sE0);
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0
    protected final /* synthetic */ void k(Object obj, PM0 pm0, RG rg) {
        q(rg);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0
    protected final /* bridge */ /* synthetic */ int m(Object obj, int i8) {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0
    protected final /* synthetic */ long n(Object obj, long j8, NM0 nm0) {
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0
    protected final /* synthetic */ NM0 o(Object obj, NM0 nm0) {
        return p(nm0);
    }

    protected abstract NM0 p(NM0 nm0);

    protected abstract void q(RG rg);

    protected abstract void zzF();

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0, com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public void zzG(LM0 lm0) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0, com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public LM0 zzI(NM0 nm0, C2703eP0 c2703eP0, long j8) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0, com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final C3658mp zzJ() {
        return this.f16656k.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final RG zzM() {
        this.f16656k.zzM();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final boolean zzv() {
        this.f16656k.zzv();
        return true;
    }
}
