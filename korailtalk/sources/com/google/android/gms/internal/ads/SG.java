package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class SG extends AbstractC4400tI {

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f16226b;

    /* renamed from: c, reason: collision with root package name */
    private final o2.f f16227c;

    /* renamed from: d, reason: collision with root package name */
    private long f16228d;

    /* renamed from: e, reason: collision with root package name */
    private long f16229e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16230f;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledFuture f16231g;

    public SG(ScheduledExecutorService scheduledExecutorService, o2.f fVar) {
        super(Collections.emptySet());
        this.f16228d = -1L;
        this.f16229e = -1L;
        this.f16230f = false;
        this.f16226b = scheduledExecutorService;
        this.f16227c = fVar;
    }

    private final synchronized void b(long j8) {
        try {
            ScheduledFuture scheduledFuture = this.f16231g;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f16231g.cancel(true);
            }
            this.f16228d = this.f16227c.elapsedRealtime() + j8;
            this.f16231g = this.f16226b.schedule(new QG(this, null), j8, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        this.f16230f = false;
        b(0L);
    }

    public final synchronized void zzb() {
        try {
            if (this.f16230f) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f16231g;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f16229e = -1L;
            } else {
                this.f16231g.cancel(true);
                this.f16229e = this.f16228d - this.f16227c.elapsedRealtime();
            }
            this.f16230f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        try {
            if (this.f16230f) {
                if (this.f16229e > 0 && this.f16231g.isCancelled()) {
                    b(this.f16229e);
                }
                this.f16230f = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(int i8) {
        if (i8 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i8);
            if (this.f16230f) {
                long j8 = this.f16229e;
                if (j8 <= 0 || millis >= j8) {
                    millis = j8;
                }
                this.f16229e = millis;
                return;
            }
            long jElapsedRealtime = this.f16227c.elapsedRealtime();
            long j9 = this.f16228d;
            if (jElapsedRealtime > j9 || j9 - this.f16227c.elapsedRealtime() > millis) {
                b(millis);
            }
        }
    }
}
