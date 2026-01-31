package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Ec0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1297Ec0 implements com.google.common.util.concurrent.C {

    /* renamed from: a, reason: collision with root package name */
    private final Object f12830a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12831b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.C f12832c;

    public C1297Ec0(Object obj, String str, com.google.common.util.concurrent.C c9) {
        this.f12830a = obj;
        this.f12831b = str;
        this.f12832c = c9;
    }

    @Override // com.google.common.util.concurrent.C
    public final void addListener(Runnable runnable, Executor executor) {
        this.f12832c.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        return this.f12832c.cancel(z8);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f12832c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12832c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12832c.isDone();
    }

    public final String toString() {
        return this.f12831b + "@" + System.identityHashCode(this);
    }

    public final Object zza() {
        return this.f12830a;
    }

    public final String zzb() {
        return this.f12831b;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        return this.f12832c.get(j8, timeUnit);
    }
}
