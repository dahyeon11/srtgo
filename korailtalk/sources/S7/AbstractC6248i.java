package s7;

import R6.AbstractC0747a;
import java.util.Iterator;

/* renamed from: s7.i */
/* loaded from: classes3.dex */
public abstract class AbstractC6248i {
    public static final void handleUncaughtCoroutineException(W6.g gVar, Throwable th) {
        Iterator<n7.J> it = AbstractC6247h.getPlatformExceptionHandlers().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(gVar, th);
            } catch (C6253n unused) {
                return;
            } catch (Throwable th2) {
                AbstractC6247h.propagateExceptionFinalResort(n7.K.handlerException(th, th2));
            }
        }
        try {
            AbstractC0747a.addSuppressed(th, new C6250k(gVar));
        } catch (Throwable unused2) {
        }
        AbstractC6247h.propagateExceptionFinalResort(th);
    }
}
