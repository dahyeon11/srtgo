package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2430c30 {

    /* renamed from: a, reason: collision with root package name */
    private final long f18232a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.f f18233b;
    public final com.google.common.util.concurrent.C zza;

    public C2430c30(com.google.common.util.concurrent.C c9, long j8, o2.f fVar) {
        this.zza = c9;
        this.f18233b = fVar;
        this.f18232a = fVar.elapsedRealtime() + j8;
    }

    public final boolean zza() {
        return this.f18232a < this.f18233b.elapsedRealtime();
    }
}
