package i3;

import e3.w;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5694a {
    static long a(double d9) {
        w.checkArgument(b(d9), "not a normal value");
        int exponent = Math.getExponent(d9);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d9) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d9) {
        return Math.getExponent(d9) <= 1023;
    }

    static double c(double d9) {
        return -Math.nextUp(-d9);
    }
}
