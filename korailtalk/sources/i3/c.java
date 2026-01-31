package i3;

import H0.y;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import e3.AbstractC5358c;
import e3.w;
import j3.AbstractC5822d;
import j3.h;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f31882a = {19, AbstractC5358c.DC2, AbstractC5358c.DC2, AbstractC5358c.DC2, AbstractC5358c.DC2, 17, 17, 17, AbstractC5358c.DLE, AbstractC5358c.DLE, AbstractC5358c.DLE, AbstractC5358c.SI, AbstractC5358c.SI, AbstractC5358c.SI, AbstractC5358c.SI, AbstractC5358c.SO, AbstractC5358c.SO, AbstractC5358c.SO, AbstractC5358c.CR, AbstractC5358c.CR, AbstractC5358c.CR, AbstractC5358c.FF, AbstractC5358c.FF, AbstractC5358c.FF, AbstractC5358c.FF, AbstractC5358c.VT, AbstractC5358c.VT, AbstractC5358c.VT, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    static final long[] f31883b = {1, 10, 100, 1000, y.MIN_BACKOFF_MILLIS, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* renamed from: c, reason: collision with root package name */
    static final long[] f31884c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* renamed from: d, reason: collision with root package name */
    static final long[] f31885d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f31886e = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f31887f = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* renamed from: g, reason: collision with root package name */
    private static final long[][] f31888g = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31889a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f31889a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31889a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31889a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31889a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31889a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31889a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31889a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31889a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class b {
        public static final b SMALL = new a("SMALL", 0);
        public static final b LARGE = new C0312b("LARGE", 1);

        /* renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ b[] f31890a = a();

        enum a extends b {
            a(String str, int i8) {
                super(str, i8, null);
            }

            @Override // i3.c.b
            long b(long j8, long j9, long j10) {
                return (j8 * j9) % j10;
            }

            @Override // i3.c.b
            long d(long j8, long j9) {
                return (j8 * j8) % j9;
            }
        }

        /* renamed from: i3.c$b$b, reason: collision with other inner class name */
        enum C0312b extends b {
            C0312b(String str, int i8) {
                super(str, i8, null);
            }

            private long g(long j8, long j9, long j10) {
                long j11 = j8 + j9;
                return j8 >= j10 - j9 ? j11 - j10 : j11;
            }

            private long h(long j8, long j9) {
                int i8 = 32;
                do {
                    int iMin = Math.min(i8, Long.numberOfLeadingZeros(j8));
                    j8 = h.remainder(j8 << iMin, j9);
                    i8 -= iMin;
                } while (i8 > 0);
                return j8;
            }

            @Override // i3.c.b
            long b(long j8, long j9, long j10) {
                long j11 = j8 >>> 32;
                long j12 = j9 >>> 32;
                long j13 = j8 & 4294967295L;
                long j14 = j9 & 4294967295L;
                long jH = h(j11 * j12, j10) + (j11 * j14);
                if (jH < 0) {
                    jH = h.remainder(jH, j10);
                }
                return g(h(jH + (j12 * j13), j10), h.remainder(j13 * j14, j10), j10);
            }

            @Override // i3.c.b
            long d(long j8, long j9) {
                long j10 = j8 >>> 32;
                long j11 = j8 & 4294967295L;
                long jH = h(j10 * j10, j9);
                long jRemainder = j10 * j11 * 2;
                if (jRemainder < 0) {
                    jRemainder = h.remainder(jRemainder, j9);
                }
                return g(h(jH + jRemainder, j9), h.remainder(j11 * j11, j9), j9);
            }
        }

        private b(String str, int i8) {
        }

        private static /* synthetic */ b[] a() {
            return new b[]{SMALL, LARGE};
        }

        private long c(long j8, long j9, long j10) {
            long jB = 1;
            while (j9 != 0) {
                if ((j9 & 1) != 0) {
                    jB = b(jB, j8, j10);
                }
                j8 = d(j8, j10);
                j9 >>= 1;
            }
            return jB;
        }

        static boolean e(long j8, long j9) {
            return (j9 <= 3037000499L ? SMALL : LARGE).f(j8, j9);
        }

        private boolean f(long j8, long j9) {
            long j10 = j9 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
            long j11 = j10 >> iNumberOfTrailingZeros;
            long j12 = j8 % j9;
            if (j12 == 0) {
                return true;
            }
            long jC = c(j12, j11, j9);
            if (jC == 1) {
                return true;
            }
            int i8 = 0;
            while (jC != j10) {
                i8++;
                if (i8 == iNumberOfTrailingZeros) {
                    return false;
                }
                jC = d(jC, j9);
            }
            return true;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f31890a.clone();
        }

        abstract long b(long j8, long j9, long j10);

        abstract long d(long j8, long j9);

        /* synthetic */ b(String str, int i8, a aVar) {
            this(str, i8);
        }
    }

    static boolean a(long j8) {
        return ((long) ((int) j8)) == j8;
    }

    static int b(long j8, long j9) {
        return (int) ((~(~(j8 - j9))) >>> 63);
    }

    public static long binomial(int i8, int i9) {
        d.c("n", i8);
        d.c("k", i9);
        w.checkArgument(i9 <= i8, "k (%s) > n (%s)", i9, i8);
        if (i9 > (i8 >> 1)) {
            i9 = i8 - i9;
        }
        long jD = 1;
        if (i9 == 0) {
            return 1L;
        }
        if (i9 == 1) {
            return i8;
        }
        long[] jArr = f31885d;
        if (i8 < jArr.length) {
            return jArr[i8] / (jArr[i9] * jArr[i8 - i9]);
        }
        int[] iArr = f31886e;
        if (i9 >= iArr.length || i8 > iArr[i9]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = f31887f;
        if (i9 < iArr2.length && i8 <= iArr2[i9]) {
            int i10 = i8 - 1;
            long j8 = i8;
            for (int i11 = 2; i11 <= i9; i11++) {
                j8 = (j8 * i10) / i11;
                i10--;
            }
            return j8;
        }
        long j9 = i8;
        int iLog2 = log2(j9, RoundingMode.CEILING);
        int i12 = i8 - 1;
        int i13 = iLog2;
        int i14 = 2;
        long j10 = j9;
        long j11 = 1;
        while (i14 <= i9) {
            i13 += iLog2;
            if (i13 < 63) {
                j10 *= i12;
                j11 *= i14;
            } else {
                jD = d(jD, j10, j11);
                j10 = i12;
                j11 = i14;
                i13 = iLog2;
            }
            i14++;
            i12--;
        }
        return d(jD, j10, j11);
    }

    static int c(long j8) {
        byte b9 = f31882a[Long.numberOfLeadingZeros(j8)];
        return b9 - b(j8, f31883b[b9]);
    }

    public static long ceilingPowerOfTwo(long j8) {
        d.f("x", j8);
        if (j8 <= AbstractC5822d.MAX_POWER_OF_TWO) {
            return 1 << (-Long.numberOfLeadingZeros(j8 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + j8 + ") is not representable as a long");
    }

    public static long checkedAdd(long j8, long j9) {
        long j10 = j8 + j9;
        d.b(((j8 ^ j9) < 0) | ((j8 ^ j10) >= 0), "checkedAdd", j8, j9);
        return j10;
    }

    public static long checkedMultiply(long j8, long j9) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j9) + Long.numberOfLeadingZeros(~j9);
        if (iNumberOfLeadingZeros > 65) {
            return j8 * j9;
        }
        d.b(iNumberOfLeadingZeros >= 64, "checkedMultiply", j8, j9);
        d.b((j8 >= 0) | (j9 != Long.MIN_VALUE), "checkedMultiply", j8, j9);
        long j10 = j8 * j9;
        d.b(j8 == 0 || j10 / j8 == j9, "checkedMultiply", j8, j9);
        return j10;
    }

    public static long checkedPow(long j8, int i8) {
        d.c("exponent", i8);
        long jCheckedMultiply = 1;
        if ((j8 >= -2) && (j8 <= 2)) {
            int i9 = (int) j8;
            if (i9 == -2) {
                d.b(i8 < 64, "checkedPow", j8, i8);
                return (i8 & 1) == 0 ? 1 << i8 : (-1) << i8;
            }
            if (i9 == -1) {
                return (i8 & 1) == 0 ? 1L : -1L;
            }
            if (i9 == 0) {
                return i8 == 0 ? 1L : 0L;
            }
            if (i9 == 1) {
                return 1L;
            }
            if (i9 != 2) {
                throw new AssertionError();
            }
            d.b(i8 < 63, "checkedPow", j8, i8);
            return 1 << i8;
        }
        long j9 = j8;
        int i10 = i8;
        while (i10 != 0) {
            if (i10 == 1) {
                return checkedMultiply(jCheckedMultiply, j9);
            }
            if ((i10 & 1) != 0) {
                jCheckedMultiply = checkedMultiply(jCheckedMultiply, j9);
            }
            long j10 = jCheckedMultiply;
            int i11 = i10 >> 1;
            if (i11 > 0) {
                d.b(-3037000499L <= j9 && j9 <= 3037000499L, "checkedPow", j9, i11);
                j9 *= j9;
            }
            i10 = i11;
            jCheckedMultiply = j10;
        }
        return jCheckedMultiply;
    }

    public static long checkedSubtract(long j8, long j9) {
        long j10 = j8 - j9;
        d.b(((j8 ^ j9) >= 0) | ((j8 ^ j10) >= 0), "checkedSubtract", j8, j9);
        return j10;
    }

    static long d(long j8, long j9, long j10) {
        if (j8 == 1) {
            return j9 / j10;
        }
        long jGcd = gcd(j8, j10);
        return (j8 / jGcd) * (j9 / (j10 / jGcd));
    }

    public static long divide(long j8, long j9, RoundingMode roundingMode) {
        w.checkNotNull(roundingMode);
        long j10 = j8 / j9;
        long j11 = j8 - (j9 * j10);
        if (j11 == 0) {
            return j10;
        }
        int i8 = ((int) ((j8 ^ j9) >> 63)) | 1;
        switch (a.f31889a[roundingMode.ordinal()]) {
            case 1:
                d.g(j11 == 0);
                return j10;
            case 2:
                return j10;
            case 3:
                if (i8 >= 0) {
                    return j10;
                }
                break;
            case 4:
                break;
            case 5:
                if (i8 <= 0) {
                    return j10;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j11);
                long jAbs2 = jAbs - (Math.abs(j9) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j10) == 0)) {
                        return j10;
                    }
                } else if (jAbs2 <= 0) {
                    return j10;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j10 + i8;
    }

    public static long factorial(int i8) {
        d.c("n", i8);
        long[] jArr = f31885d;
        if (i8 < jArr.length) {
            return jArr[i8];
        }
        return Long.MAX_VALUE;
    }

    public static long floorPowerOfTwo(long j8) {
        d.f("x", j8);
        return 1 << (63 - Long.numberOfLeadingZeros(j8));
    }

    public static long gcd(long j8, long j9) {
        d.d(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A, j8);
        d.d(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B, j9);
        if (j8 == 0) {
            return j9;
        }
        if (j9 == 0) {
            return j8;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
        long jNumberOfTrailingZeros = j8 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j9);
        long j10 = j9 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j10) {
            long j11 = jNumberOfTrailingZeros - j10;
            long j12 = (j11 >> 63) & j11;
            long j13 = (j11 - j12) - j12;
            j10 += j12;
            jNumberOfTrailingZeros = j13 >> Long.numberOfTrailingZeros(j13);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(long j8) {
        return (j8 > 0) & ((j8 & (j8 - 1)) == 0);
    }

    public static boolean isPrime(long j8) {
        if (j8 < 2) {
            d.d("n", j8);
            return false;
        }
        if (j8 < 66) {
            return ((722865708377213483 >> (((int) j8) + (-2))) & 1) != 0;
        }
        if (((1 << ((int) (j8 % 30))) & (-545925251)) != 0 || j8 % 7 == 0 || j8 % 11 == 0 || j8 % 13 == 0) {
            return false;
        }
        if (j8 < 289) {
            return true;
        }
        for (long[] jArr : f31888g) {
            if (j8 <= jArr[0]) {
                for (int i8 = 1; i8 < jArr.length; i8++) {
                    if (!b.e(jArr[i8], j8)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    public static int log10(long j8, RoundingMode roundingMode) {
        int iB;
        d.f("x", j8);
        int iC = c(j8);
        long j9 = f31883b[iC];
        switch (a.f31889a[roundingMode.ordinal()]) {
            case 1:
                d.g(j8 == j9);
            case 2:
            case 3:
                return iC;
            case 4:
            case 5:
                iB = b(j9, j8);
                return iC + iB;
            case 6:
            case 7:
            case 8:
                iB = b(f31884c[iC], j8);
                return iC + iB;
            default:
                throw new AssertionError();
        }
    }

    public static int log2(long j8, RoundingMode roundingMode) {
        d.f("x", j8);
        switch (a.f31889a[roundingMode.ordinal()]) {
            case 1:
                d.g(isPowerOfTwo(j8));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j8 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j8);
                return (63 - iNumberOfLeadingZeros) + b((-5402926248376769404) >>> iNumberOfLeadingZeros, j8);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(j8);
    }

    public static long mean(long j8, long j9) {
        return (j8 & j9) + ((j8 ^ j9) >> 1);
    }

    public static int mod(long j8, int i8) {
        return (int) mod(j8, i8);
    }

    public static long pow(long j8, int i8) {
        d.c("exponent", i8);
        if (-2 > j8 || j8 > 2) {
            long j9 = 1;
            while (i8 != 0) {
                if (i8 == 1) {
                    return j9 * j8;
                }
                j9 *= (i8 & 1) == 0 ? 1L : j8;
                j8 *= j8;
                i8 >>= 1;
            }
            return j9;
        }
        int i9 = (int) j8;
        if (i9 == -2) {
            if (i8 < 64) {
                return (i8 & 1) == 0 ? 1 << i8 : -(1 << i8);
            }
            return 0L;
        }
        if (i9 == -1) {
            return (i8 & 1) == 0 ? 1L : -1L;
        }
        if (i9 == 0) {
            return i8 == 0 ? 1L : 0L;
        }
        if (i9 == 1) {
            return 1L;
        }
        if (i9 != 2) {
            throw new AssertionError();
        }
        if (i8 < 64) {
            return 1 << i8;
        }
        return 0L;
    }

    public static double roundToDouble(long j8, RoundingMode roundingMode) {
        double dNextUp;
        long jCeil;
        double d9 = j8;
        long jFloor = (long) d9;
        int iCompare = jFloor == Long.MAX_VALUE ? -1 : AbstractC5822d.compare(j8, jFloor);
        int[] iArr = a.f31889a;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                d.g(iCompare == 0);
                return d9;
            case 2:
                return j8 >= 0 ? iCompare >= 0 ? d9 : AbstractC5694a.c(d9) : iCompare <= 0 ? d9 : Math.nextUp(d9);
            case 3:
                return iCompare >= 0 ? d9 : AbstractC5694a.c(d9);
            case 4:
                return j8 >= 0 ? iCompare <= 0 ? d9 : Math.nextUp(d9) : iCompare >= 0 ? d9 : AbstractC5694a.c(d9);
            case 5:
                return iCompare <= 0 ? d9 : Math.nextUp(d9);
            case 6:
            case 7:
            case 8:
                if (iCompare >= 0) {
                    dNextUp = Math.nextUp(d9);
                    jCeil = (long) Math.ceil(dNextUp);
                } else {
                    double dC = AbstractC5694a.c(d9);
                    jFloor = (long) Math.floor(dC);
                    dNextUp = d9;
                    d9 = dC;
                    jCeil = jFloor;
                }
                long j9 = j8 - jFloor;
                long j10 = jCeil - j8;
                if (jCeil == Long.MAX_VALUE) {
                    j10++;
                }
                int iCompare2 = AbstractC5822d.compare(j9, j10);
                if (iCompare2 < 0) {
                    return d9;
                }
                if (iCompare2 > 0) {
                    return dNextUp;
                }
                int i8 = iArr[roundingMode.ordinal()];
                if (i8 == 6) {
                    return j8 >= 0 ? d9 : dNextUp;
                }
                if (i8 == 7) {
                    return j8 >= 0 ? dNextUp : d9;
                }
                if (i8 == 8) {
                    return (AbstractC5694a.a(d9) & 1) == 0 ? d9 : dNextUp;
                }
                throw new AssertionError("impossible");
            default:
                throw new AssertionError("impossible");
        }
    }

    public static long saturatedAdd(long j8, long j9) {
        long j10 = j8 + j9;
        return (((j9 ^ j8) > 0L ? 1 : ((j9 ^ j8) == 0L ? 0 : -1)) < 0) | ((j8 ^ j10) >= 0) ? j10 : ((j10 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long saturatedMultiply(long j8, long j9) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j9) + Long.numberOfLeadingZeros(~j9);
        if (iNumberOfLeadingZeros > 65) {
            return j8 * j9;
        }
        long j10 = ((j8 ^ j9) >>> 63) + Long.MAX_VALUE;
        if ((iNumberOfLeadingZeros < 64) || ((j9 == Long.MIN_VALUE) & (j8 < 0))) {
            return j10;
        }
        long j11 = j8 * j9;
        return (j8 == 0 || j11 / j8 == j9) ? j11 : j10;
    }

    public static long saturatedPow(long j8, int i8) {
        d.c("exponent", i8);
        long jSaturatedMultiply = 1;
        if (!(j8 >= -2) || !(j8 <= 2)) {
            long j9 = ((j8 >>> 63) & i8 & 1) + Long.MAX_VALUE;
            while (i8 != 0) {
                if (i8 == 1) {
                    return saturatedMultiply(jSaturatedMultiply, j8);
                }
                if ((i8 & 1) != 0) {
                    jSaturatedMultiply = saturatedMultiply(jSaturatedMultiply, j8);
                }
                i8 >>= 1;
                if (i8 > 0) {
                    if ((-3037000499L > j8) || (j8 > 3037000499L)) {
                        return j9;
                    }
                    j8 *= j8;
                }
            }
            return jSaturatedMultiply;
        }
        int i9 = (int) j8;
        if (i9 == -2) {
            return i8 >= 64 ? (i8 & 1) + Long.MAX_VALUE : (i8 & 1) == 0 ? 1 << i8 : (-1) << i8;
        }
        if (i9 == -1) {
            return (i8 & 1) == 0 ? 1L : -1L;
        }
        if (i9 == 0) {
            return i8 == 0 ? 1L : 0L;
        }
        if (i9 == 1) {
            return 1L;
        }
        if (i9 != 2) {
            throw new AssertionError();
        }
        if (i8 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << i8;
    }

    public static long saturatedSubtract(long j8, long j9) {
        long j10 = j8 - j9;
        return (((j9 ^ j8) > 0L ? 1 : ((j9 ^ j8) == 0L ? 0 : -1)) >= 0) | ((j8 ^ j10) >= 0) ? j10 : ((j10 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long sqrt(long j8, RoundingMode roundingMode) {
        d.d("x", j8);
        if (a(j8)) {
            return i3.b.sqrt((int) j8, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j8);
        long j9 = jSqrt * jSqrt;
        switch (a.f31889a[roundingMode.ordinal()]) {
            case 1:
                d.g(j9 == j8);
                return jSqrt;
            case 2:
            case 3:
                return j8 < j9 ? jSqrt - 1 : jSqrt;
            case 4:
            case 5:
                return j8 > j9 ? jSqrt + 1 : jSqrt;
            case 6:
            case 7:
            case 8:
                return (jSqrt - (j8 < j9 ? 1 : 0)) + b((r0 * r0) + r0, j8);
            default:
                throw new AssertionError();
        }
    }

    public static long mod(long j8, long j9) {
        if (j9 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j10 = j8 % j9;
        return j10 >= 0 ? j10 : j10 + j9;
    }
}
