package com.google.common.util.concurrent;

import f3.X;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractFutureC5177q extends X implements Future {
    protected AbstractFutureC5177q() {
    }

    protected abstract Future a();

    public boolean cancel(boolean z8) {
        return a().cancel(z8);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return a().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return a().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return a().isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j8, TimeUnit timeUnit) {
        return a().get(j8, timeUnit);
    }
}
