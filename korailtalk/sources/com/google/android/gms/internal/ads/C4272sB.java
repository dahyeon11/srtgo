package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.sB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4272sB implements InterfaceC3976pd {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f22589a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.f f22590b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledFuture f22591c;

    /* renamed from: d, reason: collision with root package name */
    private long f22592d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f22593e = -1;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f22594f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22595g = false;

    public C4272sB(ScheduledExecutorService scheduledExecutorService, o2.f fVar) {
        this.f22589a = scheduledExecutorService;
        this.f22590b = fVar;
        G1.u.zzb().zzc(this);
    }

    final synchronized void a() {
        try {
            if (this.f22595g) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f22591c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f22593e = -1L;
            } else {
                this.f22591c.cancel(true);
                this.f22593e = this.f22592d - this.f22590b.elapsedRealtime();
            }
            this.f22595g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void b() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.f22595g) {
                if (this.f22593e > 0 && (scheduledFuture = this.f22591c) != null && scheduledFuture.isCancelled()) {
                    this.f22591c = this.f22589a.schedule(this.f22594f, this.f22593e, TimeUnit.MILLISECONDS);
                }
                this.f22595g = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3976pd
    public final void zza(boolean z8) {
        if (z8) {
            b();
        } else {
            a();
        }
    }

    public final synchronized void zzd(int i8, Runnable runnable) {
        this.f22594f = runnable;
        long j8 = i8;
        this.f22592d = this.f22590b.elapsedRealtime() + j8;
        this.f22591c = this.f22589a.schedule(runnable, j8, TimeUnit.MILLISECONDS);
    }
}
