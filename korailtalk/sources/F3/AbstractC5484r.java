package f3;

/* renamed from: f3.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5484r {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    static int b(int i8, String str) {
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i8);
    }

    static void c(int i8, String str) {
        if (i8 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " must be positive but was: " + i8);
    }

    static void d(boolean z8) {
        e3.w.checkState(z8, "no calls to next() since the last call to remove()");
    }
}
