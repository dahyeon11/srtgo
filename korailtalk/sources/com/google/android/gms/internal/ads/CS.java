package com.google.android.gms.internal.ads;

import A1.a;

/* loaded from: classes2.dex */
final class CS extends a.AbstractC0004a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f12525a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f12526b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ KS f12527c;

    CS(KS ks, String str, String str2) {
        this.f12525a = str;
        this.f12526b = str2;
        this.f12527c = ks;
    }

    @Override // y1.AbstractC6525f
    public final void onAdFailedToLoad(y1.n nVar) {
        this.f12527c.i(KS.h(nVar), this.f12526b);
    }

    @Override // y1.AbstractC6525f
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.f12526b;
        this.f12527c.e(this.f12525a, (A1.a) obj, str);
    }
}
