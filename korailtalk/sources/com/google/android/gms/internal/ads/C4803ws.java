package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ws, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4803ws {

    /* renamed from: a, reason: collision with root package name */
    private final o2.f f23550a;

    /* renamed from: b, reason: collision with root package name */
    private final C4575us f23551b;

    C4803ws(o2.f fVar, C4575us c4575us) {
        this.f23550a = fVar;
        this.f23551b = c4575us;
    }

    public static C4803ws zza(Context context) {
        return AbstractC1448Hs.zzd(context).b();
    }

    public final void zzb(int i8, long j8) {
        this.f23551b.zza(i8, j8);
    }

    public final void zzc(H1.M1 m12) {
        this.f23551b.zza(-1, this.f23550a.currentTimeMillis());
    }

    public final void zzd() {
        this.f23551b.zza(-1, this.f23550a.currentTimeMillis());
    }
}
