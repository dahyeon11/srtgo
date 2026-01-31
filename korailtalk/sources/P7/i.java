package P7;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class i extends x {

    /* renamed from: d, reason: collision with root package name */
    private x f3785d;

    public i(x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f3785d = xVar;
    }

    @Override // P7.x
    public x clearDeadline() {
        return this.f3785d.clearDeadline();
    }

    @Override // P7.x
    public x clearTimeout() {
        return this.f3785d.clearTimeout();
    }

    @Override // P7.x
    public long deadlineNanoTime() {
        return this.f3785d.deadlineNanoTime();
    }

    public final x delegate() {
        return this.f3785d;
    }

    @Override // P7.x
    public boolean hasDeadline() {
        return this.f3785d.hasDeadline();
    }

    public final i setDelegate(x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f3785d = xVar;
        return this;
    }

    @Override // P7.x
    public void throwIfReached() throws InterruptedIOException {
        this.f3785d.throwIfReached();
    }

    @Override // P7.x
    public x timeout(long j8, TimeUnit timeUnit) {
        return this.f3785d.timeout(j8, timeUnit);
    }

    @Override // P7.x
    public long timeoutNanos() {
        return this.f3785d.timeoutNanos();
    }

    @Override // P7.x
    public x deadlineNanoTime(long j8) {
        return this.f3785d.deadlineNanoTime(j8);
    }
}
