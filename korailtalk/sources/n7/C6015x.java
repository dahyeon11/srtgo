package n7;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: n7.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6015x extends B0 implements InterfaceC6013w {
    public C6015x(InterfaceC6008t0 interfaceC6008t0) {
        super(true);
        v(interfaceC6008t0);
    }

    @Override // n7.InterfaceC6013w, n7.T
    public Object await(W6.d<Object> dVar) throws Throwable {
        Object objG = g(dVar);
        X6.b.getCOROUTINE_SUSPENDED();
        return objG;
    }

    @Override // n7.InterfaceC6013w
    public boolean complete(Object obj) {
        return makeCompleting$kotlinx_coroutines_core(obj);
    }

    @Override // n7.InterfaceC6013w
    public boolean completeExceptionally(Throwable th) {
        return makeCompleting$kotlinx_coroutines_core(new C5966B(th, false, 2, null));
    }

    @Override // n7.InterfaceC6013w, n7.T
    public Object getCompleted() {
        return getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // n7.InterfaceC6013w, n7.T
    public v7.f getOnAwait() {
        v7.f fVarS = s();
        Intrinsics.checkNotNull(fVarS, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return fVarS;
    }

    @Override // n7.B0
    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }
}
