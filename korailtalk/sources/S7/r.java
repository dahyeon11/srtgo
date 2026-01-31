package s7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n7.InterfaceC5973b0;
import n7.InterfaceC5996n;

/* loaded from: classes3.dex */
public final class r extends n7.I implements n7.V {

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f36357g = AtomicIntegerFieldUpdater.newUpdater(r.class, "runningWorkers");

    /* renamed from: b, reason: collision with root package name */
    private final n7.I f36358b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36359c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ n7.V f36360d;

    /* renamed from: e, reason: collision with root package name */
    private final w f36361e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f36362f;
    private volatile int runningWorkers;

    private final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Runnable f36363a;

        public a(Runnable runnable) {
            this.f36363a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = 0;
            while (true) {
                try {
                    this.f36363a.run();
                } catch (Throwable th) {
                    n7.K.handleCoroutineException(W6.h.INSTANCE, th);
                }
                Runnable runnableB = r.this.b();
                if (runnableB == null) {
                    return;
                }
                this.f36363a = runnableB;
                i8++;
                if (i8 >= 16 && r.this.f36358b.isDispatchNeeded(r.this)) {
                    r.this.f36358b.mo570dispatch(r.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(n7.I i8, int i9) {
        this.f36358b = i8;
        this.f36359c = i9;
        n7.V v8 = i8 instanceof n7.V ? (n7.V) i8 : null;
        this.f36360d = v8 == null ? n7.S.getDefaultDelay() : v8;
        this.f36361e = new w(false);
        this.f36362f = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable b() {
        while (true) {
            Runnable runnable = (Runnable) this.f36361e.removeFirstOrNull();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f36362f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f36357g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f36361e.getSize() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean d() {
        synchronized (this.f36362f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f36357g;
            if (atomicIntegerFieldUpdater.get(this) >= this.f36359c) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // n7.V
    public Object delay(long j8, W6.d<? super R6.G> dVar) {
        return this.f36360d.delay(j8, dVar);
    }

    @Override // n7.I
    /* renamed from: dispatch */
    public void mo570dispatch(W6.g gVar, Runnable runnable) {
        Runnable runnableB;
        this.f36361e.addLast(runnable);
        if (f36357g.get(this) >= this.f36359c || !d() || (runnableB = b()) == null) {
            return;
        }
        this.f36358b.mo570dispatch(this, new a(runnableB));
    }

    @Override // n7.I
    public void dispatchYield(W6.g gVar, Runnable runnable) {
        Runnable runnableB;
        this.f36361e.addLast(runnable);
        if (f36357g.get(this) >= this.f36359c || !d() || (runnableB = b()) == null) {
            return;
        }
        this.f36358b.dispatchYield(this, new a(runnableB));
    }

    @Override // n7.V
    public InterfaceC5973b0 invokeOnTimeout(long j8, Runnable runnable, W6.g gVar) {
        return this.f36360d.invokeOnTimeout(j8, runnable, gVar);
    }

    @Override // n7.I
    public n7.I limitedParallelism(int i8) {
        AbstractC6257s.checkParallelism(i8);
        return i8 >= this.f36359c ? this : super.limitedParallelism(i8);
    }

    @Override // n7.V
    /* renamed from: scheduleResumeAfterDelay */
    public void mo571scheduleResumeAfterDelay(long j8, InterfaceC5996n interfaceC5996n) {
        this.f36360d.mo571scheduleResumeAfterDelay(j8, interfaceC5996n);
    }
}
