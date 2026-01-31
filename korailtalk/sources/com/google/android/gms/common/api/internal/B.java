package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
abstract class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C f11855a;

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        this.f11855a.f11873b.lock();
        try {
            try {
                if (Thread.interrupted()) {
                    lock = this.f11855a.f11873b;
                } else {
                    zaa();
                    lock = this.f11855a.f11873b;
                }
            } catch (RuntimeException e8) {
                this.f11855a.f11872a.g(e8);
                lock = this.f11855a.f11873b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f11855a.f11873b.unlock();
            throw th;
        }
    }

    protected abstract void zaa();
}
