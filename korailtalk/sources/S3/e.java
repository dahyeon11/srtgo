package S3;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f4606a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4607b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4608c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f4609d;

    public e(CharSequence charSequence, int i8, int i9) {
        this.f4606a = charSequence;
        this.f4608c = i8;
        this.f4607b = i9;
        byte[] bArr = new byte[i8 * i9];
        this.f4609d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void a(int i8) {
        f(this.f4607b - 1, 0, i8, 1);
        f(this.f4607b - 1, 1, i8, 2);
        f(this.f4607b - 1, 2, i8, 3);
        f(0, this.f4608c - 2, i8, 4);
        f(0, this.f4608c - 1, i8, 5);
        f(1, this.f4608c - 1, i8, 6);
        f(2, this.f4608c - 1, i8, 7);
        f(3, this.f4608c - 1, i8, 8);
    }

    private void b(int i8) {
        f(this.f4607b - 3, 0, i8, 1);
        f(this.f4607b - 2, 0, i8, 2);
        f(this.f4607b - 1, 0, i8, 3);
        f(0, this.f4608c - 4, i8, 4);
        f(0, this.f4608c - 3, i8, 5);
        f(0, this.f4608c - 2, i8, 6);
        f(0, this.f4608c - 1, i8, 7);
        f(1, this.f4608c - 1, i8, 8);
    }

    private void c(int i8) {
        f(this.f4607b - 3, 0, i8, 1);
        f(this.f4607b - 2, 0, i8, 2);
        f(this.f4607b - 1, 0, i8, 3);
        f(0, this.f4608c - 2, i8, 4);
        f(0, this.f4608c - 1, i8, 5);
        f(1, this.f4608c - 1, i8, 6);
        f(2, this.f4608c - 1, i8, 7);
        f(3, this.f4608c - 1, i8, 8);
    }

    private void d(int i8) {
        f(this.f4607b - 1, 0, i8, 1);
        f(this.f4607b - 1, this.f4608c - 1, i8, 2);
        f(0, this.f4608c - 3, i8, 3);
        f(0, this.f4608c - 2, i8, 4);
        f(0, this.f4608c - 1, i8, 5);
        f(1, this.f4608c - 3, i8, 6);
        f(1, this.f4608c - 2, i8, 7);
        f(1, this.f4608c - 1, i8, 8);
    }

    private boolean e(int i8, int i9) {
        return this.f4609d[(i9 * this.f4608c) + i8] >= 0;
    }

    private void f(int i8, int i9, int i10, int i11) {
        if (i8 < 0) {
            int i12 = this.f4607b;
            i8 += i12;
            i9 += 4 - ((i12 + 4) % 8);
        }
        if (i9 < 0) {
            int i13 = this.f4608c;
            i9 += i13;
            i8 += 4 - ((i13 + 4) % 8);
        }
        g(i9, i8, (this.f4606a.charAt(i10) & (1 << (8 - i11))) != 0);
    }

    private void g(int i8, int i9, boolean z8) {
        this.f4609d[(i9 * this.f4608c) + i8] = z8 ? (byte) 1 : (byte) 0;
    }

    private void h(int i8, int i9, int i10) {
        int i11 = i8 - 2;
        int i12 = i9 - 2;
        f(i11, i12, i10, 1);
        int i13 = i9 - 1;
        f(i11, i13, i10, 2);
        int i14 = i8 - 1;
        f(i14, i12, i10, 3);
        f(i14, i13, i10, 4);
        f(i14, i9, i10, 5);
        f(i8, i12, i10, 6);
        f(i8, i13, i10, 7);
        f(i8, i9, i10, 8);
    }

    public final boolean getBit(int i8, int i9) {
        return this.f4609d[(i9 * this.f4608c) + i8] == 1;
    }

    public final void place() {
        int i8;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 4;
        while (true) {
            if (i12 == this.f4607b && i10 == 0) {
                a(i11);
                i11++;
            }
            if (i12 == this.f4607b - 2 && i10 == 0 && this.f4608c % 4 != 0) {
                b(i11);
                i11++;
            }
            if (i12 == this.f4607b - 2 && i10 == 0 && this.f4608c % 8 == 4) {
                c(i11);
                i11++;
            }
            if (i12 == this.f4607b + 4 && i10 == 2 && this.f4608c % 8 == 0) {
                d(i11);
                i11++;
            }
            while (true) {
                if (i12 < this.f4607b && i10 >= 0 && !e(i10, i12)) {
                    h(i12, i10, i11);
                    i11++;
                }
                int i13 = i12 - 2;
                int i14 = i10 + 2;
                if (i13 < 0 || i14 >= this.f4608c) {
                    break;
                }
                i12 = i13;
                i10 = i14;
            }
            int i15 = i12 - 1;
            int i16 = i10 + 5;
            while (true) {
                if (i15 >= 0 && i16 < this.f4608c && !e(i16, i15)) {
                    h(i15, i16, i11);
                    i11++;
                }
                int i17 = i15 + 2;
                int i18 = i16 - 2;
                i8 = this.f4607b;
                if (i17 >= i8 || i18 < 0) {
                    break;
                }
                i15 = i17;
                i16 = i18;
            }
            i12 = i15 + 5;
            i10 = i16 - 1;
            if (i12 >= i8 && i10 >= (i9 = this.f4608c)) {
                break;
            }
        }
        if (e(i9 - 1, i8 - 1)) {
            return;
        }
        g(this.f4608c - 1, this.f4607b - 1, true);
        g(this.f4608c - 2, this.f4607b - 2, true);
    }
}
