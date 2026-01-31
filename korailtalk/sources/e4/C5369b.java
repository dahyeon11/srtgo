package e4;

/* renamed from: e4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5369b {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f30438a;

    /* renamed from: b, reason: collision with root package name */
    private int f30439b = 0;

    C5369b(int i8) {
        this.f30438a = new byte[i8];
    }

    private void c(int i8, boolean z8) {
        this.f30438a[i8] = z8 ? (byte) 1 : (byte) 0;
    }

    void a(boolean z8, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f30439b;
            this.f30439b = i10 + 1;
            c(i10, z8);
        }
    }

    byte[] b(int i8) {
        int length = this.f30438a.length * i8;
        byte[] bArr = new byte[length];
        for (int i9 = 0; i9 < length; i9++) {
            bArr[i9] = this.f30438a[i9 / i8];
        }
        return bArr;
    }
}
