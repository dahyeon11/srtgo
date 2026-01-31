package i3;

/* loaded from: classes2.dex */
abstract class d {
    static void a(boolean z8, String str, int i8, int i9) {
        if (z8) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + i8 + ", " + i9 + ")");
    }

    static void b(boolean z8, String str, long j8, long j9) {
        if (z8) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j8 + ", " + j9 + ")");
    }

    static int c(String str, int i8) {
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalArgumentException(str + " (" + i8 + ") must be >= 0");
    }

    static long d(String str, long j8) {
        if (j8 >= 0) {
            return j8;
        }
        throw new IllegalArgumentException(str + " (" + j8 + ") must be >= 0");
    }

    static int e(String str, int i8) {
        if (i8 > 0) {
            return i8;
        }
        throw new IllegalArgumentException(str + " (" + i8 + ") must be > 0");
    }

    static long f(String str, long j8) {
        if (j8 > 0) {
            return j8;
        }
        throw new IllegalArgumentException(str + " (" + j8 + ") must be > 0");
    }

    static void g(boolean z8) {
        if (!z8) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
