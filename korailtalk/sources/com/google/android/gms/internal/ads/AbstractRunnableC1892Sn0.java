package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.google.android.gms.internal.ads.Sn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractRunnableC1892Sn0 extends AtomicReference implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final Runnable f16343a = new RunnableC1851Rn0(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Runnable f16344b = new RunnableC1851Rn0(null);

    AbstractRunnableC1892Sn0() {
    }

    private final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC1728On0 runnableC1728On0 = null;
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (!(runnable instanceof RunnableC1728On0)) {
                if (runnable != f16344b) {
                    break;
                }
            } else {
                runnableC1728On0 = (RunnableC1728On0) runnable;
            }
            i8++;
            if (i8 > 1000) {
                Runnable runnable2 = f16344b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z8 = Thread.interrupted() || z8;
                    LockSupport.park(runnableC1728On0);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z8) {
            thread.interrupt();
        }
    }

    abstract Object a();

    abstract String b();

    abstract void d(Throwable th);

    abstract void e(Object obj);

    abstract boolean f();

    final void g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            RunnableC1728On0 runnableC1728On0 = new RunnableC1728On0(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, runnableC1728On0)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f16343a)) == f16344b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f16343a)) == f16344b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zF = f();
            if (!zF) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        AbstractC2400bo0.a(th);
                        if (!compareAndSet(threadCurrentThread, f16343a)) {
                            c(threadCurrentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, f16343a)) {
                            c(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f16343a)) {
                c(threadCurrentThread);
            }
            if (zF) {
                return;
            }
            e(objA);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f16343a) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC1728On0) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
