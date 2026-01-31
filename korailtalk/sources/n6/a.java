package N6;

import com.google.protobuf.AbstractC5248t;
import com.google.protobuf.K0;
import com.google.protobuf.Z0;
import io.grpc.B;
import io.grpc.Z;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
final class a extends InputStream implements B, Z {

    /* renamed from: a */
    private K0 f3269a;

    /* renamed from: b */
    private final Z0 f3270b;

    /* renamed from: c */
    private ByteArrayInputStream f3271c;

    a(K0 k02, Z0 z02) {
        this.f3269a = k02;
        this.f3270b = z02;
    }

    K0 a() {
        K0 k02 = this.f3269a;
        if (k02 != null) {
            return k02;
        }
        throw new IllegalStateException("message not available");
    }

    @Override // java.io.InputStream, io.grpc.Z
    public int available() {
        K0 k02 = this.f3269a;
        if (k02 != null) {
            return k02.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f3271c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    Z0 b() {
        return this.f3270b;
    }

    @Override // io.grpc.B
    public int drainTo(OutputStream outputStream) {
        K0 k02 = this.f3269a;
        if (k02 != null) {
            int serializedSize = k02.getSerializedSize();
            this.f3269a.writeTo(outputStream);
            this.f3269a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3271c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int iA = (int) b.a(byteArrayInputStream, outputStream);
        this.f3271c = null;
        return iA;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f3269a != null) {
            this.f3271c = new ByteArrayInputStream(this.f3269a.toByteArray());
            this.f3269a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3271c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) {
        K0 k02 = this.f3269a;
        if (k02 != null) {
            int serializedSize = k02.getSerializedSize();
            if (serializedSize == 0) {
                this.f3269a = null;
                this.f3271c = null;
                return -1;
            }
            if (i9 >= serializedSize) {
                AbstractC5248t abstractC5248tNewInstance = AbstractC5248t.newInstance(bArr, i8, serializedSize);
                this.f3269a.writeTo(abstractC5248tNewInstance);
                abstractC5248tNewInstance.flush();
                abstractC5248tNewInstance.checkNoSpaceLeft();
                this.f3269a = null;
                this.f3271c = null;
                return serializedSize;
            }
            this.f3271c = new ByteArrayInputStream(this.f3269a.toByteArray());
            this.f3269a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3271c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i8, i9);
        }
        return -1;
    }
}
