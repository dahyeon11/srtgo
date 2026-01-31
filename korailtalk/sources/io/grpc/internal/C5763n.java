package io.grpc.internal;

import io.grpc.AbstractC5719d;
import io.grpc.AbstractC5725g;
import io.grpc.AbstractC5727h;
import io.grpc.AbstractC5794n;
import io.grpc.C5713a;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.C5798p;
import io.grpc.internal.C5770q0;
import io.grpc.internal.InterfaceC5778v;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.grpc.internal.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5763n implements InterfaceC5778v {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5778v f33015a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5719d f33016b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f33017c;

    /* renamed from: io.grpc.internal.n$a */
    private class a extends M {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5782x f33018a;

        /* renamed from: b, reason: collision with root package name */
        private final String f33019b;

        /* renamed from: d, reason: collision with root package name */
        private volatile io.grpc.J0 f33021d;

        /* renamed from: e, reason: collision with root package name */
        private io.grpc.J0 f33022e;

        /* renamed from: f, reason: collision with root package name */
        private io.grpc.J0 f33023f;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicInteger f33020c = new AtomicInteger(-2147483647);

        /* renamed from: g, reason: collision with root package name */
        private final C5770q0.a f33024g = new C0324a();

        /* renamed from: io.grpc.internal.n$a$a, reason: collision with other inner class name */
        class C0324a implements C5770q0.a {
            C0324a() {
            }

            @Override // io.grpc.internal.C5770q0.a
            public void onComplete() {
                if (a.this.f33020c.decrementAndGet() == 0) {
                    a.this.f();
                }
            }
        }

        /* renamed from: io.grpc.internal.n$a$b */
        class b extends AbstractC5719d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5730i0 f33027a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5721e f33028b;

            b(C5730i0 c5730i0, C5721e c5721e) {
                this.f33027a = c5730i0;
                this.f33028b = c5721e;
            }

            @Override // io.grpc.AbstractC5719d.b
            public String getAuthority() {
                return (String) e3.p.firstNonNull(this.f33028b.getAuthority(), a.this.f33019b);
            }

            @Override // io.grpc.AbstractC5719d.b
            public C5721e getCallOptions() {
                return this.f33028b;
            }

            @Override // io.grpc.AbstractC5719d.b
            public C5730i0 getMethodDescriptor() {
                return this.f33027a;
            }

            @Override // io.grpc.AbstractC5719d.b
            public io.grpc.t0 getSecurityLevel() {
                return (io.grpc.t0) e3.p.firstNonNull((io.grpc.t0) a.this.f33018a.getAttributes().get(T.ATTR_SECURITY_LEVEL), io.grpc.t0.NONE);
            }

            @Override // io.grpc.AbstractC5719d.b
            public C5713a getTransportAttrs() {
                return a.this.f33018a.getAttributes();
            }
        }

        a(InterfaceC5782x interfaceC5782x, String str) {
            this.f33018a = (InterfaceC5782x) e3.w.checkNotNull(interfaceC5782x, "delegate");
            this.f33019b = (String) e3.w.checkNotNull(str, "authority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            synchronized (this) {
                try {
                    if (this.f33020c.get() != 0) {
                        return;
                    }
                    io.grpc.J0 j02 = this.f33022e;
                    io.grpc.J0 j03 = this.f33023f;
                    this.f33022e = null;
                    this.f33023f = null;
                    if (j02 != null) {
                        super.shutdown(j02);
                    }
                    if (j03 != null) {
                        super.shutdownNow(j03);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.M
        protected InterfaceC5782x a() {
            return this.f33018a;
        }

        @Override // io.grpc.internal.M, io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u
        public InterfaceC5772s newStream(C5730i0 c5730i0, C5728h0 c5728h0, C5721e c5721e, AbstractC5794n[] abstractC5794nArr) {
            AbstractC5719d credentials = c5721e.getCredentials();
            if (credentials == null) {
                credentials = C5763n.this.f33016b;
            } else if (C5763n.this.f33016b != null) {
                credentials = new C5798p(C5763n.this.f33016b, credentials);
            }
            if (credentials == null) {
                return this.f33020c.get() >= 0 ? new H(this.f33021d, abstractC5794nArr) : this.f33018a.newStream(c5730i0, c5728h0, c5721e, abstractC5794nArr);
            }
            C5770q0 c5770q0 = new C5770q0(this.f33018a, c5730i0, c5728h0, c5721e, this.f33024g, abstractC5794nArr);
            if (this.f33020c.incrementAndGet() > 0) {
                this.f33024g.onComplete();
                return new H(this.f33021d, abstractC5794nArr);
            }
            try {
                credentials.applyRequestMetadata(new b(c5730i0, c5721e), C5763n.this.f33017c, c5770q0);
            } catch (Throwable th) {
                c5770q0.fail(io.grpc.J0.UNAUTHENTICATED.withDescription("Credentials should use fail() instead of throwing exceptions").withCause(th));
            }
            return c5770q0.b();
        }

        @Override // io.grpc.internal.M, io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0
        public void shutdown(io.grpc.J0 j02) {
            e3.w.checkNotNull(j02, androidx.core.app.r.CATEGORY_STATUS);
            synchronized (this) {
                try {
                    if (this.f33020c.get() < 0) {
                        this.f33021d = j02;
                        this.f33020c.addAndGet(Integer.MAX_VALUE);
                        if (this.f33020c.get() != 0) {
                            this.f33022e = j02;
                        } else {
                            super.shutdown(j02);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.M, io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0
        public void shutdownNow(io.grpc.J0 j02) {
            e3.w.checkNotNull(j02, androidx.core.app.r.CATEGORY_STATUS);
            synchronized (this) {
                try {
                    if (this.f33020c.get() < 0) {
                        this.f33021d = j02;
                        this.f33020c.addAndGet(Integer.MAX_VALUE);
                    } else if (this.f33023f != null) {
                        return;
                    }
                    if (this.f33020c.get() != 0) {
                        this.f33023f = j02;
                    } else {
                        super.shutdownNow(j02);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    C5763n(InterfaceC5778v interfaceC5778v, AbstractC5719d abstractC5719d, Executor executor) {
        this.f33015a = (InterfaceC5778v) e3.w.checkNotNull(interfaceC5778v, "delegate");
        this.f33016b = abstractC5719d;
        this.f33017c = (Executor) e3.w.checkNotNull(executor, "appExecutor");
    }

    @Override // io.grpc.internal.InterfaceC5778v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f33015a.close();
    }

    @Override // io.grpc.internal.InterfaceC5778v
    public ScheduledExecutorService getScheduledExecutorService() {
        return this.f33015a.getScheduledExecutorService();
    }

    @Override // io.grpc.internal.InterfaceC5778v
    public InterfaceC5782x newClientTransport(SocketAddress socketAddress, InterfaceC5778v.a aVar, AbstractC5727h abstractC5727h) {
        return new a(this.f33015a.newClientTransport(socketAddress, aVar, abstractC5727h), aVar.getAuthority());
    }

    @Override // io.grpc.internal.InterfaceC5778v
    public InterfaceC5778v.b swapChannelCredentials(AbstractC5725g abstractC5725g) {
        throw new UnsupportedOperationException();
    }
}
