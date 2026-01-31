package io.grpc.internal;

import io.grpc.InterfaceC5807y;
import io.grpc.internal.C5748g;
import io.grpc.internal.C5766o0;
import io.grpc.internal.Q0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: io.grpc.internal.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5746f implements A {

    /* renamed from: a, reason: collision with root package name */
    private final C5766o0.b f32702a;

    /* renamed from: b, reason: collision with root package name */
    private final C5748g f32703b;

    /* renamed from: c, reason: collision with root package name */
    private final C5766o0 f32704c;

    /* renamed from: io.grpc.internal.f$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f32705a;

        a(int i8) {
            this.f32705a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5746f.this.f32704c.isClosed()) {
                return;
            }
            try {
                C5746f.this.f32704c.request(this.f32705a);
            } catch (Throwable th) {
                C5746f.this.f32703b.deframeFailed(th);
                C5746f.this.f32704c.close();
            }
        }
    }

    /* renamed from: io.grpc.internal.f$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0 f32707a;

        b(y0 y0Var) {
            this.f32707a = y0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C5746f.this.f32704c.deframe(this.f32707a);
            } catch (Throwable th) {
                C5746f.this.f32703b.deframeFailed(th);
                C5746f.this.f32704c.close();
            }
        }
    }

    /* renamed from: io.grpc.internal.f$c */
    class c implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0 f32709a;

        c(y0 y0Var) {
            this.f32709a = y0Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f32709a.close();
        }
    }

    /* renamed from: io.grpc.internal.f$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5746f.this.f32704c.closeWhenComplete();
        }
    }

    /* renamed from: io.grpc.internal.f$e */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5746f.this.f32704c.close();
        }
    }

    /* renamed from: io.grpc.internal.f$f, reason: collision with other inner class name */
    private class C0323f extends g implements Closeable {

        /* renamed from: d, reason: collision with root package name */
        private final Closeable f32713d;

        public C0323f(Runnable runnable, Closeable closeable) {
            super(C5746f.this, runnable, null);
            this.f32713d = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f32713d.close();
        }
    }

    /* renamed from: io.grpc.internal.f$g */
    private class g implements Q0.a {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f32715a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f32716b;

        /* synthetic */ g(C5746f c5746f, Runnable runnable, a aVar) {
            this(runnable);
        }

        private void a() {
            if (this.f32716b) {
                return;
            }
            this.f32715a.run();
            this.f32716b = true;
        }

        @Override // io.grpc.internal.Q0.a
        public InputStream next() {
            a();
            return C5746f.this.f32703b.messageReadQueuePoll();
        }

        private g(Runnable runnable) {
            this.f32716b = false;
            this.f32715a = runnable;
        }
    }

    /* renamed from: io.grpc.internal.f$h */
    interface h extends C5748g.d {
        @Override // io.grpc.internal.C5748g.d
        /* synthetic */ void runOnTransportThread(Runnable runnable);
    }

    C5746f(C5766o0.b bVar, h hVar, C5766o0 c5766o0) {
        N0 n02 = new N0((C5766o0.b) e3.w.checkNotNull(bVar, "listener"));
        this.f32702a = n02;
        C5748g c5748g = new C5748g(n02, hVar);
        this.f32703b = c5748g;
        c5766o0.i(c5748g);
        this.f32704c = c5766o0;
    }

    @Override // io.grpc.internal.A
    public void close() {
        this.f32704c.j();
        this.f32702a.messagesAvailable(new g(this, new e(), null));
    }

    @Override // io.grpc.internal.A
    public void closeWhenComplete() {
        this.f32702a.messagesAvailable(new g(this, new d(), null));
    }

    @Override // io.grpc.internal.A
    public void deframe(y0 y0Var) {
        this.f32702a.messagesAvailable(new C0323f(new b(y0Var), new c(y0Var)));
    }

    @Override // io.grpc.internal.A
    public void request(int i8) {
        this.f32702a.messagesAvailable(new g(this, new a(i8), null));
    }

    @Override // io.grpc.internal.A
    public void setDecompressor(InterfaceC5807y interfaceC5807y) {
        this.f32704c.setDecompressor(interfaceC5807y);
    }

    @Override // io.grpc.internal.A
    public void setFullStreamDecompressor(V v8) {
        this.f32704c.setFullStreamDecompressor(v8);
    }

    @Override // io.grpc.internal.A
    public void setMaxInboundMessageSize(int i8) {
        this.f32704c.setMaxInboundMessageSize(i8);
    }
}
