package n7;

/* renamed from: n7.h */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5984h {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T runBlocking(W6.g r4, f7.p r5) {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            W6.e$b r1 = W6.e.Key
            W6.g$b r1 = r4.get(r1)
            W6.e r1 = (W6.e) r1
            if (r1 != 0) goto L1f
            n7.R0 r1 = n7.R0.INSTANCE
            n7.f0 r1 = r1.getEventLoop$kotlinx_coroutines_core()
            n7.m0 r2 = n7.C5995m0.INSTANCE
            W6.g r4 = r4.plus(r1)
            W6.g r4 = n7.H.newCoroutineContext(r2, r4)
            goto L42
        L1f:
            boolean r2 = r1 instanceof n7.AbstractC5981f0
            r3 = 0
            if (r2 == 0) goto L27
            n7.f0 r1 = (n7.AbstractC5981f0) r1
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 == 0) goto L36
            boolean r2 = r1.shouldBeProcessedFromContext()
            if (r2 == 0) goto L31
            r3 = r1
        L31:
            if (r3 != 0) goto L34
            goto L36
        L34:
            r1 = r3
            goto L3c
        L36:
            n7.R0 r1 = n7.R0.INSTANCE
            n7.f0 r1 = r1.currentOrNull$kotlinx_coroutines_core()
        L3c:
            n7.m0 r2 = n7.C5995m0.INSTANCE
            W6.g r4 = n7.H.newCoroutineContext(r2, r4)
        L42:
            n7.e r2 = new n7.e
            r2.<init>(r4, r0, r1)
            n7.N r4 = n7.N.DEFAULT
            r2.start(r4, r2, r5)
            java.lang.Object r4 = r2.joinBlocking()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.AbstractC5984h.runBlocking(W6.g, f7.p):java.lang.Object");
    }

    public static /* synthetic */ Object runBlocking$default(W6.g gVar, f7.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = W6.h.INSTANCE;
        }
        return AbstractC5982g.runBlocking(gVar, pVar);
    }
}
