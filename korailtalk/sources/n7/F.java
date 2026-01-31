package n7;

import R6.q;

/* loaded from: classes3.dex */
public abstract class F {
    public static final <T> Object recoverResult(Object obj, W6.d<? super T> dVar) {
        if (!(obj instanceof C5966B)) {
            return R6.q.m67constructorimpl(obj);
        }
        q.a aVar = R6.q.Companion;
        return R6.q.m67constructorimpl(R6.r.createFailure(((C5966B) obj).cause));
    }

    public static final <T> Object toState(Object obj, f7.l lVar) {
        Throwable thM70exceptionOrNullimpl = R6.q.m70exceptionOrNullimpl(obj);
        return thM70exceptionOrNullimpl == null ? lVar != null ? new C5967C(obj, lVar) : obj : new C5966B(thM70exceptionOrNullimpl, false, 2, null);
    }

    public static /* synthetic */ Object toState$default(Object obj, f7.l lVar, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            lVar = null;
        }
        return toState(obj, lVar);
    }

    public static final <T> Object toState(Object obj, InterfaceC5996n interfaceC5996n) {
        Throwable thM70exceptionOrNullimpl = R6.q.m70exceptionOrNullimpl(obj);
        return thM70exceptionOrNullimpl == null ? obj : new C5966B(thM70exceptionOrNullimpl, false, 2, null);
    }
}
