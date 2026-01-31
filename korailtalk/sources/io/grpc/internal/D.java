package io.grpc.internal;

import io.grpc.C5713a;
import io.grpc.C5728h0;
import io.grpc.C5806x;
import io.grpc.C5808z;
import io.grpc.internal.InterfaceC5774t;
import io.grpc.internal.Q0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class D implements InterfaceC5772s {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f32365a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC5774t f32366b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5772s f32367c;

    /* renamed from: d, reason: collision with root package name */
    private io.grpc.J0 f32368d;

    /* renamed from: f, reason: collision with root package name */
    private p f32370f;

    /* renamed from: g, reason: collision with root package name */
    private long f32371g;

    /* renamed from: h, reason: collision with root package name */
    private long f32372h;

    /* renamed from: e, reason: collision with root package name */
    private List f32369e = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private List f32373i = new ArrayList();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f32374a;

        a(int i8) {
            this.f32374a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f32367c.request(this.f32374a);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f32367c.optimizeForDirectExecutor();
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.r f32377a;

        c(io.grpc.r rVar) {
            this.f32377a = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f32367c.setCompressor(this.f32377a);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32379a;

        d(boolean z8) {
            this.f32379a = z8;
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f32367c.setFullStreamDecompression(this.f32379a);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5808z f32381a;

        e(C5808z c5808z) {
            this.f32381a = c5808z;
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f32367c.setDecompressorRegistry(this.f32381a);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32383a;

        f(boolean z8) {
            this.f32383a = z8;
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f32367c.setMessageCompression(this.f32383a);
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f32385a;

        g(int i8) {
            this.f32385a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f32367c.setMaxInboundMessageSize(this.f32385a);
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f32387a;

        h(int i8) {
            this.f32387a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f32367c.setMaxOutboundMessageSize(this.f32387a);
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5806x f32389a;

        i(C5806x c5806x) {
            this.f32389a = c5806x;
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f32367c.setDeadline(this.f32389a);
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.d();
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32392a;

        k(String str) {
            this.f32392a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f32367c.setAuthority(this.f32392a);
        }
    }

    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f32394a;

        l(InputStream inputStream) {
            this.f32394a = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f32367c.writeMessage(this.f32394a);
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f32367c.flush();
        }
    }

    class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.J0 f32397a;

        n(io.grpc.J0 j02) {
            this.f32397a = j02;
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f32367c.cancel(this.f32397a);
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.f32367c.halfClose();
        }
    }

    private static class p implements InterfaceC5774t {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5774t f32400a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f32401b;

        /* renamed from: c, reason: collision with root package name */
        private List f32402c = new ArrayList();

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Q0.a f32403a;

            a(Q0.a aVar) {
                this.f32403a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.f32400a.messagesAvailable(this.f32403a);
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.f32400a.onReady();
            }
        }

        class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5728h0 f32406a;

            c(C5728h0 c5728h0) {
                this.f32406a = c5728h0;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.f32400a.headersRead(this.f32406a);
            }
        }

        class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.J0 f32408a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5774t.a f32409b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C5728h0 f32410c;

            d(io.grpc.J0 j02, InterfaceC5774t.a aVar, C5728h0 c5728h0) {
                this.f32408a = j02;
                this.f32409b = aVar;
                this.f32410c = c5728h0;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.f32400a.closed(this.f32408a, this.f32409b, this.f32410c);
            }
        }

        public p(InterfaceC5774t interfaceC5774t) {
            this.f32400a = interfaceC5774t;
        }

        private void b(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f32401b) {
                        runnable.run();
                    } else {
                        this.f32402c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.InterfaceC5774t
        public void closed(io.grpc.J0 j02, InterfaceC5774t.a aVar, C5728h0 c5728h0) {
            b(new d(j02, aVar, c5728h0));
        }

        public void drainPendingCallbacks() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f32402c.isEmpty()) {
                            this.f32402c = null;
                            this.f32401b = true;
                            return;
                        } else {
                            list = this.f32402c;
                            this.f32402c = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }

        @Override // io.grpc.internal.InterfaceC5774t
        public void headersRead(C5728h0 c5728h0) {
            b(new c(c5728h0));
        }

        @Override // io.grpc.internal.InterfaceC5774t, io.grpc.internal.Q0
        public void messagesAvailable(Q0.a aVar) {
            if (this.f32401b) {
                this.f32400a.messagesAvailable(aVar);
            } else {
                b(new a(aVar));
            }
        }

        @Override // io.grpc.internal.InterfaceC5774t, io.grpc.internal.Q0
        public void onReady() {
            if (this.f32401b) {
                this.f32400a.onReady();
            } else {
                b(new b());
            }
        }
    }

    D() {
    }

    private void c(Runnable runnable) {
        e3.w.checkState(this.f32366b != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.f32365a) {
                    runnable.run();
                } else {
                    this.f32369e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f32369e     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r0 = 0
            r3.f32369e = r0     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r3.f32365a = r0     // Catch: java.lang.Throwable -> L1d
            io.grpc.internal.D$p r0 = r3.f32370f     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r0.drainPendingCallbacks()
        L1c:
            return
        L1d:
            r0 = move-exception
            goto L3d
        L1f:
            java.util.List r1 = r3.f32369e     // Catch: java.lang.Throwable -> L1d
            r3.f32369e = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L28
        L38:
            r1.clear()
            r0 = r1
            goto L5
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.D.d():void");
    }

    private void e(InterfaceC5774t interfaceC5774t) {
        Iterator it = this.f32373i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f32373i = null;
        this.f32367c.start(interfaceC5774t);
    }

    private void g(InterfaceC5772s interfaceC5772s) {
        InterfaceC5772s interfaceC5772s2 = this.f32367c;
        e3.w.checkState(interfaceC5772s2 == null, "realStream already set to %s", interfaceC5772s2);
        this.f32367c = interfaceC5772s;
        this.f32372h = System.nanoTime();
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void appendTimeoutInsight(C5737a0 c5737a0) {
        synchronized (this) {
            try {
                if (this.f32366b == null) {
                    return;
                }
                if (this.f32367c != null) {
                    c5737a0.appendKeyValue("buffered_nanos", Long.valueOf(this.f32372h - this.f32371g));
                    this.f32367c.appendTimeoutInsight(c5737a0);
                } else {
                    c5737a0.appendKeyValue("buffered_nanos", Long.valueOf(System.nanoTime() - this.f32371g));
                    c5737a0.append("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void cancel(io.grpc.J0 j02) {
        boolean z8 = false;
        e3.w.checkState(this.f32366b != null, "May only be called after start");
        e3.w.checkNotNull(j02, "reason");
        synchronized (this) {
            try {
                if (this.f32367c == null) {
                    g(C5771r0.INSTANCE);
                    this.f32368d = j02;
                } else {
                    z8 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            c(new n(j02));
            return;
        }
        d();
        f(j02);
        this.f32366b.closed(j02, InterfaceC5774t.a.PROCESSED, new C5728h0());
    }

    protected void f(io.grpc.J0 j02) {
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void flush() {
        e3.w.checkState(this.f32366b != null, "May only be called after start");
        if (this.f32365a) {
            this.f32367c.flush();
        } else {
            c(new m());
        }
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public C5713a getAttributes() {
        InterfaceC5772s interfaceC5772s;
        synchronized (this) {
            interfaceC5772s = this.f32367c;
        }
        return interfaceC5772s != null ? interfaceC5772s.getAttributes() : C5713a.EMPTY;
    }

    final Runnable h(InterfaceC5772s interfaceC5772s) {
        synchronized (this) {
            try {
                if (this.f32367c != null) {
                    return null;
                }
                g((InterfaceC5772s) e3.w.checkNotNull(interfaceC5772s, "stream"));
                InterfaceC5774t interfaceC5774t = this.f32366b;
                if (interfaceC5774t == null) {
                    this.f32369e = null;
                    this.f32365a = true;
                }
                if (interfaceC5774t == null) {
                    return null;
                }
                e(interfaceC5774t);
                return new j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void halfClose() {
        e3.w.checkState(this.f32366b != null, "May only be called after start");
        c(new o());
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public boolean isReady() {
        if (this.f32365a) {
            return this.f32367c.isReady();
        }
        return false;
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void optimizeForDirectExecutor() {
        e3.w.checkState(this.f32366b == null, "May only be called before start");
        this.f32373i.add(new b());
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void request(int i8) {
        e3.w.checkState(this.f32366b != null, "May only be called after start");
        if (this.f32365a) {
            this.f32367c.request(i8);
        } else {
            c(new a(i8));
        }
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setAuthority(String str) {
        e3.w.checkState(this.f32366b == null, "May only be called before start");
        e3.w.checkNotNull(str, "authority");
        this.f32373i.add(new k(str));
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void setCompressor(io.grpc.r rVar) {
        e3.w.checkState(this.f32366b == null, "May only be called before start");
        e3.w.checkNotNull(rVar, "compressor");
        this.f32373i.add(new c(rVar));
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setDeadline(C5806x c5806x) {
        e3.w.checkState(this.f32366b == null, "May only be called before start");
        this.f32373i.add(new i(c5806x));
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setDecompressorRegistry(C5808z c5808z) {
        e3.w.checkState(this.f32366b == null, "May only be called before start");
        e3.w.checkNotNull(c5808z, "decompressorRegistry");
        this.f32373i.add(new e(c5808z));
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setFullStreamDecompression(boolean z8) {
        e3.w.checkState(this.f32366b == null, "May only be called before start");
        this.f32373i.add(new d(z8));
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setMaxInboundMessageSize(int i8) {
        e3.w.checkState(this.f32366b == null, "May only be called before start");
        this.f32373i.add(new g(i8));
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setMaxOutboundMessageSize(int i8) {
        e3.w.checkState(this.f32366b == null, "May only be called before start");
        this.f32373i.add(new h(i8));
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void setMessageCompression(boolean z8) {
        e3.w.checkState(this.f32366b != null, "May only be called after start");
        if (this.f32365a) {
            this.f32367c.setMessageCompression(z8);
        } else {
            c(new f(z8));
        }
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void start(InterfaceC5774t interfaceC5774t) {
        io.grpc.J0 j02;
        boolean z8;
        e3.w.checkNotNull(interfaceC5774t, "listener");
        e3.w.checkState(this.f32366b == null, "already started");
        synchronized (this) {
            try {
                j02 = this.f32368d;
                z8 = this.f32365a;
                if (!z8) {
                    p pVar = new p(interfaceC5774t);
                    this.f32370f = pVar;
                    interfaceC5774t = pVar;
                }
                this.f32366b = interfaceC5774t;
                this.f32371g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j02 != null) {
            interfaceC5774t.closed(j02, InterfaceC5774t.a.PROCESSED, new C5728h0());
        } else if (z8) {
            e(interfaceC5774t);
        }
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void writeMessage(InputStream inputStream) {
        e3.w.checkState(this.f32366b != null, "May only be called after start");
        e3.w.checkNotNull(inputStream, "message");
        if (this.f32365a) {
            this.f32367c.writeMessage(inputStream);
        } else {
            c(new l(inputStream));
        }
    }
}
