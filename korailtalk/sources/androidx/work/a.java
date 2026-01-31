package androidx.work;

import H0.i;
import H0.k;
import H0.t;
import H0.z;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a {
    public static final int MIN_SCHEDULER_LIMIT = 20;

    /* renamed from: a, reason: collision with root package name */
    final Executor f11110a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f11111b;

    /* renamed from: c, reason: collision with root package name */
    final z f11112c;

    /* renamed from: d, reason: collision with root package name */
    final k f11113d;

    /* renamed from: e, reason: collision with root package name */
    final t f11114e;

    /* renamed from: f, reason: collision with root package name */
    final String f11115f;

    /* renamed from: g, reason: collision with root package name */
    final int f11116g;

    /* renamed from: h, reason: collision with root package name */
    final int f11117h;

    /* renamed from: i, reason: collision with root package name */
    final int f11118i;

    /* renamed from: j, reason: collision with root package name */
    final int f11119j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f11120k;

    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0178a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f11121a = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11122b;

        ThreadFactoryC0178a(boolean z8) {
            this.f11122b = z8;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f11122b ? "WM.task-" : "androidx.work-") + this.f11121a.incrementAndGet());
        }
    }

    a(b bVar) {
        Executor executor = bVar.f11124a;
        if (executor == null) {
            this.f11110a = a(false);
        } else {
            this.f11110a = executor;
        }
        Executor executor2 = bVar.f11127d;
        if (executor2 == null) {
            this.f11120k = true;
            this.f11111b = a(true);
        } else {
            this.f11120k = false;
            this.f11111b = executor2;
        }
        z zVar = bVar.f11125b;
        if (zVar == null) {
            this.f11112c = z.getDefaultWorkerFactory();
        } else {
            this.f11112c = zVar;
        }
        k kVar = bVar.f11126c;
        if (kVar == null) {
            this.f11113d = k.getDefaultInputMergerFactory();
        } else {
            this.f11113d = kVar;
        }
        t tVar = bVar.f11128e;
        if (tVar == null) {
            this.f11114e = new I0.a();
        } else {
            this.f11114e = tVar;
        }
        this.f11116g = bVar.f11130g;
        this.f11117h = bVar.f11131h;
        this.f11118i = bVar.f11132i;
        this.f11119j = bVar.f11133j;
        this.f11115f = bVar.f11129f;
    }

    private Executor a(boolean z8) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z8));
    }

    private ThreadFactory b(boolean z8) {
        return new ThreadFactoryC0178a(z8);
    }

    public String getDefaultProcessName() {
        return this.f11115f;
    }

    public i getExceptionHandler() {
        return null;
    }

    public Executor getExecutor() {
        return this.f11110a;
    }

    public k getInputMergerFactory() {
        return this.f11113d;
    }

    public int getMaxJobSchedulerId() {
        return this.f11118i;
    }

    public int getMaxSchedulerLimit() {
        return this.f11119j;
    }

    public int getMinJobSchedulerId() {
        return this.f11117h;
    }

    public int getMinimumLoggingLevel() {
        return this.f11116g;
    }

    public t getRunnableScheduler() {
        return this.f11114e;
    }

    public Executor getTaskExecutor() {
        return this.f11111b;
    }

    public z getWorkerFactory() {
        return this.f11112c;
    }

    public boolean isUsingDefaultTaskExecutor() {
        return this.f11120k;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        Executor f11124a;

        /* renamed from: b, reason: collision with root package name */
        z f11125b;

        /* renamed from: c, reason: collision with root package name */
        k f11126c;

        /* renamed from: d, reason: collision with root package name */
        Executor f11127d;

        /* renamed from: e, reason: collision with root package name */
        t f11128e;

        /* renamed from: f, reason: collision with root package name */
        String f11129f;

        /* renamed from: g, reason: collision with root package name */
        int f11130g;

        /* renamed from: h, reason: collision with root package name */
        int f11131h;

        /* renamed from: i, reason: collision with root package name */
        int f11132i;

        /* renamed from: j, reason: collision with root package name */
        int f11133j;

        public b() {
            this.f11130g = 4;
            this.f11131h = 0;
            this.f11132i = Integer.MAX_VALUE;
            this.f11133j = 20;
        }

        public a build() {
            return new a(this);
        }

        public b setDefaultProcessName(String str) {
            this.f11129f = str;
            return this;
        }

        public b setExecutor(Executor executor) {
            this.f11124a = executor;
            return this;
        }

        public b setInputMergerFactory(k kVar) {
            this.f11126c = kVar;
            return this;
        }

        public b setJobSchedulerJobIdRange(int i8, int i9) {
            if (i9 - i8 < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.f11131h = i8;
            this.f11132i = i9;
            return this;
        }

        public b setMaxSchedulerLimit(int i8) {
            if (i8 < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.f11133j = Math.min(i8, 50);
            return this;
        }

        public b setMinimumLoggingLevel(int i8) {
            this.f11130g = i8;
            return this;
        }

        public b setRunnableScheduler(t tVar) {
            this.f11128e = tVar;
            return this;
        }

        public b setTaskExecutor(Executor executor) {
            this.f11127d = executor;
            return this;
        }

        public b setWorkerFactory(z zVar) {
            this.f11125b = zVar;
            return this;
        }

        public b(a aVar) {
            this.f11124a = aVar.f11110a;
            this.f11125b = aVar.f11112c;
            this.f11126c = aVar.f11113d;
            this.f11127d = aVar.f11111b;
            this.f11130g = aVar.f11116g;
            this.f11131h = aVar.f11117h;
            this.f11132i = aVar.f11118i;
            this.f11133j = aVar.f11119j;
            this.f11128e = aVar.f11114e;
            this.f11129f = aVar.f11115f;
        }

        public b setInitializationExceptionHandler(i iVar) {
            return this;
        }
    }
}
