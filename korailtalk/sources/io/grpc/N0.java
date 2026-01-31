package io.grpc;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class N0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f32000a;

    /* renamed from: b, reason: collision with root package name */
    private final Queue f32001b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f32002c = new AtomicReference();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f32003a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f32004b;

        a(c cVar, Runnable runnable) {
            this.f32003a = cVar;
            this.f32004b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            N0.this.execute(this.f32003a);
        }

        public String toString() {
            return this.f32004b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f32006a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f32007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f32008c;

        b(c cVar, Runnable runnable, long j8) {
            this.f32006a = cVar;
            this.f32007b = runnable;
            this.f32008c = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            N0.this.execute(this.f32006a);
        }

        public String toString() {
            return this.f32007b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f32008c + ")";
        }
    }

    private static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f32010a;

        /* renamed from: b, reason: collision with root package name */
        boolean f32011b;

        /* renamed from: c, reason: collision with root package name */
        boolean f32012c;

        c(Runnable runnable) {
            this.f32010a = (Runnable) e3.w.checkNotNull(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f32011b) {
                return;
            }
            this.f32012c = true;
            this.f32010a.run();
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final c f32013a;

        /* renamed from: b, reason: collision with root package name */
        private final ScheduledFuture f32014b;

        /* synthetic */ d(c cVar, ScheduledFuture scheduledFuture, a aVar) {
            this(cVar, scheduledFuture);
        }

        public void cancel() {
            this.f32013a.f32011b = true;
            this.f32014b.cancel(false);
        }

        public boolean isPending() {
            c cVar = this.f32013a;
            return (cVar.f32012c || cVar.f32011b) ? false : true;
        }

        private d(c cVar, ScheduledFuture scheduledFuture) {
            this.f32013a = (c) e3.w.checkNotNull(cVar, "runnable");
            this.f32014b = (ScheduledFuture) e3.w.checkNotNull(scheduledFuture, "future");
        }
    }

    public N0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f32000a = (Thread.UncaughtExceptionHandler) e3.w.checkNotNull(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void drain() {
        while (androidx.camera.view.h.a(this.f32002c, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.f32001b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.f32000a.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.f32002c.set(null);
                    throw th2;
                }
            }
            this.f32002c.set(null);
            if (this.f32001b.isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        executeLater(runnable);
        drain();
    }

    public final void executeLater(Runnable runnable) {
        this.f32001b.add((Runnable) e3.w.checkNotNull(runnable, "runnable is null"));
    }

    public final d schedule(Runnable runnable, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.schedule(new a(cVar, runnable), j8, timeUnit), null);
    }

    public final d scheduleWithFixedDelay(Runnable runnable, long j8, long j9, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.scheduleWithFixedDelay(new b(cVar, runnable, j9), j8, j9, timeUnit), null);
    }

    public void throwIfNotInThisSynchronizationContext() {
        e3.w.checkState(Thread.currentThread() == this.f32002c.get(), "Not called from the SynchronizationContext");
    }
}
