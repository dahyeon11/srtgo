package io.grpc.internal;

import io.grpc.C5728h0;
import io.grpc.internal.Q0;

/* renamed from: io.grpc.internal.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5774t extends Q0 {

    /* renamed from: io.grpc.internal.t$a */
    public enum a {
        PROCESSED,
        REFUSED,
        DROPPED,
        MISCARRIED
    }

    void closed(io.grpc.J0 j02, a aVar, C5728h0 c5728h0);

    void headersRead(C5728h0 c5728h0);

    @Override // io.grpc.internal.Q0
    /* synthetic */ void messagesAvailable(Q0.a aVar);

    @Override // io.grpc.internal.Q0
    /* synthetic */ void onReady();
}
