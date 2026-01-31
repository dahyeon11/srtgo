package com.google.ads.mediation;

import H1.InterfaceC0517a;
import N1.m;
import y1.AbstractC6524e;
import y1.n;

/* loaded from: classes.dex */
final class b extends AbstractC6524e implements z1.e, InterfaceC0517a {

    /* renamed from: a */
    final AbstractAdViewAdapter f11713a;

    /* renamed from: b */
    final m f11714b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, m mVar) {
        this.f11713a = abstractAdViewAdapter;
        this.f11714b = mVar;
    }

    @Override // y1.AbstractC6524e
    public final void onAdClicked() {
        this.f11714b.onAdClicked(this.f11713a);
    }

    @Override // y1.AbstractC6524e
    public final void onAdClosed() {
        this.f11714b.onAdClosed(this.f11713a);
    }

    @Override // y1.AbstractC6524e
    public final void onAdFailedToLoad(n nVar) {
        this.f11714b.onAdFailedToLoad(this.f11713a, nVar);
    }

    @Override // y1.AbstractC6524e
    public final void onAdLoaded() {
        this.f11714b.onAdLoaded(this.f11713a);
    }

    @Override // y1.AbstractC6524e
    public final void onAdOpened() {
        this.f11714b.onAdOpened(this.f11713a);
    }

    @Override // z1.e
    public final void onAppEvent(String str, String str2) {
        this.f11714b.zzb(this.f11713a, str, str2);
    }
}
