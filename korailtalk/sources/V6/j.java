package V6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class j extends i {
    public static <T extends Comparable<? super T>> T maxOf(T a9, T b9) {
        Intrinsics.checkNotNullParameter(a9, "a");
        Intrinsics.checkNotNullParameter(b9, "b");
        return a9.compareTo(b9) >= 0 ? a9 : b9;
    }

    public static final <T extends Comparable<? super T>> T minOf(T a9, T b9) {
        Intrinsics.checkNotNullParameter(a9, "a");
        Intrinsics.checkNotNullParameter(b9, "b");
        return a9.compareTo(b9) <= 0 ? a9 : b9;
    }

    public static final <T extends Comparable<? super T>> T maxOf(T a9, T b9, T c9) {
        Intrinsics.checkNotNullParameter(a9, "a");
        Intrinsics.checkNotNullParameter(b9, "b");
        Intrinsics.checkNotNullParameter(c9, "c");
        return (T) a.maxOf(a9, a.maxOf(b9, c9));
    }

    public static final <T extends Comparable<? super T>> T minOf(T a9, T b9, T c9) {
        Intrinsics.checkNotNullParameter(a9, "a");
        Intrinsics.checkNotNullParameter(b9, "b");
        Intrinsics.checkNotNullParameter(c9, "c");
        return (T) minOf(a9, minOf(b9, c9));
    }

    public static final <T extends Comparable<? super T>> T maxOf(T a9, T... other) {
        Intrinsics.checkNotNullParameter(a9, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t8 : other) {
            a9 = (T) a.maxOf(a9, t8);
        }
        return a9;
    }

    public static final <T extends Comparable<? super T>> T minOf(T a9, T... other) {
        Intrinsics.checkNotNullParameter(a9, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t8 : other) {
            a9 = (T) minOf(a9, t8);
        }
        return a9;
    }

    public static final byte maxOf(byte b9, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b10 : other) {
            b9 = (byte) Math.max((int) b9, (int) b10);
        }
        return b9;
    }

    public static final byte minOf(byte b9, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b10 : other) {
            b9 = (byte) Math.min((int) b9, (int) b10);
        }
        return b9;
    }

    public static final short maxOf(short s8, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s9 : other) {
            s8 = (short) Math.max((int) s8, (int) s9);
        }
        return s8;
    }

    public static final short minOf(short s8, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s9 : other) {
            s8 = (short) Math.min((int) s8, (int) s9);
        }
        return s8;
    }

    public static final int maxOf(int i8, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i9 : other) {
            i8 = Math.max(i8, i9);
        }
        return i8;
    }

    public static final int minOf(int i8, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i9 : other) {
            i8 = Math.min(i8, i9);
        }
        return i8;
    }

    public static final long maxOf(long j8, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j9 : other) {
            j8 = Math.max(j8, j9);
        }
        return j8;
    }

    public static final long minOf(long j8, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j9 : other) {
            j8 = Math.min(j8, j9);
        }
        return j8;
    }

    public static final float maxOf(float f8, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f9 : other) {
            f8 = Math.max(f8, f9);
        }
        return f8;
    }

    public static final float minOf(float f8, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f9 : other) {
            f8 = Math.min(f8, f9);
        }
        return f8;
    }

    public static final double maxOf(double d9, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d10 : other) {
            d9 = Math.max(d9, d10);
        }
        return d9;
    }

    public static final double minOf(double d9, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d10 : other) {
            d9 = Math.min(d9, d10);
        }
        return d9;
    }
}
