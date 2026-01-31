package C7;

import C7.G;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: c */
    private Runnable f698c;

    /* renamed from: d */
    private ExecutorService f699d;

    /* renamed from: a */
    private int f696a = 64;

    /* renamed from: b */
    private int f697b = 5;

    /* renamed from: e */
    private final Deque f700e = new ArrayDeque();

    /* renamed from: f */
    private final Deque f701f = new ArrayDeque();

    /* renamed from: g */
    private final Deque f702g = new ArrayDeque();

    public q(ExecutorService executorService) {
        this.f699d = executorService;
    }

    private G.a c(String str) {
        for (G.a aVar : this.f701f) {
            if (aVar.d().equals(str)) {
                return aVar;
            }
        }
        for (G.a aVar2 : this.f700e) {
            if (aVar2.d().equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    private void f(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f698c;
        }
        if (g() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private boolean g() {
        int i8;
        boolean z8;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f700e.iterator();
                while (it.hasNext()) {
                    G.a aVar = (G.a) it.next();
                    if (this.f701f.size() >= this.f696a) {
                        break;
                    }
                    if (aVar.a().get() < this.f697b) {
                        it.remove();
                        aVar.a().incrementAndGet();
                        arrayList.add(aVar);
                        this.f701f.add(aVar);
                    }
                }
                z8 = runningCallsCount() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i8 = 0; i8 < size; i8++) {
            ((G.a) arrayList.get(i8)).b(executorService());
        }
        return z8;
    }

    void a(G.a aVar) {
        G.a aVarC;
        synchronized (this) {
            try {
                this.f700e.add(aVar);
                if (!aVar.c().f526d && (aVarC = c(aVar.d())) != null) {
                    aVar.e(aVarC);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
    }

    synchronized void b(G g8) {
        this.f702g.add(g8);
    }

    public synchronized void cancelAll() {
        try {
            Iterator it = this.f700e.iterator();
            while (it.hasNext()) {
                ((G.a) it.next()).c().cancel();
            }
            Iterator it2 = this.f701f.iterator();
            while (it2.hasNext()) {
                ((G.a) it2.next()).c().cancel();
            }
            Iterator it3 = this.f702g.iterator();
            while (it3.hasNext()) {
                ((G) it3.next()).cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void d(G.a aVar) {
        aVar.a().decrementAndGet();
        f(this.f701f, aVar);
    }

    void e(G g8) {
        f(this.f702g, g8);
    }

    public synchronized ExecutorService executorService() {
        try {
            if (this.f699d == null) {
                this.f699d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), D7.e.threadFactory("OkHttp Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f699d;
    }

    public synchronized int getMaxRequests() {
        return this.f696a;
    }

    public synchronized int getMaxRequestsPerHost() {
        return this.f697b;
    }

    public synchronized List<InterfaceC0472f> queuedCalls() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f700e.iterator();
            while (it.hasNext()) {
                arrayList.add(((G.a) it.next()).c());
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int queuedCallsCount() {
        return this.f700e.size();
    }

    public synchronized List<InterfaceC0472f> runningCalls() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            arrayList.addAll(this.f702g);
            Iterator it = this.f701f.iterator();
            while (it.hasNext()) {
                arrayList.add(((G.a) it.next()).c());
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int runningCallsCount() {
        return this.f701f.size() + this.f702g.size();
    }

    public synchronized void setIdleCallback(Runnable runnable) {
        this.f698c = runnable;
    }

    public void setMaxRequests(int i8) {
        if (i8 >= 1) {
            synchronized (this) {
                this.f696a = i8;
            }
            g();
        } else {
            throw new IllegalArgumentException("max < 1: " + i8);
        }
    }

    public void setMaxRequestsPerHost(int i8) {
        if (i8 >= 1) {
            synchronized (this) {
                this.f697b = i8;
            }
            g();
        } else {
            throw new IllegalArgumentException("max < 1: " + i8);
        }
    }

    public q() {
    }
}
