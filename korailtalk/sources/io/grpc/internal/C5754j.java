package io.grpc.internal;

import io.grpc.AbstractC5714a0;
import io.grpc.AbstractC5716b0;
import io.grpc.AbstractC5727h;
import io.grpc.AbstractC5787j0;
import io.grpc.C5718c0;
import io.grpc.EnumC5802t;
import io.grpc.internal.K0;
import java.util.List;
import java.util.Map;

/* renamed from: io.grpc.internal.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5754j {

    /* renamed from: a, reason: collision with root package name */
    private final C5718c0 f32753a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32754b;

    /* renamed from: io.grpc.internal.j$b */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5714a0.d f32755a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5714a0 f32756b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC5716b0 f32757c;

        b(AbstractC5714a0.d dVar) {
            this.f32755a = dVar;
            AbstractC5716b0 provider = C5754j.this.f32753a.getProvider(C5754j.this.f32754b);
            this.f32757c = provider;
            if (provider != null) {
                this.f32756b = provider.newLoadBalancer(dVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + C5754j.this.f32754b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        void a(io.grpc.J0 j02) {
            getDelegate().handleNameResolutionError(j02);
        }

        void b() {
            getDelegate().requestConnection();
        }

        void c() {
            this.f32756b.shutdown();
            this.f32756b = null;
        }

        boolean d(AbstractC5714a0.g gVar) {
            K0.b bVar = (K0.b) gVar.getLoadBalancingPolicyConfig();
            if (bVar == null) {
                try {
                    C5754j c5754j = C5754j.this;
                    bVar = new K0.b(c5754j.d(c5754j.f32754b, "using default policy"), null);
                } catch (f e8) {
                    this.f32755a.updateBalancingState(EnumC5802t.TRANSIENT_FAILURE, new d(io.grpc.J0.INTERNAL.withDescription(e8.getMessage())));
                    this.f32756b.shutdown();
                    this.f32757c = null;
                    this.f32756b = new e();
                    return true;
                }
            }
            if (this.f32757c == null || !bVar.f32495a.getPolicyName().equals(this.f32757c.getPolicyName())) {
                this.f32755a.updateBalancingState(EnumC5802t.CONNECTING, new c());
                this.f32756b.shutdown();
                AbstractC5716b0 abstractC5716b0 = bVar.f32495a;
                this.f32757c = abstractC5716b0;
                AbstractC5714a0 abstractC5714a0 = this.f32756b;
                this.f32756b = abstractC5716b0.newLoadBalancer(this.f32755a);
                this.f32755a.getChannelLogger().log(AbstractC5727h.a.INFO, "Load balancer changed from {0} to {1}", abstractC5714a0.getClass().getSimpleName(), this.f32756b.getClass().getSimpleName());
            }
            Object obj = bVar.f32496b;
            if (obj != null) {
                this.f32755a.getChannelLogger().log(AbstractC5727h.a.DEBUG, "Load-balancing config: {0}", bVar.f32496b);
            }
            return getDelegate().acceptResolvedAddresses(AbstractC5714a0.g.newBuilder().setAddresses(gVar.getAddresses()).setAttributes(gVar.getAttributes()).setLoadBalancingPolicyConfig(obj).build());
        }

        public AbstractC5714a0 getDelegate() {
            return this.f32756b;
        }
    }

    /* renamed from: io.grpc.internal.j$c */
    private static final class c extends AbstractC5714a0.i {
        private c() {
        }

        @Override // io.grpc.AbstractC5714a0.i
        public AbstractC5714a0.e pickSubchannel(AbstractC5714a0.f fVar) {
            return AbstractC5714a0.e.withNoResult();
        }

        public String toString() {
            return e3.p.toStringHelper((Class<?>) c.class).toString();
        }
    }

    /* renamed from: io.grpc.internal.j$d */
    private static final class d extends AbstractC5714a0.i {

        /* renamed from: a, reason: collision with root package name */
        private final io.grpc.J0 f32759a;

        d(io.grpc.J0 j02) {
            this.f32759a = j02;
        }

        @Override // io.grpc.AbstractC5714a0.i
        public AbstractC5714a0.e pickSubchannel(AbstractC5714a0.f fVar) {
            return AbstractC5714a0.e.withError(this.f32759a);
        }
    }

    /* renamed from: io.grpc.internal.j$e */
    private static final class e extends AbstractC5714a0 {
        private e() {
        }

        @Override // io.grpc.AbstractC5714a0
        public boolean acceptResolvedAddresses(AbstractC5714a0.g gVar) {
            return true;
        }

        @Override // io.grpc.AbstractC5714a0
        public void handleNameResolutionError(io.grpc.J0 j02) {
        }

        @Override // io.grpc.AbstractC5714a0
        @Deprecated
        public void handleResolvedAddresses(AbstractC5714a0.g gVar) {
        }

        @Override // io.grpc.AbstractC5714a0
        public void shutdown() {
        }
    }

    /* renamed from: io.grpc.internal.j$f */
    static final class f extends Exception {
        private f(String str) {
            super(str);
        }
    }

    public C5754j(String str) {
        this(C5718c0.getDefaultRegistry(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC5716b0 d(String str, String str2) throws f {
        AbstractC5716b0 provider = this.f32753a.getProvider(str);
        if (provider != null) {
            return provider;
        }
        throw new f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    AbstractC5787j0.c e(Map map) {
        List<K0.a> listUnwrapLoadBalancingConfigList;
        if (map != null) {
            try {
                listUnwrapLoadBalancingConfigList = K0.unwrapLoadBalancingConfigList(K0.getLoadBalancingConfigsFromServiceConfig(map));
            } catch (RuntimeException e8) {
                return AbstractC5787j0.c.fromError(io.grpc.J0.UNKNOWN.withDescription("can't parse load balancer configuration").withCause(e8));
            }
        } else {
            listUnwrapLoadBalancingConfigList = null;
        }
        if (listUnwrapLoadBalancingConfigList == null || listUnwrapLoadBalancingConfigList.isEmpty()) {
            return null;
        }
        return K0.selectLbPolicyFromList(listUnwrapLoadBalancingConfigList, this.f32753a);
    }

    public b newLoadBalancer(AbstractC5714a0.d dVar) {
        return new b(dVar);
    }

    C5754j(C5718c0 c5718c0, String str) {
        this.f32753a = (C5718c0) e3.w.checkNotNull(c5718c0, "registry");
        this.f32754b = (String) e3.w.checkNotNull(str, "defaultPolicy");
    }
}
