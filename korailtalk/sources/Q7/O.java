package Q7;

import T7.InterfaceC0815z;
import T7.s0;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public class O {
    public static final a NULL = new a();

    public static class a implements Serializable {
        a() {
        }
    }

    public static boolean CONST(boolean z8) {
        return z8;
    }

    public static byte CONST_BYTE(int i8) {
        if (i8 >= -128 && i8 <= 127) {
            return (byte) i8;
        }
        throw new IllegalArgumentException("Supplied value must be a valid byte literal between -128 and 127: [" + i8 + "]");
    }

    public static short CONST_SHORT(int i8) {
        if (i8 >= -32768 && i8 <= 32767) {
            return (short) i8;
        }
        throw new IllegalArgumentException("Supplied value must be a valid byte literal between -32768 and 32767: [" + i8 + "]");
    }

    public static boolean allNotNull(Object... objArr) {
        return objArr != null && Stream.of(objArr).noneMatch(new Predicate() { // from class: Q7.M
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.isNull(obj);
            }
        });
    }

    public static boolean allNull(Object... objArr) {
        return !anyNotNull(objArr);
    }

    public static boolean anyNotNull(Object... objArr) {
        return firstNonNull(objArr) != null;
    }

    public static boolean anyNull(Object... objArr) {
        return !allNotNull(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b(Supplier supplier) {
        if (supplier != null) {
            return supplier.get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T clone(T t8) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (!(t8 instanceof Cloneable)) {
            return null;
        }
        if (!isArray(t8)) {
            try {
                return (T) t8.getClass().getMethod("clone", null).invoke(t8, null);
            } catch (IllegalAccessException e8) {
                throw new S7.a("Cannot clone Cloneable type " + t8.getClass().getName(), e8);
            } catch (NoSuchMethodException e9) {
                throw new S7.a("Cloneable type " + t8.getClass().getName() + " has no clone method", e9);
            } catch (InvocationTargetException e10) {
                throw new S7.a("Exception cloning Cloneable type " + t8.getClass().getName(), e10.getCause());
            }
        }
        Class<?> componentType = t8.getClass().getComponentType();
        if (!componentType.isPrimitive()) {
            return (T) ((Object[]) t8).clone();
        }
        int length = Array.getLength(t8);
        T t9 = (T) Array.newInstance(componentType, length);
        while (true) {
            int i8 = length - 1;
            if (length <= 0) {
                return t9;
            }
            Array.set(t9, i8, Array.get(t8, i8));
            length = i8;
        }
    }

    public static <T> T cloneIfPossible(T t8) {
        T t9 = (T) clone(t8);
        return t9 == null ? t8 : t9;
    }

    public static <T extends Comparable<? super T>> int compare(T t8, T t9) {
        return compare(t8, t9, false);
    }

    public static <T> T defaultIfNull(T t8, T t9) {
        return t8 != null ? t8 : t9;
    }

    @Deprecated
    public static boolean equals(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    @SafeVarargs
    public static <T> T firstNonNull(T... tArr) {
        return W7.o.of(tArr).filter(new K()).findFirst().orElse(null);
    }

    public static <T> Class<T> getClass(T t8) {
        if (t8 == null) {
            return null;
        }
        return (Class<T>) t8.getClass();
    }

    @SafeVarargs
    public static <T> T getFirstNonNull(Supplier<T>... supplierArr) {
        return W7.o.of(supplierArr).map(new Function() { // from class: Q7.N
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return O.b((Supplier) obj);
            }
        }).filter(new K()).findFirst().orElse(null);
    }

    public static <T> T getIfNull(T t8, Supplier<T> supplier) {
        return t8 != null ? t8 : (T) s0.get(supplier);
    }

    @Deprecated
    public static int hashCode(Object obj) {
        return Objects.hashCode(obj);
    }

    public static String hashCodeHex(Object obj) {
        return Integer.toHexString(Objects.hashCode(obj));
    }

    @Deprecated
    public static int hashCodeMulti(Object... objArr) {
        int iHashCode = 1;
        if (objArr != null) {
            for (Object obj : objArr) {
                iHashCode = (iHashCode * 31) + Objects.hashCode(obj);
            }
        }
        return iHashCode;
    }

    public static String identityHashCodeHex(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static void identityToString(Appendable appendable, Object obj) throws IOException {
        Objects.requireNonNull(obj, "object");
        appendable.append(obj.getClass().getName()).append('@').append(identityHashCodeHex(obj));
    }

    public static boolean isArray(Object obj) {
        return obj != null && obj.getClass().isArray();
    }

    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof CharSequence) {
            return ((CharSequence) obj).length() == 0;
        }
        if (isArray(obj)) {
            return Array.getLength(obj) == 0;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        if (obj instanceof Optional) {
            return !((Optional) obj).isPresent();
        }
        return false;
    }

    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T max(T... tArr) {
        T t8 = null;
        if (tArr != null) {
            for (T t9 : tArr) {
                if (compare(t9, t8, false) > 0) {
                    t8 = t9;
                }
            }
        }
        return t8;
    }

    @SafeVarargs
    public static <T> T median(Comparator<T> comparator, T... tArr) {
        Z.notEmpty(tArr, "null/empty items", new Object[0]);
        Z.noNullElements(tArr);
        Objects.requireNonNull(comparator, "comparator");
        TreeSet treeSet = new TreeSet(comparator);
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T min(T... tArr) {
        T t8 = null;
        if (tArr != null) {
            for (T t9 : tArr) {
                if (compare(t9, t8, true) < 0) {
                    t8 = t9;
                }
            }
        }
        return t8;
    }

    @SafeVarargs
    public static <T> T mode(T... tArr) {
        if (!C0708l.isNotEmpty(tArr)) {
            return null;
        }
        HashMap map = new HashMap(tArr.length);
        int i8 = 0;
        for (T t8 : tArr) {
            V7.b bVar = (V7.b) map.get(t8);
            if (bVar == null) {
                map.put(t8, new V7.b(1));
            } else {
                bVar.increment();
            }
        }
        while (true) {
            T t9 = null;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((V7.b) entry.getValue()).intValue();
                if (iIntValue == i8) {
                    break;
                }
                if (iIntValue > i8) {
                    t9 = (T) entry.getKey();
                    i8 = iIntValue;
                }
            }
            return t9;
        }
    }

    public static boolean notEqual(Object obj, Object obj2) {
        return !Objects.equals(obj, obj2);
    }

    public static <T> T requireNonEmpty(T t8) {
        return (T) requireNonEmpty(t8, "object");
    }

    @Deprecated
    public static String toString(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    public static void wait(final Object obj, Duration duration) {
        Objects.requireNonNull(obj);
        Z7.r.accept(new InterfaceC0815z() { // from class: Q7.L
            @Override // T7.InterfaceC0815z
            public final void accept(Object obj2, Object obj3) throws InterruptedException {
                obj.wait(((Long) obj2).longValue(), ((Integer) obj3).intValue());
            }
        }, Z7.r.zeroIfNull(duration));
    }

    public static byte CONST(byte b9) {
        return b9;
    }

    public static <T extends Comparable<? super T>> int compare(T t8, T t9, boolean z8) {
        if (t8 == t9) {
            return 0;
        }
        return t8 == null ? z8 ? 1 : -1 : t9 == null ? z8 ? -1 : 1 : t8.compareTo(t9);
    }

    public static <T> T requireNonEmpty(T t8, String str) {
        Objects.requireNonNull(t8, str);
        if (isEmpty(t8)) {
            throw new IllegalArgumentException(str);
        }
        return t8;
    }

    @Deprecated
    public static String toString(Object obj, String str) {
        return obj == null ? str : obj.toString();
    }

    public static char CONST(char c9) {
        return c9;
    }

    public static String toString(Supplier<Object> supplier, Supplier<String> supplier2) {
        return supplier == null ? (String) s0.get(supplier2) : toString(supplier.get(), supplier2);
    }

    public static double CONST(double d9) {
        return d9;
    }

    public static <T> String toString(T t8, Supplier<String> supplier) {
        return t8 == null ? (String) s0.get(supplier) : t8.toString();
    }

    public static float CONST(float f8) {
        return f8;
    }

    public static String identityToString(Object obj) {
        if (obj == null) {
            return null;
        }
        String name = obj.getClass().getName();
        String strIdentityHashCodeHex = identityHashCodeHex(obj);
        StringBuilder sb = new StringBuilder(name.length() + 1 + strIdentityHashCodeHex.length());
        sb.append(name);
        sb.append('@');
        sb.append(strIdentityHashCodeHex);
        return sb.toString();
    }

    public static int CONST(int i8) {
        return i8;
    }

    public static long CONST(long j8) {
        return j8;
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T median(T... tArr) {
        Z.notEmpty(tArr);
        Z.noNullElements(tArr);
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    public static short CONST(short s8) {
        return s8;
    }

    public static <T> T CONST(T t8) {
        return t8;
    }

    @Deprecated
    public static void identityToString(X7.c cVar, Object obj) {
        Objects.requireNonNull(obj, "object");
        String name = obj.getClass().getName();
        String strIdentityHashCodeHex = identityHashCodeHex(obj);
        cVar.ensureCapacity(cVar.length() + name.length() + 1 + strIdentityHashCodeHex.length());
        cVar.append(name).append('@').append(strIdentityHashCodeHex);
    }

    public static void identityToString(StringBuffer stringBuffer, Object obj) {
        Objects.requireNonNull(obj, "object");
        String name = obj.getClass().getName();
        String strIdentityHashCodeHex = identityHashCodeHex(obj);
        stringBuffer.ensureCapacity(stringBuffer.length() + name.length() + 1 + strIdentityHashCodeHex.length());
        stringBuffer.append(name);
        stringBuffer.append('@');
        stringBuffer.append(strIdentityHashCodeHex);
    }

    public static void identityToString(StringBuilder sb, Object obj) {
        Objects.requireNonNull(obj, "object");
        String name = obj.getClass().getName();
        String strIdentityHashCodeHex = identityHashCodeHex(obj);
        sb.ensureCapacity(sb.length() + name.length() + 1 + strIdentityHashCodeHex.length());
        sb.append(name);
        sb.append('@');
        sb.append(strIdentityHashCodeHex);
    }
}
