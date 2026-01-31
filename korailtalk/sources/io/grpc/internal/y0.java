package io.grpc.internal;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface y0 extends Closeable {
    byte[] array();

    int arrayOffset();

    boolean byteBufferSupported();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    ByteBuffer getByteBuffer();

    boolean hasArray();

    void mark();

    boolean markSupported();

    y0 readBytes(int i8);

    void readBytes(OutputStream outputStream, int i8);

    void readBytes(ByteBuffer byteBuffer);

    void readBytes(byte[] bArr, int i8, int i9);

    int readInt();

    int readUnsignedByte();

    int readableBytes();

    void reset();

    void skipBytes(int i8);
}
