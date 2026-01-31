package i2;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: i2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5683p {
    static String a(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + 48);
        int i8 = 0;
        int i9 = 0;
        while (i8 < 3 && (iIndexOf = str.indexOf("%s", i9)) != -1) {
            sb.append(str.substring(i9, iIndexOf));
            sb.append(objArr[i8]);
            i9 = iIndexOf + 2;
            i8++;
        }
        sb.append(str.substring(i9));
        if (i8 < 3) {
            sb.append(" [");
            sb.append(objArr[i8]);
            for (int i10 = i8 + 1; i10 < 3; i10++) {
                sb.append(", ");
                sb.append(objArr[i10]);
            }
            sb.append("]");
        }
        return sb.toString();
    }

    public static void checkArgument(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static double checkArgumentInRange(double d9, double d10, double d11, String str) {
        if (d9 < d10) {
            throw new IllegalArgumentException(a("%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d10), Double.valueOf(d11)));
        }
        if (d9 <= d11) {
            return d9;
        }
        throw new IllegalArgumentException(a("%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d10), Double.valueOf(d11)));
    }

    public static void checkHandlerThread(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    public static String checkNotEmpty(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    public static void checkNotGoogleApiHandlerThread() {
        checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
    }

    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    public static <T> T checkNotNull(T t8) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException("null reference");
    }

    public static int checkNotZero(int i8) {
        if (i8 != 0) {
            return i8;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static void checkState(boolean z8) {
        if (!z8) {
            throw new IllegalStateException();
        }
    }

    public static void checkArgument(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void checkMainThread(String str) {
        if (!o2.v.zza()) {
            throw new IllegalStateException(str);
        }
    }

    public static void checkNotGoogleApiHandlerThread(String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            String name = looperMyLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException(str);
            }
        }
    }

    public static void checkNotMainThread(String str) {
        if (o2.v.zza()) {
            throw new IllegalStateException(str);
        }
    }

    public static <T> T checkNotNull(T t8, Object obj) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int checkNotZero(int i8, Object obj) {
        if (i8 != 0) {
            return i8;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void checkState(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z8, String str, Object... objArr) {
        if (!z8) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static String checkNotEmpty(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    public static long checkNotZero(long j8) {
        if (j8 != 0) {
            return j8;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    public static void checkState(boolean z8, String str, Object... objArr) {
        if (!z8) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static float checkArgumentInRange(float f8, float f9, float f10, String str) {
        if (f8 < f9) {
            throw new IllegalArgumentException(a("%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f9), Float.valueOf(f10)));
        }
        if (f8 <= f10) {
            return f8;
        }
        throw new IllegalArgumentException(a("%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f9), Float.valueOf(f10)));
    }

    public static long checkNotZero(long j8, Object obj) {
        if (j8 != 0) {
            return j8;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static int checkArgumentInRange(int i8, int i9, int i10, String str) {
        if (i8 < i9) {
            throw new IllegalArgumentException(a("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i9), Integer.valueOf(i10)));
        }
        if (i8 <= i10) {
            return i8;
        }
        throw new IllegalArgumentException(a("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i9), Integer.valueOf(i10)));
    }

    public static void checkHandlerThread(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static long checkArgumentInRange(long j8, long j9, long j10, String str) {
        if (j8 < j9) {
            throw new IllegalArgumentException(a("%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j9), Long.valueOf(j10)));
        }
        if (j8 <= j10) {
            return j8;
        }
        throw new IllegalArgumentException(a("%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j9), Long.valueOf(j10)));
    }
}
