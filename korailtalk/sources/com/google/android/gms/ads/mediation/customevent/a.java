package com.google.android.gms.ads.mediation.customevent;

import L1.n;
import N1.m;
import android.view.View;
import y1.C6521b;

/* loaded from: classes.dex */
final class a implements O1.b {

    /* renamed from: a, reason: collision with root package name */
    private final CustomEventAdapter f11753a;

    /* renamed from: b, reason: collision with root package name */
    private final m f11754b;

    public a(CustomEventAdapter customEventAdapter, m mVar) {
        this.f11753a = customEventAdapter;
        this.f11754b = mVar;
    }

    @Override // O1.b, O1.d
    public final void onAdClicked() {
        n.zze("Custom event adapter called onAdClicked.");
        this.f11754b.onAdClicked(this.f11753a);
    }

    @Override // O1.b, O1.d
    public final void onAdClosed() {
        n.zze("Custom event adapter called onAdClosed.");
        this.f11754b.onAdClosed(this.f11753a);
    }

    @Override // O1.b, O1.d
    public final void onAdFailedToLoad(int i8) {
        n.zze("Custom event adapter called onAdFailedToLoad.");
        this.f11754b.onAdFailedToLoad(this.f11753a, i8);
    }

    @Override // O1.b, O1.d
    public final void onAdLeftApplication() {
        n.zze("Custom event adapter called onAdLeftApplication.");
        this.f11754b.onAdLeftApplication(this.f11753a);
    }

    @Override // O1.b
    public final void onAdLoaded(View view) {
        n.zze("Custom event adapter called onAdLoaded.");
        this.f11753a.f11749a = view;
        this.f11754b.onAdLoaded(this.f11753a);
    }

    @Override // O1.b, O1.d
    public final void onAdOpened() {
        n.zze("Custom event adapter called onAdOpened.");
        this.f11754b.onAdOpened(this.f11753a);
    }

    @Override // O1.b, O1.d
    public final void onAdFailedToLoad(C6521b c6521b) {
        n.zze("Custom event adapter called onAdFailedToLoad.");
        this.f11754b.onAdFailedToLoad(this.f11753a, c6521b);
    }
}
