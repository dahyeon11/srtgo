package n7;

import R6.q;

/* loaded from: classes3.dex */
final class K0 extends A0 {

    /* renamed from: d, reason: collision with root package name */
    private final C5998o f34307d;

    public K0(C5998o c5998o) {
        this.f34307d = c5998o;
    }

    @Override // n7.A0, n7.AbstractC5968D, f7.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return R6.G.INSTANCE;
    }

    @Override // n7.AbstractC5968D
    public void invoke(Throwable th) {
        Object state$kotlinx_coroutines_core = getJob().getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof C5966B) {
            C5998o c5998o = this.f34307d;
            q.a aVar = R6.q.Companion;
            c5998o.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(((C5966B) state$kotlinx_coroutines_core).cause)));
        } else {
            C5998o c5998o2 = this.f34307d;
            q.a aVar2 = R6.q.Companion;
            c5998o2.resumeWith(R6.q.m67constructorimpl(C0.unboxState(state$kotlinx_coroutines_core)));
        }
    }
}
