package io.grpc.internal;

import e3.C5353C;
import e3.InterfaceC5355E;
import io.grpc.AbstractC5714a0;
import io.grpc.AbstractC5715b;
import io.grpc.AbstractC5719d;
import io.grpc.AbstractC5720d0;
import io.grpc.AbstractC5722e0;
import io.grpc.AbstractC5723f;
import io.grpc.AbstractC5725g;
import io.grpc.AbstractC5727h;
import io.grpc.AbstractC5786j;
import io.grpc.AbstractC5787j0;
import io.grpc.AbstractC5792m;
import io.grpc.AbstractC5794n;
import io.grpc.C5713a;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.C5791l0;
import io.grpc.C5801s;
import io.grpc.C5803u;
import io.grpc.C5804v;
import io.grpc.C5808z;
import io.grpc.EnumC5802t;
import io.grpc.InterfaceC5788k;
import io.grpc.N0;
import io.grpc.O;
import io.grpc.P;
import io.grpc.internal.C0;
import io.grpc.internal.C5739b0;
import io.grpc.internal.C5754j;
import io.grpc.internal.C5758k0;
import io.grpc.internal.C5762m0;
import io.grpc.internal.C5765o;
import io.grpc.internal.F0;
import io.grpc.internal.G;
import io.grpc.internal.InterfaceC5757k;
import io.grpc.internal.InterfaceC5764n0;
import io.grpc.internal.InterfaceC5778v;
import io.grpc.internal.r;
import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: io.grpc.internal.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5755j0 extends AbstractC5720d0 implements io.grpc.T {

    /* renamed from: m0, reason: collision with root package name */
    static final Logger f32760m0 = Logger.getLogger(C5755j0.class.getName());

    /* renamed from: n0, reason: collision with root package name */
    static final Pattern f32761n0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: o0, reason: collision with root package name */
    static final io.grpc.J0 f32762o0;

    /* renamed from: p0, reason: collision with root package name */
    static final io.grpc.J0 f32763p0;

    /* renamed from: q0, reason: collision with root package name */
    static final io.grpc.J0 f32764q0;

    /* renamed from: r0, reason: collision with root package name */
    private static final C5762m0 f32765r0;

    /* renamed from: s0, reason: collision with root package name */
    private static final io.grpc.P f32766s0;

    /* renamed from: t0, reason: collision with root package name */
    private static final AbstractC5786j f32767t0;

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC5757k.a f32768A;

    /* renamed from: B, reason: collision with root package name */
    private final AbstractC5723f f32769B;

    /* renamed from: C, reason: collision with root package name */
    private final String f32770C;

    /* renamed from: D, reason: collision with root package name */
    private AbstractC5787j0 f32771D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f32772E;

    /* renamed from: F, reason: collision with root package name */
    private u f32773F;

    /* renamed from: G, reason: collision with root package name */
    private volatile AbstractC5714a0.i f32774G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f32775H;

    /* renamed from: I, reason: collision with root package name */
    private final Set f32776I;

    /* renamed from: J, reason: collision with root package name */
    private Collection f32777J;

    /* renamed from: K, reason: collision with root package name */
    private final Object f32778K;

    /* renamed from: L, reason: collision with root package name */
    private final Set f32779L;

    /* renamed from: M, reason: collision with root package name */
    private final C f32780M;

    /* renamed from: N, reason: collision with root package name */
    private final A f32781N;

    /* renamed from: O, reason: collision with root package name */
    private final AtomicBoolean f32782O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f32783P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f32784Q;

    /* renamed from: R, reason: collision with root package name */
    private volatile boolean f32785R;

    /* renamed from: S, reason: collision with root package name */
    private final CountDownLatch f32786S;

    /* renamed from: T, reason: collision with root package name */
    private final C5765o.b f32787T;

    /* renamed from: U, reason: collision with root package name */
    private final C5765o f32788U;

    /* renamed from: V, reason: collision with root package name */
    private final C5769q f32789V;

    /* renamed from: W, reason: collision with root package name */
    private final AbstractC5727h f32790W;

    /* renamed from: X, reason: collision with root package name */
    private final io.grpc.O f32791X;

    /* renamed from: Y, reason: collision with root package name */
    private final w f32792Y;

    /* renamed from: Z, reason: collision with root package name */
    private x f32793Z;

    /* renamed from: a, reason: collision with root package name */
    private final io.grpc.U f32794a;

    /* renamed from: a0, reason: collision with root package name */
    private C5762m0 f32795a0;

    /* renamed from: b, reason: collision with root package name */
    private final String f32796b;

    /* renamed from: b0, reason: collision with root package name */
    private final C5762m0 f32797b0;

    /* renamed from: c, reason: collision with root package name */
    private final String f32798c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f32799c0;

    /* renamed from: d, reason: collision with root package name */
    private final C5791l0 f32800d;

    /* renamed from: d0, reason: collision with root package name */
    private final boolean f32801d0;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5787j0.d f32802e;

    /* renamed from: e0, reason: collision with root package name */
    private final C0.u f32803e0;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5787j0.b f32804f;

    /* renamed from: f0, reason: collision with root package name */
    private final long f32805f0;

    /* renamed from: g, reason: collision with root package name */
    private final C5754j f32806g;

    /* renamed from: g0, reason: collision with root package name */
    private final long f32807g0;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC5778v f32808h;

    /* renamed from: h0, reason: collision with root package name */
    private final boolean f32809h0;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC5725g f32810i;

    /* renamed from: i0, reason: collision with root package name */
    private final InterfaceC5764n0.a f32811i0;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC5778v f32812j;

    /* renamed from: j0, reason: collision with root package name */
    final Z f32813j0;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC5778v f32814k;

    /* renamed from: k0, reason: collision with root package name */
    private final o f32815k0;

    /* renamed from: l, reason: collision with root package name */
    private final y f32816l;

    /* renamed from: l0, reason: collision with root package name */
    private final B0 f32817l0;

    /* renamed from: m, reason: collision with root package name */
    private final Executor f32818m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC5773s0 f32819n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC5773s0 f32820o;

    /* renamed from: p, reason: collision with root package name */
    private final r f32821p;

    /* renamed from: q, reason: collision with root package name */
    private final r f32822q;

    /* renamed from: r, reason: collision with root package name */
    private final S0 f32823r;

    /* renamed from: s, reason: collision with root package name */
    private final int f32824s;

    /* renamed from: t, reason: collision with root package name */
    final io.grpc.N0 f32825t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f32826u;

    /* renamed from: v, reason: collision with root package name */
    private final C5808z f32827v;

    /* renamed from: w, reason: collision with root package name */
    private final C5801s f32828w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC5355E f32829x;

    /* renamed from: y, reason: collision with root package name */
    private final long f32830y;

    /* renamed from: z, reason: collision with root package name */
    private final C5784y f32831z;

    /* renamed from: io.grpc.internal.j0$a, reason: case insensitive filesystem */
    class C5756a extends io.grpc.P {
        C5756a() {
        }

        @Override // io.grpc.P
        public P.b selectConfig(AbstractC5714a0.f fVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* renamed from: io.grpc.internal.j0$b */
    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5755j0.this.u0(true);
        }
    }

    /* renamed from: io.grpc.internal.j0$c */
    final class c implements C5765o.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S0 f32837a;

        c(S0 s02) {
            this.f32837a = s02;
        }

        @Override // io.grpc.internal.C5765o.b
        public C5765o create() {
            return new C5765o(this.f32837a);
        }
    }

    /* renamed from: io.grpc.internal.j0$d */
    final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f32839a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC5802t f32840b;

        d(Runnable runnable, EnumC5802t enumC5802t) {
            this.f32839a = runnable;
            this.f32840b = enumC5802t;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5755j0.this.f32831z.c(this.f32839a, C5755j0.this.f32818m, this.f32840b);
        }
    }

    /* renamed from: io.grpc.internal.j0$e */
    final class e extends AbstractC5714a0.i {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5714a0.e f32842a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f32843b;

        e(Throwable th) {
            this.f32843b = th;
            this.f32842a = AbstractC5714a0.e.withDrop(io.grpc.J0.INTERNAL.withDescription("Panic! This is a bug!").withCause(th));
        }

        @Override // io.grpc.AbstractC5714a0.i
        public AbstractC5714a0.e pickSubchannel(AbstractC5714a0.f fVar) {
            return this.f32842a;
        }

        public String toString() {
            return e3.p.toStringHelper((Class<?>) e.class).add("panicPickResult", this.f32842a).toString();
        }
    }

    /* renamed from: io.grpc.internal.j0$f */
    final class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5755j0.this.f32782O.get() || C5755j0.this.f32773F == null) {
                return;
            }
            C5755j0.this.u0(false);
            C5755j0.this.v0();
        }
    }

    /* renamed from: io.grpc.internal.j0$g */
    final class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5755j0.this.w0();
            if (C5755j0.this.f32774G != null) {
                C5755j0.this.f32774G.requestConnection();
            }
            if (C5755j0.this.f32773F != null) {
                C5755j0.this.f32773F.f32879a.b();
            }
        }
    }

    /* renamed from: io.grpc.internal.j0$h */
    final class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5755j0.this.f32782O.get()) {
                return;
            }
            if (C5755j0.this.f32772E) {
                C5755j0.this.E0();
            }
            Iterator it = C5755j0.this.f32776I.iterator();
            while (it.hasNext()) {
                ((C5739b0) it.next()).Q();
            }
            Iterator it2 = C5755j0.this.f32779L.iterator();
            while (it2.hasNext()) {
                ((C5775t0) it2.next()).resetConnectBackoff();
            }
        }
    }

    /* renamed from: io.grpc.internal.j0$i */
    final class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5755j0.this.f32790W.log(AbstractC5727h.a.INFO, "Entering SHUTDOWN state");
            C5755j0.this.f32831z.b(EnumC5802t.SHUTDOWN);
        }
    }

    /* renamed from: io.grpc.internal.j0$j */
    final class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5755j0.this.f32783P) {
                return;
            }
            C5755j0.this.f32783P = true;
            C5755j0.this.B0();
        }
    }

    /* renamed from: io.grpc.internal.j0$k */
    final class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.M f32850a;

        k(com.google.common.util.concurrent.M m8) {
            this.f32850a = m8;
        }

        @Override // java.lang.Runnable
        public void run() {
            O.b.a aVar = new O.b.a();
            C5755j0.this.f32788U.a(aVar);
            C5755j0.this.f32789V.g(aVar);
            aVar.setTarget(C5755j0.this.f32796b).setState(C5755j0.this.f32831z.a());
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C5755j0.this.f32776I);
            arrayList.addAll(C5755j0.this.f32779L);
            aVar.setSubchannels(arrayList);
            this.f32850a.set(aVar.build());
        }
    }

    /* renamed from: io.grpc.internal.j0$l */
    class l implements Thread.UncaughtExceptionHandler {
        l() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            C5755j0.f32760m0.log(Level.SEVERE, "[" + C5755j0.this.getLogId() + "] Uncaught exception in the SynchronizationContext. Panic!", th);
            C5755j0.this.D0(th);
        }
    }

    /* renamed from: io.grpc.internal.j0$m */
    class m extends P {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f32853b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(AbstractC5787j0 abstractC5787j0, String str) {
            super(abstractC5787j0);
            this.f32853b = str;
        }

        @Override // io.grpc.internal.P, io.grpc.AbstractC5787j0
        public String getServiceAuthority() {
            return this.f32853b;
        }
    }

    /* renamed from: io.grpc.internal.j0$n */
    class n extends AbstractC5786j {
        n() {
        }

        @Override // io.grpc.AbstractC5786j
        public void cancel(String str, Throwable th) {
        }

        @Override // io.grpc.AbstractC5786j
        public void halfClose() {
        }

        @Override // io.grpc.AbstractC5786j
        public boolean isReady() {
            return false;
        }

        @Override // io.grpc.AbstractC5786j
        public void request(int i8) {
        }

        @Override // io.grpc.AbstractC5786j
        public void sendMessage(Object obj) {
        }

        @Override // io.grpc.AbstractC5786j
        public void start(AbstractC5786j.a aVar, C5728h0 c5728h0) {
        }
    }

    /* renamed from: io.grpc.internal.j0$o */
    private final class o implements r.e {

        /* renamed from: a, reason: collision with root package name */
        volatile C0.E f32854a;

        /* renamed from: io.grpc.internal.j0$o$a */
        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5755j0.this.w0();
            }
        }

        /* renamed from: io.grpc.internal.j0$o$b */
        final class b extends C0 {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ C5730i0 f32857E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ C5728h0 f32858F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ C5721e f32859G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ D0 f32860H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ W f32861I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ C5804v f32862J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C5730i0 c5730i0, C5728h0 c5728h0, C5721e c5721e, D0 d02, W w8, C5804v c5804v) {
                super(c5730i0, c5728h0, C5755j0.this.f32803e0, C5755j0.this.f32805f0, C5755j0.this.f32807g0, C5755j0.this.x0(c5721e), C5755j0.this.f32812j.getScheduledExecutorService(), d02, w8, o.this.f32854a);
                this.f32857E = c5730i0;
                this.f32858F = c5728h0;
                this.f32859G = c5721e;
                this.f32860H = d02;
                this.f32861I = w8;
                this.f32862J = c5804v;
            }

            @Override // io.grpc.internal.C0
            InterfaceC5772s T(C5728h0 c5728h0, AbstractC5794n.a aVar, int i8, boolean z8) {
                C5721e c5721eWithStreamTracerFactory = this.f32859G.withStreamTracerFactory(aVar);
                AbstractC5794n[] clientStreamTracers = U.getClientStreamTracers(c5721eWithStreamTracerFactory, c5728h0, i8, z8);
                InterfaceC5776u interfaceC5776uB = o.this.b(new C5781w0(this.f32857E, c5728h0, c5721eWithStreamTracerFactory));
                C5804v c5804vAttach = this.f32862J.attach();
                try {
                    return interfaceC5776uB.newStream(this.f32857E, c5728h0, c5721eWithStreamTracerFactory, clientStreamTracers);
                } finally {
                    this.f32862J.detach(c5804vAttach);
                }
            }

            @Override // io.grpc.internal.C0
            void U() {
                C5755j0.this.f32781N.d(this);
            }

            @Override // io.grpc.internal.C0
            io.grpc.J0 V() {
                return C5755j0.this.f32781N.a(this);
            }
        }

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public InterfaceC5776u b(AbstractC5714a0.f fVar) {
            AbstractC5714a0.i iVar = C5755j0.this.f32774G;
            if (C5755j0.this.f32782O.get()) {
                return C5755j0.this.f32780M;
            }
            if (iVar == null) {
                C5755j0.this.f32825t.execute(new a());
                return C5755j0.this.f32780M;
            }
            InterfaceC5776u interfaceC5776uC = U.c(iVar.pickSubchannel(fVar), fVar.getCallOptions().isWaitForReady());
            return interfaceC5776uC != null ? interfaceC5776uC : C5755j0.this.f32780M;
        }

        @Override // io.grpc.internal.r.e
        public InterfaceC5772s newStream(C5730i0 c5730i0, C5721e c5721e, C5728h0 c5728h0, C5804v c5804v) {
            if (C5755j0.this.f32809h0) {
                C5762m0.b bVar = (C5762m0.b) c5721e.getOption(C5762m0.b.f33007g);
                return new b(c5730i0, c5728h0, c5721e, bVar == null ? null : bVar.f33012e, bVar != null ? bVar.f33013f : null, c5804v);
            }
            InterfaceC5776u interfaceC5776uB = b(new C5781w0(c5730i0, c5728h0, c5721e));
            C5804v c5804vAttach = c5804v.attach();
            try {
                return interfaceC5776uB.newStream(c5730i0, c5728h0, c5721e, U.getClientStreamTracers(c5721e, c5728h0, 0, false));
            } finally {
                c5804v.detach(c5804vAttach);
            }
        }

        /* synthetic */ o(C5755j0 c5755j0, C5756a c5756a) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.j0$p */
    static final class p extends io.grpc.E {

        /* renamed from: a, reason: collision with root package name */
        private final io.grpc.P f32864a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC5723f f32865b;

        /* renamed from: c, reason: collision with root package name */
        private final Executor f32866c;

        /* renamed from: d, reason: collision with root package name */
        private final C5730i0 f32867d;

        /* renamed from: e, reason: collision with root package name */
        private final C5804v f32868e;

        /* renamed from: f, reason: collision with root package name */
        private C5721e f32869f;

        /* renamed from: g, reason: collision with root package name */
        private AbstractC5786j f32870g;

        /* renamed from: io.grpc.internal.j0$p$a */
        class a extends AbstractRunnableC5785z {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5786j.a f32871b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ io.grpc.J0 f32872c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC5786j.a aVar, io.grpc.J0 j02) {
                super(p.this.f32868e);
                this.f32871b = aVar;
                this.f32872c = j02;
            }

            @Override // io.grpc.internal.AbstractRunnableC5785z
            public void runInContext() {
                this.f32871b.onClose(this.f32872c, new C5728h0());
            }
        }

        p(io.grpc.P p8, AbstractC5723f abstractC5723f, Executor executor, C5730i0 c5730i0, C5721e c5721e) {
            this.f32864a = p8;
            this.f32865b = abstractC5723f;
            this.f32867d = c5730i0;
            executor = c5721e.getExecutor() != null ? c5721e.getExecutor() : executor;
            this.f32866c = executor;
            this.f32869f = c5721e.withExecutor(executor);
            this.f32868e = C5804v.current();
        }

        private void b(AbstractC5786j.a aVar, io.grpc.J0 j02) {
            this.f32866c.execute(new a(aVar, j02));
        }

        @Override // io.grpc.E, io.grpc.AbstractC5793m0, io.grpc.AbstractC5786j
        public void cancel(String str, Throwable th) {
            AbstractC5786j abstractC5786j = this.f32870g;
            if (abstractC5786j != null) {
                abstractC5786j.cancel(str, th);
            }
        }

        @Override // io.grpc.E, io.grpc.AbstractC5793m0
        protected AbstractC5786j delegate() {
            return this.f32870g;
        }

        @Override // io.grpc.E, io.grpc.AbstractC5786j
        public void start(AbstractC5786j.a aVar, C5728h0 c5728h0) {
            P.b bVarSelectConfig = this.f32864a.selectConfig(new C5781w0(this.f32867d, c5728h0, this.f32869f));
            io.grpc.J0 status = bVarSelectConfig.getStatus();
            if (!status.isOk()) {
                b(aVar, U.replaceInappropriateControlPlaneStatus(status));
                this.f32870g = C5755j0.f32767t0;
                return;
            }
            InterfaceC5788k interceptor = bVarSelectConfig.getInterceptor();
            C5762m0.b bVarF = ((C5762m0) bVarSelectConfig.getConfig()).f(this.f32867d);
            if (bVarF != null) {
                this.f32869f = this.f32869f.withOption(C5762m0.b.f33007g, bVarF);
            }
            if (interceptor != null) {
                this.f32870g = interceptor.interceptCall(this.f32867d, this.f32869f, this.f32865b);
            } else {
                this.f32870g = this.f32865b.newCall(this.f32867d, this.f32869f);
            }
            this.f32870g.start(aVar, c5728h0);
        }
    }

    /* renamed from: io.grpc.internal.j0$q */
    private final class q implements InterfaceC5764n0.a {
        private q() {
        }

        @Override // io.grpc.internal.InterfaceC5764n0.a
        public void transportInUse(boolean z8) {
            C5755j0 c5755j0 = C5755j0.this;
            c5755j0.f32813j0.updateObjectInUse(c5755j0.f32780M, z8);
        }

        @Override // io.grpc.internal.InterfaceC5764n0.a
        public void transportReady() {
        }

        @Override // io.grpc.internal.InterfaceC5764n0.a
        public void transportShutdown(io.grpc.J0 j02) {
            e3.w.checkState(C5755j0.this.f32782O.get(), "Channel must have been shut down");
        }

        @Override // io.grpc.internal.InterfaceC5764n0.a
        public void transportTerminated() {
            e3.w.checkState(C5755j0.this.f32782O.get(), "Channel must have been shut down");
            C5755j0.this.f32784Q = true;
            C5755j0.this.G0(false);
            C5755j0.this.B0();
            C5755j0.this.C0();
        }

        /* synthetic */ q(C5755j0 c5755j0, C5756a c5756a) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.j0$r */
    static final class r implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5773s0 f32875a;

        /* renamed from: b, reason: collision with root package name */
        private Executor f32876b;

        r(InterfaceC5773s0 interfaceC5773s0) {
            this.f32875a = (InterfaceC5773s0) e3.w.checkNotNull(interfaceC5773s0, "executorPool");
        }

        synchronized Executor a() {
            try {
                if (this.f32876b == null) {
                    this.f32876b = (Executor) e3.w.checkNotNull((Executor) this.f32875a.getObject(), "%s.getObject()", this.f32876b);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f32876b;
        }

        synchronized void b() {
            Executor executor = this.f32876b;
            if (executor != null) {
                this.f32876b = (Executor) this.f32875a.returnObject(executor);
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a().execute(runnable);
        }
    }

    /* renamed from: io.grpc.internal.j0$s */
    private final class s extends Z {
        private s() {
        }

        @Override // io.grpc.internal.Z
        protected void a() {
            C5755j0.this.w0();
        }

        @Override // io.grpc.internal.Z
        protected void b() {
            if (C5755j0.this.f32782O.get()) {
                return;
            }
            C5755j0.this.F0();
        }

        /* synthetic */ s(C5755j0 c5755j0, C5756a c5756a) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.j0$t */
    private class t implements Runnable {
        private t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5755j0.this.f32773F == null) {
                return;
            }
            C5755j0.this.v0();
        }

        /* synthetic */ t(C5755j0 c5755j0, C5756a c5756a) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.j0$u */
    private final class u extends AbstractC5714a0.d {

        /* renamed from: a, reason: collision with root package name */
        C5754j.b f32879a;

        /* renamed from: io.grpc.internal.j0$u$a */
        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5775t0 f32881a;

            a(C5775t0 c5775t0) {
                this.f32881a = c5775t0;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C5755j0.this.f32784Q) {
                    this.f32881a.shutdown();
                }
                if (C5755j0.this.f32785R) {
                    return;
                }
                C5755j0.this.f32779L.add(this.f32881a);
            }
        }

        /* renamed from: io.grpc.internal.j0$u$b */
        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5755j0.this.E0();
            }
        }

        /* renamed from: io.grpc.internal.j0$u$c */
        final class c extends C5739b0.l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5775t0 f32884a;

            c(C5775t0 c5775t0) {
                this.f32884a = c5775t0;
            }

            @Override // io.grpc.internal.C5739b0.l
            void c(C5739b0 c5739b0, C5803u c5803u) {
                C5755j0.this.A0(c5803u);
                this.f32884a.d(c5803u);
            }

            @Override // io.grpc.internal.C5739b0.l
            void d(C5739b0 c5739b0) {
                C5755j0.this.f32779L.remove(this.f32884a);
                C5755j0.this.f32791X.removeSubchannel(c5739b0);
                this.f32884a.e();
                C5755j0.this.C0();
            }
        }

        /* renamed from: io.grpc.internal.j0$u$d */
        final class d extends io.grpc.D {

            /* renamed from: a, reason: collision with root package name */
            final AbstractC5722e0 f32886a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5725g f32887b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f32888c;

            /* renamed from: io.grpc.internal.j0$u$d$a */
            class a implements C5758k0.c {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ u f32890a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5778v f32891b;

                a(u uVar, InterfaceC5778v interfaceC5778v) {
                    this.f32890a = uVar;
                    this.f32891b = interfaceC5778v;
                }

                @Override // io.grpc.internal.C5758k0.c
                public InterfaceC5778v buildClientTransportFactory() {
                    return this.f32891b;
                }
            }

            d(AbstractC5725g abstractC5725g, String str) {
                AbstractC5719d abstractC5719d;
                InterfaceC5778v interfaceC5778v;
                this.f32887b = abstractC5725g;
                this.f32888c = str;
                if (abstractC5725g instanceof f) {
                    interfaceC5778v = C5755j0.this.f32808h;
                    abstractC5719d = null;
                } else {
                    InterfaceC5778v.b bVarSwapChannelCredentials = C5755j0.this.f32808h.swapChannelCredentials(abstractC5725g);
                    if (bVarSwapChannelCredentials == null) {
                        this.f32886a = io.grpc.J.newChannelBuilder(str, abstractC5725g);
                        return;
                    } else {
                        InterfaceC5778v interfaceC5778v2 = bVarSwapChannelCredentials.f33193a;
                        abstractC5719d = bVarSwapChannelCredentials.f33194b;
                        interfaceC5778v = interfaceC5778v2;
                    }
                }
                this.f32886a = new C5758k0(str, abstractC5725g, abstractC5719d, new a(u.this, interfaceC5778v), new C5758k0.e(C5755j0.this.f32804f.getDefaultPort()));
            }

            @Override // io.grpc.D
            protected AbstractC5722e0 b() {
                return this.f32886a;
            }
        }

        /* renamed from: io.grpc.internal.j0$u$e */
        final class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5714a0.i f32893a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ EnumC5802t f32894b;

            e(AbstractC5714a0.i iVar, EnumC5802t enumC5802t) {
                this.f32893a = iVar;
                this.f32894b = enumC5802t;
            }

            @Override // java.lang.Runnable
            public void run() {
                u uVar = u.this;
                if (uVar != C5755j0.this.f32773F) {
                    return;
                }
                C5755j0.this.H0(this.f32893a);
                if (this.f32894b != EnumC5802t.SHUTDOWN) {
                    C5755j0.this.f32790W.log(AbstractC5727h.a.INFO, "Entering {0} state with picker: {1}", this.f32894b, this.f32893a);
                    C5755j0.this.f32831z.b(this.f32894b);
                }
            }
        }

        /* renamed from: io.grpc.internal.j0$u$f */
        final class f extends AbstractC5725g {
            f() {
            }

            @Override // io.grpc.AbstractC5725g
            public AbstractC5725g withoutBearerTokens() {
                return this;
            }
        }

        private u() {
        }

        @Override // io.grpc.AbstractC5714a0.d
        public AbstractC5720d0 createOobChannel(io.grpc.C c9, String str) {
            return createOobChannel(Collections.singletonList(c9), str);
        }

        @Override // io.grpc.AbstractC5714a0.d
        @Deprecated
        public AbstractC5722e0 createResolvingOobChannelBuilder(String str) {
            return createResolvingOobChannelBuilder(str, new f()).overrideAuthority(getAuthority());
        }

        @Override // io.grpc.AbstractC5714a0.d
        public String getAuthority() {
            return C5755j0.this.authority();
        }

        @Override // io.grpc.AbstractC5714a0.d
        public AbstractC5727h getChannelLogger() {
            return C5755j0.this.f32790W;
        }

        @Override // io.grpc.AbstractC5714a0.d
        public AbstractC5787j0.b getNameResolverArgs() {
            return C5755j0.this.f32804f;
        }

        @Override // io.grpc.AbstractC5714a0.d
        public C5791l0 getNameResolverRegistry() {
            return C5755j0.this.f32800d;
        }

        @Override // io.grpc.AbstractC5714a0.d
        public ScheduledExecutorService getScheduledExecutorService() {
            return C5755j0.this.f32816l;
        }

        @Override // io.grpc.AbstractC5714a0.d
        public io.grpc.N0 getSynchronizationContext() {
            return C5755j0.this.f32825t;
        }

        @Override // io.grpc.AbstractC5714a0.d
        public AbstractC5725g getUnsafeChannelCredentials() {
            return C5755j0.this.f32810i == null ? new f() : C5755j0.this.f32810i;
        }

        @Override // io.grpc.AbstractC5714a0.d
        public void refreshNameResolution() {
            C5755j0.this.f32825t.throwIfNotInThisSynchronizationContext();
            C5755j0.this.f32825t.execute(new b());
        }

        @Override // io.grpc.AbstractC5714a0.d
        public void updateBalancingState(EnumC5802t enumC5802t, AbstractC5714a0.i iVar) {
            C5755j0.this.f32825t.throwIfNotInThisSynchronizationContext();
            e3.w.checkNotNull(enumC5802t, "newState");
            e3.w.checkNotNull(iVar, "newPicker");
            C5755j0.this.f32825t.execute(new e(iVar, enumC5802t));
        }

        @Override // io.grpc.AbstractC5714a0.d
        public void updateOobChannelAddresses(AbstractC5720d0 abstractC5720d0, io.grpc.C c9) {
            updateOobChannelAddresses(abstractC5720d0, Collections.singletonList(c9));
        }

        /* synthetic */ u(C5755j0 c5755j0, C5756a c5756a) {
            this();
        }

        @Override // io.grpc.AbstractC5714a0.d
        public AbstractC5720d0 createOobChannel(List<io.grpc.C> list, String str) {
            e3.w.checkState(!C5755j0.this.f32785R, "Channel is terminated");
            long jCurrentTimeNanos = C5755j0.this.f32823r.currentTimeNanos();
            io.grpc.U uAllocate = io.grpc.U.allocate("OobChannel", (String) null);
            io.grpc.U uAllocate2 = io.grpc.U.allocate("Subchannel-OOB", str);
            C5769q c5769q = new C5769q(uAllocate, C5755j0.this.f32824s, jCurrentTimeNanos, "OobChannel for " + list);
            InterfaceC5773s0 interfaceC5773s0 = C5755j0.this.f32820o;
            ScheduledExecutorService scheduledExecutorService = C5755j0.this.f32814k.getScheduledExecutorService();
            C5755j0 c5755j0 = C5755j0.this;
            C5775t0 c5775t0 = new C5775t0(str, interfaceC5773s0, scheduledExecutorService, c5755j0.f32825t, c5755j0.f32787T.create(), c5769q, C5755j0.this.f32791X, C5755j0.this.f32823r);
            C5769q c5769q2 = C5755j0.this.f32789V;
            O.c.b.a description = new O.c.b.a().setDescription("Child OobChannel created");
            O.c.b.EnumC0316b enumC0316b = O.c.b.EnumC0316b.CT_INFO;
            c5769q2.e(description.setSeverity(enumC0316b).setTimestampNanos(jCurrentTimeNanos).setChannelRef(c5775t0).build());
            C5769q c5769q3 = new C5769q(uAllocate2, C5755j0.this.f32824s, jCurrentTimeNanos, "Subchannel for " + list);
            C5739b0 c5739b0 = new C5739b0(list, str, C5755j0.this.f32770C, C5755j0.this.f32768A, C5755j0.this.f32814k, C5755j0.this.f32814k.getScheduledExecutorService(), C5755j0.this.f32829x, C5755j0.this.f32825t, new c(c5775t0), C5755j0.this.f32791X, C5755j0.this.f32787T.create(), c5769q3, uAllocate2, new C5767p(c5769q3, C5755j0.this.f32823r));
            c5769q.e(new O.c.b.a().setDescription("Child Subchannel created").setSeverity(enumC0316b).setTimestampNanos(jCurrentTimeNanos).setSubchannelRef(c5739b0).build());
            C5755j0.this.f32791X.addSubchannel(c5775t0);
            C5755j0.this.f32791X.addSubchannel(c5739b0);
            c5775t0.f(c5739b0);
            C5755j0.this.f32825t.execute(new a(c5775t0));
            return c5775t0;
        }

        @Override // io.grpc.AbstractC5714a0.d
        public AbstractC5744e createSubchannel(AbstractC5714a0.b bVar) {
            C5755j0.this.f32825t.throwIfNotInThisSynchronizationContext();
            e3.w.checkState(!C5755j0.this.f32784Q, "Channel is being terminated");
            return C5755j0.this.new z(bVar);
        }

        @Override // io.grpc.AbstractC5714a0.d
        public void updateOobChannelAddresses(AbstractC5720d0 abstractC5720d0, List<io.grpc.C> list) {
            e3.w.checkArgument(abstractC5720d0 instanceof C5775t0, "channel must have been returned from createOobChannel");
            ((C5775t0) abstractC5720d0).g(list);
        }

        @Override // io.grpc.AbstractC5714a0.d
        public AbstractC5722e0 createResolvingOobChannelBuilder(String str, AbstractC5725g abstractC5725g) {
            e3.w.checkNotNull(abstractC5725g, "channelCreds");
            e3.w.checkState(!C5755j0.this.f32785R, "Channel is terminated");
            return ((d) ((d) ((d) ((d) ((d) new d(abstractC5725g, str).nameResolverFactory(C5755j0.this.f32802e)).executor(C5755j0.this.f32818m)).offloadExecutor(C5755j0.this.f32822q.a())).maxTraceEvents(C5755j0.this.f32824s)).proxyDetector(C5755j0.this.f32804f.getProxyDetector())).userAgent(C5755j0.this.f32770C);
        }
    }

    /* renamed from: io.grpc.internal.j0$v */
    final class v extends AbstractC5787j0.e {

        /* renamed from: a, reason: collision with root package name */
        final u f32897a;

        /* renamed from: b, reason: collision with root package name */
        final AbstractC5787j0 f32898b;

        /* renamed from: io.grpc.internal.j0$v$a */
        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.J0 f32900a;

            a(io.grpc.J0 j02) {
                this.f32900a = j02;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.b(this.f32900a);
            }
        }

        /* renamed from: io.grpc.internal.j0$v$b */
        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5787j0.g f32902a;

            b(AbstractC5787j0.g gVar) {
                this.f32902a = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5762m0 c5762m0;
                if (C5755j0.this.f32771D != v.this.f32898b) {
                    return;
                }
                List<io.grpc.C> addresses = this.f32902a.getAddresses();
                AbstractC5727h abstractC5727h = C5755j0.this.f32790W;
                AbstractC5727h.a aVar = AbstractC5727h.a.DEBUG;
                abstractC5727h.log(aVar, "Resolved address: {0}, config={1}", addresses, this.f32902a.getAttributes());
                x xVar = C5755j0.this.f32793Z;
                x xVar2 = x.SUCCESS;
                if (xVar != xVar2) {
                    C5755j0.this.f32790W.log(AbstractC5727h.a.INFO, "Address resolved: {0}", addresses);
                    C5755j0.this.f32793Z = xVar2;
                }
                AbstractC5787j0.c serviceConfig = this.f32902a.getServiceConfig();
                F0.b bVar = (F0.b) this.f32902a.getAttributes().get(F0.f32456e);
                io.grpc.P p8 = (io.grpc.P) this.f32902a.getAttributes().get(io.grpc.P.KEY);
                C5762m0 c5762m02 = (serviceConfig == null || serviceConfig.getConfig() == null) ? null : (C5762m0) serviceConfig.getConfig();
                io.grpc.J0 error = serviceConfig != null ? serviceConfig.getError() : null;
                if (C5755j0.this.f32801d0) {
                    if (c5762m02 != null) {
                        if (p8 != null) {
                            C5755j0.this.f32792Y.h(p8);
                            if (c5762m02.c() != null) {
                                C5755j0.this.f32790W.log(aVar, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            C5755j0.this.f32792Y.h(c5762m02.c());
                        }
                    } else if (C5755j0.this.f32797b0 != null) {
                        c5762m02 = C5755j0.this.f32797b0;
                        C5755j0.this.f32792Y.h(c5762m02.c());
                        C5755j0.this.f32790W.log(AbstractC5727h.a.INFO, "Received no service config, using default service config");
                    } else if (error == null) {
                        c5762m02 = C5755j0.f32765r0;
                        C5755j0.this.f32792Y.h(null);
                    } else {
                        if (!C5755j0.this.f32799c0) {
                            C5755j0.this.f32790W.log(AbstractC5727h.a.INFO, "Fallback to error due to invalid first service config without default config");
                            v.this.onError(serviceConfig.getError());
                            if (bVar != null) {
                                bVar.resolutionAttempted(false);
                                return;
                            }
                            return;
                        }
                        c5762m02 = C5755j0.this.f32795a0;
                    }
                    if (!c5762m02.equals(C5755j0.this.f32795a0)) {
                        C5755j0.this.f32790W.log(AbstractC5727h.a.INFO, "Service config changed{0}", c5762m02 == C5755j0.f32765r0 ? " to empty" : "");
                        C5755j0.this.f32795a0 = c5762m02;
                        C5755j0.this.f32815k0.f32854a = c5762m02.g();
                    }
                    try {
                        C5755j0.this.f32799c0 = true;
                    } catch (RuntimeException e8) {
                        C5755j0.f32760m0.log(Level.WARNING, "[" + C5755j0.this.getLogId() + "] Unexpected exception from parsing service config", (Throwable) e8);
                    }
                    c5762m0 = c5762m02;
                } else {
                    if (c5762m02 != null) {
                        C5755j0.this.f32790W.log(AbstractC5727h.a.INFO, "Service config from name resolver discarded by channel settings");
                    }
                    c5762m0 = C5755j0.this.f32797b0 == null ? C5755j0.f32765r0 : C5755j0.this.f32797b0;
                    if (p8 != null) {
                        C5755j0.this.f32790W.log(AbstractC5727h.a.INFO, "Config selector from name resolver discarded by channel settings");
                    }
                    C5755j0.this.f32792Y.h(c5762m0.c());
                }
                C5713a attributes = this.f32902a.getAttributes();
                v vVar = v.this;
                if (vVar.f32897a == C5755j0.this.f32773F) {
                    C5713a.b bVarDiscard = attributes.toBuilder().discard(io.grpc.P.KEY);
                    Map mapD = c5762m0.d();
                    if (mapD != null) {
                        bVarDiscard.set(AbstractC5714a0.ATTR_HEALTH_CHECKING_CONFIG, mapD).build();
                    }
                    boolean zD = v.this.f32897a.f32879a.d(AbstractC5714a0.g.newBuilder().setAddresses(addresses).setAttributes(bVarDiscard.build()).setLoadBalancingPolicyConfig(c5762m0.e()).build());
                    if (bVar != null) {
                        bVar.resolutionAttempted(zD);
                    }
                }
            }
        }

        v(u uVar, AbstractC5787j0 abstractC5787j0) {
            this.f32897a = (u) e3.w.checkNotNull(uVar, "helperImpl");
            this.f32898b = (AbstractC5787j0) e3.w.checkNotNull(abstractC5787j0, "resolver");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(io.grpc.J0 j02) {
            C5755j0.f32760m0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{C5755j0.this.getLogId(), j02});
            C5755j0.this.f32792Y.e();
            x xVar = C5755j0.this.f32793Z;
            x xVar2 = x.ERROR;
            if (xVar != xVar2) {
                C5755j0.this.f32790W.log(AbstractC5727h.a.WARNING, "Failed to resolve name: {0}", j02);
                C5755j0.this.f32793Z = xVar2;
            }
            if (this.f32897a != C5755j0.this.f32773F) {
                return;
            }
            this.f32897a.f32879a.a(j02);
        }

        @Override // io.grpc.AbstractC5787j0.e, io.grpc.AbstractC5787j0.f
        public void onError(io.grpc.J0 j02) {
            e3.w.checkArgument(!j02.isOk(), "the error status must not be OK");
            C5755j0.this.f32825t.execute(new a(j02));
        }

        @Override // io.grpc.AbstractC5787j0.e
        public void onResult(AbstractC5787j0.g gVar) {
            C5755j0.this.f32825t.execute(new b(gVar));
        }
    }

    /* renamed from: io.grpc.internal.j0$w */
    private class w extends AbstractC5723f {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReference f32904a;

        /* renamed from: b, reason: collision with root package name */
        private final String f32905b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC5723f f32906c;

        /* renamed from: io.grpc.internal.j0$w$a */
        class a extends AbstractC5723f {
            a() {
            }

            @Override // io.grpc.AbstractC5723f
            public String authority() {
                return w.this.f32905b;
            }

            @Override // io.grpc.AbstractC5723f
            public <RequestT, ResponseT> AbstractC5786j newCall(C5730i0 c5730i0, C5721e c5721e) {
                return new io.grpc.internal.r(c5730i0, C5755j0.this.x0(c5721e), c5721e, C5755j0.this.f32815k0, C5755j0.this.f32785R ? null : C5755j0.this.f32812j.getScheduledExecutorService(), C5755j0.this.f32788U, null).x(C5755j0.this.f32826u).w(C5755j0.this.f32827v).v(C5755j0.this.f32828w);
            }
        }

        /* renamed from: io.grpc.internal.j0$w$b */
        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C5755j0.this.f32777J == null) {
                    if (w.this.f32904a.get() == C5755j0.f32766s0) {
                        w.this.f32904a.set(null);
                    }
                    C5755j0.this.f32781N.b(C5755j0.f32763p0);
                }
            }
        }

        /* renamed from: io.grpc.internal.j0$w$c */
        final class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (w.this.f32904a.get() == C5755j0.f32766s0) {
                    w.this.f32904a.set(null);
                }
                if (C5755j0.this.f32777J != null) {
                    Iterator it = C5755j0.this.f32777J.iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).cancel("Channel is forcefully shutdown", null);
                    }
                }
                C5755j0.this.f32781N.c(C5755j0.f32762o0);
            }
        }

        /* renamed from: io.grpc.internal.j0$w$d */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5755j0.this.w0();
            }
        }

        /* renamed from: io.grpc.internal.j0$w$e */
        class e extends AbstractC5786j {
            e() {
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
            public void sendMessage(ReqT reqt) {
            }

            @Override // io.grpc.AbstractC5786j
            public void start(AbstractC5786j.a aVar, C5728h0 c5728h0) {
                aVar.onClose(C5755j0.f32763p0, new C5728h0());
            }
        }

        /* renamed from: io.grpc.internal.j0$w$f */
        class f implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f32913a;

            f(g gVar) {
                this.f32913a = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (w.this.f32904a.get() != C5755j0.f32766s0) {
                    this.f32913a.l();
                    return;
                }
                if (C5755j0.this.f32777J == null) {
                    C5755j0.this.f32777J = new LinkedHashSet();
                    C5755j0 c5755j0 = C5755j0.this;
                    c5755j0.f32813j0.updateObjectInUse(c5755j0.f32778K, true);
                }
                C5755j0.this.f32777J.add(this.f32913a);
            }
        }

        /* renamed from: io.grpc.internal.j0$w$g */
        private final class g extends B {

            /* renamed from: l, reason: collision with root package name */
            final C5804v f32915l;

            /* renamed from: m, reason: collision with root package name */
            final C5730i0 f32916m;

            /* renamed from: n, reason: collision with root package name */
            final C5721e f32917n;

            /* renamed from: io.grpc.internal.j0$w$g$a */
            class a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Runnable f32919a;

                a(Runnable runnable) {
                    this.f32919a = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f32919a.run();
                    g gVar = g.this;
                    C5755j0.this.f32825t.execute(gVar.new b());
                }
            }

            /* renamed from: io.grpc.internal.j0$w$g$b */
            final class b implements Runnable {
                b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C5755j0.this.f32777J != null) {
                        C5755j0.this.f32777J.remove(g.this);
                        if (C5755j0.this.f32777J.isEmpty()) {
                            C5755j0 c5755j0 = C5755j0.this;
                            c5755j0.f32813j0.updateObjectInUse(c5755j0.f32778K, false);
                            C5755j0.this.f32777J = null;
                            if (C5755j0.this.f32782O.get()) {
                                C5755j0.this.f32781N.b(C5755j0.f32763p0);
                            }
                        }
                    }
                }
            }

            g(C5804v c5804v, C5730i0 c5730i0, C5721e c5721e) {
                super(C5755j0.this.x0(c5721e), C5755j0.this.f32816l, c5721e.getDeadline());
                this.f32915l = c5804v;
                this.f32916m = c5730i0;
                this.f32917n = c5721e;
            }

            @Override // io.grpc.internal.B
            protected void e() {
                super.e();
                C5755j0.this.f32825t.execute(new b());
            }

            void l() {
                C5804v c5804vAttach = this.f32915l.attach();
                try {
                    AbstractC5786j abstractC5786jD = w.this.d(this.f32916m, this.f32917n.withOption(AbstractC5794n.NAME_RESOLUTION_DELAYED, Boolean.TRUE));
                    this.f32915l.detach(c5804vAttach);
                    Runnable call = setCall(abstractC5786jD);
                    if (call == null) {
                        C5755j0.this.f32825t.execute(new b());
                    } else {
                        C5755j0.this.x0(this.f32917n).execute(new a(call));
                    }
                } catch (Throwable th) {
                    this.f32915l.detach(c5804vAttach);
                    throw th;
                }
            }
        }

        /* synthetic */ w(C5755j0 c5755j0, String str, C5756a c5756a) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AbstractC5786j d(C5730i0 c5730i0, C5721e c5721e) {
            io.grpc.P p8 = (io.grpc.P) this.f32904a.get();
            if (p8 == null) {
                return this.f32906c.newCall(c5730i0, c5721e);
            }
            if (!(p8 instanceof C5762m0.c)) {
                return new p(p8, this.f32906c, C5755j0.this.f32818m, c5730i0, c5721e);
            }
            C5762m0.b bVarF = ((C5762m0.c) p8).f33014a.f(c5730i0);
            if (bVarF != null) {
                c5721e = c5721e.withOption(C5762m0.b.f33007g, bVarF);
            }
            return this.f32906c.newCall(c5730i0, c5721e);
        }

        @Override // io.grpc.AbstractC5723f
        public String authority() {
            return this.f32905b;
        }

        void e() {
            if (this.f32904a.get() == C5755j0.f32766s0) {
                h(null);
            }
        }

        void f() {
            C5755j0.this.f32825t.execute(new b());
        }

        void g() {
            C5755j0.this.f32825t.execute(new c());
        }

        void h(io.grpc.P p8) {
            io.grpc.P p9 = (io.grpc.P) this.f32904a.get();
            this.f32904a.set(p8);
            if (p9 != C5755j0.f32766s0 || C5755j0.this.f32777J == null) {
                return;
            }
            Iterator it = C5755j0.this.f32777J.iterator();
            while (it.hasNext()) {
                ((g) it.next()).l();
            }
        }

        @Override // io.grpc.AbstractC5723f
        public <ReqT, RespT> AbstractC5786j newCall(C5730i0 c5730i0, C5721e c5721e) {
            if (this.f32904a.get() != C5755j0.f32766s0) {
                return d(c5730i0, c5721e);
            }
            C5755j0.this.f32825t.execute(new d());
            if (this.f32904a.get() != C5755j0.f32766s0) {
                return d(c5730i0, c5721e);
            }
            if (C5755j0.this.f32782O.get()) {
                return new e();
            }
            g gVar = new g(C5804v.current(), c5730i0, c5721e);
            C5755j0.this.f32825t.execute(new f(gVar));
            return gVar;
        }

        private w(String str) {
            this.f32904a = new AtomicReference(C5755j0.f32766s0);
            this.f32906c = new a();
            this.f32905b = (String) e3.w.checkNotNull(str, "authority");
        }
    }

    /* renamed from: io.grpc.internal.j0$x */
    enum x {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* renamed from: io.grpc.internal.j0$y */
    private static final class y implements ScheduledExecutorService {

        /* renamed from: a, reason: collision with root package name */
        final ScheduledExecutorService f32923a;

        /* synthetic */ y(ScheduledExecutorService scheduledExecutorService, C5756a c5756a) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j8, TimeUnit timeUnit) {
            return this.f32923a.awaitTermination(j8, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f32923a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            return this.f32923a.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            return (T) this.f32923a.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f32923a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f32923a.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j8, TimeUnit timeUnit) {
            return this.f32923a.schedule(callable, j8, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
            return this.f32923a.scheduleAtFixedRate(runnable, j8, j9, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j8, long j9, TimeUnit timeUnit) {
            return this.f32923a.scheduleWithFixedDelay(runnable, j8, j9, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.f32923a.submit(callable);
        }

        private y(ScheduledExecutorService scheduledExecutorService) {
            this.f32923a = (ScheduledExecutorService) e3.w.checkNotNull(scheduledExecutorService, "delegate");
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j8, TimeUnit timeUnit) {
            return this.f32923a.invokeAll(collection, j8, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j8, TimeUnit timeUnit) {
            return (T) this.f32923a.invokeAny(collection, j8, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable runnable, long j8, TimeUnit timeUnit) {
            return this.f32923a.schedule(runnable, j8, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.f32923a.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t8) {
            return this.f32923a.submit(runnable, t8);
        }
    }

    /* renamed from: io.grpc.internal.j0$z */
    private final class z extends AbstractC5744e {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC5714a0.b f32924a;

        /* renamed from: b, reason: collision with root package name */
        final io.grpc.U f32925b;

        /* renamed from: c, reason: collision with root package name */
        final C5767p f32926c;

        /* renamed from: d, reason: collision with root package name */
        final C5769q f32927d;

        /* renamed from: e, reason: collision with root package name */
        List f32928e;

        /* renamed from: f, reason: collision with root package name */
        C5739b0 f32929f;

        /* renamed from: g, reason: collision with root package name */
        boolean f32930g;

        /* renamed from: h, reason: collision with root package name */
        boolean f32931h;

        /* renamed from: i, reason: collision with root package name */
        N0.d f32932i;

        /* renamed from: io.grpc.internal.j0$z$a */
        final class a extends C5739b0.l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5714a0.j f32934a;

            a(AbstractC5714a0.j jVar) {
                this.f32934a = jVar;
            }

            @Override // io.grpc.internal.C5739b0.l
            void a(C5739b0 c5739b0) {
                C5755j0.this.f32813j0.updateObjectInUse(c5739b0, true);
            }

            @Override // io.grpc.internal.C5739b0.l
            void b(C5739b0 c5739b0) {
                C5755j0.this.f32813j0.updateObjectInUse(c5739b0, false);
            }

            @Override // io.grpc.internal.C5739b0.l
            void c(C5739b0 c5739b0, C5803u c5803u) {
                e3.w.checkState(this.f32934a != null, "listener is null");
                this.f32934a.onSubchannelState(c5803u);
            }

            @Override // io.grpc.internal.C5739b0.l
            void d(C5739b0 c5739b0) {
                C5755j0.this.f32776I.remove(c5739b0);
                C5755j0.this.f32791X.removeSubchannel(c5739b0);
                C5755j0.this.C0();
            }
        }

        /* renamed from: io.grpc.internal.j0$z$b */
        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                z.this.f32929f.shutdown(C5755j0.f32764q0);
            }
        }

        z(AbstractC5714a0.b bVar) {
            e3.w.checkNotNull(bVar, "args");
            this.f32928e = bVar.getAddresses();
            if (C5755j0.this.f32798c != null) {
                bVar = bVar.toBuilder().setAddresses(a(bVar.getAddresses())).build();
            }
            this.f32924a = bVar;
            io.grpc.U uAllocate = io.grpc.U.allocate("Subchannel", C5755j0.this.authority());
            this.f32925b = uAllocate;
            C5769q c5769q = new C5769q(uAllocate, C5755j0.this.f32824s, C5755j0.this.f32823r.currentTimeNanos(), "Subchannel for " + bVar.getAddresses());
            this.f32927d = c5769q;
            this.f32926c = new C5767p(c5769q, C5755j0.this.f32823r);
        }

        private List a(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                io.grpc.C c9 = (io.grpc.C) it.next();
                arrayList.add(new io.grpc.C(c9.getAddresses(), c9.getAttributes().toBuilder().discard(io.grpc.C.ATTR_AUTHORITY_OVERRIDE).build()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // io.grpc.AbstractC5714a0.h
        public AbstractC5723f asChannel() {
            e3.w.checkState(this.f32930g, "not started");
            return new R0(this.f32929f, C5755j0.this.f32821p.a(), C5755j0.this.f32812j.getScheduledExecutorService(), C5755j0.this.f32787T.create(), new AtomicReference(null));
        }

        @Override // io.grpc.AbstractC5714a0.h
        public List<io.grpc.C> getAllAddresses() {
            C5755j0.this.f32825t.throwIfNotInThisSynchronizationContext();
            e3.w.checkState(this.f32930g, "not started");
            return this.f32928e;
        }

        @Override // io.grpc.AbstractC5714a0.h
        public C5713a getAttributes() {
            return this.f32924a.getAttributes();
        }

        @Override // io.grpc.AbstractC5714a0.h
        public AbstractC5727h getChannelLogger() {
            return this.f32926c;
        }

        @Override // io.grpc.AbstractC5714a0.h
        public Object getInternalSubchannel() {
            e3.w.checkState(this.f32930g, "Subchannel is not started");
            return this.f32929f;
        }

        @Override // io.grpc.AbstractC5714a0.h
        public void requestConnection() {
            C5755j0.this.f32825t.throwIfNotInThisSynchronizationContext();
            e3.w.checkState(this.f32930g, "not started");
            this.f32929f.obtainActiveTransport();
        }

        @Override // io.grpc.AbstractC5714a0.h
        public void shutdown() {
            N0.d dVar;
            C5755j0.this.f32825t.throwIfNotInThisSynchronizationContext();
            if (this.f32929f == null) {
                this.f32931h = true;
                return;
            }
            if (!this.f32931h) {
                this.f32931h = true;
            } else {
                if (!C5755j0.this.f32784Q || (dVar = this.f32932i) == null) {
                    return;
                }
                dVar.cancel();
                this.f32932i = null;
            }
            if (C5755j0.this.f32784Q) {
                this.f32929f.shutdown(C5755j0.f32763p0);
            } else {
                this.f32932i = C5755j0.this.f32825t.schedule(new RunnableC5749g0(new b()), 5L, TimeUnit.SECONDS, C5755j0.this.f32812j.getScheduledExecutorService());
            }
        }

        @Override // io.grpc.AbstractC5714a0.h
        public void start(AbstractC5714a0.j jVar) {
            C5755j0.this.f32825t.throwIfNotInThisSynchronizationContext();
            e3.w.checkState(!this.f32930g, "already started");
            e3.w.checkState(!this.f32931h, "already shutdown");
            e3.w.checkState(!C5755j0.this.f32784Q, "Channel is being terminated");
            this.f32930g = true;
            C5739b0 c5739b0 = new C5739b0(this.f32924a.getAddresses(), C5755j0.this.authority(), C5755j0.this.f32770C, C5755j0.this.f32768A, C5755j0.this.f32812j, C5755j0.this.f32812j.getScheduledExecutorService(), C5755j0.this.f32829x, C5755j0.this.f32825t, new a(jVar), C5755j0.this.f32791X, C5755j0.this.f32787T.create(), this.f32927d, this.f32925b, this.f32926c);
            C5755j0.this.f32789V.e(new O.c.b.a().setDescription("Child Subchannel started").setSeverity(O.c.b.EnumC0316b.CT_INFO).setTimestampNanos(C5755j0.this.f32823r.currentTimeNanos()).setSubchannelRef(c5739b0).build());
            this.f32929f = c5739b0;
            C5755j0.this.f32791X.addSubchannel(c5739b0);
            C5755j0.this.f32776I.add(c5739b0);
        }

        public String toString() {
            return this.f32925b.toString();
        }

        @Override // io.grpc.AbstractC5714a0.h
        public void updateAddresses(List<io.grpc.C> list) {
            C5755j0.this.f32825t.throwIfNotInThisSynchronizationContext();
            this.f32928e = list;
            if (C5755j0.this.f32798c != null) {
                list = a(list);
            }
            this.f32929f.updateAddresses(list);
        }
    }

    static {
        io.grpc.J0 j02 = io.grpc.J0.UNAVAILABLE;
        f32762o0 = j02.withDescription("Channel shutdownNow invoked");
        f32763p0 = j02.withDescription("Channel shutdown invoked");
        f32764q0 = j02.withDescription("Subchannel shutdown invoked");
        f32765r0 = C5762m0.a();
        f32766s0 = new C5756a();
        f32767t0 = new n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [io.grpc.f] */
    C5755j0(C5758k0 c5758k0, InterfaceC5778v interfaceC5778v, InterfaceC5757k.a aVar, InterfaceC5773s0 interfaceC5773s0, InterfaceC5355E interfaceC5355E, List list, S0 s02) {
        C5756a c5756a;
        io.grpc.N0 n02 = new io.grpc.N0(new l());
        this.f32825t = n02;
        this.f32831z = new C5784y();
        this.f32776I = new HashSet(16, 0.75f);
        this.f32778K = new Object();
        this.f32779L = new HashSet(1, 0.75f);
        C5756a c5756a2 = null;
        this.f32781N = new A(this, c5756a2);
        this.f32782O = new AtomicBoolean(false);
        this.f32786S = new CountDownLatch(1);
        this.f32793Z = x.NO_RESOLUTION;
        this.f32795a0 = f32765r0;
        this.f32799c0 = false;
        this.f32803e0 = new C0.u();
        q qVar = new q(this, c5756a2);
        this.f32811i0 = qVar;
        this.f32813j0 = new s(this, c5756a2);
        this.f32815k0 = new o(this, c5756a2);
        String str = (String) e3.w.checkNotNull(c5758k0.f32958f, "target");
        this.f32796b = str;
        io.grpc.U uAllocate = io.grpc.U.allocate("Channel", str);
        this.f32794a = uAllocate;
        this.f32823r = (S0) e3.w.checkNotNull(s02, "timeProvider");
        InterfaceC5773s0 interfaceC5773s02 = (InterfaceC5773s0) e3.w.checkNotNull(c5758k0.f32953a, "executorPool");
        this.f32819n = interfaceC5773s02;
        Executor executor = (Executor) e3.w.checkNotNull((Executor) interfaceC5773s02.getObject(), "executor");
        this.f32818m = executor;
        this.f32810i = c5758k0.f32959g;
        this.f32808h = interfaceC5778v;
        r rVar = new r((InterfaceC5773s0) e3.w.checkNotNull(c5758k0.f32954b, "offloadExecutorPool"));
        this.f32822q = rVar;
        C5763n c5763n = new C5763n(interfaceC5778v, c5758k0.f32960h, rVar);
        this.f32812j = c5763n;
        this.f32814k = new C5763n(interfaceC5778v, null, rVar);
        y yVar = new y(c5763n.getScheduledExecutorService(), c5756a2);
        this.f32816l = yVar;
        this.f32824s = c5758k0.f32975w;
        C5769q c5769q = new C5769q(uAllocate, c5758k0.f32975w, s02.currentTimeNanos(), "Channel for '" + str + "'");
        this.f32789V = c5769q;
        C5767p c5767p = new C5767p(c5769q, s02);
        this.f32790W = c5767p;
        io.grpc.s0 s0Var = c5758k0.f32943A;
        s0Var = s0Var == null ? U.DEFAULT_PROXY_DETECTOR : s0Var;
        boolean z8 = c5758k0.f32973u;
        this.f32809h0 = z8;
        C5754j c5754j = new C5754j(c5758k0.f32964l);
        this.f32806g = c5754j;
        this.f32800d = c5758k0.f32956d;
        H0 h02 = new H0(z8, c5758k0.f32969q, c5758k0.f32970r, c5754j);
        String str2 = c5758k0.f32963k;
        this.f32798c = str2;
        AbstractC5787j0.b bVarBuild = AbstractC5787j0.b.newBuilder().setDefaultPort(c5758k0.e()).setProxyDetector(s0Var).setSynchronizationContext(n02).setScheduledExecutorService(yVar).setServiceConfigParser(h02).setChannelLogger(c5767p).setOffloadExecutor(rVar).setOverrideAuthority(str2).build();
        this.f32804f = bVarBuild;
        AbstractC5787j0.d dVar = c5758k0.f32957e;
        this.f32802e = dVar;
        this.f32771D = z0(str, str2, dVar, bVarBuild);
        this.f32820o = (InterfaceC5773s0) e3.w.checkNotNull(interfaceC5773s0, "balancerRpcExecutorPool");
        this.f32821p = new r(interfaceC5773s0);
        C c9 = new C(executor, n02);
        this.f32780M = c9;
        c9.start(qVar);
        this.f32768A = aVar;
        Map<String, ?> map = c5758k0.f32976x;
        if (map != null) {
            AbstractC5787j0.c serviceConfig = h02.parseServiceConfig(map);
            e3.w.checkState(serviceConfig.getError() == null, "Default config is invalid: %s", serviceConfig.getError());
            C5762m0 c5762m0 = (C5762m0) serviceConfig.getConfig();
            this.f32797b0 = c5762m0;
            this.f32795a0 = c5762m0;
            c5756a = null;
        } else {
            c5756a = null;
            this.f32797b0 = null;
        }
        boolean z9 = c5758k0.f32977y;
        this.f32801d0 = z9;
        w wVar = new w(this, this.f32771D.getServiceAuthority(), c5756a);
        this.f32792Y = wVar;
        AbstractC5715b abstractC5715b = c5758k0.f32978z;
        this.f32769B = AbstractC5792m.intercept(abstractC5715b != null ? abstractC5715b.wrapChannel(wVar) : wVar, (List<? extends InterfaceC5788k>) list);
        this.f32829x = (InterfaceC5355E) e3.w.checkNotNull(interfaceC5355E, "stopwatchSupplier");
        long j8 = c5758k0.f32968p;
        if (j8 == -1) {
            this.f32830y = j8;
        } else {
            e3.w.checkArgument(j8 >= C5758k0.f32939M, "invalid idleTimeoutMillis %s", j8);
            this.f32830y = c5758k0.f32968p;
        }
        this.f32817l0 = new B0(new t(this, null), n02, c5763n.getScheduledExecutorService(), (C5353C) interfaceC5355E.get());
        this.f32826u = c5758k0.f32965m;
        this.f32827v = (C5808z) e3.w.checkNotNull(c5758k0.f32966n, "decompressorRegistry");
        this.f32828w = (C5801s) e3.w.checkNotNull(c5758k0.f32967o, "compressorRegistry");
        this.f32770C = c5758k0.f32962j;
        this.f32807g0 = c5758k0.f32971s;
        this.f32805f0 = c5758k0.f32972t;
        c cVar = new c(s02);
        this.f32787T = cVar;
        this.f32788U = cVar.create();
        io.grpc.O o8 = (io.grpc.O) e3.w.checkNotNull(c5758k0.f32974v);
        this.f32791X = o8;
        o8.addRootChannel(this);
        if (z9) {
            return;
        }
        if (this.f32797b0 != null) {
            c5767p.log(AbstractC5727h.a.INFO, "Service config look-up disabled, using default service config");
        }
        this.f32799c0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(C5803u c5803u) {
        if (c5803u.getState() == EnumC5802t.TRANSIENT_FAILURE || c5803u.getState() == EnumC5802t.IDLE) {
            E0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        if (this.f32783P) {
            Iterator it = this.f32776I.iterator();
            while (it.hasNext()) {
                ((C5739b0) it.next()).shutdownNow(f32762o0);
            }
            Iterator it2 = this.f32779L.iterator();
            while (it2.hasNext()) {
                ((C5775t0) it2.next()).c().shutdownNow(f32762o0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        if (!this.f32785R && this.f32782O.get() && this.f32776I.isEmpty() && this.f32779L.isEmpty()) {
            this.f32790W.log(AbstractC5727h.a.INFO, "Terminated");
            this.f32791X.removeRootChannel(this);
            this.f32819n.returnObject(this.f32818m);
            this.f32821p.b();
            this.f32822q.b();
            this.f32812j.close();
            this.f32785R = true;
            this.f32786S.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        this.f32825t.throwIfNotInThisSynchronizationContext();
        if (this.f32772E) {
            this.f32771D.refresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        long j8 = this.f32830y;
        if (j8 == -1) {
            return;
        }
        this.f32817l0.k(j8, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(boolean z8) {
        this.f32825t.throwIfNotInThisSynchronizationContext();
        if (z8) {
            e3.w.checkState(this.f32772E, "nameResolver is not started");
            e3.w.checkState(this.f32773F != null, "lbHelper is null");
        }
        AbstractC5787j0 abstractC5787j0 = this.f32771D;
        if (abstractC5787j0 != null) {
            abstractC5787j0.shutdown();
            this.f32772E = false;
            if (z8) {
                this.f32771D = z0(this.f32796b, this.f32798c, this.f32802e, this.f32804f);
            } else {
                this.f32771D = null;
            }
        }
        u uVar = this.f32773F;
        if (uVar != null) {
            uVar.f32879a.c();
            this.f32773F = null;
        }
        this.f32774G = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(AbstractC5714a0.i iVar) {
        this.f32774G = iVar;
        this.f32780M.k(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(boolean z8) {
        this.f32817l0.i(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        G0(true);
        this.f32780M.k(null);
        this.f32790W.log(AbstractC5727h.a.INFO, "Entering IDLE state");
        this.f32831z.b(EnumC5802t.IDLE);
        if (this.f32813j0.anyObjectInUse(this.f32778K, this.f32780M)) {
            w0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Executor x0(C5721e c5721e) {
        Executor executor = c5721e.getExecutor();
        return executor == null ? this.f32818m : executor;
    }

    private static AbstractC5787j0 y0(String str, AbstractC5787j0.d dVar, AbstractC5787j0.b bVar) {
        URI uri;
        AbstractC5787j0 abstractC5787j0NewNameResolver;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e8) {
            sb.append(e8.getMessage());
            uri = null;
        }
        if (uri != null && (abstractC5787j0NewNameResolver = dVar.newNameResolver(uri, bVar)) != null) {
            return abstractC5787j0NewNameResolver;
        }
        String str2 = "";
        if (!f32761n0.matcher(str).matches()) {
            try {
                AbstractC5787j0 abstractC5787j0NewNameResolver2 = dVar.newNameResolver(new URI(dVar.getDefaultScheme(), "", "/" + str, null), bVar);
                if (abstractC5787j0NewNameResolver2 != null) {
                    return abstractC5787j0NewNameResolver2;
                }
            } catch (URISyntaxException e9) {
                throw new IllegalArgumentException(e9);
            }
        }
        if (sb.length() > 0) {
            str2 = " (" + ((Object) sb) + ")";
        }
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", str, str2));
    }

    static AbstractC5787j0 z0(String str, String str2, AbstractC5787j0.d dVar, AbstractC5787j0.b bVar) {
        F0 f02 = new F0(y0(str, dVar, bVar), new C5761m(new G.a(), bVar.getScheduledExecutorService(), bVar.getSynchronizationContext()), bVar.getSynchronizationContext());
        return str2 == null ? f02 : new m(f02, str2);
    }

    void D0(Throwable th) {
        if (this.f32775H) {
            return;
        }
        this.f32775H = true;
        u0(true);
        G0(false);
        H0(new e(th));
        this.f32792Y.h(null);
        this.f32790W.log(AbstractC5727h.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        this.f32831z.b(EnumC5802t.TRANSIENT_FAILURE);
    }

    @Override // io.grpc.AbstractC5723f
    public String authority() {
        return this.f32769B.authority();
    }

    @Override // io.grpc.AbstractC5720d0
    public boolean awaitTermination(long j8, TimeUnit timeUnit) {
        return this.f32786S.await(j8, timeUnit);
    }

    @Override // io.grpc.AbstractC5720d0
    public void enterIdle() {
        this.f32825t.execute(new f());
    }

    @Override // io.grpc.T, io.grpc.Y
    public io.grpc.U getLogId() {
        return this.f32794a;
    }

    @Override // io.grpc.AbstractC5720d0
    public EnumC5802t getState(boolean z8) {
        EnumC5802t enumC5802tA = this.f32831z.a();
        if (z8 && enumC5802tA == EnumC5802t.IDLE) {
            this.f32825t.execute(new g());
        }
        return enumC5802tA;
    }

    @Override // io.grpc.T
    public com.google.common.util.concurrent.C getStats() {
        com.google.common.util.concurrent.M mCreate = com.google.common.util.concurrent.M.create();
        this.f32825t.execute(new k(mCreate));
        return mCreate;
    }

    @Override // io.grpc.AbstractC5720d0
    public boolean isShutdown() {
        return this.f32782O.get();
    }

    @Override // io.grpc.AbstractC5720d0
    public boolean isTerminated() {
        return this.f32785R;
    }

    @Override // io.grpc.AbstractC5723f
    public <ReqT, RespT> AbstractC5786j newCall(C5730i0 c5730i0, C5721e c5721e) {
        return this.f32769B.newCall(c5730i0, c5721e);
    }

    @Override // io.grpc.AbstractC5720d0
    public void notifyWhenStateChanged(EnumC5802t enumC5802t, Runnable runnable) {
        this.f32825t.execute(new d(runnable, enumC5802t));
    }

    @Override // io.grpc.AbstractC5720d0
    public void resetConnectBackoff() {
        this.f32825t.execute(new h());
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("logId", this.f32794a.getId()).add("target", this.f32796b).toString();
    }

    void w0() {
        this.f32825t.throwIfNotInThisSynchronizationContext();
        if (this.f32782O.get() || this.f32775H) {
            return;
        }
        if (this.f32813j0.isInUse()) {
            u0(false);
        } else {
            F0();
        }
        if (this.f32773F != null) {
            return;
        }
        this.f32790W.log(AbstractC5727h.a.INFO, "Exiting idle mode");
        u uVar = new u(this, null);
        uVar.f32879a = this.f32806g.newLoadBalancer(uVar);
        this.f32773F = uVar;
        this.f32771D.start((AbstractC5787j0.e) new v(uVar, this.f32771D));
        this.f32772E = true;
    }

    @Override // io.grpc.AbstractC5720d0
    public C5755j0 shutdown() {
        this.f32790W.log(AbstractC5727h.a.DEBUG, "shutdown() called");
        if (!this.f32782O.compareAndSet(false, true)) {
            return this;
        }
        this.f32825t.execute(new i());
        this.f32792Y.f();
        this.f32825t.execute(new b());
        return this;
    }

    @Override // io.grpc.AbstractC5720d0
    public C5755j0 shutdownNow() {
        this.f32790W.log(AbstractC5727h.a.DEBUG, "shutdownNow() called");
        shutdown();
        this.f32792Y.g();
        this.f32825t.execute(new j());
        return this;
    }

    /* renamed from: io.grpc.internal.j0$A */
    private final class A {

        /* renamed from: a, reason: collision with root package name */
        final Object f32832a;

        /* renamed from: b, reason: collision with root package name */
        Collection f32833b;

        /* renamed from: c, reason: collision with root package name */
        io.grpc.J0 f32834c;

        private A() {
            this.f32832a = new Object();
            this.f32833b = new HashSet();
        }

        io.grpc.J0 a(C0 c02) {
            synchronized (this.f32832a) {
                try {
                    io.grpc.J0 j02 = this.f32834c;
                    if (j02 != null) {
                        return j02;
                    }
                    this.f32833b.add(c02);
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void b(io.grpc.J0 j02) {
            synchronized (this.f32832a) {
                try {
                    if (this.f32834c != null) {
                        return;
                    }
                    this.f32834c = j02;
                    boolean zIsEmpty = this.f32833b.isEmpty();
                    if (zIsEmpty) {
                        C5755j0.this.f32780M.shutdown(j02);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void c(io.grpc.J0 j02) {
            ArrayList arrayList;
            b(j02);
            synchronized (this.f32832a) {
                arrayList = new ArrayList(this.f32833b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC5772s) it.next()).cancel(j02);
            }
            C5755j0.this.f32780M.shutdownNow(j02);
        }

        void d(C0 c02) {
            io.grpc.J0 j02;
            synchronized (this.f32832a) {
                try {
                    this.f32833b.remove(c02);
                    if (this.f32833b.isEmpty()) {
                        j02 = this.f32834c;
                        this.f32833b = new HashSet();
                    } else {
                        j02 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (j02 != null) {
                C5755j0.this.f32780M.shutdown(j02);
            }
        }

        /* synthetic */ A(C5755j0 c5755j0, C5756a c5756a) {
            this();
        }
    }
}
