package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class FS extends U1.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13027a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f13028b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ KS f13029c;

    FS(KS ks, String str, String str2) {
        this.f13027a = str;
        this.f13028b = str2;
        this.f13029c = ks;
    }

    @Override // y1.AbstractC6525f
    public final void onAdFailedToLoad(y1.n nVar) {
        this.f13029c.i(KS.h(nVar), this.f13028b);
    }

    @Override // y1.AbstractC6525f
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.f13028b;
        this.f13029c.e(this.f13027a, (U1.c) obj, str);
    }
}
