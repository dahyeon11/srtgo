package com.google.android.gms.internal.ads;

import H1.C0534f1;

/* renamed from: com.google.android.gms.internal.ads.cs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2521cs extends AbstractBinderC1651Mr {

    /* renamed from: a, reason: collision with root package name */
    private y1.m f18355a;

    /* renamed from: b, reason: collision with root package name */
    private y1.t f18356b;

    public final void zzb(y1.m mVar) {
        this.f18355a = mVar;
    }

    public final void zzc(y1.t tVar) {
        this.f18356b = tVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1651Mr, com.google.android.gms.internal.ads.InterfaceC1692Nr
    public final void zze() {
        y1.m mVar = this.f18355a;
        if (mVar != null) {
            mVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1651Mr, com.google.android.gms.internal.ads.InterfaceC1692Nr
    public final void zzf() {
        y1.m mVar = this.f18355a;
        if (mVar != null) {
            mVar.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1651Mr, com.google.android.gms.internal.ads.InterfaceC1692Nr
    public final void zzg() {
        y1.m mVar = this.f18355a;
        if (mVar != null) {
            mVar.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1651Mr, com.google.android.gms.internal.ads.InterfaceC1692Nr
    public final void zzh(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1651Mr, com.google.android.gms.internal.ads.InterfaceC1692Nr
    public final void zzi(C0534f1 c0534f1) {
        y1.m mVar = this.f18355a;
        if (mVar != null) {
            mVar.onAdFailedToShowFullScreenContent(c0534f1.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1651Mr, com.google.android.gms.internal.ads.InterfaceC1692Nr
    public final void zzj() {
        y1.m mVar = this.f18355a;
        if (mVar != null) {
            mVar.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1651Mr, com.google.android.gms.internal.ads.InterfaceC1692Nr
    public final void zzk(InterfaceC1406Gr interfaceC1406Gr) {
        y1.t tVar = this.f18356b;
        if (tVar != null) {
            tVar.onUserEarnedReward(new C1979Ur(interfaceC1406Gr));
        }
    }
}
