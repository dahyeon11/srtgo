package io.grpc.internal;

import io.grpc.AbstractC5723f;
import io.grpc.AbstractC5786j;
import io.grpc.AbstractC5794n;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.C5804v;
import io.grpc.internal.InterfaceC5774t;
import io.grpc.internal.r;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class R0 extends AbstractC5723f {

    /* renamed from: g, reason: collision with root package name */
    static final io.grpc.J0 f32516g;

    /* renamed from: h, reason: collision with root package name */
    static final io.grpc.J0 f32517h;

    /* renamed from: i, reason: collision with root package name */
    private static final I f32518i;

    /* renamed from: a, reason: collision with root package name */
    private final C5739b0 f32519a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f32520b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f32521c;

    /* renamed from: d, reason: collision with root package name */
    private final C5765o f32522d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference f32523e;

    /* renamed from: f, reason: collision with root package name */
    private final r.e f32524f = new a();

    class a implements r.e {
        a() {
        }

        @Override // io.grpc.internal.r.e
        public InterfaceC5772s newStream(C5730i0 c5730i0, C5721e c5721e, C5728h0 c5728h0, C5804v c5804v) {
            InterfaceC5776u interfaceC5776uK = R0.this.f32519a.K();
            if (interfaceC5776uK == null) {
                interfaceC5776uK = R0.f32518i;
            }
            AbstractC5794n[] clientStreamTracers = U.getClientStreamTracers(c5721e, c5728h0, 0, false);
            C5804v c5804vAttach = c5804v.attach();
            try {
                return interfaceC5776uK.newStream(c5730i0, c5728h0, c5721e, clientStreamTracers);
            } finally {
                c5804v.detach(c5804vAttach);
            }
        }
    }

    class b extends AbstractC5786j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f32526a;

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5786j.a f32528a;

            a(AbstractC5786j.a aVar) {
                this.f32528a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f32528a.onClose(R0.f32517h, new C5728h0());
            }
        }

        b(Executor executor) {
            this.f32526a = executor;
        }

        @Override // io.grpc.AbstractC5786j
        public void cancel(String str, Throwable th) {
        }

        @Override // io.grpc.AbstractC5786j
        public void halfClose() {
        }

        @Override // io.grpc.AbstractC5786j
        public void request(int i8) {
        }

        @Override // io.grpc.AbstractC5786j
        public void sendMessage(RequestT requestt) {
        }

        @Override // io.grpc.AbstractC5786j
        public void start(AbstractC5786j.a aVar, C5728h0 c5728h0) {
            this.f32526a.execute(new a(aVar));
        }
    }

    static {
        io.grpc.J0 j02 = io.grpc.J0.UNAVAILABLE;
        io.grpc.J0 j0WithDescription = j02.withDescription("Subchannel is NOT READY");
        f32516g = j0WithDescription;
        f32517h = j02.withDescription("wait-for-ready RPC is not supported on Subchannel.asChannel()");
        f32518i = new I(j0WithDescription, InterfaceC5774t.a.MISCARRIED);
    }

    R0(C5739b0 c5739b0, Executor executor, ScheduledExecutorService scheduledExecutorService, C5765o c5765o, AtomicReference atomicReference) {
        this.f32519a = (C5739b0) e3.w.checkNotNull(c5739b0, "subchannel");
        this.f32520b = (Executor) e3.w.checkNotNull(executor, "executor");
        this.f32521c = (ScheduledExecutorService) e3.w.checkNotNull(scheduledExecutorService, "deadlineCancellationExecutor");
        this.f32522d = (C5765o) e3.w.checkNotNull(c5765o, "callsTracer");
        this.f32523e = (AtomicReference) e3.w.checkNotNull(atomicReference, "configSelector");
    }

    @Override // io.grpc.AbstractC5723f
    public String authority() {
        return this.f32519a.I();
    }

    @Override // io.grpc.AbstractC5723f
    public <RequestT, ResponseT> AbstractC5786j newCall(C5730i0 c5730i0, C5721e c5721e) {
        Executor executor = c5721e.getExecutor() == null ? this.f32520b : c5721e.getExecutor();
        return c5721e.isWaitForReady() ? new b(executor) : new r(c5730i0, executor, c5721e.withOption(U.CALL_OPTIONS_RPC_OWNED_BY_BALANCER, Boolean.TRUE), this.f32524f, this.f32521c, this.f32522d, (io.grpc.P) this.f32523e.get());
    }
}
