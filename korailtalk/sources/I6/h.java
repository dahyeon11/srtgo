package I6;

import I6.q;
import e3.w;
import io.grpc.C5713a;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.J0;
import io.grpc.internal.AbstractC5736a;
import io.grpc.internal.InterfaceC5774t;
import io.grpc.internal.O0;
import io.grpc.internal.V0;
import io.grpc.internal.W0;
import io.grpc.internal.X;
import java.util.List;

/* loaded from: classes.dex */
class h extends AbstractC5736a {
    public static final int ABSENT_ID = -1;

    /* renamed from: p, reason: collision with root package name */
    private static final P7.c f2232p = new P7.c();

    /* renamed from: h, reason: collision with root package name */
    private final C5730i0 f2233h;

    /* renamed from: i, reason: collision with root package name */
    private final String f2234i;

    /* renamed from: j, reason: collision with root package name */
    private final O0 f2235j;

    /* renamed from: k, reason: collision with root package name */
    private String f2236k;

    /* renamed from: l, reason: collision with root package name */
    private final b f2237l;

    /* renamed from: m, reason: collision with root package name */
    private final a f2238m;

    /* renamed from: n, reason: collision with root package name */
    private final C5713a f2239n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f2240o;

    class a implements AbstractC5736a.b {
        a() {
        }

        @Override // io.grpc.internal.AbstractC5736a.b
        public void cancel(J0 j02) {
            P6.f fVarTraceTask = P6.c.traceTask("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (h.this.f2237l.f2258z) {
                    h.this.f2237l.R(j02, true, null);
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

        @Override // io.grpc.internal.AbstractC5736a.b
        public void writeFrame(W0 w02, boolean z8, boolean z9, int i8) {
            P7.c cVarA;
            P6.f fVarTraceTask = P6.c.traceTask("OkHttpClientStream$Sink.writeFrame");
            try {
                if (w02 == null) {
                    cVarA = h.f2232p;
                } else {
                    cVarA = ((o) w02).a();
                    int size = (int) cVarA.size();
                    if (size > 0) {
                        h.this.c(size);
                    }
                }
                synchronized (h.this.f2237l.f2258z) {
                    h.this.f2237l.V(cVarA, z8, z9);
                    h.this.g().reportMessageSent(i8);
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

        @Override // io.grpc.internal.AbstractC5736a.b
        public void writeHeaders(C5728h0 c5728h0, byte[] bArr) {
            P6.f fVarTraceTask = P6.c.traceTask("OkHttpClientStream$Sink.writeHeaders");
            try {
                String str = "/" + h.this.f2233h.getFullMethodName();
                if (bArr != null) {
                    h.this.f2240o = true;
                    str = str + "?" + h3.b.base64().encode(bArr);
                }
                synchronized (h.this.f2237l.f2258z) {
                    h.this.f2237l.W(c5728h0, str);
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

    class b extends X implements q.b {

        /* renamed from: A, reason: collision with root package name */
        private List f2242A;

        /* renamed from: B, reason: collision with root package name */
        private P7.c f2243B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f2244C;

        /* renamed from: D, reason: collision with root package name */
        private boolean f2245D;

        /* renamed from: E, reason: collision with root package name */
        private boolean f2246E;

        /* renamed from: F, reason: collision with root package name */
        private int f2247F;

        /* renamed from: G, reason: collision with root package name */
        private int f2248G;

        /* renamed from: H, reason: collision with root package name */
        private final I6.b f2249H;

        /* renamed from: I, reason: collision with root package name */
        private final q f2250I;

        /* renamed from: J, reason: collision with root package name */
        private final i f2251J;

        /* renamed from: K, reason: collision with root package name */
        private boolean f2252K;

        /* renamed from: L, reason: collision with root package name */
        private final P6.e f2253L;

        /* renamed from: M, reason: collision with root package name */
        private q.c f2254M;

        /* renamed from: N, reason: collision with root package name */
        private int f2255N;

        /* renamed from: y, reason: collision with root package name */
        private final int f2257y;

        /* renamed from: z, reason: collision with root package name */
        private final Object f2258z;

        public b(int i8, O0 o02, Object obj, I6.b bVar, q qVar, i iVar, int i9, String str) {
            super(i8, o02, h.this.g());
            this.f2243B = new P7.c();
            this.f2244C = false;
            this.f2245D = false;
            this.f2246E = false;
            this.f2252K = true;
            this.f2255N = -1;
            this.f2258z = w.checkNotNull(obj, "lock");
            this.f2249H = bVar;
            this.f2250I = qVar;
            this.f2251J = iVar;
            this.f2247F = i9;
            this.f2248G = i9;
            this.f2257y = i9;
            this.f2253L = P6.c.createTag(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void R(J0 j02, boolean z8, C5728h0 c5728h0) {
            if (this.f2246E) {
                return;
            }
            this.f2246E = true;
            if (!this.f2252K) {
                this.f2251J.M(T(), j02, InterfaceC5774t.a.PROCESSED, z8, K6.a.CANCEL, c5728h0);
                return;
            }
            this.f2251J.X(h.this);
            this.f2242A = null;
            this.f2243B.clear();
            this.f2252K = false;
            if (c5728h0 == null) {
                c5728h0 = new C5728h0();
            }
            transportReportStatus(j02, true, c5728h0);
        }

        private void U() {
            if (A()) {
                this.f2251J.M(T(), null, InterfaceC5774t.a.PROCESSED, false, null, null);
            } else {
                this.f2251J.M(T(), null, InterfaceC5774t.a.PROCESSED, false, K6.a.CANCEL, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void V(P7.c cVar, boolean z8, boolean z9) {
            if (this.f2246E) {
                return;
            }
            if (!this.f2252K) {
                w.checkState(T() != -1, "streamId should be set");
                this.f2250I.data(z8, this.f2254M, cVar, z9);
            } else {
                this.f2243B.write(cVar, (int) cVar.size());
                this.f2244C |= z8;
                this.f2245D |= z9;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void W(C5728h0 c5728h0, String str) {
            this.f2242A = d.createRequestHeaders(c5728h0, str, h.this.f2236k, h.this.f2234i, h.this.f2240o, this.f2251J.S());
            this.f2251J.e0(h.this);
        }

        @Override // io.grpc.internal.X
        protected void G(J0 j02, boolean z8, C5728h0 c5728h0) {
            R(j02, z8, c5728h0);
        }

        q.c S() {
            q.c cVar;
            synchronized (this.f2258z) {
                cVar = this.f2254M;
            }
            return cVar;
        }

        int T() {
            return this.f2255N;
        }

        P6.e X() {
            return this.f2253L;
        }

        @Override // io.grpc.internal.X, io.grpc.internal.AbstractC5736a.c, io.grpc.internal.AbstractC5742d.a, io.grpc.internal.C5766o0.b
        public void bytesRead(int i8) {
            int i9 = this.f2248G - i8;
            this.f2248G = i9;
            float f8 = i9;
            int i10 = this.f2257y;
            if (f8 <= i10 * 0.5f) {
                int i11 = i10 - i9;
                this.f2247F += i11;
                this.f2248G = i9 + i11;
                this.f2249H.windowUpdate(T(), i11);
            }
        }

        @Override // io.grpc.internal.X, io.grpc.internal.AbstractC5736a.c, io.grpc.internal.AbstractC5742d.a, io.grpc.internal.C5766o0.b
        public void deframeFailed(Throwable th) {
            G(J0.fromThrowable(th), true, new C5728h0());
        }

        @Override // io.grpc.internal.X, io.grpc.internal.AbstractC5736a.c, io.grpc.internal.AbstractC5742d.a, io.grpc.internal.C5766o0.b
        public void deframerClosed(boolean z8) {
            U();
            super.deframerClosed(z8);
        }

        @Override // io.grpc.internal.AbstractC5742d.a
        protected void l() {
            super.l();
            g().reportLocalStreamStarted();
        }

        @Override // io.grpc.internal.X, io.grpc.internal.AbstractC5736a.c, io.grpc.internal.AbstractC5742d.a, io.grpc.internal.C5746f.h, io.grpc.internal.C5748g.d
        public void runOnTransportThread(Runnable runnable) {
            synchronized (this.f2258z) {
                runnable.run();
            }
        }

        public void start(int i8) {
            w.checkState(this.f2255N == -1, "the stream has been started with id %s", i8);
            this.f2255N = i8;
            this.f2254M = this.f2250I.createState(this, i8);
            h.this.f2237l.l();
            if (this.f2252K) {
                this.f2249H.synStream(h.this.f2240o, false, this.f2255N, 0, this.f2242A);
                h.this.f2235j.clientOutboundHeaders();
                this.f2242A = null;
                if (this.f2243B.size() > 0) {
                    this.f2250I.data(this.f2244C, this.f2254M, this.f2243B, this.f2245D);
                }
                this.f2252K = false;
            }
        }

        public void transportDataReceived(P7.c cVar, boolean z8) throws Throwable {
            int size = this.f2247F - ((int) cVar.size());
            this.f2247F = size;
            if (size >= 0) {
                super.J(new l(cVar), z8);
            } else {
                this.f2249H.rstStream(T(), K6.a.FLOW_CONTROL_ERROR);
                this.f2251J.M(T(), J0.INTERNAL.withDescription("Received data size exceeded our receiving window size"), InterfaceC5774t.a.PROCESSED, false, null, null);
            }
        }

        public void transportHeadersReceived(List<K6.d> list, boolean z8) {
            if (z8) {
                L(r.convertTrailers(list));
            } else {
                K(r.convertHeaders(list));
            }
        }
    }

    h(C5730i0 c5730i0, C5728h0 c5728h0, I6.b bVar, i iVar, q qVar, Object obj, int i8, int i9, String str, String str2, O0 o02, V0 v02, C5721e c5721e, boolean z8) {
        super(new p(), o02, v02, c5728h0, c5721e, z8 && c5730i0.isSafe());
        this.f2238m = new a();
        this.f2240o = false;
        this.f2235j = (O0) w.checkNotNull(o02, "statsTraceCtx");
        this.f2233h = c5730i0;
        this.f2236k = str;
        this.f2234i = str2;
        this.f2239n = iVar.getAttributes();
        this.f2237l = new b(i8, o02, obj, bVar, qVar, iVar, i9, c5730i0.getFullMethodName());
    }

    @Override // io.grpc.internal.AbstractC5736a, io.grpc.internal.InterfaceC5772s
    public C5713a getAttributes() {
        return this.f2239n;
    }

    public C5730i0.d getType() {
        return this.f2233h.getType();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.AbstractC5736a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a e() {
        return this.f2238m;
    }

    @Override // io.grpc.internal.AbstractC5736a, io.grpc.internal.InterfaceC5772s
    public void setAuthority(String str) {
        this.f2236k = (String) w.checkNotNull(str, "authority");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.AbstractC5736a
    /* renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b h() {
        return this.f2237l;
    }

    boolean v() {
        return this.f2240o;
    }
}
