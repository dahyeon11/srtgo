package retrofit2;

import C7.C;
import C7.H;
import C7.InterfaceC0472f;
import C7.InterfaceC0473g;
import C7.J;
import C7.K;
import java.io.IOException;

/* loaded from: classes3.dex */
final class l implements InterfaceC6201b {

    /* renamed from: a */
    private final v f35990a;

    /* renamed from: b */
    private final Object[] f35991b;

    /* renamed from: c */
    private final InterfaceC0472f.a f35992c;

    /* renamed from: d */
    private final f f35993d;

    /* renamed from: e */
    private volatile boolean f35994e;

    /* renamed from: f */
    private InterfaceC0472f f35995f;

    /* renamed from: g */
    private Throwable f35996g;

    /* renamed from: h */
    private boolean f35997h;

    class a implements InterfaceC0473g {

        /* renamed from: a */
        final /* synthetic */ d f35998a;

        a(d dVar) {
            this.f35998a = dVar;
        }

        private void a(Throwable th) {
            try {
                this.f35998a.onFailure(l.this, th);
            } catch (Throwable th2) {
                B.t(th2);
                th2.printStackTrace();
            }
        }

        @Override // C7.InterfaceC0473g
        public void onFailure(InterfaceC0472f interfaceC0472f, IOException iOException) {
            a(iOException);
        }

        @Override // C7.InterfaceC0473g
        public void onResponse(InterfaceC0472f interfaceC0472f, J j8) {
            try {
                try {
                    this.f35998a.onResponse(l.this, l.this.b(j8));
                } catch (Throwable th) {
                    B.t(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                B.t(th2);
                a(th2);
            }
        }
    }

    static final class b extends K {

        /* renamed from: b */
        private final K f36000b;

        /* renamed from: c */
        private final P7.e f36001c;

        /* renamed from: d */
        IOException f36002d;

        class a extends P7.h {
            a(P7.w wVar) {
                super(wVar);
            }

            @Override // P7.h, P7.w
            public long read(P7.c cVar, long j8) throws IOException {
                try {
                    return super.read(cVar, j8);
                } catch (IOException e8) {
                    b.this.f36002d = e8;
                    throw e8;
                }
            }
        }

        b(K k8) {
            this.f36000b = k8;
            this.f36001c = P7.n.buffer(new a(k8.source()));
        }

        void c() throws IOException {
            IOException iOException = this.f36002d;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // C7.K, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f36000b.close();
        }

        @Override // C7.K
        public long contentLength() {
            return this.f36000b.contentLength();
        }

        @Override // C7.K
        public C contentType() {
            return this.f36000b.contentType();
        }

        @Override // C7.K
        public P7.e source() {
            return this.f36001c;
        }
    }

    static final class c extends K {

        /* renamed from: b */
        private final C f36004b;

        /* renamed from: c */
        private final long f36005c;

        c(C c9, long j8) {
            this.f36004b = c9;
            this.f36005c = j8;
        }

        @Override // C7.K
        public long contentLength() {
            return this.f36005c;
        }

        @Override // C7.K
        public C contentType() {
            return this.f36004b;
        }

        @Override // C7.K
        public P7.e source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    l(v vVar, Object[] objArr, InterfaceC0472f.a aVar, f fVar) {
        this.f35990a = vVar;
        this.f35991b = objArr;
        this.f35992c = aVar;
        this.f35993d = fVar;
    }

    private InterfaceC0472f a() {
        InterfaceC0472f interfaceC0472fNewCall = this.f35992c.newCall(this.f35990a.a(this.f35991b));
        if (interfaceC0472fNewCall != null) {
            return interfaceC0472fNewCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    w b(J j8) throws IOException {
        K kBody = j8.body();
        J jBuild = j8.newBuilder().body(new c(kBody.contentType(), kBody.contentLength())).build();
        int iCode = jBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                return w.error(B.a(kBody), jBuild);
            } finally {
                kBody.close();
            }
        }
        if (iCode == 204 || iCode == 205) {
            kBody.close();
            return w.success((Object) null, jBuild);
        }
        b bVar = new b(kBody);
        try {
            return w.success(this.f35993d.convert(bVar), jBuild);
        } catch (RuntimeException e8) {
            bVar.c();
            throw e8;
        }
    }

    @Override // retrofit2.InterfaceC6201b
    public void cancel() {
        InterfaceC0472f interfaceC0472f;
        this.f35994e = true;
        synchronized (this) {
            interfaceC0472f = this.f35995f;
        }
        if (interfaceC0472f != null) {
            interfaceC0472f.cancel();
        }
    }

    @Override // retrofit2.InterfaceC6201b
    public void enqueue(d dVar) {
        InterfaceC0472f interfaceC0472f;
        Throwable th;
        B.b(dVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f35997h) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f35997h = true;
                interfaceC0472f = this.f35995f;
                th = this.f35996g;
                if (interfaceC0472f == null && th == null) {
                    try {
                        InterfaceC0472f interfaceC0472fA = a();
                        this.f35995f = interfaceC0472fA;
                        interfaceC0472f = interfaceC0472fA;
                    } catch (Throwable th2) {
                        th = th2;
                        B.t(th);
                        this.f35996g = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            dVar.onFailure(this, th);
            return;
        }
        if (this.f35994e) {
            interfaceC0472f.cancel();
        }
        interfaceC0472f.enqueue(new a(dVar));
    }

    @Override // retrofit2.InterfaceC6201b
    public w<Object> execute() {
        InterfaceC0472f interfaceC0472fA;
        synchronized (this) {
            try {
                if (this.f35997h) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f35997h = true;
                Throwable th = this.f35996g;
                if (th != null) {
                    if (th instanceof IOException) {
                        throw ((IOException) th);
                    }
                    if (th instanceof RuntimeException) {
                        throw ((RuntimeException) th);
                    }
                    throw ((Error) th);
                }
                interfaceC0472fA = this.f35995f;
                if (interfaceC0472fA == null) {
                    try {
                        interfaceC0472fA = a();
                        this.f35995f = interfaceC0472fA;
                    } catch (IOException | Error | RuntimeException e8) {
                        B.t(e8);
                        this.f35996g = e8;
                        throw e8;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f35994e) {
            interfaceC0472fA.cancel();
        }
        return b(interfaceC0472fA.execute());
    }

    @Override // retrofit2.InterfaceC6201b
    public boolean isCanceled() {
        boolean z8 = true;
        if (this.f35994e) {
            return true;
        }
        synchronized (this) {
            try {
                InterfaceC0472f interfaceC0472f = this.f35995f;
                if (interfaceC0472f == null || !interfaceC0472f.isCanceled()) {
                    z8 = false;
                }
            } finally {
            }
        }
        return z8;
    }

    @Override // retrofit2.InterfaceC6201b
    public synchronized boolean isExecuted() {
        return this.f35997h;
    }

    @Override // retrofit2.InterfaceC6201b
    public synchronized H request() {
        InterfaceC0472f interfaceC0472f = this.f35995f;
        if (interfaceC0472f != null) {
            return interfaceC0472f.request();
        }
        Throwable th = this.f35996g;
        if (th != null) {
            if (th instanceof IOException) {
                throw new RuntimeException("Unable to create request.", this.f35996g);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            InterfaceC0472f interfaceC0472fA = a();
            this.f35995f = interfaceC0472fA;
            return interfaceC0472fA.request();
        } catch (IOException e8) {
            this.f35996g = e8;
            throw new RuntimeException("Unable to create request.", e8);
        } catch (Error e9) {
            e = e9;
            B.t(e);
            this.f35996g = e;
            throw e;
        } catch (RuntimeException e10) {
            e = e10;
            B.t(e);
            this.f35996g = e;
            throw e;
        }
    }

    @Override // retrofit2.InterfaceC6201b
    public l clone() {
        return new l(this.f35990a, this.f35991b, this.f35992c, this.f35993d);
    }
}
