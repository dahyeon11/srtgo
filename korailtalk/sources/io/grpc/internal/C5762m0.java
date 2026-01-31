package io.grpc.internal;

import e3.AbstractC5354D;
import io.grpc.AbstractC5714a0;
import io.grpc.C5721e;
import io.grpc.C5730i0;
import io.grpc.P;
import io.grpc.internal.C0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: io.grpc.internal.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5762m0 {

    /* renamed from: a, reason: collision with root package name */
    private final b f33001a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f33002b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f33003c;

    /* renamed from: d, reason: collision with root package name */
    private final C0.E f33004d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f33005e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f33006f;

    /* renamed from: io.grpc.internal.m0$b */
    static final class b {

        /* renamed from: g, reason: collision with root package name */
        static final C5721e.c f33007g = C5721e.c.create("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a, reason: collision with root package name */
        final Long f33008a;

        /* renamed from: b, reason: collision with root package name */
        final Boolean f33009b;

        /* renamed from: c, reason: collision with root package name */
        final Integer f33010c;

        /* renamed from: d, reason: collision with root package name */
        final Integer f33011d;

        /* renamed from: e, reason: collision with root package name */
        final D0 f33012e;

        /* renamed from: f, reason: collision with root package name */
        final W f33013f;

        b(Map map, boolean z8, int i8, int i9) {
            this.f33008a = K0.u(map);
            this.f33009b = K0.v(map);
            Integer numJ = K0.j(map);
            this.f33010c = numJ;
            if (numJ != null) {
                e3.w.checkArgument(numJ.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numJ);
            }
            Integer numI = K0.i(map);
            this.f33011d = numI;
            if (numI != null) {
                e3.w.checkArgument(numI.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numI);
            }
            Map mapP = z8 ? K0.p(map) : null;
            this.f33012e = mapP == null ? null : b(mapP, i8);
            Map mapC = z8 ? K0.c(map) : null;
            this.f33013f = mapC != null ? a(mapC, i9) : null;
        }

        private static W a(Map map, int i8) {
            int iIntValue = ((Integer) e3.w.checkNotNull(K0.f(map), "maxAttempts cannot be empty")).intValue();
            e3.w.checkArgument(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i8);
            long jLongValue = ((Long) e3.w.checkNotNull(K0.b(map), "hedgingDelay cannot be empty")).longValue();
            e3.w.checkArgument(jLongValue >= 0, "hedgingDelay must not be negative: %s", jLongValue);
            return new W(iMin, jLongValue, K0.n(map));
        }

        private static D0 b(Map map, int i8) {
            int iIntValue = ((Integer) e3.w.checkNotNull(K0.g(map), "maxAttempts cannot be empty")).intValue();
            e3.w.checkArgument(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i8);
            long jLongValue = ((Long) e3.w.checkNotNull(K0.d(map), "initialBackoff cannot be empty")).longValue();
            e3.w.checkArgument(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            long jLongValue2 = ((Long) e3.w.checkNotNull(K0.h(map), "maxBackoff cannot be empty")).longValue();
            e3.w.checkArgument(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double d9 = (Double) e3.w.checkNotNull(K0.a(map), "backoffMultiplier cannot be empty");
            double dDoubleValue = d9.doubleValue();
            e3.w.checkArgument(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", d9);
            Long lO = K0.o(map);
            e3.w.checkArgument(lO == null || lO.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lO);
            Set setQ = K0.q(map);
            e3.w.checkArgument((lO == null && setQ.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new D0(iMin, jLongValue, jLongValue2, dDoubleValue, lO, setQ);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return e3.r.equal(this.f33008a, bVar.f33008a) && e3.r.equal(this.f33009b, bVar.f33009b) && e3.r.equal(this.f33010c, bVar.f33010c) && e3.r.equal(this.f33011d, bVar.f33011d) && e3.r.equal(this.f33012e, bVar.f33012e) && e3.r.equal(this.f33013f, bVar.f33013f);
        }

        public int hashCode() {
            return e3.r.hashCode(this.f33008a, this.f33009b, this.f33010c, this.f33011d, this.f33012e, this.f33013f);
        }

        public String toString() {
            return e3.p.toStringHelper(this).add("timeoutNanos", this.f33008a).add("waitForReady", this.f33009b).add("maxInboundMessageSize", this.f33010c).add("maxOutboundMessageSize", this.f33011d).add("retryPolicy", this.f33012e).add("hedgingPolicy", this.f33013f).toString();
        }
    }

    /* renamed from: io.grpc.internal.m0$c */
    static final class c extends io.grpc.P {

        /* renamed from: a, reason: collision with root package name */
        final C5762m0 f33014a;

        @Override // io.grpc.P
        public P.b selectConfig(AbstractC5714a0.f fVar) {
            return P.b.newBuilder().setConfig(this.f33014a).build();
        }

        private c(C5762m0 c5762m0) {
            this.f33014a = c5762m0;
        }
    }

    C5762m0(b bVar, Map map, Map map2, C0.E e8, Object obj, Map map3) {
        this.f33001a = bVar;
        this.f33002b = Collections.unmodifiableMap(new HashMap(map));
        this.f33003c = Collections.unmodifiableMap(new HashMap(map2));
        this.f33004d = e8;
        this.f33005e = obj;
        this.f33006f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    static C5762m0 a() {
        return new C5762m0(null, new HashMap(), new HashMap(), null, null, null);
    }

    static C5762m0 b(Map map, boolean z8, int i8, int i9, Object obj) {
        C0.E eT = z8 ? K0.t(map) : null;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map<String, ?> healthCheckedService = K0.getHealthCheckedService(map);
        List<Map> listK = K0.k(map);
        if (listK == null) {
            return new C5762m0(null, map2, map3, eT, obj, healthCheckedService);
        }
        b bVar = null;
        for (Map map4 : listK) {
            b bVar2 = new b(map4, z8, i8, i9);
            List<Map> listM = K0.m(map4);
            if (listM != null && !listM.isEmpty()) {
                for (Map map5 : listM) {
                    String strR = K0.r(map5);
                    String strL = K0.l(map5);
                    if (AbstractC5354D.isNullOrEmpty(strR)) {
                        e3.w.checkArgument(AbstractC5354D.isNullOrEmpty(strL), "missing service name for method %s", strL);
                        e3.w.checkArgument(bVar == null, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else if (AbstractC5354D.isNullOrEmpty(strL)) {
                        e3.w.checkArgument(!map3.containsKey(strR), "Duplicate service %s", strR);
                        map3.put(strR, bVar2);
                    } else {
                        String strGenerateFullMethodName = C5730i0.generateFullMethodName(strR, strL);
                        e3.w.checkArgument(!map2.containsKey(strGenerateFullMethodName), "Duplicate method name %s", strGenerateFullMethodName);
                        map2.put(strGenerateFullMethodName, bVar2);
                    }
                }
            }
        }
        return new C5762m0(bVar, map2, map3, eT, obj, healthCheckedService);
    }

    io.grpc.P c() {
        if (this.f33003c.isEmpty() && this.f33002b.isEmpty() && this.f33001a == null) {
            return null;
        }
        return new c();
    }

    Map d() {
        return this.f33006f;
    }

    Object e() {
        return this.f33005e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5762m0.class != obj.getClass()) {
            return false;
        }
        C5762m0 c5762m0 = (C5762m0) obj;
        return e3.r.equal(this.f33001a, c5762m0.f33001a) && e3.r.equal(this.f33002b, c5762m0.f33002b) && e3.r.equal(this.f33003c, c5762m0.f33003c) && e3.r.equal(this.f33004d, c5762m0.f33004d) && e3.r.equal(this.f33005e, c5762m0.f33005e);
    }

    b f(C5730i0 c5730i0) {
        b bVar = (b) this.f33002b.get(c5730i0.getFullMethodName());
        if (bVar == null) {
            bVar = (b) this.f33003c.get(c5730i0.getServiceName());
        }
        return bVar == null ? this.f33001a : bVar;
    }

    C0.E g() {
        return this.f33004d;
    }

    public int hashCode() {
        return e3.r.hashCode(this.f33001a, this.f33002b, this.f33003c, this.f33004d, this.f33005e);
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("defaultMethodConfig", this.f33001a).add("serviceMethodMap", this.f33002b).add("serviceMap", this.f33003c).add("retryThrottling", this.f33004d).add("loadBalancingConfig", this.f33005e).toString();
    }
}
