package n7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class U extends AbstractC5970a implements T {
    public U(W6.g gVar, boolean z8) {
        super(gVar, true, z8);
    }

    static /* synthetic */ Object W(U u8, W6.d dVar) throws Throwable {
        Object objG = u8.g(dVar);
        X6.b.getCOROUTINE_SUSPENDED();
        return objG;
    }

    @Override // n7.T
    public Object await(W6.d<Object> dVar) {
        return W(this, dVar);
    }

    @Override // n7.T
    public Object getCompleted() {
        return getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // n7.T
    public v7.f getOnAwait() {
        v7.f fVarS = s();
        Intrinsics.checkNotNull(fVarS, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return fVarS;
    }
}
