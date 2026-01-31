package Q7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class Z {
    public static String b(String str, Object... objArr) {
        return C0708l.isEmpty(objArr) ? str : String.format(str, objArr);
    }

    private static Supplier d(final String str, final Object... objArr) {
        return new Supplier() { // from class: Q7.Y
            @Override // java.util.function.Supplier
            public final Object get() {
                return Z.b(str, objArr);
            }
        };
    }

    public static void exclusiveBetween(double d9, double d10, double d11) {
        if (d11 <= d9 || d11 >= d10) {
            throw new IllegalArgumentException(String.format("The value %s is not in the specified exclusive range of %s to %s", Double.valueOf(d11), Double.valueOf(d9), Double.valueOf(d10)));
        }
    }

    public static void finite(double d9) {
        finite(d9, "The value is invalid: %f", Double.valueOf(d9));
    }

    public static void inclusiveBetween(double d9, double d10, double d11) {
        if (d11 < d9 || d11 > d10) {
            throw new IllegalArgumentException(String.format("The value %s is not in the specified inclusive range of %s to %s", Double.valueOf(d11), Double.valueOf(d9), Double.valueOf(d10)));
        }
    }

    public static void isAssignableFrom(Class<?> cls, Class<?> cls2) {
        if (cls2 == null || cls == null || !cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException(String.format("Cannot assign a %s to a %s", C.getName(cls2, "null type"), C.getName(cls, "null type")));
        }
    }

    public static void isInstanceOf(Class<?> cls, Object obj) {
        if (!cls.isInstance(obj)) {
            throw new IllegalArgumentException(String.format("Expected type: %s, actual: %s", cls.getName(), C.getName(obj, "null")));
        }
    }

    public static void isTrue(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException("The validated expression is false");
        }
    }

    public static void matchesPattern(CharSequence charSequence, String str) {
        if (!Pattern.matches(str, charSequence)) {
            throw new IllegalArgumentException(String.format("The string %s does not match the pattern %s", charSequence, str));
        }
    }

    public static <T extends Iterable<?>> T noNullElements(T t8) {
        return (T) noNullElements(t8, "The validated collection contains null element at index: %d", new Object[0]);
    }

    public static <T extends CharSequence> T notBlank(T t8) {
        return (T) notBlank(t8, "The validated character sequence is blank", new Object[0]);
    }

    public static <T extends Collection<?>> T notEmpty(T t8) {
        return (T) notEmpty(t8, "The validated collection is empty", new Object[0]);
    }

    public static void notNaN(double d9) {
        notNaN(d9, "The validated value is not a number", new Object[0]);
    }

    @Deprecated
    public static <T> T notNull(T t8) {
        return (T) notNull(t8, "The validated object is null", new Object[0]);
    }

    public static <T extends Collection<?>> T validIndex(T t8, int i8) {
        return (T) validIndex(t8, i8, "The validated collection index is invalid: %d", Integer.valueOf(i8));
    }

    public static void validState(boolean z8) {
        if (!z8) {
            throw new IllegalStateException("The validated state is false");
        }
    }

    public static void exclusiveBetween(double d9, double d10, double d11, String str) {
        if (d11 <= d9 || d11 >= d10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void finite(double d9, String str, Object... objArr) {
        if (Double.isNaN(d9) || Double.isInfinite(d9)) {
            throw new IllegalArgumentException(b(str, objArr));
        }
    }

    public static void inclusiveBetween(double d9, double d10, double d11, String str) {
        if (d11 < d9 || d11 > d10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void isTrue(boolean z8, String str, double d9) {
        if (!z8) {
            throw new IllegalArgumentException(String.format(str, Double.valueOf(d9)));
        }
    }

    public static <T extends Iterable<?>> T noNullElements(T t8, String str, Object... objArr) {
        Objects.requireNonNull(t8, "iterable");
        Iterator it = t8.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException(b(str, C0708l.addAll(objArr, Integer.valueOf(i8))));
            }
            i8++;
        }
        return t8;
    }

    public static <T extends CharSequence> T notBlank(T t8, String str, Object... objArr) {
        Objects.requireNonNull(t8, (Supplier<String>) d(str, objArr));
        if (X.isBlank(t8)) {
            throw new IllegalArgumentException(b(str, objArr));
        }
        return t8;
    }

    public static <T extends Map<?, ?>> T notEmpty(T t8) {
        return (T) notEmpty(t8, "The validated map is empty", new Object[0]);
    }

    public static void notNaN(double d9, String str, Object... objArr) {
        if (Double.isNaN(d9)) {
            throw new IllegalArgumentException(b(str, objArr));
        }
    }

    public static <T> T notNull(T t8, String str, Object... objArr) {
        Objects.requireNonNull(t8, (Supplier<String>) d(str, objArr));
        return t8;
    }

    public static <T extends CharSequence> T validIndex(T t8, int i8) {
        return (T) validIndex(t8, i8, "The validated character sequence index is invalid: %d", Integer.valueOf(i8));
    }

    public static void validState(boolean z8, String str, Object... objArr) {
        if (!z8) {
            throw new IllegalStateException(b(str, objArr));
        }
    }

    public static void exclusiveBetween(long j8, long j9, long j10) {
        if (j10 <= j8 || j10 >= j9) {
            throw new IllegalArgumentException(String.format("The value %s is not in the specified exclusive range of %s to %s", Long.valueOf(j10), Long.valueOf(j8), Long.valueOf(j9)));
        }
    }

    public static void inclusiveBetween(long j8, long j9, long j10) {
        if (j10 < j8 || j10 > j9) {
            throw new IllegalArgumentException(String.format("The value %s is not in the specified inclusive range of %s to %s", Long.valueOf(j10), Long.valueOf(j8), Long.valueOf(j9)));
        }
    }

    public static void isInstanceOf(Class<?> cls, Object obj, String str, Object... objArr) {
        if (!cls.isInstance(obj)) {
            throw new IllegalArgumentException(b(str, objArr));
        }
    }

    public static void isTrue(boolean z8, String str, long j8) {
        if (!z8) {
            throw new IllegalArgumentException(String.format(str, Long.valueOf(j8)));
        }
    }

    public static void matchesPattern(CharSequence charSequence, String str, String str2, Object... objArr) {
        if (!Pattern.matches(str, charSequence)) {
            throw new IllegalArgumentException(b(str2, objArr));
        }
    }

    public static <T extends CharSequence> T notEmpty(T t8) {
        return (T) notEmpty(t8, "The validated character sequence is empty", new Object[0]);
    }

    public static <T extends Collection<?>> T validIndex(T t8, int i8, String str, Object... objArr) {
        Objects.requireNonNull(t8, "collection");
        if (i8 < 0 || i8 >= t8.size()) {
            throw new IndexOutOfBoundsException(b(str, objArr));
        }
        return t8;
    }

    public static void exclusiveBetween(long j8, long j9, long j10, String str) {
        if (j10 <= j8 || j10 >= j9) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void inclusiveBetween(long j8, long j9, long j10, String str) {
        if (j10 < j8 || j10 > j9) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void isAssignableFrom(Class<?> cls, Class<?> cls2, String str, Object... objArr) {
        if (!cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException(b(str, objArr));
        }
    }

    public static void isTrue(boolean z8, String str, Object... objArr) {
        if (!z8) {
            throw new IllegalArgumentException(b(str, objArr));
        }
    }

    public static <T extends Collection<?>> T notEmpty(T t8, String str, Object... objArr) {
        Objects.requireNonNull(t8, (Supplier<String>) d(str, objArr));
        if (t8.isEmpty()) {
            throw new IllegalArgumentException(b(str, objArr));
        }
        return t8;
    }

    public static <T> void exclusiveBetween(T t8, T t9, Comparable<T> comparable) {
        if (comparable.compareTo(t8) <= 0 || comparable.compareTo(t9) >= 0) {
            throw new IllegalArgumentException(String.format("The value %s is not in the specified exclusive range of %s to %s", comparable, t8, t9));
        }
    }

    public static <T> void inclusiveBetween(T t8, T t9, Comparable<T> comparable) {
        if (comparable.compareTo(t8) < 0 || comparable.compareTo(t9) > 0) {
            throw new IllegalArgumentException(String.format("The value %s is not in the specified inclusive range of %s to %s", comparable, t8, t9));
        }
    }

    public static <T extends CharSequence> T validIndex(T t8, int i8, String str, Object... objArr) {
        Objects.requireNonNull(t8, "chars");
        if (i8 < 0 || i8 >= t8.length()) {
            throw new IndexOutOfBoundsException(b(str, objArr));
        }
        return t8;
    }

    public static <T> void exclusiveBetween(T t8, T t9, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t8) <= 0 || comparable.compareTo(t9) >= 0) {
            throw new IllegalArgumentException(b(str, objArr));
        }
    }

    public static <T> void inclusiveBetween(T t8, T t9, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t8) < 0 || comparable.compareTo(t9) > 0) {
            throw new IllegalArgumentException(b(str, objArr));
        }
    }

    public static <T> T[] noNullElements(T[] tArr) {
        return (T[]) noNullElements(tArr, "The validated array contains null element at index: %d", new Object[0]);
    }

    public static <T extends Map<?, ?>> T notEmpty(T t8, String str, Object... objArr) {
        Objects.requireNonNull(t8, (Supplier<String>) d(str, objArr));
        if (t8.isEmpty()) {
            throw new IllegalArgumentException(b(str, objArr));
        }
        return t8;
    }

    public static <T> T[] noNullElements(T[] tArr, String str, Object... objArr) {
        Objects.requireNonNull(tArr, "array");
        for (int i8 = 0; i8 < tArr.length; i8++) {
            if (tArr[i8] == null) {
                throw new IllegalArgumentException(b(str, C0708l.add((Integer[]) objArr, Integer.valueOf(i8))));
            }
        }
        return tArr;
    }

    public static <T> T[] validIndex(T[] tArr, int i8) {
        return (T[]) validIndex(tArr, i8, "The validated array index is invalid: %d", Integer.valueOf(i8));
    }

    public static <T extends CharSequence> T notEmpty(T t8, String str, Object... objArr) {
        Objects.requireNonNull(t8, (Supplier<String>) d(str, objArr));
        if (t8.length() != 0) {
            return t8;
        }
        throw new IllegalArgumentException(b(str, objArr));
    }

    public static <T> T[] validIndex(T[] tArr, int i8, String str, Object... objArr) {
        Objects.requireNonNull(tArr, "array");
        if (i8 < 0 || i8 >= tArr.length) {
            throw new IndexOutOfBoundsException(b(str, objArr));
        }
        return tArr;
    }

    public static <T> T[] notEmpty(T[] tArr) {
        return (T[]) notEmpty(tArr, "The validated array is empty", new Object[0]);
    }

    public static <T> T[] notEmpty(T[] tArr, String str, Object... objArr) {
        Objects.requireNonNull(tArr, (Supplier<String>) d(str, objArr));
        if (tArr.length != 0) {
            return tArr;
        }
        throw new IllegalArgumentException(b(str, objArr));
    }
}
