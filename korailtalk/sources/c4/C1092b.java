package c4;

import a4.AbstractC0834a;

/* renamed from: c4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1092b {
    public static final C1092b PDF417_GF = new C1092b(AbstractC0834a.NUMBER_OF_CODEWORDS, 3);

    /* renamed from: a, reason: collision with root package name */
    private final int[] f11474a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f11475b;

    /* renamed from: c, reason: collision with root package name */
    private final c f11476c;

    /* renamed from: d, reason: collision with root package name */
    private final c f11477d;

    /* renamed from: e, reason: collision with root package name */
    private final int f11478e;

    private C1092b(int i8, int i9) {
        this.f11478e = i8;
        this.f11474a = new int[i8];
        this.f11475b = new int[i8];
        int i10 = 1;
        for (int i11 = 0; i11 < i8; i11++) {
            this.f11474a[i11] = i10;
            i10 = (i10 * i9) % i8;
        }
        for (int i12 = 0; i12 < i8 - 1; i12++) {
            this.f11475b[this.f11474a[i12]] = i12;
        }
        this.f11476c = new c(this, new int[]{0});
        this.f11477d = new c(this, new int[]{1});
    }

    int a(int i8, int i9) {
        return (i8 + i9) % this.f11478e;
    }

    c b(int i8, int i9) {
        if (i8 < 0) {
            throw new IllegalArgumentException();
        }
        if (i9 == 0) {
            return this.f11476c;
        }
        int[] iArr = new int[i8 + 1];
        iArr[0] = i9;
        return new c(this, iArr);
    }

    int c(int i8) {
        return this.f11474a[i8];
    }

    c d() {
        return this.f11477d;
    }

    int e() {
        return this.f11478e;
    }

    c f() {
        return this.f11476c;
    }

    int g(int i8) {
        if (i8 != 0) {
            return this.f11474a[(this.f11478e - this.f11475b[i8]) - 1];
        }
        throw new ArithmeticException();
    }

    int h(int i8) {
        if (i8 != 0) {
            return this.f11475b[i8];
        }
        throw new IllegalArgumentException();
    }

    int i(int i8, int i9) {
        if (i8 == 0 || i9 == 0) {
            return 0;
        }
        int[] iArr = this.f11474a;
        int[] iArr2 = this.f11475b;
        return iArr[(iArr2[i8] + iArr2[i9]) % (this.f11478e - 1)];
    }

    int j(int i8, int i9) {
        int i10 = this.f11478e;
        return ((i8 + i10) - i9) % i10;
    }
}
