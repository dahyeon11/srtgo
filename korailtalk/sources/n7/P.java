package n7;

import R6.q;
import s7.C6251l;

/* loaded from: classes3.dex */
public abstract class P {
    public static final String getClassSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String toDebugString(W6.d<?> dVar) {
        Object objM67constructorimpl;
        if (dVar instanceof C6251l) {
            return dVar.toString();
        }
        try {
            q.a aVar = R6.q.Companion;
            objM67constructorimpl = R6.q.m67constructorimpl(dVar + '@' + getHexAddress(dVar));
        } catch (Throwable th) {
            q.a aVar2 = R6.q.Companion;
            objM67constructorimpl = R6.q.m67constructorimpl(R6.r.createFailure(th));
        }
        if (R6.q.m70exceptionOrNullimpl(objM67constructorimpl) != null) {
            objM67constructorimpl = dVar.getClass().getName() + '@' + getHexAddress(dVar);
        }
        return (String) objM67constructorimpl;
    }
}
