package I7;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private int f2514a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f2515b = new int[10];

    void a() {
        this.f2514a = 0;
        Arrays.fill(this.f2515b, 0);
    }

    int b(int i8) {
        return this.f2515b[i8];
    }

    int c() {
        if ((this.f2514a & 2) != 0) {
            return this.f2515b[1];
        }
        return -1;
    }

    int d() {
        if ((this.f2514a & 128) != 0) {
            return this.f2515b[7];
        }
        return 65535;
    }

    int e(int i8) {
        return (this.f2514a & 16) != 0 ? this.f2515b[4] : i8;
    }

    int f(int i8) {
        return (this.f2514a & 32) != 0 ? this.f2515b[5] : i8;
    }

    boolean g(int i8) {
        return ((1 << i8) & this.f2514a) != 0;
    }

    void h(m mVar) {
        for (int i8 = 0; i8 < 10; i8++) {
            if (mVar.g(i8)) {
                i(i8, mVar.b(i8));
            }
        }
    }

    m i(int i8, int i9) {
        if (i8 >= 0) {
            int[] iArr = this.f2515b;
            if (i8 < iArr.length) {
                this.f2514a = (1 << i8) | this.f2514a;
                iArr[i8] = i9;
            }
        }
        return this;
    }

    int j() {
        return Integer.bitCount(this.f2514a);
    }
}
