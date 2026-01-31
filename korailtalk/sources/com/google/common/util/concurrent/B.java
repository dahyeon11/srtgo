package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
abstract class B extends AtomicReference implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final Runnable f25477a;

    /* renamed from: b, reason: collision with root package name */
    private static final Runnable f25478b;

    static final class b extends AbstractOwnableSynchronizer implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final B f25479a;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return this.f25479a.toString();
        }

        private b(B b9) {
            this.f25479a = b9;
        }
    }

    private static final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f25477a = new c();
        f25478b = new c();
    }

    B() {
    }

    private void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        b bVar = null;
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            boolean z9 = runnable instanceof b;
            if (!z9 && runnable != f25478b) {
                break;
            }
            if (z9) {
                bVar = (b) runnable;
            }
            i8++;
            if (i8 > 1000) {
                Runnable runnable2 = f25478b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z8 = Thread.interrupted() || z8;
                    LockSupport.park(bVar);
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

    abstract void a(Throwable th);

    abstract void b(Object obj);

    final void c() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            bVar.b(Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(f25477a)) == f25478b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    abstract boolean d();

    abstract Object e();

    abstract String f();

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th) {
                    try {
                        K.b(th);
                        if (!compareAndSet(threadCurrentThread, f25477a)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, f25477a)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(I.a(null));
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f25477a) {
            str = "running=[DONE]";
        } else if (runnable instanceof b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + f();
    }
}
