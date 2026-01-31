package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4140r2 {

    /* renamed from: a, reason: collision with root package name */
    protected final K1 f22333a;

    protected AbstractC4140r2(K1 k12) {
        this.f22333a = k12;
    }

    protected abstract boolean a(C4099qh0 c4099qh0);

    protected abstract boolean b(C4099qh0 c4099qh0, long j8);

    public final boolean zzf(C4099qh0 c4099qh0, long j8) {
        return a(c4099qh0) && b(c4099qh0, j8);
    }
}
