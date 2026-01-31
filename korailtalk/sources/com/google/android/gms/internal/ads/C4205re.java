package com.google.android.gms.internal.ads;

import f2.C5392b;
import i2.AbstractC5670c;

/* renamed from: com.google.android.gms.internal.ads.re, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4205re implements AbstractC5670c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1203Bt f22496a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4319se f22497b;

    C4205re(C4319se c4319se, C1203Bt c1203Bt) {
        this.f22496a = c1203Bt;
        this.f22497b = c4319se;
    }

    @Override // i2.AbstractC5670c.b
    public final void onConnectionFailed(C5392b c5392b) {
        synchronized (this.f22497b.f22677d) {
            this.f22496a.zzd(new RuntimeException("Connection failed."));
        }
    }
}
