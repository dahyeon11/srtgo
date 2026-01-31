package u7;

import n7.I;
import s7.AbstractC6257s;

/* loaded from: classes3.dex */
public final class c extends f {
    public static final c INSTANCE = new c();

    private c() {
        super(l.CORE_POOL_SIZE, l.MAX_POOL_SIZE, l.IDLE_WORKER_KEEP_ALIVE_NS, l.DEFAULT_SCHEDULER_NAME);
    }

    @Override // u7.f, n7.AbstractC5993l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // n7.I
    public I limitedParallelism(int i8) {
        AbstractC6257s.checkParallelism(i8);
        return i8 >= l.CORE_POOL_SIZE ? this : super.limitedParallelism(i8);
    }

    public final void shutdown$kotlinx_coroutines_core() {
        super.close();
    }

    @Override // n7.I
    public String toString() {
        return "Dispatchers.Default";
    }
}
