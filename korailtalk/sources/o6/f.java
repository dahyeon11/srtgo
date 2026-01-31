package O6;

import e3.w;
import f3.AbstractC5446S;
import f3.AbstractC5465h0;
import io.grpc.AbstractC5714a0;
import io.grpc.AbstractC5727h;
import io.grpc.AbstractC5794n;
import io.grpc.C;
import io.grpc.C5713a;
import io.grpc.C5728h0;
import io.grpc.C5803u;
import io.grpc.EnumC5802t;
import io.grpc.J0;
import io.grpc.N0;
import io.grpc.internal.K0;
import io.grpc.internal.S0;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class f extends AbstractC5714a0 {

    /* renamed from: k, reason: collision with root package name */
    private static final C5713a.c f3475k = C5713a.c.create("addressTrackerKey");

    /* renamed from: b, reason: collision with root package name */
    final c f3476b;

    /* renamed from: c, reason: collision with root package name */
    private final N0 f3477c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5714a0.d f3478d;

    /* renamed from: e, reason: collision with root package name */
    private final O6.e f3479e;

    /* renamed from: f, reason: collision with root package name */
    private S0 f3480f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f3481g;

    /* renamed from: h, reason: collision with root package name */
    private N0.d f3482h;

    /* renamed from: i, reason: collision with root package name */
    private Long f3483i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC5727h f3484j;

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private g f3485a;

        /* renamed from: b, reason: collision with root package name */
        private volatile a f3486b;

        /* renamed from: c, reason: collision with root package name */
        private a f3487c;

        /* renamed from: d, reason: collision with root package name */
        private Long f3488d;

        /* renamed from: e, reason: collision with root package name */
        private int f3489e;

        /* renamed from: f, reason: collision with root package name */
        private final Set f3490f = new HashSet();

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            AtomicLong f3491a;

            /* renamed from: b, reason: collision with root package name */
            AtomicLong f3492b;

            private a() {
                this.f3491a = new AtomicLong();
                this.f3492b = new AtomicLong();
            }

            void a() {
                this.f3491a.set(0L);
                this.f3492b.set(0L);
            }
        }

        b(g gVar) {
            this.f3486b = new a();
            this.f3487c = new a();
            this.f3485a = gVar;
        }

        boolean b(i iVar) {
            if (l() && !iVar.f()) {
                iVar.e();
            } else if (!l() && iVar.f()) {
                iVar.h();
            }
            iVar.g(this);
            return this.f3490f.add(iVar);
        }

        void c() {
            int i8 = this.f3489e;
            this.f3489e = i8 == 0 ? 0 : i8 - 1;
        }

        void d(long j8) {
            this.f3488d = Long.valueOf(j8);
            this.f3489e++;
            Iterator it = this.f3490f.iterator();
            while (it.hasNext()) {
                ((i) it.next()).e();
            }
        }

        double e() {
            return this.f3487c.f3492b.get() / f();
        }

        long f() {
            return this.f3487c.f3491a.get() + this.f3487c.f3492b.get();
        }

        void g(boolean z8) {
            g gVar = this.f3485a;
            if (gVar.successRateEjection == null && gVar.failurePercentageEjection == null) {
                return;
            }
            if (z8) {
                this.f3486b.f3491a.getAndIncrement();
            } else {
                this.f3486b.f3492b.getAndIncrement();
            }
        }

        boolean h(i iVar) {
            iVar.d();
            return this.f3490f.remove(iVar);
        }

        void i() {
            this.f3486b.a();
            this.f3487c.a();
        }

        void j() {
            this.f3489e = 0;
        }

        void k(g gVar) {
            this.f3485a = gVar;
        }

        boolean l() {
            return this.f3488d != null;
        }

        double m() {
            return this.f3487c.f3491a.get() / f();
        }

        public boolean maxEjectionTimeElapsed(long j8) {
            return j8 > this.f3488d.longValue() + Math.min(this.f3485a.baseEjectionTimeNanos.longValue() * ((long) this.f3489e), Math.max(this.f3485a.baseEjectionTimeNanos.longValue(), this.f3485a.maxEjectionTimeNanos.longValue()));
        }

        void n() {
            this.f3487c.a();
            a aVar = this.f3486b;
            this.f3486b = this.f3487c;
            this.f3487c = aVar;
        }

        void o() {
            w.checkState(this.f3488d != null, "not currently ejected");
            this.f3488d = null;
            Iterator it = this.f3490f.iterator();
            while (it.hasNext()) {
                ((i) it.next()).h();
            }
        }

        public String toString() {
            return "AddressTracker{subchannels=" + this.f3490f + '}';
        }
    }

    static class c extends AbstractC5446S {

        /* renamed from: a, reason: collision with root package name */
        private final Map f3493a = new HashMap();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // f3.X
        /* renamed from: a */
        public Map delegate() {
            return this.f3493a;
        }

        void c() {
            for (b bVar : this.f3493a.values()) {
                if (bVar.l()) {
                    bVar.o();
                }
                bVar.j();
            }
        }

        double d() {
            if (this.f3493a.isEmpty()) {
                return 0.0d;
            }
            Iterator it = this.f3493a.values().iterator();
            int i8 = 0;
            int i9 = 0;
            while (it.hasNext()) {
                i9++;
                if (((b) it.next()).l()) {
                    i8++;
                }
            }
            return (i8 / i9) * 100.0d;
        }

        void e(Long l8) {
            for (b bVar : this.f3493a.values()) {
                if (!bVar.l()) {
                    bVar.c();
                }
                if (bVar.l() && bVar.maxEjectionTimeElapsed(l8.longValue())) {
                    bVar.o();
                }
            }
        }

        void f(g gVar, Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                SocketAddress socketAddress = (SocketAddress) it.next();
                if (!this.f3493a.containsKey(socketAddress)) {
                    this.f3493a.put(socketAddress, new b(gVar));
                }
            }
        }

        void g() {
            Iterator it = this.f3493a.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).i();
            }
        }

        void h() {
            Iterator it = this.f3493a.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).n();
            }
        }

        void i(g gVar) {
            Iterator it = this.f3493a.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).k(gVar);
            }
        }
    }

    class d extends O6.c {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC5714a0.d f3494a;

        d(AbstractC5714a0.d dVar) {
            this.f3494a = dVar;
        }

        @Override // O6.c
        protected AbstractC5714a0.d a() {
            return this.f3494a;
        }

        @Override // O6.c, io.grpc.AbstractC5714a0.d
        public AbstractC5714a0.h createSubchannel(AbstractC5714a0.b bVar) {
            i iVar = f.this.new i(this.f3494a.createSubchannel(bVar));
            List<C> addresses = bVar.getAddresses();
            if (f.g(addresses) && f.this.f3476b.containsKey(addresses.get(0).getAddresses().get(0))) {
                b bVar2 = (b) f.this.f3476b.get(addresses.get(0).getAddresses().get(0));
                bVar2.b(iVar);
                if (bVar2.f3488d != null) {
                    iVar.e();
                }
            }
            return iVar;
        }

        @Override // O6.c, io.grpc.AbstractC5714a0.d
        public void updateBalancingState(EnumC5802t enumC5802t, AbstractC5714a0.i iVar) {
            this.f3494a.updateBalancingState(enumC5802t, f.this.new h(iVar));
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        g f3496a;

        /* renamed from: b, reason: collision with root package name */
        AbstractC5727h f3497b;

        e(g gVar, AbstractC5727h abstractC5727h) {
            this.f3496a = gVar;
            this.f3497b = abstractC5727h;
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f3483i = Long.valueOf(fVar.f3480f.currentTimeNanos());
            f.this.f3476b.h();
            for (j jVar : j.forConfig(this.f3496a, this.f3497b)) {
                f fVar2 = f.this;
                jVar.ejectOutliers(fVar2.f3476b, fVar2.f3483i.longValue());
            }
            f fVar3 = f.this;
            fVar3.f3476b.e(fVar3.f3483i);
        }
    }

    /* renamed from: O6.f$f, reason: collision with other inner class name */
    static class C0061f implements j {

        /* renamed from: a, reason: collision with root package name */
        private final g f3499a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC5727h f3500b;

        C0061f(g gVar, AbstractC5727h abstractC5727h) {
            this.f3499a = gVar;
            this.f3500b = abstractC5727h;
        }

        @Override // O6.f.j
        public void ejectOutliers(c cVar, long j8) {
            List<b> listH = f.h(cVar, this.f3499a.failurePercentageEjection.requestVolume.intValue());
            if (listH.size() < this.f3499a.failurePercentageEjection.minimumHosts.intValue() || listH.size() == 0) {
                return;
            }
            for (b bVar : listH) {
                if (cVar.d() >= this.f3499a.maxEjectionPercent.intValue()) {
                    return;
                }
                if (bVar.f() >= this.f3499a.failurePercentageEjection.requestVolume.intValue()) {
                    if (bVar.e() > this.f3499a.failurePercentageEjection.threshold.intValue() / 100.0d) {
                        this.f3500b.log(AbstractC5727h.a.DEBUG, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", bVar, Double.valueOf(bVar.e()));
                        if (new Random().nextInt(100) < this.f3499a.failurePercentageEjection.enforcementPercentage.intValue()) {
                            bVar.d(j8);
                        }
                    }
                }
            }
        }
    }

    public static final class g {
        public final Long baseEjectionTimeNanos;
        public final K0.b childPolicy;
        public final b failurePercentageEjection;
        public final Long intervalNanos;
        public final Integer maxEjectionPercent;
        public final Long maxEjectionTimeNanos;
        public final c successRateEjection;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            Long f3501a = 10000000000L;

            /* renamed from: b, reason: collision with root package name */
            Long f3502b = 30000000000L;

            /* renamed from: c, reason: collision with root package name */
            Long f3503c = 300000000000L;

            /* renamed from: d, reason: collision with root package name */
            Integer f3504d = 10;

            /* renamed from: e, reason: collision with root package name */
            c f3505e;

            /* renamed from: f, reason: collision with root package name */
            b f3506f;

            /* renamed from: g, reason: collision with root package name */
            K0.b f3507g;

            public g build() {
                w.checkState(this.f3507g != null);
                return new g(this.f3501a, this.f3502b, this.f3503c, this.f3504d, this.f3505e, this.f3506f, this.f3507g);
            }

            public a setBaseEjectionTimeNanos(Long l8) {
                w.checkArgument(l8 != null);
                this.f3502b = l8;
                return this;
            }

            public a setChildPolicy(K0.b bVar) {
                w.checkState(bVar != null);
                this.f3507g = bVar;
                return this;
            }

            public a setFailurePercentageEjection(b bVar) {
                this.f3506f = bVar;
                return this;
            }

            public a setIntervalNanos(Long l8) {
                w.checkArgument(l8 != null);
                this.f3501a = l8;
                return this;
            }

            public a setMaxEjectionPercent(Integer num) {
                w.checkArgument(num != null);
                this.f3504d = num;
                return this;
            }

            public a setMaxEjectionTimeNanos(Long l8) {
                w.checkArgument(l8 != null);
                this.f3503c = l8;
                return this;
            }

            public a setSuccessRateEjection(c cVar) {
                this.f3505e = cVar;
                return this;
            }
        }

        public static class b {
            public final Integer enforcementPercentage;
            public final Integer minimumHosts;
            public final Integer requestVolume;
            public final Integer threshold;

            public static class a {

                /* renamed from: a, reason: collision with root package name */
                Integer f3508a = 85;

                /* renamed from: b, reason: collision with root package name */
                Integer f3509b = 100;

                /* renamed from: c, reason: collision with root package name */
                Integer f3510c = 5;

                /* renamed from: d, reason: collision with root package name */
                Integer f3511d = 50;

                public b build() {
                    return new b(this.f3508a, this.f3509b, this.f3510c, this.f3511d);
                }

                public a setEnforcementPercentage(Integer num) {
                    boolean z8 = false;
                    w.checkArgument(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z8 = true;
                    }
                    w.checkArgument(z8);
                    this.f3509b = num;
                    return this;
                }

                public a setMinimumHosts(Integer num) {
                    w.checkArgument(num != null);
                    w.checkArgument(num.intValue() >= 0);
                    this.f3510c = num;
                    return this;
                }

                public a setRequestVolume(Integer num) {
                    w.checkArgument(num != null);
                    w.checkArgument(num.intValue() >= 0);
                    this.f3511d = num;
                    return this;
                }

                public a setThreshold(Integer num) {
                    boolean z8 = false;
                    w.checkArgument(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z8 = true;
                    }
                    w.checkArgument(z8);
                    this.f3508a = num;
                    return this;
                }
            }

            b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.threshold = num;
                this.enforcementPercentage = num2;
                this.minimumHosts = num3;
                this.requestVolume = num4;
            }
        }

        public static class c {
            public final Integer enforcementPercentage;
            public final Integer minimumHosts;
            public final Integer requestVolume;
            public final Integer stdevFactor;

            public static final class a {

                /* renamed from: a, reason: collision with root package name */
                Integer f3512a = 1900;

                /* renamed from: b, reason: collision with root package name */
                Integer f3513b = 100;

                /* renamed from: c, reason: collision with root package name */
                Integer f3514c = 5;

                /* renamed from: d, reason: collision with root package name */
                Integer f3515d = 100;

                public c build() {
                    return new c(this.f3512a, this.f3513b, this.f3514c, this.f3515d);
                }

                public a setEnforcementPercentage(Integer num) {
                    boolean z8 = false;
                    w.checkArgument(num != null);
                    if (num.intValue() >= 0 && num.intValue() <= 100) {
                        z8 = true;
                    }
                    w.checkArgument(z8);
                    this.f3513b = num;
                    return this;
                }

                public a setMinimumHosts(Integer num) {
                    w.checkArgument(num != null);
                    w.checkArgument(num.intValue() >= 0);
                    this.f3514c = num;
                    return this;
                }

                public a setRequestVolume(Integer num) {
                    w.checkArgument(num != null);
                    w.checkArgument(num.intValue() >= 0);
                    this.f3515d = num;
                    return this;
                }

                public a setStdevFactor(Integer num) {
                    w.checkArgument(num != null);
                    this.f3512a = num;
                    return this;
                }
            }

            c(Integer num, Integer num2, Integer num3, Integer num4) {
                this.stdevFactor = num;
                this.enforcementPercentage = num2;
                this.minimumHosts = num3;
                this.requestVolume = num4;
            }
        }

        boolean a() {
            return (this.successRateEjection == null && this.failurePercentageEjection == null) ? false : true;
        }

        private g(Long l8, Long l9, Long l10, Integer num, c cVar, b bVar, K0.b bVar2) {
            this.intervalNanos = l8;
            this.baseEjectionTimeNanos = l9;
            this.maxEjectionTimeNanos = l10;
            this.maxEjectionPercent = num;
            this.successRateEjection = cVar;
            this.failurePercentageEjection = bVar;
            this.childPolicy = bVar2;
        }
    }

    class h extends AbstractC5714a0.i {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5714a0.i f3516a;

        class a extends AbstractC5794n {

            /* renamed from: a, reason: collision with root package name */
            b f3518a;

            public a(b bVar) {
                this.f3518a = bVar;
            }

            @Override // io.grpc.M0
            public void streamClosed(J0 j02) {
                this.f3518a.g(j02.isOk());
            }
        }

        class b extends AbstractC5794n.a {

            /* renamed from: a, reason: collision with root package name */
            private final b f3520a;

            b(b bVar) {
                this.f3520a = bVar;
            }

            @Override // io.grpc.AbstractC5794n.a
            public AbstractC5794n newClientStreamTracer(AbstractC5794n.b bVar, C5728h0 c5728h0) {
                return h.this.new a(this.f3520a);
            }
        }

        h(AbstractC5714a0.i iVar) {
            this.f3516a = iVar;
        }

        @Override // io.grpc.AbstractC5714a0.i
        public AbstractC5714a0.e pickSubchannel(AbstractC5714a0.f fVar) {
            AbstractC5714a0.e eVarPickSubchannel = this.f3516a.pickSubchannel(fVar);
            AbstractC5714a0.h subchannel = eVarPickSubchannel.getSubchannel();
            return subchannel != null ? AbstractC5714a0.e.withSubchannel(subchannel, new b((b) subchannel.getAttributes().get(f.f3475k))) : eVarPickSubchannel;
        }
    }

    class i extends O6.d {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5714a0.h f3522a;

        /* renamed from: b, reason: collision with root package name */
        private b f3523b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3524c;

        /* renamed from: d, reason: collision with root package name */
        private C5803u f3525d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC5714a0.j f3526e;

        /* renamed from: f, reason: collision with root package name */
        private final AbstractC5727h f3527f;

        class a implements AbstractC5714a0.j {

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC5714a0.j f3529a;

            a(AbstractC5714a0.j jVar) {
                this.f3529a = jVar;
            }

            @Override // io.grpc.AbstractC5714a0.j
            public void onSubchannelState(C5803u c5803u) {
                i.this.f3525d = c5803u;
                if (i.this.f3524c) {
                    return;
                }
                this.f3529a.onSubchannelState(c5803u);
            }
        }

        i(AbstractC5714a0.h hVar) {
            this.f3522a = hVar;
            this.f3527f = hVar.getChannelLogger();
        }

        @Override // O6.d
        protected AbstractC5714a0.h a() {
            return this.f3522a;
        }

        void d() {
            this.f3523b = null;
        }

        void e() {
            this.f3524c = true;
            this.f3526e.onSubchannelState(C5803u.forTransientFailure(J0.UNAVAILABLE));
            this.f3527f.log(AbstractC5727h.a.INFO, "Subchannel ejected: {0}", this);
        }

        boolean f() {
            return this.f3524c;
        }

        void g(b bVar) {
            this.f3523b = bVar;
        }

        @Override // O6.d, io.grpc.AbstractC5714a0.h
        public C5713a getAttributes() {
            return this.f3523b != null ? this.f3522a.getAttributes().toBuilder().set(f.f3475k, this.f3523b).build() : this.f3522a.getAttributes();
        }

        void h() {
            this.f3524c = false;
            C5803u c5803u = this.f3525d;
            if (c5803u != null) {
                this.f3526e.onSubchannelState(c5803u);
                this.f3527f.log(AbstractC5727h.a.INFO, "Subchannel unejected: {0}", this);
            }
        }

        @Override // O6.d, io.grpc.AbstractC5714a0.h
        public void start(AbstractC5714a0.j jVar) {
            this.f3526e = jVar;
            super.start(new a(jVar));
        }

        @Override // O6.d
        public String toString() {
            return "OutlierDetectionSubchannel{addresses=" + this.f3522a.getAllAddresses() + '}';
        }

        @Override // O6.d, io.grpc.AbstractC5714a0.h
        public void updateAddresses(List<C> list) {
            if (f.g(getAllAddresses()) && f.g(list)) {
                if (f.this.f3476b.containsValue(this.f3523b)) {
                    this.f3523b.h(this);
                }
                SocketAddress socketAddress = list.get(0).getAddresses().get(0);
                if (f.this.f3476b.containsKey(socketAddress)) {
                    ((b) f.this.f3476b.get(socketAddress)).b(this);
                }
            } else if (!f.g(getAllAddresses()) || f.g(list)) {
                if (!f.g(getAllAddresses()) && f.g(list)) {
                    SocketAddress socketAddress2 = list.get(0).getAddresses().get(0);
                    if (f.this.f3476b.containsKey(socketAddress2)) {
                        ((b) f.this.f3476b.get(socketAddress2)).b(this);
                    }
                }
            } else if (f.this.f3476b.containsKey(getAddresses().getAddresses().get(0))) {
                b bVar = (b) f.this.f3476b.get(getAddresses().getAddresses().get(0));
                bVar.h(this);
                bVar.i();
            }
            this.f3522a.updateAddresses(list);
        }
    }

    interface j {
        static List<j> forConfig(g gVar, AbstractC5727h abstractC5727h) {
            AbstractC5465h0.a aVarBuilder = AbstractC5465h0.builder();
            if (gVar.successRateEjection != null) {
                aVarBuilder.add((Object) new k(gVar, abstractC5727h));
            }
            if (gVar.failurePercentageEjection != null) {
                aVarBuilder.add((Object) new C0061f(gVar, abstractC5727h));
            }
            return aVarBuilder.build();
        }

        void ejectOutliers(c cVar, long j8);
    }

    static class k implements j {

        /* renamed from: a, reason: collision with root package name */
        private final g f3531a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC5727h f3532b;

        k(g gVar, AbstractC5727h abstractC5727h) {
            w.checkArgument(gVar.successRateEjection != null, "success rate ejection config is null");
            this.f3531a = gVar;
            this.f3532b = abstractC5727h;
        }

        static double a(Collection collection) {
            Iterator it = collection.iterator();
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                dDoubleValue += ((Double) it.next()).doubleValue();
            }
            return dDoubleValue / collection.size();
        }

        static double b(Collection collection, double d9) {
            Iterator it = collection.iterator();
            double d10 = 0.0d;
            while (it.hasNext()) {
                double dDoubleValue = ((Double) it.next()).doubleValue() - d9;
                d10 += dDoubleValue * dDoubleValue;
            }
            return Math.sqrt(d10 / collection.size());
        }

        @Override // O6.f.j
        public void ejectOutliers(c cVar, long j8) {
            List<b> listH = f.h(cVar, this.f3531a.successRateEjection.requestVolume.intValue());
            if (listH.size() < this.f3531a.successRateEjection.minimumHosts.intValue() || listH.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = listH.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((b) it.next()).m()));
            }
            double dA = a(arrayList);
            double dB = b(arrayList, dA);
            double dIntValue = dA - ((this.f3531a.successRateEjection.stdevFactor.intValue() / 1000.0f) * dB);
            for (b bVar : listH) {
                if (cVar.d() >= this.f3531a.maxEjectionPercent.intValue()) {
                    return;
                }
                if (bVar.m() < dIntValue) {
                    this.f3532b.log(AbstractC5727h.a.DEBUG, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", bVar, Double.valueOf(bVar.m()), Double.valueOf(dA), Double.valueOf(dB), Double.valueOf(dIntValue));
                    if (new Random().nextInt(100) < this.f3531a.successRateEjection.enforcementPercentage.intValue()) {
                        bVar.d(j8);
                    }
                }
            }
        }
    }

    public f(AbstractC5714a0.d dVar, S0 s02) {
        AbstractC5727h channelLogger = dVar.getChannelLogger();
        this.f3484j = channelLogger;
        d dVar2 = new d((AbstractC5714a0.d) w.checkNotNull(dVar, "helper"));
        this.f3478d = dVar2;
        this.f3479e = new O6.e(dVar2);
        this.f3476b = new c();
        this.f3477c = (N0) w.checkNotNull(dVar.getSynchronizationContext(), "syncContext");
        this.f3481g = (ScheduledExecutorService) w.checkNotNull(dVar.getScheduledExecutorService(), "timeService");
        this.f3480f = s02;
        channelLogger.log(AbstractC5727h.a.DEBUG, "OutlierDetection lb created.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((C) it.next()).getAddresses().size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List h(c cVar, int i8) {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = cVar.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f() >= i8) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // io.grpc.AbstractC5714a0
    public boolean acceptResolvedAddresses(AbstractC5714a0.g gVar) {
        this.f3484j.log(AbstractC5727h.a.DEBUG, "Received resolution result: {0}", gVar);
        g gVar2 = (g) gVar.getLoadBalancingPolicyConfig();
        ArrayList arrayList = new ArrayList();
        Iterator<C> it = gVar.getAddresses().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getAddresses());
        }
        this.f3476b.keySet().retainAll(arrayList);
        this.f3476b.i(gVar2);
        this.f3476b.f(gVar2, arrayList);
        this.f3479e.switchTo(gVar2.childPolicy.getProvider());
        if (gVar2.a()) {
            Long lValueOf = this.f3483i == null ? gVar2.intervalNanos : Long.valueOf(Math.max(0L, gVar2.intervalNanos.longValue() - (this.f3480f.currentTimeNanos() - this.f3483i.longValue())));
            N0.d dVar = this.f3482h;
            if (dVar != null) {
                dVar.cancel();
                this.f3476b.g();
            }
            this.f3482h = this.f3477c.scheduleWithFixedDelay(new e(gVar2, this.f3484j), lValueOf.longValue(), gVar2.intervalNanos.longValue(), TimeUnit.NANOSECONDS, this.f3481g);
        } else {
            N0.d dVar2 = this.f3482h;
            if (dVar2 != null) {
                dVar2.cancel();
                this.f3483i = null;
                this.f3476b.c();
            }
        }
        this.f3479e.handleResolvedAddresses(gVar.toBuilder().setLoadBalancingPolicyConfig(gVar2.childPolicy.getConfig()).build());
        return true;
    }

    @Override // io.grpc.AbstractC5714a0
    public void handleNameResolutionError(J0 j02) {
        this.f3479e.handleNameResolutionError(j02);
    }

    @Override // io.grpc.AbstractC5714a0
    public void shutdown() {
        this.f3479e.shutdown();
    }
}
