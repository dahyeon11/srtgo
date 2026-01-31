package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC5162b;
import com.google.common.util.concurrent.r;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class H {

    class a implements Executor {

        /* renamed from: a */
        final /* synthetic */ Executor f25480a;

        /* renamed from: b */
        final /* synthetic */ AbstractC5162b f25481b;

        a(Executor executor, AbstractC5162b abstractC5162b) {
            this.f25480a = executor;
            this.f25481b = abstractC5162b;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f25480a.execute(runnable);
            } catch (RejectedExecutionException e8) {
                this.f25481b.setException(e8);
            }
        }
    }

    static class b {

        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ExecutorService f25482a;

            /* renamed from: b */
            final /* synthetic */ long f25483b;

            /* renamed from: c */
            final /* synthetic */ TimeUnit f25484c;

            a(b bVar, ExecutorService executorService, long j8, TimeUnit timeUnit) {
                this.f25482a = executorService;
                this.f25483b = j8;
                this.f25484c = timeUnit;
            }

            @Override // java.lang.Runnable
            public void run() throws InterruptedException {
                try {
                    this.f25482a.shutdown();
                    this.f25482a.awaitTermination(this.f25483b, this.f25484c);
                } catch (InterruptedException unused) {
                }
            }
        }

        b() {
        }

        final void a(ExecutorService executorService, long j8, TimeUnit timeUnit) {
            e3.w.checkNotNull(executorService);
            e3.w.checkNotNull(timeUnit);
            b(H.c("DelayedShutdownHook-for-" + executorService, new a(this, executorService, j8, timeUnit)));
        }

        void b(Thread thread) {
            Runtime.getRuntime().addShutdownHook(thread);
        }

        final ExecutorService c(ThreadPoolExecutor threadPoolExecutor) {
            return d(threadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        final ExecutorService d(ThreadPoolExecutor threadPoolExecutor, long j8, TimeUnit timeUnit) {
            H.e(threadPoolExecutor);
            ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
            a(threadPoolExecutor, j8, timeUnit);
            return executorServiceUnconfigurableExecutorService;
        }

        final ScheduledExecutorService e(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
            return f(scheduledThreadPoolExecutor, 120L, TimeUnit.SECONDS);
        }

        final ScheduledExecutorService f(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j8, TimeUnit timeUnit) {
            H.e(scheduledThreadPoolExecutor);
            ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
            a(scheduledThreadPoolExecutor, j8, timeUnit);
            return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        }
    }

    private static class d extends AbstractC5163c {

        /* renamed from: a */
        private final ExecutorService f25488a;

        d(ExecutorService executorService) {
            this.f25488a = (ExecutorService) e3.w.checkNotNull(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j8, TimeUnit timeUnit) {
            return this.f25488a.awaitTermination(j8, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f25488a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f25488a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f25488a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f25488a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f25488a.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f25488a + "]";
        }
    }

    private static final class e extends d implements F {

        /* renamed from: b */
        final ScheduledExecutorService f25489b;

        private static final class a extends r.a implements D {

            /* renamed from: b */
            private final ScheduledFuture f25490b;

            public a(C c9, ScheduledFuture<?> scheduledFuture) {
                super(c9);
                this.f25490b = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.AbstractFutureC5177q, java.util.concurrent.Future
            public boolean cancel(boolean z8) {
                boolean zCancel = super.cancel(z8);
                if (zCancel) {
                    this.f25490b.cancel(z8);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f25490b.getDelay(timeUnit);
            }

            @Override // java.lang.Comparable
            public int compareTo(Delayed delayed) {
                return this.f25490b.compareTo(delayed);
            }
        }

        private static final class b extends AbstractC5162b.j implements Runnable {

            /* renamed from: h */
            private final Runnable f25491h;

            public b(Runnable runnable) {
                this.f25491h = (Runnable) e3.w.checkNotNull(runnable);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f25491h.run();
                } catch (Error | RuntimeException e8) {
                    setException(e8);
                    throw e8;
                }
            }

            @Override // com.google.common.util.concurrent.AbstractC5162b
            protected String y() {
                return "task=[" + this.f25491h + "]";
            }
        }

        e(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f25489b = (ScheduledExecutorService) e3.w.checkNotNull(scheduledExecutorService);
        }

        @Override // com.google.common.util.concurrent.F, java.util.concurrent.ScheduledExecutorService
        public D scheduleAtFixedRate(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f25489b.scheduleAtFixedRate(bVar, j8, j9, timeUnit));
        }

        @Override // com.google.common.util.concurrent.F, java.util.concurrent.ScheduledExecutorService
        public D scheduleWithFixedDelay(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f25489b.scheduleWithFixedDelay(bVar, j8, j9, timeUnit));
        }

        @Override // com.google.common.util.concurrent.F, java.util.concurrent.ScheduledExecutorService
        public D schedule(Runnable runnable, long j8, TimeUnit timeUnit) {
            P pD = P.D(runnable, null);
            return new a(pD, this.f25489b.schedule(pD, j8, timeUnit));
        }

        @Override // com.google.common.util.concurrent.F, java.util.concurrent.ScheduledExecutorService
        public <V> D schedule(Callable<V> callable, long j8, TimeUnit timeUnit) {
            P pE = P.E(callable);
            return new a(pE, this.f25489b.schedule(pE, j8, timeUnit));
        }
    }

    public static void addDelayedShutdownHook(ExecutorService executorService, long j8, TimeUnit timeUnit) {
        new b().a(executorService, j8, timeUnit);
    }

    private static boolean b() throws ClassNotFoundException {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            Class.forName("com.google.appengine.api.utils.SystemProperty");
            return Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", null).invoke(null, null) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    static Thread c(String str, Runnable runnable) {
        e3.w.checkNotNull(str);
        e3.w.checkNotNull(runnable);
        Thread threadNewThread = platformThreadFactory().newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        try {
            threadNewThread.setName(str);
        } catch (SecurityException unused) {
        }
        return threadNewThread;
    }

    static Executor d(Executor executor, AbstractC5162b abstractC5162b) {
        e3.w.checkNotNull(executor);
        e3.w.checkNotNull(abstractC5162b);
        return executor == directExecutor() ? executor : new a(executor, abstractC5162b);
    }

    public static Executor directExecutor() {
        return EnumC5173m.INSTANCE;
    }

    public static void e(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setThreadFactory(new N().setDaemon(true).setThreadFactory(threadPoolExecutor.getThreadFactory()).build());
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor, long j8, TimeUnit timeUnit) {
        return new b().d(threadPoolExecutor, j8, timeUnit);
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j8, TimeUnit timeUnit) {
        return new b().f(scheduledThreadPoolExecutor, j8, timeUnit);
    }

    public static E listeningDecorator(ExecutorService executorService) {
        if (executorService instanceof E) {
            return (E) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new e((ScheduledExecutorService) executorService) : new d(executorService);
    }

    public static E newDirectExecutorService() {
        return new c(null);
    }

    public static Executor newSequentialExecutor(Executor executor) {
        return new L(executor);
    }

    public static ThreadFactory platformThreadFactory() {
        if (!b()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", null).invoke(null, null);
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e8);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e10);
        } catch (InvocationTargetException e11) {
            throw e3.F.propagate(e11.getCause());
        }
    }

    public static boolean shutdownAndAwaitTermination(ExecutorService executorService, long j8, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j8) / 2;
        executorService.shutdown();
        try {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (!executorService.awaitTermination(nanos, timeUnit2)) {
                executorService.shutdownNow();
                executorService.awaitTermination(nanos, timeUnit2);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor) {
        return new b().c(threadPoolExecutor);
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return new b().e(scheduledThreadPoolExecutor);
    }

    private static final class c extends AbstractC5163c {

        /* renamed from: a */
        private final Object f25485a;

        /* renamed from: b */
        private int f25486b;

        /* renamed from: c */
        private boolean f25487c;

        private c() {
            this.f25485a = new Object();
            this.f25486b = 0;
            this.f25487c = false;
        }

        private void a() {
            synchronized (this.f25485a) {
                try {
                    int i8 = this.f25486b - 1;
                    this.f25486b = i8;
                    if (i8 == 0) {
                        this.f25485a.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void b() {
            synchronized (this.f25485a) {
                try {
                    if (this.f25487c) {
                        throw new RejectedExecutionException("Executor already shutdown");
                    }
                    this.f25486b++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j8, TimeUnit timeUnit) {
            long nanos = timeUnit.toNanos(j8);
            synchronized (this.f25485a) {
                while (true) {
                    try {
                        if (this.f25487c && this.f25486b == 0) {
                            return true;
                        }
                        if (nanos <= 0) {
                            return false;
                        }
                        long jNanoTime = System.nanoTime();
                        TimeUnit.NANOSECONDS.timedWait(this.f25485a, nanos);
                        nanos -= System.nanoTime() - jNanoTime;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b();
            try {
                runnable.run();
            } finally {
                a();
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            boolean z8;
            synchronized (this.f25485a) {
                z8 = this.f25487c;
            }
            return z8;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            boolean z8;
            synchronized (this.f25485a) {
                try {
                    z8 = this.f25487c && this.f25486b == 0;
                } finally {
                }
            }
            return z8;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            synchronized (this.f25485a) {
                try {
                    this.f25487c = true;
                    if (this.f25486b == 0) {
                        this.f25485a.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }

        /* synthetic */ c(G g8) {
            this();
        }
    }

    public static F listeningDecorator(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof F) {
            return (F) scheduledExecutorService;
        }
        return new e(scheduledExecutorService);
    }
}
