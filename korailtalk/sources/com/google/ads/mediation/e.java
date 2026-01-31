package com.google.ads.mediation;

import B1.h;
import B1.m;
import B1.n;
import B1.p;
import N1.v;
import com.google.android.gms.internal.ads.C5013yj;
import y1.AbstractC6524e;

/* loaded from: classes.dex */
final class e extends AbstractC6524e implements p, n, m {

    /* renamed from: a */
    final AbstractAdViewAdapter f11719a;

    /* renamed from: b */
    final v f11720b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, v vVar) {
        this.f11719a = abstractAdViewAdapter;
        this.f11720b = vVar;
    }

    @Override // y1.AbstractC6524e
    public final void onAdClicked() {
        this.f11720b.onAdClicked(this.f11719a);
    }

    @Override // y1.AbstractC6524e
    public final void onAdClosed() {
        this.f11720b.onAdClosed(this.f11719a);
    }

    @Override // y1.AbstractC6524e
    public final void onAdFailedToLoad(y1.n nVar) {
        this.f11720b.onAdFailedToLoad(this.f11719a, nVar);
    }

    @Override // y1.AbstractC6524e
    public final void onAdImpression() {
        this.f11720b.onAdImpression(this.f11719a);
    }

    @Override // y1.AbstractC6524e
    public final void onAdLoaded() {
    }

    @Override // y1.AbstractC6524e
    public final void onAdOpened() {
        this.f11720b.onAdOpened(this.f11719a);
    }

    @Override // B1.p
    public final void zza(h hVar) {
        this.f11720b.onAdLoaded(this.f11719a, new a(hVar));
    }

    @Override // B1.m
    public final void zzb(C5013yj c5013yj, String str) {
        this.f11720b.zze(this.f11719a, c5013yj, str);
    }

    @Override // B1.n
    public final void zzc(C5013yj c5013yj) {
        this.f11720b.zzd(this.f11719a, c5013yj);
    }
}
