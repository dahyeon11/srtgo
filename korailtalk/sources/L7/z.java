package l7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class z extends y {
    public static final Void numberFormatError(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    public static final Byte toByteOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toByteOrNull(str, 10);
    }

    public static final Integer toIntOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toIntOrNull(str, 10);
    }

    public static Long toLongOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toLongOrNull(str, 10);
    }

    public static final Short toShortOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toShortOrNull(str, 10);
    }

    public static final Byte toByteOrNull(String str, int i8) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer intOrNull = toIntOrNull(str, i8);
        if (intOrNull == null || (iIntValue = intOrNull.intValue()) < -128 || iIntValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) iIntValue);
    }

    public static final Integer toIntOrNull(String str, int i8) {
        boolean z8;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        AbstractC5897c.checkRadix(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        int i12 = -2147483647;
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i9 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i12 = Integer.MIN_VALUE;
                z8 = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z8 = false;
            }
        } else {
            z8 = false;
            i9 = 0;
        }
        int i13 = -59652323;
        while (i9 < length) {
            int iDigitOf = C5898d.digitOf(str.charAt(i9), i8);
            if (iDigitOf < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / i8))) || (i10 = i11 * i8) < i12 + iDigitOf) {
                return null;
            }
            i11 = i10 - iDigitOf;
            i9++;
        }
        return z8 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }

    public static final Long toLongOrNull(String str, int i8) {
        boolean z8;
        Intrinsics.checkNotNullParameter(str, "<this>");
        AbstractC5897c.checkRadix(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char cCharAt = str.charAt(0);
        long j8 = -9223372036854775807L;
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            z8 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j8 = Long.MIN_VALUE;
                i9 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z8 = false;
                i9 = 1;
            }
        } else {
            z8 = false;
        }
        long j9 = -256204778801521550L;
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i9 < length) {
            int iDigitOf = C5898d.digitOf(str.charAt(i9), i8);
            if (iDigitOf < 0) {
                return null;
            }
            if (j10 < j11) {
                if (j11 == j9) {
                    j11 = j8 / i8;
                    if (j10 < j11) {
                    }
                }
                return null;
            }
            long j12 = j10 * i8;
            long j13 = iDigitOf;
            if (j12 < j8 + j13) {
                return null;
            }
            j10 = j12 - j13;
            i9++;
            j9 = -256204778801521550L;
        }
        return z8 ? Long.valueOf(j10) : Long.valueOf(-j10);
    }

    public static final Short toShortOrNull(String str, int i8) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer intOrNull = toIntOrNull(str, i8);
        if (intOrNull == null || (iIntValue = intOrNull.intValue()) < -32768 || iIntValue > 32767) {
            return null;
        }
        return Short.valueOf((short) iIntValue);
    }
}
