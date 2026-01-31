package P7;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class x {
    public static final x NONE = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f3824a;

    /* renamed from: b, reason: collision with root package name */
    private long f3825b;

    /* renamed from: c, reason: collision with root package name */
    private long f3826c;

    public x clearDeadline() {
        this.f3824a = false;
        return this;
    }

    public x clearTimeout() {
        this.f3826c = 0L;
        return this;
    }

    public final x deadline(long j8, TimeUnit timeUnit) {
        if (j8 > 0) {
            if (timeUnit != null) {
                return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j8));
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException("duration <= 0: " + j8);
    }

    public long deadlineNanoTime() {
        if (this.f3824a) {
            return this.f3825b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.f3824a;
    }

    public void throwIfReached() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f3824a && this.f3825b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x timeout(long j8, TimeUnit timeUnit) {
        if (j8 >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f3826c = timeUnit.toNanos(j8);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j8);
    }

    public long timeoutNanos() {
        return this.f3826c;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedException, InterruptedIOException {
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            long jNanoTime = 0;
            if (!zHasDeadline && jTimeoutNanos == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (jTimeoutNanos > 0) {
                long j8 = jTimeoutNanos / 1000000;
                obj.wait(j8, (int) (jTimeoutNanos - (1000000 * j8)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jTimeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public x deadlineNanoTime(long j8) {
        this.f3824a = true;
        this.f3825b = j8;
        return this;
    }

    final class a extends x {
        a() {
        }

        @Override // P7.x
        public void throwIfReached() {
        }

        @Override // P7.x
        public x deadlineNanoTime(long j8) {
            return this;
        }

        @Override // P7.x
        public x timeout(long j8, TimeUnit timeUnit) {
            return this;
        }
    }
}
