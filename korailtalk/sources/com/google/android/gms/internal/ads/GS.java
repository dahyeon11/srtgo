package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class GS extends V1.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13155a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f13156b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ KS f13157c;

    GS(KS ks, String str, String str2) {
        this.f13155a = str;
        this.f13156b = str2;
        this.f13157c = ks;
    }

    @Override // y1.AbstractC6525f
    public final void onAdFailedToLoad(y1.n nVar) {
        this.f13157c.i(KS.h(nVar), this.f13156b);
    }

    @Override // y1.AbstractC6525f
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.f13156b;
        this.f13157c.e(this.f13155a, (V1.a) obj, str);
    }
}
