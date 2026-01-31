package com.google.ads.mediation;

import N1.s;
import y1.m;

/* loaded from: classes.dex */
final class d extends m {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f11717a;

    /* renamed from: b, reason: collision with root package name */
    final s f11718b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, s sVar) {
        this.f11717a = abstractAdViewAdapter;
        this.f11718b = sVar;
    }

    @Override // y1.m
    public final void onAdDismissedFullScreenContent() {
        this.f11718b.onAdClosed(this.f11717a);
    }

    @Override // y1.m
    public final void onAdShowedFullScreenContent() {
        this.f11718b.onAdOpened(this.f11717a);
    }
}
