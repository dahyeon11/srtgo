package io.grpc.internal;

import io.grpc.AbstractC5794n;
import io.grpc.C5713a;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.internal.InterfaceC5764n0;
import io.grpc.internal.InterfaceC5776u;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
abstract class M implements InterfaceC5782x {
    M() {
    }

    protected abstract InterfaceC5782x a();

    @Override // io.grpc.internal.InterfaceC5782x
    public C5713a getAttributes() {
        return a().getAttributes();
    }

    @Override // io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u, io.grpc.T, io.grpc.Y
    public io.grpc.U getLogId() {
        return a().getLogId();
    }

    @Override // io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u, io.grpc.T
    public com.google.common.util.concurrent.C getStats() {
        return a().getStats();
    }

    @Override // io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u
    public InterfaceC5772s newStream(C5730i0 c5730i0, C5728h0 c5728h0, C5721e c5721e, AbstractC5794n[] abstractC5794nArr) {
        return a().newStream(c5730i0, c5728h0, c5721e, abstractC5794nArr);
    }

    @Override // io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u
    public void ping(InterfaceC5776u.a aVar, Executor executor) {
        a().ping(aVar, executor);
    }

    @Override // io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0
    public void shutdown(io.grpc.J0 j02) {
        a().shutdown(j02);
    }

    @Override // io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0
    public void shutdownNow(io.grpc.J0 j02) {
        a().shutdownNow(j02);
    }

    @Override // io.grpc.internal.InterfaceC5782x, io.grpc.internal.InterfaceC5764n0
    public Runnable start(InterfaceC5764n0.a aVar) {
        return a().start(aVar);
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("delegate", a()).toString();
    }
}
