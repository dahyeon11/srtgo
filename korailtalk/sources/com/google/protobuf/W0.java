package com.google.protobuf;

import com.google.protobuf.AbstractC5235o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class W0 extends AbstractC5235o.i {

    /* renamed from: d, reason: collision with root package name */
    private final ByteBuffer f26348d;

    W0(ByteBuffer byteBuffer) {
        AbstractC5227l0.b(byteBuffer, "buffer");
        this.f26348d = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private ByteBuffer x(int i8, int i9) {
        if (i8 < this.f26348d.position() || i9 > this.f26348d.limit() || i8 > i9) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        ByteBuffer byteBufferSlice = this.f26348d.slice();
        AbstractC5236o0.e(byteBufferSlice, i8 - this.f26348d.position());
        AbstractC5236o0.c(byteBufferSlice, i9 - this.f26348d.position());
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.AbstractC5235o
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.f26348d.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC5235o
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.AbstractC5235o
    public byte byteAt(int i8) {
        try {
            return this.f26348d.get(i8);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw e8;
        } catch (IndexOutOfBoundsException e9) {
            throw new ArrayIndexOutOfBoundsException(e9.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC5235o
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f26348d.slice());
    }

    @Override // com.google.protobuf.AbstractC5235o
    protected void e(byte[] bArr, int i8, int i9, int i10) {
        ByteBuffer byteBufferSlice = this.f26348d.slice();
        AbstractC5236o0.e(byteBufferSlice, i8);
        byteBufferSlice.get(bArr, i9, i10);
    }

    @Override // com.google.protobuf.AbstractC5235o
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5235o)) {
            return false;
        }
        AbstractC5235o abstractC5235o = (AbstractC5235o) obj;
        if (size() != abstractC5235o.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof W0 ? this.f26348d.equals(((W0) obj).f26348d) : obj instanceof C5216h1 ? obj.equals(this) : this.f26348d.equals(abstractC5235o.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.AbstractC5235o
    public byte internalByteAt(int i8) {
        return byteAt(i8);
    }

    @Override // com.google.protobuf.AbstractC5235o
    public boolean isValidUtf8() {
        return M1.s(this.f26348d);
    }

    @Override // com.google.protobuf.AbstractC5235o
    protected int k(int i8, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + this.f26348d.get(i11);
        }
        return i8;
    }

    @Override // com.google.protobuf.AbstractC5235o
    protected int l(int i8, int i9, int i10) {
        return M1.v(i8, this.f26348d, i9, i10 + i9);
    }

    @Override // com.google.protobuf.AbstractC5235o
    public r newCodedInput() {
        return r.b(this.f26348d, true);
    }

    @Override // com.google.protobuf.AbstractC5235o
    public InputStream newInput() {
        return new a();
    }

    @Override // com.google.protobuf.AbstractC5235o
    protected String p(Charset charset) {
        byte[] byteArray;
        int length;
        int iArrayOffset;
        if (this.f26348d.hasArray()) {
            byteArray = this.f26348d.array();
            iArrayOffset = this.f26348d.arrayOffset() + this.f26348d.position();
            length = this.f26348d.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iArrayOffset = 0;
        }
        return new String(byteArray, iArrayOffset, length, charset);
    }

    @Override // com.google.protobuf.AbstractC5235o
    public int size() {
        return this.f26348d.remaining();
    }

    @Override // com.google.protobuf.AbstractC5235o
    public AbstractC5235o substring(int i8, int i9) {
        try {
            return new W0(x(i8, i9));
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw e8;
        } catch (IndexOutOfBoundsException e9) {
            throw new ArrayIndexOutOfBoundsException(e9.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC5235o
    void u(AbstractC5232n abstractC5232n) {
        abstractC5232n.writeLazy(this.f26348d.slice());
    }

    @Override // com.google.protobuf.AbstractC5235o.i
    boolean v(AbstractC5235o abstractC5235o, int i8, int i9) {
        return substring(0, i9).equals(abstractC5235o.substring(i8, i9 + i8));
    }

    @Override // com.google.protobuf.AbstractC5235o
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    class a extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f26349a;

        a() {
            this.f26349a = W0.this.f26348d.slice();
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f26349a.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i8) {
            AbstractC5236o0.d(this.f26349a);
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f26349a.hasRemaining()) {
                return this.f26349a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                AbstractC5236o0.f(this.f26349a);
            } catch (InvalidMarkException e8) {
                throw new IOException(e8);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) {
            if (!this.f26349a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i9, this.f26349a.remaining());
            this.f26349a.get(bArr, i8, iMin);
            return iMin;
        }
    }
}
