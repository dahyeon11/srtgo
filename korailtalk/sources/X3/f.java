package X3;

/* loaded from: classes2.dex */
public abstract class f {
    private static int a(int i8, int i9) {
        int i10 = i8 - i9;
        if (i10 > i9) {
            i10 = i9;
            i9 = i10;
        }
        int i11 = 1;
        int i12 = 1;
        while (i8 > i9) {
            i11 *= i8;
            if (i12 <= i10) {
                i11 /= i12;
                i12++;
            }
            i8--;
        }
        while (i12 <= i10) {
            i11 /= i12;
            i12++;
        }
        return i11;
    }

    public static int getRSSvalue(int[] iArr, int i8, boolean z8) {
        int[] iArr2 = iArr;
        int i9 = 0;
        for (int i10 : iArr2) {
            i9 += i10;
        }
        int length = iArr2.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = length - 1;
            if (i11 >= i14) {
                return i12;
            }
            int i15 = 1 << i11;
            i13 |= i15;
            int i16 = 1;
            while (i16 < iArr2[i11]) {
                int i17 = i9 - i16;
                int i18 = length - i11;
                int i19 = i18 - 2;
                int iA = a(i17 - 1, i19);
                if (z8 && i13 == 0) {
                    int i20 = i18 - 1;
                    if (i17 - i20 >= i20) {
                        iA -= a(i17 - i18, i19);
                    }
                }
                if (i18 - 1 > 1) {
                    int iA2 = 0;
                    for (int i21 = i17 - i19; i21 > i8; i21--) {
                        iA2 += a((i17 - i21) - 1, i18 - 3);
                    }
                    iA -= iA2 * (i14 - i11);
                } else if (i17 > i8) {
                    iA--;
                }
                i12 += iA;
                i16++;
                i13 &= ~i15;
                iArr2 = iArr;
            }
            i9 -= i16;
            i11++;
            iArr2 = iArr;
        }
    }
}
