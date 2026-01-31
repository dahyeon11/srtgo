package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC5162b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
class A implements C {

    /* renamed from: b, reason: collision with root package name */
    static final C f25473b = new A(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f25474c = Logger.getLogger(A.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Object f25475a;

    static final class a extends AbstractC5162b.j {

        /* renamed from: h, reason: collision with root package name */
        static final a f25476h;

        static {
            f25476h = AbstractC5162b.f25523d ? null : new a();
        }

        a() {
            cancel(false);
        }
    }

    static final class b extends AbstractC5162b.j {
        b(Throwable th) {
            setException(th);
        }
    }

    A(Object obj) {
        this.f25475a = obj;
    }

    @Override // com.google.common.util.concurrent.C
    public void addListener(Runnable runnable, Executor executor) {
        e3.w.checkNotNull(runnable, "Runnable was null.");
        e3.w.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f25474c.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f25475a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f25475a + "]]";
    }

    @Override // java.util.concurrent.Future
    public Object get(long j8, TimeUnit timeUnit) {
        e3.w.checkNotNull(timeUnit);
        return get();
    }
}
