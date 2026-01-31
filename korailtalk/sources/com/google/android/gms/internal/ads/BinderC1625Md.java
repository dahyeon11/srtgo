package com.google.android.gms.internal.ads;

import H1.C0534f1;

/* renamed from: com.google.android.gms.internal.ads.Md, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC1625Md extends AbstractBinderC1994Vd {

    /* renamed from: a, reason: collision with root package name */
    private y1.m f14670a;

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1994Vd, com.google.android.gms.internal.ads.InterfaceC2035Wd
    public final void zzb() {
        y1.m mVar = this.f14670a;
        if (mVar != null) {
            mVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1994Vd, com.google.android.gms.internal.ads.InterfaceC2035Wd
    public final void zzc() {
        y1.m mVar = this.f14670a;
        if (mVar != null) {
            mVar.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1994Vd, com.google.android.gms.internal.ads.InterfaceC2035Wd
    public final void zzd(C0534f1 c0534f1) {
        y1.m mVar = this.f14670a;
        if (mVar != null) {
            mVar.onAdFailedToShowFullScreenContent(c0534f1.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1994Vd, com.google.android.gms.internal.ads.InterfaceC2035Wd
    public final void zze() {
        y1.m mVar = this.f14670a;
        if (mVar != null) {
            mVar.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1994Vd, com.google.android.gms.internal.ads.InterfaceC2035Wd
    public final void zzf() {
        y1.m mVar = this.f14670a;
        if (mVar != null) {
            mVar.onAdShowedFullScreenContent();
        }
    }

    public final void zzg(y1.m mVar) {
        this.f14670a = mVar;
    }
}
