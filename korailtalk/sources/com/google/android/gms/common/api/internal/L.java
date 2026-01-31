package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
abstract class L {

    /* renamed from: a */
    private final h2.r f11929a;

    protected L(h2.r rVar) {
        this.f11929a = rVar;
    }

    protected abstract void zaa();

    public final void zab(N n8) {
        Lock lock;
        n8.f11932a.lock();
        try {
            if (n8.f11942k != this.f11929a) {
                lock = n8.f11932a;
            } else {
                zaa();
                lock = n8.f11932a;
            }
            lock.unlock();
        } catch (Throwable th) {
            n8.f11932a.unlock();
            throw th;
        }
    }
}
