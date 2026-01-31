package b4;

import a4.AbstractC0834a;
import java.lang.reflect.Array;

/* loaded from: classes2.dex */
abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final float[][] f11429a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, AbstractC0834a.SYMBOL_TABLE.length, 8);

    static {
        int i8;
        int i9 = 0;
        while (true) {
            int[] iArr = AbstractC0834a.SYMBOL_TABLE;
            if (i9 >= iArr.length) {
                return;
            }
            int i10 = iArr[i9];
            int i11 = i10 & 1;
            int i12 = 0;
            while (i12 < 8) {
                float f8 = 0.0f;
                while (true) {
                    i8 = i10 & 1;
                    if (i8 == i11) {
                        f8 += 1.0f;
                        i10 >>= 1;
                    }
                }
                f11429a[i9][7 - i12] = f8 / 17.0f;
                i12++;
                i11 = i8;
            }
            i9++;
        }
    }

    private static int a(int[] iArr) {
        long j8 = 0;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            for (int i9 = 0; i9 < iArr[i8]; i9++) {
                int i10 = 1;
                long j9 = j8 << 1;
                if (i8 % 2 != 0) {
                    i10 = 0;
                }
                j8 = j9 | i10;
            }
        }
        return (int) j8;
    }

    private static int b(int[] iArr) {
        int iSum = N3.a.sum(iArr);
        float[] fArr = new float[8];
        for (int i8 = 0; i8 < 8; i8++) {
            fArr[i8] = iArr[i8] / iSum;
        }
        float f8 = Float.MAX_VALUE;
        int i9 = -1;
        int i10 = 0;
        while (true) {
            float[][] fArr2 = f11429a;
            if (i10 >= fArr2.length) {
                return i9;
            }
            float[] fArr3 = fArr2[i10];
            float f9 = 0.0f;
            for (int i11 = 0; i11 < 8; i11++) {
                float f10 = fArr3[i11] - fArr[i11];
                f9 += f10 * f10;
                if (f9 >= f8) {
                    break;
                }
            }
            if (f9 < f8) {
                i9 = AbstractC0834a.SYMBOL_TABLE[i10];
                f8 = f9;
            }
            i10++;
        }
    }

    private static int c(int[] iArr) {
        int iA = a(iArr);
        if (AbstractC0834a.getCodeword(iA) == -1) {
            return -1;
        }
        return iA;
    }

    static int d(int[] iArr) {
        int iC = c(e(iArr));
        return iC != -1 ? iC : b(iArr);
    }

    private static int[] e(int[] iArr) {
        float fSum = N3.a.sum(iArr);
        int[] iArr2 = new int[8];
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < 17; i10++) {
            float f8 = (fSum / 34.0f) + ((i10 * fSum) / 17.0f);
            int i11 = iArr[i9];
            if (i8 + i11 <= f8) {
                i8 += i11;
                i9++;
            }
            iArr2[i9] = iArr2[i9] + 1;
        }
        return iArr2;
    }
}
