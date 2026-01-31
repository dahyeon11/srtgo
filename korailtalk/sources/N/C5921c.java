package n;

import java.util.concurrent.Executor;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5921c extends e {

    /* renamed from: c, reason: collision with root package name */
    private static volatile C5921c f34130c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f34131d = new Executor() { // from class: n.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C5921c.c(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f34132e = new Executor() { // from class: n.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C5921c.d(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private e f34133a;

    /* renamed from: b, reason: collision with root package name */
    private final e f34134b;

    private C5921c() {
        C5922d c5922d = new C5922d();
        this.f34134b = c5922d;
        this.f34133a = c5922d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Runnable runnable) {
        getInstance().postToMainThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Runnable runnable) {
        getInstance().executeOnDiskIO(runnable);
    }

    public static Executor getIOThreadExecutor() {
        return f34132e;
    }

    public static C5921c getInstance() {
        if (f34130c != null) {
            return f34130c;
        }
        synchronized (C5921c.class) {
            try {
                if (f34130c == null) {
                    f34130c = new C5921c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f34130c;
    }

    public static Executor getMainThreadExecutor() {
        return f34131d;
    }

    @Override // n.e
    public void executeOnDiskIO(Runnable runnable) {
        this.f34133a.executeOnDiskIO(runnable);
    }

    @Override // n.e
    public boolean isMainThread() {
        return this.f34133a.isMainThread();
    }

    @Override // n.e
    public void postToMainThread(Runnable runnable) {
        this.f34133a.postToMainThread(runnable);
    }

    public void setDelegate(e eVar) {
        if (eVar == null) {
            eVar = this.f34134b;
        }
        this.f34133a = eVar;
    }
}
