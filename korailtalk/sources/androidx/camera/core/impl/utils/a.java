package androidx.camera.core.impl.utils;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class a extends InputStream implements DataInput {

    /* renamed from: e, reason: collision with root package name */
    private static final ByteOrder f7663e = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: f, reason: collision with root package name */
    private static final ByteOrder f7664f = ByteOrder.BIG_ENDIAN;

    /* renamed from: a, reason: collision with root package name */
    private final DataInputStream f7665a;

    /* renamed from: b, reason: collision with root package name */
    private ByteOrder f7666b;

    /* renamed from: c, reason: collision with root package name */
    final int f7667c;

    /* renamed from: d, reason: collision with root package name */
    int f7668d;

    a(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f7665a.available();
    }

    public int getLength() {
        return this.f7667c;
    }

    @Override // java.io.InputStream
    public void mark(int i8) {
        synchronized (this.f7665a) {
            this.f7665a.mark(i8);
        }
    }

    public int peek() {
        return this.f7668d;
    }

    @Override // java.io.InputStream
    public int read() {
        this.f7668d++;
        return this.f7665a.read();
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        this.f7668d++;
        return this.f7665a.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        int i8 = this.f7668d + 1;
        this.f7668d = i8;
        if (i8 > this.f7667c) {
            throw new EOFException();
        }
        int i9 = this.f7665a.read();
        if (i9 >= 0) {
            return (byte) i9;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() {
        this.f7668d += 2;
        return this.f7665a.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i8, int i9) throws IOException {
        int i10 = this.f7668d + i9;
        this.f7668d = i10;
        if (i10 > this.f7667c) {
            throw new EOFException();
        }
        if (this.f7665a.read(bArr, i8, i9) != i9) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        int i8 = this.f7668d + 4;
        this.f7668d = i8;
        if (i8 > this.f7667c) {
            throw new EOFException();
        }
        int i9 = this.f7665a.read();
        int i10 = this.f7665a.read();
        int i11 = this.f7665a.read();
        int i12 = this.f7665a.read();
        if ((i9 | i10 | i11 | i12) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f7666b;
        if (byteOrder == f7663e) {
            return (i12 << 24) + (i11 << 16) + (i10 << 8) + i9;
        }
        if (byteOrder == f7664f) {
            return (i9 << 24) + (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IOException("Invalid byte order: " + this.f7666b);
    }

    @Override // java.io.DataInput
    public String readLine() {
        throw new UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        int i8 = this.f7668d + 8;
        this.f7668d = i8;
        if (i8 > this.f7667c) {
            throw new EOFException();
        }
        int i9 = this.f7665a.read();
        int i10 = this.f7665a.read();
        int i11 = this.f7665a.read();
        int i12 = this.f7665a.read();
        int i13 = this.f7665a.read();
        int i14 = this.f7665a.read();
        int i15 = this.f7665a.read();
        int i16 = this.f7665a.read();
        if ((i9 | i10 | i11 | i12 | i13 | i14 | i15 | i16) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f7666b;
        if (byteOrder == f7663e) {
            return (i16 << 56) + (i15 << 48) + (i14 << 40) + (i13 << 32) + (i12 << 24) + (i11 << 16) + (i10 << 8) + i9;
        }
        if (byteOrder == f7664f) {
            return (i9 << 56) + (i10 << 48) + (i11 << 40) + (i12 << 32) + (i13 << 24) + (i14 << 16) + (i15 << 8) + i16;
        }
        throw new IOException("Invalid byte order: " + this.f7666b);
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        int i8 = this.f7668d + 2;
        this.f7668d = i8;
        if (i8 > this.f7667c) {
            throw new EOFException();
        }
        int i9 = this.f7665a.read();
        int i10 = this.f7665a.read();
        if ((i9 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f7666b;
        if (byteOrder == f7663e) {
            return (short) ((i10 << 8) + i9);
        }
        if (byteOrder == f7664f) {
            return (short) ((i9 << 8) + i10);
        }
        throw new IOException("Invalid byte order: " + this.f7666b);
    }

    @Override // java.io.DataInput
    public String readUTF() {
        this.f7668d += 2;
        return this.f7665a.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        this.f7668d++;
        return this.f7665a.readUnsignedByte();
    }

    public long readUnsignedInt() {
        return readInt() & 4294967295L;
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        int i8 = this.f7668d + 2;
        this.f7668d = i8;
        if (i8 > this.f7667c) {
            throw new EOFException();
        }
        int i9 = this.f7665a.read();
        int i10 = this.f7665a.read();
        if ((i9 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f7666b;
        if (byteOrder == f7663e) {
            return (i10 << 8) + i9;
        }
        if (byteOrder == f7664f) {
            return (i9 << 8) + i10;
        }
        throw new IOException("Invalid byte order: " + this.f7666b);
    }

    public void seek(long j8) throws IOException {
        int i8 = this.f7668d;
        if (i8 > j8) {
            this.f7668d = 0;
            this.f7665a.reset();
            this.f7665a.mark(this.f7667c);
        } else {
            j8 -= i8;
        }
        int i9 = (int) j8;
        if (skipBytes(i9) != i9) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.f7666b = byteOrder;
    }

    @Override // java.io.DataInput
    public int skipBytes(int i8) {
        int iMin = Math.min(i8, this.f7667c - this.f7668d);
        int iSkipBytes = 0;
        while (iSkipBytes < iMin) {
            iSkipBytes += this.f7665a.skipBytes(iMin - iSkipBytes);
        }
        this.f7668d += iSkipBytes;
        return iSkipBytes;
    }

    a(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        this.f7666b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f7665a = dataInputStream;
        int iAvailable = dataInputStream.available();
        this.f7667c = iAvailable;
        this.f7668d = 0;
        dataInputStream.mark(iAvailable);
        this.f7666b = byteOrder;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) throws IOException {
        int i10 = this.f7665a.read(bArr, i8, i9);
        this.f7668d += i10;
        return i10;
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        int length = this.f7668d + bArr.length;
        this.f7668d = length;
        if (length <= this.f7667c) {
            if (this.f7665a.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new EOFException();
    }

    a(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }
}
