package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
class b extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    final OutputStream f7669a;

    /* renamed from: b, reason: collision with root package name */
    private ByteOrder f7670b;

    b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f7669a = outputStream;
        this.f7670b = byteOrder;
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.f7670b = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f7669a.write(bArr);
    }

    public void writeByte(int i8) throws IOException {
        this.f7669a.write(i8);
    }

    public void writeInt(int i8) throws IOException {
        ByteOrder byteOrder = this.f7670b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f7669a.write(i8 & 255);
            this.f7669a.write((i8 >>> 8) & 255);
            this.f7669a.write((i8 >>> 16) & 255);
            this.f7669a.write((i8 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f7669a.write((i8 >>> 24) & 255);
            this.f7669a.write((i8 >>> 16) & 255);
            this.f7669a.write((i8 >>> 8) & 255);
            this.f7669a.write(i8 & 255);
        }
    }

    public void writeShort(short s8) throws IOException {
        ByteOrder byteOrder = this.f7670b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f7669a.write(s8 & 255);
            this.f7669a.write((s8 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f7669a.write((s8 >>> 8) & 255);
            this.f7669a.write(s8 & 255);
        }
    }

    public void writeUnsignedInt(long j8) throws IOException {
        writeInt((int) j8);
    }

    public void writeUnsignedShort(int i8) throws IOException {
        writeShort((short) i8);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i8, int i9) throws IOException {
        this.f7669a.write(bArr, i8, i9);
    }
}
