package A;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class e implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private static volatile Executor f20b;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f21a = Executors.newFixedThreadPool(2, new a());

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f22a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f22a.getAndIncrement())));
            return thread;
        }
    }

    e() {
    }

    static Executor a() {
        if (f20b != null) {
            return f20b;
        }
        synchronized (e.class) {
            try {
                if (f20b == null) {
                    f20b = new e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f20b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f21a.execute(runnable);
    }
}
