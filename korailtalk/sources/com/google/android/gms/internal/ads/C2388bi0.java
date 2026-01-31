package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bi0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2388bi0 extends AbstractC1972Um0 {

    /* renamed from: h, reason: collision with root package name */
    Object f18175h;

    C2388bi0(Object obj, Runnable runnable) {
        this.f18175h = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    protected final void c() {
        this.f18175h = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    public final String zza() {
        Object obj = this.f18175h;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    public final boolean zzc(Object obj) {
        return super.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    public final boolean zzd(Throwable th) {
        return super.zzd(th);
    }
}
