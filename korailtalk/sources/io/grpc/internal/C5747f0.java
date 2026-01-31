package io.grpc.internal;

import e3.C5353C;
import io.grpc.internal.InterfaceC5776u;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.internal.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5747f0 {

    /* renamed from: l, reason: collision with root package name */
    private static final long f32718l = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: m, reason: collision with root package name */
    private static final long f32719m = TimeUnit.MILLISECONDS.toNanos(10);

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f32720a;

    /* renamed from: b, reason: collision with root package name */
    private final C5353C f32721b;

    /* renamed from: c, reason: collision with root package name */
    private final d f32722c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32723d;

    /* renamed from: e, reason: collision with root package name */
    private e f32724e;

    /* renamed from: f, reason: collision with root package name */
    private ScheduledFuture f32725f;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledFuture f32726g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f32727h;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f32728i;

    /* renamed from: j, reason: collision with root package name */
    private final long f32729j;

    /* renamed from: k, reason: collision with root package name */
    private final long f32730k;

    /* renamed from: io.grpc.internal.f0$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z8;
            synchronized (C5747f0.this) {
                try {
                    e eVar = C5747f0.this.f32724e;
                    e eVar2 = e.DISCONNECTED;
                    if (eVar != eVar2) {
                        C5747f0.this.f32724e = eVar2;
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z8) {
                C5747f0.this.f32722c.onPingTimeout();
            }
        }
    }

    /* renamed from: io.grpc.internal.f0$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z8;
            synchronized (C5747f0.this) {
                try {
                    C5747f0.this.f32726g = null;
                    e eVar = C5747f0.this.f32724e;
                    e eVar2 = e.PING_SCHEDULED;
                    if (eVar == eVar2) {
                        C5747f0.this.f32724e = e.PING_SENT;
                        C5747f0 c5747f0 = C5747f0.this;
                        c5747f0.f32725f = c5747f0.f32720a.schedule(C5747f0.this.f32727h, C5747f0.this.f32730k, TimeUnit.NANOSECONDS);
                        z8 = true;
                    } else {
                        if (C5747f0.this.f32724e == e.PING_DELAYED) {
                            C5747f0 c5747f02 = C5747f0.this;
                            ScheduledExecutorService scheduledExecutorService = c5747f02.f32720a;
                            Runnable runnable = C5747f0.this.f32728i;
                            long j8 = C5747f0.this.f32729j;
                            C5353C c5353c = C5747f0.this.f32721b;
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            c5747f02.f32726g = scheduledExecutorService.schedule(runnable, j8 - c5353c.elapsed(timeUnit), timeUnit);
                            C5747f0.this.f32724e = eVar2;
                        }
                        z8 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z8) {
                C5747f0.this.f32722c.ping();
            }
        }
    }

    /* renamed from: io.grpc.internal.f0$c */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5782x f32733a;

        /* renamed from: io.grpc.internal.f0$c$a */
        class a implements InterfaceC5776u.a {
            a() {
            }

            @Override // io.grpc.internal.InterfaceC5776u.a
            public void onFailure(Throwable th) {
                c.this.f32733a.shutdownNow(io.grpc.J0.UNAVAILABLE.withDescription("Keepalive failed. The connection is likely gone"));
            }

            @Override // io.grpc.internal.InterfaceC5776u.a
            public void onSuccess(long j8) {
            }
        }

        public c(InterfaceC5782x interfaceC5782x) {
            this.f32733a = interfaceC5782x;
        }

        @Override // io.grpc.internal.C5747f0.d
        public void onPingTimeout() {
            this.f32733a.shutdownNow(io.grpc.J0.UNAVAILABLE.withDescription("Keepalive failed. The connection is likely gone"));
        }

        @Override // io.grpc.internal.C5747f0.d
        public void ping() {
            this.f32733a.ping(new a(), com.google.common.util.concurrent.H.directExecutor());
        }
    }

    /* renamed from: io.grpc.internal.f0$d */
    public interface d {
        void onPingTimeout();

        void ping();
    }

    /* renamed from: io.grpc.internal.f0$e */
    private enum e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public C5747f0(d dVar, ScheduledExecutorService scheduledExecutorService, long j8, long j9, boolean z8) {
        this(dVar, scheduledExecutorService, C5353C.createUnstarted(), j8, j9, z8);
    }

    public static long clampKeepAliveTimeInNanos(long j8) {
        return Math.max(j8, f32718l);
    }

    public static long clampKeepAliveTimeoutInNanos(long j8) {
        return Math.max(j8, f32719m);
    }

    public synchronized void onDataReceived() {
        try {
            this.f32721b.reset().start();
            e eVar = this.f32724e;
            e eVar2 = e.PING_SCHEDULED;
            if (eVar == eVar2) {
                this.f32724e = e.PING_DELAYED;
            } else if (eVar == e.PING_SENT || eVar == e.IDLE_AND_PING_SENT) {
                ScheduledFuture scheduledFuture = this.f32725f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f32724e == e.IDLE_AND_PING_SENT) {
                    this.f32724e = e.IDLE;
                } else {
                    this.f32724e = eVar2;
                    e3.w.checkState(this.f32726g == null, "There should be no outstanding pingFuture");
                    this.f32726g = this.f32720a.schedule(this.f32728i, this.f32729j, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void onTransportActive() {
        try {
            e eVar = this.f32724e;
            if (eVar == e.IDLE) {
                this.f32724e = e.PING_SCHEDULED;
                if (this.f32726g == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f32720a;
                    Runnable runnable = this.f32728i;
                    long j8 = this.f32729j;
                    C5353C c5353c = this.f32721b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f32726g = scheduledExecutorService.schedule(runnable, j8 - c5353c.elapsed(timeUnit), timeUnit);
                }
            } else if (eVar == e.IDLE_AND_PING_SENT) {
                this.f32724e = e.PING_SENT;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void onTransportIdle() {
        try {
            if (this.f32723d) {
                return;
            }
            e eVar = this.f32724e;
            if (eVar == e.PING_SCHEDULED || eVar == e.PING_DELAYED) {
                this.f32724e = e.IDLE;
            }
            if (this.f32724e == e.PING_SENT) {
                this.f32724e = e.IDLE_AND_PING_SENT;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void onTransportStarted() {
        if (this.f32723d) {
            onTransportActive();
        }
    }

    public synchronized void onTransportTermination() {
        try {
            e eVar = this.f32724e;
            e eVar2 = e.DISCONNECTED;
            if (eVar != eVar2) {
                this.f32724e = eVar2;
                ScheduledFuture scheduledFuture = this.f32725f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledFuture scheduledFuture2 = this.f32726g;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    this.f32726g = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    C5747f0(d dVar, ScheduledExecutorService scheduledExecutorService, C5353C c5353c, long j8, long j9, boolean z8) {
        this.f32724e = e.IDLE;
        this.f32727h = new RunnableC5749g0(new a());
        this.f32728i = new RunnableC5749g0(new b());
        this.f32722c = (d) e3.w.checkNotNull(dVar, "keepAlivePinger");
        this.f32720a = (ScheduledExecutorService) e3.w.checkNotNull(scheduledExecutorService, "scheduler");
        this.f32721b = (C5353C) e3.w.checkNotNull(c5353c, androidx.core.app.r.CATEGORY_STOPWATCH);
        this.f32729j = j8;
        this.f32730k = j9;
        this.f32723d = z8;
        c5353c.reset().start();
    }
}
