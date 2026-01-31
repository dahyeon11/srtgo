package n7;

import W6.e;
import kotlin.jvm.internal.Intrinsics;
import t7.AbstractC6368a;
import t7.AbstractC6369b;

/* renamed from: n7.i */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5986i {
    public static final <T> T async(L l8, W6.g gVar, N n8, f7.p pVar) {
        W6.g gVarNewCoroutineContext = H.newCoroutineContext(l8, gVar);
        U d02 = n8.isLazy() ? new D0(gVarNewCoroutineContext, pVar) : new U(gVarNewCoroutineContext, true);
        d02.start(n8, d02, pVar);
        return d02;
    }

    public static /* synthetic */ T async$default(L l8, W6.g gVar, N n8, f7.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = W6.h.INSTANCE;
        }
        if ((i8 & 2) != 0) {
            n8 = N.DEFAULT;
        }
        return AbstractC5982g.async(l8, gVar, n8, pVar);
    }

    public static final <T> Object invoke(I i8, f7.p pVar, W6.d<? super T> dVar) {
        return AbstractC5982g.withContext(i8, pVar, dVar);
    }

    public static final InterfaceC6008t0 launch(L l8, W6.g gVar, N n8, f7.p pVar) {
        W6.g gVarNewCoroutineContext = H.newCoroutineContext(l8, gVar);
        AbstractC5970a e02 = n8.isLazy() ? new E0(gVarNewCoroutineContext, pVar) : new M0(gVarNewCoroutineContext, true);
        e02.start(n8, e02, pVar);
        return e02;
    }

    public static /* synthetic */ InterfaceC6008t0 launch$default(L l8, W6.g gVar, N n8, f7.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = W6.h.INSTANCE;
        }
        if ((i8 & 2) != 0) {
            n8 = N.DEFAULT;
        }
        return AbstractC5982g.launch(l8, gVar, n8, pVar);
    }

    public static final <T> Object withContext(W6.g gVar, f7.p pVar, W6.d<? super T> dVar) throws Throwable {
        Object result;
        W6.g context = dVar.getContext();
        W6.g gVarNewCoroutineContext = H.newCoroutineContext(context, gVar);
        AbstractC6016x0.ensureActive(gVarNewCoroutineContext);
        if (gVarNewCoroutineContext == context) {
            s7.G g8 = new s7.G(gVarNewCoroutineContext, dVar);
            result = AbstractC6369b.startUndispatchedOrReturn(g8, g8, pVar);
        } else {
            e.b bVar = W6.e.Key;
            if (Intrinsics.areEqual(gVarNewCoroutineContext.get(bVar), context.get(bVar))) {
                U0 u02 = new U0(gVarNewCoroutineContext, dVar);
                W6.g context2 = u02.getContext();
                Object objUpdateThreadContext = s7.O.updateThreadContext(context2, null);
                try {
                    Object objStartUndispatchedOrReturn = AbstractC6369b.startUndispatchedOrReturn(u02, u02, pVar);
                    s7.O.restoreThreadContext(context2, objUpdateThreadContext);
                    result = objStartUndispatchedOrReturn;
                } catch (Throwable th) {
                    s7.O.restoreThreadContext(context2, objUpdateThreadContext);
                    throw th;
                }
            } else {
                X x8 = new X(gVarNewCoroutineContext, dVar);
                AbstractC6368a.startCoroutineCancellable$default(pVar, x8, x8, null, 4, null);
                result = x8.getResult();
            }
        }
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }
}
