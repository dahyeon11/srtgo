package n7;

import W6.g;
import m7.C5914a;

/* loaded from: classes3.dex */
public abstract class W {

    static final class a extends Y6.d {

        /* renamed from: d */
        /* synthetic */ Object f34315d;

        /* renamed from: e */
        int f34316e;

        a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34315d = obj;
            this.f34316e |= Integer.MIN_VALUE;
            return W.awaitCancellation(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitCancellation(W6.d<?> r4) throws java.lang.Throwable {
        /*
            boolean r0 = r4 instanceof n7.W.a
            if (r0 == 0) goto L13
            r0 = r4
            n7.W$a r0 = (n7.W.a) r0
            int r1 = r0.f34316e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34316e = r1
            goto L18
        L13:
            n7.W$a r0 = new n7.W$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f34315d
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34316e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            R6.r.throwOnFailure(r4)
            goto L52
        L31:
            R6.r.throwOnFailure(r4)
            r0.f34316e = r3
            n7.o r4 = new n7.o
            W6.d r2 = X6.b.intercepted(r0)
            r4.<init>(r2, r3)
            r4.initCancellability()
            java.lang.Object r4 = r4.getResult()
            java.lang.Object r2 = X6.b.getCOROUTINE_SUSPENDED()
            if (r4 != r2) goto L4f
            Y6.h.probeCoroutineSuspended(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            R6.e r4 = new R6.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.W.awaitCancellation(W6.d):java.lang.Object");
    }

    public static final Object delay(long j8, W6.d<? super R6.G> dVar) {
        if (j8 <= 0) {
            return R6.G.INSTANCE;
        }
        C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
        c5998o.initCancellability();
        if (j8 < Long.MAX_VALUE) {
            getDelay(c5998o.getContext()).mo571scheduleResumeAfterDelay(j8, c5998o);
        }
        Object result = c5998o.getResult();
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return result == X6.b.getCOROUTINE_SUSPENDED() ? result : R6.G.INSTANCE;
    }

    /* renamed from: delay-VtjQ1oo */
    public static final Object m526delayVtjQ1oo(long j8, W6.d<? super R6.G> dVar) {
        Object objDelay = delay(m527toDelayMillisLRDsOJo(j8), dVar);
        return objDelay == X6.b.getCOROUTINE_SUSPENDED() ? objDelay : R6.G.INSTANCE;
    }

    public static final V getDelay(W6.g gVar) {
        g.b bVar = gVar.get(W6.e.Key);
        V v8 = bVar instanceof V ? (V) bVar : null;
        return v8 == null ? S.getDefaultDelay() : v8;
    }

    /* renamed from: toDelayMillis-LRDsOJo */
    public static final long m527toDelayMillisLRDsOJo(long j8) {
        if (C5914a.m423compareToLRDsOJo(j8, C5914a.Companion.m501getZEROUwyO8pc()) > 0) {
            return j7.s.coerceAtLeast(C5914a.m442getInWholeMillisecondsimpl(j8), 1L);
        }
        return 0L;
    }
}
