package t7;

import R6.q;
import R6.r;
import W6.d;
import W6.g;
import Y6.h;
import f7.l;
import f7.p;
import kotlin.jvm.internal.TypeIntrinsics;
import n7.C0;
import n7.C5966B;
import n7.S0;
import s7.G;
import s7.O;

/* renamed from: t7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6369b {
    public static final <T> void startCoroutineUndispatched(l lVar, d<? super T> dVar) {
        d dVarProbeCoroutineCreated = h.probeCoroutineCreated(dVar);
        try {
            g context = dVar.getContext();
            Object objUpdateThreadContext = O.updateThreadContext(context, null);
            try {
                Object objInvoke = ((l) TypeIntrinsics.beforeCheckcastToFunctionOfArity(lVar, 1)).invoke(dVarProbeCoroutineCreated);
                if (objInvoke != X6.b.getCOROUTINE_SUSPENDED()) {
                    dVarProbeCoroutineCreated.resumeWith(q.m67constructorimpl(objInvoke));
                }
            } finally {
                O.restoreThreadContext(context, objUpdateThreadContext);
            }
        } catch (Throwable th) {
            q.a aVar = q.Companion;
            dVarProbeCoroutineCreated.resumeWith(q.m67constructorimpl(r.createFailure(th)));
        }
    }

    public static final <T> void startCoroutineUnintercepted(l lVar, d<? super T> dVar) {
        d dVarProbeCoroutineCreated = h.probeCoroutineCreated(dVar);
        try {
            Object objInvoke = ((l) TypeIntrinsics.beforeCheckcastToFunctionOfArity(lVar, 1)).invoke(dVarProbeCoroutineCreated);
            if (objInvoke != X6.b.getCOROUTINE_SUSPENDED()) {
                dVarProbeCoroutineCreated.resumeWith(q.m67constructorimpl(objInvoke));
            }
        } catch (Throwable th) {
            q.a aVar = q.Companion;
            dVarProbeCoroutineCreated.resumeWith(q.m67constructorimpl(r.createFailure(th)));
        }
    }

    public static final <T, R> Object startUndispatchedOrReturn(G g8, R r8, p pVar) {
        Object c5966b;
        int i8 = 2;
        try {
            c5966b = ((p) TypeIntrinsics.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(r8, g8);
        } catch (Throwable th) {
            c5966b = new C5966B(th, false, i8, null);
        }
        if (c5966b == X6.b.getCOROUTINE_SUSPENDED()) {
            return X6.b.getCOROUTINE_SUSPENDED();
        }
        Object objMakeCompletingOnce$kotlinx_coroutines_core = g8.makeCompletingOnce$kotlinx_coroutines_core(c5966b);
        if (objMakeCompletingOnce$kotlinx_coroutines_core == C0.COMPLETING_WAITING_CHILDREN) {
            return X6.b.getCOROUTINE_SUSPENDED();
        }
        if (objMakeCompletingOnce$kotlinx_coroutines_core instanceof C5966B) {
            throw ((C5966B) objMakeCompletingOnce$kotlinx_coroutines_core).cause;
        }
        return C0.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
    }

    public static final <T, R> Object startUndispatchedOrReturnIgnoreTimeout(G g8, R r8, p pVar) throws Throwable {
        Object c5966b;
        int i8 = 2;
        try {
            c5966b = ((p) TypeIntrinsics.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(r8, g8);
        } catch (Throwable th) {
            c5966b = new C5966B(th, false, i8, null);
        }
        if (c5966b == X6.b.getCOROUTINE_SUSPENDED()) {
            return X6.b.getCOROUTINE_SUSPENDED();
        }
        Object objMakeCompletingOnce$kotlinx_coroutines_core = g8.makeCompletingOnce$kotlinx_coroutines_core(c5966b);
        if (objMakeCompletingOnce$kotlinx_coroutines_core == C0.COMPLETING_WAITING_CHILDREN) {
            return X6.b.getCOROUTINE_SUSPENDED();
        }
        if (objMakeCompletingOnce$kotlinx_coroutines_core instanceof C5966B) {
            Throwable th2 = ((C5966B) objMakeCompletingOnce$kotlinx_coroutines_core).cause;
            if (!(th2 instanceof S0) || ((S0) th2).coroutine != g8) {
                throw th2;
            }
            if (c5966b instanceof C5966B) {
                throw ((C5966B) c5966b).cause;
            }
        } else {
            c5966b = C0.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
        }
        return c5966b;
    }

    public static final <R, T> void startCoroutineUndispatched(p pVar, R r8, d<? super T> dVar) {
        d dVarProbeCoroutineCreated = h.probeCoroutineCreated(dVar);
        try {
            g context = dVar.getContext();
            Object objUpdateThreadContext = O.updateThreadContext(context, null);
            try {
                Object objInvoke = ((p) TypeIntrinsics.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(r8, dVarProbeCoroutineCreated);
                if (objInvoke != X6.b.getCOROUTINE_SUSPENDED()) {
                    dVarProbeCoroutineCreated.resumeWith(q.m67constructorimpl(objInvoke));
                }
            } finally {
                O.restoreThreadContext(context, objUpdateThreadContext);
            }
        } catch (Throwable th) {
            q.a aVar = q.Companion;
            dVarProbeCoroutineCreated.resumeWith(q.m67constructorimpl(r.createFailure(th)));
        }
    }
}
