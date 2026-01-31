package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Bt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1203Bt implements com.google.common.util.concurrent.C {

    /* renamed from: a, reason: collision with root package name */
    private final C2514co0 f12328a = C2514co0.zze();

    private static final boolean a(boolean z8) {
        if (!z8) {
            G1.u.zzo().zzv(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z8;
    }

    @Override // com.google.common.util.concurrent.C
    public final void addListener(Runnable runnable, Executor executor) {
        this.f12328a.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        return this.f12328a.cancel(z8);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f12328a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12328a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12328a.isDone();
    }

    public final boolean zzc(Object obj) {
        boolean zZzc = this.f12328a.zzc(obj);
        a(zZzc);
        return zZzc;
    }

    public final boolean zzd(Throwable th) {
        boolean zZzd = this.f12328a.zzd(th);
        a(zZzd);
        return zZzd;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return this.f12328a.get(j8, timeUnit);
    }
}
