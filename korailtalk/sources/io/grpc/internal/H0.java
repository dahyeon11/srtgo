package io.grpc.internal;

import io.grpc.AbstractC5787j0;
import java.util.Map;

/* loaded from: classes.dex */
public final class H0 extends AbstractC5787j0.h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32475a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32476b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32477c;

    /* renamed from: d, reason: collision with root package name */
    private final C5754j f32478d;

    public H0(boolean z8, int i8, int i9, C5754j c5754j) {
        this.f32475a = z8;
        this.f32476b = i8;
        this.f32477c = i9;
        this.f32478d = (C5754j) e3.w.checkNotNull(c5754j, "autoLoadBalancerFactory");
    }

    @Override // io.grpc.AbstractC5787j0.h
    public AbstractC5787j0.c parseServiceConfig(Map<String, ?> map) {
        Object config;
        try {
            AbstractC5787j0.c cVarE = this.f32478d.e(map);
            if (cVarE == null) {
                config = null;
            } else {
                if (cVarE.getError() != null) {
                    return AbstractC5787j0.c.fromError(cVarE.getError());
                }
                config = cVarE.getConfig();
            }
            return AbstractC5787j0.c.fromConfig(C5762m0.b(map, this.f32475a, this.f32476b, this.f32477c, config));
        } catch (RuntimeException e8) {
            return AbstractC5787j0.c.fromError(io.grpc.J0.UNKNOWN.withDescription("failed to parse service config").withCause(e8));
        }
    }
}
