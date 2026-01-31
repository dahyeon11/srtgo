package io.grpc.internal;

import io.grpc.InterfaceC5807y;

/* loaded from: classes.dex */
public interface A {
    void close();

    void closeWhenComplete();

    void deframe(y0 y0Var);

    void request(int i8);

    void setDecompressor(InterfaceC5807y interfaceC5807y);

    void setFullStreamDecompressor(V v8);

    void setMaxInboundMessageSize(int i8);
}
