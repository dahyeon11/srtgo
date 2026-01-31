package io.grpc.internal;

/* loaded from: classes.dex */
public interface W0 {
    int readableBytes();

    void release();

    int writableBytes();

    void write(byte b9);

    void write(byte[] bArr, int i8, int i9);
}
