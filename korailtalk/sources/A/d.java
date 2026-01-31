package A;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class d implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private static volatile Executor f17b;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f18a = Executors.newSingleThreadExecutor(new a());

    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    d() {
    }

    static Executor a() {
        if (f17b != null) {
            return f17b;
        }
        synchronized (d.class) {
            try {
                if (f17b == null) {
                    f17b = new d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f17b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f18a.execute(runnable);
    }
}
