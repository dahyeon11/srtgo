package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC5175o;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class O extends AbstractC5175o.a {

    /* renamed from: h, reason: collision with root package name */
    private C f25513h;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledFuture f25514i;

    private static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        O f25515a;

        b(O o8) {
            this.f25515a = o8;
        }

        @Override // java.lang.Runnable
        public void run() {
            C c9;
            O o8 = this.f25515a;
            if (o8 == null || (c9 = o8.f25513h) == null) {
                return;
            }
            this.f25515a = null;
            if (c9.isDone()) {
                o8.setFuture(c9);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = o8.f25514i;
                o8.f25514i = null;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    try {
                        long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (jAbs > 10) {
                            str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                        }
                    } catch (Throwable th) {
                        o8.setException(new c(str));
                        throw th;
                    }
                }
                o8.setException(new c(str + ": " + c9));
            } finally {
                c9.cancel(true);
            }
        }
    }

    private static final class c extends TimeoutException {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }

        private c(String str) {
            super(str);
        }
    }

    private O(C c9) {
        this.f25513h = (C) e3.w.checkNotNull(c9);
    }

    static C F(C c9, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        O o8 = new O(c9);
        b bVar = new b(o8);
        o8.f25514i = scheduledExecutorService.schedule(bVar, j8, timeUnit);
        c9.addListener(bVar, H.directExecutor());
        return o8;
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b
    protected void m() {
        x(this.f25513h);
        ScheduledFuture scheduledFuture = this.f25514i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f25513h = null;
        this.f25514i = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b
    protected String y() {
        C c9 = this.f25513h;
        ScheduledFuture scheduledFuture = this.f25514i;
        if (c9 == null) {
            return null;
        }
        String str = "inputFuture=[" + c9 + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }
}
