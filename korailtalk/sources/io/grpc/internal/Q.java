package io.grpc.internal;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class Q implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private final y0 f32515a;

    protected Q(y0 y0Var) {
        this.f32515a = (y0) e3.w.checkNotNull(y0Var, "buf");
    }

    @Override // io.grpc.internal.y0
    public byte[] array() {
        return this.f32515a.array();
    }

    @Override // io.grpc.internal.y0
    public int arrayOffset() {
        return this.f32515a.arrayOffset();
    }

    @Override // io.grpc.internal.y0
    public boolean byteBufferSupported() {
        return this.f32515a.byteBufferSupported();
    }

    @Override // io.grpc.internal.y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32515a.close();
    }

    @Override // io.grpc.internal.y0
    public ByteBuffer getByteBuffer() {
        return this.f32515a.getByteBuffer();
    }

    @Override // io.grpc.internal.y0
    public boolean hasArray() {
        return this.f32515a.hasArray();
    }

    @Override // io.grpc.internal.y0
    public void mark() {
        this.f32515a.mark();
    }

    @Override // io.grpc.internal.y0
    public boolean markSupported() {
        return this.f32515a.markSupported();
    }

    @Override // io.grpc.internal.y0
    public void readBytes(byte[] bArr, int i8, int i9) {
        this.f32515a.readBytes(bArr, i8, i9);
    }

    @Override // io.grpc.internal.y0
    public int readInt() {
        return this.f32515a.readInt();
    }

    @Override // io.grpc.internal.y0
    public int readUnsignedByte() {
        return this.f32515a.readUnsignedByte();
    }

    @Override // io.grpc.internal.y0
    public int readableBytes() {
        return this.f32515a.readableBytes();
    }

    @Override // io.grpc.internal.y0
    public void reset() {
        this.f32515a.reset();
    }

    @Override // io.grpc.internal.y0
    public void skipBytes(int i8) {
        this.f32515a.skipBytes(i8);
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("delegate", this.f32515a).toString();
    }

    @Override // io.grpc.internal.y0
    public void readBytes(ByteBuffer byteBuffer) {
        this.f32515a.readBytes(byteBuffer);
    }

    @Override // io.grpc.internal.y0
    public void readBytes(OutputStream outputStream, int i8) {
        this.f32515a.readBytes(outputStream, i8);
    }

    @Override // io.grpc.internal.y0
    public y0 readBytes(int i8) {
        return this.f32515a.readBytes(i8);
    }
}
