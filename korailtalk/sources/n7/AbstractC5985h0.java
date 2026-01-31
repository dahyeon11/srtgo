package n7;

import java.util.concurrent.locks.LockSupport;
import n7.AbstractC5983g0;

/* renamed from: n7.h0 */
/* loaded from: classes3.dex */
public abstract class AbstractC5985h0 extends AbstractC5981f0 {
    protected abstract Thread e();

    protected void f(long j8, AbstractC5983g0.c cVar) {
        Q.INSTANCE.schedule(j8, cVar);
    }

    protected final void g() {
        R6.G g8;
        Thread threadE = e();
        if (Thread.currentThread() != threadE) {
            AbstractC5972b timeSource = AbstractC5974c.getTimeSource();
            if (timeSource != null) {
                timeSource.unpark(threadE);
                g8 = R6.G.INSTANCE;
            } else {
                g8 = null;
            }
            if (g8 == null) {
                LockSupport.unpark(threadE);
            }
        }
    }
}
