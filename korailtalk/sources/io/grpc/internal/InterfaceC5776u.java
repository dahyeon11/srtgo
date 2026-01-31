package io.grpc.internal;

import io.grpc.AbstractC5794n;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import java.util.concurrent.Executor;

/* renamed from: io.grpc.internal.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5776u extends io.grpc.T {

    /* renamed from: io.grpc.internal.u$a */
    public interface a {
        void onFailure(Throwable th);

        void onSuccess(long j8);
    }

    @Override // io.grpc.T, io.grpc.Y
    /* synthetic */ io.grpc.U getLogId();

    @Override // io.grpc.T
    /* synthetic */ com.google.common.util.concurrent.C getStats();

    InterfaceC5772s newStream(C5730i0 c5730i0, C5728h0 c5728h0, C5721e c5721e, AbstractC5794n[] abstractC5794nArr);

    void ping(a aVar, Executor executor);
}
