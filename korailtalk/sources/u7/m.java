package u7;

import n7.I;
import s7.AbstractC6257s;

/* loaded from: classes3.dex */
final class m extends I {
    public static final m INSTANCE = new m();

    private m() {
    }

    @Override // n7.I
    /* renamed from: dispatch */
    public void mo570dispatch(W6.g gVar, Runnable runnable) {
        c.INSTANCE.dispatchWithContext$kotlinx_coroutines_core(runnable, l.BlockingContext, false);
    }

    @Override // n7.I
    public void dispatchYield(W6.g gVar, Runnable runnable) {
        c.INSTANCE.dispatchWithContext$kotlinx_coroutines_core(runnable, l.BlockingContext, true);
    }

    @Override // n7.I
    public I limitedParallelism(int i8) {
        AbstractC6257s.checkParallelism(i8);
        return i8 >= l.MAX_POOL_SIZE ? this : super.limitedParallelism(i8);
    }
}
