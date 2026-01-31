package j3;

import e3.w;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class h {
    public static final long MAX_VALUE = -1;

    enum a implements Comparator {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i8 = 0; i8 < iMin; i8++) {
                long j8 = jArr[i8];
                long j9 = jArr2[i8];
                if (j8 != j9) {
                    return h.compare(j8, j9);
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final long[] f33433a = new long[37];

        /* renamed from: b, reason: collision with root package name */
        static final int[] f33434b = new int[37];

        /* renamed from: c, reason: collision with root package name */
        static final int[] f33435c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i8 = 2; i8 <= 36; i8++) {
                long j8 = i8;
                f33433a[i8] = h.divide(-1L, j8);
                f33434b[i8] = (int) h.remainder(-1L, j8);
                f33435c[i8] = bigInteger.toString(i8).length() - 1;
            }
        }

        static boolean a(long j8, int i8, int i9) {
            if (j8 < 0) {
                return true;
            }
            long j9 = f33433a[i9];
            if (j8 < j9) {
                return false;
            }
            return j8 > j9 || i8 > f33434b[i9];
        }
    }

    private static long a(long j8) {
        return j8 ^ Long.MIN_VALUE;
    }

    public static int compare(long j8, long j9) {
        return AbstractC5822d.compare(a(j8), a(j9));
    }

    public static long decode(String str) {
        C5823e c5823eA = C5823e.a(str);
        try {
            return parseUnsignedLong(c5823eA.f33426a, c5823eA.f33427b);
        } catch (NumberFormatException e8) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + str);
            numberFormatException.initCause(e8);
            throw numberFormatException;
        }
    }

    public static long divide(long j8, long j9) {
        if (j9 < 0) {
            return compare(j8, j9) < 0 ? 0L : 1L;
        }
        if (j8 >= 0) {
            return j8 / j9;
        }
        long j10 = ((j8 >>> 1) / j9) << 1;
        return j10 + (compare(j8 - (j10 * j9), j9) < 0 ? 0 : 1);
    }

    public static String join(String str, long... jArr) {
        w.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(jArr.length * 5);
        sb.append(toString(jArr[0]));
        for (int i8 = 1; i8 < jArr.length; i8++) {
            sb.append(str);
            sb.append(toString(jArr[i8]));
        }
        return sb.toString();
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return a.INSTANCE;
    }

    public static long max(long... jArr) {
        w.checkArgument(jArr.length > 0);
        long jA = a(jArr[0]);
        for (int i8 = 1; i8 < jArr.length; i8++) {
            long jA2 = a(jArr[i8]);
            if (jA2 > jA) {
                jA = jA2;
            }
        }
        return a(jA);
    }

    public static long min(long... jArr) {
        w.checkArgument(jArr.length > 0);
        long jA = a(jArr[0]);
        for (int i8 = 1; i8 < jArr.length; i8++) {
            long jA2 = a(jArr[i8]);
            if (jA2 < jA) {
                jA = jA2;
            }
        }
        return a(jA);
    }

    public static long parseUnsignedLong(String str) {
        return parseUnsignedLong(str, 10);
    }

    public static long remainder(long j8, long j9) {
        if (j9 < 0) {
            return compare(j8, j9) < 0 ? j8 : j8 - j9;
        }
        if (j8 >= 0) {
            return j8 % j9;
        }
        long j10 = j8 - ((((j8 >>> 1) / j9) << 1) * j9);
        if (compare(j10, j9) < 0) {
            j9 = 0;
        }
        return j10 - j9;
    }

    public static void sort(long[] jArr) {
        w.checkNotNull(jArr);
        sort(jArr, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        w.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static String toString(long j8) {
        return toString(j8, 10);
    }

    public static long parseUnsignedLong(String str, int i8) {
        w.checkNotNull(str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (i8 < 2 || i8 > 36) {
            throw new NumberFormatException("illegal radix: " + i8);
        }
        int i9 = b.f33435c[i8] - 1;
        long j8 = 0;
        for (int i10 = 0; i10 < str.length(); i10++) {
            int iDigit = Character.digit(str.charAt(i10), i8);
            if (iDigit == -1) {
                throw new NumberFormatException(str);
            }
            if (i10 > i9 && b.a(j8, iDigit, i8)) {
                throw new NumberFormatException("Too large for unsigned long: " + str);
            }
            j8 = (j8 * i8) + iDigit;
        }
        return j8;
    }

    public static String toString(long j8, int i8) {
        w.checkArgument(i8 >= 2 && i8 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i8);
        if (j8 == 0) {
            return "0";
        }
        if (j8 > 0) {
            return Long.toString(j8, i8);
        }
        int i9 = 64;
        char[] cArr = new char[64];
        int i10 = i8 - 1;
        if ((i8 & i10) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i8);
            do {
                i9--;
                cArr[i9] = Character.forDigit(((int) j8) & i10, i8);
                j8 >>>= iNumberOfTrailingZeros;
            } while (j8 != 0);
        } else {
            long jDivide = (i8 & 1) == 0 ? (j8 >>> 1) / (i8 >>> 1) : divide(j8, i8);
            long j9 = i8;
            int i11 = 63;
            cArr[63] = Character.forDigit((int) (j8 - (jDivide * j9)), i8);
            while (jDivide > 0) {
                i11--;
                cArr[i11] = Character.forDigit((int) (jDivide % j9), i8);
                jDivide /= j9;
            }
            i9 = i11;
        }
        return new String(cArr, i9, 64 - i9);
    }

    public static void sort(long[] jArr, int i8, int i9) {
        w.checkNotNull(jArr);
        w.checkPositionIndexes(i8, i9, jArr.length);
        for (int i10 = i8; i10 < i9; i10++) {
            jArr[i10] = a(jArr[i10]);
        }
        Arrays.sort(jArr, i8, i9);
        while (i8 < i9) {
            jArr[i8] = a(jArr[i8]);
            i8++;
        }
    }

    public static void sortDescending(long[] jArr, int i8, int i9) {
        w.checkNotNull(jArr);
        w.checkPositionIndexes(i8, i9, jArr.length);
        for (int i10 = i8; i10 < i9; i10++) {
            jArr[i10] = Long.MAX_VALUE ^ jArr[i10];
        }
        Arrays.sort(jArr, i8, i9);
        while (i8 < i9) {
            jArr[i8] = jArr[i8] ^ Long.MAX_VALUE;
            i8++;
        }
    }
}
