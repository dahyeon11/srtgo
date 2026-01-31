package com.google.android.gms.internal.ads;

import Q1.c;

/* renamed from: com.google.android.gms.internal.ads.Gp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC1404Gp extends AbstractBinderC1842Rj {

    /* renamed from: a, reason: collision with root package name */
    private final c.InterfaceC0068c f13201a;

    public BinderC1404Gp(c.InterfaceC0068c interfaceC0068c) {
        this.f13201a = interfaceC0068c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1842Rj, com.google.android.gms.internal.ads.InterfaceC1883Sj
    public final void zze(InterfaceC2391bk interfaceC2391bk) {
        this.f13201a.onNativeAdLoaded(new C1199Bp(interfaceC2391bk));
    }
}
