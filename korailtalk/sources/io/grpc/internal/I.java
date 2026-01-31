package io.grpc.internal;

import io.grpc.AbstractC5794n;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.internal.InterfaceC5774t;
import io.grpc.internal.InterfaceC5776u;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class I implements InterfaceC5776u {

    /* renamed from: a, reason: collision with root package name */
    final io.grpc.J0 f32479a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5774t.a f32480b;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5776u.a f32481a;

        a(InterfaceC5776u.a aVar) {
            this.f32481a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32481a.onFailure(I.this.f32479a.asException());
        }
    }

    I(io.grpc.J0 j02, InterfaceC5774t.a aVar) {
        e3.w.checkArgument(!j02.isOk(), "error must not be OK");
        this.f32479a = j02;
        this.f32480b = aVar;
    }

    @Override // io.grpc.internal.InterfaceC5776u, io.grpc.T, io.grpc.Y
    public io.grpc.U getLogId() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // io.grpc.internal.InterfaceC5776u, io.grpc.T
    public com.google.common.util.concurrent.C getStats() {
        com.google.common.util.concurrent.M mCreate = com.google.common.util.concurrent.M.create();
        mCreate.set(null);
        return mCreate;
    }

    @Override // io.grpc.internal.InterfaceC5776u
    public InterfaceC5772s newStream(C5730i0 c5730i0, C5728h0 c5728h0, C5721e c5721e, AbstractC5794n[] abstractC5794nArr) {
        return new H(this.f32479a, this.f32480b, abstractC5794nArr);
    }

    @Override // io.grpc.internal.InterfaceC5776u
    public void ping(InterfaceC5776u.a aVar, Executor executor) {
        executor.execute(new a(aVar));
    }
}
