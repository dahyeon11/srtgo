package io.grpc.stub;

import com.google.common.util.concurrent.AbstractC5162b;
import com.google.common.util.concurrent.C;
import e3.AbstractC5354D;
import e3.p;
import e3.w;
import io.grpc.AbstractC5723f;
import io.grpc.AbstractC5786j;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.J0;
import io.grpc.K0;
import io.grpc.L0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f33289a = Logger.getLogger(g.class.getName());

    /* renamed from: b, reason: collision with root package name */
    static boolean f33290b;

    /* renamed from: c, reason: collision with root package name */
    static final C5721e.c f33291c;

    private static final class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private final BlockingQueue f33292a;

        /* renamed from: b, reason: collision with root package name */
        private final e f33293b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC5786j f33294c;

        /* renamed from: d, reason: collision with root package name */
        private final h f33295d;

        /* renamed from: e, reason: collision with root package name */
        private Object f33296e;

        private final class a extends e {

            /* renamed from: a, reason: collision with root package name */
            private boolean f33297a;

            a() {
                super();
                this.f33297a = false;
            }

            @Override // io.grpc.stub.g.e
            void a() {
                b.this.f33294c.request(1);
            }

            @Override // io.grpc.AbstractC5786j.a
            public void onClose(J0 j02, C5728h0 c5728h0) {
                w.checkState(!this.f33297a, "ClientCall already closed");
                if (j02.isOk()) {
                    b.this.f33292a.add(b.this);
                } else {
                    b.this.f33292a.add(j02.asRuntimeException(c5728h0));
                }
                this.f33297a = true;
            }

            @Override // io.grpc.AbstractC5786j.a
            public void onHeaders(C5728h0 c5728h0) {
            }

            @Override // io.grpc.AbstractC5786j.a
            public void onMessage(Object obj) {
                w.checkState(!this.f33297a, "ClientCall already closed");
                b.this.f33292a.add(obj);
            }
        }

        b(AbstractC5786j abstractC5786j) {
            this(abstractC5786j, null);
        }

        private Object d() throws Throwable {
            Object objTake;
            Object objPoll;
            boolean z8 = false;
            try {
                try {
                    if (this.f33295d == null) {
                        while (true) {
                            try {
                                objTake = this.f33292a.take();
                                break;
                            } catch (InterruptedException e8) {
                                this.f33294c.cancel("Thread interrupted", e8);
                                z8 = true;
                            }
                        }
                        if (z8) {
                            Thread.currentThread().interrupt();
                        }
                        return objTake;
                    }
                    while (true) {
                        objPoll = this.f33292a.poll();
                        if (objPoll != null) {
                            break;
                        }
                        try {
                            this.f33295d.waitAndDrain();
                        } catch (InterruptedException e9) {
                            this.f33294c.cancel("Thread interrupted", e9);
                            z8 = true;
                        }
                    }
                    if (objPoll == this || (objPoll instanceof L0)) {
                        this.f33295d.shutdown();
                    }
                    if (z8) {
                        Thread.currentThread().interrupt();
                    }
                    return objPoll;
                } catch (Throwable th) {
                    th = th;
                    z8 = true;
                }
                th = th;
                z8 = true;
            } catch (Throwable th2) {
                th = th2;
            }
            if (z8) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }

        e c() {
            return this.f33293b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Object obj;
            while (true) {
                obj = this.f33296e;
                if (obj != null) {
                    break;
                }
                this.f33296e = d();
            }
            if (!(obj instanceof L0)) {
                return obj != this;
            }
            L0 l02 = (L0) obj;
            throw l02.getStatus().asRuntimeException(l02.getTrailers());
        }

        @Override // java.util.Iterator
        public Object next() {
            Object obj = this.f33296e;
            if (!(obj instanceof L0) && obj != this) {
                this.f33294c.request(1);
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object obj2 = this.f33296e;
            this.f33296e = null;
            return obj2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        b(AbstractC5786j abstractC5786j, h hVar) {
            this.f33292a = new ArrayBlockingQueue(3);
            this.f33293b = new a();
            this.f33294c = abstractC5786j;
            this.f33295d = hVar;
        }
    }

    private static final class c extends io.grpc.stub.f {

        /* renamed from: a, reason: collision with root package name */
        private boolean f33299a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC5786j f33300b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f33301c;

        /* renamed from: d, reason: collision with root package name */
        private Runnable f33302d;

        /* renamed from: e, reason: collision with root package name */
        private int f33303e = 1;

        /* renamed from: f, reason: collision with root package name */
        private boolean f33304f = true;

        /* renamed from: g, reason: collision with root package name */
        private boolean f33305g = false;

        /* renamed from: h, reason: collision with root package name */
        private boolean f33306h = false;

        c(AbstractC5786j abstractC5786j, boolean z8) {
            this.f33300b = abstractC5786j;
            this.f33301c = z8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            this.f33299a = true;
        }

        @Override // io.grpc.stub.f
        public void cancel(String str, Throwable th) {
            this.f33300b.cancel(str, th);
        }

        @Override // io.grpc.stub.e
        public void disableAutoInboundFlowControl() {
            disableAutoRequestWithInitial(1);
        }

        @Override // io.grpc.stub.f
        public void disableAutoRequestWithInitial(int i8) {
            if (this.f33299a) {
                throw new IllegalStateException("Cannot disable auto flow control after call started. Use ClientResponseObserver");
            }
            w.checkArgument(i8 >= 0, "Initial requests must be non-negative");
            this.f33303e = i8;
            this.f33304f = false;
        }

        @Override // io.grpc.stub.f, io.grpc.stub.e
        public boolean isReady() {
            return this.f33300b.isReady();
        }

        @Override // io.grpc.stub.f, io.grpc.stub.e, io.grpc.stub.k
        public void onCompleted() {
            this.f33300b.halfClose();
            this.f33306h = true;
        }

        @Override // io.grpc.stub.f, io.grpc.stub.e, io.grpc.stub.k
        public void onError(Throwable th) {
            this.f33300b.cancel("Cancelled by client with StreamObserver.onError()", th);
            this.f33305g = true;
        }

        @Override // io.grpc.stub.f, io.grpc.stub.e, io.grpc.stub.k
        public void onNext(Object obj) {
            w.checkState(!this.f33305g, "Stream was terminated by error, no further calls are allowed");
            w.checkState(!this.f33306h, "Stream is already completed, no further calls are allowed");
            this.f33300b.sendMessage(obj);
        }

        @Override // io.grpc.stub.f, io.grpc.stub.e
        public void request(int i8) {
            if (this.f33301c || i8 != 1) {
                this.f33300b.request(i8);
            } else {
                this.f33300b.request(2);
            }
        }

        @Override // io.grpc.stub.f, io.grpc.stub.e
        public void setMessageCompression(boolean z8) {
            this.f33300b.setMessageCompression(z8);
        }

        @Override // io.grpc.stub.f, io.grpc.stub.e
        public void setOnReadyHandler(Runnable runnable) {
            if (this.f33299a) {
                throw new IllegalStateException("Cannot alter onReadyHandler after call started. Use ClientResponseObserver");
            }
            this.f33302d = runnable;
        }
    }

    private static final class d extends AbstractC5162b {

        /* renamed from: h, reason: collision with root package name */
        private final AbstractC5786j f33307h;

        d(AbstractC5786j abstractC5786j) {
            this.f33307h = abstractC5786j;
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b
        protected boolean set(Object obj) {
            return super.set(obj);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b
        protected boolean setException(Throwable th) {
            return super.setException(th);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b
        protected void w() {
            this.f33307h.cancel("GrpcFuture was cancelled", null);
        }

        @Override // com.google.common.util.concurrent.AbstractC5162b
        protected String y() {
            return p.toStringHelper(this).add("clientCall", this.f33307h).toString();
        }
    }

    private static abstract class e extends AbstractC5786j.a {
        private e() {
        }

        abstract void a();
    }

    private static final class f extends e {

        /* renamed from: a, reason: collision with root package name */
        private final k f33308a;

        /* renamed from: b, reason: collision with root package name */
        private final c f33309b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f33310c;

        f(k kVar, c cVar) {
            super();
            this.f33308a = kVar;
            this.f33309b = cVar;
            cVar.f();
        }

        @Override // io.grpc.stub.g.e
        void a() {
            if (this.f33309b.f33303e > 0) {
                c cVar = this.f33309b;
                cVar.request(cVar.f33303e);
            }
        }

        @Override // io.grpc.AbstractC5786j.a
        public void onClose(J0 j02, C5728h0 c5728h0) {
            if (j02.isOk()) {
                this.f33308a.onCompleted();
            } else {
                this.f33308a.onError(j02.asRuntimeException(c5728h0));
            }
        }

        @Override // io.grpc.AbstractC5786j.a
        public void onHeaders(C5728h0 c5728h0) {
        }

        @Override // io.grpc.AbstractC5786j.a
        public void onMessage(Object obj) {
            if (this.f33310c && !this.f33309b.f33301c) {
                throw J0.INTERNAL.withDescription("More than one responses received for unary or client-streaming call").asRuntimeException();
            }
            this.f33310c = true;
            this.f33308a.onNext(obj);
            if (this.f33309b.f33301c && this.f33309b.f33304f) {
                this.f33309b.request(1);
            }
        }

        @Override // io.grpc.AbstractC5786j.a
        public void onReady() {
            if (this.f33309b.f33302d != null) {
                this.f33309b.f33302d.run();
            }
        }
    }

    /* renamed from: io.grpc.stub.g$g, reason: collision with other inner class name */
    enum EnumC0326g {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    private static final class h extends ConcurrentLinkedQueue implements Executor {

        /* renamed from: b, reason: collision with root package name */
        private static final Logger f33312b = Logger.getLogger(h.class.getName());

        /* renamed from: c, reason: collision with root package name */
        private static final Object f33313c = new Object();

        /* renamed from: a, reason: collision with root package name */
        private volatile Object f33314a;

        h() {
        }

        private static void a(Runnable runnable) {
            try {
                runnable.run();
            } catch (Throwable th) {
                f33312b.log(Level.WARNING, "Runnable threw exception", th);
            }
        }

        private static void b() throws InterruptedException {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            add(runnable);
            Object obj = this.f33314a;
            if (obj != f33313c) {
                LockSupport.unpark((Thread) obj);
            } else if (remove(runnable) && g.f33290b) {
                throw new RejectedExecutionException();
            }
        }

        public void shutdown() {
            this.f33314a = f33313c;
            while (true) {
                Runnable runnable = (Runnable) poll();
                if (runnable == null) {
                    return;
                } else {
                    a(runnable);
                }
            }
        }

        public void waitAndDrain() throws InterruptedException {
            Runnable runnable;
            b();
            Runnable runnable2 = (Runnable) poll();
            if (runnable2 == null) {
                this.f33314a = Thread.currentThread();
                while (true) {
                    try {
                        runnable = (Runnable) poll();
                        if (runnable != null) {
                            break;
                        }
                        LockSupport.park(this);
                        b();
                    } catch (Throwable th) {
                        this.f33314a = null;
                        throw th;
                    }
                }
                this.f33314a = null;
                runnable2 = runnable;
            }
            do {
                a(runnable2);
                runnable2 = (Runnable) poll();
            } while (runnable2 != null);
        }
    }

    private static final class i extends e {

        /* renamed from: a, reason: collision with root package name */
        private final d f33315a;

        /* renamed from: b, reason: collision with root package name */
        private Object f33316b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f33317c;

        i(d dVar) {
            super();
            this.f33317c = false;
            this.f33315a = dVar;
        }

        @Override // io.grpc.stub.g.e
        void a() {
            this.f33315a.f33307h.request(2);
        }

        @Override // io.grpc.AbstractC5786j.a
        public void onClose(J0 j02, C5728h0 c5728h0) {
            if (!j02.isOk()) {
                this.f33315a.setException(j02.asRuntimeException(c5728h0));
                return;
            }
            if (!this.f33317c) {
                this.f33315a.setException(J0.INTERNAL.withDescription("No value received for unary call").asRuntimeException(c5728h0));
            }
            this.f33315a.set(this.f33316b);
        }

        @Override // io.grpc.AbstractC5786j.a
        public void onHeaders(C5728h0 c5728h0) {
        }

        @Override // io.grpc.AbstractC5786j.a
        public void onMessage(Object obj) {
            if (this.f33317c) {
                throw J0.INTERNAL.withDescription("More than one value received for unary call").asRuntimeException();
            }
            this.f33316b = obj;
            this.f33317c = true;
        }
    }

    static {
        f33290b = !AbstractC5354D.isNullOrEmpty(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f33291c = C5721e.c.create("internal-stub-type");
    }

    private static k a(AbstractC5786j abstractC5786j, k kVar, boolean z8) {
        c cVar = new c(abstractC5786j, z8);
        f(abstractC5786j, new f(kVar, cVar));
        return cVar;
    }

    public static <ReqT, RespT> k asyncBidiStreamingCall(AbstractC5786j abstractC5786j, k kVar) {
        w.checkNotNull(kVar, "responseObserver");
        return a(abstractC5786j, kVar, true);
    }

    public static <ReqT, RespT> k asyncClientStreamingCall(AbstractC5786j abstractC5786j, k kVar) {
        w.checkNotNull(kVar, "responseObserver");
        return a(abstractC5786j, kVar, false);
    }

    public static <ReqT, RespT> void asyncServerStreamingCall(AbstractC5786j abstractC5786j, ReqT reqt, k kVar) {
        w.checkNotNull(kVar, "responseObserver");
        c(abstractC5786j, reqt, kVar, true);
    }

    public static <ReqT, RespT> void asyncUnaryCall(AbstractC5786j abstractC5786j, ReqT reqt, k kVar) {
        w.checkNotNull(kVar, "responseObserver");
        c(abstractC5786j, reqt, kVar, false);
    }

    private static void b(AbstractC5786j abstractC5786j, Object obj, e eVar) {
        f(abstractC5786j, eVar);
        try {
            abstractC5786j.sendMessage(obj);
            abstractC5786j.halfClose();
        } catch (Error e8) {
            throw d(abstractC5786j, e8);
        } catch (RuntimeException e9) {
            throw d(abstractC5786j, e9);
        }
    }

    public static <ReqT, RespT> Iterator<RespT> blockingServerStreamingCall(AbstractC5786j abstractC5786j, ReqT reqt) {
        b bVar = new b(abstractC5786j);
        b(abstractC5786j, reqt, bVar.c());
        return bVar;
    }

    public static <ReqT, RespT> RespT blockingUnaryCall(AbstractC5786j abstractC5786j, ReqT reqt) {
        try {
            return (RespT) e(futureUnaryCall(abstractC5786j, reqt));
        } catch (Error e8) {
            throw d(abstractC5786j, e8);
        } catch (RuntimeException e9) {
            throw d(abstractC5786j, e9);
        }
    }

    private static void c(AbstractC5786j abstractC5786j, Object obj, k kVar, boolean z8) {
        b(abstractC5786j, obj, new f(kVar, new c(abstractC5786j, z8)));
    }

    private static RuntimeException d(AbstractC5786j abstractC5786j, Throwable th) {
        try {
            abstractC5786j.cancel(null, th);
        } catch (Throwable th2) {
            f33289a.log(Level.SEVERE, "RuntimeException encountered while closing call", th2);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }

    private static Object e(Future future) {
        try {
            return future.get();
        } catch (InterruptedException e8) {
            Thread.currentThread().interrupt();
            throw J0.CANCELLED.withDescription("Thread interrupted").withCause(e8).asRuntimeException();
        } catch (ExecutionException e9) {
            throw g(e9.getCause());
        }
    }

    private static void f(AbstractC5786j abstractC5786j, e eVar) {
        abstractC5786j.start(eVar, new C5728h0());
        eVar.a();
    }

    public static <ReqT, RespT> C futureUnaryCall(AbstractC5786j abstractC5786j, ReqT reqt) {
        d dVar = new d(abstractC5786j);
        b(abstractC5786j, reqt, new i(dVar));
        return dVar;
    }

    private static L0 g(Throwable th) {
        for (Throwable cause = (Throwable) w.checkNotNull(th, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof K0) {
                K0 k02 = (K0) cause;
                return new L0(k02.getStatus(), k02.getTrailers());
            }
            if (cause instanceof L0) {
                L0 l02 = (L0) cause;
                return new L0(l02.getStatus(), l02.getTrailers());
            }
        }
        return J0.UNKNOWN.withDescription("unexpected exception").withCause(th).asRuntimeException();
    }

    public static <ReqT, RespT> Iterator<RespT> blockingServerStreamingCall(AbstractC5723f abstractC5723f, C5730i0 c5730i0, C5721e c5721e, ReqT reqt) {
        h hVar = new h();
        AbstractC5786j abstractC5786jNewCall = abstractC5723f.newCall(c5730i0, c5721e.withOption(f33291c, EnumC0326g.BLOCKING).withExecutor(hVar));
        b bVar = new b(abstractC5786jNewCall, hVar);
        b(abstractC5786jNewCall, reqt, bVar.c());
        return bVar;
    }

    public static <ReqT, RespT> RespT blockingUnaryCall(AbstractC5723f abstractC5723f, C5730i0 c5730i0, C5721e c5721e, ReqT reqt) throws Throwable {
        h hVar = new h();
        AbstractC5786j abstractC5786jNewCall = abstractC5723f.newCall(c5730i0, c5721e.withOption(f33291c, EnumC0326g.BLOCKING).withExecutor(hVar));
        boolean z8 = false;
        try {
            try {
                C cFutureUnaryCall = futureUnaryCall(abstractC5786jNewCall, reqt);
                while (!cFutureUnaryCall.isDone()) {
                    try {
                        hVar.waitAndDrain();
                    } catch (InterruptedException e8) {
                        try {
                            abstractC5786jNewCall.cancel("Thread interrupted", e8);
                            z8 = true;
                        } catch (Error e9) {
                            e = e9;
                            throw d(abstractC5786jNewCall, e);
                        } catch (RuntimeException e10) {
                            e = e10;
                            throw d(abstractC5786jNewCall, e);
                        } catch (Throwable th) {
                            th = th;
                            z8 = true;
                            if (z8) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                }
                hVar.shutdown();
                RespT respt = (RespT) e(cFutureUnaryCall);
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                return respt;
            } catch (Error e11) {
                e = e11;
            } catch (RuntimeException e12) {
                e = e12;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
