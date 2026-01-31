package n7;

import java.util.concurrent.CancellationException;
import s7.C6246g;
import t7.AbstractC6369b;

/* loaded from: classes3.dex */
public abstract class M {
    public static final L CoroutineScope(W6.g gVar) {
        if (gVar.get(InterfaceC6008t0.Key) == null) {
            gVar = gVar.plus(z0.m531Job$default((InterfaceC6008t0) null, 1, (Object) null));
        }
        return new C6246g(gVar);
    }

    public static final L MainScope() {
        return new C6246g(P0.m525SupervisorJob$default((InterfaceC6008t0) null, 1, (Object) null).plus(C5971a0.getMain()));
    }

    public static final void cancel(L l8, CancellationException cancellationException) {
        InterfaceC6008t0 interfaceC6008t0 = (InterfaceC6008t0) l8.getCoroutineContext().get(InterfaceC6008t0.Key);
        if (interfaceC6008t0 != null) {
            interfaceC6008t0.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + l8).toString());
    }

    public static /* synthetic */ void cancel$default(L l8, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        cancel(l8, cancellationException);
    }

    public static final <R> Object coroutineScope(f7.p pVar, W6.d<? super R> dVar) {
        s7.G g8 = new s7.G(dVar.getContext(), dVar);
        Object objStartUndispatchedOrReturn = AbstractC6369b.startUndispatchedOrReturn(g8, g8, pVar);
        if (objStartUndispatchedOrReturn == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return objStartUndispatchedOrReturn;
    }

    public static final Object currentCoroutineContext(W6.d<? super W6.g> dVar) {
        return dVar.getContext();
    }

    public static final void ensureActive(L l8) {
        AbstractC6016x0.ensureActive(l8.getCoroutineContext());
    }

    public static final boolean isActive(L l8) {
        InterfaceC6008t0 interfaceC6008t0 = (InterfaceC6008t0) l8.getCoroutineContext().get(InterfaceC6008t0.Key);
        if (interfaceC6008t0 != null) {
            return interfaceC6008t0.isActive();
        }
        return true;
    }

    public static final L plus(L l8, W6.g gVar) {
        return new C6246g(l8.getCoroutineContext().plus(gVar));
    }

    public static /* synthetic */ void cancel$default(L l8, String str, Throwable th, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            th = null;
        }
        cancel(l8, str, th);
    }

    public static final void cancel(L l8, String str, Throwable th) {
        cancel(l8, AbstractC5991k0.CancellationException(str, th));
    }

    public static /* synthetic */ void isActive$annotations(L l8) {
    }
}
