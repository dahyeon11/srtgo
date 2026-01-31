package com.google.android.gms.internal.ads;

import y1.AbstractC6524e;

/* loaded from: classes2.dex */
final class HS extends AbstractC6524e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13322a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ KS f13323b;

    HS(KS ks, String str) {
        this.f13322a = str;
        this.f13323b = ks;
    }

    @Override // y1.AbstractC6524e
    public final void onAdFailedToLoad(y1.n nVar) {
        this.f13323b.i(KS.h(nVar), this.f13322a);
    }
}
