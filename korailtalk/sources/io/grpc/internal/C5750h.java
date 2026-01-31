package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5750h {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f32747c = Logger.getLogger(C5750h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final String f32748a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f32749b;

    /* renamed from: io.grpc.internal.h$b */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f32750a;

        public void backoff() {
            long j8 = this.f32750a;
            long jMax = Math.max(2 * j8, j8);
            if (C5750h.this.f32749b.compareAndSet(this.f32750a, jMax)) {
                C5750h.f32747c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{C5750h.this.f32748a, Long.valueOf(jMax)});
            }
        }

        public long get() {
            return this.f32750a;
        }

        private b(long j8) {
            this.f32750a = j8;
        }
    }

    public C5750h(String str, long j8) {
        AtomicLong atomicLong = new AtomicLong();
        this.f32749b = atomicLong;
        e3.w.checkArgument(j8 > 0, "value must be positive");
        this.f32748a = str;
        atomicLong.set(j8);
    }

    public b getState() {
        return new b(this.f32749b.get());
    }
}
