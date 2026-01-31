package androidx.camera.core;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import z.InterfaceC6607y;

/* renamed from: androidx.camera.core.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class ExecutorC0896p implements Executor {

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadFactory f7797c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Object f7798a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private ThreadPoolExecutor f7799b = b();

    /* renamed from: androidx.camera.core.p$a */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f7800a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f7800a.getAndIncrement())));
            return thread;
        }
    }

    ExecutorC0896p() {
    }

    private static ThreadPoolExecutor b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f7797c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: androidx.camera.core.o
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                B0.e("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    void c() {
        synchronized (this.f7798a) {
            try {
                if (!this.f7799b.isShutdown()) {
                    this.f7799b.shutdown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(InterfaceC6607y interfaceC6607y) {
        ThreadPoolExecutor threadPoolExecutor;
        Z.h.checkNotNull(interfaceC6607y);
        synchronized (this.f7798a) {
            try {
                if (this.f7799b.isShutdown()) {
                    this.f7799b = b();
                }
                threadPoolExecutor = this.f7799b;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, interfaceC6607y.getAvailableCameraIds().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Z.h.checkNotNull(runnable);
        synchronized (this.f7798a) {
            this.f7799b.execute(runnable);
        }
    }
}
