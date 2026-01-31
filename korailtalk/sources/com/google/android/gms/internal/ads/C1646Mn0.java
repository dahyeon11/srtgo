package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.Mn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1646Mn0 implements com.google.common.util.concurrent.C {

    /* renamed from: b, reason: collision with root package name */
    static final com.google.common.util.concurrent.C f14704b = new C1646Mn0(null);

    /* renamed from: c, reason: collision with root package name */
    private static final C1933Tn0 f14705c = new C1933Tn0(C1646Mn0.class);

    /* renamed from: a, reason: collision with root package name */
    private final Object f14706a;

    C1646Mn0(Object obj) {
        this.f14706a = obj;
    }

    @Override // com.google.common.util.concurrent.C
    public final void addListener(Runnable runnable, Executor executor) {
        AbstractC1188Bj0.zzc(runnable, "Runnable was null.");
        AbstractC1188Bj0.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            f14705c.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e8);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f14706a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.f14706a;
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(obj) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f14706a;
    }
}
