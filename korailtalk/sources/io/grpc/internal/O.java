package io.grpc.internal;

import io.grpc.AbstractC5720d0;
import io.grpc.AbstractC5786j;
import io.grpc.C5721e;
import io.grpc.C5730i0;
import io.grpc.EnumC5802t;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
abstract class O extends AbstractC5720d0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5720d0 f32511a;

    O(AbstractC5720d0 abstractC5720d0) {
        this.f32511a = abstractC5720d0;
    }

    @Override // io.grpc.AbstractC5723f
    public String authority() {
        return this.f32511a.authority();
    }

    @Override // io.grpc.AbstractC5720d0
    public boolean awaitTermination(long j8, TimeUnit timeUnit) {
        return this.f32511a.awaitTermination(j8, timeUnit);
    }

    @Override // io.grpc.AbstractC5720d0
    public void enterIdle() {
        this.f32511a.enterIdle();
    }

    @Override // io.grpc.AbstractC5720d0
    public EnumC5802t getState(boolean z8) {
        return this.f32511a.getState(z8);
    }

    @Override // io.grpc.AbstractC5720d0
    public boolean isShutdown() {
        return this.f32511a.isShutdown();
    }

    @Override // io.grpc.AbstractC5720d0
    public boolean isTerminated() {
        return this.f32511a.isTerminated();
    }

    @Override // io.grpc.AbstractC5723f
    public <RequestT, ResponseT> AbstractC5786j newCall(C5730i0 c5730i0, C5721e c5721e) {
        return this.f32511a.newCall(c5730i0, c5721e);
    }

    @Override // io.grpc.AbstractC5720d0
    public void notifyWhenStateChanged(EnumC5802t enumC5802t, Runnable runnable) {
        this.f32511a.notifyWhenStateChanged(enumC5802t, runnable);
    }

    @Override // io.grpc.AbstractC5720d0
    public void resetConnectBackoff() {
        this.f32511a.resetConnectBackoff();
    }

    @Override // io.grpc.AbstractC5720d0
    public AbstractC5720d0 shutdown() {
        return this.f32511a.shutdown();
    }

    @Override // io.grpc.AbstractC5720d0
    public AbstractC5720d0 shutdownNow() {
        return this.f32511a.shutdownNow();
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("delegate", this.f32511a).toString();
    }
}
