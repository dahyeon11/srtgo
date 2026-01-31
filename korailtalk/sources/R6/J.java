package R6;

import kotlin.jvm.internal.Intrinsics;
import l7.AbstractC5897c;

/* loaded from: classes2.dex */
public abstract class J {
    public static final int doubleToUInt(double d9) {
        if (Double.isNaN(d9) || d9 <= uintToDouble(0)) {
            return 0;
        }
        if (d9 >= uintToDouble(-1)) {
            return -1;
        }
        return d9 <= 2.147483647E9d ? y.m102constructorimpl((int) d9) : y.m102constructorimpl(y.m102constructorimpl((int) (d9 - Integer.MAX_VALUE)) + y.m102constructorimpl(Integer.MAX_VALUE));
    }

    public static final long doubleToULong(double d9) {
        if (Double.isNaN(d9) || d9 <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d9 >= ulongToDouble(-1L)) {
            return -1L;
        }
        return d9 < 9.223372036854776E18d ? A.m13constructorimpl((long) d9) : A.m13constructorimpl(A.m13constructorimpl((long) (d9 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    public static final int uintCompare(int i8, int i9) {
        return Intrinsics.compare(i8 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE);
    }

    /* renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m62uintDivideJ1ME1BU(int i8, int i9) {
        return y.m102constructorimpl((int) ((i8 & 4294967295L) / (i9 & 4294967295L)));
    }

    /* renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m63uintRemainderJ1ME1BU(int i8, int i9) {
        return y.m102constructorimpl((int) ((i8 & 4294967295L) % (i9 & 4294967295L)));
    }

    public static final double uintToDouble(int i8) {
        return (Integer.MAX_VALUE & i8) + (((i8 >>> 31) << 30) * 2);
    }

    public static final int ulongCompare(long j8, long j9) {
        return Intrinsics.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
    }

    /* renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m64ulongDivideeb3DHEI(long j8, long j9) {
        if (j9 < 0) {
            return Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE) < 0 ? A.m13constructorimpl(0L) : A.m13constructorimpl(1L);
        }
        if (j8 >= 0) {
            return A.m13constructorimpl(j8 / j9);
        }
        long j10 = ((j8 >>> 1) / j9) << 1;
        return A.m13constructorimpl(j10 + (Long.compare(A.m13constructorimpl(j8 - (j10 * j9)) ^ Long.MIN_VALUE, A.m13constructorimpl(j9) ^ Long.MIN_VALUE) < 0 ? 0 : 1));
    }

    /* renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m65ulongRemaindereb3DHEI(long j8, long j9) {
        if (j9 < 0) {
            return Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE) < 0 ? j8 : A.m13constructorimpl(j8 - j9);
        }
        if (j8 >= 0) {
            return A.m13constructorimpl(j8 % j9);
        }
        long j10 = j8 - ((((j8 >>> 1) / j9) << 1) * j9);
        if (Long.compare(A.m13constructorimpl(j10) ^ Long.MIN_VALUE, A.m13constructorimpl(j9) ^ Long.MIN_VALUE) < 0) {
            j9 = 0;
        }
        return A.m13constructorimpl(j10 - j9);
    }

    public static final double ulongToDouble(long j8) {
        return ((j8 >>> 11) * 2048) + (j8 & 2047);
    }

    public static final String ulongToString(long j8) {
        return ulongToString(j8, 10);
    }

    public static final String ulongToString(long j8, int i8) {
        if (j8 >= 0) {
            String string = Long.toString(j8, AbstractC5897c.checkRadix(i8));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j9 = i8;
        long j10 = ((j8 >>> 1) / j9) << 1;
        long j11 = j8 - (j10 * j9);
        if (j11 >= j9) {
            j11 -= j9;
            j10++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j10, AbstractC5897c.checkRadix(i8));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb.append(string2);
        String string3 = Long.toString(j11, AbstractC5897c.checkRadix(i8));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}
