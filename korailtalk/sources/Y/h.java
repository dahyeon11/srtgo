package Y;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
abstract class h {

    private static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private String f5552a;

        /* renamed from: b, reason: collision with root package name */
        private int f5553b;

        /* renamed from: Y.h$a$a, reason: collision with other inner class name */
        private static class C0090a extends Thread {

            /* renamed from: a, reason: collision with root package name */
            private final int f5554a;

            C0090a(Runnable runnable, String str, int i8) {
                super(runnable, str);
                this.f5554a = i8;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(this.f5554a);
                super.run();
            }
        }

        a(String str, int i8) {
            this.f5552a = str;
            this.f5553b = i8;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0090a(runnable, this.f5552a, this.f5553b);
        }
    }

    private static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f5555a;

        b(Handler handler) {
            this.f5555a = (Handler) Z.h.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f5555a.post((Runnable) Z.h.checkNotNull(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f5555a + " is shutting down");
        }
    }

    private static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Callable f5556a;

        /* renamed from: b, reason: collision with root package name */
        private Z.a f5557b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f5558c;

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Z.a f5559a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f5560b;

            a(Z.a aVar, Object obj) {
                this.f5559a = aVar;
                this.f5560b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f5559a.accept(this.f5560b);
            }
        }

        c(Handler handler, Callable callable, Z.a aVar) {
            this.f5556a = callable;
            this.f5557b = aVar;
            this.f5558c = handler;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            Object objCall;
            try {
                objCall = this.f5556a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f5558c.post(new a(this.f5557b, objCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i8, int i9) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i9, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i8));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static void c(Executor executor, Callable callable, Z.a aVar) {
        executor.execute(new c(Y.b.a(), callable, aVar));
    }

    static Object d(ExecutorService executorService, Callable callable, int i8) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i8, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            throw e8;
        } catch (ExecutionException e9) {
            throw new RuntimeException(e9);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
