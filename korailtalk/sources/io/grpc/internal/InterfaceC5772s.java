package io.grpc.internal;

import io.grpc.C5713a;
import io.grpc.C5806x;
import io.grpc.C5808z;
import java.io.InputStream;

/* renamed from: io.grpc.internal.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5772s extends P0 {
    void appendTimeoutInsight(C5737a0 c5737a0);

    void cancel(io.grpc.J0 j02);

    @Override // io.grpc.internal.P0
    /* synthetic */ void flush();

    C5713a getAttributes();

    void halfClose();

    @Override // io.grpc.internal.P0
    /* synthetic */ boolean isReady();

    @Override // io.grpc.internal.P0
    /* synthetic */ void optimizeForDirectExecutor();

    @Override // io.grpc.internal.P0
    /* synthetic */ void request(int i8);

    void setAuthority(String str);

    @Override // io.grpc.internal.P0
    /* synthetic */ void setCompressor(io.grpc.r rVar);

    void setDeadline(C5806x c5806x);

    void setDecompressorRegistry(C5808z c5808z);

    void setFullStreamDecompression(boolean z8);

    void setMaxInboundMessageSize(int i8);

    void setMaxOutboundMessageSize(int i8);

    @Override // io.grpc.internal.P0
    /* synthetic */ void setMessageCompression(boolean z8);

    void start(InterfaceC5774t interfaceC5774t);

    @Override // io.grpc.internal.P0
    /* synthetic */ void writeMessage(InputStream inputStream);
}
