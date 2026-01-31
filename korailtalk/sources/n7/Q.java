package n7;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import n7.AbstractC5983g0;

/* loaded from: classes3.dex */
public final class Q extends AbstractC5983g0 implements Runnable {
    public static final Q INSTANCE;
    public static final String THREAD_NAME = "kotlinx.coroutines.DefaultExecutor";
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h */
    private static final long f34310h;

    static {
        Long l8;
        Q q8 = new Q();
        INSTANCE = q8;
        AbstractC5981f0.incrementUseCount$default(q8, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l8 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l8 = 1000L;
        }
        f34310h = timeUnit.toNanos(l8.longValue());
    }

    private Q() {
    }

    private final synchronized void r() {
        if (u()) {
            debugStatus = 3;
            m();
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread s() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, THREAD_NAME);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean t() {
        return debugStatus == 4;
    }

    private final boolean u() {
        int i8 = debugStatus;
        return i8 == 2 || i8 == 3;
    }

    private final synchronized boolean v() {
        if (u()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void w() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // n7.AbstractC5985h0
    protected Thread e() {
        Thread thread = _thread;
        return thread == null ? s() : thread;
    }

    @Override // n7.AbstractC5983g0
    public void enqueue(Runnable runnable) {
        if (t()) {
            w();
        }
        super.enqueue(runnable);
    }

    public final synchronized void ensureStarted$kotlinx_coroutines_core() {
        debugStatus = 0;
        s();
        while (debugStatus == 0) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    @Override // n7.AbstractC5985h0
    protected void f(long j8, AbstractC5983g0.c cVar) {
        w();
    }

    @Override // n7.AbstractC5983g0, n7.V
    public InterfaceC5973b0 invokeOnTimeout(long j8, Runnable runnable, W6.g gVar) {
        return o(j8, runnable);
    }

    public final boolean isThreadPresent$kotlinx_coroutines_core() {
        return _thread != null;
    }

    @Override // java.lang.Runnable
    public void run() {
        R6.G g8;
        R0.INSTANCE.setEventLoop$kotlinx_coroutines_core(this);
        AbstractC5972b timeSource = AbstractC5974c.getTimeSource();
        if (timeSource != null) {
            timeSource.registerTimeLoopThread();
        }
        try {
            if (!v()) {
                _thread = null;
                r();
                AbstractC5972b timeSource2 = AbstractC5974c.getTimeSource();
                if (timeSource2 != null) {
                    timeSource2.unregisterTimeLoopThread();
                }
                if (k()) {
                    return;
                }
                e();
                return;
            }
            long j8 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jProcessNextEvent = processNextEvent();
                if (jProcessNextEvent == Long.MAX_VALUE) {
                    AbstractC5972b timeSource3 = AbstractC5974c.getTimeSource();
                    long jNanoTime = timeSource3 != null ? timeSource3.nanoTime() : System.nanoTime();
                    if (j8 == Long.MAX_VALUE) {
                        j8 = f34310h + jNanoTime;
                    }
                    long j9 = j8 - jNanoTime;
                    if (j9 <= 0) {
                        _thread = null;
                        r();
                        AbstractC5972b timeSource4 = AbstractC5974c.getTimeSource();
                        if (timeSource4 != null) {
                            timeSource4.unregisterTimeLoopThread();
                        }
                        if (k()) {
                            return;
                        }
                        e();
                        return;
                    }
                    jProcessNextEvent = j7.s.coerceAtMost(jProcessNextEvent, j9);
                } else {
                    j8 = Long.MAX_VALUE;
                }
                if (jProcessNextEvent > 0) {
                    if (u()) {
                        _thread = null;
                        r();
                        AbstractC5972b timeSource5 = AbstractC5974c.getTimeSource();
                        if (timeSource5 != null) {
                            timeSource5.unregisterTimeLoopThread();
                        }
                        if (k()) {
                            return;
                        }
                        e();
                        return;
                    }
                    AbstractC5972b timeSource6 = AbstractC5974c.getTimeSource();
                    if (timeSource6 != null) {
                        timeSource6.parkNanos(this, jProcessNextEvent);
                        g8 = R6.G.INSTANCE;
                    } else {
                        g8 = null;
                    }
                    if (g8 == null) {
                        LockSupport.parkNanos(this, jProcessNextEvent);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            r();
            AbstractC5972b timeSource7 = AbstractC5974c.getTimeSource();
            if (timeSource7 != null) {
                timeSource7.unregisterTimeLoopThread();
            }
            if (!k()) {
                e();
            }
            throw th;
        }
    }

    @Override // n7.AbstractC5983g0, n7.AbstractC5981f0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void shutdownForTests(long j8) {
        R6.G g8;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() + j8;
            if (!u()) {
                debugStatus = 2;
            }
            while (debugStatus != 3 && _thread != null) {
                Thread thread = _thread;
                if (thread != null) {
                    AbstractC5972b timeSource = AbstractC5974c.getTimeSource();
                    if (timeSource != null) {
                        timeSource.unpark(thread);
                        g8 = R6.G.INSTANCE;
                    } else {
                        g8 = null;
                    }
                    if (g8 == null) {
                        LockSupport.unpark(thread);
                    }
                }
                if (jCurrentTimeMillis - System.currentTimeMillis() <= 0) {
                    break;
                }
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                wait(j8);
            }
            debugStatus = 0;
        } catch (Throwable th) {
            throw th;
        }
    }
}
