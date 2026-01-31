package t7;

import R6.G;
import R6.q;
import R6.r;
import W6.d;
import f7.l;
import f7.p;
import s7.AbstractC6252m;

/* renamed from: t7.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6368a {
    private static final void a(d dVar, Throwable th) throws Throwable {
        q.a aVar = q.Companion;
        dVar.resumeWith(q.m67constructorimpl(r.createFailure(th)));
        throw th;
    }

    public static final <T> void startCoroutineCancellable(l lVar, d<? super T> dVar) throws Throwable {
        try {
            d dVarIntercepted = X6.b.intercepted(X6.b.createCoroutineUnintercepted(lVar, dVar));
            q.a aVar = q.Companion;
            AbstractC6252m.resumeCancellableWith$default(dVarIntercepted, q.m67constructorimpl(G.INSTANCE), null, 2, null);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void startCoroutineCancellable$default(p pVar, Object obj, d dVar, l lVar, int i8, Object obj2) throws Throwable {
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        startCoroutineCancellable(pVar, obj, dVar, lVar);
    }

    public static final <R, T> void startCoroutineCancellable(p pVar, R r8, d<? super T> dVar, l lVar) throws Throwable {
        try {
            d dVarIntercepted = X6.b.intercepted(X6.b.createCoroutineUnintercepted(pVar, r8, dVar));
            q.a aVar = q.Companion;
            AbstractC6252m.resumeCancellableWith(dVarIntercepted, q.m67constructorimpl(G.INSTANCE), lVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static final void startCoroutineCancellable(d<? super G> dVar, d<?> dVar2) throws Throwable {
        try {
            d dVarIntercepted = X6.b.intercepted(dVar);
            q.a aVar = q.Companion;
            AbstractC6252m.resumeCancellableWith$default(dVarIntercepted, q.m67constructorimpl(G.INSTANCE), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }
}
