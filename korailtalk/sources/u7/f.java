package u7;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.AbstractC5993l0;

/* loaded from: classes3.dex */
public class f extends AbstractC5993l0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f37168b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37169c;

    /* renamed from: d, reason: collision with root package name */
    private final long f37170d;

    /* renamed from: e, reason: collision with root package name */
    private final String f37171e;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorC6421a f37172f;

    public f() {
        this(0, 0, 0L, null, 15, null);
    }

    private final ExecutorC6421a b() {
        return new ExecutorC6421a(this.f37168b, this.f37169c, this.f37170d, this.f37171e);
    }

    @Override // n7.AbstractC5993l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        this.f37172f.close();
    }

    @Override // n7.I
    /* renamed from: dispatch */
    public void mo570dispatch(W6.g gVar, Runnable runnable) {
        ExecutorC6421a.dispatch$default(this.f37172f, runnable, null, false, 6, null);
    }

    public final void dispatchWithContext$kotlinx_coroutines_core(Runnable runnable, i iVar, boolean z8) {
        this.f37172f.dispatch(runnable, iVar, z8);
    }

    @Override // n7.I
    public void dispatchYield(W6.g gVar, Runnable runnable) {
        ExecutorC6421a.dispatch$default(this.f37172f, runnable, null, true, 2, null);
    }

    @Override // n7.AbstractC5993l0
    public Executor getExecutor() {
        return this.f37172f;
    }

    public final void restore$kotlinx_coroutines_core() {
        usePrivateScheduler$kotlinx_coroutines_core();
    }

    public final synchronized void shutdown$kotlinx_coroutines_core(long j8) {
        this.f37172f.shutdown(j8);
    }

    public final synchronized void usePrivateScheduler$kotlinx_coroutines_core() {
        this.f37172f.shutdown(1000L);
        this.f37172f = b();
    }

    public /* synthetic */ f(int i8, int i9, long j8, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? l.CORE_POOL_SIZE : i8, (i10 & 2) != 0 ? l.MAX_POOL_SIZE : i9, (i10 & 4) != 0 ? l.IDLE_WORKER_KEEP_ALIVE_NS : j8, (i10 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public f(int i8, int i9, long j8, String str) {
        this.f37168b = i8;
        this.f37169c = i9;
        this.f37170d = j8;
        this.f37171e = str;
        this.f37172f = b();
    }
}
