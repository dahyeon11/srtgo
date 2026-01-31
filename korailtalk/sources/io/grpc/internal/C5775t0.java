package io.grpc.internal;

import io.grpc.AbstractC5714a0;
import io.grpc.AbstractC5720d0;
import io.grpc.AbstractC5786j;
import io.grpc.AbstractC5794n;
import io.grpc.C5713a;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.C5803u;
import io.grpc.C5804v;
import io.grpc.EnumC5802t;
import io.grpc.O;
import io.grpc.internal.InterfaceC5764n0;
import io.grpc.internal.r;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.t0 */
/* loaded from: classes.dex */
final class C5775t0 extends AbstractC5720d0 implements io.grpc.T {

    /* renamed from: q */
    private static final Logger f33149q = Logger.getLogger(C5775t0.class.getName());

    /* renamed from: a */
    private C5739b0 f33150a;

    /* renamed from: b */
    private AbstractC5744e f33151b;

    /* renamed from: c */
    private AbstractC5714a0.i f33152c;

    /* renamed from: d */
    private final io.grpc.U f33153d;

    /* renamed from: e */
    private final String f33154e;

    /* renamed from: f */
    private final C f33155f;

    /* renamed from: g */
    private final io.grpc.O f33156g;

    /* renamed from: h */
    private final InterfaceC5773s0 f33157h;

    /* renamed from: i */
    private final Executor f33158i;

    /* renamed from: j */
    private final ScheduledExecutorService f33159j;

    /* renamed from: l */
    private volatile boolean f33161l;

    /* renamed from: m */
    private final C5765o f33162m;

    /* renamed from: n */
    private final C5769q f33163n;

    /* renamed from: o */
    private final S0 f33164o;

    /* renamed from: k */
    private final CountDownLatch f33160k = new CountDownLatch(1);

    /* renamed from: p */
    private final r.e f33165p = new a();

    /* renamed from: io.grpc.internal.t0$a */
    class a implements r.e {
        a() {
        }

        @Override // io.grpc.internal.r.e
        public InterfaceC5772s newStream(C5730i0 c5730i0, C5721e c5721e, C5728h0 c5728h0, C5804v c5804v) {
            AbstractC5794n[] clientStreamTracers = U.getClientStreamTracers(c5721e, c5728h0, 0, false);
            C5804v c5804vAttach = c5804v.attach();
            try {
                return C5775t0.this.f33155f.newStream(c5730i0, c5728h0, c5721e, clientStreamTracers);
            } finally {
                c5804v.detach(c5804vAttach);
            }
        }
    }

    /* renamed from: io.grpc.internal.t0$b */
    final class b extends AbstractC5714a0.i {

        /* renamed from: a */
        final AbstractC5714a0.e f33167a;

        /* renamed from: b */
        final /* synthetic */ C5803u f33168b;

        b(C5803u c5803u) {
            this.f33168b = c5803u;
            this.f33167a = AbstractC5714a0.e.withError(c5803u.getStatus());
        }

        @Override // io.grpc.AbstractC5714a0.i
        public AbstractC5714a0.e pickSubchannel(AbstractC5714a0.f fVar) {
            return this.f33167a;
        }

        public String toString() {
            return e3.p.toStringHelper((Class<?>) b.class).add("errorResult", this.f33167a).toString();
        }
    }

    /* renamed from: io.grpc.internal.t0$c */
    final class c extends AbstractC5714a0.i {

        /* renamed from: a */
        final AbstractC5714a0.e f33170a;

        c() {
            this.f33170a = AbstractC5714a0.e.withSubchannel(C5775t0.this.f33151b);
        }

        @Override // io.grpc.AbstractC5714a0.i
        public AbstractC5714a0.e pickSubchannel(AbstractC5714a0.f fVar) {
            return this.f33170a;
        }

        public String toString() {
            return e3.p.toStringHelper((Class<?>) c.class).add("result", this.f33170a).toString();
        }
    }

    /* renamed from: io.grpc.internal.t0$d */
    class d implements InterfaceC5764n0.a {
        d() {
        }

        @Override // io.grpc.internal.InterfaceC5764n0.a
        public void transportInUse(boolean z8) {
        }

        @Override // io.grpc.internal.InterfaceC5764n0.a
        public void transportReady() {
        }

        @Override // io.grpc.internal.InterfaceC5764n0.a
        public void transportShutdown(io.grpc.J0 j02) {
        }

        @Override // io.grpc.internal.InterfaceC5764n0.a
        public void transportTerminated() {
            C5775t0.this.f33151b.shutdown();
        }
    }

    /* renamed from: io.grpc.internal.t0$e */
    class e extends AbstractC5744e {

        /* renamed from: a */
        final /* synthetic */ C5739b0 f33173a;

        e(C5739b0 c5739b0) {
            this.f33173a = c5739b0;
        }

        @Override // io.grpc.AbstractC5714a0.h
        public List<io.grpc.C> getAllAddresses() {
            return this.f33173a.H();
        }

        @Override // io.grpc.AbstractC5714a0.h
        public C5713a getAttributes() {
            return C5713a.EMPTY;
        }

        @Override // io.grpc.AbstractC5714a0.h
        public Object getInternalSubchannel() {
            return this.f33173a;
        }

        @Override // io.grpc.AbstractC5714a0.h
        public void requestConnection() {
            this.f33173a.obtainActiveTransport();
        }

        @Override // io.grpc.AbstractC5714a0.h
        public void shutdown() {
            this.f33173a.shutdown(io.grpc.J0.UNAVAILABLE.withDescription("OobChannel is shutdown"));
        }
    }

    /* renamed from: io.grpc.internal.t0$f */
    static /* synthetic */ class f {

        /* renamed from: a */
        static final /* synthetic */ int[] f33175a;

        static {
            int[] iArr = new int[EnumC5802t.values().length];
            f33175a = iArr;
            try {
                iArr[EnumC5802t.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33175a[EnumC5802t.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33175a[EnumC5802t.TRANSIENT_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C5775t0(String str, InterfaceC5773s0 interfaceC5773s0, ScheduledExecutorService scheduledExecutorService, io.grpc.N0 n02, C5765o c5765o, C5769q c5769q, io.grpc.O o8, S0 s02) {
        this.f33154e = (String) e3.w.checkNotNull(str, "authority");
        this.f33153d = io.grpc.U.allocate((Class<?>) C5775t0.class, str);
        this.f33157h = (InterfaceC5773s0) e3.w.checkNotNull(interfaceC5773s0, "executorPool");
        Executor executor = (Executor) e3.w.checkNotNull((Executor) interfaceC5773s0.getObject(), "executor");
        this.f33158i = executor;
        this.f33159j = (ScheduledExecutorService) e3.w.checkNotNull(scheduledExecutorService, "deadlineCancellationExecutor");
        C c9 = new C(executor, n02);
        this.f33155f = c9;
        this.f33156g = (io.grpc.O) e3.w.checkNotNull(o8);
        c9.start(new d());
        this.f33162m = c5765o;
        this.f33163n = (C5769q) e3.w.checkNotNull(c5769q, "channelTracer");
        this.f33164o = (S0) e3.w.checkNotNull(s02, "timeProvider");
    }

    @Override // io.grpc.AbstractC5723f
    public String authority() {
        return this.f33154e;
    }

    @Override // io.grpc.AbstractC5720d0
    public boolean awaitTermination(long j8, TimeUnit timeUnit) {
        return this.f33160k.await(j8, timeUnit);
    }

    C5739b0 c() {
        return this.f33150a;
    }

    void d(C5803u c5803u) {
        this.f33163n.e(new O.c.b.a().setDescription("Entering " + c5803u.getState() + " state").setSeverity(O.c.b.EnumC0316b.CT_INFO).setTimestampNanos(this.f33164o.currentTimeNanos()).build());
        int i8 = f.f33175a[c5803u.getState().ordinal()];
        if (i8 == 1 || i8 == 2) {
            this.f33155f.k(this.f33152c);
        } else {
            if (i8 != 3) {
                return;
            }
            this.f33155f.k(new b(c5803u));
        }
    }

    void e() {
        this.f33156g.removeSubchannel(this);
        this.f33157h.returnObject(this.f33158i);
        this.f33160k.countDown();
    }

    void f(C5739b0 c5739b0) {
        f33149q.log(Level.FINE, "[{0}] Created with [{1}]", new Object[]{this, c5739b0});
        this.f33150a = c5739b0;
        this.f33151b = new e(c5739b0);
        c cVar = new c();
        this.f33152c = cVar;
        this.f33155f.k(cVar);
    }

    void g(List list) {
        this.f33150a.updateAddresses(list);
    }

    @Override // io.grpc.T, io.grpc.Y
    public io.grpc.U getLogId() {
        return this.f33153d;
    }

    @Override // io.grpc.AbstractC5720d0
    public EnumC5802t getState(boolean z8) {
        C5739b0 c5739b0 = this.f33150a;
        return c5739b0 == null ? EnumC5802t.IDLE : c5739b0.J();
    }

    @Override // io.grpc.T
    public com.google.common.util.concurrent.C getStats() {
        com.google.common.util.concurrent.M mCreate = com.google.common.util.concurrent.M.create();
        O.b.a aVar = new O.b.a();
        this.f33162m.a(aVar);
        this.f33163n.g(aVar);
        aVar.setTarget(this.f33154e).setState(this.f33150a.J()).setSubchannels(Collections.singletonList(this.f33150a));
        mCreate.set(aVar.build());
        return mCreate;
    }

    @Override // io.grpc.AbstractC5720d0
    public boolean isShutdown() {
        return this.f33161l;
    }

    @Override // io.grpc.AbstractC5720d0
    public boolean isTerminated() {
        return this.f33160k.getCount() == 0;
    }

    @Override // io.grpc.AbstractC5723f
    public <RequestT, ResponseT> AbstractC5786j newCall(C5730i0 c5730i0, C5721e c5721e) {
        return new r(c5730i0, c5721e.getExecutor() == null ? this.f33158i : c5721e.getExecutor(), c5721e, this.f33165p, this.f33159j, this.f33162m, null);
    }

    @Override // io.grpc.AbstractC5720d0
    public void resetConnectBackoff() {
        this.f33150a.Q();
    }

    @Override // io.grpc.AbstractC5720d0
    public AbstractC5720d0 shutdown() {
        this.f33161l = true;
        this.f33155f.shutdown(io.grpc.J0.UNAVAILABLE.withDescription("OobChannel.shutdown() called"));
        return this;
    }

    @Override // io.grpc.AbstractC5720d0
    public AbstractC5720d0 shutdownNow() {
        this.f33161l = true;
        this.f33155f.shutdownNow(io.grpc.J0.UNAVAILABLE.withDescription("OobChannel.shutdownNow() called"));
        return this;
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("logId", this.f33153d.getId()).add("authority", this.f33154e).toString();
    }
}
