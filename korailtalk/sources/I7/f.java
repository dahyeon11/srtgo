package I7;

import I7.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class f implements Closeable {

    /* renamed from: z */
    private static final ExecutorService f2387z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), D7.e.threadFactory("OkHttp Http2Connection", true));

    /* renamed from: a */
    final boolean f2388a;

    /* renamed from: b */
    final j f2389b;

    /* renamed from: d */
    final String f2391d;

    /* renamed from: e */
    int f2392e;

    /* renamed from: f */
    int f2393f;

    /* renamed from: g */
    private boolean f2394g;

    /* renamed from: h */
    private final ScheduledExecutorService f2395h;

    /* renamed from: i */
    private final ExecutorService f2396i;

    /* renamed from: j */
    final I7.l f2397j;

    /* renamed from: s */
    long f2406s;

    /* renamed from: u */
    final m f2408u;

    /* renamed from: v */
    final Socket f2409v;

    /* renamed from: w */
    final I7.j f2410w;

    /* renamed from: x */
    final l f2411x;

    /* renamed from: y */
    final Set f2412y;

    /* renamed from: c */
    final Map f2390c = new LinkedHashMap();

    /* renamed from: k */
    private long f2398k = 0;

    /* renamed from: l */
    private long f2399l = 0;

    /* renamed from: m */
    private long f2400m = 0;

    /* renamed from: n */
    private long f2401n = 0;

    /* renamed from: o */
    private long f2402o = 0;

    /* renamed from: p */
    private long f2403p = 0;

    /* renamed from: q */
    private long f2404q = 0;

    /* renamed from: r */
    long f2405r = 0;

    /* renamed from: t */
    m f2407t = new m();

    class a extends D7.b {

        /* renamed from: b */
        final /* synthetic */ int f2413b;

        /* renamed from: c */
        final /* synthetic */ I7.b f2414c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i8, I7.b bVar) {
            super(str, objArr);
            this.f2413b = i8;
            this.f2414c = bVar;
        }

        @Override // D7.b
        public void execute() throws IOException {
            try {
                f.this.B(this.f2413b, this.f2414c);
            } catch (IOException e8) {
                f.this.m(e8);
            }
        }
    }

    class b extends D7.b {

        /* renamed from: b */
        final /* synthetic */ int f2416b;

        /* renamed from: c */
        final /* synthetic */ long f2417c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i8, long j8) {
            super(str, objArr);
            this.f2416b = i8;
            this.f2417c = j8;
        }

        @Override // D7.b
        public void execute() throws IOException {
            try {
                f.this.f2410w.windowUpdate(this.f2416b, this.f2417c);
            } catch (IOException e8) {
                f.this.m(e8);
            }
        }
    }

    class c extends D7.b {
        c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // D7.b
        public void execute() throws IOException {
            f.this.A(false, 2, 0);
        }
    }

    class d extends D7.b {

        /* renamed from: b */
        final /* synthetic */ int f2420b;

        /* renamed from: c */
        final /* synthetic */ List f2421c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i8, List list) {
            super(str, objArr);
            this.f2420b = i8;
            this.f2421c = list;
        }

        @Override // D7.b
        public void execute() {
            if (f.this.f2397j.onRequest(this.f2420b, this.f2421c)) {
                try {
                    f.this.f2410w.rstStream(this.f2420b, I7.b.CANCEL);
                    synchronized (f.this) {
                        f.this.f2412y.remove(Integer.valueOf(this.f2420b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    class e extends D7.b {

        /* renamed from: b */
        final /* synthetic */ int f2423b;

        /* renamed from: c */
        final /* synthetic */ List f2424c;

        /* renamed from: d */
        final /* synthetic */ boolean f2425d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i8, List list, boolean z8) {
            super(str, objArr);
            this.f2423b = i8;
            this.f2424c = list;
            this.f2425d = z8;
        }

        @Override // D7.b
        public void execute() {
            boolean zOnHeaders = f.this.f2397j.onHeaders(this.f2423b, this.f2424c, this.f2425d);
            if (zOnHeaders) {
                try {
                    f.this.f2410w.rstStream(this.f2423b, I7.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zOnHeaders || this.f2425d) {
                synchronized (f.this) {
                    f.this.f2412y.remove(Integer.valueOf(this.f2423b));
                }
            }
        }
    }

    /* renamed from: I7.f$f */
    class C0041f extends D7.b {

        /* renamed from: b */
        final /* synthetic */ int f2427b;

        /* renamed from: c */
        final /* synthetic */ P7.c f2428c;

        /* renamed from: d */
        final /* synthetic */ int f2429d;

        /* renamed from: e */
        final /* synthetic */ boolean f2430e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0041f(String str, Object[] objArr, int i8, P7.c cVar, int i9, boolean z8) {
            super(str, objArr);
            this.f2427b = i8;
            this.f2428c = cVar;
            this.f2429d = i9;
            this.f2430e = z8;
        }

        @Override // D7.b
        public void execute() {
            try {
                boolean zOnData = f.this.f2397j.onData(this.f2427b, this.f2428c, this.f2429d, this.f2430e);
                if (zOnData) {
                    f.this.f2410w.rstStream(this.f2427b, I7.b.CANCEL);
                }
                if (zOnData || this.f2430e) {
                    synchronized (f.this) {
                        f.this.f2412y.remove(Integer.valueOf(this.f2427b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    class g extends D7.b {

        /* renamed from: b */
        final /* synthetic */ int f2432b;

        /* renamed from: c */
        final /* synthetic */ I7.b f2433c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Object[] objArr, int i8, I7.b bVar) {
            super(str, objArr);
            this.f2432b = i8;
            this.f2433c = bVar;
        }

        @Override // D7.b
        public void execute() {
            f.this.f2397j.onReset(this.f2432b, this.f2433c);
            synchronized (f.this) {
                f.this.f2412y.remove(Integer.valueOf(this.f2432b));
            }
        }
    }

    final class i extends D7.b {
        i() {
            super("OkHttp %s ping", f.this.f2391d);
        }

        @Override // D7.b
        public void execute() throws IOException {
            boolean z8;
            synchronized (f.this) {
                if (f.this.f2399l < f.this.f2398k) {
                    z8 = true;
                } else {
                    f.e(f.this);
                    z8 = false;
                }
            }
            if (z8) {
                f.this.m(null);
            } else {
                f.this.A(false, 1, 0);
            }
        }
    }

    final class k extends D7.b {

        /* renamed from: b */
        final boolean f2444b;

        /* renamed from: c */
        final int f2445c;

        /* renamed from: d */
        final int f2446d;

        k(boolean z8, int i8, int i9) {
            super("OkHttp %s ping %08x%08x", f.this.f2391d, Integer.valueOf(i8), Integer.valueOf(i9));
            this.f2444b = z8;
            this.f2445c = i8;
            this.f2446d = i9;
        }

        @Override // D7.b
        public void execute() throws IOException {
            f.this.A(this.f2444b, this.f2445c, this.f2446d);
        }
    }

    f(h hVar) {
        m mVar = new m();
        this.f2408u = mVar;
        this.f2412y = new LinkedHashSet();
        this.f2397j = hVar.f2440f;
        boolean z8 = hVar.f2441g;
        this.f2388a = z8;
        this.f2389b = hVar.f2439e;
        int i8 = z8 ? 1 : 2;
        this.f2393f = i8;
        if (z8) {
            this.f2393f = i8 + 2;
        }
        if (z8) {
            this.f2407t.i(7, 16777216);
        }
        String str = hVar.f2436b;
        this.f2391d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, D7.e.threadFactory(D7.e.format("OkHttp %s Writer", str), false));
        this.f2395h = scheduledThreadPoolExecutor;
        if (hVar.f2442h != 0) {
            i iVar = new i();
            int i9 = hVar.f2442h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, i9, i9, TimeUnit.MILLISECONDS);
        }
        this.f2396i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), D7.e.threadFactory(D7.e.format("OkHttp %s Push Observer", str), true));
        mVar.i(7, 65535);
        mVar.i(5, 16384);
        this.f2406s = mVar.d();
        this.f2409v = hVar.f2435a;
        this.f2410w = new I7.j(hVar.f2438d, z8);
        this.f2411x = new l(new I7.h(hVar.f2437c, z8));
    }

    static /* synthetic */ long c(f fVar) {
        long j8 = fVar.f2399l;
        fVar.f2399l = 1 + j8;
        return j8;
    }

    static /* synthetic */ long e(f fVar) {
        long j8 = fVar.f2398k;
        fVar.f2398k = 1 + j8;
        return j8;
    }

    static /* synthetic */ long j(f fVar) {
        long j8 = fVar.f2401n;
        fVar.f2401n = 1 + j8;
        return j8;
    }

    static /* synthetic */ long k(f fVar) {
        long j8 = fVar.f2403p;
        fVar.f2403p = 1 + j8;
        return j8;
    }

    public void m(IOException iOException) throws IOException {
        I7.b bVar = I7.b.PROTOCOL_ERROR;
        l(bVar, bVar, iOException);
    }

    private I7.i o(int i8, List list, boolean z8) {
        int i9;
        I7.i iVar;
        boolean z9;
        boolean z10 = !z8;
        synchronized (this.f2410w) {
            try {
                synchronized (this) {
                    try {
                        if (this.f2393f > 1073741823) {
                            shutdown(I7.b.REFUSED_STREAM);
                        }
                        if (this.f2394g) {
                            throw new I7.a();
                        }
                        i9 = this.f2393f;
                        this.f2393f = i9 + 2;
                        iVar = new I7.i(i9, this, z10, false, null);
                        z9 = !z8 || this.f2406s == 0 || iVar.f2476b == 0;
                        if (iVar.isOpen()) {
                            this.f2390c.put(Integer.valueOf(i9), iVar);
                        }
                    } finally {
                    }
                }
                if (i8 == 0) {
                    this.f2410w.headers(z10, i9, list);
                } else {
                    if (this.f2388a) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                    }
                    this.f2410w.pushPromise(i8, i9, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            this.f2410w.flush();
        }
        return iVar;
    }

    private synchronized void q(D7.b bVar) {
        if (!this.f2394g) {
            this.f2396i.execute(bVar);
        }
    }

    void A(boolean z8, int i8, int i9) throws IOException {
        try {
            this.f2410w.ping(z8, i8, i9);
        } catch (IOException e8) {
            m(e8);
        }
    }

    void B(int i8, I7.b bVar) {
        this.f2410w.rstStream(i8, bVar);
    }

    void C(int i8, I7.b bVar) {
        try {
            this.f2395h.execute(new a("OkHttp %s stream %d", new Object[]{this.f2391d, Integer.valueOf(i8)}, i8, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    void D(int i8, long j8) {
        try {
            this.f2395h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f2391d, Integer.valueOf(i8)}, i8, j8));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        l(I7.b.NO_ERROR, I7.b.CANCEL, null);
    }

    public void flush() {
        this.f2410w.flush();
    }

    public synchronized boolean isHealthy(long j8) {
        if (this.f2394g) {
            return false;
        }
        if (this.f2401n < this.f2400m) {
            if (j8 >= this.f2404q) {
                return false;
            }
        }
        return true;
    }

    void l(I7.b bVar, I7.b bVar2, IOException iOException) throws IOException {
        I7.i[] iVarArr;
        try {
            shutdown(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f2390c.isEmpty()) {
                    iVarArr = null;
                } else {
                    iVarArr = (I7.i[]) this.f2390c.values().toArray(new I7.i[this.f2390c.size()]);
                    this.f2390c.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVarArr != null) {
            for (I7.i iVar : iVarArr) {
                try {
                    iVar.close(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f2410w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f2409v.close();
        } catch (IOException unused4) {
        }
        this.f2395h.shutdown();
        this.f2396i.shutdown();
    }

    public synchronized int maxConcurrentStreams() {
        return this.f2408u.e(Integer.MAX_VALUE);
    }

    synchronized I7.i n(int i8) {
        return (I7.i) this.f2390c.get(Integer.valueOf(i8));
    }

    public I7.i newStream(List<I7.c> list, boolean z8) {
        return o(0, list, z8);
    }

    public synchronized int openStreamCount() {
        return this.f2390c.size();
    }

    void p(int i8, P7.e eVar, int i9, boolean z8) throws IOException {
        P7.c cVar = new P7.c();
        long j8 = i9;
        eVar.require(j8);
        eVar.read(cVar, j8);
        if (cVar.size() == j8) {
            q(new C0041f("OkHttp %s Push Data[%s]", new Object[]{this.f2391d, Integer.valueOf(i8)}, i8, cVar, i9, z8));
            return;
        }
        throw new IOException(cVar.size() + " != " + i9);
    }

    public I7.i pushStream(int i8, List<I7.c> list, boolean z8) {
        if (this.f2388a) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return o(i8, list, z8);
    }

    void r(int i8, List list, boolean z8) {
        try {
            q(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f2391d, Integer.valueOf(i8)}, i8, list, z8));
        } catch (RejectedExecutionException unused) {
        }
    }

    void s(int i8, List list) {
        synchronized (this) {
            try {
                if (this.f2412y.contains(Integer.valueOf(i8))) {
                    C(i8, I7.b.PROTOCOL_ERROR);
                    return;
                }
                this.f2412y.add(Integer.valueOf(i8));
                try {
                    q(new d("OkHttp %s Push Request[%s]", new Object[]{this.f2391d, Integer.valueOf(i8)}, i8, list));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setSettings(m mVar) {
        synchronized (this.f2410w) {
            synchronized (this) {
                if (this.f2394g) {
                    throw new I7.a();
                }
                this.f2407t.h(mVar);
            }
            this.f2410w.settings(mVar);
        }
    }

    public void shutdown(I7.b bVar) {
        synchronized (this.f2410w) {
            synchronized (this) {
                if (this.f2394g) {
                    return;
                }
                this.f2394g = true;
                this.f2410w.goAway(this.f2392e, bVar, D7.e.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public void start() {
        x(true);
    }

    void t(int i8, I7.b bVar) {
        q(new g("OkHttp %s Push Reset[%s]", new Object[]{this.f2391d, Integer.valueOf(i8)}, i8, bVar));
    }

    boolean u(int i8) {
        return i8 != 0 && (i8 & 1) == 0;
    }

    synchronized I7.i v(int i8) {
        I7.i iVar;
        iVar = (I7.i) this.f2390c.remove(Integer.valueOf(i8));
        notifyAll();
        return iVar;
    }

    void w() {
        synchronized (this) {
            try {
                long j8 = this.f2401n;
                long j9 = this.f2400m;
                if (j8 < j9) {
                    return;
                }
                this.f2400m = j9 + 1;
                this.f2404q = System.nanoTime() + 1000000000;
                try {
                    this.f2395h.execute(new c("OkHttp %s ping", this.f2391d));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f2410w.maxDataLength());
        r6 = r2;
        r8.f2406s -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeData(int r9, boolean r10, P7.c r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            I7.j r12 = r8.f2410w
            r12.data(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r4 = r8.f2406s     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L32
            java.util.Map r2 = r8.f2390c     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            goto L12
        L28:
            r9 = move-exception
            goto L65
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
        L32:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L28
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L28
            I7.j r4 = r8.f2410w     // Catch: java.lang.Throwable -> L28
            int r4 = r4.maxDataLength()     // Catch: java.lang.Throwable -> L28
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.f2406s     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.f2406s = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            I7.j r4 = r8.f2410w
            if (r10 == 0) goto L53
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L53
            r5 = 1
            goto L54
        L53:
            r5 = r3
        L54:
            r4.data(r5, r9, r11, r2)
            goto Ld
        L58:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L28
            r9.interrupt()     // Catch: java.lang.Throwable -> L28
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I7.f.writeData(int, boolean, P7.c, long):void");
    }

    void x(boolean z8) {
        if (z8) {
            this.f2410w.connectionPreface();
            this.f2410w.settings(this.f2407t);
            if (this.f2407t.d() != 65535) {
                this.f2410w.windowUpdate(0, r5 - 65535);
            }
        }
        new Thread(this.f2411x).start();
    }

    synchronized void y(long j8) {
        long j9 = this.f2405r + j8;
        this.f2405r = j9;
        if (j9 >= this.f2407t.d() / 2) {
            D(0, this.f2405r);
            this.f2405r = 0L;
        }
    }

    void z(int i8, boolean z8, List list) {
        this.f2410w.headers(z8, i8, list);
    }

    public static class h {

        /* renamed from: a */
        Socket f2435a;

        /* renamed from: b */
        String f2436b;

        /* renamed from: c */
        P7.e f2437c;

        /* renamed from: d */
        P7.d f2438d;

        /* renamed from: e */
        j f2439e = j.REFUSE_INCOMING_STREAMS;

        /* renamed from: f */
        I7.l f2440f = I7.l.CANCEL;

        /* renamed from: g */
        boolean f2441g;

        /* renamed from: h */
        int f2442h;

        public h(boolean z8) {
            this.f2441g = z8;
        }

        public f build() {
            return new f(this);
        }

        public h listener(j jVar) {
            this.f2439e = jVar;
            return this;
        }

        public h pingIntervalMillis(int i8) {
            this.f2442h = i8;
            return this;
        }

        public h pushObserver(I7.l lVar) {
            this.f2440f = lVar;
            return this;
        }

        public h socket(Socket socket) {
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            return socket(socket, remoteSocketAddress instanceof InetSocketAddress ? ((InetSocketAddress) remoteSocketAddress).getHostName() : remoteSocketAddress.toString(), P7.n.buffer(P7.n.source(socket)), P7.n.buffer(P7.n.sink(socket)));
        }

        public h socket(Socket socket, String str, P7.e eVar, P7.d dVar) {
            this.f2435a = socket;
            this.f2436b = str;
            this.f2437c = eVar;
            this.f2438d = dVar;
            return this;
        }
    }

    class l extends D7.b implements h.b {

        /* renamed from: b */
        final I7.h f2448b;

        class a extends D7.b {

            /* renamed from: b */
            final /* synthetic */ I7.i f2450b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, I7.i iVar) {
                super(str, objArr);
                this.f2450b = iVar;
            }

            @Override // D7.b
            public void execute() {
                try {
                    f.this.f2389b.onStream(this.f2450b);
                } catch (IOException e8) {
                    K7.j.get().log(4, "Http2Connection.Listener failure for " + f.this.f2391d, e8);
                    try {
                        this.f2450b.close(I7.b.PROTOCOL_ERROR, e8);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        class b extends D7.b {

            /* renamed from: b */
            final /* synthetic */ boolean f2452b;

            /* renamed from: c */
            final /* synthetic */ m f2453c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Object[] objArr, boolean z8, m mVar) {
                super(str, objArr);
                this.f2452b = z8;
                this.f2453c = mVar;
            }

            @Override // D7.b
            public void execute() {
                l.this.a(this.f2452b, this.f2453c);
            }
        }

        class c extends D7.b {
            c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // D7.b
            public void execute() {
                f fVar = f.this;
                fVar.f2389b.onSettings(fVar);
            }
        }

        l(I7.h hVar) {
            super("OkHttp %s", f.this.f2391d);
            this.f2448b = hVar;
        }

        void a(boolean z8, m mVar) {
            I7.i[] iVarArr;
            long j8;
            synchronized (f.this.f2410w) {
                synchronized (f.this) {
                    try {
                        int iD = f.this.f2408u.d();
                        if (z8) {
                            f.this.f2408u.a();
                        }
                        f.this.f2408u.h(mVar);
                        int iD2 = f.this.f2408u.d();
                        iVarArr = null;
                        if (iD2 == -1 || iD2 == iD) {
                            j8 = 0;
                        } else {
                            j8 = iD2 - iD;
                            if (!f.this.f2390c.isEmpty()) {
                                iVarArr = (I7.i[]) f.this.f2390c.values().toArray(new I7.i[f.this.f2390c.size()]);
                            }
                        }
                    } finally {
                    }
                }
                try {
                    f fVar = f.this;
                    fVar.f2410w.applyAndAckSettings(fVar.f2408u);
                } catch (IOException e8) {
                    f.this.m(e8);
                }
            }
            if (iVarArr != null) {
                for (I7.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j8);
                    }
                }
            }
            f.f2387z.execute(new c("OkHttp %s settings", f.this.f2391d));
        }

        @Override // I7.h.b
        public void data(boolean z8, int i8, P7.e eVar, int i9) throws IOException {
            if (f.this.u(i8)) {
                f.this.p(i8, eVar, i9, z8);
                return;
            }
            I7.i iVarN = f.this.n(i8);
            if (iVarN == null) {
                f.this.C(i8, I7.b.PROTOCOL_ERROR);
                long j8 = i9;
                f.this.y(j8);
                eVar.skip(j8);
                return;
            }
            iVarN.e(eVar, i9);
            if (z8) {
                iVarN.f(D7.e.EMPTY_HEADERS, true);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [I7.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [I7.h, java.io.Closeable] */
        @Override // D7.b
        protected void execute() throws Throwable {
            I7.b bVar;
            I7.b bVar2;
            I7.b bVar3 = I7.b.INTERNAL_ERROR;
            IOException e8 = null;
            try {
                try {
                    this.f2448b.readConnectionPreface(this);
                    while (this.f2448b.nextFrame(false, this)) {
                    }
                    bVar2 = I7.b.NO_ERROR;
                } catch (IOException e9) {
                    e8 = e9;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar3;
                    f.this.l(bVar, bVar3, e8);
                    D7.e.closeQuietly(this.f2448b);
                    throw th;
                }
                try {
                    f.this.l(bVar2, I7.b.CANCEL, null);
                    bVar = bVar2;
                } catch (IOException e10) {
                    e8 = e10;
                    I7.b bVar4 = I7.b.PROTOCOL_ERROR;
                    f fVar = f.this;
                    fVar.l(bVar4, bVar4, e8);
                    bVar = fVar;
                    bVar3 = this.f2448b;
                    D7.e.closeQuietly((Closeable) bVar3);
                }
                bVar3 = this.f2448b;
                D7.e.closeQuietly((Closeable) bVar3);
            } catch (Throwable th2) {
                th = th2;
                f.this.l(bVar, bVar3, e8);
                D7.e.closeQuietly(this.f2448b);
                throw th;
            }
        }

        @Override // I7.h.b
        public void goAway(int i8, I7.b bVar, P7.f fVar) {
            I7.i[] iVarArr;
            fVar.size();
            synchronized (f.this) {
                iVarArr = (I7.i[]) f.this.f2390c.values().toArray(new I7.i[f.this.f2390c.size()]);
                f.this.f2394g = true;
            }
            for (I7.i iVar : iVarArr) {
                if (iVar.getId() > i8 && iVar.isLocallyInitiated()) {
                    iVar.g(I7.b.REFUSED_STREAM);
                    f.this.v(iVar.getId());
                }
            }
        }

        @Override // I7.h.b
        public void headers(boolean z8, int i8, int i9, List<I7.c> list) {
            if (f.this.u(i8)) {
                f.this.r(i8, list, z8);
                return;
            }
            synchronized (f.this) {
                try {
                    I7.i iVarN = f.this.n(i8);
                    if (iVarN != null) {
                        iVarN.f(D7.e.toHeaders(list), z8);
                        return;
                    }
                    if (f.this.f2394g) {
                        return;
                    }
                    f fVar = f.this;
                    if (i8 <= fVar.f2392e) {
                        return;
                    }
                    if (i8 % 2 == fVar.f2393f % 2) {
                        return;
                    }
                    I7.i iVar = new I7.i(i8, f.this, false, z8, D7.e.toHeaders(list));
                    f fVar2 = f.this;
                    fVar2.f2392e = i8;
                    fVar2.f2390c.put(Integer.valueOf(i8), iVar);
                    f.f2387z.execute(new a("OkHttp %s stream %d", new Object[]{f.this.f2391d, Integer.valueOf(i8)}, iVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // I7.h.b
        public void ping(boolean z8, int i8, int i9) {
            if (!z8) {
                try {
                    f.this.f2395h.execute(f.this.new k(true, i8, i9));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (f.this) {
                try {
                    if (i8 == 1) {
                        f.c(f.this);
                    } else if (i8 == 2) {
                        f.j(f.this);
                    } else if (i8 == 3) {
                        f.k(f.this);
                        f.this.notifyAll();
                    }
                } finally {
                }
            }
        }

        @Override // I7.h.b
        public void pushPromise(int i8, int i9, List<I7.c> list) {
            f.this.s(i9, list);
        }

        @Override // I7.h.b
        public void rstStream(int i8, I7.b bVar) {
            if (f.this.u(i8)) {
                f.this.t(i8, bVar);
                return;
            }
            I7.i iVarV = f.this.v(i8);
            if (iVarV != null) {
                iVarV.g(bVar);
            }
        }

        @Override // I7.h.b
        public void settings(boolean z8, m mVar) {
            try {
                f.this.f2395h.execute(new b("OkHttp %s ACK Settings", new Object[]{f.this.f2391d}, z8, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // I7.h.b
        public void windowUpdate(int i8, long j8) {
            if (i8 == 0) {
                synchronized (f.this) {
                    f fVar = f.this;
                    fVar.f2406s += j8;
                    fVar.notifyAll();
                }
                return;
            }
            I7.i iVarN = f.this.n(i8);
            if (iVarN != null) {
                synchronized (iVarN) {
                    iVarN.a(j8);
                }
            }
        }

        @Override // I7.h.b
        public void ackSettings() {
        }

        @Override // I7.h.b
        public void alternateService(int i8, String str, P7.f fVar, String str2, int i9, long j8) {
        }

        @Override // I7.h.b
        public void priority(int i8, int i9, int i10, boolean z8) {
        }
    }

    public static abstract class j {
        public static final j REFUSE_INCOMING_STREAMS = new a();

        class a extends j {
            a() {
            }

            @Override // I7.f.j
            public void onStream(I7.i iVar) {
                iVar.close(I7.b.REFUSED_STREAM, null);
            }
        }

        public abstract void onStream(I7.i iVar);

        public void onSettings(f fVar) {
        }
    }
}
