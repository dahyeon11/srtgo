package io.grpc.internal;

import io.grpc.AbstractC5794n;
import io.grpc.C5713a;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.C5806x;
import io.grpc.C5808z;
import io.grpc.internal.InterfaceC5774t;
import io.grpc.internal.Q0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
abstract class C0 implements InterfaceC5772s {

    /* renamed from: A */
    static final C5728h0.i f32251A;

    /* renamed from: B */
    static final C5728h0.i f32252B;

    /* renamed from: C */
    private static final io.grpc.J0 f32253C;

    /* renamed from: D */
    private static Random f32254D;

    /* renamed from: a */
    private final C5730i0 f32255a;

    /* renamed from: b */
    private final Executor f32256b;

    /* renamed from: d */
    private final ScheduledExecutorService f32258d;

    /* renamed from: e */
    private final C5728h0 f32259e;

    /* renamed from: f */
    private final D0 f32260f;

    /* renamed from: g */
    private final W f32261g;

    /* renamed from: h */
    private final boolean f32262h;

    /* renamed from: j */
    private final u f32264j;

    /* renamed from: k */
    private final long f32265k;

    /* renamed from: l */
    private final long f32266l;

    /* renamed from: m */
    private final E f32267m;

    /* renamed from: s */
    private z f32273s;

    /* renamed from: t */
    private long f32274t;

    /* renamed from: u */
    private InterfaceC5774t f32275u;

    /* renamed from: v */
    private v f32276v;

    /* renamed from: w */
    private v f32277w;

    /* renamed from: x */
    private long f32278x;

    /* renamed from: y */
    private io.grpc.J0 f32279y;

    /* renamed from: z */
    private boolean f32280z;

    /* renamed from: c */
    private final Executor f32257c = new io.grpc.N0(new C5731a());

    /* renamed from: i */
    private final Object f32263i = new Object();

    /* renamed from: n */
    private final C5737a0 f32268n = new C5737a0();

    /* renamed from: o */
    private volatile B f32269o = new B(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);

    /* renamed from: p */
    private final AtomicBoolean f32270p = new AtomicBoolean();

    /* renamed from: q */
    private final AtomicInteger f32271q = new AtomicInteger();

    /* renamed from: r */
    private final AtomicInteger f32272r = new AtomicInteger();

    class A implements s {
        A() {
        }

        @Override // io.grpc.internal.C0.s
        public void runWith(D d9) {
            d9.f32303a.start(C0.this.new C(d9));
        }
    }

    private static final class B {

        /* renamed from: a */
        final boolean f32282a;

        /* renamed from: b */
        final List f32283b;

        /* renamed from: c */
        final Collection f32284c;

        /* renamed from: d */
        final Collection f32285d;

        /* renamed from: e */
        final int f32286e;

        /* renamed from: f */
        final D f32287f;

        /* renamed from: g */
        final boolean f32288g;

        /* renamed from: h */
        final boolean f32289h;

        B(List list, Collection collection, Collection collection2, D d9, boolean z8, boolean z9, boolean z10, int i8) {
            this.f32283b = list;
            this.f32284c = (Collection) e3.w.checkNotNull(collection, "drainedSubstreams");
            this.f32287f = d9;
            this.f32285d = collection2;
            this.f32288g = z8;
            this.f32282a = z9;
            this.f32289h = z10;
            this.f32286e = i8;
            e3.w.checkState(!z9 || list == null, "passThrough should imply buffer is null");
            e3.w.checkState((z9 && d9 == null) ? false : true, "passThrough should imply winningSubstream != null");
            e3.w.checkState(!z9 || (collection.size() == 1 && collection.contains(d9)) || (collection.size() == 0 && d9.f32304b), "passThrough should imply winningSubstream is drained");
            e3.w.checkState((z8 && d9 == null) ? false : true, "cancelled should imply committed");
        }

        B a(D d9) {
            Collection collectionUnmodifiableCollection;
            e3.w.checkState(!this.f32289h, "hedging frozen");
            e3.w.checkState(this.f32287f == null, "already committed");
            if (this.f32285d == null) {
                collectionUnmodifiableCollection = Collections.singleton(d9);
            } else {
                ArrayList arrayList = new ArrayList(this.f32285d);
                arrayList.add(d9);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new B(this.f32283b, this.f32284c, collectionUnmodifiableCollection, this.f32287f, this.f32288g, this.f32282a, this.f32289h, this.f32286e + 1);
        }

        B b() {
            return new B(this.f32283b, this.f32284c, this.f32285d, this.f32287f, true, this.f32282a, this.f32289h, this.f32286e);
        }

        B c(D d9) {
            List list;
            boolean z8;
            Collection collectionEmptyList;
            e3.w.checkState(this.f32287f == null, "Already committed");
            List list2 = this.f32283b;
            if (this.f32284c.contains(d9)) {
                collectionEmptyList = Collections.singleton(d9);
                list = null;
                z8 = true;
            } else {
                list = list2;
                z8 = false;
                collectionEmptyList = Collections.emptyList();
            }
            return new B(list, collectionEmptyList, this.f32285d, d9, this.f32288g, z8, this.f32289h, this.f32286e);
        }

        B d() {
            return this.f32289h ? this : new B(this.f32283b, this.f32284c, this.f32285d, this.f32287f, this.f32288g, this.f32282a, true, this.f32286e);
        }

        B e(D d9) {
            ArrayList arrayList = new ArrayList(this.f32285d);
            arrayList.remove(d9);
            return new B(this.f32283b, this.f32284c, Collections.unmodifiableCollection(arrayList), this.f32287f, this.f32288g, this.f32282a, this.f32289h, this.f32286e);
        }

        B f(D d9, D d10) {
            ArrayList arrayList = new ArrayList(this.f32285d);
            arrayList.remove(d9);
            arrayList.add(d10);
            return new B(this.f32283b, this.f32284c, Collections.unmodifiableCollection(arrayList), this.f32287f, this.f32288g, this.f32282a, this.f32289h, this.f32286e);
        }

        B g(D d9) {
            d9.f32304b = true;
            if (!this.f32284c.contains(d9)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f32284c);
            arrayList.remove(d9);
            return new B(this.f32283b, Collections.unmodifiableCollection(arrayList), this.f32285d, this.f32287f, this.f32288g, this.f32282a, this.f32289h, this.f32286e);
        }

        B h(D d9) {
            Collection collectionUnmodifiableCollection;
            e3.w.checkState(!this.f32282a, "Already passThrough");
            if (d9.f32304b) {
                collectionUnmodifiableCollection = this.f32284c;
            } else if (this.f32284c.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(d9);
            } else {
                ArrayList arrayList = new ArrayList(this.f32284c);
                arrayList.add(d9);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = collectionUnmodifiableCollection;
            D d10 = this.f32287f;
            boolean z8 = d10 != null;
            List list = this.f32283b;
            if (z8) {
                e3.w.checkState(d10 == d9, "Another RPC attempt has already committed");
                list = null;
            }
            return new B(list, collection, this.f32285d, this.f32287f, this.f32288g, z8, this.f32289h, this.f32286e);
        }
    }

    private final class C implements InterfaceC5774t {

        /* renamed from: a */
        final D f32290a;

        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C5728h0 f32292a;

            a(C5728h0 c5728h0) {
                this.f32292a = c5728h0;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0.this.f32275u.headersRead(this.f32292a);
            }
        }

        class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ D f32294a;

            class a implements Runnable {
                a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b bVar = b.this;
                    C0.this.Q(bVar.f32294a);
                }
            }

            b(D d9) {
                this.f32294a = d9;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0.this.f32256b.execute(new a());
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0.this.f32280z = true;
                C0.this.f32275u.closed(C0.this.f32273s.f32362a, C0.this.f32273s.f32363b, C0.this.f32273s.f32364c);
            }
        }

        class d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ D f32298a;

            d(D d9) {
                this.f32298a = d9;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0.this.Q(this.f32298a);
            }
        }

        class e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Q0.a f32300a;

            e(Q0.a aVar) {
                this.f32300a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0.this.f32275u.messagesAvailable(this.f32300a);
            }
        }

        class f implements Runnable {
            f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C0.this.f32280z) {
                    return;
                }
                C0.this.f32275u.onReady();
            }
        }

        C(D d9) {
            this.f32290a = d9;
        }

        private Integer a(C5728h0 c5728h0) {
            String str = (String) c5728h0.get(C0.f32252B);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private w b(io.grpc.J0 j02, C5728h0 c5728h0) {
            Integer numA = a(c5728h0);
            boolean zContains = C0.this.f32261g.f32578c.contains(j02.getCode());
            boolean z8 = (C0.this.f32267m == null || (!zContains && (numA == null || numA.intValue() >= 0))) ? false : !C0.this.f32267m.b();
            if (zContains && !z8 && !j02.isOk() && numA != null && numA.intValue() > 0) {
                numA = 0;
            }
            return new w(zContains && !z8, numA);
        }

        private y c(io.grpc.J0 j02, C5728h0 c5728h0) {
            long nanos = 0;
            boolean z8 = false;
            if (C0.this.f32260f == null) {
                return new y(false, 0L);
            }
            boolean zContains = C0.this.f32260f.f32417f.contains(j02.getCode());
            Integer numA = a(c5728h0);
            boolean z9 = (C0.this.f32267m == null || (!zContains && (numA == null || numA.intValue() >= 0))) ? false : !C0.this.f32267m.b();
            if (C0.this.f32260f.f32412a > this.f32290a.f32306d + 1 && !z9) {
                if (numA == null) {
                    if (zContains) {
                        nanos = (long) (C0.this.f32278x * C0.f32254D.nextDouble());
                        C0.this.f32278x = Math.min((long) (r10.f32278x * C0.this.f32260f.f32415d), C0.this.f32260f.f32414c);
                        z8 = true;
                    }
                } else if (numA.intValue() >= 0) {
                    nanos = TimeUnit.MILLISECONDS.toNanos(numA.intValue());
                    C0 c02 = C0.this;
                    c02.f32278x = c02.f32260f.f32413b;
                    z8 = true;
                }
            }
            return new y(z8, nanos);
        }

        @Override // io.grpc.internal.InterfaceC5774t
        public void closed(io.grpc.J0 j02, InterfaceC5774t.a aVar, C5728h0 c5728h0) {
            v vVar;
            synchronized (C0.this.f32263i) {
                C0 c02 = C0.this;
                c02.f32269o = c02.f32269o.g(this.f32290a);
                C0.this.f32268n.append(j02.getCode());
            }
            if (C0.this.f32272r.decrementAndGet() == Integer.MIN_VALUE) {
                C0.this.f32257c.execute(new c());
                return;
            }
            D d9 = this.f32290a;
            if (d9.f32305c) {
                C0.this.N(d9);
                if (C0.this.f32269o.f32287f == this.f32290a) {
                    C0.this.X(j02, aVar, c5728h0);
                    return;
                }
                return;
            }
            InterfaceC5774t.a aVar2 = InterfaceC5774t.a.MISCARRIED;
            if (aVar == aVar2 && C0.this.f32271q.incrementAndGet() > 1000) {
                C0.this.N(this.f32290a);
                if (C0.this.f32269o.f32287f == this.f32290a) {
                    C0.this.X(io.grpc.J0.INTERNAL.withDescription("Too many transparent retries. Might be a bug in gRPC").withCause(j02.asRuntimeException()), aVar, c5728h0);
                    return;
                }
                return;
            }
            if (C0.this.f32269o.f32287f == null) {
                if (aVar == aVar2 || (aVar == InterfaceC5774t.a.REFUSED && C0.this.f32270p.compareAndSet(false, true))) {
                    D dO = C0.this.O(this.f32290a.f32306d, true);
                    if (dO == null) {
                        return;
                    }
                    if (C0.this.f32262h) {
                        synchronized (C0.this.f32263i) {
                            C0 c03 = C0.this;
                            c03.f32269o = c03.f32269o.f(this.f32290a, dO);
                        }
                    }
                    C0.this.f32256b.execute(new d(dO));
                    return;
                }
                if (aVar != InterfaceC5774t.a.DROPPED) {
                    C0.this.f32270p.set(true);
                    if (C0.this.f32262h) {
                        w wVarB = b(j02, c5728h0);
                        if (wVarB.f32354a) {
                            C0.this.W(wVarB.f32355b);
                        }
                        synchronized (C0.this.f32263i) {
                            try {
                                C0 c04 = C0.this;
                                c04.f32269o = c04.f32269o.e(this.f32290a);
                                if (wVarB.f32354a) {
                                    C0 c05 = C0.this;
                                    if (!c05.S(c05.f32269o)) {
                                        if (!C0.this.f32269o.f32285d.isEmpty()) {
                                        }
                                    }
                                    return;
                                }
                            } finally {
                            }
                        }
                    } else {
                        y yVarC = c(j02, c5728h0);
                        if (yVarC.f32360a) {
                            D dO2 = C0.this.O(this.f32290a.f32306d + 1, false);
                            if (dO2 == null) {
                                return;
                            }
                            synchronized (C0.this.f32263i) {
                                C0 c06 = C0.this;
                                vVar = new v(c06.f32263i);
                                c06.f32276v = vVar;
                            }
                            vVar.c(C0.this.f32258d.schedule(new b(dO2), yVarC.f32361b, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                } else if (C0.this.f32262h) {
                    C0.this.R();
                }
            }
            C0.this.N(this.f32290a);
            if (C0.this.f32269o.f32287f == this.f32290a) {
                C0.this.X(j02, aVar, c5728h0);
            }
        }

        @Override // io.grpc.internal.InterfaceC5774t
        public void headersRead(C5728h0 c5728h0) {
            if (this.f32290a.f32306d > 0) {
                C5728h0.i iVar = C0.f32251A;
                c5728h0.discardAll(iVar);
                c5728h0.put(iVar, String.valueOf(this.f32290a.f32306d));
            }
            C0.this.N(this.f32290a);
            if (C0.this.f32269o.f32287f == this.f32290a) {
                if (C0.this.f32267m != null) {
                    C0.this.f32267m.c();
                }
                C0.this.f32257c.execute(new a(c5728h0));
            }
        }

        @Override // io.grpc.internal.InterfaceC5774t, io.grpc.internal.Q0
        public void messagesAvailable(Q0.a aVar) throws IOException {
            B b9 = C0.this.f32269o;
            e3.w.checkState(b9.f32287f != null, "Headers should be received prior to messages.");
            if (b9.f32287f != this.f32290a) {
                U.b(aVar);
            } else {
                C0.this.f32257c.execute(new e(aVar));
            }
        }

        @Override // io.grpc.internal.InterfaceC5774t, io.grpc.internal.Q0
        public void onReady() {
            if (C0.this.isReady()) {
                C0.this.f32257c.execute(new f());
            }
        }
    }

    private static final class D {

        /* renamed from: a */
        InterfaceC5772s f32303a;

        /* renamed from: b */
        boolean f32304b;

        /* renamed from: c */
        boolean f32305c;

        /* renamed from: d */
        final int f32306d;

        D(int i8) {
            this.f32306d = i8;
        }
    }

    static final class E {

        /* renamed from: a */
        final int f32307a;

        /* renamed from: b */
        final int f32308b;

        /* renamed from: c */
        final int f32309c;

        /* renamed from: d */
        final AtomicInteger f32310d;

        E(float f8, float f9) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f32310d = atomicInteger;
            this.f32309c = (int) (f9 * 1000.0f);
            int i8 = (int) (f8 * 1000.0f);
            this.f32307a = i8;
            this.f32308b = i8 / 2;
            atomicInteger.set(i8);
        }

        boolean a() {
            return this.f32310d.get() > this.f32308b;
        }

        boolean b() {
            int i8;
            int i9;
            do {
                i8 = this.f32310d.get();
                if (i8 == 0) {
                    return false;
                }
                i9 = i8 + androidx.core.app.w.IMPORTANCE_UNSPECIFIED;
            } while (!this.f32310d.compareAndSet(i8, Math.max(i9, 0)));
            return i9 > this.f32308b;
        }

        void c() {
            int i8;
            int i9;
            do {
                i8 = this.f32310d.get();
                i9 = this.f32307a;
                if (i8 == i9) {
                    return;
                }
            } while (!this.f32310d.compareAndSet(i8, Math.min(this.f32309c + i8, i9)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof E)) {
                return false;
            }
            E e8 = (E) obj;
            return this.f32307a == e8.f32307a && this.f32309c == e8.f32309c;
        }

        public int hashCode() {
            return e3.r.hashCode(Integer.valueOf(this.f32307a), Integer.valueOf(this.f32309c));
        }
    }

    /* renamed from: io.grpc.internal.C0$a */
    class C5731a implements Thread.UncaughtExceptionHandler {
        C5731a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            throw io.grpc.J0.fromThrowable(th).withDescription("Uncaught exception in the SynchronizationContext. Re-thrown.").asRuntimeException();
        }
    }

    /* renamed from: io.grpc.internal.C0$b */
    class C5732b implements s {

        /* renamed from: a */
        final /* synthetic */ String f32312a;

        C5732b(String str) {
            this.f32312a = str;
        }

        @Override // io.grpc.internal.C0.s
        public void runWith(D d9) {
            d9.f32303a.setAuthority(this.f32312a);
        }
    }

    /* renamed from: io.grpc.internal.C0$c */
    class RunnableC5733c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Collection f32314a;

        /* renamed from: b */
        final /* synthetic */ D f32315b;

        /* renamed from: c */
        final /* synthetic */ Future f32316c;

        /* renamed from: d */
        final /* synthetic */ Future f32317d;

        RunnableC5733c(Collection collection, D d9, Future future, Future future2) {
            this.f32314a = collection;
            this.f32315b = d9;
            this.f32316c = future;
            this.f32317d = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (D d9 : this.f32314a) {
                if (d9 != this.f32315b) {
                    d9.f32303a.cancel(C0.f32253C);
                }
            }
            Future future = this.f32316c;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f32317d;
            if (future2 != null) {
                future2.cancel(false);
            }
            C0.this.U();
        }
    }

    /* renamed from: io.grpc.internal.C0$d */
    class C5734d implements s {

        /* renamed from: a */
        final /* synthetic */ io.grpc.r f32319a;

        C5734d(io.grpc.r rVar) {
            this.f32319a = rVar;
        }

        @Override // io.grpc.internal.C0.s
        public void runWith(D d9) {
            d9.f32303a.setCompressor(this.f32319a);
        }
    }

    /* renamed from: io.grpc.internal.C0$e */
    class C5735e implements s {

        /* renamed from: a */
        final /* synthetic */ C5806x f32321a;

        C5735e(C5806x c5806x) {
            this.f32321a = c5806x;
        }

        @Override // io.grpc.internal.C0.s
        public void runWith(D d9) {
            d9.f32303a.setDeadline(this.f32321a);
        }
    }

    class f implements s {

        /* renamed from: a */
        final /* synthetic */ C5808z f32323a;

        f(C5808z c5808z) {
            this.f32323a = c5808z;
        }

        @Override // io.grpc.internal.C0.s
        public void runWith(D d9) {
            d9.f32303a.setDecompressorRegistry(this.f32323a);
        }
    }

    class g implements s {
        g() {
        }

        @Override // io.grpc.internal.C0.s
        public void runWith(D d9) {
            d9.f32303a.flush();
        }
    }

    class h implements s {

        /* renamed from: a */
        final /* synthetic */ boolean f32326a;

        h(boolean z8) {
            this.f32326a = z8;
        }

        @Override // io.grpc.internal.C0.s
        public void runWith(D d9) {
            d9.f32303a.setFullStreamDecompression(this.f32326a);
        }
    }

    class i implements s {
        i() {
        }

        @Override // io.grpc.internal.C0.s
        public void runWith(D d9) {
            d9.f32303a.halfClose();
        }
    }

    class j implements s {

        /* renamed from: a */
        final /* synthetic */ int f32329a;

        j(int i8) {
            this.f32329a = i8;
        }

        @Override // io.grpc.internal.C0.s
        public void runWith(D d9) {
            d9.f32303a.setMaxInboundMessageSize(this.f32329a);
        }
    }

    class k implements s {

        /* renamed from: a */
        final /* synthetic */ int f32331a;

        k(int i8) {
            this.f32331a = i8;
        }

        @Override // io.grpc.internal.C0.s
        public void runWith(D d9) {
            d9.f32303a.setMaxOutboundMessageSize(this.f32331a);
        }
    }

    class l implements s {

        /* renamed from: a */
        final /* synthetic */ boolean f32333a;

        l(boolean z8) {
            this.f32333a = z8;
        }

        @Override // io.grpc.internal.C0.s
        public void runWith(D d9) {
            d9.f32303a.setMessageCompression(this.f32333a);
        }
    }

    class m implements s {
        m() {
        }

        @Override // io.grpc.internal.C0.s
        public void runWith(D d9) {
            d9.f32303a.optimizeForDirectExecutor();
        }
    }

    class n implements s {

        /* renamed from: a */
        final /* synthetic */ int f32336a;

        n(int i8) {
            this.f32336a = i8;
        }

        @Override // io.grpc.internal.C0.s
        public void runWith(D d9) {
            d9.f32303a.request(this.f32336a);
        }
    }

    class o implements s {

        /* renamed from: a */
        final /* synthetic */ Object f32338a;

        o(Object obj) {
            this.f32338a = obj;
        }

        @Override // io.grpc.internal.C0.s
        public void runWith(D d9) {
            d9.f32303a.writeMessage(C0.this.f32255a.streamRequest(this.f32338a));
            d9.f32303a.flush();
        }
    }

    class p extends AbstractC5794n.a {

        /* renamed from: a */
        final /* synthetic */ AbstractC5794n f32340a;

        p(AbstractC5794n abstractC5794n) {
            this.f32340a = abstractC5794n;
        }

        @Override // io.grpc.AbstractC5794n.a
        public AbstractC5794n newClientStreamTracer(AbstractC5794n.b bVar, C5728h0 c5728h0) {
            return this.f32340a;
        }
    }

    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0.this.f32280z) {
                return;
            }
            C0.this.f32275u.onReady();
        }
    }

    class r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ io.grpc.J0 f32343a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5774t.a f32344b;

        /* renamed from: c */
        final /* synthetic */ C5728h0 f32345c;

        r(io.grpc.J0 j02, InterfaceC5774t.a aVar, C5728h0 c5728h0) {
            this.f32343a = j02;
            this.f32344b = aVar;
            this.f32345c = c5728h0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0.this.f32280z = true;
            C0.this.f32275u.closed(this.f32343a, this.f32344b, this.f32345c);
        }
    }

    private interface s {
        void runWith(D d9);
    }

    class t extends AbstractC5794n {

        /* renamed from: a */
        private final D f32347a;

        /* renamed from: b */
        long f32348b;

        t(D d9) {
            this.f32347a = d9;
        }

        @Override // io.grpc.M0
        public void outboundWireSize(long j8) {
            if (C0.this.f32269o.f32287f != null) {
                return;
            }
            synchronized (C0.this.f32263i) {
                try {
                    if (C0.this.f32269o.f32287f == null && !this.f32347a.f32304b) {
                        long j9 = this.f32348b + j8;
                        this.f32348b = j9;
                        if (j9 <= C0.this.f32274t) {
                            return;
                        }
                        if (this.f32348b > C0.this.f32265k) {
                            this.f32347a.f32305c = true;
                        } else {
                            long jA = C0.this.f32264j.a(this.f32348b - C0.this.f32274t);
                            C0.this.f32274t = this.f32348b;
                            if (jA > C0.this.f32266l) {
                                this.f32347a.f32305c = true;
                            }
                        }
                        D d9 = this.f32347a;
                        Runnable runnableM = d9.f32305c ? C0.this.M(d9) : null;
                        if (runnableM != null) {
                            runnableM.run();
                        }
                    }
                } finally {
                }
            }
        }
    }

    static final class u {

        /* renamed from: a */
        private final AtomicLong f32350a = new AtomicLong();

        u() {
        }

        long a(long j8) {
            return this.f32350a.addAndGet(j8);
        }
    }

    private static final class v {

        /* renamed from: a */
        final Object f32351a;

        /* renamed from: b */
        Future f32352b;

        /* renamed from: c */
        boolean f32353c;

        v(Object obj) {
            this.f32351a = obj;
        }

        boolean a() {
            return this.f32353c;
        }

        Future b() {
            this.f32353c = true;
            return this.f32352b;
        }

        void c(Future future) {
            synchronized (this.f32351a) {
                try {
                    if (!this.f32353c) {
                        this.f32352b = future;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final class w {

        /* renamed from: a */
        final boolean f32354a;

        /* renamed from: b */
        final Integer f32355b;

        public w(boolean z8, Integer num) {
            this.f32354a = z8;
            this.f32355b = num;
        }
    }

    private final class x implements Runnable {

        /* renamed from: a */
        final v f32356a;

        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ D f32358a;

            a(D d9) {
                this.f32358a = d9;
            }

            @Override // java.lang.Runnable
            public void run() {
                v vVar;
                boolean z8;
                synchronized (C0.this.f32263i) {
                    try {
                        vVar = null;
                        if (x.this.f32356a.a()) {
                            z8 = true;
                        } else {
                            C0 c02 = C0.this;
                            c02.f32269o = c02.f32269o.a(this.f32358a);
                            C0 c03 = C0.this;
                            if (c03.S(c03.f32269o) && (C0.this.f32267m == null || C0.this.f32267m.a())) {
                                C0 c04 = C0.this;
                                vVar = new v(c04.f32263i);
                                c04.f32277w = vVar;
                            } else {
                                C0 c05 = C0.this;
                                c05.f32269o = c05.f32269o.d();
                                C0.this.f32277w = null;
                            }
                            z8 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z8) {
                    this.f32358a.f32303a.start(C0.this.new C(this.f32358a));
                    this.f32358a.f32303a.cancel(io.grpc.J0.CANCELLED.withDescription("Unneeded hedging"));
                } else {
                    if (vVar != null) {
                        vVar.c(C0.this.f32258d.schedule(C0.this.new x(vVar), C0.this.f32261g.f32577b, TimeUnit.NANOSECONDS));
                    }
                    C0.this.Q(this.f32358a);
                }
            }
        }

        x(v vVar) {
            this.f32356a = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0 c02 = C0.this;
            D dO = c02.O(c02.f32269o.f32286e, false);
            if (dO == null) {
                return;
            }
            C0.this.f32256b.execute(new a(dO));
        }
    }

    private static final class y {

        /* renamed from: a */
        final boolean f32360a;

        /* renamed from: b */
        final long f32361b;

        y(boolean z8, long j8) {
            this.f32360a = z8;
            this.f32361b = j8;
        }
    }

    private static final class z {

        /* renamed from: a */
        private final io.grpc.J0 f32362a;

        /* renamed from: b */
        private final InterfaceC5774t.a f32363b;

        /* renamed from: c */
        private final C5728h0 f32364c;

        z(io.grpc.J0 j02, InterfaceC5774t.a aVar, C5728h0 c5728h0) {
            this.f32362a = j02;
            this.f32363b = aVar;
            this.f32364c = c5728h0;
        }
    }

    static {
        C5728h0.d dVar = C5728h0.ASCII_STRING_MARSHALLER;
        f32251A = C5728h0.i.of("grpc-previous-rpc-attempts", dVar);
        f32252B = C5728h0.i.of("grpc-retry-pushback-ms", dVar);
        f32253C = io.grpc.J0.CANCELLED.withDescription("Stream thrown away because RetriableStream committed");
        f32254D = new Random();
    }

    C0(C5730i0 c5730i0, C5728h0 c5728h0, u uVar, long j8, long j9, Executor executor, ScheduledExecutorService scheduledExecutorService, D0 d02, W w8, E e8) {
        this.f32255a = c5730i0;
        this.f32264j = uVar;
        this.f32265k = j8;
        this.f32266l = j9;
        this.f32256b = executor;
        this.f32258d = scheduledExecutorService;
        this.f32259e = c5728h0;
        this.f32260f = d02;
        if (d02 != null) {
            this.f32278x = d02.f32413b;
        }
        this.f32261g = w8;
        e3.w.checkArgument(d02 == null || w8 == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f32262h = w8 != null;
        this.f32267m = e8;
    }

    public Runnable M(D d9) {
        Future future;
        Future future2;
        synchronized (this.f32263i) {
            try {
                if (this.f32269o.f32287f != null) {
                    return null;
                }
                Collection collection = this.f32269o.f32284c;
                this.f32269o = this.f32269o.c(d9);
                this.f32264j.a(-this.f32274t);
                v vVar = this.f32276v;
                if (vVar != null) {
                    Future futureB = vVar.b();
                    this.f32276v = null;
                    future = futureB;
                } else {
                    future = null;
                }
                v vVar2 = this.f32277w;
                if (vVar2 != null) {
                    Future futureB2 = vVar2.b();
                    this.f32277w = null;
                    future2 = futureB2;
                } else {
                    future2 = null;
                }
                return new RunnableC5733c(collection, d9, future, future2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void N(D d9) {
        Runnable runnableM = M(d9);
        if (runnableM != null) {
            runnableM.run();
        }
    }

    public D O(int i8, boolean z8) {
        int i9;
        do {
            i9 = this.f32272r.get();
            if (i9 < 0) {
                return null;
            }
        } while (!this.f32272r.compareAndSet(i9, i9 + 1));
        D d9 = new D(i8);
        d9.f32303a = T(Z(this.f32259e, i8), new p(new t(d9)), i8, z8);
        return d9;
    }

    private void P(s sVar) {
        Collection collection;
        synchronized (this.f32263i) {
            try {
                if (!this.f32269o.f32282a) {
                    this.f32269o.f32283b.add(sVar);
                }
                collection = this.f32269o.f32284c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sVar.runWith((D) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0055, code lost:
    
        r9 = io.grpc.internal.C0.f32253C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0057, code lost:
    
        r0.cancel(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0088, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0090, code lost:
    
        if (r0.hasNext() == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0092, code lost:
    
        r4 = (io.grpc.internal.C0.s) r0.next();
        r4.runWith(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x009d, code lost:
    
        if ((r4 instanceof io.grpc.internal.C0.A) == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x009f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00a0, code lost:
    
        r4 = r8.f32269o;
        r5 = r4.f32287f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00a4, code lost:
    
        if (r5 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00a6, code lost:
    
        if (r5 == r9) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00ab, code lost:
    
        if (r4.f32288g == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0036, code lost:
    
        if (r1 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0038, code lost:
    
        r8.f32257c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x003e, code lost:
    
        if (r2 != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0040, code lost:
    
        r9.f32303a.start(new io.grpc.internal.C0.C(r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x004a, code lost:
    
        r0 = r9.f32303a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0050, code lost:
    
        if (r8.f32269o.f32287f != r9) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0052, code lost:
    
        r9 = r8.f32279y;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Q(io.grpc.internal.C0.D r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.f32263i
            monitor-enter(r4)
            io.grpc.internal.C0$B r5 = r8.f32269o     // Catch: java.lang.Throwable -> L11
            io.grpc.internal.C0$D r6 = r5.f32287f     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L14
            if (r6 == r9) goto L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L11:
            r9 = move-exception
            goto Lb0
        L14:
            boolean r6 = r5.f32288g     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L1a:
            java.util.List r6 = r5.f32283b     // Catch: java.lang.Throwable -> L11
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L11
            if (r0 != r6) goto L5b
            io.grpc.internal.C0$B r0 = r5.h(r9)     // Catch: java.lang.Throwable -> L11
            r8.f32269o = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r8.isReady()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L30
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L30:
            io.grpc.internal.C0$q r1 = new io.grpc.internal.C0$q     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
        L36:
            if (r1 == 0) goto L3e
            java.util.concurrent.Executor r9 = r8.f32257c
            r9.execute(r1)
            return
        L3e:
            if (r2 != 0) goto L4a
            io.grpc.internal.s r0 = r9.f32303a
            io.grpc.internal.C0$C r1 = new io.grpc.internal.C0$C
            r1.<init>(r9)
            r0.start(r1)
        L4a:
            io.grpc.internal.s r0 = r9.f32303a
            io.grpc.internal.C0$B r1 = r8.f32269o
            io.grpc.internal.C0$D r1 = r1.f32287f
            if (r1 != r9) goto L55
            io.grpc.J0 r9 = r8.f32279y
            goto L57
        L55:
            io.grpc.J0 r9 = io.grpc.internal.C0.f32253C
        L57:
            r0.cancel(r9)
            return
        L5b:
            boolean r6 = r9.f32304b     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L61
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L61:
            int r6 = r0 + 128
            java.util.List r7 = r5.f32283b     // Catch: java.lang.Throwable -> L11
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L11
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L7b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f32283b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L11
            goto L87
        L7b:
            r3.clear()     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f32283b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.addAll(r0)     // Catch: java.lang.Throwable -> L11
        L87:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r3.iterator()
        L8c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r0.next()
            io.grpc.internal.C0$s r4 = (io.grpc.internal.C0.s) r4
            r4.runWith(r9)
            boolean r4 = r4 instanceof io.grpc.internal.C0.A
            if (r4 == 0) goto La0
            r2 = 1
        La0:
            io.grpc.internal.C0$B r4 = r8.f32269o
            io.grpc.internal.C0$D r5 = r4.f32287f
            if (r5 == 0) goto La9
            if (r5 == r9) goto La9
            goto Lad
        La9:
            boolean r4 = r4.f32288g
            if (r4 == 0) goto L8c
        Lad:
            r0 = r6
            goto L4
        Lb0:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.C0.Q(io.grpc.internal.C0$D):void");
    }

    public void R() {
        Future future;
        synchronized (this.f32263i) {
            try {
                v vVar = this.f32277w;
                future = null;
                if (vVar != null) {
                    Future futureB = vVar.b();
                    this.f32277w = null;
                    future = futureB;
                }
                this.f32269o = this.f32269o.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public boolean S(B b9) {
        return b9.f32287f == null && b9.f32286e < this.f32261g.f32576a && !b9.f32289h;
    }

    public void W(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            R();
            return;
        }
        synchronized (this.f32263i) {
            try {
                v vVar = this.f32277w;
                if (vVar == null) {
                    return;
                }
                Future futureB = vVar.b();
                v vVar2 = new v(this.f32263i);
                this.f32277w = vVar2;
                if (futureB != null) {
                    futureB.cancel(false);
                }
                vVar2.c(this.f32258d.schedule(new x(vVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void X(io.grpc.J0 j02, InterfaceC5774t.a aVar, C5728h0 c5728h0) {
        this.f32273s = new z(j02, aVar, c5728h0);
        if (this.f32272r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f32257c.execute(new r(j02, aVar, c5728h0));
        }
    }

    abstract InterfaceC5772s T(C5728h0 c5728h0, AbstractC5794n.a aVar, int i8, boolean z8);

    abstract void U();

    abstract io.grpc.J0 V();

    final void Y(Object obj) {
        B b9 = this.f32269o;
        if (b9.f32282a) {
            b9.f32287f.f32303a.writeMessage(this.f32255a.streamRequest(obj));
        } else {
            P(new o(obj));
        }
    }

    final C5728h0 Z(C5728h0 c5728h0, int i8) {
        C5728h0 c5728h02 = new C5728h0();
        c5728h02.merge(c5728h0);
        if (i8 > 0) {
            c5728h02.put(f32251A, String.valueOf(i8));
        }
        return c5728h02;
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public void appendTimeoutInsight(C5737a0 c5737a0) {
        B b9;
        synchronized (this.f32263i) {
            c5737a0.appendKeyValue("closed", this.f32268n);
            b9 = this.f32269o;
        }
        if (b9.f32287f != null) {
            C5737a0 c5737a02 = new C5737a0();
            b9.f32287f.f32303a.appendTimeoutInsight(c5737a02);
            c5737a0.appendKeyValue("committed", c5737a02);
            return;
        }
        C5737a0 c5737a03 = new C5737a0();
        for (D d9 : b9.f32284c) {
            C5737a0 c5737a04 = new C5737a0();
            d9.f32303a.appendTimeoutInsight(c5737a04);
            c5737a03.append(c5737a04);
        }
        c5737a0.appendKeyValue("open", c5737a03);
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final void cancel(io.grpc.J0 j02) {
        D d9;
        D d10 = new D(0);
        d10.f32303a = new C5771r0();
        Runnable runnableM = M(d10);
        if (runnableM != null) {
            synchronized (this.f32263i) {
                this.f32269o = this.f32269o.h(d10);
            }
            runnableM.run();
            X(j02, InterfaceC5774t.a.PROCESSED, new C5728h0());
            return;
        }
        synchronized (this.f32263i) {
            try {
                if (this.f32269o.f32284c.contains(this.f32269o.f32287f)) {
                    d9 = this.f32269o.f32287f;
                } else {
                    this.f32279y = j02;
                    d9 = null;
                }
                this.f32269o = this.f32269o.b();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d9 != null) {
            d9.f32303a.cancel(j02);
        }
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public final void flush() {
        B b9 = this.f32269o;
        if (b9.f32282a) {
            b9.f32287f.f32303a.flush();
        } else {
            P(new g());
        }
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final C5713a getAttributes() {
        return this.f32269o.f32287f != null ? this.f32269o.f32287f.f32303a.getAttributes() : C5713a.EMPTY;
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final void halfClose() {
        P(new i());
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public final boolean isReady() {
        Iterator it = this.f32269o.f32284c.iterator();
        while (it.hasNext()) {
            if (((D) it.next()).f32303a.isReady()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public void optimizeForDirectExecutor() {
        P(new m());
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public final void request(int i8) {
        B b9 = this.f32269o;
        if (b9.f32282a) {
            b9.f32287f.f32303a.request(i8);
        } else {
            P(new n(i8));
        }
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final void setAuthority(String str) {
        P(new C5732b(str));
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public final void setCompressor(io.grpc.r rVar) {
        P(new C5734d(rVar));
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final void setDeadline(C5806x c5806x) {
        P(new C5735e(c5806x));
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final void setDecompressorRegistry(C5808z c5808z) {
        P(new f(c5808z));
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final void setFullStreamDecompression(boolean z8) {
        P(new h(z8));
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final void setMaxInboundMessageSize(int i8) {
        P(new j(i8));
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final void setMaxOutboundMessageSize(int i8) {
        P(new k(i8));
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public final void setMessageCompression(boolean z8) {
        P(new l(z8));
    }

    @Override // io.grpc.internal.InterfaceC5772s
    public final void start(InterfaceC5774t interfaceC5774t) {
        v vVar;
        E e8;
        this.f32275u = interfaceC5774t;
        io.grpc.J0 j0V = V();
        if (j0V != null) {
            cancel(j0V);
            return;
        }
        synchronized (this.f32263i) {
            this.f32269o.f32283b.add(new A());
        }
        D dO = O(0, false);
        if (dO == null) {
            return;
        }
        if (this.f32262h) {
            synchronized (this.f32263i) {
                try {
                    this.f32269o = this.f32269o.a(dO);
                    if (S(this.f32269o) && ((e8 = this.f32267m) == null || e8.a())) {
                        vVar = new v(this.f32263i);
                        this.f32277w = vVar;
                    } else {
                        vVar = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (vVar != null) {
                vVar.c(this.f32258d.schedule(new x(vVar), this.f32261g.f32577b, TimeUnit.NANOSECONDS));
            }
        }
        Q(dO);
    }

    @Override // io.grpc.internal.InterfaceC5772s, io.grpc.internal.P0
    public final void writeMessage(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }
}
