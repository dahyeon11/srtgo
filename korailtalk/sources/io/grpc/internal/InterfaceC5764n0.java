package io.grpc.internal;

import io.grpc.AbstractC5794n;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.internal.InterfaceC5776u;
import java.util.concurrent.Executor;

/* renamed from: io.grpc.internal.n0 */
/* loaded from: classes.dex */
public interface InterfaceC5764n0 extends InterfaceC5776u {

    /* renamed from: io.grpc.internal.n0$a */
    public interface a {
        void transportInUse(boolean z8);

        void transportReady();

        void transportShutdown(io.grpc.J0 j02);

        void transportTerminated();
    }

    @Override // io.grpc.internal.InterfaceC5776u, io.grpc.T, io.grpc.Y
    /* synthetic */ io.grpc.U getLogId();

    @Override // io.grpc.internal.InterfaceC5776u, io.grpc.T
    /* synthetic */ com.google.common.util.concurrent.C getStats();

    @Override // io.grpc.internal.InterfaceC5776u
    /* synthetic */ InterfaceC5772s newStream(C5730i0 c5730i0, C5728h0 c5728h0, C5721e c5721e, AbstractC5794n[] abstractC5794nArr);

    @Override // io.grpc.internal.InterfaceC5776u
    /* synthetic */ void ping(InterfaceC5776u.a aVar, Executor executor);

    void shutdown(io.grpc.J0 j02);

    void shutdownNow(io.grpc.J0 j02);

    Runnable start(a aVar);
}
