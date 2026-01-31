package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC5162b;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5175o extends y {

    /* renamed from: com.google.common.util.concurrent.o$a */
    static abstract class a extends AbstractC5175o implements AbstractC5162b.i {
        a() {
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b, com.google.common.util.concurrent.C
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
        public final boolean cancel(boolean z8) {
            return super.cancel(z8);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
        public final Object get() {
            return super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
        public final Object get(long j8, TimeUnit timeUnit) {
            return super.get(j8, timeUnit);
        }
    }

    AbstractC5175o() {
    }

    public static <V> AbstractC5175o from(C c9) {
        return c9 instanceof AbstractC5175o ? (AbstractC5175o) c9 : new C5176p(c9);
    }

    public final void addCallback(InterfaceC5178s interfaceC5178s, Executor executor) {
        v.addCallback(this, interfaceC5178s, executor);
    }

    public final <X extends Throwable> AbstractC5175o catching(Class<X> cls, e3.l lVar, Executor executor) {
        return (AbstractC5175o) v.catching(this, cls, lVar, executor);
    }

    public final <X extends Throwable> AbstractC5175o catchingAsync(Class<X> cls, InterfaceC5170j interfaceC5170j, Executor executor) {
        return (AbstractC5175o) v.catchingAsync(this, cls, interfaceC5170j, executor);
    }

    public final <T> AbstractC5175o transform(e3.l lVar, Executor executor) {
        return (AbstractC5175o) v.transform(this, lVar, executor);
    }

    public final <T> AbstractC5175o transformAsync(InterfaceC5170j interfaceC5170j, Executor executor) {
        return (AbstractC5175o) v.transformAsync(this, interfaceC5170j, executor);
    }

    public final AbstractC5175o withTimeout(long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (AbstractC5175o) v.withTimeout(this, j8, timeUnit, scheduledExecutorService);
    }

    @Deprecated
    public static <V> AbstractC5175o from(AbstractC5175o abstractC5175o) {
        return (AbstractC5175o) e3.w.checkNotNull(abstractC5175o);
    }
}
