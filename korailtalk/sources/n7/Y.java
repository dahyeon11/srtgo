package n7;

import R6.AbstractC0747a;
import R6.q;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import s7.C6251l;

/* loaded from: classes3.dex */
public abstract class Y extends u7.h {
    public int resumeMode;

    public Y(int i8) {
        this.resumeMode = i8;
    }

    public abstract W6.d<Object> getDelegate$kotlinx_coroutines_core();

    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        C5966B c5966b = obj instanceof C5966B ? (C5966B) obj : null;
        if (c5966b != null) {
            return c5966b.cause;
        }
        return null;
    }

    public final void handleFatalException(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0747a.addSuppressed(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.checkNotNull(th);
        K.handleCoroutineException(getDelegate$kotlinx_coroutines_core().getContext(), new O("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objM67constructorimpl;
        Object objM67constructorimpl2;
        u7.i iVar = this.taskContext;
        try {
            W6.d<Object> delegate$kotlinx_coroutines_core = getDelegate$kotlinx_coroutines_core();
            Intrinsics.checkNotNull(delegate$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C6251l c6251l = (C6251l) delegate$kotlinx_coroutines_core;
            W6.d<Object> dVar = c6251l.continuation;
            Object obj = c6251l.countOrElement;
            W6.g context = dVar.getContext();
            Object objUpdateThreadContext = s7.O.updateThreadContext(context, obj);
            U0 u0UpdateUndispatchedCompletion = objUpdateThreadContext != s7.O.NO_THREAD_ELEMENTS ? H.updateUndispatchedCompletion(dVar, context, objUpdateThreadContext) : null;
            try {
                W6.g context2 = dVar.getContext();
                Object objTakeState$kotlinx_coroutines_core = takeState$kotlinx_coroutines_core();
                Throwable exceptionalResult$kotlinx_coroutines_core = getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
                InterfaceC6008t0 interfaceC6008t0 = (exceptionalResult$kotlinx_coroutines_core == null && Z.isCancellableMode(this.resumeMode)) ? (InterfaceC6008t0) context2.get(InterfaceC6008t0.Key) : null;
                if (interfaceC6008t0 != null && !interfaceC6008t0.isActive()) {
                    CancellationException cancellationException = interfaceC6008t0.getCancellationException();
                    cancelCompletedResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core, cancellationException);
                    q.a aVar = R6.q.Companion;
                    dVar.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(cancellationException)));
                } else if (exceptionalResult$kotlinx_coroutines_core != null) {
                    q.a aVar2 = R6.q.Companion;
                    dVar.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(exceptionalResult$kotlinx_coroutines_core)));
                } else {
                    q.a aVar3 = R6.q.Companion;
                    dVar.resumeWith(R6.q.m67constructorimpl(getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core)));
                }
                R6.G g8 = R6.G.INSTANCE;
                if (u0UpdateUndispatchedCompletion == null || u0UpdateUndispatchedCompletion.clearThreadContext()) {
                    s7.O.restoreThreadContext(context, objUpdateThreadContext);
                }
                try {
                    iVar.afterTask();
                    objM67constructorimpl2 = R6.q.m67constructorimpl(R6.G.INSTANCE);
                } catch (Throwable th) {
                    q.a aVar4 = R6.q.Companion;
                    objM67constructorimpl2 = R6.q.m67constructorimpl(R6.r.createFailure(th));
                }
                handleFatalException(null, R6.q.m70exceptionOrNullimpl(objM67constructorimpl2));
            } catch (Throwable th2) {
                if (u0UpdateUndispatchedCompletion == null || u0UpdateUndispatchedCompletion.clearThreadContext()) {
                    s7.O.restoreThreadContext(context, objUpdateThreadContext);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                q.a aVar5 = R6.q.Companion;
                iVar.afterTask();
                objM67constructorimpl = R6.q.m67constructorimpl(R6.G.INSTANCE);
            } catch (Throwable th4) {
                q.a aVar6 = R6.q.Companion;
                objM67constructorimpl = R6.q.m67constructorimpl(R6.r.createFailure(th4));
            }
            handleFatalException(th3, R6.q.m70exceptionOrNullimpl(objM67constructorimpl));
        }
    }

    public abstract Object takeState$kotlinx_coroutines_core();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj;
    }

    public void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
    }
}
