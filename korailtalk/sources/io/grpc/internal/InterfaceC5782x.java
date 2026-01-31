package io.grpc.internal;

import io.grpc.AbstractC5794n;
import io.grpc.C5713a;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.internal.InterfaceC5764n0;
import io.grpc.internal.InterfaceC5776u;
import java.util.concurrent.Executor;

/* renamed from: io.grpc.internal.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5782x extends InterfaceC5764n0 {
    C5713a getAttributes();

    @Override // io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u, io.grpc.T, io.grpc.Y
    /* synthetic */ io.grpc.U getLogId();

    @Override // io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u, io.grpc.T
    /* synthetic */ com.google.common.util.concurrent.C getStats();

    @Override // io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u
    /* synthetic */ InterfaceC5772s newStream(C5730i0 c5730i0, C5728h0 c5728h0, C5721e c5721e, AbstractC5794n[] abstractC5794nArr);

    @Override // io.grpc.internal.InterfaceC5764n0, io.grpc.internal.InterfaceC5776u
    /* synthetic */ void ping(InterfaceC5776u.a aVar, Executor executor);

    @Override // io.grpc.internal.InterfaceC5764n0
    /* synthetic */ void shutdown(io.grpc.J0 j02);

    @Override // io.grpc.internal.InterfaceC5764n0
    /* synthetic */ void shutdownNow(io.grpc.J0 j02);

    @Override // io.grpc.internal.InterfaceC5764n0
    /* synthetic */ Runnable start(InterfaceC5764n0.a aVar);
}
