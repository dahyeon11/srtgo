package io.grpc;

import io.grpc.AbstractC5714a0;
import io.grpc.AbstractC5787j0;
import java.util.Map;

/* renamed from: io.grpc.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5716b0 extends AbstractC5714a0.c {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5787j0.c f32093a = AbstractC5787j0.c.fromConfig(new a());

    /* renamed from: io.grpc.b0$a */
    private static final class a {
        a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract String getPolicyName();

    public abstract int getPriority();

    public final int hashCode() {
        return super.hashCode();
    }

    public abstract boolean isAvailable();

    public AbstractC5787j0.c parseLoadBalancingPolicyConfig(Map<String, ?> map) {
        return f32093a;
    }

    public final String toString() {
        return e3.p.toStringHelper(this).add("policy", getPolicyName()).add("priority", getPriority()).add("available", isAvailable()).toString();
    }
}
