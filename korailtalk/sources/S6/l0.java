package S6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class l0 {
    private static final int a(long[] jArr, int i8, int i9) {
        long jM26getsVKNKU = R6.B.m26getsVKNKU(jArr, (i8 + i9) / 2);
        while (i8 <= i9) {
            while (Long.compare(R6.B.m26getsVKNKU(jArr, i8) ^ Long.MIN_VALUE, jM26getsVKNKU ^ Long.MIN_VALUE) < 0) {
                i8++;
            }
            while (Long.compare(R6.B.m26getsVKNKU(jArr, i9) ^ Long.MIN_VALUE, jM26getsVKNKU ^ Long.MIN_VALUE) > 0) {
                i9--;
            }
            if (i8 <= i9) {
                long jM26getsVKNKU2 = R6.B.m26getsVKNKU(jArr, i8);
                R6.B.m31setk8EXiF4(jArr, i8, R6.B.m26getsVKNKU(jArr, i9));
                R6.B.m31setk8EXiF4(jArr, i9, jM26getsVKNKU2);
                i8++;
                i9--;
            }
        }
        return i8;
    }

    private static final int b(byte[] bArr, int i8, int i9) {
        int i10;
        byte bM90getw2LRezQ = R6.x.m90getw2LRezQ(bArr, (i8 + i9) / 2);
        while (i8 <= i9) {
            while (true) {
                i10 = bM90getw2LRezQ & 255;
                if (Intrinsics.compare(R6.x.m90getw2LRezQ(bArr, i8) & 255, i10) >= 0) {
                    break;
                }
                i8++;
            }
            while (Intrinsics.compare(R6.x.m90getw2LRezQ(bArr, i9) & 255, i10) > 0) {
                i9--;
            }
            if (i8 <= i9) {
                byte bM90getw2LRezQ2 = R6.x.m90getw2LRezQ(bArr, i8);
                R6.x.m95setVurrAj0(bArr, i8, R6.x.m90getw2LRezQ(bArr, i9));
                R6.x.m95setVurrAj0(bArr, i9, bM90getw2LRezQ2);
                i8++;
                i9--;
            }
        }
        return i8;
    }

    private static final int c(short[] sArr, int i8, int i9) {
        int i10;
        short sM51getMh2AYeg = R6.E.m51getMh2AYeg(sArr, (i8 + i9) / 2);
        while (i8 <= i9) {
            while (true) {
                int iM51getMh2AYeg = R6.E.m51getMh2AYeg(sArr, i8) & R6.D.MAX_VALUE;
                i10 = sM51getMh2AYeg & R6.D.MAX_VALUE;
                if (Intrinsics.compare(iM51getMh2AYeg, i10) >= 0) {
                    break;
                }
                i8++;
            }
            while (Intrinsics.compare(R6.E.m51getMh2AYeg(sArr, i9) & R6.D.MAX_VALUE, i10) > 0) {
                i9--;
            }
            if (i8 <= i9) {
                short sM51getMh2AYeg2 = R6.E.m51getMh2AYeg(sArr, i8);
                R6.E.m56set01HTLdE(sArr, i8, R6.E.m51getMh2AYeg(sArr, i9));
                R6.E.m56set01HTLdE(sArr, i9, sM51getMh2AYeg2);
                i8++;
                i9--;
            }
        }
        return i8;
    }

    private static final int d(int[] iArr, int i8, int i9) {
        int iM115getpVg5ArA = R6.z.m115getpVg5ArA(iArr, (i8 + i9) / 2);
        while (i8 <= i9) {
            while (Integer.compare(R6.z.m115getpVg5ArA(iArr, i8) ^ Integer.MIN_VALUE, iM115getpVg5ArA ^ Integer.MIN_VALUE) < 0) {
                i8++;
            }
            while (Integer.compare(R6.z.m115getpVg5ArA(iArr, i9) ^ Integer.MIN_VALUE, iM115getpVg5ArA ^ Integer.MIN_VALUE) > 0) {
                i9--;
            }
            if (i8 <= i9) {
                int iM115getpVg5ArA2 = R6.z.m115getpVg5ArA(iArr, i8);
                R6.z.m120setVXSXFK8(iArr, i8, R6.z.m115getpVg5ArA(iArr, i9));
                R6.z.m120setVXSXFK8(iArr, i9, iM115getpVg5ArA2);
                i8++;
                i9--;
            }
        }
        return i8;
    }

    private static final void e(long[] jArr, int i8, int i9) {
        int iA = a(jArr, i8, i9);
        int i10 = iA - 1;
        if (i8 < i10) {
            e(jArr, i8, i10);
        }
        if (iA < i9) {
            e(jArr, iA, i9);
        }
    }

    private static final void f(byte[] bArr, int i8, int i9) {
        int iB = b(bArr, i8, i9);
        int i10 = iB - 1;
        if (i8 < i10) {
            f(bArr, i8, i10);
        }
        if (iB < i9) {
            f(bArr, iB, i9);
        }
    }

    private static final void g(short[] sArr, int i8, int i9) {
        int iC = c(sArr, i8, i9);
        int i10 = iC - 1;
        if (i8 < i10) {
            g(sArr, i8, i10);
        }
        if (iC < i9) {
            g(sArr, iC, i9);
        }
    }

    private static final void h(int[] iArr, int i8, int i9) {
        int iD = d(iArr, i8, i9);
        int i10 = iD - 1;
        if (i8 < i10) {
            h(iArr, i8, i10);
        }
        if (iD < i9) {
            h(iArr, iD, i9);
        }
    }

    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m138sortArraynroSd4(long[] array, int i8, int i9) {
        Intrinsics.checkNotNullParameter(array, "array");
        e(array, i8, i9 - 1);
    }

    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m139sortArray4UcCI2c(byte[] array, int i8, int i9) {
        Intrinsics.checkNotNullParameter(array, "array");
        f(array, i8, i9 - 1);
    }

    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m140sortArrayAa5vz7o(short[] array, int i8, int i9) {
        Intrinsics.checkNotNullParameter(array, "array");
        g(array, i8, i9 - 1);
    }

    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m141sortArrayoBK06Vg(int[] array, int i8, int i9) {
        Intrinsics.checkNotNullParameter(array, "array");
        h(array, i8, i9 - 1);
    }
}
