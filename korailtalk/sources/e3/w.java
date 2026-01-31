package e3;

/* loaded from: classes2.dex */
public abstract class w {
    private static String a(int i8, int i9, String str) {
        if (i8 < 0) {
            return AbstractC5354D.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return AbstractC5354D.lenientFormat("%s (%s) must be less than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException("negative size: " + i9);
    }

    private static String b(int i8, int i9, String str) {
        if (i8 < 0) {
            return AbstractC5354D.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return AbstractC5354D.lenientFormat("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException("negative size: " + i9);
    }

    private static String c(int i8, int i9, int i10) {
        return (i8 < 0 || i8 > i10) ? b(i8, i10, "start index") : (i9 < 0 || i9 > i10) ? b(i9, i10, "end index") : AbstractC5354D.lenientFormat("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i8));
    }

    public static void checkArgument(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int i8, int i9) {
        return checkElementIndex(i8, i9, "index");
    }

    public static <T> T checkNotNull(T t8) {
        t8.getClass();
        return t8;
    }

    public static int checkPositionIndex(int i8, int i9) {
        return checkPositionIndex(i8, i9, "index");
    }

    public static void checkPositionIndexes(int i8, int i9, int i10) {
        if (i8 < 0 || i9 < i8 || i9 > i10) {
            throw new IndexOutOfBoundsException(c(i8, i9, i10));
        }
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

    public static int checkElementIndex(int i8, int i9, String str) {
        if (i8 < 0 || i8 >= i9) {
            throw new IndexOutOfBoundsException(a(i8, i9, str));
        }
        return i8;
    }

    public static <T> T checkNotNull(T t8, Object obj) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int checkPositionIndex(int i8, int i9, String str) {
        if (i8 < 0 || i8 > i9) {
            throw new IndexOutOfBoundsException(b(i8, i9, str));
        }
        return i8;
    }

    public static void checkState(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z8, String str, Object... objArr) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t8, String str, Object... objArr) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, objArr));
    }

    public static void checkState(boolean z8, String str, Object... objArr) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, objArr));
        }
    }

    public static void checkArgument(boolean z8, String str, char c9) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, char c9) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9)));
    }

    public static void checkState(boolean z8, String str, char c9) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9)));
        }
    }

    public static void checkArgument(boolean z8, String str, int i8) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, int i8) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8)));
    }

    public static void checkState(boolean z8, String str, int i8) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8)));
        }
    }

    public static void checkArgument(boolean z8, String str, long j8) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, long j8) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8)));
    }

    public static void checkState(boolean z8, String str, long j8) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8)));
        }
    }

    public static void checkArgument(boolean z8, String str, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, obj));
        }
    }

    public static <T> T checkNotNull(T t8, String str, Object obj) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, obj));
    }

    public static void checkState(boolean z8, String str, Object obj) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, obj));
        }
    }

    public static void checkArgument(boolean z8, String str, char c9, char c10) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), Character.valueOf(c10)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, char c9, char c10) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), Character.valueOf(c10)));
    }

    public static void checkState(boolean z8, String str, char c9, char c10) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z8, String str, char c9, int i8) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), Integer.valueOf(i8)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, char c9, int i8) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), Integer.valueOf(i8)));
    }

    public static void checkState(boolean z8, String str, char c9, int i8) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), Integer.valueOf(i8)));
        }
    }

    public static void checkArgument(boolean z8, String str, char c9, long j8) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), Long.valueOf(j8)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, char c9, long j8) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), Long.valueOf(j8)));
    }

    public static void checkState(boolean z8, String str, char c9, long j8) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), Long.valueOf(j8)));
        }
    }

    public static void checkArgument(boolean z8, String str, char c9, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), obj));
        }
    }

    public static <T> T checkNotNull(T t8, String str, char c9, Object obj) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), obj));
    }

    public static void checkState(boolean z8, String str, char c9, Object obj) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), obj));
        }
    }

    public static void checkArgument(boolean z8, String str, int i8, char c9) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), Character.valueOf(c9)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, int i8, char c9) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), Character.valueOf(c9)));
    }

    public static void checkState(boolean z8, String str, int i8, char c9) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), Character.valueOf(c9)));
        }
    }

    public static void checkArgument(boolean z8, String str, int i8, int i9) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), Integer.valueOf(i9)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, int i8, int i9) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), Integer.valueOf(i9)));
    }

    public static void checkState(boolean z8, String str, int i8, int i9) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), Integer.valueOf(i9)));
        }
    }

    public static void checkArgument(boolean z8, String str, int i8, long j8) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), Long.valueOf(j8)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, int i8, long j8) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), Long.valueOf(j8)));
    }

    public static void checkState(boolean z8, String str, int i8, long j8) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), Long.valueOf(j8)));
        }
    }

    public static void checkArgument(boolean z8, String str, int i8, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), obj));
        }
    }

    public static <T> T checkNotNull(T t8, String str, int i8, Object obj) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), obj));
    }

    public static void checkState(boolean z8, String str, int i8, Object obj) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), obj));
        }
    }

    public static void checkArgument(boolean z8, String str, long j8, char c9) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), Character.valueOf(c9)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, long j8, char c9) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), Character.valueOf(c9)));
    }

    public static void checkState(boolean z8, String str, long j8, char c9) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), Character.valueOf(c9)));
        }
    }

    public static void checkArgument(boolean z8, String str, long j8, int i8) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), Integer.valueOf(i8)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, long j8, int i8) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), Integer.valueOf(i8)));
    }

    public static void checkState(boolean z8, String str, long j8, int i8) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), Integer.valueOf(i8)));
        }
    }

    public static void checkArgument(boolean z8, String str, long j8, long j9) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), Long.valueOf(j9)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, long j8, long j9) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), Long.valueOf(j9)));
    }

    public static void checkState(boolean z8, String str, long j8, long j9) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), Long.valueOf(j9)));
        }
    }

    public static void checkArgument(boolean z8, String str, long j8, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), obj));
        }
    }

    public static <T> T checkNotNull(T t8, String str, long j8, Object obj) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), obj));
    }

    public static void checkState(boolean z8, String str, long j8, Object obj) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), obj));
        }
    }

    public static void checkArgument(boolean z8, String str, Object obj, char c9) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, obj, Character.valueOf(c9)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, Object obj, char c9) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, obj, Character.valueOf(c9)));
    }

    public static void checkState(boolean z8, String str, Object obj, char c9) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, obj, Character.valueOf(c9)));
        }
    }

    public static void checkArgument(boolean z8, String str, Object obj, int i8) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, obj, Integer.valueOf(i8)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, Object obj, int i8) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, obj, Integer.valueOf(i8)));
    }

    public static void checkState(boolean z8, String str, Object obj, int i8) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, obj, Integer.valueOf(i8)));
        }
    }

    public static void checkArgument(boolean z8, String str, Object obj, long j8) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, obj, Long.valueOf(j8)));
        }
    }

    public static <T> T checkNotNull(T t8, String str, Object obj, long j8) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, obj, Long.valueOf(j8)));
    }

    public static void checkState(boolean z8, String str, Object obj, long j8) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, obj, Long.valueOf(j8)));
        }
    }

    public static void checkArgument(boolean z8, String str, Object obj, Object obj2) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, obj, obj2));
        }
    }

    public static <T> T checkNotNull(T t8, String str, Object obj, Object obj2) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, obj, obj2));
    }

    public static void checkState(boolean z8, String str, Object obj, Object obj2) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, obj, obj2));
        }
    }

    public static void checkArgument(boolean z8, String str, Object obj, Object obj2, Object obj3) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static <T> T checkNotNull(T t8, String str, Object obj, Object obj2, Object obj3) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, obj, obj2, obj3));
    }

    public static void checkState(boolean z8, String str, Object obj, Object obj2, Object obj3) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void checkArgument(boolean z8, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z8) {
            throw new IllegalArgumentException(AbstractC5354D.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }

    public static <T> T checkNotNull(T t8, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(AbstractC5354D.lenientFormat(str, obj, obj2, obj3, obj4));
    }

    public static void checkState(boolean z8, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z8) {
            throw new IllegalStateException(AbstractC5354D.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }
}
