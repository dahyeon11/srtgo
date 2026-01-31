package Q0;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class v {

    /* renamed from: f, reason: collision with root package name */
    private static final String f3981f = H0.l.tagWithPrefix("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f3982a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f3983b;

    /* renamed from: c, reason: collision with root package name */
    final Map f3984c;

    /* renamed from: d, reason: collision with root package name */
    final Map f3985d;

    /* renamed from: e, reason: collision with root package name */
    final Object f3986e;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f3987a = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f3987a);
            this.f3987a = this.f3987a + 1;
            return threadNewThread;
        }
    }

    public interface b {
        void onTimeLimitExceeded(String str);
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final v f3989a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3990b;

        c(v vVar, String str) {
            this.f3989a = vVar;
            this.f3990b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f3989a.f3986e) {
                try {
                    if (((c) this.f3989a.f3984c.remove(this.f3990b)) != null) {
                        b bVar = (b) this.f3989a.f3985d.remove(this.f3990b);
                        if (bVar != null) {
                            bVar.onTimeLimitExceeded(this.f3990b);
                        }
                    } else {
                        H0.l.get().debug("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f3990b), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public v() {
        a aVar = new a();
        this.f3982a = aVar;
        this.f3984c = new HashMap();
        this.f3985d = new HashMap();
        this.f3986e = new Object();
        this.f3983b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public ScheduledExecutorService getExecutorService() {
        return this.f3983b;
    }

    public synchronized Map<String, b> getListeners() {
        return this.f3985d;
    }

    public synchronized Map<String, c> getTimerMap() {
        return this.f3984c;
    }

    public void onDestroy() {
        if (this.f3983b.isShutdown()) {
            return;
        }
        this.f3983b.shutdownNow();
    }

    public void startTimer(String str, long j8, b bVar) {
        synchronized (this.f3986e) {
            H0.l.get().debug(f3981f, String.format("Starting timer for %s", str), new Throwable[0]);
            stopTimer(str);
            c cVar = new c(this, str);
            this.f3984c.put(str, cVar);
            this.f3985d.put(str, bVar);
            this.f3983b.schedule(cVar, j8, TimeUnit.MILLISECONDS);
        }
    }

    public void stopTimer(String str) {
        synchronized (this.f3986e) {
            try {
                if (((c) this.f3984c.remove(str)) != null) {
                    H0.l.get().debug(f3981f, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.f3985d.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
