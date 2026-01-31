package io.grpc.internal;

import e3.AbstractC5354D;
import io.grpc.AbstractC5714a0;
import io.grpc.AbstractC5716b0;
import io.grpc.AbstractC5787j0;
import io.grpc.internal.C5777u0;
import java.util.Map;

/* renamed from: io.grpc.internal.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5779v0 extends AbstractC5716b0 {

    /* renamed from: b, reason: collision with root package name */
    static boolean f33195b = !AbstractC5354D.isNullOrEmpty(System.getenv("GRPC_EXPERIMENTAL_PICKFIRST_LB_CONFIG"));

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f33196c = 0;

    @Override // io.grpc.AbstractC5716b0
    public String getPolicyName() {
        return U.DEFAULT_LB_POLICY;
    }

    @Override // io.grpc.AbstractC5716b0
    public int getPriority() {
        return 5;
    }

    @Override // io.grpc.AbstractC5716b0
    public boolean isAvailable() {
        return true;
    }

    @Override // io.grpc.AbstractC5714a0.c
    public AbstractC5714a0 newLoadBalancer(AbstractC5714a0.d dVar) {
        return new C5777u0(dVar);
    }

    @Override // io.grpc.AbstractC5716b0
    public AbstractC5787j0.c parseLoadBalancingPolicyConfig(Map<String, ?> map) {
        if (!f33195b) {
            return AbstractC5787j0.c.fromConfig("no service config");
        }
        try {
            return AbstractC5787j0.c.fromConfig(new C5777u0.c(C5745e0.getBoolean(map, "shuffleAddressList")));
        } catch (RuntimeException e8) {
            return AbstractC5787j0.c.fromError(io.grpc.J0.UNAVAILABLE.withCause(e8).withDescription("Failed parsing configuration for " + getPolicyName()));
        }
    }
}
