package io.grpc.internal;

import io.grpc.AbstractC5787j0;

/* loaded from: classes.dex */
abstract class P extends AbstractC5787j0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5787j0 f32514a;

    P(AbstractC5787j0 abstractC5787j0) {
        e3.w.checkNotNull(abstractC5787j0, "delegate can not be null");
        this.f32514a = abstractC5787j0;
    }

    @Override // io.grpc.AbstractC5787j0
    public String getServiceAuthority() {
        return this.f32514a.getServiceAuthority();
    }

    @Override // io.grpc.AbstractC5787j0
    public void refresh() {
        this.f32514a.refresh();
    }

    @Override // io.grpc.AbstractC5787j0
    public void shutdown() {
        this.f32514a.shutdown();
    }

    @Override // io.grpc.AbstractC5787j0
    @Deprecated
    public void start(AbstractC5787j0.f fVar) {
        this.f32514a.start(fVar);
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("delegate", this.f32514a).toString();
    }

    @Override // io.grpc.AbstractC5787j0
    public void start(AbstractC5787j0.e eVar) {
        this.f32514a.start(eVar);
    }
}
