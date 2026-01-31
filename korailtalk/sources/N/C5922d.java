package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5922d extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f34135a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f34136b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f34137c;

    /* renamed from: n.d$a */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f34138a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f34138a.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: n.d$b */
    private static class b {
        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // n.e
    public void executeOnDiskIO(Runnable runnable) {
        this.f34136b.execute(runnable);
    }

    @Override // n.e
    public boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // n.e
    public void postToMainThread(Runnable runnable) {
        if (this.f34137c == null) {
            synchronized (this.f34135a) {
                try {
                    if (this.f34137c == null) {
                        this.f34137c = a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f34137c.post(runnable);
    }
}
