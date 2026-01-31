package n7;

import s7.AbstractC6252m;
import s7.C6251l;

/* loaded from: classes3.dex */
public abstract class Y0 {
    public static final Object yield(W6.d<? super R6.G> dVar) {
        Object coroutine_suspended;
        W6.g context = dVar.getContext();
        AbstractC6016x0.ensureActive(context);
        W6.d dVarIntercepted = X6.b.intercepted(dVar);
        C6251l c6251l = dVarIntercepted instanceof C6251l ? (C6251l) dVarIntercepted : null;
        if (c6251l == null) {
            coroutine_suspended = R6.G.INSTANCE;
        } else {
            if (c6251l.dispatcher.isDispatchNeeded(context)) {
                c6251l.dispatchYield$kotlinx_coroutines_core(context, R6.G.INSTANCE);
            } else {
                X0 x02 = new X0();
                W6.g gVarPlus = context.plus(x02);
                R6.G g8 = R6.G.INSTANCE;
                c6251l.dispatchYield$kotlinx_coroutines_core(gVarPlus, g8);
                coroutine_suspended = (!x02.dispatcherWasUnconfined || AbstractC6252m.yieldUndispatched(c6251l)) ? X6.b.getCOROUTINE_SUSPENDED() : g8;
            }
            coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
        }
        if (coroutine_suspended == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return coroutine_suspended == X6.b.getCOROUTINE_SUSPENDED() ? coroutine_suspended : R6.G.INSTANCE;
    }
}
