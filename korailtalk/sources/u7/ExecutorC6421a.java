package u7;

import H0.y;
import R6.G;
import android.support.v4.media.session.PlaybackStateCompat;
import j7.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import n7.AbstractC5972b;
import n7.AbstractC5974c;
import n7.P;
import s7.C6239F;
import s7.K;

/* renamed from: u7.a */
/* loaded from: classes3.dex */
public final class ExecutorC6421a implements Executor, Closeable {
    public static final int MAX_SUPPORTED_POOL_SIZE = 2097150;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;
    private volatile int _isTerminated;
    private volatile long controlState;
    public final int corePoolSize;
    public final u7.d globalBlockingQueue;
    public final u7.d globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    private volatile long parkedWorkersStack;
    public final String schedulerName;
    public final C6239F workers;
    public static final C0425a Companion = new C0425a(null);

    /* renamed from: a */
    private static final AtomicLongFieldUpdater f37157a = AtomicLongFieldUpdater.newUpdater(ExecutorC6421a.class, "parkedWorkersStack");

    /* renamed from: b */
    private static final AtomicLongFieldUpdater f37158b = AtomicLongFieldUpdater.newUpdater(ExecutorC6421a.class, "controlState");

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f37159c = AtomicIntegerFieldUpdater.newUpdater(ExecutorC6421a.class, "_isTerminated");
    public static final K NOT_IN_STACK = new K("NOT_IN_STACK");

    /* renamed from: u7.a$a */
    public static final class C0425a {
        public /* synthetic */ C0425a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0425a() {
        }
    }

    /* renamed from: u7.a$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: u7.a$d */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public ExecutorC6421a(int i8, int i9, long j8, String str) {
        this.corePoolSize = i8;
        this.maxPoolSize = i9;
        this.idleWorkerKeepAliveNs = j8;
        this.schedulerName = str;
        if (i8 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i8 + " should be at least 1").toString());
        }
        if (i9 < i8) {
            throw new IllegalArgumentException(("Max pool size " + i9 + " should be greater than or equals to core pool size " + i8).toString());
        }
        if (i9 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i9 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j8 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j8 + " must be positive").toString());
        }
        this.globalCpuQueue = new u7.d();
        this.globalBlockingQueue = new u7.d();
        this.workers = new C6239F((i8 + 1) * 2);
        this.controlState = i8 << 42;
        this._isTerminated = 0;
    }

    private final boolean a(h hVar) {
        return hVar.taskContext.getTaskMode() == 1 ? this.globalBlockingQueue.addLast(hVar) : this.globalCpuQueue.addLast(hVar);
    }

    private final int b() {
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f37158b;
                long j8 = atomicLongFieldUpdater.get(this);
                int i8 = (int) (j8 & 2097151);
                int iCoerceAtLeast = s.coerceAtLeast(i8 - ((int) ((j8 & 4398044413952L) >> 21)), 0);
                if (iCoerceAtLeast >= this.corePoolSize) {
                    return 0;
                }
                if (i8 >= this.maxPoolSize) {
                    return 0;
                }
                int i9 = ((int) (f37158b.get(this) & 2097151)) + 1;
                if (i9 <= 0 || this.workers.get(i9) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i9);
                this.workers.setSynchronized(i9, cVar);
                if (i9 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i10 = iCoerceAtLeast + 1;
                cVar.start();
                return i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final c c() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !Intrinsics.areEqual(ExecutorC6421a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final int d(c cVar) {
        Object nextParkedWorker = cVar.getNextParkedWorker();
        while (nextParkedWorker != NOT_IN_STACK) {
            if (nextParkedWorker == null) {
                return 0;
            }
            c cVar2 = (c) nextParkedWorker;
            int indexInArray = cVar2.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = cVar2.getNextParkedWorker();
        }
        return -1;
    }

    public static /* synthetic */ void dispatch$default(ExecutorC6421a executorC6421a, Runnable runnable, i iVar, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            iVar = l.NonBlockingContext;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        executorC6421a.dispatch(runnable, iVar, z8);
    }

    private final c e() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37157a;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.workers.get((int) (2097151 & j8));
            if (cVar == null) {
                return null;
            }
            long j9 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j8) & (-2097152);
            int iD = d(cVar);
            if (iD >= 0 && f37157a.compareAndSet(this, j8, iD | j9)) {
                cVar.setNextParkedWorker(NOT_IN_STACK);
                return cVar;
            }
        }
    }

    private final void f(long j8, boolean z8) {
        if (z8 || j() || h(j8)) {
            return;
        }
        j();
    }

    private final h g(c cVar, h hVar, boolean z8) {
        if (cVar == null || cVar.state == d.TERMINATED) {
            return hVar;
        }
        if (hVar.taskContext.getTaskMode() == 0 && cVar.state == d.BLOCKING) {
            return hVar;
        }
        cVar.mayHaveLocalTasks = true;
        return cVar.localQueue.add(hVar, z8);
    }

    private final boolean h(long j8) {
        if (s.coerceAtLeast(((int) (2097151 & j8)) - ((int) ((j8 & 4398044413952L) >> 21)), 0) < this.corePoolSize) {
            int iB = b();
            if (iB == 1 && this.corePoolSize > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean i(ExecutorC6421a executorC6421a, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = f37158b.get(executorC6421a);
        }
        return executorC6421a.h(j8);
    }

    private final boolean j() {
        c cVarE;
        do {
            cVarE = e();
            if (cVarE == null) {
                return false;
            }
        } while (!c.f37160f.compareAndSet(cVarE, -1, 0));
        LockSupport.unpark(cVarE);
        return true;
    }

    public final int availableCpuPermits(long j8) {
        return (int) ((j8 & 9223367638808264704L) >> 42);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        shutdown(y.MIN_BACKOFF_MILLIS);
    }

    public final h createTask(Runnable runnable, i iVar) {
        long jNanoTime = l.schedulerTimeSource.nanoTime();
        if (!(runnable instanceof h)) {
            return new k(runnable, jNanoTime, iVar);
        }
        h hVar = (h) runnable;
        hVar.submissionTime = jNanoTime;
        hVar.taskContext = iVar;
        return hVar;
    }

    public final void dispatch(Runnable runnable, i iVar, boolean z8) {
        AbstractC5972b timeSource = AbstractC5974c.getTimeSource();
        if (timeSource != null) {
            timeSource.trackTask();
        }
        h hVarCreateTask = createTask(runnable, iVar);
        boolean z9 = false;
        boolean z10 = hVarCreateTask.taskContext.getTaskMode() == 1;
        long jAddAndGet = z10 ? f37158b.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        c cVarC = c();
        h hVarG = g(cVarC, hVarCreateTask, z8);
        if (hVarG != null && !a(hVarG)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        if (z8 && cVarC != null) {
            z9 = true;
        }
        if (z10) {
            f(jAddAndGet, z9);
        } else {
            if (z9) {
                return;
            }
            signalCpuWork();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch$default(this, runnable, null, false, 6, null);
    }

    public final boolean isTerminated() {
        return f37159c.get(this) != 0;
    }

    public final boolean parkedWorkersStackPush(c cVar) {
        long j8;
        long j9;
        int indexInArray;
        if (cVar.getNextParkedWorker() != NOT_IN_STACK) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37157a;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            j9 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j8) & (-2097152);
            indexInArray = cVar.getIndexInArray();
            cVar.setNextParkedWorker(this.workers.get((int) (2097151 & j8)));
        } while (!f37157a.compareAndSet(this, j8, j9 | indexInArray));
        return true;
    }

    public final void parkedWorkersStackTopUpdate(c cVar, int i8, int i9) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f37157a;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            int iD = (int) (2097151 & j8);
            long j9 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j8) & (-2097152);
            if (iD == i8) {
                iD = i9 == 0 ? d(cVar) : i9;
            }
            if (iD >= 0 && f37157a.compareAndSet(this, j8, j9 | iD)) {
                return;
            }
        }
    }

    public final void runSafely(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                AbstractC5972b timeSource = AbstractC5974c.getTimeSource();
                if (timeSource == null) {
                }
            } finally {
                AbstractC5972b timeSource2 = AbstractC5974c.getTimeSource();
                if (timeSource2 != null) {
                    timeSource2.unTrackTask();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void shutdown(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = u7.ExecutorC6421a.f37159c
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            u7.a$c r0 = r7.c()
            s7.F r1 = r7.workers
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = access$getControlState$FU$p()     // Catch: java.lang.Throwable -> L87
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L87
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L49
            r1 = r2
        L23:
            s7.F r4 = r7.workers
            java.lang.Object r4 = r4.get(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            u7.a$c r4 = (u7.ExecutorC6421a.c) r4
            if (r4 == r0) goto L44
        L30:
            boolean r5 = r4.isAlive()
            if (r5 == 0) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L30
        L3d:
            u7.n r4 = r4.localQueue
            u7.d r5 = r7.globalBlockingQueue
            r4.offloadAllWorkTo(r5)
        L44:
            if (r1 == r3) goto L49
            int r1 = r1 + 1
            goto L23
        L49:
            u7.d r8 = r7.globalBlockingQueue
            r8.close()
            u7.d r8 = r7.globalCpuQueue
            r8.close()
        L53:
            if (r0 == 0) goto L5b
            u7.h r8 = r0.findTask(r2)
            if (r8 != 0) goto L83
        L5b:
            u7.d r8 = r7.globalCpuQueue
            java.lang.Object r8 = r8.removeFirstOrNull()
            u7.h r8 = (u7.h) r8
            if (r8 != 0) goto L83
            u7.d r8 = r7.globalBlockingQueue
            java.lang.Object r8 = r8.removeFirstOrNull()
            u7.h r8 = (u7.h) r8
            if (r8 != 0) goto L83
            if (r0 == 0) goto L76
            u7.a$d r8 = u7.ExecutorC6421a.d.TERMINATED
            r0.tryReleaseCpu(r8)
        L76:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = u7.ExecutorC6421a.f37157a
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = u7.ExecutorC6421a.f37158b
            r8.set(r7, r0)
            return
        L83:
            r7.runSafely(r8)
            goto L53
        L87:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.ExecutorC6421a.shutdown(long):void");
    }

    public final void signalCpuWork() {
        if (j() || i(this, 0L, 1, null)) {
            return;
        }
        j();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iCurrentLength = this.workers.currentLength();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < iCurrentLength; i13++) {
            c cVar = (c) this.workers.get(i13);
            if (cVar != null) {
                int size$kotlinx_coroutines_core = cVar.localQueue.getSize$kotlinx_coroutines_core();
                int i14 = b.$EnumSwitchMapping$0[cVar.state.ordinal()];
                if (i14 == 1) {
                    i10++;
                } else if (i14 == 2) {
                    i9++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(size$kotlinx_coroutines_core);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i14 == 3) {
                    i8++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(size$kotlinx_coroutines_core);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i14 == 4) {
                    i11++;
                    if (size$kotlinx_coroutines_core > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(size$kotlinx_coroutines_core);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i14 == 5) {
                    i12++;
                }
            }
        }
        long j8 = f37158b.get(this);
        return this.schedulerName + '@' + P.getHexAddress(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i8 + ", blocking = " + i9 + ", parked = " + i10 + ", dormant = " + i11 + ", terminated = " + i12 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.getSize() + ", global blocking queue size = " + this.globalBlockingQueue.getSize() + ", Control State {created workers= " + ((int) (2097151 & j8)) + ", blocking tasks = " + ((int) ((4398044413952L & j8) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j8) >> 42))) + "}]";
    }

    /* renamed from: u7.a$c */
    public final class c extends Thread {

        /* renamed from: f */
        private static final AtomicIntegerFieldUpdater f37160f = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: a */
        private final Ref.ObjectRef f37161a;

        /* renamed from: b */
        private long f37162b;

        /* renamed from: c */
        private long f37163c;

        /* renamed from: d */
        private int f37164d;
        private volatile int indexInArray;
        public final n localQueue;
        public boolean mayHaveLocalTasks;
        private volatile Object nextParkedWorker;
        public d state;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.localQueue = new n();
            this.f37161a = new Ref.ObjectRef();
            this.state = d.DORMANT;
            this.nextParkedWorker = ExecutorC6421a.NOT_IN_STACK;
            this.f37164d = h7.f.Default.nextInt();
        }

        private final void a(int i8) {
            if (i8 == 0) {
                return;
            }
            ExecutorC6421a.f37158b.addAndGet(ExecutorC6421a.this, -2097152L);
            if (this.state != d.TERMINATED) {
                this.state = d.DORMANT;
            }
        }

        private final void b(int i8) {
            if (i8 != 0 && tryReleaseCpu(d.BLOCKING)) {
                ExecutorC6421a.this.signalCpuWork();
            }
        }

        private final void c(h hVar) {
            int taskMode = hVar.taskContext.getTaskMode();
            g(taskMode);
            b(taskMode);
            ExecutorC6421a.this.runSafely(hVar);
            a(taskMode);
        }

        private final h d(boolean z8) {
            h hVarJ;
            h hVarJ2;
            if (z8) {
                boolean z9 = nextInt(ExecutorC6421a.this.corePoolSize * 2) == 0;
                if (z9 && (hVarJ2 = j()) != null) {
                    return hVarJ2;
                }
                h hVarPoll = this.localQueue.poll();
                if (hVarPoll != null) {
                    return hVarPoll;
                }
                if (!z9 && (hVarJ = j()) != null) {
                    return hVarJ;
                }
            } else {
                h hVarJ3 = j();
                if (hVarJ3 != null) {
                    return hVarJ3;
                }
            }
            return n(3);
        }

        private final h e() {
            h hVarPollBlocking = this.localQueue.pollBlocking();
            if (hVarPollBlocking != null) {
                return hVarPollBlocking;
            }
            h hVar = (h) ExecutorC6421a.this.globalBlockingQueue.removeFirstOrNull();
            return hVar == null ? n(1) : hVar;
        }

        private final h f() {
            h hVarPollCpu = this.localQueue.pollCpu();
            if (hVarPollCpu != null) {
                return hVarPollCpu;
            }
            h hVar = (h) ExecutorC6421a.this.globalBlockingQueue.removeFirstOrNull();
            return hVar == null ? n(2) : hVar;
        }

        private final void g(int i8) {
            this.f37162b = 0L;
            if (this.state == d.PARKING) {
                this.state = d.BLOCKING;
            }
        }

        private final boolean h() {
            return this.nextParkedWorker != ExecutorC6421a.NOT_IN_STACK;
        }

        private final void i() {
            if (this.f37162b == 0) {
                this.f37162b = System.nanoTime() + ExecutorC6421a.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(ExecutorC6421a.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.f37162b >= 0) {
                this.f37162b = 0L;
                o();
            }
        }

        private final h j() {
            if (nextInt(2) == 0) {
                h hVar = (h) ExecutorC6421a.this.globalCpuQueue.removeFirstOrNull();
                return hVar != null ? hVar : (h) ExecutorC6421a.this.globalBlockingQueue.removeFirstOrNull();
            }
            h hVar2 = (h) ExecutorC6421a.this.globalBlockingQueue.removeFirstOrNull();
            return hVar2 != null ? hVar2 : (h) ExecutorC6421a.this.globalCpuQueue.removeFirstOrNull();
        }

        private final void k() {
            loop0: while (true) {
                boolean z8 = false;
                while (!ExecutorC6421a.this.isTerminated() && this.state != d.TERMINATED) {
                    h hVarFindTask = findTask(this.mayHaveLocalTasks);
                    if (hVarFindTask != null) {
                        this.f37163c = 0L;
                        c(hVarFindTask);
                    } else {
                        this.mayHaveLocalTasks = false;
                        if (this.f37163c == 0) {
                            m();
                        } else if (z8) {
                            tryReleaseCpu(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f37163c);
                            this.f37163c = 0L;
                        } else {
                            z8 = true;
                        }
                    }
                }
                break loop0;
            }
            tryReleaseCpu(d.TERMINATED);
        }

        private final boolean l() {
            long j8;
            if (this.state == d.CPU_ACQUIRED) {
                return true;
            }
            ExecutorC6421a executorC6421a = ExecutorC6421a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC6421a.f37158b;
            do {
                j8 = atomicLongFieldUpdater.get(executorC6421a);
                if (((int) ((9223367638808264704L & j8) >> 42)) == 0) {
                    return false;
                }
            } while (!ExecutorC6421a.f37158b.compareAndSet(executorC6421a, j8, j8 - 4398046511104L));
            this.state = d.CPU_ACQUIRED;
            return true;
        }

        private final void m() {
            if (!h()) {
                ExecutorC6421a.this.parkedWorkersStackPush(this);
                return;
            }
            f37160f.set(this, -1);
            while (h() && f37160f.get(this) == -1 && !ExecutorC6421a.this.isTerminated() && this.state != d.TERMINATED) {
                tryReleaseCpu(d.PARKING);
                Thread.interrupted();
                i();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final h n(int i8) {
            int i9 = (int) (ExecutorC6421a.f37158b.get(ExecutorC6421a.this) & 2097151);
            if (i9 < 2) {
                return null;
            }
            int iNextInt = nextInt(i9);
            ExecutorC6421a executorC6421a = ExecutorC6421a.this;
            long jMin = Long.MAX_VALUE;
            for (int i10 = 0; i10 < i9; i10++) {
                iNextInt++;
                if (iNextInt > i9) {
                    iNextInt = 1;
                }
                c cVar = (c) executorC6421a.workers.get(iNextInt);
                if (cVar != null && cVar != this) {
                    long jTrySteal = cVar.localQueue.trySteal(i8, this.f37161a);
                    if (jTrySteal == -1) {
                        Ref.ObjectRef objectRef = this.f37161a;
                        h hVar = (h) objectRef.element;
                        objectRef.element = null;
                        return hVar;
                    }
                    if (jTrySteal > 0) {
                        jMin = Math.min(jMin, jTrySteal);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f37163c = jMin;
            return null;
        }

        private final void o() {
            ExecutorC6421a executorC6421a = ExecutorC6421a.this;
            synchronized (executorC6421a.workers) {
                try {
                    if (executorC6421a.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC6421a.f37158b.get(executorC6421a) & 2097151)) <= executorC6421a.corePoolSize) {
                        return;
                    }
                    if (f37160f.compareAndSet(this, -1, 1)) {
                        int i8 = this.indexInArray;
                        setIndexInArray(0);
                        executorC6421a.parkedWorkersStackTopUpdate(this, i8, 0);
                        int andDecrement = (int) (ExecutorC6421a.f37158b.getAndDecrement(executorC6421a) & 2097151);
                        if (andDecrement != i8) {
                            Object obj = executorC6421a.workers.get(andDecrement);
                            Intrinsics.checkNotNull(obj);
                            c cVar = (c) obj;
                            executorC6421a.workers.setSynchronized(i8, cVar);
                            cVar.setIndexInArray(i8);
                            executorC6421a.parkedWorkersStackTopUpdate(cVar, andDecrement, i8);
                        }
                        executorC6421a.workers.setSynchronized(andDecrement, null);
                        G g8 = G.INSTANCE;
                        this.state = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final h findTask(boolean z8) {
            return l() ? d(z8) : e();
        }

        public final int getIndexInArray() {
            return this.indexInArray;
        }

        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final ExecutorC6421a getScheduler() {
            return ExecutorC6421a.this;
        }

        public final int getWorkerCtl() {
            return this.workerCtl;
        }

        public final boolean isIo() {
            return this.state == d.BLOCKING;
        }

        public final int nextInt(int i8) {
            int i9 = this.f37164d;
            int i10 = i9 ^ (i9 << 13);
            int i11 = i10 ^ (i10 >> 17);
            int i12 = i11 ^ (i11 << 5);
            this.f37164d = i12;
            int i13 = i8 - 1;
            return (i13 & i8) == 0 ? i12 & i13 : (i12 & Integer.MAX_VALUE) % i8;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            k();
        }

        public final long runSingleTask() {
            boolean z8 = this.state == d.CPU_ACQUIRED;
            h hVarF = z8 ? f() : e();
            if (hVarF == null) {
                long j8 = this.f37163c;
                if (j8 == 0) {
                    return -1L;
                }
                return j8;
            }
            ExecutorC6421a.this.runSafely(hVarF);
            if (!z8) {
                ExecutorC6421a.f37158b.addAndGet(ExecutorC6421a.this, -2097152L);
            }
            return 0L;
        }

        public final void setIndexInArray(int i8) {
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC6421a.this.schedulerName);
            sb.append("-worker-");
            sb.append(i8 == 0 ? "TERMINATED" : String.valueOf(i8));
            setName(sb.toString());
            this.indexInArray = i8;
        }

        public final void setNextParkedWorker(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean tryReleaseCpu(d dVar) {
            d dVar2 = this.state;
            boolean z8 = dVar2 == d.CPU_ACQUIRED;
            if (z8) {
                ExecutorC6421a.f37158b.addAndGet(ExecutorC6421a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.state = dVar;
            }
            return z8;
        }

        public c(ExecutorC6421a executorC6421a, int i8) {
            this();
            setIndexInArray(i8);
        }
    }

    public /* synthetic */ ExecutorC6421a(int i8, int i9, long j8, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i8, i9, (i10 & 4) != 0 ? l.IDLE_WORKER_KEEP_ALIVE_NS : j8, (i10 & 8) != 0 ? l.DEFAULT_SCHEDULER_NAME : str);
    }
}
