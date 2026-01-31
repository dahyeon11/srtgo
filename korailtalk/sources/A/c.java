package A;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.C;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class c extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal f5b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Handler f6a;

    class a extends ThreadLocal {
        a() {
        }

        @Override // java.lang.ThreadLocal
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return A.a.mainThreadExecutor();
            }
            if (Looper.myLooper() != null) {
                return new c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f7a;

        b(Runnable runnable) {
            this.f7a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            this.f7a.run();
            return null;
        }
    }

    /* renamed from: A.c$c, reason: collision with other inner class name */
    private static class RunnableScheduledFutureC0000c implements RunnableScheduledFuture {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference f9a = new AtomicReference(null);

        /* renamed from: b, reason: collision with root package name */
        private final long f10b;

        /* renamed from: c, reason: collision with root package name */
        private final Callable f11c;

        /* renamed from: d, reason: collision with root package name */
        private final C f12d;

        /* renamed from: A.c$c$a */
        class a implements c.InterfaceC0123c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Handler f13a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable f14b;

            /* renamed from: A.c$c$a$a, reason: collision with other inner class name */
            class RunnableC0001a implements Runnable {
                RunnableC0001a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableScheduledFutureC0000c.this.f9a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f13a.removeCallbacks(RunnableScheduledFutureC0000c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                this.f13a = handler;
                this.f14b = callable;
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public Object attachCompleter(c.a aVar) {
                aVar.addCancellationListener(new RunnableC0001a(), A.a.directExecutor());
                RunnableScheduledFutureC0000c.this.f9a.set(aVar);
                return "HandlerScheduledFuture-" + this.f14b.toString();
            }
        }

        RunnableScheduledFutureC0000c(Handler handler, long j8, Callable callable) {
            this.f10b = j8;
            this.f11c = callable;
            this.f12d = androidx.concurrent.futures.c.getFuture(new a(handler, callable));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z8) {
            return this.f12d.cancel(z8);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f12d.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f10b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f12d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f12d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            c.a aVar = (c.a) this.f9a.getAndSet(null);
            if (aVar != null) {
                try {
                    aVar.set(this.f11c.call());
                } catch (Exception e8) {
                    aVar.setException(e8);
                }
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public Object get(long j8, TimeUnit timeUnit) {
            return this.f12d.get(j8, timeUnit);
        }
    }

    c(Handler handler) {
        this.f6a = handler;
    }

    private RejectedExecutionException a() {
        return new RejectedExecutionException(this.f6a + " is shutting down");
    }

    static ScheduledExecutorService b() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f5b.get();
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException("Current thread has no looper!");
        }
        c cVar = new c(new Handler(looperMyLooper));
        f5b.set(cVar);
        return cVar;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f6a.post(runnable)) {
            throw a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j8, TimeUnit timeUnit) {
        return schedule(new b(runnable), j8, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j8, TimeUnit timeUnit) {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j8, timeUnit);
        RunnableScheduledFutureC0000c runnableScheduledFutureC0000c = new RunnableScheduledFutureC0000c(this.f6a, jUptimeMillis, callable);
        return this.f6a.postAtTime(runnableScheduledFutureC0000c, jUptimeMillis) ? runnableScheduledFutureC0000c : B.f.immediateFailedScheduledFuture(a());
    }
}
