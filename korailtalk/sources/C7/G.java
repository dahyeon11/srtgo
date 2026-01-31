package C7;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class G implements InterfaceC0472f {

    /* renamed from: a, reason: collision with root package name */
    final E f523a;

    /* renamed from: b, reason: collision with root package name */
    private F7.k f524b;

    /* renamed from: c, reason: collision with root package name */
    final H f525c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f526d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f527e;

    final class a extends D7.b {

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC0473g f528b;

        /* renamed from: c, reason: collision with root package name */
        private volatile AtomicInteger f529c;

        a(InterfaceC0473g interfaceC0473g) {
            super("OkHttp %s", G.this.d());
            this.f529c = new AtomicInteger(0);
            this.f528b = interfaceC0473g;
        }

        AtomicInteger a() {
            return this.f529c;
        }

        void b(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e8) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e8);
                    G.this.f524b.noMoreExchanges(interruptedIOException);
                    this.f528b.onFailure(G.this, interruptedIOException);
                    G.this.f523a.dispatcher().d(this);
                }
            } catch (Throwable th) {
                G.this.f523a.dispatcher().d(this);
                throw th;
            }
        }

        G c() {
            return G.this;
        }

        String d() {
            return G.this.f525c.url().host();
        }

        void e(a aVar) {
            this.f529c = aVar.f529c;
        }

        @Override // D7.b
        protected void execute() {
            boolean z8;
            Throwable th;
            IOException e8;
            G.this.f524b.timeoutEnter();
            try {
                try {
                    z8 = true;
                } catch (IOException e9) {
                    z8 = false;
                    e8 = e9;
                } catch (Throwable th2) {
                    z8 = false;
                    th = th2;
                }
                try {
                    this.f528b.onResponse(G.this, G.this.b());
                } catch (IOException e10) {
                    e8 = e10;
                    if (z8) {
                        K7.j.get().log(4, "Callback failure for " + G.this.e(), e8);
                    } else {
                        this.f528b.onFailure(G.this, e8);
                    }
                    G.this.f523a.dispatcher().d(this);
                } catch (Throwable th3) {
                    th = th3;
                    G.this.cancel();
                    if (!z8) {
                        IOException iOException = new IOException("canceled due to " + th);
                        iOException.addSuppressed(th);
                        this.f528b.onFailure(G.this, iOException);
                    }
                    throw th;
                }
                G.this.f523a.dispatcher().d(this);
            } catch (Throwable th4) {
                G.this.f523a.dispatcher().d(this);
                throw th4;
            }
        }
    }

    private G(E e8, H h8, boolean z8) {
        this.f523a = e8;
        this.f525c = h8;
        this.f526d = z8;
    }

    static G c(E e8, H h8, boolean z8) {
        G g8 = new G(e8, h8, z8);
        g8.f524b = new F7.k(e8, g8);
        return g8;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    C7.J b() throws java.lang.Throwable {
        /*
            r12 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            C7.E r0 = r12.f523a
            java.util.List r0 = r0.interceptors()
            r1.addAll(r0)
            G7.j r0 = new G7.j
            C7.E r2 = r12.f523a
            r0.<init>(r2)
            r1.add(r0)
            G7.a r0 = new G7.a
            C7.E r2 = r12.f523a
            C7.p r2 = r2.cookieJar()
            r0.<init>(r2)
            r1.add(r0)
            E7.a r0 = new E7.a
            C7.E r2 = r12.f523a
            E7.f r2 = r2.a()
            r0.<init>(r2)
            r1.add(r0)
            F7.a r0 = new F7.a
            C7.E r2 = r12.f523a
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r12.f526d
            if (r0 != 0) goto L4b
            C7.E r0 = r12.f523a
            java.util.List r0 = r0.networkInterceptors()
            r1.addAll(r0)
        L4b:
            G7.b r0 = new G7.b
            boolean r2 = r12.f526d
            r0.<init>(r2)
            r1.add(r0)
            G7.g r10 = new G7.g
            F7.k r2 = r12.f524b
            C7.H r5 = r12.f525c
            C7.E r0 = r12.f523a
            int r7 = r0.connectTimeoutMillis()
            C7.E r0 = r12.f523a
            int r8 = r0.readTimeoutMillis()
            C7.E r0 = r12.f523a
            int r9 = r0.writeTimeoutMillis()
            r3 = 0
            r4 = 0
            r0 = r10
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            C7.H r2 = r12.f525c     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            C7.J r2 = r10.proceed(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            F7.k r3 = r12.f524b     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            boolean r3 = r3.isCanceled()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            if (r3 != 0) goto L8a
            F7.k r1 = r12.f524b
            r1.noMoreExchanges(r0)
            return r2
        L8a:
            D7.e.closeQuietly(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            throw r2     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
        L95:
            r2 = move-exception
            goto La4
        L97:
            r1 = move-exception
            r2 = 1
            F7.k r3 = r12.f524b     // Catch: java.lang.Throwable -> La0
            java.io.IOException r1 = r3.noMoreExchanges(r1)     // Catch: java.lang.Throwable -> La0
            throw r1     // Catch: java.lang.Throwable -> La0
        La0:
            r1 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
        La4:
            if (r1 != 0) goto Lab
            F7.k r1 = r12.f524b
            r1.noMoreExchanges(r0)
        Lab:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: C7.G.b():C7.J");
    }

    @Override // C7.InterfaceC0472f
    public void cancel() {
        this.f524b.cancel();
    }

    String d() {
        return this.f525c.url().redact();
    }

    String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f526d ? "web socket" : androidx.core.app.r.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(d());
        return sb.toString();
    }

    @Override // C7.InterfaceC0472f
    public void enqueue(InterfaceC0473g interfaceC0473g) {
        synchronized (this) {
            if (this.f527e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f527e = true;
        }
        this.f524b.callStart();
        this.f523a.dispatcher().a(new a(interfaceC0473g));
    }

    @Override // C7.InterfaceC0472f
    public J execute() {
        synchronized (this) {
            if (this.f527e) {
                throw new IllegalStateException("Already Executed");
            }
            this.f527e = true;
        }
        this.f524b.timeoutEnter();
        this.f524b.callStart();
        try {
            this.f523a.dispatcher().b(this);
            return b();
        } finally {
            this.f523a.dispatcher().e(this);
        }
    }

    @Override // C7.InterfaceC0472f
    public boolean isCanceled() {
        return this.f524b.isCanceled();
    }

    @Override // C7.InterfaceC0472f
    public synchronized boolean isExecuted() {
        return this.f527e;
    }

    @Override // C7.InterfaceC0472f
    public H request() {
        return this.f525c;
    }

    @Override // C7.InterfaceC0472f
    public P7.x timeout() {
        return this.f524b.timeout();
    }

    @Override // C7.InterfaceC0472f
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public G m5clone() {
        return c(this.f523a, this.f525c, this.f526d);
    }
}
