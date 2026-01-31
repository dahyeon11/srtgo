package u7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref;
import p7.AbstractC6072j;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37174b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37175c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37176d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37177e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f37178a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    private final h a(h hVar) {
        if (c() == 127) {
            return hVar;
        }
        if (hVar.taskContext.getTaskMode() == 1) {
            f37177e.incrementAndGet(this);
        }
        int i8 = f37175c.get(this) & 127;
        while (this.f37178a.get(i8) != null) {
            Thread.yield();
        }
        this.f37178a.lazySet(i8, hVar);
        f37175c.incrementAndGet(this);
        return null;
    }

    public static /* synthetic */ h add$default(n nVar, h hVar, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return nVar.add(hVar, z8);
    }

    private final void b(h hVar) {
        if (hVar == null || hVar.taskContext.getTaskMode() != 1) {
            return;
        }
        f37177e.decrementAndGet(this);
    }

    private final int c() {
        return f37175c.get(this) - f37176d.get(this);
    }

    private final h d() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f37176d;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 - f37175c.get(this) == 0) {
                return null;
            }
            int i9 = i8 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 + 1) && (hVar = (h) this.f37178a.getAndSet(i9, null)) != null) {
                b(hVar);
                return hVar;
            }
        }
    }

    private final boolean e(d dVar) {
        h hVarD = d();
        if (hVarD == null) {
            return false;
        }
        dVar.addLast(hVarD);
        return true;
    }

    private final h f(boolean z8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f37174b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                if ((hVar.taskContext.getTaskMode() == 1) == z8) {
                }
            }
            int i8 = f37176d.get(this);
            int i9 = f37175c.get(this);
            while (i8 != i9) {
                if (z8 && f37177e.get(this) == 0) {
                    return null;
                }
                i9--;
                h hVarH = h(i9, z8);
                if (hVarH != null) {
                    return hVarH;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, hVar, null));
        return hVar;
    }

    private final h g(int i8) {
        int i9 = f37176d.get(this);
        int i10 = f37175c.get(this);
        boolean z8 = i8 == 1;
        while (i9 != i10) {
            if (z8 && f37177e.get(this) == 0) {
                return null;
            }
            int i11 = i9 + 1;
            h hVarH = h(i9, z8);
            if (hVarH != null) {
                return hVarH;
            }
            i9 = i11;
        }
        return null;
    }

    private final h h(int i8, boolean z8) {
        int i9 = i8 & 127;
        h hVar = (h) this.f37178a.get(i9);
        if (hVar != null) {
            if ((hVar.taskContext.getTaskMode() == 1) == z8 && AbstractC6072j.a(this.f37178a, i9, hVar, null)) {
                if (z8) {
                    f37177e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, u7.h] */
    private final long i(int i8, Ref.ObjectRef objectRef) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r12;
        do {
            atomicReferenceFieldUpdater = f37174b;
            r12 = (h) atomicReferenceFieldUpdater.get(this);
            if (r12 == 0) {
                return -2L;
            }
            if (((r12.taskContext.getTaskMode() != 1 ? 2 : 1) & i8) == 0) {
                return -2L;
            }
            long jNanoTime = l.schedulerTimeSource.nanoTime() - r12.submissionTime;
            long j8 = l.WORK_STEALING_TIME_RESOLUTION_NS;
            if (jNanoTime < j8) {
                return j8 - jNanoTime;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, r12, null));
        objectRef.element = r12;
        return -1L;
    }

    public final h add(h hVar, boolean z8) {
        if (z8) {
            return a(hVar);
        }
        h hVar2 = (h) f37174b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return a(hVar2);
    }

    public final int getSize$kotlinx_coroutines_core() {
        return f37174b.get(this) != null ? c() + 1 : c();
    }

    public final void offloadAllWorkTo(d dVar) {
        h hVar = (h) f37174b.getAndSet(this, null);
        if (hVar != null) {
            dVar.addLast(hVar);
        }
        while (e(dVar)) {
        }
    }

    public final h poll() {
        h hVar = (h) f37174b.getAndSet(this, null);
        return hVar == null ? d() : hVar;
    }

    public final h pollBlocking() {
        return f(true);
    }

    public final h pollCpu() {
        return f(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long trySteal(int i8, Ref.ObjectRef<h> objectRef) {
        T tD = i8 == 3 ? d() : g(i8);
        if (tD == 0) {
            return i(i8, objectRef);
        }
        objectRef.element = tD;
        return -1L;
    }
}
