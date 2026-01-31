package l0;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: l0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5881c {
    public static final Executor THREAD_POOL_EXECUTOR;

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadFactory f33920f;

    /* renamed from: g, reason: collision with root package name */
    private static final BlockingQueue f33921g;

    /* renamed from: h, reason: collision with root package name */
    private static f f33922h;

    /* renamed from: i, reason: collision with root package name */
    private static volatile Executor f33923i;

    /* renamed from: a, reason: collision with root package name */
    private final h f33924a;

    /* renamed from: b, reason: collision with root package name */
    private final FutureTask f33925b;

    /* renamed from: c, reason: collision with root package name */
    private volatile g f33926c = g.PENDING;

    /* renamed from: d, reason: collision with root package name */
    final AtomicBoolean f33927d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f33928e = new AtomicBoolean();

    /* renamed from: l0.c$a */
    static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f33929a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f33929a.getAndIncrement());
        }
    }

    /* renamed from: l0.c$b */
    class b extends h {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            AbstractC5881c.this.f33928e.set(true);
            Object objA = null;
            try {
                Process.setThreadPriority(10);
                objA = AbstractC5881c.this.a(this.f33936a);
                Binder.flushPendingCommands();
                return objA;
            } finally {
            }
        }
    }

    /* renamed from: l0.c$c, reason: collision with other inner class name */
    class C0343c extends FutureTask {
        C0343c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC5881c.this.i(get());
            } catch (InterruptedException e8) {
                Log.w("AsyncTask", e8);
            } catch (CancellationException unused) {
                AbstractC5881c.this.i(null);
            } catch (ExecutionException e9) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e9.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: l0.c$d */
    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33932a;

        static {
            int[] iArr = new int[g.values().length];
            f33932a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33932a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: l0.c$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC5881c f33933a;

        /* renamed from: b, reason: collision with root package name */
        final Object[] f33934b;

        e(AbstractC5881c abstractC5881c, Object... objArr) {
            this.f33933a = abstractC5881c;
            this.f33934b = objArr;
        }
    }

    /* renamed from: l0.c$f */
    private static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i8 = message.what;
            if (i8 == 1) {
                eVar.f33933a.b(eVar.f33934b[0]);
            } else {
                if (i8 != 2) {
                    return;
                }
                eVar.f33933a.g(eVar.f33934b);
            }
        }
    }

    /* renamed from: l0.c$g */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: l0.c$h */
    private static abstract class h implements Callable {

        /* renamed from: a, reason: collision with root package name */
        Object[] f33936a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f33920f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f33921g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        THREAD_POOL_EXECUTOR = threadPoolExecutor;
        f33923i = threadPoolExecutor;
    }

    AbstractC5881c() {
        b bVar = new b();
        this.f33924a = bVar;
        this.f33925b = new C0343c(bVar);
    }

    private static Handler c() {
        f fVar;
        synchronized (AbstractC5881c.class) {
            try {
                if (f33922h == null) {
                    f33922h = new f();
                }
                fVar = f33922h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static void setDefaultExecutor(Executor executor) {
        f33923i = executor;
    }

    protected abstract Object a(Object... objArr);

    void b(Object obj) {
        if (isCancelled()) {
            d(obj);
        } else {
            e(obj);
        }
        this.f33926c = g.FINISHED;
    }

    public final boolean cancel(boolean z8) {
        this.f33927d.set(true);
        return this.f33925b.cancel(z8);
    }

    protected abstract void d(Object obj);

    protected abstract void e(Object obj);

    public final AbstractC5881c execute(Object... objArr) {
        return executeOnExecutor(f33923i, objArr);
    }

    public final AbstractC5881c executeOnExecutor(Executor executor, Object... objArr) {
        if (this.f33926c == g.PENDING) {
            this.f33926c = g.RUNNING;
            f();
            this.f33924a.f33936a = objArr;
            executor.execute(this.f33925b);
            return this;
        }
        int i8 = d.f33932a[this.f33926c.ordinal()];
        if (i8 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i8 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    public final Object get() {
        return this.f33925b.get();
    }

    public final g getStatus() {
        return this.f33926c;
    }

    Object h(Object obj) {
        c().obtainMessage(1, new e(this, obj)).sendToTarget();
        return obj;
    }

    void i(Object obj) {
        if (this.f33928e.get()) {
            return;
        }
        h(obj);
    }

    public final boolean isCancelled() {
        return this.f33927d.get();
    }

    public static void execute(Runnable runnable) {
        f33923i.execute(runnable);
    }

    public final Object get(long j8, TimeUnit timeUnit) {
        return this.f33925b.get(j8, timeUnit);
    }

    protected void f() {
    }

    protected void g(Object... objArr) {
    }
}
