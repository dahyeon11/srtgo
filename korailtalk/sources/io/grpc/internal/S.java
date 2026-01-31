package io.grpc.internal;

import java.io.InputStream;

/* loaded from: classes.dex */
public interface S {
    void close();

    void dispose();

    void flush();

    boolean isClosed();

    S setCompressor(io.grpc.r rVar);

    void setMaxOutboundMessageSize(int i8);

    S setMessageCompression(boolean z8);

    void writePayload(InputStream inputStream);
}
