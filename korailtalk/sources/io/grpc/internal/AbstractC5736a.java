package io.grpc.internal;

import io.grpc.C5713a;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5806x;
import io.grpc.C5808z;
import io.grpc.InterfaceC5796o;
import io.grpc.InterfaceC5807y;
import io.grpc.internal.AbstractC5742d;
import io.grpc.internal.C5768p0;
import io.grpc.internal.InterfaceC5774t;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5736a extends AbstractC5742d implements InterfaceC5772s, C5768p0.d {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f32597g = Logger.getLogger(AbstractC5736a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final V0 f32598a;

    /* renamed from: b, reason: collision with root package name */
    private final S f32599b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32600c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f32601d;

    /* renamed from: e, reason: collision with root package name */
    private C5728h0 f32602e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f32603f;

    /* renamed from: io.grpc.internal.a$a, reason: collision with other inner class name */
    private class C0319a implements S {

        /* renamed from: a, reason: collision with root package name */
        private C5728h0 f32604a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f32605b;

        /* renamed from: c, reason: collision with root package name */
        private final O0 f32606c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f32607d;

        public C0319a(C5728h0 c5728h0, O0 o02) {
            this.f32604a = (C5728h0) e3.w.checkNotNull(c5728h0, "headers");
            this.f32606c = (O0) e3.w.checkNotNull(o02, "statsTraceCtx");
        }

        @Override // io.grpc.internal.S
        public void close() {
            this.f32605b = true;
            e3.w.checkState(this.f32607d != null, "Lack of request message. GET request is only supported for unary requests");
            AbstractC5736a.this.e().writeHeaders(this.f32604a, this.f32607d);
            this.f32607d = null;
            this.f32604a = null;
        }

        @Override // io.grpc.internal.S
        public void dispose() {
            this.f32605b = true;
            this.f32607d = null;
            this.f32604a = null;
        }

        @Override // io.grpc.internal.S
        public void flush() {
        }

        @Override // io.grpc.internal.S
        public boolean isClosed() {
            return this.f32605b;
        }

        @Override // io.grpc.internal.S
        public S setCompressor(io.grpc.r rVar) {
            return this;
        }

        @Override // io.grpc.internal.S
        public void setMaxOutboundMessageSize(int i8) {
        }

        @Override // io.grpc.internal.S
        public S setMessageCompression(boolean z8) {
            return this;
        }

        @Override // io.grpc.internal.S
        public void writePayload(InputStream inputStream) {
            e3.w.checkState(this.f32607d == null, "writePayload should not be called multiple times");
            try {
                this.f32607d = h3.h.toByteArray(inputStream);
                this.f32606c.outboundMessage(0);
                O0 o02 = this.f32606c;
                byte[] bArr = this.f32607d;
                o02.outboundMessageSent(0, bArr.length, bArr.length);
                this.f32606c.outboundUncompressedSize(this.f32607d.length);
                this.f32606c.outboundWireSize(this.f32607d.length);
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: io.grpc.internal.a$b */
    public interface b {
        void cancel(io.grpc.J0 j02);

        void writeFrame(W0 w02, boolean z8, boolean z9, int i8);

        void writeHeaders(C5728h0 c5728h0, byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: io.grpc.internal.a$c */
    public static abstract class c extends AbstractC5742d.a {

        /* renamed from: i, reason: collision with root package name */
        private final O0 f32609i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f32610j;

        /* renamed from: k, reason: collision with root package name */
        private InterfaceC5774t f32611k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f32612l;

        /* renamed from: m, reason: collision with root package name */
        private C5808z f32613m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f32614n;

        /* renamed from: o, reason: collision with root package name */
        private Runnable f32615o;

        /* renamed from: p, reason: collision with root package name */
        private volatile boolean f32616p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f32617q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f32618r;

        /* renamed from: io.grpc.internal.a$c$a, reason: collision with other inner class name */
        class RunnableC0320a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.J0 f32619a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5774t.a f32620b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C5728h0 f32621c;

            RunnableC0320a(io.grpc.J0 j02, InterfaceC5774t.a aVar, C5728h0 c5728h0) {
                this.f32619a = j02;
                this.f32620b = aVar;
                this.f32621c = c5728h0;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.w(this.f32619a, this.f32620b, this.f32621c);
            }
        }

        protected c(int i8, O0 o02, V0 v02) {
            super(i8, o02, v02);
            this.f32613m = C5808z.getDefaultInstance();
            this.f32614n = false;
            this.f32609i = (O0) e3.w.checkNotNull(o02, "statsTraceCtx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(C5808z c5808z) {
            e3.w.checkState(this.f32611k == null, "Already called start");
            this.f32613m = (C5808z) e3.w.checkNotNull(c5808z, "decompressorRegistry");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D(boolean z8) {
            this.f32612l = z8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void E() {
            this.f32616p = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(io.grpc.J0 j02, InterfaceC5774t.a aVar, C5728h0 c5728h0) {
            if (this.f32610j) {
                return;
            }
            this.f32610j = true;
            this.f32609i.streamClosed(j02);
            i().closed(j02, aVar, c5728h0);
            if (g() != null) {
                g().reportStreamClosed(j02.isOk());
            }
        }

        protected final boolean A() {
            return this.f32616p;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.AbstractC5742d.a
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5774t i() {
            return this.f32611k;
        }

        @Override // io.grpc.internal.AbstractC5742d.a, io.grpc.internal.C5766o0.b
        public abstract /* synthetic */ void bytesRead(int i8);

        @Override // io.grpc.internal.AbstractC5742d.a, io.grpc.internal.C5766o0.b
        public abstract /* synthetic */ void deframeFailed(Throwable th);

        @Override // io.grpc.internal.AbstractC5742d.a, io.grpc.internal.C5766o0.b
        public void deframerClosed(boolean z8) {
            e3.w.checkState(this.f32617q, "status should have been reported on deframer closed");
            this.f32614n = true;
            if (this.f32618r && z8) {
                transportReportStatus(io.grpc.J0.INTERNAL.withDescription("Encountered end-of-stream mid-frame"), true, new C5728h0());
            }
            Runnable runnable = this.f32615o;
            if (runnable != null) {
                runnable.run();
                this.f32615o = null;
            }
        }

        @Override // io.grpc.internal.AbstractC5742d.a, io.grpc.internal.C5746f.h, io.grpc.internal.C5748g.d
        public abstract /* synthetic */ void runOnTransportThread(Runnable runnable);

        public final void setListener(InterfaceC5774t interfaceC5774t) {
            e3.w.checkState(this.f32611k == null, "Already called setListener");
            this.f32611k = (InterfaceC5774t) e3.w.checkNotNull(interfaceC5774t, "listener");
        }

        public final void transportReportStatus(io.grpc.J0 j02, boolean z8, C5728h0 c5728h0) {
            transportReportStatus(j02, InterfaceC5774t.a.PROCESSED, z8, c5728h0);
        }

        protected void x(y0 y0Var) throws Throwable {
            e3.w.checkNotNull(y0Var, "frame");
            boolean z8 = true;
            try {
                if (this.f32617q) {
                    AbstractC5736a.f32597g.log(Level.INFO, "Received data on closed stream");
                    y0Var.close();
                    return;
                }
                try {
                    f(y0Var);
                } catch (Throwable th) {
                    th = th;
                    z8 = false;
                    if (z8) {
                        y0Var.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        protected void y(C5728h0 c5728h0) {
            boolean z8 = true;
            e3.w.checkState(!this.f32617q, "Received headers on closed stream");
            this.f32609i.clientInboundHeaders();
            String str = (String) c5728h0.get(U.CONTENT_ENCODING_KEY);
            if (!this.f32612l || str == null) {
                z8 = false;
            } else if (str.equalsIgnoreCase("gzip")) {
                q(new V());
            } else {
                if (!str.equalsIgnoreCase("identity")) {
                    deframeFailed(io.grpc.J0.INTERNAL.withDescription(String.format("Can't find full stream decompressor for %s", str)).asRuntimeException());
                    return;
                }
                z8 = false;
            }
            String str2 = (String) c5728h0.get(U.MESSAGE_ENCODING_KEY);
            if (str2 != null) {
                InterfaceC5807y interfaceC5807yLookupDecompressor = this.f32613m.lookupDecompressor(str2);
                if (interfaceC5807yLookupDecompressor == null) {
                    deframeFailed(io.grpc.J0.INTERNAL.withDescription(String.format("Can't find decompressor for %s", str2)).asRuntimeException());
                    return;
                } else if (interfaceC5807yLookupDecompressor != InterfaceC5796o.b.NONE) {
                    if (z8) {
                        deframeFailed(io.grpc.J0.INTERNAL.withDescription("Full stream and gRPC message encoding cannot both be set").asRuntimeException());
                        return;
                    }
                    p(interfaceC5807yLookupDecompressor);
                }
            }
            i().headersRead(c5728h0);
        }

        protected void z(C5728h0 c5728h0, io.grpc.J0 j02) {
            e3.w.checkNotNull(j02, androidx.core.app.r.CATEGORY_STATUS);
            e3.w.checkNotNull(c5728h0, U.TE_TRAILERS);
            if (this.f32617q) {
                AbstractC5736a.f32597g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{j02, c5728h0});
            } else {
                this.f32609i.clientInboundTrailers(c5728h0);
                transportReportStatus(j02, false, c5728h0);
            }
        }

        public final void transportReportStatus(io.grpc.J0 j02, InterfaceC5774t.a aVar, boolean z8, C5728h0 c5728h0) {
            e3.w.checkNotNull(j02, androidx.core.app.r.CATEGORY_STATUS);
            e3.w.checkNotNull(c5728h0, U.TE_TRAILERS);
            if (!this.f32617q || z8) {
                this.f32617q = true;
                this.f32618r = j02.isOk();
                m();
                if (this.f32614n) {
                    this.f32615o = null;
                    w(j02, aVar, c5728h0);
                } else {
                    this.f32615o = new RunnableC0320a(j02, aVar, c5728h0);
                    e(z8);
                }
            }
        }
    }

    protected AbstractC5736a(X0 x02, O0 o02, V0 v02, C5728h0 c5728h0, C5721e c5721e, boolean z8) {
        e3.w.checkNotNull(c5728h0, "headers");
        this.f32598a = (V0) e3.w.checkNotNull(v02, "transportTracer");
        this.f32600c = U.shouldBeCountedForInUse(c5721e);
        this.f32601d = z8;
        if (z8) {
            this.f32599b = new C0319a(c5728h0, o02);
        } else {
            this.f32599b = new C5768p0(this, x02, o02);
            this.f32602e = c5728h0;
        }
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final void appendTimeoutInsight(C5737a0 c5737a0) {
        c5737a0.appendKeyValue("remote_addr", getAttributes().get(io.grpc.J.TRANSPORT_ATTR_REMOTE_ADDR));
    }

    @Override // io.grpc.internal.AbstractC5742d
    protected final S b() {
        return this.f32599b;
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final void cancel(io.grpc.J0 j02) {
        e3.w.checkArgument(!j02.isOk(), "Should not cancel with OK status");
        this.f32603f = true;
        e().cancel(j02);
    }

    @Override // io.grpc.internal.C5768p0.d
    public final void deliverFrame(W0 w02, boolean z8, boolean z9, int i8) {
        e3.w.checkArgument(w02 != null || z8, "null frame before EOS");
        e().writeFrame(w02, z8, z9, i8);
    }

    protected abstract b e();

    protected V0 g() {
        return this.f32598a;
    }

    public abstract /* synthetic */ C5713a getAttributes();

    protected abstract c h();

    @Override // io.grpc.internal.InterfaceC5772s
    public final void halfClose() {
        if (h().A()) {
            return;
        }
        h().E();
        a();
    }

    @Override // io.grpc.internal.AbstractC5742d, io.grpc.internal.P0
    public final boolean isReady() {
        return super.isReady() && !this.f32603f;
    }

    public abstract /* synthetic */ void setAuthority(String str);

    @Override // io.grpc.internal.InterfaceC5772s
    public void setDeadline(C5806x c5806x) {
        C5728h0 c5728h0 = this.f32602e;
        C5728h0.i iVar = U.TIMEOUT_KEY;
        c5728h0.discardAll(iVar);
        this.f32602e.put(iVar, Long.valueOf(Math.max(0L, c5806x.timeRemaining(TimeUnit.NANOSECONDS))));
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final void setDecompressorRegistry(C5808z c5808z) {
        h().C(c5808z);
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final void setFullStreamDecompression(boolean z8) {
        h().D(z8);
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setMaxInboundMessageSize(int i8) {
        h().r(i8);
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void setMaxOutboundMessageSize(int i8) {
        this.f32599b.setMaxOutboundMessageSize(i8);
    }

    public final boolean shouldBeCountedForInUse() {
        return this.f32600c;
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final void start(InterfaceC5774t interfaceC5774t) {
        h().setListener(interfaceC5774t);
        if (this.f32601d) {
            return;
        }
        e().writeHeaders(this.f32602e, null);
        this.f32602e = null;
    }
}
