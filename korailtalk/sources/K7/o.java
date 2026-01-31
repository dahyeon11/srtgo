package k7;

import R6.G;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class o {
    public abstract Object yield(Object obj, W6.d<? super G> dVar);

    public final Object yieldAll(Iterable<Object> iterable, W6.d<? super G> dVar) {
        Object objYieldAll;
        return (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) && (objYieldAll = yieldAll(iterable.iterator(), dVar)) == X6.b.getCOROUTINE_SUSPENDED()) ? objYieldAll : G.INSTANCE;
    }

    public abstract Object yieldAll(Iterator<Object> it, W6.d<? super G> dVar);

    public final Object yieldAll(m mVar, W6.d<? super G> dVar) {
        Object objYieldAll = yieldAll(mVar.iterator(), dVar);
        return objYieldAll == X6.b.getCOROUTINE_SUSPENDED() ? objYieldAll : G.INSTANCE;
    }
}
