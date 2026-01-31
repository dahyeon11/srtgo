package I6;

import io.grpc.internal.W0;

/* loaded from: classes.dex */
class o implements W0 {

    /* renamed from: a, reason: collision with root package name */
    private final P7.c f2344a;

    /* renamed from: b, reason: collision with root package name */
    private int f2345b;

    /* renamed from: c, reason: collision with root package name */
    private int f2346c;

    o(P7.c cVar, int i8) {
        this.f2344a = cVar;
        this.f2345b = i8;
    }

    P7.c a() {
        return this.f2344a;
    }

    @Override // io.grpc.internal.W0
    public int readableBytes() {
        return this.f2346c;
    }

    @Override // io.grpc.internal.W0
    public int writableBytes() {
        return this.f2345b;
    }

    @Override // io.grpc.internal.W0
    public void write(byte[] bArr, int i8, int i9) {
        this.f2344a.write(bArr, i8, i9);
        this.f2345b -= i9;
        this.f2346c += i9;
    }

    @Override // io.grpc.internal.W0
    public void write(byte b9) {
        this.f2344a.writeByte((int) b9);
        this.f2345b--;
        this.f2346c++;
    }

    @Override // io.grpc.internal.W0
    public void release() {
    }
}
