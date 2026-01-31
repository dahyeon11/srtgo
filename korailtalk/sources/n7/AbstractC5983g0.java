package n7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import m7.AbstractC5916c;
import n7.V;

/* renamed from: n7.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5983g0 extends AbstractC5985h0 implements V {

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34332e = AtomicReferenceFieldUpdater.newUpdater(AbstractC5983g0.class, Object.class, "_queue");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34333f = AtomicReferenceFieldUpdater.newUpdater(AbstractC5983g0.class, Object.class, "_delayed");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f34334g = AtomicIntegerFieldUpdater.newUpdater(AbstractC5983g0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* renamed from: n7.g0$a */
    private final class a extends c {

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC5996n f34335b;

        public a(long j8, InterfaceC5996n interfaceC5996n) {
            super(j8);
            this.f34335b = interfaceC5996n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34335b.resumeUndispatched(AbstractC5983g0.this, R6.G.INSTANCE);
        }

        @Override // n7.AbstractC5983g0.c
        public String toString() {
            return super.toString() + this.f34335b;
        }
    }

    /* renamed from: n7.g0$b */
    private static final class b extends c {

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f34337b;

        public b(long j8, Runnable runnable) {
            super(j8);
            this.f34337b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34337b.run();
        }

        @Override // n7.AbstractC5983g0.c
        public String toString() {
            return super.toString() + this.f34337b;
        }
    }

    /* renamed from: n7.g0$c */
    public static abstract class c implements Runnable, Comparable, InterfaceC5973b0, s7.S {
        private volatile Object _heap;

        /* renamed from: a, reason: collision with root package name */
        private int f34338a = -1;
        public long nanoTime;

        public c(long j8) {
            this.nanoTime = j8;
        }

        @Override // n7.InterfaceC5973b0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC5989j0.f34340a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.remove(this);
                    }
                    this._heap = AbstractC5989j0.f34340a;
                    R6.G g8 = R6.G.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // s7.S
        public s7.Q getHeap() {
            Object obj = this._heap;
            if (obj instanceof s7.Q) {
                return (s7.Q) obj;
            }
            return null;
        }

        @Override // s7.S
        public int getIndex() {
            return this.f34338a;
        }

        public final int scheduleTask(long j8, d dVar, AbstractC5983g0 abstractC5983g0) {
            synchronized (this) {
                if (this._heap == AbstractC5989j0.f34340a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.firstImpl();
                        if (abstractC5983g0.isCompleted()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.timeNow = j8;
                        } else {
                            long j9 = cVar.nanoTime;
                            if (j9 - j8 < 0) {
                                j8 = j9;
                            }
                            if (j8 - dVar.timeNow > 0) {
                                dVar.timeNow = j8;
                            }
                        }
                        long j10 = this.nanoTime;
                        long j11 = dVar.timeNow;
                        if (j10 - j11 < 0) {
                            this.nanoTime = j11;
                        }
                        dVar.addImpl(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // s7.S
        public void setHeap(s7.Q q8) {
            if (this._heap == AbstractC5989j0.f34340a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = q8;
        }

        @Override // s7.S
        public void setIndex(int i8) {
            this.f34338a = i8;
        }

        public final boolean timeToExecute(long j8) {
            return j8 - this.nanoTime >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }

        @Override // java.lang.Comparable
        public int compareTo(c cVar) {
            long j8 = this.nanoTime - cVar.nanoTime;
            if (j8 > 0) {
                return 1;
            }
            return j8 < 0 ? -1 : 0;
        }
    }

    /* renamed from: n7.g0$d */
    public static final class d extends s7.Q {
        public long timeNow;

        public d(long j8) {
            this.timeNow = j8;
        }
    }

    private final void h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34332e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f34332e, this, null, AbstractC5989j0.f34341b)) {
                    return;
                }
            } else if (obj instanceof s7.x) {
                ((s7.x) obj).close();
                return;
            } else {
                if (obj == AbstractC5989j0.f34341b) {
                    return;
                }
                s7.x xVar = new s7.x(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                xVar.addLast((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f34332e, this, obj, xVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable i() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34332e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof s7.x) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                s7.x xVar = (s7.x) obj;
                Object objRemoveFirstOrNull = xVar.removeFirstOrNull();
                if (objRemoveFirstOrNull != s7.x.REMOVE_FROZEN) {
                    return (Runnable) objRemoveFirstOrNull;
                }
                androidx.concurrent.futures.b.a(f34332e, this, obj, xVar.next());
            } else {
                if (obj == AbstractC5989j0.f34341b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f34332e, this, obj, null)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return f34334g.get(this) != 0;
    }

    private final boolean j(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34332e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f34332e, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof s7.x) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                s7.x xVar = (s7.x) obj;
                int iAddLast = xVar.addLast(runnable);
                if (iAddLast == 0) {
                    return true;
                }
                if (iAddLast == 1) {
                    androidx.concurrent.futures.b.a(f34332e, this, obj, xVar.next());
                } else if (iAddLast == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC5989j0.f34341b) {
                    return false;
                }
                s7.x xVar2 = new s7.x(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                xVar2.addLast((Runnable) obj);
                xVar2.addLast(runnable);
                if (androidx.concurrent.futures.b.a(f34332e, this, obj, xVar2)) {
                    return true;
                }
            }
        }
    }

    private final void l() {
        c cVar;
        AbstractC5972b timeSource = AbstractC5974c.getTimeSource();
        long jNanoTime = timeSource != null ? timeSource.nanoTime() : System.nanoTime();
        while (true) {
            d dVar = (d) f34333f.get(this);
            if (dVar == null || (cVar = (c) dVar.removeFirstOrNull()) == null) {
                return;
            } else {
                f(jNanoTime, cVar);
            }
        }
    }

    private final int n(long j8, c cVar) {
        if (isCompleted()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34333f;
        d dVar = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, new d(j8));
            Object obj = atomicReferenceFieldUpdater.get(this);
            Intrinsics.checkNotNull(obj);
            dVar = (d) obj;
        }
        return cVar.scheduleTask(j8, dVar, this);
    }

    private final void p(boolean z8) {
        f34334g.set(this, z8 ? 1 : 0);
    }

    private final boolean q(c cVar) {
        d dVar = (d) f34333f.get(this);
        return (dVar != null ? (c) dVar.peek() : null) == cVar;
    }

    @Override // n7.AbstractC5981f0
    protected long d() {
        c cVar;
        if (super.d() == 0) {
            return 0L;
        }
        Object obj = f34332e.get(this);
        if (obj != null) {
            if (!(obj instanceof s7.x)) {
                return obj == AbstractC5989j0.f34341b ? Long.MAX_VALUE : 0L;
            }
            if (!((s7.x) obj).isEmpty()) {
                return 0L;
            }
        }
        d dVar = (d) f34333f.get(this);
        if (dVar == null || (cVar = (c) dVar.peek()) == null) {
            return Long.MAX_VALUE;
        }
        long j8 = cVar.nanoTime;
        AbstractC5972b timeSource = AbstractC5974c.getTimeSource();
        return j7.s.coerceAtLeast(j8 - (timeSource != null ? timeSource.nanoTime() : System.nanoTime()), 0L);
    }

    @Override // n7.V
    public Object delay(long j8, W6.d<? super R6.G> dVar) {
        return V.a.delay(this, j8, dVar);
    }

    @Override // n7.I
    /* renamed from: dispatch */
    public final void mo570dispatch(W6.g gVar, Runnable runnable) {
        enqueue(runnable);
    }

    public void enqueue(Runnable runnable) {
        if (j(runnable)) {
            g();
        } else {
            Q.INSTANCE.enqueue(runnable);
        }
    }

    public InterfaceC5973b0 invokeOnTimeout(long j8, Runnable runnable, W6.g gVar) {
        return V.a.invokeOnTimeout(this, j8, runnable, gVar);
    }

    protected boolean k() {
        if (!isUnconfinedQueueEmpty()) {
            return false;
        }
        d dVar = (d) f34333f.get(this);
        if (dVar != null && !dVar.isEmpty()) {
            return false;
        }
        Object obj = f34332e.get(this);
        if (obj != null) {
            if (obj instanceof s7.x) {
                return ((s7.x) obj).isEmpty();
            }
            if (obj != AbstractC5989j0.f34341b) {
                return false;
            }
        }
        return true;
    }

    protected final void m() {
        f34332e.set(this, null);
        f34333f.set(this, null);
    }

    protected final InterfaceC5973b0 o(long j8, Runnable runnable) {
        long jDelayToNanos = AbstractC5989j0.delayToNanos(j8);
        if (jDelayToNanos >= AbstractC5916c.MAX_MILLIS) {
            return H0.INSTANCE;
        }
        AbstractC5972b timeSource = AbstractC5974c.getTimeSource();
        long jNanoTime = timeSource != null ? timeSource.nanoTime() : System.nanoTime();
        b bVar = new b(jDelayToNanos + jNanoTime, runnable);
        schedule(jNanoTime, bVar);
        return bVar;
    }

    @Override // n7.AbstractC5981f0
    public long processNextEvent() {
        s7.S sRemoveAtImpl;
        if (processUnconfinedEvent()) {
            return 0L;
        }
        d dVar = (d) f34333f.get(this);
        if (dVar != null && !dVar.isEmpty()) {
            AbstractC5972b timeSource = AbstractC5974c.getTimeSource();
            long jNanoTime = timeSource != null ? timeSource.nanoTime() : System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        s7.S sFirstImpl = dVar.firstImpl();
                        if (sFirstImpl != null) {
                            c cVar = (c) sFirstImpl;
                            sRemoveAtImpl = cVar.timeToExecute(jNanoTime) ? j(cVar) : false ? dVar.removeAtImpl(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (((c) sRemoveAtImpl) != null);
        }
        Runnable runnableI = i();
        if (runnableI == null) {
            return d();
        }
        runnableI.run();
        return 0L;
    }

    public final void schedule(long j8, c cVar) {
        int iN = n(j8, cVar);
        if (iN == 0) {
            if (q(cVar)) {
                g();
            }
        } else if (iN == 1) {
            f(j8, cVar);
        } else if (iN != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    @Override // n7.V
    /* renamed from: scheduleResumeAfterDelay */
    public void mo571scheduleResumeAfterDelay(long j8, InterfaceC5996n interfaceC5996n) {
        long jDelayToNanos = AbstractC5989j0.delayToNanos(j8);
        if (jDelayToNanos < AbstractC5916c.MAX_MILLIS) {
            AbstractC5972b timeSource = AbstractC5974c.getTimeSource();
            long jNanoTime = timeSource != null ? timeSource.nanoTime() : System.nanoTime();
            a aVar = new a(jDelayToNanos + jNanoTime, interfaceC5996n);
            schedule(jNanoTime, aVar);
            AbstractC6002q.disposeOnCancellation(interfaceC5996n, aVar);
        }
    }

    @Override // n7.AbstractC5981f0
    public void shutdown() {
        R0.INSTANCE.resetEventLoop$kotlinx_coroutines_core();
        p(true);
        h();
        while (processNextEvent() <= 0) {
        }
        l();
    }
}
