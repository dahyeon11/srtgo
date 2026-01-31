package s7;

import n7.AbstractC5981f0;
import n7.R0;

/* renamed from: s7.m */
/* loaded from: classes3.dex */
public abstract class AbstractC6252m {

    /* renamed from: a */
    private static final K f36348a = new K("UNDEFINED");
    public static final K REUSABLE_CLAIMED = new K("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:82:0x008f A[Catch: all -> 0x0068, DONT_GENERATE, TryCatch #0 {all -> 0x0068, blocks: (B:66:0x003f, B:68:0x004d, B:70:0x0053, B:83:0x0092, B:73:0x006a, B:75:0x007a, B:80:0x0089, B:82:0x008f, B:88:0x009f, B:91:0x00a8, B:90:0x00a5, B:78:0x0080), top: B:99:0x003f, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void resumeCancellableWith(W6.d<? super T> r6, java.lang.Object r7, f7.l r8) {
        /*
            boolean r0 = r6 instanceof s7.C6251l
            if (r0 == 0) goto Lb2
            s7.l r6 = (s7.C6251l) r6
            java.lang.Object r8 = n7.F.toState(r7, r8)
            n7.I r0 = r6.dispatcher
            W6.g r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L26
            r6._state = r8
            r6.resumeMode = r1
            n7.I r7 = r6.dispatcher
            W6.g r8 = r6.getContext()
            r7.mo570dispatch(r8, r6)
            goto Lb5
        L26:
            n7.R0 r0 = n7.R0.INSTANCE
            n7.f0 r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r2 = r0.isUnconfinedLoopActive()
            if (r2 == 0) goto L3b
            r6._state = r8
            r6.resumeMode = r1
            r0.dispatchUnconfined(r6)
            goto Lb5
        L3b:
            r0.incrementUseCount(r1)
            r2 = 0
            W6.g r3 = r6.getContext()     // Catch: java.lang.Throwable -> L68
            n7.t0$b r4 = n7.InterfaceC6008t0.Key     // Catch: java.lang.Throwable -> L68
            W6.g$b r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L68
            n7.t0 r3 = (n7.InterfaceC6008t0) r3     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L6a
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L68
            if (r4 != 0) goto L6a
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch: java.lang.Throwable -> L68
            r6.cancelCompletedResult$kotlinx_coroutines_core(r8, r7)     // Catch: java.lang.Throwable -> L68
            R6.q$a r8 = R6.q.Companion     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = R6.r.createFailure(r7)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = R6.q.m67constructorimpl(r7)     // Catch: java.lang.Throwable -> L68
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L68
            goto L92
        L68:
            r7 = move-exception
            goto La9
        L6a:
            W6.d<java.lang.Object> r8 = r6.continuation     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = r6.countOrElement     // Catch: java.lang.Throwable -> L68
            W6.g r4 = r8.getContext()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = s7.O.updateThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L68
            s7.K r5 = s7.O.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L68
            if (r3 == r5) goto L7f
            n7.U0 r8 = n7.H.updateUndispatchedCompletion(r8, r4, r3)     // Catch: java.lang.Throwable -> L68
            goto L80
        L7f:
            r8 = r2
        L80:
            W6.d<java.lang.Object> r5 = r6.continuation     // Catch: java.lang.Throwable -> L9c
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9c
            R6.G r7 = R6.G.INSTANCE     // Catch: java.lang.Throwable -> L9c
            if (r8 == 0) goto L8f
            boolean r7 = r8.clearThreadContext()     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L92
        L8f:
            s7.O.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L68
        L92:
            boolean r7 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L92
        L98:
            r0.decrementUseCount(r1)
            goto Lb5
        L9c:
            r7 = move-exception
            if (r8 == 0) goto La5
            boolean r8 = r8.clearThreadContext()     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto La8
        La5:
            s7.O.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L68
        La8:
            throw r7     // Catch: java.lang.Throwable -> L68
        La9:
            r6.handleFatalException(r7, r2)     // Catch: java.lang.Throwable -> Lad
            goto L98
        Lad:
            r6 = move-exception
            r0.decrementUseCount(r1)
            throw r6
        Lb2:
            r6.resumeWith(r7)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.AbstractC6252m.resumeCancellableWith(W6.d, java.lang.Object, f7.l):void");
    }

    public static /* synthetic */ void resumeCancellableWith$default(W6.d dVar, Object obj, f7.l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            lVar = null;
        }
        resumeCancellableWith(dVar, obj, lVar);
    }

    public static final boolean yieldUndispatched(C6251l c6251l) {
        R6.G g8 = R6.G.INSTANCE;
        AbstractC5981f0 eventLoop$kotlinx_coroutines_core = R0.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            c6251l._state = g8;
            c6251l.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(c6251l);
            return true;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            c6251l.run();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
