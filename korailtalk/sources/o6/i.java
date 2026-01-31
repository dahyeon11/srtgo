package O6;

import io.grpc.AbstractC5714a0;
import io.grpc.AbstractC5716b0;
import io.grpc.AbstractC5787j0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i extends AbstractC5716b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3547b = 0;

    @Override // io.grpc.AbstractC5716b0
    public String getPolicyName() {
        return "round_robin";
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
        return new h(dVar);
    }

    @Override // io.grpc.AbstractC5716b0
    public AbstractC5787j0.c parseLoadBalancingPolicyConfig(Map<String, ?> map) {
        return AbstractC5787j0.c.fromConfig("no service config");
    }
}
