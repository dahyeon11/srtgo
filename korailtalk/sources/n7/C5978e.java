package n7;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5978e extends AbstractC5970a {

    /* renamed from: d, reason: collision with root package name */
    private final Thread f34325d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5981f0 f34326e;

    public C5978e(W6.g gVar, Thread thread, AbstractC5981f0 abstractC5981f0) {
        super(gVar, true, true);
        this.f34325d = thread;
        this.f34326e = abstractC5981f0;
    }

    @Override // n7.B0
    protected void f(Object obj) {
        R6.G g8;
        if (Intrinsics.areEqual(Thread.currentThread(), this.f34325d)) {
            return;
        }
        Thread thread = this.f34325d;
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

    public final Object joinBlocking() throws Throwable {
        R6.G g8;
        AbstractC5972b timeSource = AbstractC5974c.getTimeSource();
        if (timeSource != null) {
            timeSource.registerTimeLoopThread();
        }
        try {
            AbstractC5981f0 abstractC5981f0 = this.f34326e;
            if (abstractC5981f0 != null) {
                AbstractC5981f0.incrementUseCount$default(abstractC5981f0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC5981f0 abstractC5981f02 = this.f34326e;
                    long jProcessNextEvent = abstractC5981f02 != null ? abstractC5981f02.processNextEvent() : Long.MAX_VALUE;
                    if (isCompleted()) {
                        AbstractC5981f0 abstractC5981f03 = this.f34326e;
                        if (abstractC5981f03 != null) {
                            AbstractC5981f0.decrementUseCount$default(abstractC5981f03, false, 1, null);
                        }
                        Object objUnboxState = C0.unboxState(getState$kotlinx_coroutines_core());
                        C5966B c5966b = objUnboxState instanceof C5966B ? (C5966B) objUnboxState : null;
                        if (c5966b == null) {
                            return objUnboxState;
                        }
                        throw c5966b.cause;
                    }
                    AbstractC5972b timeSource2 = AbstractC5974c.getTimeSource();
                    if (timeSource2 != null) {
                        timeSource2.parkNanos(this, jProcessNextEvent);
                        g8 = R6.G.INSTANCE;
                    } else {
                        g8 = null;
                    }
                    if (g8 == null) {
                        LockSupport.parkNanos(this, jProcessNextEvent);
                    }
                } catch (Throwable th) {
                    AbstractC5981f0 abstractC5981f04 = this.f34326e;
                    if (abstractC5981f04 != null) {
                        AbstractC5981f0.decrementUseCount$default(abstractC5981f04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            cancelCoroutine(interruptedException);
            throw interruptedException;
        } finally {
            AbstractC5972b timeSource3 = AbstractC5974c.getTimeSource();
            if (timeSource3 != null) {
                timeSource3.unregisterTimeLoopThread();
            }
        }
    }

    @Override // n7.B0
    protected boolean w() {
        return true;
    }
}
