package com.google.android.gms.internal.ads;

import z1.C6616b;

/* renamed from: com.google.android.gms.internal.ads.lk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC3534lk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6616b f20732a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ H1.X f20733b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC3648mk f20734c;

    RunnableC3534lk(BinderC3648mk binderC3648mk, C6616b c6616b, H1.X x8) {
        this.f20732a = c6616b;
        this.f20733b = x8;
        this.f20734c = binderC3648mk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20732a.zzb(this.f20733b)) {
            BinderC3648mk.b(this.f20734c);
            throw null;
        }
        L1.n.zzj("Could not bind.");
    }
}
