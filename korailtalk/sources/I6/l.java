package I6;

import io.grpc.internal.AbstractC5740c;
import io.grpc.internal.y0;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
class l extends AbstractC5740c {

    /* renamed from: a, reason: collision with root package name */
    private final P7.c f2342a;

    l(P7.c cVar) {
        this.f2342a = cVar;
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2342a.clear();
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public void readBytes(byte[] bArr, int i8, int i9) {
        while (i9 > 0) {
            int i10 = this.f2342a.read(bArr, i8, i9);
            if (i10 == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i9 + " bytes");
            }
            i9 -= i10;
            i8 += i10;
        }
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public int readUnsignedByte() {
        try {
            b();
            return this.f2342a.readByte() & 255;
        } catch (EOFException e8) {
            throw new IndexOutOfBoundsException(e8.getMessage());
        }
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public int readableBytes() {
        return (int) this.f2342a.size();
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public void skipBytes(int i8) {
        try {
            this.f2342a.skip(i8);
        } catch (EOFException e8) {
            throw new IndexOutOfBoundsException(e8.getMessage());
        }
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public void readBytes(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public void readBytes(OutputStream outputStream, int i8) throws IOException {
        this.f2342a.writeTo(outputStream, i8);
    }

    @Override // io.grpc.internal.AbstractC5740c, io.grpc.internal.y0
    public y0 readBytes(int i8) {
        P7.c cVar = new P7.c();
        cVar.write(this.f2342a, i8);
        return new l(cVar);
    }

    private void b() {
    }
}
