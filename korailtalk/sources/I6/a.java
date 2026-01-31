package I6;

import I6.b;
import P7.v;
import P7.x;
import e3.w;
import io.grpc.internal.J0;
import java.io.IOException;
import java.net.Socket;

/* loaded from: classes.dex */
final class a implements v {

    /* renamed from: c, reason: collision with root package name */
    private final J0 f2160c;

    /* renamed from: d, reason: collision with root package name */
    private final b.a f2161d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2162e;

    /* renamed from: i, reason: collision with root package name */
    private v f2166i;

    /* renamed from: j, reason: collision with root package name */
    private Socket f2167j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2168k;

    /* renamed from: l, reason: collision with root package name */
    private int f2169l;

    /* renamed from: m, reason: collision with root package name */
    private int f2170m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f2158a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final P7.c f2159b = new P7.c();

    /* renamed from: f, reason: collision with root package name */
    private boolean f2163f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2164g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2165h = false;

    /* renamed from: I6.a$a, reason: collision with other inner class name */
    class C0039a extends e {

        /* renamed from: b, reason: collision with root package name */
        final P6.b f2171b;

        C0039a() {
            super(a.this, null);
            this.f2171b = P6.c.linkOut();
        }

        @Override // I6.a.e
        public void doRun() {
            int i8;
            P7.c cVar = new P7.c();
            P6.f fVarTraceTask = P6.c.traceTask("WriteRunnable.runWrite");
            try {
                P6.c.linkIn(this.f2171b);
                synchronized (a.this.f2158a) {
                    cVar.write(a.this.f2159b, a.this.f2159b.completeSegmentByteCount());
                    a.this.f2163f = false;
                    i8 = a.this.f2170m;
                }
                a.this.f2166i.write(cVar, cVar.size());
                synchronized (a.this.f2158a) {
                    a.e(a.this, i8);
                }
                if (fVarTraceTask != null) {
                    fVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (fVarTraceTask != null) {
                    try {
                        fVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    class b extends e {

        /* renamed from: b, reason: collision with root package name */
        final P6.b f2173b;

        b() {
            super(a.this, null);
            this.f2173b = P6.c.linkOut();
        }

        @Override // I6.a.e
        public void doRun() {
            P7.c cVar = new P7.c();
            P6.f fVarTraceTask = P6.c.traceTask("WriteRunnable.runFlush");
            try {
                P6.c.linkIn(this.f2173b);
                synchronized (a.this.f2158a) {
                    cVar.write(a.this.f2159b, a.this.f2159b.size());
                    a.this.f2164g = false;
                }
                a.this.f2166i.write(cVar, cVar.size());
                a.this.f2166i.flush();
                if (fVarTraceTask != null) {
                    fVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (fVarTraceTask != null) {
                    try {
                        fVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            try {
                if (a.this.f2166i != null && a.this.f2159b.size() > 0) {
                    a.this.f2166i.write(a.this.f2159b, a.this.f2159b.size());
                }
            } catch (IOException e8) {
                a.this.f2161d.onException(e8);
            }
            a.this.f2159b.close();
            try {
                if (a.this.f2166i != null) {
                    a.this.f2166i.close();
                }
            } catch (IOException e9) {
                a.this.f2161d.onException(e9);
            }
            try {
                if (a.this.f2167j != null) {
                    a.this.f2167j.close();
                }
            } catch (IOException e10) {
                a.this.f2161d.onException(e10);
            }
        }
    }

    private class d extends I6.c {
        public d(K6.c cVar) {
            super(cVar);
        }

        @Override // I6.c, K6.c
        public void ackSettings(K6.i iVar) {
            a.j(a.this);
            super.ackSettings(iVar);
        }

        @Override // I6.c, K6.c
        public void ping(boolean z8, int i8, int i9) {
            if (z8) {
                a.j(a.this);
            }
            super.ping(z8, i8, i9);
        }

        @Override // I6.c, K6.c
        public void rstStream(int i8, K6.a aVar) {
            a.j(a.this);
            super.rstStream(i8, aVar);
        }
    }

    private abstract class e implements Runnable {
        private e() {
        }

        public abstract void doRun();

        @Override // java.lang.Runnable
        public final void run() throws IOException {
            try {
                if (a.this.f2166i == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                doRun();
            } catch (Exception e8) {
                a.this.f2161d.onException(e8);
            }
        }

        /* synthetic */ e(a aVar, C0039a c0039a) {
            this();
        }
    }

    private a(J0 j02, b.a aVar, int i8) {
        this.f2160c = (J0) w.checkNotNull(j02, "executor");
        this.f2161d = (b.a) w.checkNotNull(aVar, "exceptionHandler");
        this.f2162e = i8;
    }

    static /* synthetic */ int e(a aVar, int i8) {
        int i9 = aVar.f2170m - i8;
        aVar.f2170m = i9;
        return i9;
    }

    static /* synthetic */ int j(a aVar) {
        int i8 = aVar.f2169l;
        aVar.f2169l = i8 + 1;
        return i8;
    }

    static a m(J0 j02, b.a aVar, int i8) {
        return new a(j02, aVar, i8);
    }

    @Override // P7.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f2165h) {
            return;
        }
        this.f2165h = true;
        this.f2160c.execute(new c());
    }

    @Override // P7.v, java.io.Flushable
    public void flush() throws IOException {
        if (this.f2165h) {
            throw new IOException("closed");
        }
        P6.f fVarTraceTask = P6.c.traceTask("AsyncSink.flush");
        try {
            synchronized (this.f2158a) {
                if (this.f2164g) {
                    if (fVarTraceTask != null) {
                        fVarTraceTask.close();
                    }
                } else {
                    this.f2164g = true;
                    this.f2160c.execute(new b());
                    if (fVarTraceTask != null) {
                        fVarTraceTask.close();
                    }
                }
            }
        } catch (Throwable th) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    void k(v vVar, Socket socket) {
        w.checkState(this.f2166i == null, "AsyncSink's becomeConnected should only be called once.");
        this.f2166i = (v) w.checkNotNull(vVar, "sink");
        this.f2167j = (Socket) w.checkNotNull(socket, "socket");
    }

    K6.c l(K6.c cVar) {
        return new d(cVar);
    }

    @Override // P7.v
    public x timeout() {
        return x.NONE;
    }

    @Override // P7.v
    public void write(P7.c cVar, long j8) throws IOException {
        w.checkNotNull(cVar, "source");
        if (this.f2165h) {
            throw new IOException("closed");
        }
        P6.f fVarTraceTask = P6.c.traceTask("AsyncSink.write");
        try {
            synchronized (this.f2158a) {
                try {
                    this.f2159b.write(cVar, j8);
                    int i8 = this.f2170m + this.f2169l;
                    this.f2170m = i8;
                    boolean z8 = false;
                    this.f2169l = 0;
                    if (this.f2168k || i8 <= this.f2162e) {
                        if (!this.f2163f && !this.f2164g && this.f2159b.completeSegmentByteCount() > 0) {
                            this.f2163f = true;
                        }
                        if (fVarTraceTask != null) {
                            fVarTraceTask.close();
                            return;
                        }
                        return;
                    }
                    this.f2168k = true;
                    z8 = true;
                    if (!z8) {
                        this.f2160c.execute(new C0039a());
                        if (fVarTraceTask != null) {
                            fVarTraceTask.close();
                            return;
                        }
                        return;
                    }
                    try {
                        this.f2167j.close();
                    } catch (IOException e8) {
                        this.f2161d.onException(e8);
                    }
                    if (fVarTraceTask != null) {
                        fVarTraceTask.close();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
