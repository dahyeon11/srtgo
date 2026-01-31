package h3;

import android.support.v4.media.session.PlaybackStateCompat;
import e3.w;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final OutputStream f31503a = new a();

    class a extends OutputStream {
        a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            w.checkNotNull(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i8, int i9) {
            w.checkNotNull(bArr);
            w.checkPositionIndexes(i8, i9 + i8, bArr.length);
        }
    }

    private static byte[] a(Queue queue, int i8) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i8) {
            return bArr;
        }
        int length = i8 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i8);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i8 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    static byte[] b() {
        return new byte[8192];
    }

    private static long c(InputStream inputStream, long j8) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(iAvailable, j8));
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        w.checkNotNull(inputStream);
        w.checkNotNull(outputStream);
        byte[] bArrB = b();
        long j8 = 0;
        while (true) {
            int i8 = inputStream.read(bArrB);
            if (i8 == -1) {
                return j8;
            }
            outputStream.write(bArrB, 0, i8);
            j8 += i8;
        }
    }

    static long d(InputStream inputStream, long j8) throws IOException {
        byte[] bArr = null;
        long j9 = 0;
        while (j9 < j8) {
            long j10 = j8 - j9;
            long jC = c(inputStream, j10);
            if (jC == 0) {
                int iMin = (int) Math.min(j10, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (bArr == null) {
                    bArr = new byte[iMin];
                }
                jC = inputStream.read(bArr, 0, iMin);
                if (jC == -1) {
                    break;
                }
            }
            j9 += jC;
        }
        return j9;
    }

    static byte[] e(InputStream inputStream, long j8) throws IOException {
        w.checkArgument(j8 >= 0, "expectedSize (%s) must be non-negative", j8);
        if (j8 > 2147483639) {
            throw new OutOfMemoryError(j8 + " bytes is too large to fit in a byte array");
        }
        int i8 = (int) j8;
        byte[] bArr = new byte[i8];
        int i9 = i8;
        while (i9 > 0) {
            int i10 = i8 - i9;
            int i11 = inputStream.read(bArr, i10, i9);
            if (i11 == -1) {
                return Arrays.copyOf(bArr, i10);
            }
            i9 -= i11;
        }
        int i12 = inputStream.read();
        if (i12 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) i12});
        return f(inputStream, arrayDeque, i8 + 1);
    }

    public static long exhaust(InputStream inputStream) {
        byte[] bArrB = b();
        long j8 = 0;
        while (true) {
            long j9 = inputStream.read(bArrB);
            if (j9 == -1) {
                return j8;
            }
            j8 += j9;
        }
    }

    private static byte[] f(InputStream inputStream, Queue queue, int i8) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i8) * 2));
        while (i8 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i8);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i9 = 0;
            while (i9 < iMin2) {
                int i10 = inputStream.read(bArr, i9, iMin2 - i9);
                if (i10 == -1) {
                    return a(queue, i8);
                }
                i9 += i10;
                i8 += i10;
            }
            iMin = i3.b.saturatedMultiply(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static InputStream limit(InputStream inputStream, long j8) {
        return new d(inputStream, j8);
    }

    public static h3.c newDataInput(byte[] bArr) {
        return newDataInput(new ByteArrayInputStream(bArr));
    }

    public static h3.d newDataOutput() {
        return newDataOutput(new ByteArrayOutputStream());
    }

    public static OutputStream nullOutputStream() {
        return f31503a;
    }

    public static int read(InputStream inputStream, byte[] bArr, int i8, int i9) throws IOException {
        w.checkNotNull(inputStream);
        w.checkNotNull(bArr);
        if (i9 < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i9)));
        }
        w.checkPositionIndexes(i8, i8 + i9, bArr.length);
        int i10 = 0;
        while (i10 < i9) {
            int i11 = inputStream.read(bArr, i8 + i10, i9 - i10);
            if (i11 == -1) {
                break;
            }
            i10 += i11;
        }
        return i10;
    }

    public static <T> T readBytes(InputStream inputStream, e eVar) throws IOException {
        int i8;
        w.checkNotNull(inputStream);
        w.checkNotNull(eVar);
        byte[] bArrB = b();
        do {
            i8 = inputStream.read(bArrB);
            if (i8 == -1) {
                break;
            }
        } while (eVar.a(bArrB, 0, i8));
        return (T) eVar.getResult();
    }

    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void skipFully(InputStream inputStream, long j8) throws IOException {
        long jD = d(inputStream, j8);
        if (jD >= j8) {
            return;
        }
        throw new EOFException("reached end of stream after skipping " + jD + " bytes; " + j8 + " bytes expected");
    }

    public static byte[] toByteArray(InputStream inputStream) {
        w.checkNotNull(inputStream);
        return f(inputStream, new ArrayDeque(20), 0);
    }

    private static class b implements h3.c {

        /* renamed from: a, reason: collision with root package name */
        final DataInput f31504a;

        b(ByteArrayInputStream byteArrayInputStream) {
            this.f31504a = new DataInputStream(byteArrayInputStream);
        }

        @Override // h3.c, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.f31504a.readBoolean();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // h3.c, java.io.DataInput
        public byte readByte() {
            try {
                return this.f31504a.readByte();
            } catch (EOFException e8) {
                throw new IllegalStateException(e8);
            } catch (IOException e9) {
                throw new AssertionError(e9);
            }
        }

        @Override // h3.c, java.io.DataInput
        public char readChar() {
            try {
                return this.f31504a.readChar();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // h3.c, java.io.DataInput
        public double readDouble() {
            try {
                return this.f31504a.readDouble();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // h3.c, java.io.DataInput
        public float readFloat() {
            try {
                return this.f31504a.readFloat();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // h3.c, java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            try {
                this.f31504a.readFully(bArr);
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // h3.c, java.io.DataInput
        public int readInt() {
            try {
                return this.f31504a.readInt();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // h3.c, java.io.DataInput
        public String readLine() {
            try {
                return this.f31504a.readLine();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // h3.c, java.io.DataInput
        public long readLong() {
            try {
                return this.f31504a.readLong();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // h3.c, java.io.DataInput
        public short readShort() {
            try {
                return this.f31504a.readShort();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // h3.c, java.io.DataInput
        public String readUTF() {
            try {
                return this.f31504a.readUTF();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // h3.c, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.f31504a.readUnsignedByte();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // h3.c, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.f31504a.readUnsignedShort();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // h3.c, java.io.DataInput
        public int skipBytes(int i8) {
            try {
                return this.f31504a.skipBytes(i8);
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        @Override // h3.c, java.io.DataInput
        public void readFully(byte[] bArr, int i8, int i9) throws IOException {
            try {
                this.f31504a.readFully(bArr, i8, i9);
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    private static class c implements h3.d {

        /* renamed from: a, reason: collision with root package name */
        final DataOutput f31505a;

        /* renamed from: b, reason: collision with root package name */
        final ByteArrayOutputStream f31506b;

        c(ByteArrayOutputStream byteArrayOutputStream) {
            this.f31506b = byteArrayOutputStream;
            this.f31505a = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // h3.d
        public byte[] toByteArray() {
            return this.f31506b.toByteArray();
        }

        @Override // h3.d, java.io.DataOutput
        public void write(int i8) throws IOException {
            try {
                this.f31505a.write(i8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // h3.d, java.io.DataOutput
        public void writeBoolean(boolean z8) throws IOException {
            try {
                this.f31505a.writeBoolean(z8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // h3.d, java.io.DataOutput
        public void writeByte(int i8) throws IOException {
            try {
                this.f31505a.writeByte(i8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // h3.d, java.io.DataOutput
        public void writeBytes(String str) throws IOException {
            try {
                this.f31505a.writeBytes(str);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // h3.d, java.io.DataOutput
        public void writeChar(int i8) throws IOException {
            try {
                this.f31505a.writeChar(i8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // h3.d, java.io.DataOutput
        public void writeChars(String str) throws IOException {
            try {
                this.f31505a.writeChars(str);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // h3.d, java.io.DataOutput
        public void writeDouble(double d9) throws IOException {
            try {
                this.f31505a.writeDouble(d9);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // h3.d, java.io.DataOutput
        public void writeFloat(float f8) throws IOException {
            try {
                this.f31505a.writeFloat(f8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // h3.d, java.io.DataOutput
        public void writeInt(int i8) throws IOException {
            try {
                this.f31505a.writeInt(i8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // h3.d, java.io.DataOutput
        public void writeLong(long j8) throws IOException {
            try {
                this.f31505a.writeLong(j8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // h3.d, java.io.DataOutput
        public void writeShort(int i8) throws IOException {
            try {
                this.f31505a.writeShort(i8);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // h3.d, java.io.DataOutput
        public void writeUTF(String str) throws IOException {
            try {
                this.f31505a.writeUTF(str);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // h3.d, java.io.DataOutput
        public void write(byte[] bArr) throws IOException {
            try {
                this.f31505a.write(bArr);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // h3.d, java.io.DataOutput
        public void write(byte[] bArr, int i8, int i9) throws IOException {
            try {
                this.f31505a.write(bArr, i8, i9);
            } catch (IOException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    public static h3.c newDataInput(byte[] bArr, int i8) {
        w.checkPositionIndex(i8, bArr.length);
        return newDataInput(new ByteArrayInputStream(bArr, i8, bArr.length - i8));
    }

    public static h3.d newDataOutput(int i8) {
        if (i8 >= 0) {
            return newDataOutput(new ByteArrayOutputStream(i8));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(i8)));
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i8, int i9) throws IOException {
        int i10 = read(inputStream, bArr, i8, i9);
        if (i10 == i9) {
            return;
        }
        throw new EOFException("reached end of stream after reading " + i10 + " bytes; " + i9 + " bytes expected");
    }

    private static final class d extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private long f31507a;

        /* renamed from: b, reason: collision with root package name */
        private long f31508b;

        d(InputStream inputStream, long j8) {
            super(inputStream);
            this.f31508b = -1L;
            w.checkNotNull(inputStream);
            w.checkArgument(j8 >= 0, "limit must be non-negative");
            this.f31507a = j8;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f31507a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i8) {
            ((FilterInputStream) this).in.mark(i8);
            this.f31508b = this.f31507a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f31507a == 0) {
                return -1;
            }
            int i8 = ((FilterInputStream) this).in.read();
            if (i8 != -1) {
                this.f31507a--;
            }
            return i8;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f31508b == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f31507a = this.f31508b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j8) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j8, this.f31507a));
            this.f31507a -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) throws IOException {
            long j8 = this.f31507a;
            if (j8 == 0) {
                return -1;
            }
            int i10 = ((FilterInputStream) this).in.read(bArr, i8, (int) Math.min(i9, j8));
            if (i10 != -1) {
                this.f31507a -= i10;
            }
            return i10;
        }
    }

    public static h3.c newDataInput(ByteArrayInputStream byteArrayInputStream) {
        return new b((ByteArrayInputStream) w.checkNotNull(byteArrayInputStream));
    }

    public static h3.d newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        return new c((ByteArrayOutputStream) w.checkNotNull(byteArrayOutputStream));
    }

    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        w.checkNotNull(readableByteChannel);
        w.checkNotNull(writableByteChannel);
        long jWrite = 0;
        if (readableByteChannel instanceof FileChannel) {
            FileChannel fileChannel = (FileChannel) readableByteChannel;
            long jPosition = fileChannel.position();
            long j8 = jPosition;
            while (true) {
                long jTransferTo = fileChannel.transferTo(j8, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, writableByteChannel);
                j8 += jTransferTo;
                fileChannel.position(j8);
                if (jTransferTo <= 0 && j8 >= fileChannel.size()) {
                    return j8 - jPosition;
                }
            }
        } else {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(b());
            while (readableByteChannel.read(byteBufferWrap) != -1) {
                o.b(byteBufferWrap);
                while (byteBufferWrap.hasRemaining()) {
                    jWrite += writableByteChannel.write(byteBufferWrap);
                }
                o.a(byteBufferWrap);
            }
            return jWrite;
        }
    }
}
