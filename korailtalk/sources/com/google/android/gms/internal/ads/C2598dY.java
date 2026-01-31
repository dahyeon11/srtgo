package com.google.android.gms.internal.ads;

import H1.C0534f1;

/* renamed from: com.google.android.gms.internal.ads.dY, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2598dY implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2712eY f18633a;

    C2598dY(C2712eY c2712eY) {
        this.f18633a = c2712eY;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        C0534f1 c0534f1Zza = this.f18633a.f18774a.zzd().zza(th);
        this.f18633a.f18777d.zzdB(c0534f1Zza);
        AbstractC3973pb0.zzb(c0534f1Zza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* synthetic */ void zzb(Object obj) {
        ((MB) obj).zzj();
    }
}
