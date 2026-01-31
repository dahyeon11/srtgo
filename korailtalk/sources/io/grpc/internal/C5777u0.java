package io.grpc.internal;

import io.grpc.AbstractC5714a0;
import io.grpc.C5803u;
import io.grpc.EnumC5802t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.grpc.internal.u0 */
/* loaded from: classes.dex */
final class C5777u0 extends AbstractC5714a0 {

    /* renamed from: b */
    private final AbstractC5714a0.d f33176b;

    /* renamed from: c */
    private AbstractC5714a0.h f33177c;

    /* renamed from: d */
    private EnumC5802t f33178d = EnumC5802t.IDLE;

    /* renamed from: io.grpc.internal.u0$a */
    class a implements AbstractC5714a0.j {

        /* renamed from: a */
        final /* synthetic */ AbstractC5714a0.h f33179a;

        a(AbstractC5714a0.h hVar) {
            this.f33179a = hVar;
        }

        @Override // io.grpc.AbstractC5714a0.j
        public void onSubchannelState(C5803u c5803u) {
            C5777u0.this.c(this.f33179a, c5803u);
        }
    }

    /* renamed from: io.grpc.internal.u0$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f33181a;

        static {
            int[] iArr = new int[EnumC5802t.values().length];
            f33181a = iArr;
            try {
                iArr[EnumC5802t.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33181a[EnumC5802t.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33181a[EnumC5802t.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33181a[EnumC5802t.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: io.grpc.internal.u0$c */
    public static final class c {

        /* renamed from: a */
        final Long f33182a;
        public final Boolean shuffleAddressList;

        public c(Boolean bool) {
            this(bool, null);
        }

        c(Boolean bool, Long l8) {
            this.shuffleAddressList = bool;
            this.f33182a = l8;
        }
    }

    /* renamed from: io.grpc.internal.u0$d */
    private static final class d extends AbstractC5714a0.i {

        /* renamed from: a */
        private final AbstractC5714a0.e f33183a;

        d(AbstractC5714a0.e eVar) {
            this.f33183a = (AbstractC5714a0.e) e3.w.checkNotNull(eVar, "result");
        }

        @Override // io.grpc.AbstractC5714a0.i
        public AbstractC5714a0.e pickSubchannel(AbstractC5714a0.f fVar) {
            return this.f33183a;
        }

        public String toString() {
            return e3.p.toStringHelper((Class<?>) d.class).add("result", this.f33183a).toString();
        }
    }

    /* renamed from: io.grpc.internal.u0$e */
    private final class e extends AbstractC5714a0.i {

        /* renamed from: a */
        private final AbstractC5714a0.h f33184a;

        /* renamed from: b */
        private final AtomicBoolean f33185b = new AtomicBoolean(false);

        /* renamed from: io.grpc.internal.u0$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f33184a.requestConnection();
            }
        }

        e(AbstractC5714a0.h hVar) {
            this.f33184a = (AbstractC5714a0.h) e3.w.checkNotNull(hVar, "subchannel");
        }

        @Override // io.grpc.AbstractC5714a0.i
        public AbstractC5714a0.e pickSubchannel(AbstractC5714a0.f fVar) {
            if (this.f33185b.compareAndSet(false, true)) {
                C5777u0.this.f33176b.getSynchronizationContext().execute(new a());
            }
            return AbstractC5714a0.e.withNoResult();
        }
    }

    C5777u0(AbstractC5714a0.d dVar) {
        this.f33176b = (AbstractC5714a0.d) e3.w.checkNotNull(dVar, "helper");
    }

    public void c(AbstractC5714a0.h hVar, C5803u c5803u) {
        AbstractC5714a0.i eVar;
        AbstractC5714a0.i dVar;
        EnumC5802t state = c5803u.getState();
        if (state == EnumC5802t.SHUTDOWN) {
            return;
        }
        EnumC5802t enumC5802t = EnumC5802t.TRANSIENT_FAILURE;
        if (state == enumC5802t || state == EnumC5802t.IDLE) {
            this.f33176b.refreshNameResolution();
        }
        if (this.f33178d == enumC5802t) {
            if (state == EnumC5802t.CONNECTING) {
                return;
            }
            if (state == EnumC5802t.IDLE) {
                requestConnection();
                return;
            }
        }
        int i8 = b.f33181a[state.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                dVar = new d(AbstractC5714a0.e.withNoResult());
            } else if (i8 == 3) {
                eVar = new d(AbstractC5714a0.e.withSubchannel(hVar));
            } else {
                if (i8 != 4) {
                    throw new IllegalArgumentException("Unsupported state:" + state);
                }
                dVar = new d(AbstractC5714a0.e.withError(c5803u.getStatus()));
            }
            d(state, dVar);
        }
        eVar = new e(hVar);
        dVar = eVar;
        d(state, dVar);
    }

    private void d(EnumC5802t enumC5802t, AbstractC5714a0.i iVar) {
        this.f33178d = enumC5802t;
        this.f33176b.updateBalancingState(enumC5802t, iVar);
    }

    @Override // io.grpc.AbstractC5714a0
    public boolean acceptResolvedAddresses(AbstractC5714a0.g gVar) {
        c cVar;
        Boolean bool;
        List<io.grpc.C> addresses = gVar.getAddresses();
        if (addresses.isEmpty()) {
            handleNameResolutionError(io.grpc.J0.UNAVAILABLE.withDescription("NameResolver returned no usable address. addrs=" + gVar.getAddresses() + ", attrs=" + gVar.getAttributes()));
            return false;
        }
        if ((gVar.getLoadBalancingPolicyConfig() instanceof c) && (bool = (cVar = (c) gVar.getLoadBalancingPolicyConfig()).shuffleAddressList) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(addresses);
            Collections.shuffle(arrayList, cVar.f33182a != null ? new Random(cVar.f33182a.longValue()) : new Random());
            addresses = arrayList;
        }
        AbstractC5714a0.h hVar = this.f33177c;
        if (hVar != null) {
            hVar.updateAddresses(addresses);
            return true;
        }
        AbstractC5714a0.h hVarCreateSubchannel = this.f33176b.createSubchannel(AbstractC5714a0.b.newBuilder().setAddresses(addresses).build());
        hVarCreateSubchannel.start(new a(hVarCreateSubchannel));
        this.f33177c = hVarCreateSubchannel;
        d(EnumC5802t.CONNECTING, new d(AbstractC5714a0.e.withSubchannel(hVarCreateSubchannel)));
        hVarCreateSubchannel.requestConnection();
        return true;
    }

    @Override // io.grpc.AbstractC5714a0
    public void handleNameResolutionError(io.grpc.J0 j02) {
        AbstractC5714a0.h hVar = this.f33177c;
        if (hVar != null) {
            hVar.shutdown();
            this.f33177c = null;
        }
        d(EnumC5802t.TRANSIENT_FAILURE, new d(AbstractC5714a0.e.withError(j02)));
    }

    @Override // io.grpc.AbstractC5714a0
    public void requestConnection() {
        AbstractC5714a0.h hVar = this.f33177c;
        if (hVar != null) {
            hVar.requestConnection();
        }
    }

    @Override // io.grpc.AbstractC5714a0
    public void shutdown() {
        AbstractC5714a0.h hVar = this.f33177c;
        if (hVar != null) {
            hVar.shutdown();
        }
    }
}
