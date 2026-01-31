package com.google.ads.mediation;

import N1.s;
import y1.n;

/* loaded from: classes.dex */
final class c extends M1.b {

    /* renamed from: a */
    final AbstractAdViewAdapter f11715a;

    /* renamed from: b */
    final s f11716b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, s sVar) {
        this.f11715a = abstractAdViewAdapter;
        this.f11716b = sVar;
    }

    @Override // y1.AbstractC6525f
    public final void onAdFailedToLoad(n nVar) {
        this.f11716b.onAdFailedToLoad(this.f11715a, nVar);
    }

    @Override // y1.AbstractC6525f
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.f11715a;
        M1.a aVar = (M1.a) obj;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        aVar.setFullScreenContentCallback(new d(abstractAdViewAdapter, this.f11716b));
        this.f11716b.onAdLoaded(this.f11715a);
    }
}
