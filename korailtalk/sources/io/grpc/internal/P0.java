package io.grpc.internal;

import java.io.InputStream;

/* loaded from: classes.dex */
public interface P0 {
    void flush();

    boolean isReady();

    void optimizeForDirectExecutor();

    void request(int i8);

    void setCompressor(io.grpc.r rVar);

    void setMessageCompression(boolean z8);

    void writeMessage(InputStream inputStream);
}
