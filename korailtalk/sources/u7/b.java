package u7;

import j7.s;
import java.util.concurrent.Executor;
import n7.AbstractC5993l0;
import n7.I;
import s7.L;
import s7.N;

/* loaded from: classes3.dex */
public final class b extends AbstractC5993l0 implements Executor {
    public static final b INSTANCE = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final I f37167b = m.INSTANCE.limitedParallelism(N.systemProp$default("kotlinx.coroutines.io.parallelism", s.coerceAtLeast(64, L.getAVAILABLE_PROCESSORS()), 0, 0, 12, (Object) null));

    private b() {
    }

    @Override // n7.AbstractC5993l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // n7.I
    /* renamed from: dispatch */
    public void mo570dispatch(W6.g gVar, Runnable runnable) {
        f37167b.mo570dispatch(gVar, runnable);
    }

    @Override // n7.I
    public void dispatchYield(W6.g gVar, Runnable runnable) {
        f37167b.dispatchYield(gVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo570dispatch(W6.h.INSTANCE, runnable);
    }

    @Override // n7.I
    public I limitedParallelism(int i8) {
        return m.INSTANCE.limitedParallelism(i8);
    }

    @Override // n7.I
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // n7.AbstractC5993l0
    public Executor getExecutor() {
        return this;
    }
}
