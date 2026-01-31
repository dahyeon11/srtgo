package U7;

import Q7.X;
import Q7.Z;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes3.dex */
public class a {
    public static final Long LONG_ZERO = 0L;
    public static final Long LONG_ONE = 1L;
    public static final Long LONG_MINUS_ONE = -1L;
    public static final Integer INTEGER_ZERO = 0;
    public static final Integer INTEGER_ONE = 1;
    public static final Integer INTEGER_TWO = 2;
    public static final Integer INTEGER_MINUS_ONE = -1;
    public static final Short SHORT_ZERO = 0;
    public static final Short SHORT_ONE = 1;
    public static final Short SHORT_MINUS_ONE = -1;
    public static final Byte BYTE_ZERO = (byte) 0;
    public static final Byte BYTE_ONE = (byte) 1;
    public static final Byte BYTE_MINUS_ONE = (byte) -1;
    public static final Double DOUBLE_ZERO = Double.valueOf(0.0d);
    public static final Double DOUBLE_ONE = Double.valueOf(1.0d);
    public static final Double DOUBLE_MINUS_ONE = Double.valueOf(-1.0d);
    public static final Float FLOAT_ZERO = Float.valueOf(0.0f);
    public static final Float FLOAT_ONE = Float.valueOf(1.0f);
    public static final Float FLOAT_MINUS_ONE = Float.valueOf(-1.0f);
    public static final Long LONG_INT_MAX_VALUE = 2147483647L;
    public static final Long LONG_INT_MIN_VALUE = -2147483648L;

    private static String a(String str, int i8) {
        char cCharAt = str.charAt(0);
        return str.substring((cCharAt == '-' || cCharAt == '+') ? 1 : 0, i8);
    }

    private static boolean b(String str) {
        if (str == null) {
            return true;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) != '0') {
                return false;
            }
        }
        return true;
    }

    private static boolean c(String str, String str2) {
        return b(str) && b(str2);
    }

    public static int compare(byte b9, byte b10) {
        return b9 - b10;
    }

    public static BigDecimal createBigDecimal(String str) {
        if (str == null) {
            return null;
        }
        if (X.isBlank(str)) {
            throw new NumberFormatException("A blank string is not a valid number");
        }
        return new BigDecimal(str);
    }

    public static BigInteger createBigInteger(String str) {
        int i8;
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            throw new NumberFormatException("An empty string is not a valid number");
        }
        int i9 = 0;
        char cCharAt = str.charAt(0);
        boolean z8 = true;
        if (cCharAt == '-') {
            i9 = 1;
        } else if (cCharAt == '+') {
            z8 = false;
            i9 = 1;
        } else {
            z8 = false;
        }
        int i10 = 16;
        if (str.startsWith("0x", i9) || str.startsWith("0X", i9)) {
            i9 += 2;
        } else if (str.startsWith("#", i9)) {
            i9++;
        } else if (!str.startsWith("0", i9) || str.length() <= (i8 = i9 + 1)) {
            i10 = 10;
        } else {
            i10 = 8;
            i9 = i8;
        }
        BigInteger bigInteger = new BigInteger(str.substring(i9), i10);
        return z8 ? bigInteger.negate() : bigInteger;
    }

    public static Double createDouble(String str) {
        if (str == null) {
            return null;
        }
        return Double.valueOf(str);
    }

    public static Float createFloat(String str) {
        if (str == null) {
            return null;
        }
        return Float.valueOf(str);
    }

    public static Integer createInteger(String str) {
        if (str == null) {
            return null;
        }
        return Integer.decode(str);
    }

    public static Long createLong(String str) {
        if (str == null) {
            return null;
        }
        return Long.decode(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0181, code lost:
    
        if (c(r9, r3) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x019a, code lost:
    
        if (c(r9, r3) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x012a, code lost:
    
        if (r5 == 'l') goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0175 A[Catch: NumberFormatException -> 0x0184, TryCatch #3 {NumberFormatException -> 0x0184, blocks: (B:107:0x016b, B:109:0x0175, B:111:0x017d), top: B:169:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018e A[Catch: NumberFormatException -> 0x019d, TryCatch #4 {NumberFormatException -> 0x019d, blocks: (B:114:0x0184, B:116:0x018e, B:118:0x0196), top: B:171:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Number createNumber(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.a.createNumber(java.lang.String):java.lang.Number");
    }

    private static void d(Object obj) {
        Objects.requireNonNull(obj, "array");
        Z.isTrue(Array.getLength(obj) != 0, "Array cannot be empty.", new Object[0]);
    }

    private static boolean e(String str, int i8) {
        int i9 = 0;
        while (i8 < str.length()) {
            boolean z8 = str.charAt(i8) == '.';
            if (z8) {
                i9++;
            }
            if (i9 > 1) {
                return false;
            }
            if (!z8 && !Character.isDigit(str.charAt(i8))) {
                return false;
            }
            i8++;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00e6, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isCreatable(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.a.isCreatable(java.lang.String):boolean");
    }

    public static boolean isDigits(String str) {
        return X.isNumeric(str);
    }

    @Deprecated
    public static boolean isNumber(String str) {
        return isCreatable(str);
    }

    public static boolean isParsable(String str) {
        if (X.isEmpty(str) || str.charAt(str.length() - 1) == '.') {
            return false;
        }
        if (str.charAt(0) != '-') {
            return e(str, 0);
        }
        if (str.length() == 1) {
            return false;
        }
        return e(str, 1);
    }

    public static byte max(byte... bArr) {
        d(bArr);
        byte b9 = bArr[0];
        for (int i8 = 1; i8 < bArr.length; i8++) {
            byte b10 = bArr[i8];
            if (b10 > b9) {
                b9 = b10;
            }
        }
        return b9;
    }

    public static byte min(byte... bArr) {
        d(bArr);
        byte b9 = bArr[0];
        for (int i8 = 1; i8 < bArr.length; i8++) {
            byte b10 = bArr[i8];
            if (b10 < b9) {
                b9 = b10;
            }
        }
        return b9;
    }

    public static byte toByte(String str) {
        return toByte(str, (byte) 0);
    }

    public static double toDouble(BigDecimal bigDecimal) {
        return toDouble(bigDecimal, 0.0d);
    }

    public static float toFloat(String str) {
        return toFloat(str, 0.0f);
    }

    public static int toInt(String str) {
        return toInt(str, 0);
    }

    public static long toLong(String str) {
        return toLong(str, 0L);
    }

    public static BigDecimal toScaledBigDecimal(BigDecimal bigDecimal) {
        return toScaledBigDecimal(bigDecimal, INTEGER_TWO.intValue(), RoundingMode.HALF_EVEN);
    }

    public static short toShort(String str) {
        return toShort(str, (short) 0);
    }

    public static int compare(int i8, int i9) {
        if (i8 == i9) {
            return 0;
        }
        return i8 < i9 ? -1 : 1;
    }

    public static byte toByte(String str, byte b9) {
        if (str == null) {
            return b9;
        }
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b9;
        }
    }

    public static double toDouble(BigDecimal bigDecimal, double d9) {
        return bigDecimal == null ? d9 : bigDecimal.doubleValue();
    }

    public static float toFloat(String str, float f8) {
        if (str == null) {
            return f8;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f8;
        }
    }

    public static int toInt(String str, int i8) {
        if (str == null) {
            return i8;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i8;
        }
    }

    public static long toLong(String str, long j8) {
        if (str == null) {
            return j8;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j8;
        }
    }

    public static BigDecimal toScaledBigDecimal(BigDecimal bigDecimal, int i8, RoundingMode roundingMode) {
        if (bigDecimal == null) {
            return BigDecimal.ZERO;
        }
        if (roundingMode == null) {
            roundingMode = RoundingMode.HALF_EVEN;
        }
        return bigDecimal.setScale(i8, roundingMode);
    }

    public static short toShort(String str, short s8) {
        if (str == null) {
            return s8;
        }
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s8;
        }
    }

    public static int compare(long j8, long j9) {
        if (j8 == j9) {
            return 0;
        }
        return j8 < j9 ? -1 : 1;
    }

    public static double toDouble(String str) {
        return toDouble(str, 0.0d);
    }

    public static int compare(short s8, short s9) {
        if (s8 == s9) {
            return 0;
        }
        return s8 < s9 ? -1 : 1;
    }

    public static double toDouble(String str, double d9) {
        if (str == null) {
            return d9;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d9;
        }
    }

    public static byte max(byte b9, byte b10, byte b11) {
        if (b10 > b9) {
            b9 = b10;
        }
        return b11 > b9 ? b11 : b9;
    }

    public static byte min(byte b9, byte b10, byte b11) {
        if (b10 < b9) {
            b9 = b10;
        }
        return b11 < b9 ? b11 : b9;
    }

    public static BigDecimal toScaledBigDecimal(Double d9) {
        return toScaledBigDecimal(d9, INTEGER_TWO.intValue(), RoundingMode.HALF_EVEN);
    }

    public static double max(double... dArr) {
        d(dArr);
        double d9 = dArr[0];
        for (int i8 = 1; i8 < dArr.length; i8++) {
            if (Double.isNaN(dArr[i8])) {
                return Double.NaN;
            }
            double d10 = dArr[i8];
            if (d10 > d9) {
                d9 = d10;
            }
        }
        return d9;
    }

    public static double min(double... dArr) {
        d(dArr);
        double d9 = dArr[0];
        for (int i8 = 1; i8 < dArr.length; i8++) {
            if (Double.isNaN(dArr[i8])) {
                return Double.NaN;
            }
            double d10 = dArr[i8];
            if (d10 < d9) {
                d9 = d10;
            }
        }
        return d9;
    }

    public static BigDecimal toScaledBigDecimal(Double d9, int i8, RoundingMode roundingMode) {
        if (d9 == null) {
            return BigDecimal.ZERO;
        }
        return toScaledBigDecimal(BigDecimal.valueOf(d9.doubleValue()), i8, roundingMode);
    }

    public static BigDecimal toScaledBigDecimal(Float f8) {
        return toScaledBigDecimal(f8, INTEGER_TWO.intValue(), RoundingMode.HALF_EVEN);
    }

    public static BigDecimal toScaledBigDecimal(Float f8, int i8, RoundingMode roundingMode) {
        if (f8 == null) {
            return BigDecimal.ZERO;
        }
        return toScaledBigDecimal(BigDecimal.valueOf(f8.floatValue()), i8, roundingMode);
    }

    public static double max(double d9, double d10, double d11) {
        return Math.max(Math.max(d9, d10), d11);
    }

    public static double min(double d9, double d10, double d11) {
        return Math.min(Math.min(d9, d10), d11);
    }

    public static float max(float... fArr) {
        d(fArr);
        float f8 = fArr[0];
        for (int i8 = 1; i8 < fArr.length; i8++) {
            if (Float.isNaN(fArr[i8])) {
                return Float.NaN;
            }
            float f9 = fArr[i8];
            if (f9 > f8) {
                f8 = f9;
            }
        }
        return f8;
    }

    public static float min(float... fArr) {
        d(fArr);
        float f8 = fArr[0];
        for (int i8 = 1; i8 < fArr.length; i8++) {
            if (Float.isNaN(fArr[i8])) {
                return Float.NaN;
            }
            float f9 = fArr[i8];
            if (f9 < f8) {
                f8 = f9;
            }
        }
        return f8;
    }

    public static BigDecimal toScaledBigDecimal(String str) {
        return toScaledBigDecimal(str, INTEGER_TWO.intValue(), RoundingMode.HALF_EVEN);
    }

    public static BigDecimal toScaledBigDecimal(String str, int i8, RoundingMode roundingMode) {
        if (str == null) {
            return BigDecimal.ZERO;
        }
        return toScaledBigDecimal(createBigDecimal(str), i8, roundingMode);
    }

    public static float max(float f8, float f9, float f10) {
        return Math.max(Math.max(f8, f9), f10);
    }

    public static float min(float f8, float f9, float f10) {
        return Math.min(Math.min(f8, f9), f10);
    }

    public static int max(int... iArr) {
        d(iArr);
        int i8 = iArr[0];
        for (int i9 = 1; i9 < iArr.length; i9++) {
            int i10 = iArr[i9];
            if (i10 > i8) {
                i8 = i10;
            }
        }
        return i8;
    }

    public static int min(int... iArr) {
        d(iArr);
        int i8 = iArr[0];
        for (int i9 = 1; i9 < iArr.length; i9++) {
            int i10 = iArr[i9];
            if (i10 < i8) {
                i8 = i10;
            }
        }
        return i8;
    }

    public static int max(int i8, int i9, int i10) {
        if (i9 > i8) {
            i8 = i9;
        }
        return i10 > i8 ? i10 : i8;
    }

    public static int min(int i8, int i9, int i10) {
        if (i9 < i8) {
            i8 = i9;
        }
        return i10 < i8 ? i10 : i8;
    }

    public static long max(long... jArr) {
        d(jArr);
        long j8 = jArr[0];
        for (int i8 = 1; i8 < jArr.length; i8++) {
            long j9 = jArr[i8];
            if (j9 > j8) {
                j8 = j9;
            }
        }
        return j8;
    }

    public static long min(long... jArr) {
        d(jArr);
        long j8 = jArr[0];
        for (int i8 = 1; i8 < jArr.length; i8++) {
            long j9 = jArr[i8];
            if (j9 < j8) {
                j8 = j9;
            }
        }
        return j8;
    }

    public static long max(long j8, long j9, long j10) {
        if (j9 > j8) {
            j8 = j9;
        }
        return j10 > j8 ? j10 : j8;
    }

    public static long min(long j8, long j9, long j10) {
        if (j9 < j8) {
            j8 = j9;
        }
        return j10 < j8 ? j10 : j8;
    }

    public static short max(short... sArr) {
        d(sArr);
        short s8 = sArr[0];
        for (int i8 = 1; i8 < sArr.length; i8++) {
            short s9 = sArr[i8];
            if (s9 > s8) {
                s8 = s9;
            }
        }
        return s8;
    }

    public static short min(short... sArr) {
        d(sArr);
        short s8 = sArr[0];
        for (int i8 = 1; i8 < sArr.length; i8++) {
            short s9 = sArr[i8];
            if (s9 < s8) {
                s8 = s9;
            }
        }
        return s8;
    }

    public static short max(short s8, short s9, short s10) {
        if (s9 > s8) {
            s8 = s9;
        }
        return s10 > s8 ? s10 : s8;
    }

    public static short min(short s8, short s9, short s10) {
        if (s9 < s8) {
            s8 = s9;
        }
        return s10 < s8 ? s10 : s8;
    }
}
