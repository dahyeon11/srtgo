package io.grpc.internal;

import io.grpc.N0;
import io.grpc.internal.InterfaceC5757k;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5761m implements E0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f32995f = Logger.getLogger(C5761m.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f32996a;

    /* renamed from: b, reason: collision with root package name */
    private final io.grpc.N0 f32997b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5757k.a f32998c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC5757k f32999d;

    /* renamed from: e, reason: collision with root package name */
    private N0.d f33000e;

    C5761m(InterfaceC5757k.a aVar, ScheduledExecutorService scheduledExecutorService, io.grpc.N0 n02) {
        this.f32998c = aVar;
        this.f32996a = scheduledExecutorService;
        this.f32997b = n02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        N0.d dVar = this.f33000e;
        if (dVar != null && dVar.isPending()) {
            this.f33000e.cancel();
        }
        this.f32999d = null;
    }

    @Override // io.grpc.internal.E0
    public void reset() {
        this.f32997b.throwIfNotInThisSynchronizationContext();
        this.f32997b.execute(new Runnable() { // from class: io.grpc.internal.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f32983a.b();
            }
        });
    }

    @Override // io.grpc.internal.E0
    public void schedule(Runnable runnable) {
        this.f32997b.throwIfNotInThisSynchronizationContext();
        if (this.f32999d == null) {
            this.f32999d = this.f32998c.get();
        }
        N0.d dVar = this.f33000e;
        if (dVar == null || !dVar.isPending()) {
            long jNextBackoffNanos = this.f32999d.nextBackoffNanos();
            this.f33000e = this.f32997b.schedule(runnable, jNextBackoffNanos, TimeUnit.NANOSECONDS, this.f32996a);
            f32995f.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jNextBackoffNanos));
        }
    }
}
