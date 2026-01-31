package n7;

import R6.q;
import f7.InterfaceC5519a;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import s7.C6251l;

/* loaded from: classes3.dex */
public abstract class Z {
    public static final int MODE_ATOMIC = 0;
    public static final int MODE_CANCELLABLE = 1;
    public static final int MODE_CANCELLABLE_REUSABLE = 2;
    public static final int MODE_UNDISPATCHED = 4;
    public static final int MODE_UNINITIALIZED = -1;

    private static final void a(Y y8) {
        AbstractC5981f0 eventLoop$kotlinx_coroutines_core = R0.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(y8);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            resume(y8, y8.getDelegate$kotlinx_coroutines_core(), true);
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final <T> void dispatch(Y y8, int i8) {
        W6.d<Object> delegate$kotlinx_coroutines_core = y8.getDelegate$kotlinx_coroutines_core();
        boolean z8 = i8 == 4;
        if (z8 || !(delegate$kotlinx_coroutines_core instanceof C6251l) || isCancellableMode(i8) != isCancellableMode(y8.resumeMode)) {
            resume(y8, delegate$kotlinx_coroutines_core, z8);
            return;
        }
        I i9 = ((C6251l) delegate$kotlinx_coroutines_core).dispatcher;
        W6.g context = delegate$kotlinx_coroutines_core.getContext();
        if (i9.isDispatchNeeded(context)) {
            i9.mo570dispatch(context, y8);
        } else {
            a(y8);
        }
    }

    public static final boolean isCancellableMode(int i8) {
        return i8 == 1 || i8 == 2;
    }

    public static final boolean isReusableMode(int i8) {
        return i8 == 2;
    }

    public static final <T> void resume(Y y8, W6.d<? super T> dVar, boolean z8) {
        Object successfulResult$kotlinx_coroutines_core;
        Object objTakeState$kotlinx_coroutines_core = y8.takeState$kotlinx_coroutines_core();
        Throwable exceptionalResult$kotlinx_coroutines_core = y8.getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            q.a aVar = R6.q.Companion;
            successfulResult$kotlinx_coroutines_core = R6.r.createFailure(exceptionalResult$kotlinx_coroutines_core);
        } else {
            q.a aVar2 = R6.q.Companion;
            successfulResult$kotlinx_coroutines_core = y8.getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        }
        Object objM67constructorimpl = R6.q.m67constructorimpl(successfulResult$kotlinx_coroutines_core);
        if (!z8) {
            dVar.resumeWith(objM67constructorimpl);
            return;
        }
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C6251l c6251l = (C6251l) dVar;
        W6.d<Object> dVar2 = c6251l.continuation;
        Object obj = c6251l.countOrElement;
        W6.g context = dVar2.getContext();
        Object objUpdateThreadContext = s7.O.updateThreadContext(context, obj);
        U0 u0UpdateUndispatchedCompletion = objUpdateThreadContext != s7.O.NO_THREAD_ELEMENTS ? H.updateUndispatchedCompletion(dVar2, context, objUpdateThreadContext) : null;
        try {
            c6251l.continuation.resumeWith(objM67constructorimpl);
            R6.G g8 = R6.G.INSTANCE;
        } finally {
            if (u0UpdateUndispatchedCompletion == null || u0UpdateUndispatchedCompletion.clearThreadContext()) {
                s7.O.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    public static final void resumeWithStackTrace(W6.d<?> dVar, Throwable th) {
        q.a aVar = R6.q.Companion;
        dVar.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(th)));
    }

    public static final void runUnconfinedEventLoop(Y y8, AbstractC5981f0 abstractC5981f0, InterfaceC5519a interfaceC5519a) {
        abstractC5981f0.incrementUseCount(true);
        try {
            interfaceC5519a.invoke();
            do {
            } while (abstractC5981f0.processUnconfinedEvent());
            InlineMarker.finallyStart(1);
        } catch (Throwable th) {
            try {
                y8.handleFatalException(th, null);
                InlineMarker.finallyStart(1);
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                abstractC5981f0.decrementUseCount(true);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        abstractC5981f0.decrementUseCount(true);
        InlineMarker.finallyEnd(1);
    }

    public static /* synthetic */ void getMODE_CANCELLABLE$annotations() {
    }
}
