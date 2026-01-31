package n7;

import t7.AbstractC6369b;

/* loaded from: classes3.dex */
public abstract class P0 {
    /* renamed from: SupervisorJob, reason: collision with other method in class */
    public static final InterfaceC6019z m524SupervisorJob(InterfaceC6008t0 interfaceC6008t0) {
        return new O0(interfaceC6008t0);
    }

    /* renamed from: SupervisorJob$default, reason: collision with other method in class */
    public static /* synthetic */ InterfaceC6019z m525SupervisorJob$default(InterfaceC6008t0 interfaceC6008t0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC6008t0 = null;
        }
        return m524SupervisorJob(interfaceC6008t0);
    }

    public static final <R> Object supervisorScope(f7.p pVar, W6.d<? super R> dVar) {
        N0 n02 = new N0(dVar.getContext(), dVar);
        Object objStartUndispatchedOrReturn = AbstractC6369b.startUndispatchedOrReturn(n02, n02, pVar);
        if (objStartUndispatchedOrReturn == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return objStartUndispatchedOrReturn;
    }

    public static /* synthetic */ InterfaceC6008t0 SupervisorJob$default(InterfaceC6008t0 interfaceC6008t0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC6008t0 = null;
        }
        return m524SupervisorJob(interfaceC6008t0);
    }
}
