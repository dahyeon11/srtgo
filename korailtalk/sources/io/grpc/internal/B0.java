package io.grpc.internal;

import e3.C5353C;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class B0 {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f32218a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f32219b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f32220c;

    /* renamed from: d, reason: collision with root package name */
    private final C5353C f32221d;

    /* renamed from: e, reason: collision with root package name */
    private long f32222e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f32223f;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledFuture f32224g;

    private final class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!B0.this.f32223f) {
                B0.this.f32224g = null;
                return;
            }
            long j8 = B0.this.j();
            if (B0.this.f32222e - j8 > 0) {
                B0 b02 = B0.this;
                b02.f32224g = b02.f32218a.schedule(new c(), B0.this.f32222e - j8, TimeUnit.NANOSECONDS);
            } else {
                B0.this.f32223f = false;
                B0.this.f32224g = null;
                B0.this.f32220c.run();
            }
        }
    }

    private final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            B0.this.f32219b.execute(new b());
        }
    }

    B0(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, C5353C c5353c) {
        this.f32220c = runnable;
        this.f32219b = executor;
        this.f32218a = scheduledExecutorService;
        this.f32221d = c5353c;
        c5353c.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long j() {
        return this.f32221d.elapsed(TimeUnit.NANOSECONDS);
    }

    void i(boolean z8) {
        ScheduledFuture scheduledFuture;
        this.f32223f = false;
        if (!z8 || (scheduledFuture = this.f32224g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f32224g = null;
    }

    void k(long j8, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j8);
        long j9 = j() + nanos;
        this.f32223f = true;
        if (j9 - this.f32222e < 0 || this.f32224g == null) {
            ScheduledFuture scheduledFuture = this.f32224g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f32224g = this.f32218a.schedule(new c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f32222e = j9;
    }
}
