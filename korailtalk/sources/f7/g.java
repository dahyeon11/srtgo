package F7;

import C7.C0467a;
import C7.L;
import F7.k;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: g, reason: collision with root package name */
    private static final Executor f1316g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), D7.e.threadFactory("OkHttp ConnectionPool", true));

    /* renamed from: a, reason: collision with root package name */
    private final int f1317a;

    /* renamed from: b, reason: collision with root package name */
    private final long f1318b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f1319c = new Runnable() { // from class: F7.f
        @Override // java.lang.Runnable
        public final void run() throws IOException {
            this.f1315a.d();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private final Deque f1320d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    final h f1321e = new h();

    /* renamed from: f, reason: collision with root package name */
    boolean f1322f;

    public g(int i8, long j8, TimeUnit timeUnit) {
        this.f1317a = i8;
        this.f1318b = timeUnit.toNanos(j8);
        if (j8 > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() throws IOException {
        while (true) {
            long jB = b(System.nanoTime());
            if (jB == -1) {
                return;
            }
            if (jB > 0) {
                long j8 = jB / 1000000;
                long j9 = jB - (1000000 * j8);
                synchronized (this) {
                    try {
                        wait(j8, (int) j9);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    private int e(e eVar, long j8) {
        List list = eVar.f1311n;
        int i8 = 0;
        while (i8 < list.size()) {
            Reference reference = (Reference) list.get(i8);
            if (reference.get() != null) {
                i8++;
            } else {
                K7.j.get().logCloseableLeak("A connection to " + eVar.route().address().url() + " was leaked. Did you forget to close a response body?", ((k.b) reference).f1351a);
                list.remove(i8);
                eVar.f1306i = true;
                if (list.isEmpty()) {
                    eVar.f1312o = j8 - this.f1318b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    long b(long j8) throws IOException {
        synchronized (this) {
            try {
                e eVar = null;
                long j9 = Long.MIN_VALUE;
                int i8 = 0;
                int i9 = 0;
                for (e eVar2 : this.f1320d) {
                    if (e(eVar2, j8) > 0) {
                        i9++;
                    } else {
                        i8++;
                        long j10 = j8 - eVar2.f1312o;
                        if (j10 > j9) {
                            eVar = eVar2;
                            j9 = j10;
                        }
                    }
                }
                long j11 = this.f1318b;
                if (j9 < j11 && i8 <= this.f1317a) {
                    if (i8 > 0) {
                        return j11 - j9;
                    }
                    if (i9 > 0) {
                        return j11;
                    }
                    this.f1322f = false;
                    return -1L;
                }
                this.f1320d.remove(eVar);
                D7.e.closeQuietly(eVar.socket());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean c(e eVar) {
        if (eVar.f1306i || this.f1317a == 0) {
            this.f1320d.remove(eVar);
            return true;
        }
        notifyAll();
        return false;
    }

    public void connectFailed(L l8, IOException iOException) {
        if (l8.proxy().type() != Proxy.Type.DIRECT) {
            C0467a c0467aAddress = l8.address();
            c0467aAddress.proxySelector().connectFailed(c0467aAddress.url().uri(), l8.proxy().address(), iOException);
        }
        this.f1321e.failed(l8);
    }

    public synchronized int connectionCount() {
        return this.f1320d.size();
    }

    public void evictAll() throws IOException {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f1320d.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.f1311n.isEmpty()) {
                        eVar.f1306i = true;
                        arrayList.add(eVar);
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            D7.e.closeQuietly(((e) it2.next()).socket());
        }
    }

    void f(e eVar) {
        if (!this.f1322f) {
            this.f1322f = true;
            f1316g.execute(this.f1319c);
        }
        this.f1320d.add(eVar);
    }

    boolean g(C0467a c0467a, k kVar, List list, boolean z8) {
        for (e eVar : this.f1320d) {
            if (!z8 || eVar.isMultiplexed()) {
                if (eVar.g(c0467a, list)) {
                    kVar.a(eVar);
                    return true;
                }
            }
        }
        return false;
    }

    public synchronized int idleConnectionCount() {
        int i8;
        Iterator it = this.f1320d.iterator();
        i8 = 0;
        while (it.hasNext()) {
            if (((e) it.next()).f1311n.isEmpty()) {
                i8++;
            }
        }
        return i8;
    }
}
