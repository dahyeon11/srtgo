package com.google.android.gms.ads.mediation.customevent;

import L1.n;
import N1.D;
import N1.v;
import O1.e;
import y1.C6521b;

/* loaded from: classes.dex */
final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private final CustomEventAdapter f11758a;

    /* renamed from: b, reason: collision with root package name */
    private final v f11759b;

    public c(CustomEventAdapter customEventAdapter, v vVar) {
        this.f11758a = customEventAdapter;
        this.f11759b = vVar;
    }

    @Override // O1.e, O1.d
    public final void onAdClicked() {
        n.zze("Custom event adapter called onAdClicked.");
        this.f11759b.onAdClicked(this.f11758a);
    }

    @Override // O1.e, O1.d
    public final void onAdClosed() {
        n.zze("Custom event adapter called onAdClosed.");
        this.f11759b.onAdClosed(this.f11758a);
    }

    @Override // O1.e, O1.d
    public final void onAdFailedToLoad(int i8) {
        n.zze("Custom event adapter called onAdFailedToLoad.");
        this.f11759b.onAdFailedToLoad(this.f11758a, i8);
    }

    @Override // O1.e
    public final void onAdImpression() {
        n.zze("Custom event adapter called onAdImpression.");
        this.f11759b.onAdImpression(this.f11758a);
    }

    @Override // O1.e, O1.d
    public final void onAdLeftApplication() {
        n.zze("Custom event adapter called onAdLeftApplication.");
        this.f11759b.onAdLeftApplication(this.f11758a);
    }

    @Override // O1.e
    public final void onAdLoaded(D d9) {
        n.zze("Custom event adapter called onAdLoaded.");
        this.f11759b.onAdLoaded(this.f11758a, d9);
    }

    @Override // O1.e, O1.d
    public final void onAdOpened() {
        n.zze("Custom event adapter called onAdOpened.");
        this.f11759b.onAdOpened(this.f11758a);
    }

    @Override // O1.e, O1.d
    public final void onAdFailedToLoad(C6521b c6521b) {
        n.zze("Custom event adapter called onAdFailedToLoad.");
        this.f11759b.onAdFailedToLoad(this.f11758a, c6521b);
    }
}
