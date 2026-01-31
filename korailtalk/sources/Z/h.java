package Z;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class h {
    public static void checkArgument(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static float checkArgumentFinite(float f8, String str) {
        if (Float.isNaN(f8)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        }
        if (!Float.isInfinite(f8)) {
            return f8;
        }
        throw new IllegalArgumentException(str + " must not be infinite");
    }

    public static int checkArgumentInRange(int i8, int i9, int i10, String str) {
        if (i8 < i9) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i9), Integer.valueOf(i10)));
        }
        if (i8 <= i10) {
            return i8;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i9), Integer.valueOf(i10)));
    }

    public static int checkArgumentNonnegative(int i8, String str) {
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalArgumentException(str);
    }

    public static int checkFlagsArgument(int i8, int i9) {
        if ((i8 & i9) == i8) {
            return i8;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i8) + ", but only 0x" + Integer.toHexString(i9) + " are allowed");
    }

    public static <T> T checkNotNull(T t8) {
        t8.getClass();
        return t8;
    }

    public static void checkState(boolean z8, String str) {
        if (!z8) {
            throw new IllegalStateException(str);
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t8) {
        if (TextUtils.isEmpty(t8)) {
            throw new IllegalArgumentException();
        }
        return t8;
    }

    public static void checkArgument(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int checkArgumentNonnegative(int i8) {
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T checkNotNull(T t8, Object obj) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z8) {
        checkState(z8, null);
    }

    public static void checkArgument(boolean z8, String str, Object... objArr) {
        if (!z8) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t8, Object obj) {
        if (TextUtils.isEmpty(t8)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t8;
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T t8, String str, Object... objArr) {
        if (TextUtils.isEmpty(t8)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t8;
    }

    public static long checkArgumentInRange(long j8, long j9, long j10, String str) {
        if (j8 < j9) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j9), Long.valueOf(j10)));
        }
        if (j8 <= j10) {
            return j8;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j9), Long.valueOf(j10)));
    }

    public static float checkArgumentInRange(float f8, float f9, float f10, String str) {
        if (f8 < f9) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f9), Float.valueOf(f10)));
        }
        if (f8 <= f10) {
            return f8;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f9), Float.valueOf(f10)));
    }

    public static double checkArgumentInRange(double d9, double d10, double d11, String str) {
        if (d9 < d10) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d10), Double.valueOf(d11)));
        }
        if (d9 <= d11) {
            return d9;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d10), Double.valueOf(d11)));
    }
}
