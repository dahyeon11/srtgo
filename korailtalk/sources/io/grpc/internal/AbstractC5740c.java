package io.grpc.internal;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: io.grpc.internal.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5740c implements y0 {
    protected final void a(int i8) {
        if (readableBytes() < i8) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // io.grpc.internal.y0
    public byte[] array() {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.y0
    public int arrayOffset() {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.y0
    public boolean byteBufferSupported() {
        return false;
    }

    @Override // io.grpc.internal.y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.grpc.internal.y0
    public ByteBuffer getByteBuffer() {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.y0
    public boolean hasArray() {
        return false;
    }

    @Override // io.grpc.internal.y0
    public void mark() {
    }

    @Override // io.grpc.internal.y0
    public boolean markSupported() {
        return false;
    }

    @Override // io.grpc.internal.y0
    public abstract /* synthetic */ y0 readBytes(int i8);

    @Override // io.grpc.internal.y0
    public abstract /* synthetic */ void readBytes(OutputStream outputStream, int i8);

    @Override // io.grpc.internal.y0
    public abstract /* synthetic */ void readBytes(ByteBuffer byteBuffer);

    @Override // io.grpc.internal.y0
    public abstract /* synthetic */ void readBytes(byte[] bArr, int i8, int i9);

    @Override // io.grpc.internal.y0
    public final int readInt() {
        a(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    @Override // io.grpc.internal.y0
    public abstract /* synthetic */ int readUnsignedByte();

    @Override // io.grpc.internal.y0
    public abstract /* synthetic */ int readableBytes();

    @Override // io.grpc.internal.y0
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.y0
    public abstract /* synthetic */ void skipBytes(int i8);
}
