package io.grpc.internal;

import com.korail.talk.network.dao.research.CmtrInfoDao;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class J0 implements Executor, Runnable {

    /* renamed from: d, reason: collision with root package name */
    private static final Logger f32487d = Logger.getLogger(J0.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private static final b f32488e = c();

    /* renamed from: a, reason: collision with root package name */
    private Executor f32489a;

    /* renamed from: b, reason: collision with root package name */
    private final Queue f32490b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f32491c = 0;

    private static abstract class b {
        private b() {
        }

        public abstract boolean runStateCompareAndSet(J0 j02, int i8, int i9);

        public abstract void runStateSet(J0 j02, int i8);
    }

    private static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicIntegerFieldUpdater f32492a;

        @Override // io.grpc.internal.J0.b
        public boolean runStateCompareAndSet(J0 j02, int i8, int i9) {
            return this.f32492a.compareAndSet(j02, i8, i9);
        }

        @Override // io.grpc.internal.J0.b
        public void runStateSet(J0 j02, int i8) {
            this.f32492a.set(j02, i8);
        }

        private c(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f32492a = atomicIntegerFieldUpdater;
        }
    }

    private static final class d extends b {
        private d() {
            super();
        }

        @Override // io.grpc.internal.J0.b
        public boolean runStateCompareAndSet(J0 j02, int i8, int i9) {
            synchronized (j02) {
                try {
                    if (j02.f32491c != i8) {
                        return false;
                    }
                    j02.f32491c = i9;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.J0.b
        public void runStateSet(J0 j02, int i8) {
            synchronized (j02) {
                j02.f32491c = i8;
            }
        }
    }

    public J0(Executor executor) {
        e3.w.checkNotNull(executor, "'executor' must not be null.");
        this.f32489a = executor;
    }

    private static b c() {
        try {
            return new c(AtomicIntegerFieldUpdater.newUpdater(J0.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C));
        } catch (Throwable th) {
            f32487d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new d();
        }
    }

    private void d(Runnable runnable) {
        if (f32488e.runStateCompareAndSet(this, 0, -1)) {
            try {
                this.f32489a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f32490b.remove(runnable);
                }
                f32488e.runStateSet(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f32490b.add((Runnable) e3.w.checkNotNull(runnable, "'r' must not be null."));
        d(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable;
        try {
            Executor executor = this.f32489a;
            while (executor == this.f32489a && (runnable = (Runnable) this.f32490b.poll()) != null) {
                try {
                    runnable.run();
                } catch (RuntimeException e8) {
                    f32487d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e8);
                }
            }
            f32488e.runStateSet(this, 0);
            if (this.f32490b.isEmpty()) {
                return;
            }
            d(null);
        } catch (Throwable th) {
            f32488e.runStateSet(this, 0);
            throw th;
        }
    }

    public void setExecutor(Executor executor) {
        e3.w.checkNotNull(executor, "'executor' must not be null.");
        this.f32489a = executor;
    }
}
