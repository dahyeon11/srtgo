package io.grpc.internal;

import e3.C5353C;
import e3.InterfaceC5355E;
import io.grpc.AbstractC5727h;
import io.grpc.AbstractC5794n;
import io.grpc.C5713a;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.C5803u;
import io.grpc.EnumC5802t;
import io.grpc.N0;
import io.grpc.O;
import io.grpc.internal.InterfaceC5757k;
import io.grpc.internal.InterfaceC5764n0;
import io.grpc.internal.InterfaceC5774t;
import io.grpc.internal.InterfaceC5778v;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5739b0 implements io.grpc.T, U0 {

    /* renamed from: a, reason: collision with root package name */
    private final io.grpc.U f32625a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32626b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32627c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5757k.a f32628d;

    /* renamed from: e, reason: collision with root package name */
    private final l f32629e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC5778v f32630f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f32631g;

    /* renamed from: h, reason: collision with root package name */
    private final io.grpc.O f32632h;

    /* renamed from: i, reason: collision with root package name */
    private final C5765o f32633i;

    /* renamed from: j, reason: collision with root package name */
    private final C5769q f32634j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC5727h f32635k;

    /* renamed from: l, reason: collision with root package name */
    private final io.grpc.N0 f32636l;

    /* renamed from: m, reason: collision with root package name */
    private final m f32637m;

    /* renamed from: n, reason: collision with root package name */
    private volatile List f32638n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC5757k f32639o;

    /* renamed from: p, reason: collision with root package name */
    private final C5353C f32640p;

    /* renamed from: q, reason: collision with root package name */
    private N0.d f32641q;

    /* renamed from: r, reason: collision with root package name */
    private N0.d f32642r;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC5764n0 f32643s;

    /* renamed from: v, reason: collision with root package name */
    private InterfaceC5782x f32646v;

    /* renamed from: w, reason: collision with root package name */
    private volatile InterfaceC5764n0 f32647w;

    /* renamed from: y, reason: collision with root package name */
    private io.grpc.J0 f32649y;

    /* renamed from: t, reason: collision with root package name */
    private final Collection f32644t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    private final Z f32645u = new a();

    /* renamed from: x, reason: collision with root package name */
    private volatile C5803u f32648x = C5803u.forNonError(EnumC5802t.IDLE);

    /* renamed from: io.grpc.internal.b0$a */
    class a extends Z {
        a() {
        }

        @Override // io.grpc.internal.Z
        protected void a() {
            C5739b0.this.f32629e.a(C5739b0.this);
        }

        @Override // io.grpc.internal.Z
        protected void b() {
            C5739b0.this.f32629e.b(C5739b0.this);
        }
    }

    /* renamed from: io.grpc.internal.b0$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5739b0.this.f32641q = null;
            C5739b0.this.f32635k.log(AbstractC5727h.a.INFO, "CONNECTING after backoff");
            C5739b0.this.L(EnumC5802t.CONNECTING);
            C5739b0.this.S();
        }
    }

    /* renamed from: io.grpc.internal.b0$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5739b0.this.f32648x.getState() == EnumC5802t.IDLE) {
                C5739b0.this.f32635k.log(AbstractC5727h.a.INFO, "CONNECTING as requested");
                C5739b0.this.L(EnumC5802t.CONNECTING);
                C5739b0.this.S();
            }
        }
    }

    /* renamed from: io.grpc.internal.b0$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5739b0.this.f32648x.getState() != EnumC5802t.TRANSIENT_FAILURE) {
                return;
            }
            C5739b0.this.F();
            C5739b0.this.f32635k.log(AbstractC5727h.a.INFO, "CONNECTING; backoff interrupted");
            C5739b0.this.L(EnumC5802t.CONNECTING);
            C5739b0.this.S();
        }
    }

    /* renamed from: io.grpc.internal.b0$e */
    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f32654a;

        /* renamed from: io.grpc.internal.b0$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC5764n0 interfaceC5764n0 = C5739b0.this.f32643s;
                C5739b0.this.f32642r = null;
                C5739b0.this.f32643s = null;
                interfaceC5764n0.shutdown(io.grpc.J0.UNAVAILABLE.withDescription("InternalSubchannel closed transport due to address change"));
            }
        }

        e(List list) {
            this.f32654a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC5764n0 interfaceC5764n0;
            SocketAddress currentAddress = C5739b0.this.f32637m.getCurrentAddress();
            C5739b0.this.f32637m.updateGroups(this.f32654a);
            C5739b0.this.f32638n = this.f32654a;
            EnumC5802t state = C5739b0.this.f32648x.getState();
            EnumC5802t enumC5802t = EnumC5802t.READY;
            if ((state != enumC5802t && C5739b0.this.f32648x.getState() != EnumC5802t.CONNECTING) || C5739b0.this.f32637m.seekTo(currentAddress)) {
                interfaceC5764n0 = null;
            } else if (C5739b0.this.f32648x.getState() == enumC5802t) {
                interfaceC5764n0 = C5739b0.this.f32647w;
                C5739b0.this.f32647w = null;
                C5739b0.this.f32637m.reset();
                C5739b0.this.L(EnumC5802t.IDLE);
            } else {
                C5739b0.this.f32646v.shutdown(io.grpc.J0.UNAVAILABLE.withDescription("InternalSubchannel closed pending transport due to address change"));
                C5739b0.this.f32646v = null;
                C5739b0.this.f32637m.reset();
                C5739b0.this.S();
                interfaceC5764n0 = null;
            }
            if (interfaceC5764n0 != null) {
                if (C5739b0.this.f32642r != null) {
                    C5739b0.this.f32643s.shutdown(io.grpc.J0.UNAVAILABLE.withDescription("InternalSubchannel closed transport early due to address change"));
                    C5739b0.this.f32642r.cancel();
                    C5739b0.this.f32642r = null;
                    C5739b0.this.f32643s = null;
                }
                C5739b0.this.f32643s = interfaceC5764n0;
                C5739b0 c5739b0 = C5739b0.this;
                c5739b0.f32642r = c5739b0.f32636l.schedule(new a(), 5L, TimeUnit.SECONDS, C5739b0.this.f32631g);
            }
        }
    }

    /* renamed from: io.grpc.internal.b0$f */
    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.J0 f32657a;

        f(io.grpc.J0 j02) {
            this.f32657a = j02;
        }

        @Override // java.lang.Runnable
        public void run() {
            EnumC5802t state = C5739b0.this.f32648x.getState();
            EnumC5802t enumC5802t = EnumC5802t.SHUTDOWN;
            if (state == enumC5802t) {
                return;
            }
            C5739b0.this.f32649y = this.f32657a;
            InterfaceC5764n0 interfaceC5764n0 = C5739b0.this.f32647w;
            InterfaceC5782x interfaceC5782x = C5739b0.this.f32646v;
            C5739b0.this.f32647w = null;
            C5739b0.this.f32646v = null;
            C5739b0.this.L(enumC5802t);
            C5739b0.this.f32637m.reset();
            if (C5739b0.this.f32644t.isEmpty()) {
                C5739b0.this.N();
            }
            C5739b0.this.F();
            if (C5739b0.this.f32642r != null) {
                C5739b0.this.f32642r.cancel();
                C5739b0.this.f32643s.shutdown(this.f32657a);
                C5739b0.this.f32642r = null;
                C5739b0.this.f32643s = null;
            }
            if (interfaceC5764n0 != null) {
                interfaceC5764n0.shutdown(this.f32657a);
            }
            if (interfaceC5782x != null) {
                interfaceC5782x.shutdown(this.f32657a);
            }
        }
    }

    /* renamed from: io.grpc.internal.b0$g */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5739b0.this.f32635k.log(AbstractC5727h.a.INFO, "Terminated");
            C5739b0.this.f32629e.d(C5739b0.this);
        }
    }

    /* renamed from: io.grpc.internal.b0$h */
    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5782x f32660a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f32661b;

        h(InterfaceC5782x interfaceC5782x, boolean z8) {
            this.f32660a = interfaceC5782x;
            this.f32661b = z8;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5739b0.this.f32645u.updateObjectInUse(this.f32660a, this.f32661b);
        }
    }

    /* renamed from: io.grpc.internal.b0$i */
    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.grpc.J0 f32663a;

        i(io.grpc.J0 j02) {
            this.f32663a = j02;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(C5739b0.this.f32644t).iterator();
            while (it.hasNext()) {
                ((InterfaceC5764n0) it.next()).shutdownNow(this.f32663a);
            }
        }
    }

    /* renamed from: io.grpc.internal.b0$j */
    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.M f32665a;

        j(com.google.common.util.concurrent.M m8) {
            this.f32665a = m8;
        }

        @Override // java.lang.Runnable
        public void run() {
            O.b.a aVar = new O.b.a();
            List<io.grpc.C> groups = C5739b0.this.f32637m.getGroups();
            ArrayList arrayList = new ArrayList(C5739b0.this.f32644t);
            aVar.setTarget(groups.toString()).setState(C5739b0.this.J());
            aVar.setSockets(arrayList);
            C5739b0.this.f32633i.a(aVar);
            C5739b0.this.f32634j.g(aVar);
            this.f32665a.set(aVar.build());
        }
    }

    /* renamed from: io.grpc.internal.b0$k */
    static final class k extends M {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5782x f32667a;

        /* renamed from: b, reason: collision with root package name */
        private final C5765o f32668b;

        /* renamed from: io.grpc.internal.b0$k$a */
        class a extends K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772s f32669a;

            /* renamed from: io.grpc.internal.b0$k$a$a, reason: collision with other inner class name */
            class C0321a extends L {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC5774t f32671a;

                C0321a(InterfaceC5774t interfaceC5774t) {
                    this.f32671a = interfaceC5774t;
                }

                @Override // io.grpc.internal.L
                protected InterfaceC5774t a() {
                    return this.f32671a;
                }

                @Override // io.grpc.internal.L, io.grpc.internal.InterfaceC5774t
                public void closed(io.grpc.J0 j02, InterfaceC5774t.a aVar, C5728h0 c5728h0) {
                    k.this.f32668b.reportCallEnded(j02.isOk());
                    super.closed(j02, aVar, c5728h0);
                }
            }

            a(InterfaceC5772s interfaceC5772s) {
                this.f32669a = interfaceC5772s;
            }

            @Override // io.grpc.internal.K
            protected InterfaceC5772s a() {
                return this.f32669a;
            }

            @Override // io.grpc.internal.K, io.grpc.internal.InterfaceC5772s
            public void start(InterfaceC5774t interfaceC5774t) {
                k.this.f32668b.reportCallStarted();
                super.start(new C0321a(interfaceC5774t));
            }
        }

        /* synthetic */ k(InterfaceC5782x interfaceC5782x, C5765o c5765o, a aVar) {
            this(interfaceC5782x, c5765o);
        }

        @Override // io.grpc.internal.M
        protected InterfaceC5782x a() {
            return this.f32667a;
        }

        @Override // io.grpc.internal.M, io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u
        public InterfaceC5772s newStream(C5730i0 c5730i0, C5728h0 c5728h0, C5721e c5721e, AbstractC5794n[] abstractC5794nArr) {
            return new a(super.newStream(c5730i0, c5728h0, c5721e, abstractC5794nArr));
        }

        private k(InterfaceC5782x interfaceC5782x, C5765o c5765o) {
            this.f32667a = interfaceC5782x;
            this.f32668b = c5765o;
        }
    }

    /* renamed from: io.grpc.internal.b0$l */
    static abstract class l {
        l() {
        }

        void a(C5739b0 c5739b0) {
        }

        void b(C5739b0 c5739b0) {
        }

        abstract void c(C5739b0 c5739b0, C5803u c5803u);

        abstract void d(C5739b0 c5739b0);
    }

    /* renamed from: io.grpc.internal.b0$m */
    static final class m {

        /* renamed from: a, reason: collision with root package name */
        private List f32673a;

        /* renamed from: b, reason: collision with root package name */
        private int f32674b;

        /* renamed from: c, reason: collision with root package name */
        private int f32675c;

        public m(List<io.grpc.C> list) {
            this.f32673a = list;
        }

        public SocketAddress getCurrentAddress() {
            return ((io.grpc.C) this.f32673a.get(this.f32674b)).getAddresses().get(this.f32675c);
        }

        public C5713a getCurrentEagAttributes() {
            return ((io.grpc.C) this.f32673a.get(this.f32674b)).getAttributes();
        }

        public List<io.grpc.C> getGroups() {
            return this.f32673a;
        }

        public void increment() {
            io.grpc.C c9 = (io.grpc.C) this.f32673a.get(this.f32674b);
            int i8 = this.f32675c + 1;
            this.f32675c = i8;
            if (i8 >= c9.getAddresses().size()) {
                this.f32674b++;
                this.f32675c = 0;
            }
        }

        public boolean isAtBeginning() {
            return this.f32674b == 0 && this.f32675c == 0;
        }

        public boolean isValid() {
            return this.f32674b < this.f32673a.size();
        }

        public void reset() {
            this.f32674b = 0;
            this.f32675c = 0;
        }

        public boolean seekTo(SocketAddress socketAddress) {
            for (int i8 = 0; i8 < this.f32673a.size(); i8++) {
                int iIndexOf = ((io.grpc.C) this.f32673a.get(i8)).getAddresses().indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.f32674b = i8;
                    this.f32675c = iIndexOf;
                    return true;
                }
            }
            return false;
        }

        public void updateGroups(List<io.grpc.C> list) {
            this.f32673a = list;
            reset();
        }
    }

    /* renamed from: io.grpc.internal.b0$n */
    private class n implements InterfaceC5764n0.a {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5782x f32676a;

        /* renamed from: b, reason: collision with root package name */
        boolean f32677b = false;

        /* renamed from: io.grpc.internal.b0$n$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5739b0.this.f32639o = null;
                if (C5739b0.this.f32649y != null) {
                    e3.w.checkState(C5739b0.this.f32647w == null, "Unexpected non-null activeTransport");
                    n nVar = n.this;
                    nVar.f32676a.shutdown(C5739b0.this.f32649y);
                    return;
                }
                InterfaceC5782x interfaceC5782x = C5739b0.this.f32646v;
                n nVar2 = n.this;
                InterfaceC5782x interfaceC5782x2 = nVar2.f32676a;
                if (interfaceC5782x == interfaceC5782x2) {
                    C5739b0.this.f32647w = interfaceC5782x2;
                    C5739b0.this.f32646v = null;
                    C5739b0.this.L(EnumC5802t.READY);
                }
            }
        }

        /* renamed from: io.grpc.internal.b0$n$b */
        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.grpc.J0 f32680a;

            b(io.grpc.J0 j02) {
                this.f32680a = j02;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C5739b0.this.f32648x.getState() == EnumC5802t.SHUTDOWN) {
                    return;
                }
                InterfaceC5764n0 interfaceC5764n0 = C5739b0.this.f32647w;
                n nVar = n.this;
                if (interfaceC5764n0 == nVar.f32676a) {
                    C5739b0.this.f32647w = null;
                    C5739b0.this.f32637m.reset();
                    C5739b0.this.L(EnumC5802t.IDLE);
                    return;
                }
                InterfaceC5782x interfaceC5782x = C5739b0.this.f32646v;
                n nVar2 = n.this;
                if (interfaceC5782x == nVar2.f32676a) {
                    e3.w.checkState(C5739b0.this.f32648x.getState() == EnumC5802t.CONNECTING, "Expected state is CONNECTING, actual state is %s", C5739b0.this.f32648x.getState());
                    C5739b0.this.f32637m.increment();
                    if (C5739b0.this.f32637m.isValid()) {
                        C5739b0.this.S();
                        return;
                    }
                    C5739b0.this.f32646v = null;
                    C5739b0.this.f32637m.reset();
                    C5739b0.this.R(this.f32680a);
                }
            }
        }

        /* renamed from: io.grpc.internal.b0$n$c */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5739b0.this.f32644t.remove(n.this.f32676a);
                if (C5739b0.this.f32648x.getState() == EnumC5802t.SHUTDOWN && C5739b0.this.f32644t.isEmpty()) {
                    C5739b0.this.N();
                }
            }
        }

        n(InterfaceC5782x interfaceC5782x) {
            this.f32676a = interfaceC5782x;
        }

        @Override // io.grpc.internal.InterfaceC5764n0.a
        public void transportInUse(boolean z8) {
            C5739b0.this.O(this.f32676a, z8);
        }

        @Override // io.grpc.internal.InterfaceC5764n0.a
        public void transportReady() {
            C5739b0.this.f32635k.log(AbstractC5727h.a.INFO, "READY");
            C5739b0.this.f32636l.execute(new a());
        }

        @Override // io.grpc.internal.InterfaceC5764n0.a
        public void transportShutdown(io.grpc.J0 j02) {
            C5739b0.this.f32635k.log(AbstractC5727h.a.INFO, "{0} SHUTDOWN with {1}", this.f32676a.getLogId(), C5739b0.this.P(j02));
            this.f32677b = true;
            C5739b0.this.f32636l.execute(new b(j02));
        }

        @Override // io.grpc.internal.InterfaceC5764n0.a
        public void transportTerminated() {
            e3.w.checkState(this.f32677b, "transportShutdown() must be called before transportTerminated().");
            C5739b0.this.f32635k.log(AbstractC5727h.a.INFO, "{0} Terminated", this.f32676a.getLogId());
            C5739b0.this.f32632h.removeClientSocket(this.f32676a);
            C5739b0.this.O(this.f32676a, false);
            C5739b0.this.f32636l.execute(new c());
        }
    }

    /* renamed from: io.grpc.internal.b0$o */
    static final class o extends AbstractC5727h {

        /* renamed from: a, reason: collision with root package name */
        io.grpc.U f32683a;

        o() {
        }

        @Override // io.grpc.AbstractC5727h
        public void log(AbstractC5727h.a aVar, String str) {
            C5767p.b(this.f32683a, aVar, str);
        }

        @Override // io.grpc.AbstractC5727h
        public void log(AbstractC5727h.a aVar, String str, Object... objArr) {
            C5767p.c(this.f32683a, aVar, str, objArr);
        }
    }

    C5739b0(List list, String str, String str2, InterfaceC5757k.a aVar, InterfaceC5778v interfaceC5778v, ScheduledExecutorService scheduledExecutorService, InterfaceC5355E interfaceC5355E, io.grpc.N0 n02, l lVar, io.grpc.O o8, C5765o c5765o, C5769q c5769q, io.grpc.U u8, AbstractC5727h abstractC5727h) {
        e3.w.checkNotNull(list, "addressGroups");
        e3.w.checkArgument(!list.isEmpty(), "addressGroups is empty");
        G(list, "addressGroups contains null entry");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f32638n = listUnmodifiableList;
        this.f32637m = new m(listUnmodifiableList);
        this.f32626b = str;
        this.f32627c = str2;
        this.f32628d = aVar;
        this.f32630f = interfaceC5778v;
        this.f32631g = scheduledExecutorService;
        this.f32640p = (C5353C) interfaceC5355E.get();
        this.f32636l = n02;
        this.f32629e = lVar;
        this.f32632h = o8;
        this.f32633i = c5765o;
        this.f32634j = (C5769q) e3.w.checkNotNull(c5769q, "channelTracer");
        this.f32625a = (io.grpc.U) e3.w.checkNotNull(u8, "logId");
        this.f32635k = (AbstractC5727h) e3.w.checkNotNull(abstractC5727h, "channelLogger");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        this.f32636l.throwIfNotInThisSynchronizationContext();
        N0.d dVar = this.f32641q;
        if (dVar != null) {
            dVar.cancel();
            this.f32641q = null;
            this.f32639o = null;
        }
    }

    private static void G(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3.w.checkNotNull(it.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(EnumC5802t enumC5802t) {
        this.f32636l.throwIfNotInThisSynchronizationContext();
        M(C5803u.forNonError(enumC5802t));
    }

    private void M(C5803u c5803u) {
        this.f32636l.throwIfNotInThisSynchronizationContext();
        if (this.f32648x.getState() != c5803u.getState()) {
            e3.w.checkState(this.f32648x.getState() != EnumC5802t.SHUTDOWN, "Cannot transition out of SHUTDOWN to " + c5803u);
            this.f32648x = c5803u;
            this.f32629e.c(this, c5803u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        this.f32636l.execute(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(InterfaceC5782x interfaceC5782x, boolean z8) {
        this.f32636l.execute(new h(interfaceC5782x, z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String P(io.grpc.J0 j02) {
        StringBuilder sb = new StringBuilder();
        sb.append(j02.getCode());
        if (j02.getDescription() != null) {
            sb.append("(");
            sb.append(j02.getDescription());
            sb.append(")");
        }
        if (j02.getCause() != null) {
            sb.append("[");
            sb.append(j02.getCause());
            sb.append("]");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(io.grpc.J0 j02) {
        this.f32636l.throwIfNotInThisSynchronizationContext();
        M(C5803u.forTransientFailure(j02));
        if (this.f32639o == null) {
            this.f32639o = this.f32628d.get();
        }
        long jNextBackoffNanos = this.f32639o.nextBackoffNanos();
        C5353C c5353c = this.f32640p;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jElapsed = jNextBackoffNanos - c5353c.elapsed(timeUnit);
        this.f32635k.log(AbstractC5727h.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", P(j02), Long.valueOf(jElapsed));
        e3.w.checkState(this.f32641q == null, "previous reconnectTask is not done");
        this.f32641q = this.f32636l.schedule(new b(), jElapsed, timeUnit, this.f32631g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        SocketAddress targetAddress;
        io.grpc.M m8;
        this.f32636l.throwIfNotInThisSynchronizationContext();
        e3.w.checkState(this.f32641q == null, "Should have no reconnectTask scheduled");
        if (this.f32637m.isAtBeginning()) {
            this.f32640p.reset().start();
        }
        SocketAddress currentAddress = this.f32637m.getCurrentAddress();
        a aVar = null;
        if (currentAddress instanceof io.grpc.M) {
            m8 = (io.grpc.M) currentAddress;
            targetAddress = m8.getTargetAddress();
        } else {
            targetAddress = currentAddress;
            m8 = null;
        }
        C5713a currentEagAttributes = this.f32637m.getCurrentEagAttributes();
        String str = (String) currentEagAttributes.get(io.grpc.C.ATTR_AUTHORITY_OVERRIDE);
        InterfaceC5778v.a aVar2 = new InterfaceC5778v.a();
        if (str == null) {
            str = this.f32626b;
        }
        InterfaceC5778v.a httpConnectProxiedSocketAddress = aVar2.setAuthority(str).setEagAttributes(currentEagAttributes).setUserAgent(this.f32627c).setHttpConnectProxiedSocketAddress(m8);
        o oVar = new o();
        oVar.f32683a = getLogId();
        k kVar = new k(this.f32630f.newClientTransport(targetAddress, httpConnectProxiedSocketAddress, oVar), this.f32633i, aVar);
        oVar.f32683a = kVar.getLogId();
        this.f32632h.addClientSocket(kVar);
        this.f32646v = kVar;
        this.f32644t.add(kVar);
        Runnable runnableStart = kVar.start(new n(kVar));
        if (runnableStart != null) {
            this.f32636l.executeLater(runnableStart);
        }
        this.f32635k.log(AbstractC5727h.a.INFO, "Started transport {0}", oVar.f32683a);
    }

    List H() {
        return this.f32638n;
    }

    String I() {
        return this.f32626b;
    }

    EnumC5802t J() {
        return this.f32648x.getState();
    }

    InterfaceC5776u K() {
        return this.f32647w;
    }

    void Q() {
        this.f32636l.execute(new d());
    }

    @Override // io.grpc.T, io.grpc.Y
    public io.grpc.U getLogId() {
        return this.f32625a;
    }

    @Override // io.grpc.T
    public com.google.common.util.concurrent.C getStats() {
        com.google.common.util.concurrent.M mCreate = com.google.common.util.concurrent.M.create();
        this.f32636l.execute(new j(mCreate));
        return mCreate;
    }

    @Override // io.grpc.internal.U0
    public InterfaceC5776u obtainActiveTransport() {
        InterfaceC5764n0 interfaceC5764n0 = this.f32647w;
        if (interfaceC5764n0 != null) {
            return interfaceC5764n0;
        }
        this.f32636l.execute(new c());
        return null;
    }

    public void shutdown(io.grpc.J0 j02) {
        this.f32636l.execute(new f(j02));
    }

    void shutdownNow(io.grpc.J0 j02) {
        shutdown(j02);
        this.f32636l.execute(new i(j02));
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("logId", this.f32625a.getId()).add("addressGroups", this.f32638n).toString();
    }

    public void updateAddresses(List<io.grpc.C> list) {
        e3.w.checkNotNull(list, "newAddressGroups");
        G(list, "newAddressGroups contains null entry");
        e3.w.checkArgument(!list.isEmpty(), "newAddressGroups is empty");
        this.f32636l.execute(new e(Collections.unmodifiableList(new ArrayList(list))));
    }
}
