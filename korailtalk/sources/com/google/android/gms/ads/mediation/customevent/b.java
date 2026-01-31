package com.google.android.gms.ads.mediation.customevent;

import L1.n;
import N1.s;
import y1.C6521b;

/* loaded from: classes.dex */
final class b implements O1.c {

    /* renamed from: a, reason: collision with root package name */
    private final CustomEventAdapter f11755a;

    /* renamed from: b, reason: collision with root package name */
    private final s f11756b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CustomEventAdapter f11757c;

    public b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, s sVar) {
        this.f11757c = customEventAdapter;
        this.f11755a = customEventAdapter2;
        this.f11756b = sVar;
    }

    @Override // O1.c, O1.d
    public final void onAdClicked() {
        n.zze("Custom event adapter called onAdClicked.");
        this.f11756b.onAdClicked(this.f11755a);
    }

    @Override // O1.c, O1.d
    public final void onAdClosed() {
        n.zze("Custom event adapter called onAdClosed.");
        this.f11756b.onAdClosed(this.f11755a);
    }

    @Override // O1.c, O1.d
    public final void onAdFailedToLoad(int i8) {
        n.zze("Custom event adapter called onFailedToReceiveAd.");
        this.f11756b.onAdFailedToLoad(this.f11755a, i8);
    }

    @Override // O1.c, O1.d
    public final void onAdLeftApplication() {
        n.zze("Custom event adapter called onAdLeftApplication.");
        this.f11756b.onAdLeftApplication(this.f11755a);
    }

    @Override // O1.c
    public final void onAdLoaded() {
        n.zze("Custom event adapter called onReceivedAd.");
        this.f11756b.onAdLoaded(this.f11757c);
    }

    @Override // O1.c, O1.d
    public final void onAdOpened() {
        n.zze("Custom event adapter called onAdOpened.");
        this.f11756b.onAdOpened(this.f11755a);
    }

    @Override // O1.c, O1.d
    public final void onAdFailedToLoad(C6521b c6521b) {
        n.zze("Custom event adapter called onFailedToReceiveAd.");
        this.f11756b.onAdFailedToLoad(this.f11755a, c6521b);
    }
}
