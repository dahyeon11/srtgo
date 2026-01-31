package n7;

import s7.C6251l;

/* renamed from: n7.q */
/* loaded from: classes3.dex */
public abstract class AbstractC6002q {
    public static final void disposeOnCancellation(InterfaceC5996n interfaceC5996n, InterfaceC5973b0 interfaceC5973b0) {
        interfaceC5996n.invokeOnCancellation(new C5975c0(interfaceC5973b0));
    }

    public static final <T> C5998o getOrCreateCancellableContinuation(W6.d<? super T> dVar) {
        if (!(dVar instanceof C6251l)) {
            return new C5998o(dVar, 1);
        }
        C5998o c5998oClaimReusableCancellableContinuation = ((C6251l) dVar).claimReusableCancellableContinuation();
        if (c5998oClaimReusableCancellableContinuation != null) {
            if (!c5998oClaimReusableCancellableContinuation.resetStateReusable()) {
                c5998oClaimReusableCancellableContinuation = null;
            }
            if (c5998oClaimReusableCancellableContinuation != null) {
                return c5998oClaimReusableCancellableContinuation;
            }
        }
        return new C5998o(dVar, 2);
    }

    public static final <T> Object suspendCancellableCoroutine(f7.l lVar, W6.d<? super T> dVar) {
        C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
        c5998o.initCancellability();
        lVar.invoke(c5998o);
        Object result = c5998o.getResult();
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public static final <T> Object suspendCancellableCoroutineReusable(f7.l lVar, W6.d<? super T> dVar) {
        C5998o orCreateCancellableContinuation = getOrCreateCancellableContinuation(X6.b.intercepted(dVar));
        try {
            lVar.invoke(orCreateCancellableContinuation);
            Object result = orCreateCancellableContinuation.getResult();
            if (result == X6.b.getCOROUTINE_SUSPENDED()) {
                Y6.h.probeCoroutineSuspended(dVar);
            }
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }
}
