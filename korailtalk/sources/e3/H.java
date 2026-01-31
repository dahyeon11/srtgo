package e3;

/* loaded from: classes2.dex */
public abstract class H {
    public static void verify(boolean z8) {
        if (!z8) {
            throw new I();
        }
    }

    public static <T> T verifyNotNull(T t8) {
        return (T) verifyNotNull(t8, "expected a non-null reference", new Object[0]);
    }

    public static void verify(boolean z8, String str, Object... objArr) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, objArr));
        }
    }

    public static <T> T verifyNotNull(T t8, String str, Object... objArr) {
        if (t8 != null) {
            return t8;
        }
        throw new I(AbstractC5354D.lenientFormat(str, objArr));
    }

    public static void verify(boolean z8, String str, char c9) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Character.valueOf(c9)));
        }
    }

    public static void verify(boolean z8, String str, int i8) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8)));
        }
    }

    public static void verify(boolean z8, String str, long j8) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Long.valueOf(j8)));
        }
    }

    public static void verify(boolean z8, String str, Object obj) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, obj));
        }
    }

    public static void verify(boolean z8, String str, char c9, char c10) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), Character.valueOf(c10)));
        }
    }

    public static void verify(boolean z8, String str, int i8, char c9) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), Character.valueOf(c9)));
        }
    }

    public static void verify(boolean z8, String str, long j8, char c9) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), Character.valueOf(c9)));
        }
    }

    public static void verify(boolean z8, String str, Object obj, char c9) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, obj, Character.valueOf(c9)));
        }
    }

    public static void verify(boolean z8, String str, char c9, int i8) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), Integer.valueOf(i8)));
        }
    }

    public static void verify(boolean z8, String str, int i8, int i9) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), Integer.valueOf(i9)));
        }
    }

    public static void verify(boolean z8, String str, long j8, int i8) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), Integer.valueOf(i8)));
        }
    }

    public static void verify(boolean z8, String str, Object obj, int i8) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, obj, Integer.valueOf(i8)));
        }
    }

    public static void verify(boolean z8, String str, char c9, long j8) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), Long.valueOf(j8)));
        }
    }

    public static void verify(boolean z8, String str, int i8, long j8) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), Long.valueOf(j8)));
        }
    }

    public static void verify(boolean z8, String str, long j8, long j9) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), Long.valueOf(j9)));
        }
    }

    public static void verify(boolean z8, String str, Object obj, long j8) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, obj, Long.valueOf(j8)));
        }
    }

    public static void verify(boolean z8, String str, char c9, Object obj) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Character.valueOf(c9), obj));
        }
    }

    public static void verify(boolean z8, String str, int i8, Object obj) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Integer.valueOf(i8), obj));
        }
    }

    public static void verify(boolean z8, String str, long j8, Object obj) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, Long.valueOf(j8), obj));
        }
    }

    public static void verify(boolean z8, String str, Object obj, Object obj2) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, obj, obj2));
        }
    }

    public static void verify(boolean z8, String str, Object obj, Object obj2, Object obj3) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void verify(boolean z8, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z8) {
            throw new I(AbstractC5354D.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }
}
