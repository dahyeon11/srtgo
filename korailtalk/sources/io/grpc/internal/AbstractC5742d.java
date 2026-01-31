package io.grpc.internal;

import io.grpc.InterfaceC5796o;
import io.grpc.InterfaceC5807y;
import io.grpc.internal.C5746f;
import io.grpc.internal.C5766o0;
import io.grpc.internal.Q0;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: io.grpc.internal.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5742d implements P0 {

    /* renamed from: io.grpc.internal.d$a */
    public static abstract class a implements C5746f.h, C5766o0.b {
        public static final int DEFAULT_ONREADY_THRESHOLD = 32768;

        /* renamed from: a, reason: collision with root package name */
        private A f32688a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f32689b = new Object();

        /* renamed from: c, reason: collision with root package name */
        private final O0 f32690c;

        /* renamed from: d, reason: collision with root package name */
        private final V0 f32691d;

        /* renamed from: e, reason: collision with root package name */
        private final C5766o0 f32692e;

        /* renamed from: f, reason: collision with root package name */
        private int f32693f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f32694g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f32695h;

        /* renamed from: io.grpc.internal.d$a$a, reason: collision with other inner class name */
        class RunnableC0322a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P6.b f32696a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f32697b;

            RunnableC0322a(P6.b bVar, int i8) {
                this.f32696a = bVar;
                this.f32697b = i8;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    P6.f fVarTraceTask = P6.c.traceTask("AbstractStream.request");
                    try {
                        P6.c.linkIn(this.f32696a);
                        a.this.f32688a.request(this.f32697b);
                        if (fVarTraceTask != null) {
                            fVarTraceTask.close();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    a.this.deframeFailed(th);
                }
            }
        }

        protected a(int i8, O0 o02, V0 v02) {
            this.f32690c = (O0) e3.w.checkNotNull(o02, "statsTraceCtx");
            this.f32691d = (V0) e3.w.checkNotNull(v02, "transportTracer");
            C5766o0 c5766o0 = new C5766o0(this, InterfaceC5796o.b.NONE, i8, o02, v02);
            this.f32692e = c5766o0;
            this.f32688a = c5766o0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h() {
            boolean z8;
            synchronized (this.f32689b) {
                try {
                    z8 = this.f32694g && this.f32693f < 32768 && !this.f32695h;
                } finally {
                }
            }
            return z8;
        }

        private void j() {
            boolean zH;
            synchronized (this.f32689b) {
                zH = h();
            }
            if (zH) {
                i().onReady();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(int i8) {
            synchronized (this.f32689b) {
                this.f32693f += i8;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(int i8) {
            runOnTransportThread(new RunnableC0322a(P6.c.linkOut(), i8));
        }

        public abstract /* synthetic */ void bytesRead(int i8);

        public abstract /* synthetic */ void deframeFailed(Throwable th);

        public abstract /* synthetic */ void deframerClosed(boolean z8);

        protected final void e(boolean z8) {
            if (z8) {
                this.f32688a.close();
            } else {
                this.f32688a.closeWhenComplete();
            }
        }

        protected final void f(y0 y0Var) {
            try {
                this.f32688a.deframe(y0Var);
            } catch (Throwable th) {
                deframeFailed(th);
            }
        }

        protected V0 g() {
            return this.f32691d;
        }

        public final O0 getStatsTraceContext() {
            return this.f32690c;
        }

        protected abstract Q0 i();

        protected void l() {
            e3.w.checkState(i() != null);
            synchronized (this.f32689b) {
                e3.w.checkState(!this.f32694g, "Already allocated");
                this.f32694g = true;
            }
            j();
        }

        protected final void m() {
            synchronized (this.f32689b) {
                this.f32695h = true;
            }
        }

        @Override // io.grpc.internal.C5766o0.b
        public void messagesAvailable(Q0.a aVar) {
            i().messagesAvailable(aVar);
        }

        final void n() {
            this.f32692e.i(this);
            this.f32688a = this.f32692e;
        }

        public final void onSentBytes(int i8) {
            boolean z8;
            synchronized (this.f32689b) {
                e3.w.checkState(this.f32694g, "onStreamAllocated was not called, but it seems the stream is active");
                int i9 = this.f32693f;
                z8 = false;
                boolean z9 = i9 < 32768;
                int i10 = i9 - i8;
                this.f32693f = i10;
                boolean z10 = i10 < 32768;
                if (!z9 && z10) {
                    z8 = true;
                }
            }
            if (z8) {
                j();
            }
        }

        protected final void p(InterfaceC5807y interfaceC5807y) {
            this.f32688a.setDecompressor(interfaceC5807y);
        }

        protected void q(V v8) {
            this.f32692e.setFullStreamDecompressor(v8);
            this.f32688a = new C5746f(this, this, this.f32692e);
        }

        final void r(int i8) {
            this.f32688a.setMaxInboundMessageSize(i8);
        }

        public final void requestMessagesFromDeframerForTesting(int i8) {
            o(i8);
        }

        @Override // io.grpc.internal.C5746f.h, io.grpc.internal.C5748g.d
        public abstract /* synthetic */ void runOnTransportThread(Runnable runnable);
    }

    protected final void a() {
        b().close();
    }

    protected abstract S b();

    protected final void c(int i8) {
        d().k(i8);
    }

    protected abstract a d();

    @Override // io.grpc.internal.P0
    public final void flush() {
        if (b().isClosed()) {
            return;
        }
        b().flush();
    }

    @Override // io.grpc.internal.P0
    public boolean isReady() {
        return d().h();
    }

    @Override // io.grpc.internal.P0
    public void optimizeForDirectExecutor() {
        d().n();
    }

    @Override // io.grpc.internal.P0
    public final void request(int i8) {
        d().o(i8);
    }

    @Override // io.grpc.internal.P0
    public final void setCompressor(io.grpc.r rVar) {
        b().setCompressor((io.grpc.r) e3.w.checkNotNull(rVar, "compressor"));
    }

    @Override // io.grpc.internal.P0
    public final void setMessageCompression(boolean z8) {
        b().setMessageCompression(z8);
    }

    @Override // io.grpc.internal.P0
    public final void writeMessage(InputStream inputStream) throws IOException {
        e3.w.checkNotNull(inputStream, "message");
        try {
            if (!b().isClosed()) {
                b().writePayload(inputStream);
            }
        } finally {
            U.closeQuietly(inputStream);
        }
    }
}
