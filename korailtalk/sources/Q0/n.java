package Q0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class n implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f3930b;

    /* renamed from: d, reason: collision with root package name */
    private volatile Runnable f3932d;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f3929a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Object f3931c = new Object();

    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final n f3933a;

        /* renamed from: b, reason: collision with root package name */
        final Runnable f3934b;

        a(n nVar, Runnable runnable) {
            this.f3933a = nVar;
            this.f3934b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f3934b.run();
            } finally {
                this.f3933a.a();
            }
        }
    }

    public n(Executor executor) {
        this.f3930b = executor;
    }

    void a() {
        synchronized (this.f3931c) {
            try {
                Runnable runnable = (Runnable) this.f3929a.poll();
                this.f3932d = runnable;
                if (runnable != null) {
                    this.f3930b.execute(this.f3932d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f3931c) {
            try {
                this.f3929a.add(new a(this, runnable));
                if (this.f3932d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Executor getDelegatedExecutor() {
        return this.f3930b;
    }

    public boolean hasPendingTasks() {
        boolean z8;
        synchronized (this.f3931c) {
            z8 = !this.f3929a.isEmpty();
        }
        return z8;
    }
}
