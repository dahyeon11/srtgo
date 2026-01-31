package com.google.protobuf;

import com.google.protobuf.M1;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.t */
/* loaded from: classes2.dex */
public abstract class AbstractC5248t extends AbstractC5232n {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;

    /* renamed from: c */
    private static final Logger f26733c = Logger.getLogger(AbstractC5248t.class.getName());

    /* renamed from: d */
    private static final boolean f26734d = L1.K();

    /* renamed from: a */
    C5250u f26735a;

    /* renamed from: b */
    private boolean f26736b;

    /* renamed from: com.google.protobuf.t$b */
    private static abstract class b extends AbstractC5248t {

        /* renamed from: e */
        final byte[] f26737e;

        /* renamed from: f */
        final int f26738f;

        /* renamed from: g */
        int f26739g;

        /* renamed from: h */
        int f26740h;

        b(int i8) {
            super();
            if (i8 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i8, 20)];
            this.f26737e = bArr;
            this.f26738f = bArr.length;
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final int getTotalBytesWritten() {
            return this.f26740h;
        }

        final void o(byte b9) {
            byte[] bArr = this.f26737e;
            int i8 = this.f26739g;
            this.f26739g = i8 + 1;
            bArr[i8] = b9;
            this.f26740h++;
        }

        final void p(int i8) {
            byte[] bArr = this.f26737e;
            int i9 = this.f26739g;
            int i10 = i9 + 1;
            this.f26739g = i10;
            bArr[i9] = (byte) (i8 & 255);
            int i11 = i9 + 2;
            this.f26739g = i11;
            bArr[i10] = (byte) ((i8 >> 8) & 255);
            int i12 = i9 + 3;
            this.f26739g = i12;
            bArr[i11] = (byte) ((i8 >> 16) & 255);
            this.f26739g = i9 + 4;
            bArr[i12] = (byte) ((i8 >> 24) & 255);
            this.f26740h += 4;
        }

        final void q(long j8) {
            byte[] bArr = this.f26737e;
            int i8 = this.f26739g;
            int i9 = i8 + 1;
            this.f26739g = i9;
            bArr[i8] = (byte) (j8 & 255);
            int i10 = i8 + 2;
            this.f26739g = i10;
            bArr[i9] = (byte) ((j8 >> 8) & 255);
            int i11 = i8 + 3;
            this.f26739g = i11;
            bArr[i10] = (byte) ((j8 >> 16) & 255);
            int i12 = i8 + 4;
            this.f26739g = i12;
            bArr[i11] = (byte) (255 & (j8 >> 24));
            int i13 = i8 + 5;
            this.f26739g = i13;
            bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
            int i14 = i8 + 6;
            this.f26739g = i14;
            bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
            int i15 = i8 + 7;
            this.f26739g = i15;
            bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
            this.f26739g = i8 + 8;
            bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
            this.f26740h += 8;
        }

        final void r(int i8) {
            if (i8 >= 0) {
                t(i8);
            } else {
                u(i8);
            }
        }

        final void s(int i8, int i9) {
            t(P1.a(i8, i9));
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        final void t(int i8) {
            if (!AbstractC5248t.f26734d) {
                while ((i8 & (-128)) != 0) {
                    byte[] bArr = this.f26737e;
                    int i9 = this.f26739g;
                    this.f26739g = i9 + 1;
                    bArr[i9] = (byte) ((i8 & 127) | 128);
                    this.f26740h++;
                    i8 >>>= 7;
                }
                byte[] bArr2 = this.f26737e;
                int i10 = this.f26739g;
                this.f26739g = i10 + 1;
                bArr2[i10] = (byte) i8;
                this.f26740h++;
                return;
            }
            long j8 = this.f26739g;
            while ((i8 & (-128)) != 0) {
                byte[] bArr3 = this.f26737e;
                int i11 = this.f26739g;
                this.f26739g = i11 + 1;
                L1.S(bArr3, i11, (byte) ((i8 & 127) | 128));
                i8 >>>= 7;
            }
            byte[] bArr4 = this.f26737e;
            int i12 = this.f26739g;
            this.f26739g = i12 + 1;
            L1.S(bArr4, i12, (byte) i8);
            this.f26740h += (int) (this.f26739g - j8);
        }

        final void u(long j8) {
            if (!AbstractC5248t.f26734d) {
                while ((j8 & (-128)) != 0) {
                    byte[] bArr = this.f26737e;
                    int i8 = this.f26739g;
                    this.f26739g = i8 + 1;
                    bArr[i8] = (byte) ((((int) j8) & 127) | 128);
                    this.f26740h++;
                    j8 >>>= 7;
                }
                byte[] bArr2 = this.f26737e;
                int i9 = this.f26739g;
                this.f26739g = i9 + 1;
                bArr2[i9] = (byte) j8;
                this.f26740h++;
                return;
            }
            long j9 = this.f26739g;
            while ((j8 & (-128)) != 0) {
                byte[] bArr3 = this.f26737e;
                int i10 = this.f26739g;
                this.f26739g = i10 + 1;
                L1.S(bArr3, i10, (byte) ((((int) j8) & 127) | 128));
                j8 >>>= 7;
            }
            byte[] bArr4 = this.f26737e;
            int i11 = this.f26739g;
            this.f26739g = i11 + 1;
            L1.S(bArr4, i11, (byte) j8);
            this.f26740h += (int) (this.f26739g - j9);
        }
    }

    /* renamed from: com.google.protobuf.t$c */
    private static class c extends AbstractC5248t {

        /* renamed from: e */
        private final byte[] f26741e;

        /* renamed from: f */
        private final int f26742f;

        /* renamed from: g */
        private final int f26743g;

        /* renamed from: h */
        private int f26744h;

        c(byte[] bArr, int i8, int i9) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i10 = i8 + i9;
            if ((i8 | i9 | (bArr.length - i10)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            this.f26741e = bArr;
            this.f26742f = i8;
            this.f26744h = i8;
            this.f26743g = i10;
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void flush() {
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final int getTotalBytesWritten() {
            return this.f26744h - this.f26742f;
        }

        @Override // com.google.protobuf.AbstractC5248t
        final void n(int i8, K0 k02, InterfaceC5219i1 interfaceC5219i1) throws e {
            writeTag(i8, 2);
            writeUInt32NoTag(((AbstractC5196b) k02).getSerializedSize(interfaceC5219i1));
            interfaceC5219i1.writeTo(k02, this.f26735a);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final int spaceLeft() {
            return this.f26743g - this.f26744h;
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public final void write(byte b9) throws e {
            try {
                byte[] bArr = this.f26741e;
                int i8 = this.f26744h;
                this.f26744h = i8 + 1;
                bArr[i8] = b9;
            } catch (IndexOutOfBoundsException e8) {
                throw new e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26744h), Integer.valueOf(this.f26743g), 1), e8);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeBool(int i8, boolean z8) throws e {
            writeTag(i8, 0);
            write(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeByteArray(int i8, byte[] bArr) throws e {
            writeByteArray(i8, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeByteArrayNoTag(byte[] bArr, int i8, int i9) throws e {
            writeUInt32NoTag(i9);
            write(bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeByteBuffer(int i8, ByteBuffer byteBuffer) throws e {
            writeTag(i8, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeBytes(int i8, AbstractC5235o abstractC5235o) throws e {
            writeTag(i8, 2);
            writeBytesNoTag(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeBytesNoTag(AbstractC5235o abstractC5235o) throws e {
            writeUInt32NoTag(abstractC5235o.size());
            abstractC5235o.u(this);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeFixed32(int i8, int i9) throws e {
            writeTag(i8, 5);
            writeFixed32NoTag(i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeFixed32NoTag(int i8) throws e {
            try {
                byte[] bArr = this.f26741e;
                int i9 = this.f26744h;
                int i10 = i9 + 1;
                this.f26744h = i10;
                bArr[i9] = (byte) (i8 & 255);
                int i11 = i9 + 2;
                this.f26744h = i11;
                bArr[i10] = (byte) ((i8 >> 8) & 255);
                int i12 = i9 + 3;
                this.f26744h = i12;
                bArr[i11] = (byte) ((i8 >> 16) & 255);
                this.f26744h = i9 + 4;
                bArr[i12] = (byte) ((i8 >> 24) & 255);
            } catch (IndexOutOfBoundsException e8) {
                throw new e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26744h), Integer.valueOf(this.f26743g), 1), e8);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeFixed64(int i8, long j8) throws e {
            writeTag(i8, 1);
            writeFixed64NoTag(j8);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeFixed64NoTag(long j8) throws e {
            try {
                byte[] bArr = this.f26741e;
                int i8 = this.f26744h;
                int i9 = i8 + 1;
                this.f26744h = i9;
                bArr[i8] = (byte) (((int) j8) & 255);
                int i10 = i8 + 2;
                this.f26744h = i10;
                bArr[i9] = (byte) (((int) (j8 >> 8)) & 255);
                int i11 = i8 + 3;
                this.f26744h = i11;
                bArr[i10] = (byte) (((int) (j8 >> 16)) & 255);
                int i12 = i8 + 4;
                this.f26744h = i12;
                bArr[i11] = (byte) (((int) (j8 >> 24)) & 255);
                int i13 = i8 + 5;
                this.f26744h = i13;
                bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
                int i14 = i8 + 6;
                this.f26744h = i14;
                bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
                int i15 = i8 + 7;
                this.f26744h = i15;
                bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
                this.f26744h = i8 + 8;
                bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e8) {
                throw new e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26744h), Integer.valueOf(this.f26743g), 1), e8);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeInt32(int i8, int i9) throws e {
            writeTag(i8, 0);
            writeInt32NoTag(i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeInt32NoTag(int i8) throws e {
            if (i8 >= 0) {
                writeUInt32NoTag(i8);
            } else {
                writeUInt64NoTag(i8);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public final void writeLazy(byte[] bArr, int i8, int i9) throws e {
            write(bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeMessage(int i8, K0 k02) throws e {
            writeTag(i8, 2);
            writeMessageNoTag(k02);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeMessageNoTag(K0 k02) throws e {
            writeUInt32NoTag(k02.getSerializedSize());
            k02.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeMessageSetExtension(int i8, K0 k02) throws e {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeMessage(3, k02);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeRawBytes(ByteBuffer byteBuffer) throws e {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            AbstractC5236o0.a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeRawMessageSetExtension(int i8, AbstractC5235o abstractC5235o) throws e {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeBytes(3, abstractC5235o);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeString(int i8, String str) throws e {
            writeTag(i8, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeStringNoTag(String str) throws e {
            int i8 = this.f26744h;
            try {
                int iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = AbstractC5248t.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i9 = i8 + iComputeUInt32SizeNoTag2;
                    this.f26744h = i9;
                    int i10 = M1.i(str, this.f26741e, i9, spaceLeft());
                    this.f26744h = i8;
                    writeUInt32NoTag((i10 - i8) - iComputeUInt32SizeNoTag2);
                    this.f26744h = i10;
                } else {
                    writeUInt32NoTag(M1.k(str));
                    this.f26744h = M1.i(str, this.f26741e, this.f26744h, spaceLeft());
                }
            } catch (M1.d e8) {
                this.f26744h = i8;
                h(str, e8);
            } catch (IndexOutOfBoundsException e9) {
                throw new e(e9);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeTag(int i8, int i9) throws e {
            writeUInt32NoTag(P1.a(i8, i9));
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeUInt32(int i8, int i9) throws e {
            writeTag(i8, 0);
            writeUInt32NoTag(i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeUInt32NoTag(int i8) throws e {
            while ((i8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f26741e;
                    int i9 = this.f26744h;
                    this.f26744h = i9 + 1;
                    bArr[i9] = (byte) ((i8 & 127) | 128);
                    i8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26744h), Integer.valueOf(this.f26743g), 1), e8);
                }
            }
            byte[] bArr2 = this.f26741e;
            int i10 = this.f26744h;
            this.f26744h = i10 + 1;
            bArr2[i10] = (byte) i8;
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeUInt64(int i8, long j8) throws e {
            writeTag(i8, 0);
            writeUInt64NoTag(j8);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeUInt64NoTag(long j8) throws e {
            if (AbstractC5248t.f26734d && spaceLeft() >= 10) {
                while ((j8 & (-128)) != 0) {
                    byte[] bArr = this.f26741e;
                    int i8 = this.f26744h;
                    this.f26744h = i8 + 1;
                    L1.S(bArr, i8, (byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
                byte[] bArr2 = this.f26741e;
                int i9 = this.f26744h;
                this.f26744h = i9 + 1;
                L1.S(bArr2, i9, (byte) j8);
                return;
            }
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f26741e;
                    int i10 = this.f26744h;
                    this.f26744h = i10 + 1;
                    bArr3[i10] = (byte) ((((int) j8) & 127) | 128);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26744h), Integer.valueOf(this.f26743g), 1), e8);
                }
            }
            byte[] bArr4 = this.f26741e;
            int i11 = this.f26744h;
            this.f26744h = i11 + 1;
            bArr4[i11] = (byte) j8;
        }

        @Override // com.google.protobuf.AbstractC5248t
        public final void writeByteArray(int i8, byte[] bArr, int i9, int i10) throws e {
            writeTag(i8, 2);
            writeByteArrayNoTag(bArr, i9, i10);
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public final void writeLazy(ByteBuffer byteBuffer) throws e {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public final void write(byte[] bArr, int i8, int i9) throws e {
            try {
                System.arraycopy(bArr, i8, this.f26741e, this.f26744h, i9);
                this.f26744h += i9;
            } catch (IndexOutOfBoundsException e8) {
                throw new e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26744h), Integer.valueOf(this.f26743g), Integer.valueOf(i9)), e8);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public final void write(ByteBuffer byteBuffer) throws e {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f26741e, this.f26744h, iRemaining);
                this.f26744h += iRemaining;
            } catch (IndexOutOfBoundsException e8) {
                throw new e(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26744h), Integer.valueOf(this.f26743g), Integer.valueOf(iRemaining)), e8);
            }
        }
    }

    /* renamed from: com.google.protobuf.t$d */
    private static final class d extends c {

        /* renamed from: i */
        private final ByteBuffer f26745i;

        /* renamed from: j */
        private int f26746j;

        d(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f26745i = byteBuffer;
            this.f26746j = byteBuffer.position();
        }

        @Override // com.google.protobuf.AbstractC5248t.c, com.google.protobuf.AbstractC5248t
        public void flush() {
            AbstractC5236o0.e(this.f26745i, this.f26746j + getTotalBytesWritten());
        }
    }

    /* renamed from: com.google.protobuf.t$e */
    public static class e extends IOException {
        e(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        e(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        e(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: com.google.protobuf.t$f */
    private static final class f extends b {

        /* renamed from: i */
        private final OutputStream f26747i;

        f(OutputStream outputStream, int i8) {
            super(i8);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f26747i = outputStream;
        }

        private void v() throws IOException {
            this.f26747i.write(this.f26737e, 0, this.f26739g);
            this.f26739g = 0;
        }

        private void w(int i8) throws IOException {
            if (this.f26738f - this.f26739g < i8) {
                v();
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void flush() throws IOException {
            if (this.f26739g > 0) {
                v();
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        void n(int i8, K0 k02, InterfaceC5219i1 interfaceC5219i1) throws IOException {
            writeTag(i8, 2);
            x(k02, interfaceC5219i1);
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void write(byte b9) throws IOException {
            if (this.f26739g == this.f26738f) {
                v();
            }
            o(b9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeBool(int i8, boolean z8) throws IOException {
            w(11);
            s(i8, 0);
            o(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeByteArray(int i8, byte[] bArr) throws IOException {
            writeByteArray(i8, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeByteArrayNoTag(byte[] bArr, int i8, int i9) throws IOException {
            writeUInt32NoTag(i9);
            write(bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeByteBuffer(int i8, ByteBuffer byteBuffer) throws IOException {
            writeTag(i8, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeBytes(int i8, AbstractC5235o abstractC5235o) throws IOException {
            writeTag(i8, 2);
            writeBytesNoTag(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeBytesNoTag(AbstractC5235o abstractC5235o) throws IOException {
            writeUInt32NoTag(abstractC5235o.size());
            abstractC5235o.u(this);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeFixed32(int i8, int i9) throws IOException {
            w(14);
            s(i8, 5);
            p(i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeFixed32NoTag(int i8) throws IOException {
            w(4);
            p(i8);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeFixed64(int i8, long j8) throws IOException {
            w(18);
            s(i8, 1);
            q(j8);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeFixed64NoTag(long j8) throws IOException {
            w(8);
            q(j8);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeInt32(int i8, int i9) throws IOException {
            w(20);
            s(i8, 0);
            r(i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeInt32NoTag(int i8) throws IOException {
            if (i8 >= 0) {
                writeUInt32NoTag(i8);
            } else {
                writeUInt64NoTag(i8);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void writeLazy(byte[] bArr, int i8, int i9) throws IOException {
            write(bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeMessage(int i8, K0 k02) throws IOException {
            writeTag(i8, 2);
            writeMessageNoTag(k02);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeMessageNoTag(K0 k02) throws IOException {
            writeUInt32NoTag(k02.getSerializedSize());
            k02.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeMessageSetExtension(int i8, K0 k02) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeMessage(3, k02);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            AbstractC5236o0.a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeRawMessageSetExtension(int i8, AbstractC5235o abstractC5235o) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeBytes(3, abstractC5235o);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeString(int i8, String str) throws IOException {
            writeTag(i8, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeStringNoTag(String str) throws IOException {
            int iK;
            try {
                int length = str.length() * 3;
                int iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(length);
                int i8 = iComputeUInt32SizeNoTag + length;
                int i9 = this.f26738f;
                if (i8 > i9) {
                    byte[] bArr = new byte[length];
                    int i10 = M1.i(str, bArr, 0, length);
                    writeUInt32NoTag(i10);
                    writeLazy(bArr, 0, i10);
                    return;
                }
                if (i8 > i9 - this.f26739g) {
                    v();
                }
                int iComputeUInt32SizeNoTag2 = AbstractC5248t.computeUInt32SizeNoTag(str.length());
                int i11 = this.f26739g;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i12 = i11 + iComputeUInt32SizeNoTag2;
                        this.f26739g = i12;
                        int i13 = M1.i(str, this.f26737e, i12, this.f26738f - i12);
                        this.f26739g = i11;
                        iK = (i13 - i11) - iComputeUInt32SizeNoTag2;
                        t(iK);
                        this.f26739g = i13;
                    } else {
                        iK = M1.k(str);
                        t(iK);
                        this.f26739g = M1.i(str, this.f26737e, this.f26739g, iK);
                    }
                    this.f26740h += iK;
                } catch (M1.d e8) {
                    this.f26740h -= this.f26739g - i11;
                    this.f26739g = i11;
                    throw e8;
                } catch (ArrayIndexOutOfBoundsException e9) {
                    throw new e(e9);
                }
            } catch (M1.d e10) {
                h(str, e10);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeTag(int i8, int i9) throws IOException {
            writeUInt32NoTag(P1.a(i8, i9));
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeUInt32(int i8, int i9) throws IOException {
            w(20);
            s(i8, 0);
            t(i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeUInt32NoTag(int i8) throws IOException {
            w(5);
            t(i8);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeUInt64(int i8, long j8) throws IOException {
            w(20);
            s(i8, 0);
            u(j8);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeUInt64NoTag(long j8) throws IOException {
            w(10);
            u(j8);
        }

        void x(K0 k02, InterfaceC5219i1 interfaceC5219i1) throws IOException {
            writeUInt32NoTag(((AbstractC5196b) k02).getSerializedSize(interfaceC5219i1));
            interfaceC5219i1.writeTo(k02, this.f26735a);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeByteArray(int i8, byte[] bArr, int i9, int i10) throws IOException {
            writeTag(i8, 2);
            writeByteArrayNoTag(bArr, i9, i10);
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void write(byte[] bArr, int i8, int i9) throws IOException {
            int i10 = this.f26738f;
            int i11 = this.f26739g;
            if (i10 - i11 >= i9) {
                System.arraycopy(bArr, i8, this.f26737e, i11, i9);
                this.f26739g += i9;
                this.f26740h += i9;
                return;
            }
            int i12 = i10 - i11;
            System.arraycopy(bArr, i8, this.f26737e, i11, i12);
            int i13 = i8 + i12;
            int i14 = i9 - i12;
            this.f26739g = this.f26738f;
            this.f26740h += i12;
            v();
            if (i14 <= this.f26738f) {
                System.arraycopy(bArr, i13, this.f26737e, 0, i14);
                this.f26739g = i14;
            } else {
                this.f26747i.write(bArr, i13, i14);
            }
            this.f26740h += i14;
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i8 = this.f26738f;
            int i9 = this.f26739g;
            if (i8 - i9 >= iRemaining) {
                byteBuffer.get(this.f26737e, i9, iRemaining);
                this.f26739g += iRemaining;
                this.f26740h += iRemaining;
                return;
            }
            int i10 = i8 - i9;
            byteBuffer.get(this.f26737e, i9, i10);
            int i11 = iRemaining - i10;
            this.f26739g = this.f26738f;
            this.f26740h += i10;
            v();
            while (true) {
                int i12 = this.f26738f;
                if (i11 > i12) {
                    byteBuffer.get(this.f26737e, 0, i12);
                    this.f26747i.write(this.f26737e, 0, this.f26738f);
                    int i13 = this.f26738f;
                    i11 -= i13;
                    this.f26740h += i13;
                } else {
                    byteBuffer.get(this.f26737e, 0, i11);
                    this.f26739g = i11;
                    this.f26740h += i11;
                    return;
                }
            }
        }
    }

    /* renamed from: com.google.protobuf.t$g */
    private static final class g extends AbstractC5248t {

        /* renamed from: e */
        private final ByteBuffer f26748e;

        /* renamed from: f */
        private final ByteBuffer f26749f;

        /* renamed from: g */
        private final int f26750g;

        g(ByteBuffer byteBuffer) {
            super();
            this.f26748e = byteBuffer;
            this.f26749f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f26750g = byteBuffer.position();
        }

        private void o(String str) throws e {
            try {
                M1.j(str, this.f26749f);
            } catch (IndexOutOfBoundsException e8) {
                throw new e(e8);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void flush() {
            AbstractC5236o0.e(this.f26748e, this.f26749f.position());
        }

        @Override // com.google.protobuf.AbstractC5248t
        public int getTotalBytesWritten() {
            return this.f26749f.position() - this.f26750g;
        }

        @Override // com.google.protobuf.AbstractC5248t
        void n(int i8, K0 k02, InterfaceC5219i1 interfaceC5219i1) throws e {
            writeTag(i8, 2);
            p(k02, interfaceC5219i1);
        }

        void p(K0 k02, InterfaceC5219i1 interfaceC5219i1) throws e {
            writeUInt32NoTag(((AbstractC5196b) k02).getSerializedSize(interfaceC5219i1));
            interfaceC5219i1.writeTo(k02, this.f26735a);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public int spaceLeft() {
            return this.f26749f.remaining();
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void write(byte b9) throws e {
            try {
                this.f26749f.put(b9);
            } catch (BufferOverflowException e8) {
                throw new e(e8);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeBool(int i8, boolean z8) throws e {
            writeTag(i8, 0);
            write(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeByteArray(int i8, byte[] bArr) throws e {
            writeByteArray(i8, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeByteArrayNoTag(byte[] bArr, int i8, int i9) throws e {
            writeUInt32NoTag(i9);
            write(bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeByteBuffer(int i8, ByteBuffer byteBuffer) throws e {
            writeTag(i8, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeBytes(int i8, AbstractC5235o abstractC5235o) throws e {
            writeTag(i8, 2);
            writeBytesNoTag(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeBytesNoTag(AbstractC5235o abstractC5235o) throws e {
            writeUInt32NoTag(abstractC5235o.size());
            abstractC5235o.u(this);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeFixed32(int i8, int i9) throws e {
            writeTag(i8, 5);
            writeFixed32NoTag(i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeFixed32NoTag(int i8) throws e {
            try {
                this.f26749f.putInt(i8);
            } catch (BufferOverflowException e8) {
                throw new e(e8);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeFixed64(int i8, long j8) throws e {
            writeTag(i8, 1);
            writeFixed64NoTag(j8);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeFixed64NoTag(long j8) throws e {
            try {
                this.f26749f.putLong(j8);
            } catch (BufferOverflowException e8) {
                throw new e(e8);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeInt32(int i8, int i9) throws e {
            writeTag(i8, 0);
            writeInt32NoTag(i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeInt32NoTag(int i8) throws e {
            if (i8 >= 0) {
                writeUInt32NoTag(i8);
            } else {
                writeUInt64NoTag(i8);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void writeLazy(byte[] bArr, int i8, int i9) throws e {
            write(bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeMessage(int i8, K0 k02) throws e {
            writeTag(i8, 2);
            writeMessageNoTag(k02);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeMessageNoTag(K0 k02) throws e {
            writeUInt32NoTag(k02.getSerializedSize());
            k02.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeMessageSetExtension(int i8, K0 k02) throws e {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeMessage(3, k02);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeRawBytes(ByteBuffer byteBuffer) throws e {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            AbstractC5236o0.a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeRawMessageSetExtension(int i8, AbstractC5235o abstractC5235o) throws e {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeBytes(3, abstractC5235o);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeString(int i8, String str) throws e {
            writeTag(i8, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeStringNoTag(String str) throws e {
            int iPosition = this.f26749f.position();
            try {
                int iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = AbstractC5248t.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iPosition2 = this.f26749f.position() + iComputeUInt32SizeNoTag2;
                    AbstractC5236o0.e(this.f26749f, iPosition2);
                    o(str);
                    int iPosition3 = this.f26749f.position();
                    AbstractC5236o0.e(this.f26749f, iPosition);
                    writeUInt32NoTag(iPosition3 - iPosition2);
                    AbstractC5236o0.e(this.f26749f, iPosition3);
                } else {
                    writeUInt32NoTag(M1.k(str));
                    o(str);
                }
            } catch (M1.d e8) {
                AbstractC5236o0.e(this.f26749f, iPosition);
                h(str, e8);
            } catch (IllegalArgumentException e9) {
                throw new e(e9);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeTag(int i8, int i9) throws e {
            writeUInt32NoTag(P1.a(i8, i9));
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeUInt32(int i8, int i9) throws e {
            writeTag(i8, 0);
            writeUInt32NoTag(i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeUInt32NoTag(int i8) throws e {
            while ((i8 & (-128)) != 0) {
                try {
                    this.f26749f.put((byte) ((i8 & 127) | 128));
                    i8 >>>= 7;
                } catch (BufferOverflowException e8) {
                    throw new e(e8);
                }
            }
            this.f26749f.put((byte) i8);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeUInt64(int i8, long j8) throws e {
            writeTag(i8, 0);
            writeUInt64NoTag(j8);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeUInt64NoTag(long j8) throws e {
            while (((-128) & j8) != 0) {
                try {
                    this.f26749f.put((byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                } catch (BufferOverflowException e8) {
                    throw new e(e8);
                }
            }
            this.f26749f.put((byte) j8);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeByteArray(int i8, byte[] bArr, int i9, int i10) throws e {
            writeTag(i8, 2);
            writeByteArrayNoTag(bArr, i9, i10);
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void writeLazy(ByteBuffer byteBuffer) throws e {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void write(byte[] bArr, int i8, int i9) throws e {
            try {
                this.f26749f.put(bArr, i8, i9);
            } catch (IndexOutOfBoundsException e8) {
                throw new e(e8);
            } catch (BufferOverflowException e9) {
                throw new e(e9);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void write(ByteBuffer byteBuffer) throws e {
            try {
                this.f26749f.put(byteBuffer);
            } catch (BufferOverflowException e8) {
                throw new e(e8);
            }
        }
    }

    /* renamed from: com.google.protobuf.t$h */
    private static final class h extends AbstractC5248t {

        /* renamed from: e */
        private final ByteBuffer f26751e;

        /* renamed from: f */
        private final ByteBuffer f26752f;

        /* renamed from: g */
        private final long f26753g;

        /* renamed from: h */
        private final long f26754h;

        /* renamed from: i */
        private final long f26755i;

        /* renamed from: j */
        private final long f26756j;

        /* renamed from: k */
        private long f26757k;

        h(ByteBuffer byteBuffer) {
            super();
            this.f26751e = byteBuffer;
            this.f26752f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jK = L1.k(byteBuffer);
            this.f26753g = jK;
            long jPosition = byteBuffer.position() + jK;
            this.f26754h = jPosition;
            long jLimit = jK + byteBuffer.limit();
            this.f26755i = jLimit;
            this.f26756j = jLimit - 10;
            this.f26757k = jPosition;
        }

        private int o(long j8) {
            return (int) (j8 - this.f26753g);
        }

        static boolean p() {
            return L1.L();
        }

        private void q(long j8) {
            AbstractC5236o0.e(this.f26752f, o(j8));
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void flush() {
            AbstractC5236o0.e(this.f26751e, o(this.f26757k));
        }

        @Override // com.google.protobuf.AbstractC5248t
        public int getTotalBytesWritten() {
            return (int) (this.f26757k - this.f26754h);
        }

        @Override // com.google.protobuf.AbstractC5248t
        void n(int i8, K0 k02, InterfaceC5219i1 interfaceC5219i1) throws e {
            writeTag(i8, 2);
            r(k02, interfaceC5219i1);
        }

        void r(K0 k02, InterfaceC5219i1 interfaceC5219i1) throws e {
            writeUInt32NoTag(((AbstractC5196b) k02).getSerializedSize(interfaceC5219i1));
            interfaceC5219i1.writeTo(k02, this.f26735a);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public int spaceLeft() {
            return (int) (this.f26755i - this.f26757k);
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void write(byte b9) throws e {
            long j8 = this.f26757k;
            if (j8 >= this.f26755i) {
                throw new e(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f26757k), Long.valueOf(this.f26755i), 1));
            }
            this.f26757k = 1 + j8;
            L1.R(j8, b9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeBool(int i8, boolean z8) throws e {
            writeTag(i8, 0);
            write(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeByteArray(int i8, byte[] bArr) throws e {
            writeByteArray(i8, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeByteArrayNoTag(byte[] bArr, int i8, int i9) throws e {
            writeUInt32NoTag(i9);
            write(bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeByteBuffer(int i8, ByteBuffer byteBuffer) throws e {
            writeTag(i8, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeBytes(int i8, AbstractC5235o abstractC5235o) throws e {
            writeTag(i8, 2);
            writeBytesNoTag(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeBytesNoTag(AbstractC5235o abstractC5235o) throws e {
            writeUInt32NoTag(abstractC5235o.size());
            abstractC5235o.u(this);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeFixed32(int i8, int i9) throws e {
            writeTag(i8, 5);
            writeFixed32NoTag(i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeFixed32NoTag(int i8) {
            this.f26752f.putInt(o(this.f26757k), i8);
            this.f26757k += 4;
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeFixed64(int i8, long j8) throws e {
            writeTag(i8, 1);
            writeFixed64NoTag(j8);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeFixed64NoTag(long j8) {
            this.f26752f.putLong(o(this.f26757k), j8);
            this.f26757k += 8;
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeInt32(int i8, int i9) throws e {
            writeTag(i8, 0);
            writeInt32NoTag(i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeInt32NoTag(int i8) throws e {
            if (i8 >= 0) {
                writeUInt32NoTag(i8);
            } else {
                writeUInt64NoTag(i8);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void writeLazy(byte[] bArr, int i8, int i9) throws e {
            write(bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeMessage(int i8, K0 k02) throws e {
            writeTag(i8, 2);
            writeMessageNoTag(k02);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeMessageNoTag(K0 k02) throws e {
            writeUInt32NoTag(k02.getSerializedSize());
            k02.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeMessageSetExtension(int i8, K0 k02) throws e {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeMessage(3, k02);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeRawBytes(ByteBuffer byteBuffer) throws e {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            AbstractC5236o0.a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeRawMessageSetExtension(int i8, AbstractC5235o abstractC5235o) throws e {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeBytes(3, abstractC5235o);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeString(int i8, String str) throws e {
            writeTag(i8, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeStringNoTag(String str) throws e {
            long j8 = this.f26757k;
            try {
                int iComputeUInt32SizeNoTag = AbstractC5248t.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = AbstractC5248t.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iO = o(this.f26757k) + iComputeUInt32SizeNoTag2;
                    AbstractC5236o0.e(this.f26752f, iO);
                    M1.j(str, this.f26752f);
                    int iPosition = this.f26752f.position() - iO;
                    writeUInt32NoTag(iPosition);
                    this.f26757k += iPosition;
                } else {
                    int iK = M1.k(str);
                    writeUInt32NoTag(iK);
                    q(this.f26757k);
                    M1.j(str, this.f26752f);
                    this.f26757k += iK;
                }
            } catch (M1.d e8) {
                this.f26757k = j8;
                q(j8);
                h(str, e8);
            } catch (IllegalArgumentException e9) {
                throw new e(e9);
            } catch (IndexOutOfBoundsException e10) {
                throw new e(e10);
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeTag(int i8, int i9) throws e {
            writeUInt32NoTag(P1.a(i8, i9));
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeUInt32(int i8, int i9) throws e {
            writeTag(i8, 0);
            writeUInt32NoTag(i9);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeUInt32NoTag(int i8) throws e {
            if (this.f26757k <= this.f26756j) {
                while ((i8 & (-128)) != 0) {
                    long j8 = this.f26757k;
                    this.f26757k = j8 + 1;
                    L1.R(j8, (byte) ((i8 & 127) | 128));
                    i8 >>>= 7;
                }
                long j9 = this.f26757k;
                this.f26757k = 1 + j9;
                L1.R(j9, (byte) i8);
                return;
            }
            while (true) {
                long j10 = this.f26757k;
                if (j10 >= this.f26755i) {
                    throw new e(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f26757k), Long.valueOf(this.f26755i), 1));
                }
                if ((i8 & (-128)) == 0) {
                    this.f26757k = 1 + j10;
                    L1.R(j10, (byte) i8);
                    return;
                } else {
                    this.f26757k = j10 + 1;
                    L1.R(j10, (byte) ((i8 & 127) | 128));
                    i8 >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeUInt64(int i8, long j8) throws e {
            writeTag(i8, 0);
            writeUInt64NoTag(j8);
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeUInt64NoTag(long j8) throws e {
            if (this.f26757k <= this.f26756j) {
                while ((j8 & (-128)) != 0) {
                    long j9 = this.f26757k;
                    this.f26757k = j9 + 1;
                    L1.R(j9, (byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
                long j10 = this.f26757k;
                this.f26757k = 1 + j10;
                L1.R(j10, (byte) j8);
                return;
            }
            while (true) {
                long j11 = this.f26757k;
                if (j11 >= this.f26755i) {
                    throw new e(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f26757k), Long.valueOf(this.f26755i), 1));
                }
                if ((j8 & (-128)) == 0) {
                    this.f26757k = 1 + j11;
                    L1.R(j11, (byte) j8);
                    return;
                } else {
                    this.f26757k = j11 + 1;
                    L1.R(j11, (byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.AbstractC5248t
        public void writeByteArray(int i8, byte[] bArr, int i9, int i10) throws e {
            writeTag(i8, 2);
            writeByteArrayNoTag(bArr, i9, i10);
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void writeLazy(ByteBuffer byteBuffer) throws e {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void write(byte[] bArr, int i8, int i9) throws e {
            if (bArr != null && i8 >= 0 && i9 >= 0 && bArr.length - i9 >= i8) {
                long j8 = i9;
                long j9 = this.f26755i - j8;
                long j10 = this.f26757k;
                if (j9 >= j10) {
                    L1.q(bArr, i8, j10, j8);
                    this.f26757k += j8;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new e(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f26757k), Long.valueOf(this.f26755i), Integer.valueOf(i9)));
        }

        @Override // com.google.protobuf.AbstractC5248t, com.google.protobuf.AbstractC5232n
        public void write(ByteBuffer byteBuffer) throws e {
            try {
                int iRemaining = byteBuffer.remaining();
                q(this.f26757k);
                this.f26752f.put(byteBuffer);
                this.f26757k += iRemaining;
            } catch (BufferOverflowException e8) {
                throw new e(e8);
            }
        }
    }

    /* synthetic */ AbstractC5248t(a aVar) {
        this();
    }

    static int b(int i8, K0 k02, InterfaceC5219i1 interfaceC5219i1) {
        return (computeTagSize(i8) * 2) + c(k02, interfaceC5219i1);
    }

    static int c(K0 k02, InterfaceC5219i1 interfaceC5219i1) {
        return ((AbstractC5196b) k02).getSerializedSize(interfaceC5219i1);
    }

    public static int computeBoolSize(int i8, boolean z8) {
        return computeTagSize(i8) + computeBoolSizeNoTag(z8);
    }

    public static int computeBoolSizeNoTag(boolean z8) {
        return 1;
    }

    public static int computeByteArraySize(int i8, byte[] bArr) {
        return computeTagSize(i8) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return d(bArr.length);
    }

    public static int computeByteBufferSize(int i8, ByteBuffer byteBuffer) {
        return computeTagSize(i8) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return d(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i8, AbstractC5235o abstractC5235o) {
        return computeTagSize(i8) + computeBytesSizeNoTag(abstractC5235o);
    }

    public static int computeBytesSizeNoTag(AbstractC5235o abstractC5235o) {
        return d(abstractC5235o.size());
    }

    public static int computeDoubleSize(int i8, double d9) {
        return computeTagSize(i8) + computeDoubleSizeNoTag(d9);
    }

    public static int computeDoubleSizeNoTag(double d9) {
        return 8;
    }

    public static int computeEnumSize(int i8, int i9) {
        return computeTagSize(i8) + computeEnumSizeNoTag(i9);
    }

    public static int computeEnumSizeNoTag(int i8) {
        return computeInt32SizeNoTag(i8);
    }

    public static int computeFixed32Size(int i8, int i9) {
        return computeTagSize(i8) + computeFixed32SizeNoTag(i9);
    }

    public static int computeFixed32SizeNoTag(int i8) {
        return 4;
    }

    public static int computeFixed64Size(int i8, long j8) {
        return computeTagSize(i8) + computeFixed64SizeNoTag(j8);
    }

    public static int computeFixed64SizeNoTag(long j8) {
        return 8;
    }

    public static int computeFloatSize(int i8, float f8) {
        return computeTagSize(i8) + computeFloatSizeNoTag(f8);
    }

    public static int computeFloatSizeNoTag(float f8) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i8, K0 k02) {
        return (computeTagSize(i8) * 2) + k02.getSerializedSize();
    }

    @Deprecated
    public static int computeGroupSizeNoTag(K0 k02) {
        return k02.getSerializedSize();
    }

    public static int computeInt32Size(int i8, int i9) {
        return computeTagSize(i8) + computeInt32SizeNoTag(i9);
    }

    public static int computeInt32SizeNoTag(int i8) {
        if (i8 >= 0) {
            return computeUInt32SizeNoTag(i8);
        }
        return 10;
    }

    public static int computeInt64Size(int i8, long j8) {
        return computeTagSize(i8) + computeInt64SizeNoTag(j8);
    }

    public static int computeInt64SizeNoTag(long j8) {
        return computeUInt64SizeNoTag(j8);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i8, C5244r0 c5244r0) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i8) + computeLazyFieldSize(3, c5244r0);
    }

    public static int computeLazyFieldSize(int i8, C5244r0 c5244r0) {
        return computeTagSize(i8) + computeLazyFieldSizeNoTag(c5244r0);
    }

    public static int computeLazyFieldSizeNoTag(C5244r0 c5244r0) {
        return d(c5244r0.getSerializedSize());
    }

    public static int computeMessageSetExtensionSize(int i8, K0 k02) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i8) + computeMessageSize(3, k02);
    }

    public static int computeMessageSize(int i8, K0 k02) {
        return computeTagSize(i8) + computeMessageSizeNoTag(k02);
    }

    public static int computeMessageSizeNoTag(K0 k02) {
        return d(k02.getSerializedSize());
    }

    public static int computeRawMessageSetExtensionSize(int i8, AbstractC5235o abstractC5235o) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i8) + computeBytesSize(3, abstractC5235o);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i8) {
        return computeUInt32SizeNoTag(i8);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j8) {
        return computeUInt64SizeNoTag(j8);
    }

    public static int computeSFixed32Size(int i8, int i9) {
        return computeTagSize(i8) + computeSFixed32SizeNoTag(i9);
    }

    public static int computeSFixed32SizeNoTag(int i8) {
        return 4;
    }

    public static int computeSFixed64Size(int i8, long j8) {
        return computeTagSize(i8) + computeSFixed64SizeNoTag(j8);
    }

    public static int computeSFixed64SizeNoTag(long j8) {
        return 8;
    }

    public static int computeSInt32Size(int i8, int i9) {
        return computeTagSize(i8) + computeSInt32SizeNoTag(i9);
    }

    public static int computeSInt32SizeNoTag(int i8) {
        return computeUInt32SizeNoTag(encodeZigZag32(i8));
    }

    public static int computeSInt64Size(int i8, long j8) {
        return computeTagSize(i8) + computeSInt64SizeNoTag(j8);
    }

    public static int computeSInt64SizeNoTag(long j8) {
        return computeUInt64SizeNoTag(encodeZigZag64(j8));
    }

    public static int computeStringSize(int i8, String str) {
        return computeTagSize(i8) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = M1.k(str);
        } catch (M1.d unused) {
            length = str.getBytes(AbstractC5227l0.f26567b).length;
        }
        return d(length);
    }

    public static int computeTagSize(int i8) {
        return computeUInt32SizeNoTag(P1.a(i8, 0));
    }

    public static int computeUInt32Size(int i8, int i9) {
        return computeTagSize(i8) + computeUInt32SizeNoTag(i9);
    }

    public static int computeUInt32SizeNoTag(int i8) {
        if ((i8 & (-128)) == 0) {
            return 1;
        }
        if ((i8 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i8) == 0) {
            return 3;
        }
        return (i8 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i8, long j8) {
        return computeTagSize(i8) + computeUInt64SizeNoTag(j8);
    }

    public static int computeUInt64SizeNoTag(long j8) {
        int i8;
        if (((-128) & j8) == 0) {
            return 1;
        }
        if (j8 < 0) {
            return 10;
        }
        if (((-34359738368L) & j8) != 0) {
            j8 >>>= 28;
            i8 = 6;
        } else {
            i8 = 2;
        }
        if (((-2097152) & j8) != 0) {
            i8 += 2;
            j8 >>>= 14;
        }
        return (j8 & (-16384)) != 0 ? i8 + 1 : i8;
    }

    static int d(int i8) {
        return computeUInt32SizeNoTag(i8) + i8;
    }

    static int e(int i8, K0 k02, InterfaceC5219i1 interfaceC5219i1) {
        return computeTagSize(i8) + f(k02, interfaceC5219i1);
    }

    public static int encodeZigZag32(int i8) {
        return (i8 >> 31) ^ (i8 << 1);
    }

    public static long encodeZigZag64(long j8) {
        return (j8 >> 63) ^ (j8 << 1);
    }

    static int f(K0 k02, InterfaceC5219i1 interfaceC5219i1) {
        return d(((AbstractC5196b) k02).getSerializedSize(interfaceC5219i1));
    }

    static int g(int i8) {
        if (i8 > 4096) {
            return 4096;
        }
        return i8;
    }

    static AbstractC5248t j(ByteBuffer byteBuffer) {
        return new g(byteBuffer);
    }

    static AbstractC5248t k(ByteBuffer byteBuffer) {
        return new h(byteBuffer);
    }

    public static AbstractC5248t newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush();

    public abstract int getTotalBytesWritten();

    final void h(String str, M1.d dVar) throws e {
        f26733c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC5227l0.f26567b);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e8) {
            throw new e(e8);
        }
    }

    boolean i() {
        return this.f26736b;
    }

    final void l(int i8, K0 k02, InterfaceC5219i1 interfaceC5219i1) {
        writeTag(i8, 3);
        m(k02, interfaceC5219i1);
        writeTag(i8, 4);
    }

    final void m(K0 k02, InterfaceC5219i1 interfaceC5219i1) {
        interfaceC5219i1.writeTo(k02, this.f26735a);
    }

    abstract void n(int i8, K0 k02, InterfaceC5219i1 interfaceC5219i1);

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.f26736b = true;
    }

    @Override // com.google.protobuf.AbstractC5232n
    public abstract void write(byte b9);

    @Override // com.google.protobuf.AbstractC5232n
    public abstract void write(ByteBuffer byteBuffer);

    @Override // com.google.protobuf.AbstractC5232n
    public abstract void write(byte[] bArr, int i8, int i9);

    public abstract void writeBool(int i8, boolean z8);

    public final void writeBoolNoTag(boolean z8) {
        write(z8 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i8, byte[] bArr);

    public abstract void writeByteArray(int i8, byte[] bArr, int i9, int i10);

    public final void writeByteArrayNoTag(byte[] bArr) {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    abstract void writeByteArrayNoTag(byte[] bArr, int i8, int i9);

    public abstract void writeByteBuffer(int i8, ByteBuffer byteBuffer);

    public abstract void writeBytes(int i8, AbstractC5235o abstractC5235o);

    public abstract void writeBytesNoTag(AbstractC5235o abstractC5235o);

    public final void writeDouble(int i8, double d9) {
        writeFixed64(i8, Double.doubleToRawLongBits(d9));
    }

    public final void writeDoubleNoTag(double d9) {
        writeFixed64NoTag(Double.doubleToRawLongBits(d9));
    }

    public final void writeEnum(int i8, int i9) {
        writeInt32(i8, i9);
    }

    public final void writeEnumNoTag(int i8) {
        writeInt32NoTag(i8);
    }

    public abstract void writeFixed32(int i8, int i9);

    public abstract void writeFixed32NoTag(int i8);

    public abstract void writeFixed64(int i8, long j8);

    public abstract void writeFixed64NoTag(long j8);

    public final void writeFloat(int i8, float f8) {
        writeFixed32(i8, Float.floatToRawIntBits(f8));
    }

    public final void writeFloatNoTag(float f8) {
        writeFixed32NoTag(Float.floatToRawIntBits(f8));
    }

    @Deprecated
    public final void writeGroup(int i8, K0 k02) {
        writeTag(i8, 3);
        writeGroupNoTag(k02);
        writeTag(i8, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(K0 k02) {
        k02.writeTo(this);
    }

    public abstract void writeInt32(int i8, int i9);

    public abstract void writeInt32NoTag(int i8);

    public final void writeInt64(int i8, long j8) {
        writeUInt64(i8, j8);
    }

    public final void writeInt64NoTag(long j8) {
        writeUInt64NoTag(j8);
    }

    @Override // com.google.protobuf.AbstractC5232n
    public abstract void writeLazy(ByteBuffer byteBuffer);

    @Override // com.google.protobuf.AbstractC5232n
    public abstract void writeLazy(byte[] bArr, int i8, int i9);

    public abstract void writeMessage(int i8, K0 k02);

    public abstract void writeMessageNoTag(K0 k02);

    public abstract void writeMessageSetExtension(int i8, K0 k02);

    public final void writeRawByte(byte b9) {
        write(b9);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer);

    public final void writeRawBytes(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i8) {
        writeFixed32NoTag(i8);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j8) {
        writeFixed64NoTag(j8);
    }

    public abstract void writeRawMessageSetExtension(int i8, AbstractC5235o abstractC5235o);

    @Deprecated
    public final void writeRawVarint32(int i8) {
        writeUInt32NoTag(i8);
    }

    @Deprecated
    public final void writeRawVarint64(long j8) {
        writeUInt64NoTag(j8);
    }

    public final void writeSFixed32(int i8, int i9) {
        writeFixed32(i8, i9);
    }

    public final void writeSFixed32NoTag(int i8) {
        writeFixed32NoTag(i8);
    }

    public final void writeSFixed64(int i8, long j8) {
        writeFixed64(i8, j8);
    }

    public final void writeSFixed64NoTag(long j8) {
        writeFixed64NoTag(j8);
    }

    public final void writeSInt32(int i8, int i9) {
        writeUInt32(i8, encodeZigZag32(i9));
    }

    public final void writeSInt32NoTag(int i8) {
        writeUInt32NoTag(encodeZigZag32(i8));
    }

    public final void writeSInt64(int i8, long j8) {
        writeUInt64(i8, encodeZigZag64(j8));
    }

    public final void writeSInt64NoTag(long j8) {
        writeUInt64NoTag(encodeZigZag64(j8));
    }

    public abstract void writeString(int i8, String str);

    public abstract void writeStringNoTag(String str);

    public abstract void writeTag(int i8, int i9);

    public abstract void writeUInt32(int i8, int i9);

    public abstract void writeUInt32NoTag(int i8);

    public abstract void writeUInt64(int i8, long j8);

    public abstract void writeUInt64NoTag(long j8);

    private AbstractC5248t() {
    }

    public static AbstractC5248t newInstance(OutputStream outputStream, int i8) {
        return new f(outputStream, i8);
    }

    public final void writeRawByte(int i8) {
        write((byte) i8);
    }

    public final void writeRawBytes(byte[] bArr, int i8, int i9) {
        write(bArr, i8, i9);
    }

    public static AbstractC5248t newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(AbstractC5235o abstractC5235o) {
        abstractC5235o.u(this);
    }

    public static AbstractC5248t newInstance(byte[] bArr, int i8, int i9) {
        return new c(bArr, i8, i9);
    }

    public static AbstractC5248t newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new d(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (h.p()) {
                return k(byteBuffer);
            }
            return j(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static AbstractC5248t newInstance(ByteBuffer byteBuffer, int i8) {
        return newInstance(byteBuffer);
    }
}
