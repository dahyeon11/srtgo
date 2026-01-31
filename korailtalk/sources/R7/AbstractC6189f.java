package r7;

import kotlin.jvm.internal.TypeIntrinsics;
import q7.InterfaceC6147i;
import q7.InterfaceC6148j;
import s7.O;

/* renamed from: r7.f */
/* loaded from: classes3.dex */
public abstract class AbstractC6189f {
    public static final InterfaceC6148j a(InterfaceC6148j interfaceC6148j, W6.g gVar) {
        return interfaceC6148j instanceof y ? true : interfaceC6148j instanceof t ? interfaceC6148j : new C6183B(interfaceC6148j, gVar);
    }

    public static final <T> AbstractC6188e asChannelFlow(InterfaceC6147i interfaceC6147i) {
        AbstractC6188e abstractC6188e = interfaceC6147i instanceof AbstractC6188e ? (AbstractC6188e) interfaceC6147i : null;
        return abstractC6188e == null ? new C6192i(interfaceC6147i, null, 0, null, 14, null) : abstractC6188e;
    }

    public static final <T, V> Object withContextUndispatched(W6.g gVar, V v8, Object obj, f7.p pVar, W6.d<? super T> dVar) {
        Object objUpdateThreadContext = O.updateThreadContext(gVar, obj);
        try {
            Object objInvoke = ((f7.p) TypeIntrinsics.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(v8, new z(dVar, gVar));
            O.restoreThreadContext(gVar, objUpdateThreadContext);
            if (objInvoke == X6.b.getCOROUTINE_SUSPENDED()) {
                Y6.h.probeCoroutineSuspended(dVar);
            }
            return objInvoke;
        } catch (Throwable th) {
            O.restoreThreadContext(gVar, objUpdateThreadContext);
            throw th;
        }
    }

    public static /* synthetic */ Object withContextUndispatched$default(W6.g gVar, Object obj, Object obj2, f7.p pVar, W6.d dVar, int i8, Object obj3) {
        if ((i8 & 4) != 0) {
            obj2 = O.threadContextElements(gVar);
        }
        return withContextUndispatched(gVar, obj, obj2, pVar, dVar);
    }
}
