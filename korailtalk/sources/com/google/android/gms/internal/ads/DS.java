package com.google.android.gms.internal.ads;

import y1.AbstractC6524e;
import y1.C6529j;

/* loaded from: classes2.dex */
final class DS extends AbstractC6524e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f12675a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6529j f12676b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f12677c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ KS f12678d;

    DS(KS ks, String str, C6529j c6529j, String str2) {
        this.f12675a = str;
        this.f12676b = c6529j;
        this.f12677c = str2;
        this.f12678d = ks;
    }

    @Override // y1.AbstractC6524e
    public final void onAdFailedToLoad(y1.n nVar) {
        this.f12678d.i(KS.h(nVar), this.f12677c);
    }

    @Override // y1.AbstractC6524e
    public final void onAdLoaded() {
        this.f12678d.e(this.f12675a, this.f12676b, this.f12677c);
    }
}
