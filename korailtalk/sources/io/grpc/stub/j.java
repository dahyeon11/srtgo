package io.grpc.stub;

import e3.w;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.J0;
import io.grpc.w0;
import io.grpc.y0;

/* loaded from: classes.dex */
public abstract class j {

    public interface a extends f {
        @Override // io.grpc.stub.j.f
        k invoke(k kVar);
    }

    public interface b extends f {
        @Override // io.grpc.stub.j.f
        k invoke(k kVar);
    }

    static class c implements k {
        c() {
        }

        @Override // io.grpc.stub.k
        public void onCompleted() {
        }

        @Override // io.grpc.stub.k
        public void onError(Throwable th) {
        }

        @Override // io.grpc.stub.k
        public void onNext(Object obj) {
        }
    }

    private static final class d extends io.grpc.stub.i {

        /* renamed from: a, reason: collision with root package name */
        final w0 f33324a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f33325b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f33326c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f33327d;

        /* renamed from: f, reason: collision with root package name */
        private boolean f33329f;

        /* renamed from: g, reason: collision with root package name */
        private Runnable f33330g;

        /* renamed from: h, reason: collision with root package name */
        private Runnable f33331h;

        /* renamed from: k, reason: collision with root package name */
        private Runnable f33334k;

        /* renamed from: e, reason: collision with root package name */
        private boolean f33328e = true;

        /* renamed from: i, reason: collision with root package name */
        private boolean f33332i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f33333j = false;

        d(w0 w0Var, boolean z8) {
            this.f33324a = w0Var;
            this.f33325b = z8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            this.f33327d = true;
        }

        @Override // io.grpc.stub.e
        public void disableAutoInboundFlowControl() {
            disableAutoRequest();
        }

        @Override // io.grpc.stub.i
        public void disableAutoRequest() {
            w.checkState(!this.f33327d, "Cannot disable auto flow control after initialization");
            this.f33328e = false;
        }

        @Override // io.grpc.stub.i
        public boolean isCancelled() {
            return this.f33324a.isCancelled();
        }

        @Override // io.grpc.stub.i, io.grpc.stub.e
        public boolean isReady() {
            return this.f33324a.isReady();
        }

        @Override // io.grpc.stub.i, io.grpc.stub.e, io.grpc.stub.k
        public void onCompleted() {
            this.f33324a.close(J0.OK, new C5728h0());
            this.f33333j = true;
        }

        @Override // io.grpc.stub.i, io.grpc.stub.e, io.grpc.stub.k
        public void onError(Throwable th) {
            C5728h0 c5728h0TrailersFromThrowable = J0.trailersFromThrowable(th);
            if (c5728h0TrailersFromThrowable == null) {
                c5728h0TrailersFromThrowable = new C5728h0();
            }
            this.f33324a.close(J0.fromThrowable(th), c5728h0TrailersFromThrowable);
            this.f33332i = true;
        }

        @Override // io.grpc.stub.i, io.grpc.stub.e, io.grpc.stub.k
        public void onNext(Object obj) {
            if (this.f33326c && this.f33325b) {
                throw J0.CANCELLED.withDescription("call already cancelled. Use ServerCallStreamObserver.setOnCancelHandler() to disable this exception").asRuntimeException();
            }
            w.checkState(!this.f33332i, "Stream was terminated by error, no further calls are allowed");
            w.checkState(!this.f33333j, "Stream is already completed, no further calls are allowed");
            if (!this.f33329f) {
                this.f33324a.sendHeaders(new C5728h0());
                this.f33329f = true;
            }
            this.f33324a.sendMessage(obj);
        }

        @Override // io.grpc.stub.i, io.grpc.stub.e
        public void request(int i8) {
            this.f33324a.request(i8);
        }

        @Override // io.grpc.stub.i
        public void setCompression(String str) {
            this.f33324a.setCompression(str);
        }

        @Override // io.grpc.stub.i, io.grpc.stub.e
        public void setMessageCompression(boolean z8) {
            this.f33324a.setMessageCompression(z8);
        }

        @Override // io.grpc.stub.i
        public void setOnCancelHandler(Runnable runnable) {
            w.checkState(!this.f33327d, "Cannot alter onCancelHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
            this.f33331h = runnable;
        }

        @Override // io.grpc.stub.i
        public void setOnCloseHandler(Runnable runnable) {
            w.checkState(!this.f33327d, "Cannot alter onCloseHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
            this.f33334k = runnable;
        }

        @Override // io.grpc.stub.i, io.grpc.stub.e
        public void setOnReadyHandler(Runnable runnable) {
            w.checkState(!this.f33327d, "Cannot alter onReadyHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
            this.f33330g = runnable;
        }
    }

    public interface e extends i {
        @Override // io.grpc.stub.j.i
        void invoke(Object obj, k kVar);
    }

    private interface f {
        k invoke(k kVar);
    }

    private static final class g implements y0 {

        /* renamed from: a, reason: collision with root package name */
        private final f f33335a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f33336b;

        private final class a extends w0.a {

            /* renamed from: a, reason: collision with root package name */
            private final k f33337a;

            /* renamed from: b, reason: collision with root package name */
            private final d f33338b;

            /* renamed from: c, reason: collision with root package name */
            private final w0 f33339c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f33340d = false;

            a(k kVar, d dVar, w0 w0Var) {
                this.f33337a = kVar;
                this.f33338b = dVar;
                this.f33339c = w0Var;
            }

            @Override // io.grpc.w0.a
            public void onCancel() {
                if (this.f33338b.f33331h != null) {
                    this.f33338b.f33331h.run();
                } else {
                    this.f33338b.f33326c = true;
                }
                if (this.f33340d) {
                    return;
                }
                this.f33337a.onError(J0.CANCELLED.withDescription("client cancelled").asRuntimeException());
            }

            @Override // io.grpc.w0.a
            public void onComplete() {
                if (this.f33338b.f33334k != null) {
                    this.f33338b.f33334k.run();
                }
            }

            @Override // io.grpc.w0.a
            public void onHalfClose() {
                this.f33340d = true;
                this.f33337a.onCompleted();
            }

            @Override // io.grpc.w0.a
            public void onMessage(Object obj) {
                this.f33337a.onNext(obj);
                if (this.f33338b.f33328e) {
                    this.f33339c.request(1);
                }
            }

            @Override // io.grpc.w0.a
            public void onReady() {
                if (this.f33338b.f33330g != null) {
                    this.f33338b.f33330g.run();
                }
            }
        }

        g(f fVar, boolean z8) {
            this.f33335a = fVar;
            this.f33336b = z8;
        }

        @Override // io.grpc.y0
        public w0.a startCall(w0 w0Var, C5728h0 c5728h0) {
            d dVar = new d(w0Var, this.f33336b);
            k kVarInvoke = this.f33335a.invoke(dVar);
            dVar.f();
            if (dVar.f33328e) {
                w0Var.request(1);
            }
            return new a(kVarInvoke, dVar, w0Var);
        }
    }

    public interface h extends i {
        @Override // io.grpc.stub.j.i
        void invoke(Object obj, k kVar);
    }

    private interface i {
        void invoke(Object obj, k kVar);
    }

    /* renamed from: io.grpc.stub.j$j, reason: collision with other inner class name */
    private static final class C0329j implements y0 {

        /* renamed from: a, reason: collision with root package name */
        private final i f33342a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f33343b;

        /* renamed from: io.grpc.stub.j$j$a */
        private final class a extends w0.a {

            /* renamed from: a, reason: collision with root package name */
            private final w0 f33344a;

            /* renamed from: b, reason: collision with root package name */
            private final d f33345b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f33346c = true;

            /* renamed from: d, reason: collision with root package name */
            private boolean f33347d;

            /* renamed from: e, reason: collision with root package name */
            private Object f33348e;

            a(d dVar, w0 w0Var) {
                this.f33344a = w0Var;
                this.f33345b = dVar;
            }

            @Override // io.grpc.w0.a
            public void onCancel() {
                if (this.f33345b.f33331h != null) {
                    this.f33345b.f33331h.run();
                } else {
                    this.f33345b.f33326c = true;
                }
            }

            @Override // io.grpc.w0.a
            public void onComplete() {
                if (this.f33345b.f33334k != null) {
                    this.f33345b.f33334k.run();
                }
            }

            @Override // io.grpc.w0.a
            public void onHalfClose() {
                if (this.f33346c) {
                    if (this.f33348e == null) {
                        this.f33344a.close(J0.INTERNAL.withDescription("Half-closed without a request"), new C5728h0());
                        return;
                    }
                    C0329j.this.f33342a.invoke(this.f33348e, this.f33345b);
                    this.f33348e = null;
                    this.f33345b.f();
                    if (this.f33347d) {
                        onReady();
                    }
                }
            }

            @Override // io.grpc.w0.a
            public void onMessage(Object obj) {
                if (this.f33348e == null) {
                    this.f33348e = obj;
                } else {
                    this.f33344a.close(J0.INTERNAL.withDescription("Too many requests"), new C5728h0());
                    this.f33346c = false;
                }
            }

            @Override // io.grpc.w0.a
            public void onReady() {
                this.f33347d = true;
                if (this.f33345b.f33330g != null) {
                    this.f33345b.f33330g.run();
                }
            }
        }

        C0329j(i iVar, boolean z8) {
            this.f33342a = iVar;
            this.f33343b = z8;
        }

        @Override // io.grpc.y0
        public w0.a startCall(w0 w0Var, C5728h0 c5728h0) {
            w.checkArgument(w0Var.getMethodDescriptor().getType().clientSendsOneMessage(), "asyncUnaryRequestCall is only for clientSendsOneMessage methods");
            d dVar = new d(w0Var, this.f33343b);
            w0Var.request(2);
            return new a(dVar, w0Var);
        }
    }

    public static <ReqT, RespT> y0 asyncBidiStreamingCall(a aVar) {
        return new g(aVar, true);
    }

    public static <ReqT, RespT> y0 asyncClientStreamingCall(b bVar) {
        return new g(bVar, false);
    }

    public static <ReqT, RespT> y0 asyncServerStreamingCall(e eVar) {
        return new C0329j(eVar, true);
    }

    public static <ReqT, RespT> y0 asyncUnaryCall(h hVar) {
        return new C0329j(hVar, false);
    }

    public static <ReqT> k asyncUnimplementedStreamingCall(C5730i0 c5730i0, k kVar) {
        asyncUnimplementedUnaryCall(c5730i0, kVar);
        return new c();
    }

    public static void asyncUnimplementedUnaryCall(C5730i0 c5730i0, k kVar) {
        w.checkNotNull(c5730i0, "methodDescriptor");
        w.checkNotNull(kVar, "responseObserver");
        kVar.onError(J0.UNIMPLEMENTED.withDescription(String.format("Method %s is unimplemented", c5730i0.getFullMethodName())).asRuntimeException());
    }
}
