package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.p */
/* loaded from: classes2.dex */
final class C5176p extends AbstractC5175o {

    /* renamed from: h */
    private final C f25583h;

    C5176p(C c9) {
        this.f25583h = (C) e3.w.checkNotNull(c9);
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b, com.google.common.util.concurrent.C
    public void addListener(Runnable runnable, Executor executor) {
        this.f25583h.addListener(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        return this.f25583h.cancel(z8);
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
    public Object get() {
        return this.f25583h.get();
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f25583h.isCancelled();
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
    public boolean isDone() {
        return this.f25583h.isDone();
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b
    public String toString() {
        return this.f25583h.toString();
    }

    @Override // com.google.common.util.concurrent.AbstractC5162b, java.util.concurrent.Future
    public Object get(long j8, TimeUnit timeUnit) {
        return this.f25583h.get(j8, timeUnit);
    }
}
