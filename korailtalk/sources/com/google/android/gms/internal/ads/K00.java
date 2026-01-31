package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class K00 extends H1.O {

    /* renamed from: a, reason: collision with root package name */
    private final C4253s10 f13722a;

    public K00(Context context, AbstractC2302ax abstractC2302ax, C1743Pa0 c1743Pa0, C2696eM c2696eM, H1.J j8) {
        C4481u10 c4481u10 = new C4481u10(c2696eM, abstractC2302ax.zzj());
        c4481u10.zze(j8);
        this.f13722a = new C4253s10(new E10(abstractC2302ax, context, c4481u10, c1743Pa0), c1743Pa0.zzL());
    }

    @Override // H1.O, H1.P
    public final synchronized String zze() {
        return this.f13722a.zza();
    }

    @Override // H1.O, H1.P
    public final synchronized String zzf() {
        return this.f13722a.zzb();
    }

    @Override // H1.O, H1.P
    public final void zzg(H1.Y1 y12) {
        this.f13722a.zzd(y12, 1);
    }

    @Override // H1.O, H1.P
    public final synchronized void zzh(H1.Y1 y12, int i8) {
        this.f13722a.zzd(y12, i8);
    }

    @Override // H1.O, H1.P
    public final synchronized boolean zzi() {
        return this.f13722a.zze();
    }
}
