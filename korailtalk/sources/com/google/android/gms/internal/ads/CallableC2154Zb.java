package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.Zb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC2154Zb implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final C1294Eb f17610a;

    /* renamed from: b, reason: collision with root package name */
    private final C3357k9 f17611b;

    public CallableC2154Zb(C1294Eb c1294Eb, C3357k9 c3357k9) {
        this.f17610a = c1294Eb;
        this.f17611b = c3357k9;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws ExecutionException, InterruptedException {
        if (this.f17610a.zzl() != null) {
            this.f17610a.zzl().get();
        }
        O9 o9Zzc = this.f17610a.zzc();
        if (o9Zzc == null) {
            return null;
        }
        try {
            synchronized (this.f17611b) {
                this.f17611b.zzaY(o9Zzc.zzaV(), Iy0.zza());
            }
            return null;
        } catch (C4021pz0 | NullPointerException unused) {
            return null;
        }
    }
}
