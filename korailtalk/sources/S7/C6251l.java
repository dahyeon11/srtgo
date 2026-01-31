package s7;

import R6.q;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import n7.AbstractC5981f0;
import n7.C5967C;
import n7.C5998o;
import n7.InterfaceC5996n;
import n7.InterfaceC6008t0;
import n7.R0;
import n7.Y;

/* renamed from: s7.l */
/* loaded from: classes3.dex */
public final class C6251l extends Y implements Y6.e, W6.d {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f36347a = AtomicReferenceFieldUpdater.newUpdater(C6251l.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;
    public Object _state;
    public final W6.d<Object> continuation;
    public final Object countOrElement;
    public final n7.I dispatcher;

    public C6251l(n7.I i8, W6.d<Object> dVar) {
        super(-1);
        this.dispatcher = i8;
        this.continuation = dVar;
        this._state = AbstractC6252m.f36348a;
        this.countOrElement = O.threadContextElements(getContext());
    }

    private final C5998o a() {
        Object obj = f36347a.get(this);
        if (obj instanceof C5998o) {
            return (C5998o) obj;
        }
        return null;
    }

    public final void awaitReusability() {
        while (f36347a.get(this) == AbstractC6252m.REUSABLE_CLAIMED) {
        }
    }

    @Override // n7.Y
    public void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
        if (obj instanceof C5967C) {
            ((C5967C) obj).onCancellation.invoke(th);
        }
    }

    public final C5998o claimReusableCancellableContinuation() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36347a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f36347a.set(this, AbstractC6252m.REUSABLE_CLAIMED);
                return null;
            }
            if (obj instanceof C5998o) {
                if (androidx.concurrent.futures.b.a(f36347a, this, obj, AbstractC6252m.REUSABLE_CLAIMED)) {
                    return (C5998o) obj;
                }
            } else if (obj != AbstractC6252m.REUSABLE_CLAIMED && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void dispatchYield$kotlinx_coroutines_core(W6.g gVar, Object obj) {
        this._state = obj;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(gVar, this);
    }

    @Override // Y6.e
    public Y6.e getCallerFrame() {
        W6.d<Object> dVar = this.continuation;
        if (dVar instanceof Y6.e) {
            return (Y6.e) dVar;
        }
        return null;
    }

    @Override // W6.d
    public W6.g getContext() {
        return this.continuation.getContext();
    }

    @Override // Y6.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final boolean isReusable() {
        return f36347a.get(this) != null;
    }

    public final boolean postponeCancellation(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36347a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            K k8 = AbstractC6252m.REUSABLE_CLAIMED;
            if (Intrinsics.areEqual(obj, k8)) {
                if (androidx.concurrent.futures.b.a(f36347a, this, k8, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f36347a, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void release() {
        awaitReusability();
        C5998o c5998oA = a();
        if (c5998oA != null) {
            c5998oA.detachChild$kotlinx_coroutines_core();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x008c A[Catch: all -> 0x0062, DONT_GENERATE, TryCatch #1 {all -> 0x0062, blocks: (B:65:0x0039, B:67:0x0047, B:69:0x004d, B:84:0x0092, B:72:0x0064, B:74:0x0074, B:78:0x0081, B:80:0x0086, B:83:0x008f, B:82:0x008c, B:89:0x00a3, B:91:0x00a8, B:94:0x00b1, B:95:0x00b4, B:93:0x00ae, B:77:0x007a), top: B:104:0x0039, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resumeCancellableWith(java.lang.Object r7, f7.l r8) {
        /*
            r6 = this;
            java.lang.Object r8 = n7.F.toState(r7, r8)
            n7.I r0 = r6.dispatcher
            W6.g r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L20
            r6._state = r8
            r6.resumeMode = r1
            n7.I r7 = r6.dispatcher
            W6.g r8 = r6.getContext()
            r7.mo570dispatch(r8, r6)
            goto Lbc
        L20:
            n7.R0 r0 = n7.R0.INSTANCE
            n7.f0 r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r2 = r0.isUnconfinedLoopActive()
            if (r2 == 0) goto L35
            r6._state = r8
            r6.resumeMode = r1
            r0.dispatchUnconfined(r6)
            goto Lbc
        L35:
            r0.incrementUseCount(r1)
            r2 = 0
            W6.g r3 = r6.getContext()     // Catch: java.lang.Throwable -> L62
            n7.t0$b r4 = n7.InterfaceC6008t0.Key     // Catch: java.lang.Throwable -> L62
            W6.g$b r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L62
            n7.t0 r3 = (n7.InterfaceC6008t0) r3     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L64
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L62
            if (r4 != 0) goto L64
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch: java.lang.Throwable -> L62
            r6.cancelCompletedResult$kotlinx_coroutines_core(r8, r7)     // Catch: java.lang.Throwable -> L62
            R6.q$a r8 = R6.q.Companion     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = R6.r.createFailure(r7)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = R6.q.m67constructorimpl(r7)     // Catch: java.lang.Throwable -> L62
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L62
            goto L92
        L62:
            r7 = move-exception
            goto Lb5
        L64:
            W6.d<java.lang.Object> r8 = r6.continuation     // Catch: java.lang.Throwable -> L62
            java.lang.Object r3 = r6.countOrElement     // Catch: java.lang.Throwable -> L62
            W6.g r4 = r8.getContext()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r3 = s7.O.updateThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L62
            s7.K r5 = s7.O.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L62
            if (r3 == r5) goto L79
            n7.U0 r8 = n7.H.updateUndispatchedCompletion(r8, r4, r3)     // Catch: java.lang.Throwable -> L62
            goto L7a
        L79:
            r8 = r2
        L7a:
            W6.d<java.lang.Object> r5 = r6.continuation     // Catch: java.lang.Throwable -> La2
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> La2
            R6.G r7 = R6.G.INSTANCE     // Catch: java.lang.Throwable -> La2
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto L8c
            boolean r7 = r8.clearThreadContext()     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L8f
        L8c:
            s7.O.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L62
        L8f:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)     // Catch: java.lang.Throwable -> L62
        L92:
            boolean r7 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L62
            if (r7 != 0) goto L92
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
        L9b:
            r0.decrementUseCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            goto Lbc
        La2:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto Lae
            boolean r8 = r8.clearThreadContext()     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto Lb1
        Lae:
            s7.O.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L62
        Lb1:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)     // Catch: java.lang.Throwable -> L62
            throw r7     // Catch: java.lang.Throwable -> L62
        Lb5:
            r6.handleFatalException(r7, r2)     // Catch: java.lang.Throwable -> Lbd
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            goto L9b
        Lbc:
            return
        Lbd:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r0.decrementUseCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.C6251l.resumeCancellableWith(java.lang.Object, f7.l):void");
    }

    public final boolean resumeCancelled(Object obj) {
        InterfaceC6008t0 interfaceC6008t0 = (InterfaceC6008t0) getContext().get(InterfaceC6008t0.Key);
        if (interfaceC6008t0 == null || interfaceC6008t0.isActive()) {
            return false;
        }
        CancellationException cancellationException = interfaceC6008t0.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(obj, cancellationException);
        q.a aVar = R6.q.Companion;
        resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(cancellationException)));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0029 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resumeUndispatchedWith(java.lang.Object r6) {
        /*
            r5 = this;
            W6.d<java.lang.Object> r0 = r5.continuation
            java.lang.Object r1 = r5.countOrElement
            W6.g r2 = r0.getContext()
            java.lang.Object r1 = s7.O.updateThreadContext(r2, r1)
            s7.K r3 = s7.O.NO_THREAD_ELEMENTS
            if (r1 == r3) goto L15
            n7.U0 r0 = n7.H.updateUndispatchedCompletion(r0, r2, r1)
            goto L16
        L15:
            r0 = 0
        L16:
            r3 = 1
            W6.d<java.lang.Object> r4 = r5.continuation     // Catch: java.lang.Throwable -> L30
            r4.resumeWith(r6)     // Catch: java.lang.Throwable -> L30
            R6.G r6 = R6.G.INSTANCE     // Catch: java.lang.Throwable -> L30
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            if (r0 == 0) goto L29
            boolean r6 = r0.clearThreadContext()
            if (r6 == 0) goto L2c
        L29:
            s7.O.restoreThreadContext(r2, r1)
        L2c:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return
        L30:
            r6 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            if (r0 == 0) goto L3c
            boolean r0 = r0.clearThreadContext()
            if (r0 == 0) goto L3f
        L3c:
            s7.O.restoreThreadContext(r2, r1)
        L3f:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.C6251l.resumeUndispatchedWith(java.lang.Object):void");
    }

    @Override // W6.d
    public void resumeWith(Object obj) {
        W6.g context = this.continuation.getContext();
        Object state$default = n7.F.toState$default(obj, null, 1, null);
        if (this.dispatcher.isDispatchNeeded(context)) {
            this._state = state$default;
            this.resumeMode = 0;
            this.dispatcher.mo570dispatch(context, this);
            return;
        }
        AbstractC5981f0 eventLoop$kotlinx_coroutines_core = R0.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = state$default;
            this.resumeMode = 0;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            W6.g context2 = getContext();
            Object objUpdateThreadContext = O.updateThreadContext(context2, this.countOrElement);
            try {
                this.continuation.resumeWith(obj);
                R6.G g8 = R6.G.INSTANCE;
                while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
                }
            } finally {
                O.restoreThreadContext(context2, objUpdateThreadContext);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // n7.Y
    public Object takeState$kotlinx_coroutines_core() {
        Object obj = this._state;
        this._state = AbstractC6252m.f36348a;
        return obj;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + n7.P.toDebugString(this.continuation) + ']';
    }

    public final Throwable tryReleaseClaimedContinuation(InterfaceC5996n interfaceC5996n) {
        K k8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36347a;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            k8 = AbstractC6252m.REUSABLE_CLAIMED;
            if (obj != k8) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f36347a, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f36347a, this, k8, interfaceC5996n));
        return null;
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
    }

    @Override // n7.Y
    public W6.d<Object> getDelegate$kotlinx_coroutines_core() {
        return this;
    }
}
