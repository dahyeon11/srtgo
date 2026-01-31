package io.grpc;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5806x implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    private static final b f33383d = new b();

    /* renamed from: e, reason: collision with root package name */
    private static final long f33384e;

    /* renamed from: f, reason: collision with root package name */
    private static final long f33385f;

    /* renamed from: g, reason: collision with root package name */
    private static final long f33386g;

    /* renamed from: a, reason: collision with root package name */
    private final c f33387a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33388b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f33389c;

    /* renamed from: io.grpc.x$b */
    private static class b extends c {
        private b() {
        }

        @Override // io.grpc.C5806x.c
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* renamed from: io.grpc.x$c */
    public static abstract class c {
        public abstract long nanoTime();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f33384e = nanos;
        f33385f = -nanos;
        f33386g = TimeUnit.SECONDS.toNanos(1L);
    }

    private C5806x(c cVar, long j8, boolean z8) {
        this(cVar, cVar.nanoTime(), j8, z8);
    }

    private static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static C5806x after(long j8, TimeUnit timeUnit) {
        return after(j8, timeUnit, f33383d);
    }

    private void b(C5806x c5806x) {
        if (this.f33387a == c5806x.f33387a) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f33387a + " and " + c5806x.f33387a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public static c getSystemTicker() {
        return f33383d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5806x)) {
            return false;
        }
        C5806x c5806x = (C5806x) obj;
        c cVar = this.f33387a;
        if (cVar != null ? cVar == c5806x.f33387a : c5806x.f33387a == null) {
            return this.f33388b == c5806x.f33388b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.asList(this.f33387a, Long.valueOf(this.f33388b)).hashCode();
    }

    public boolean isBefore(C5806x c5806x) {
        b(c5806x);
        return this.f33388b - c5806x.f33388b < 0;
    }

    public boolean isExpired() {
        if (!this.f33389c) {
            if (this.f33388b - this.f33387a.nanoTime() > 0) {
                return false;
            }
            this.f33389c = true;
        }
        return true;
    }

    public C5806x minimum(C5806x c5806x) {
        b(c5806x);
        return isBefore(c5806x) ? this : c5806x;
    }

    public C5806x offset(long j8, TimeUnit timeUnit) {
        return j8 == 0 ? this : new C5806x(this.f33387a, this.f33388b, timeUnit.toNanos(j8), isExpired());
    }

    public ScheduledFuture<?> runOnExpiration(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        a(runnable, "task");
        a(scheduledExecutorService, "scheduler");
        return scheduledExecutorService.schedule(runnable, this.f33388b - this.f33387a.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public long timeRemaining(TimeUnit timeUnit) {
        long jNanoTime = this.f33387a.nanoTime();
        if (!this.f33389c && this.f33388b - jNanoTime <= 0) {
            this.f33389c = true;
        }
        return timeUnit.convert(this.f33388b - jNanoTime, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long jTimeRemaining = timeRemaining(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jTimeRemaining);
        long j8 = f33386g;
        long j9 = jAbs / j8;
        long jAbs2 = Math.abs(jTimeRemaining) % j8;
        StringBuilder sb = new StringBuilder();
        if (jTimeRemaining < 0) {
            sb.append('-');
        }
        sb.append(j9);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        if (this.f33387a != f33383d) {
            sb.append(" (ticker=" + this.f33387a + ")");
        }
        return sb.toString();
    }

    private C5806x(c cVar, long j8, long j9, boolean z8) {
        this.f33387a = cVar;
        long jMin = Math.min(f33384e, Math.max(f33385f, j9));
        this.f33388b = j8 + jMin;
        this.f33389c = z8 && jMin <= 0;
    }

    public static C5806x after(long j8, TimeUnit timeUnit, c cVar) {
        a(timeUnit, "units");
        return new C5806x(cVar, timeUnit.toNanos(j8), true);
    }

    @Override // java.lang.Comparable
    public int compareTo(C5806x c5806x) {
        b(c5806x);
        long j8 = this.f33388b - c5806x.f33388b;
        if (j8 < 0) {
            return -1;
        }
        return j8 > 0 ? 1 : 0;
    }
}
