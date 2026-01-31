package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class ES extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f12808a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f12809b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ KS f12810c;

    ES(KS ks, String str, String str2) {
        this.f12808a = str;
        this.f12809b = str2;
        this.f12810c = ks;
    }

    @Override // y1.AbstractC6525f
    public final void onAdFailedToLoad(y1.n nVar) {
        this.f12810c.i(KS.h(nVar), this.f12809b);
    }

    @Override // y1.AbstractC6525f
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.f12809b;
        this.f12810c.e(this.f12808a, (M1.a) obj, str);
    }
}
