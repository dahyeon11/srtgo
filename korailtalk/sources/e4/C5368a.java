package e4;

import java.lang.reflect.Array;

/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5368a {

    /* renamed from: a, reason: collision with root package name */
    private final C5369b[] f30434a;

    /* renamed from: b, reason: collision with root package name */
    private int f30435b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30436c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30437d;

    C5368a(int i8, int i9) {
        C5369b[] c5369bArr = new C5369b[i8];
        this.f30434a = c5369bArr;
        int length = c5369bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f30434a[i10] = new C5369b(((i9 + 4) * 17) + 1);
        }
        this.f30437d = i9 * 17;
        this.f30436c = i8;
        this.f30435b = -1;
    }

    C5369b a() {
        return this.f30434a[this.f30435b];
    }

    void b() {
        this.f30435b++;
    }

    public byte[][] getMatrix() {
        return getScaledMatrix(1, 1);
    }

    public byte[][] getScaledMatrix(int i8, int i9) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f30436c * i9, this.f30437d * i8);
        int i10 = this.f30436c * i9;
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[(i10 - i11) - 1] = this.f30434a[i11 / i9].b(i8);
        }
        return bArr;
    }
}
