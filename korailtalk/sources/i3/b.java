package i3;

import com.korail.talk.network.dao.research.CmtrInfoDao;
import e3.w;
import f1.j;
import j3.AbstractC5820b;
import java.math.RoundingMode;
import m7.AbstractC5916c;
import maum.m2u.map.Map;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f31876a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f31877b = {1, 10, 100, 1000, 10000, 100000, AbstractC5916c.NANOS_IN_MILLIS, 10000000, 100000000, j.SECOND_IN_NANOS};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f31878c = {3, 31, Map.MapException.StatusCode.MAP_STREAM_ID_NOT_MATCH_VALUE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f31879d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e, reason: collision with root package name */
    static int[] f31880e = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31881a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f31881a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31881a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31881a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31881a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31881a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31881a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31881a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31881a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static int a(int i8, int i9) {
        return (~(~(i8 - i9))) >>> 31;
    }

    private static int b(int i8) {
        byte b9 = f31876a[Integer.numberOfLeadingZeros(i8)];
        return b9 - a(i8, f31877b[b9]);
    }

    public static int binomial(int i8, int i9) {
        d.c("n", i8);
        d.c("k", i9);
        int i10 = 0;
        w.checkArgument(i9 <= i8, "k (%s) > n (%s)", i9, i8);
        if (i9 > (i8 >> 1)) {
            i9 = i8 - i9;
        }
        int[] iArr = f31880e;
        if (i9 >= iArr.length || i8 > iArr[i9]) {
            return Integer.MAX_VALUE;
        }
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 1) {
            return i8;
        }
        long j8 = 1;
        while (i10 < i9) {
            long j9 = j8 * (i8 - i10);
            i10++;
            j8 = j9 / i10;
        }
        return (int) j8;
    }

    private static int c(int i8) {
        return (int) Math.sqrt(i8);
    }

    public static int ceilingPowerOfTwo(int i8) {
        d.e("x", i8);
        if (i8 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i8 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + i8 + ") not representable as an int");
    }

    public static int checkedAdd(int i8, int i9) {
        long j8 = i8 + i9;
        int i10 = (int) j8;
        d.a(j8 == ((long) i10), "checkedAdd", i8, i9);
        return i10;
    }

    public static int checkedMultiply(int i8, int i9) {
        long j8 = i8 * i9;
        int i10 = (int) j8;
        d.a(j8 == ((long) i10), "checkedMultiply", i8, i9);
        return i10;
    }

    public static int checkedPow(int i8, int i9) {
        d.c("exponent", i9);
        if (i8 == -2) {
            d.a(i9 < 32, "checkedPow", i8, i9);
            return (i9 & 1) == 0 ? 1 << i9 : (-1) << i9;
        }
        if (i8 == -1) {
            return (i9 & 1) == 0 ? 1 : -1;
        }
        if (i8 == 0) {
            return i9 == 0 ? 1 : 0;
        }
        if (i8 == 1) {
            return 1;
        }
        if (i8 == 2) {
            d.a(i9 < 31, "checkedPow", i8, i9);
            return 1 << i9;
        }
        int iCheckedMultiply = 1;
        while (i9 != 0) {
            if (i9 == 1) {
                return checkedMultiply(iCheckedMultiply, i8);
            }
            if ((i9 & 1) != 0) {
                iCheckedMultiply = checkedMultiply(iCheckedMultiply, i8);
            }
            i9 >>= 1;
            if (i9 > 0) {
                d.a((-46340 <= i8) & (i8 <= 46340), "checkedPow", i8, i9);
                i8 *= i8;
            }
        }
        return iCheckedMultiply;
    }

    public static int checkedSubtract(int i8, int i9) {
        long j8 = i8 - i9;
        int i10 = (int) j8;
        d.a(j8 == ((long) i10), "checkedSubtract", i8, i9);
        return i10;
    }

    public static int divide(int i8, int i9, RoundingMode roundingMode) {
        w.checkNotNull(roundingMode);
        if (i9 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i10 = i8 / i9;
        int i11 = i8 - (i9 * i10);
        if (i11 == 0) {
            return i10;
        }
        int i12 = ((i8 ^ i9) >> 31) | 1;
        switch (a.f31881a[roundingMode.ordinal()]) {
            case 1:
                d.g(i11 == 0);
                return i10;
            case 2:
                return i10;
            case 3:
                if (i12 >= 0) {
                    return i10;
                }
                break;
            case 4:
                break;
            case 5:
                if (i12 <= 0) {
                    return i10;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i11);
                int iAbs2 = iAbs - (Math.abs(i9) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i10 & 1) != 0))) {
                            return i10;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i10;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i10 + i12;
    }

    public static int factorial(int i8) {
        d.c("n", i8);
        int[] iArr = f31879d;
        if (i8 < iArr.length) {
            return iArr[i8];
        }
        return Integer.MAX_VALUE;
    }

    public static int floorPowerOfTwo(int i8) {
        d.e("x", i8);
        return Integer.highestOneBit(i8);
    }

    public static int gcd(int i8, int i9) {
        d.c(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A, i8);
        d.c(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B, i9);
        if (i8 == 0) {
            return i9;
        }
        if (i9 == 0) {
            return i8;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i8);
        int iNumberOfTrailingZeros2 = i8 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(i9);
        int i10 = i9 >> iNumberOfTrailingZeros3;
        while (iNumberOfTrailingZeros2 != i10) {
            int i11 = iNumberOfTrailingZeros2 - i10;
            int i12 = (i11 >> 31) & i11;
            int i13 = (i11 - i12) - i12;
            i10 += i12;
            iNumberOfTrailingZeros2 = i13 >> Integer.numberOfTrailingZeros(i13);
        }
        return iNumberOfTrailingZeros2 << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros3);
    }

    public static boolean isPowerOfTwo(int i8) {
        return (i8 > 0) & ((i8 & (i8 + (-1))) == 0);
    }

    public static boolean isPrime(int i8) {
        return c.isPrime(i8);
    }

    public static int log10(int i8, RoundingMode roundingMode) {
        int iA;
        d.e("x", i8);
        int iB = b(i8);
        int i9 = f31877b[iB];
        switch (a.f31881a[roundingMode.ordinal()]) {
            case 1:
                d.g(i8 == i9);
            case 2:
            case 3:
                return iB;
            case 4:
            case 5:
                iA = a(i9, i8);
                return iB + iA;
            case 6:
            case 7:
            case 8:
                iA = a(f31878c[iB], i8);
                return iB + iA;
            default:
                throw new AssertionError();
        }
    }

    public static int log2(int i8, RoundingMode roundingMode) {
        d.e("x", i8);
        switch (a.f31881a[roundingMode.ordinal()]) {
            case 1:
                d.g(isPowerOfTwo(i8));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i8 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i8);
                return (31 - iNumberOfLeadingZeros) + a((-1257966797) >>> iNumberOfLeadingZeros, i8);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i8);
    }

    public static int mean(int i8, int i9) {
        return (i8 & i9) + ((i8 ^ i9) >> 1);
    }

    public static int mod(int i8, int i9) {
        if (i9 > 0) {
            int i10 = i8 % i9;
            return i10 >= 0 ? i10 : i10 + i9;
        }
        throw new ArithmeticException("Modulus " + i9 + " must be > 0");
    }

    public static int pow(int i8, int i9) {
        d.c("exponent", i9);
        if (i8 == -2) {
            if (i9 < 32) {
                return (i9 & 1) == 0 ? 1 << i9 : -(1 << i9);
            }
            return 0;
        }
        if (i8 == -1) {
            return (i9 & 1) == 0 ? 1 : -1;
        }
        if (i8 == 0) {
            return i9 == 0 ? 1 : 0;
        }
        if (i8 == 1) {
            return 1;
        }
        if (i8 == 2) {
            if (i9 < 32) {
                return 1 << i9;
            }
            return 0;
        }
        int i10 = 1;
        while (i9 != 0) {
            if (i9 == 1) {
                return i8 * i10;
            }
            i10 *= (i9 & 1) == 0 ? 1 : i8;
            i8 *= i8;
            i9 >>= 1;
        }
        return i10;
    }

    public static int saturatedAdd(int i8, int i9) {
        return AbstractC5820b.saturatedCast(i8 + i9);
    }

    public static int saturatedMultiply(int i8, int i9) {
        return AbstractC5820b.saturatedCast(i8 * i9);
    }

    public static int saturatedPow(int i8, int i9) {
        d.c("exponent", i9);
        if (i8 == -2) {
            return i9 >= 32 ? (i9 & 1) + Integer.MAX_VALUE : (i9 & 1) == 0 ? 1 << i9 : (-1) << i9;
        }
        if (i8 == -1) {
            return (i9 & 1) == 0 ? 1 : -1;
        }
        if (i8 == 0) {
            return i9 == 0 ? 1 : 0;
        }
        if (i8 == 1) {
            return 1;
        }
        if (i8 == 2) {
            if (i9 >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << i9;
        }
        int i10 = ((i8 >>> 31) & i9 & 1) + Integer.MAX_VALUE;
        int iSaturatedMultiply = 1;
        while (i9 != 0) {
            if (i9 == 1) {
                return saturatedMultiply(iSaturatedMultiply, i8);
            }
            if ((i9 & 1) != 0) {
                iSaturatedMultiply = saturatedMultiply(iSaturatedMultiply, i8);
            }
            i9 >>= 1;
            if (i9 > 0) {
                if ((-46340 > i8) || (i8 > 46340)) {
                    return i10;
                }
                i8 *= i8;
            }
        }
        return iSaturatedMultiply;
    }

    public static int saturatedSubtract(int i8, int i9) {
        return AbstractC5820b.saturatedCast(i8 - i9);
    }

    public static int sqrt(int i8, RoundingMode roundingMode) {
        int iA;
        d.c("x", i8);
        int iC = c(i8);
        switch (a.f31881a[roundingMode.ordinal()]) {
            case 1:
                d.g(iC * iC == i8);
            case 2:
            case 3:
                return iC;
            case 4:
            case 5:
                iA = a(iC * iC, i8);
                return iC + iA;
            case 6:
            case 7:
            case 8:
                iA = a((iC * iC) + iC, i8);
                return iC + iA;
            default:
                throw new AssertionError();
        }
    }
}
