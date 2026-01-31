package O6;

import e3.p;
import e3.w;
import io.grpc.AbstractC5714a0;
import io.grpc.C5803u;
import io.grpc.EnumC5802t;
import io.grpc.J0;

/* loaded from: classes2.dex */
public final class e extends O6.b {

    /* renamed from: k, reason: collision with root package name */
    static final AbstractC5714a0.i f3460k = new c();

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5714a0 f3461b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5714a0.d f3462c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC5714a0.c f3463d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC5714a0 f3464e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC5714a0.c f3465f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC5714a0 f3466g;

    /* renamed from: h, reason: collision with root package name */
    private EnumC5802t f3467h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC5714a0.i f3468i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f3469j;

    class b extends O6.c {

        /* renamed from: a, reason: collision with root package name */
        AbstractC5714a0 f3473a;

        b() {
        }

        @Override // O6.c
        protected AbstractC5714a0.d a() {
            return e.this.f3462c;
        }

        @Override // O6.c, io.grpc.AbstractC5714a0.d
        public void updateBalancingState(EnumC5802t enumC5802t, AbstractC5714a0.i iVar) {
            if (this.f3473a == e.this.f3466g) {
                w.checkState(e.this.f3469j, "there's pending lb while current lb has been out of READY");
                e.this.f3467h = enumC5802t;
                e.this.f3468i = iVar;
                if (enumC5802t == EnumC5802t.READY) {
                    e.this.k();
                    return;
                }
                return;
            }
            if (this.f3473a == e.this.f3464e) {
                e.this.f3469j = enumC5802t == EnumC5802t.READY;
                if (e.this.f3469j || e.this.f3466g == e.this.f3461b) {
                    e.this.f3462c.updateBalancingState(enumC5802t, iVar);
                } else {
                    e.this.k();
                }
            }
        }
    }

    class c extends AbstractC5714a0.i {
        c() {
        }

        @Override // io.grpc.AbstractC5714a0.i
        public AbstractC5714a0.e pickSubchannel(AbstractC5714a0.f fVar) {
            return AbstractC5714a0.e.withNoResult();
        }

        public String toString() {
            return "BUFFER_PICKER";
        }
    }

    public e(AbstractC5714a0.d dVar) {
        a aVar = new a();
        this.f3461b = aVar;
        this.f3464e = aVar;
        this.f3466g = aVar;
        this.f3462c = (AbstractC5714a0.d) w.checkNotNull(dVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f3462c.updateBalancingState(this.f3467h, this.f3468i);
        this.f3464e.shutdown();
        this.f3464e = this.f3466g;
        this.f3463d = this.f3465f;
        this.f3466g = this.f3461b;
        this.f3465f = null;
    }

    @Override // O6.b
    protected AbstractC5714a0 a() {
        AbstractC5714a0 abstractC5714a0 = this.f3466g;
        return abstractC5714a0 == this.f3461b ? this.f3464e : abstractC5714a0;
    }

    @Override // O6.b, io.grpc.AbstractC5714a0
    @Deprecated
    public void handleSubchannelState(AbstractC5714a0.h hVar, C5803u c5803u) {
        throw new UnsupportedOperationException("handleSubchannelState() is not supported by " + e.class.getName());
    }

    @Override // O6.b, io.grpc.AbstractC5714a0
    public void shutdown() {
        this.f3466g.shutdown();
        this.f3464e.shutdown();
    }

    public void switchTo(AbstractC5714a0.c cVar) {
        w.checkNotNull(cVar, "newBalancerFactory");
        if (cVar.equals(this.f3465f)) {
            return;
        }
        this.f3466g.shutdown();
        this.f3466g = this.f3461b;
        this.f3465f = null;
        this.f3467h = EnumC5802t.CONNECTING;
        this.f3468i = f3460k;
        if (cVar.equals(this.f3463d)) {
            return;
        }
        b bVar = new b();
        AbstractC5714a0 abstractC5714a0NewLoadBalancer = cVar.newLoadBalancer(bVar);
        bVar.f3473a = abstractC5714a0NewLoadBalancer;
        this.f3466g = abstractC5714a0NewLoadBalancer;
        this.f3465f = cVar;
        if (this.f3469j) {
            return;
        }
        k();
    }

    class a extends AbstractC5714a0 {

        /* renamed from: O6.e$a$a, reason: collision with other inner class name */
        class C0060a extends AbstractC5714a0.i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ J0 f3471a;

            C0060a(J0 j02) {
                this.f3471a = j02;
            }

            @Override // io.grpc.AbstractC5714a0.i
            public AbstractC5714a0.e pickSubchannel(AbstractC5714a0.f fVar) {
                return AbstractC5714a0.e.withError(this.f3471a);
            }

            public String toString() {
                return p.toStringHelper((Class<?>) C0060a.class).add("error", this.f3471a).toString();
            }
        }

        a() {
        }

        @Override // io.grpc.AbstractC5714a0
        public void handleNameResolutionError(J0 j02) {
            e.this.f3462c.updateBalancingState(EnumC5802t.TRANSIENT_FAILURE, new C0060a(j02));
        }

        @Override // io.grpc.AbstractC5714a0
        public void handleResolvedAddresses(AbstractC5714a0.g gVar) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // io.grpc.AbstractC5714a0
        public void shutdown() {
        }
    }
}
