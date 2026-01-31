package Q7;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* renamed from: Q7.l */
/* loaded from: classes3.dex */
public class C0708l {
    public static final int INDEX_NOT_FOUND = -1;
    public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];
    public static final Boolean[] EMPTY_BOOLEAN_OBJECT_ARRAY = new Boolean[0];
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final Byte[] EMPTY_BYTE_OBJECT_ARRAY = new Byte[0];
    public static final char[] EMPTY_CHAR_ARRAY = new char[0];
    public static final Character[] EMPTY_CHARACTER_OBJECT_ARRAY = new Character[0];
    public static final Class<?>[] EMPTY_CLASS_ARRAY = new Class[0];
    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
    public static final Double[] EMPTY_DOUBLE_OBJECT_ARRAY = new Double[0];
    public static final Field[] EMPTY_FIELD_ARRAY = new Field[0];
    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];
    public static final Float[] EMPTY_FLOAT_OBJECT_ARRAY = new Float[0];
    public static final int[] EMPTY_INT_ARRAY = new int[0];
    public static final Integer[] EMPTY_INTEGER_OBJECT_ARRAY = new Integer[0];
    public static final long[] EMPTY_LONG_ARRAY = new long[0];
    public static final Long[] EMPTY_LONG_OBJECT_ARRAY = new Long[0];
    public static final Method[] EMPTY_METHOD_ARRAY = new Method[0];
    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];
    public static final short[] EMPTY_SHORT_ARRAY = new short[0];
    public static final Short[] EMPTY_SHORT_OBJECT_ARRAY = new Short[0];
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final Throwable[] EMPTY_THROWABLE_ARRAY = new Throwable[0];
    public static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

    public static boolean[] add(boolean[] zArr, boolean z8) {
        boolean[] zArr2 = (boolean[]) k(zArr, Boolean.TYPE);
        zArr2[zArr2.length - 1] = z8;
        return zArr2;
    }

    public static boolean[] addAll(boolean[] zArr, boolean... zArr2) {
        if (zArr == null) {
            return clone(zArr2);
        }
        if (zArr2 == null) {
            return clone(zArr);
        }
        boolean[] zArr3 = new boolean[zArr.length + zArr2.length];
        System.arraycopy(zArr, 0, zArr3, 0, zArr.length);
        System.arraycopy(zArr2, 0, zArr3, zArr.length, zArr2.length);
        return zArr3;
    }

    public static boolean[] addFirst(boolean[] zArr, boolean z8) {
        return zArr == null ? add(zArr, z8) : insert(0, zArr, z8);
    }

    public static boolean[] clone(boolean[] zArr) {
        if (zArr != null) {
            return (boolean[]) zArr.clone();
        }
        return null;
    }

    public static boolean contains(boolean[] zArr, boolean z8) {
        return indexOf(zArr, z8) != -1;
    }

    public static boolean containsAny(final Object[] objArr, Object... objArr2) {
        return W7.o.of(objArr2).anyMatch(new Predicate() { // from class: Q7.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C0708l.contains(objArr, obj);
            }
        });
    }

    public static <T> T get(T[] tArr, int i8) {
        return (T) get(tArr, i8, null);
    }

    public static <T> Class<T> getComponentType(T[] tArr) {
        return C.getComponentType(O.getClass(tArr));
    }

    public static int getLength(Object obj) {
        if (obj != null) {
            return Array.getLength(obj);
        }
        return 0;
    }

    public static int hashCode(Object obj) {
        return new R7.f().append(obj).toHashCode();
    }

    public static int indexOf(boolean[] zArr, boolean z8) {
        return indexOf(zArr, z8, 0);
    }

    public static BitSet indexesOf(boolean[] zArr, boolean z8) {
        return indexesOf(zArr, z8, 0);
    }

    public static boolean[] insert(int i8, boolean[] zArr, boolean... zArr2) {
        if (zArr == null) {
            return null;
        }
        if (isEmpty(zArr2)) {
            return clone(zArr);
        }
        if (i8 < 0 || i8 > zArr.length) {
            throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: " + zArr.length);
        }
        boolean[] zArr3 = new boolean[zArr.length + zArr2.length];
        System.arraycopy(zArr2, 0, zArr3, i8, zArr2.length);
        if (i8 > 0) {
            System.arraycopy(zArr, 0, zArr3, 0, i8);
        }
        if (i8 < zArr.length) {
            System.arraycopy(zArr, i8, zArr3, zArr2.length + i8, zArr.length - i8);
        }
        return zArr3;
    }

    public static <T> boolean isArrayIndexValid(T[] tArr, int i8) {
        return i8 >= 0 && getLength(tArr) > i8;
    }

    public static boolean isEmpty(boolean[] zArr) {
        return l(zArr);
    }

    @Deprecated
    public static boolean isEquals(Object obj, Object obj2) {
        return new R7.c().append(obj, obj2).isEquals();
    }

    public static boolean isNotEmpty(boolean[] zArr) {
        return !isEmpty(zArr);
    }

    public static boolean isSameLength(boolean[] zArr, boolean[] zArr2) {
        return getLength(zArr) == getLength(zArr2);
    }

    public static boolean isSameType(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        return obj.getClass().getName().equals(obj2.getClass().getName());
    }

    public static boolean isSorted(boolean[] zArr) {
        if (getLength(zArr) < 2) {
            return true;
        }
        boolean z8 = zArr[0];
        int length = zArr.length;
        int i8 = 1;
        while (i8 < length) {
            boolean z9 = zArr[i8];
            if (C0709m.compare(z8, z9) > 0) {
                return false;
            }
            i8++;
            z8 = z9;
        }
        return true;
    }

    private static Object j(Object obj, int i8, Object obj2, Class cls) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (obj == null) {
            if (i8 == 0) {
                Object objNewInstance = Array.newInstance((Class<?>) cls, 1);
                Array.set(objNewInstance, 0, obj2);
                return objNewInstance;
            }
            throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: 0");
        }
        int length = Array.getLength(obj);
        if (i8 > length || i8 < 0) {
            throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: " + length);
        }
        Object objNewInstance2 = Array.newInstance((Class<?>) cls, length + 1);
        System.arraycopy(obj, 0, objNewInstance2, 0, i8);
        Array.set(objNewInstance2, i8, obj2);
        if (i8 < length) {
            System.arraycopy(obj, i8, objNewInstance2, i8 + 1, length - i8);
        }
        return objNewInstance2;
    }

    private static Object k(Object obj, Class cls) throws NegativeArraySizeException {
        if (obj == null) {
            return Array.newInstance((Class<?>) cls, 1);
        }
        int length = Array.getLength(obj);
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        return objNewInstance;
    }

    private static boolean l(Object obj) {
        return getLength(obj) == 0;
    }

    public static int lastIndexOf(boolean[] zArr, boolean z8) {
        return lastIndexOf(zArr, z8, Integer.MAX_VALUE);
    }

    public static /* synthetic */ Boolean n(boolean[] zArr, int i8) {
        return zArr[i8] ? Boolean.TRUE : Boolean.FALSE;
    }

    public static <T> T[] newInstance(Class<T> cls, int i8) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i8));
    }

    public static boolean[] nullToEmpty(boolean[] zArr) {
        return isEmpty(zArr) ? EMPTY_BOOLEAN_ARRAY : zArr;
    }

    public static /* synthetic */ Byte o(byte[] bArr, int i8) {
        return Byte.valueOf(bArr[i8]);
    }

    public static /* synthetic */ Character p(char[] cArr, int i8) {
        return Character.valueOf(cArr[i8]);
    }

    public static /* synthetic */ Double q(double[] dArr, int i8) {
        return Double.valueOf(dArr[i8]);
    }

    public static /* synthetic */ Float r(float[] fArr, int i8) {
        return Float.valueOf(fArr[i8]);
    }

    public static boolean[] remove(boolean[] zArr, int i8) {
        return (boolean[]) w(zArr, i8);
    }

    public static boolean[] removeAll(boolean[] zArr, int... iArr) {
        return (boolean[]) y(zArr, iArr);
    }

    @Deprecated
    public static boolean[] removeAllOccurences(boolean[] zArr, boolean z8) {
        return (boolean[]) x(zArr, indexesOf(zArr, z8));
    }

    public static boolean[] removeAllOccurrences(boolean[] zArr, boolean z8) {
        return (boolean[]) x(zArr, indexesOf(zArr, z8));
    }

    public static boolean[] removeElement(boolean[] zArr, boolean z8) {
        int iIndexOf = indexOf(zArr, z8);
        return iIndexOf == -1 ? clone(zArr) : remove(zArr, iIndexOf);
    }

    public static boolean[] removeElements(boolean[] zArr, boolean... zArr2) {
        if (isEmpty(zArr) || isEmpty(zArr2)) {
            return clone(zArr);
        }
        HashMap map = new HashMap(2);
        for (boolean z8 : zArr2) {
            Boolean boolValueOf = Boolean.valueOf(z8);
            V7.b bVar = (V7.b) map.get(boolValueOf);
            if (bVar == null) {
                map.put(boolValueOf, new V7.b(1));
            } else {
                bVar.increment();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i8 = 0; i8 < zArr.length; i8++) {
            boolean z9 = zArr[i8];
            V7.b bVar2 = (V7.b) map.get(Boolean.valueOf(z9));
            if (bVar2 != null) {
                if (bVar2.decrementAndGet() == 0) {
                    map.remove(Boolean.valueOf(z9));
                }
                bitSet.set(i8);
            }
        }
        return (boolean[]) x(zArr, bitSet);
    }

    public static void reverse(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        reverse(zArr, 0, zArr.length);
    }

    public static /* synthetic */ Integer s(int[] iArr, int i8) {
        return Integer.valueOf(iArr[i8]);
    }

    public static <T> T[] setAll(T[] tArr, IntFunction<? extends T> intFunction) {
        if (tArr != null && intFunction != null) {
            Arrays.setAll(tArr, intFunction);
        }
        return tArr;
    }

    public static void shift(boolean[] zArr, int i8) {
        if (zArr != null) {
            shift(zArr, 0, zArr.length, i8);
        }
    }

    public static void shuffle(boolean[] zArr) {
        shuffle(zArr, v());
    }

    public static boolean[] subarray(boolean[] zArr, int i8, int i9) {
        if (zArr == null) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 > zArr.length) {
            i9 = zArr.length;
        }
        int i10 = i9 - i8;
        if (i10 <= 0) {
            return EMPTY_BOOLEAN_ARRAY;
        }
        boolean[] zArr2 = new boolean[i10];
        System.arraycopy(zArr, i8, zArr2, 0, i10);
        return zArr2;
    }

    public static void swap(boolean[] zArr, int i8, int i9) {
        swap(zArr, i8, i9, 1);
    }

    public static /* synthetic */ Long t(long[] jArr, int i8) {
        return Long.valueOf(jArr[i8]);
    }

    public static Map<Object, Object> toMap(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        HashMap map = new HashMap((int) (objArr.length * 1.5d));
        for (int i8 = 0; i8 < objArr.length; i8++) {
            Object obj = objArr[i8];
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                map.put(entry.getKey(), entry.getValue());
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Array element " + i8 + ", '" + obj + "', is neither of type Map.Entry nor an Array");
                }
                Object[] objArr2 = (Object[]) obj;
                if (objArr2.length < 2) {
                    throw new IllegalArgumentException("Array element " + i8 + ", '" + obj + "', has a length less than 2");
                }
                map.put(objArr2[0], objArr2[1]);
            }
        }
        return map;
    }

    public static Boolean[] toObject(final boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return zArr.length == 0 ? EMPTY_BOOLEAN_OBJECT_ARRAY : (Boolean[]) setAll(new Boolean[zArr.length], new IntFunction() { // from class: Q7.i
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                return C0708l.n(zArr, i8);
            }
        });
    }

    public static boolean[] toPrimitive(Boolean[] boolArr) {
        return toPrimitive(boolArr, false);
    }

    public static String toString(Object obj) {
        return toString(obj, "{}");
    }

    public static String[] toStringArray(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return EMPTY_STRING_ARRAY;
        }
        String[] strArr = new String[objArr.length];
        for (int i8 = 0; i8 < objArr.length; i8++) {
            strArr[i8] = objArr[i8].toString();
        }
        return strArr;
    }

    public static /* synthetic */ Short u(short[] sArr, int i8) {
        return Short.valueOf(sArr[i8]);
    }

    private static ThreadLocalRandom v() {
        return ThreadLocalRandom.current();
    }

    private static Object w(Object obj, int i8) throws NegativeArraySizeException {
        int length = getLength(obj);
        if (i8 < 0 || i8 >= length) {
            throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: " + length);
        }
        int i9 = length - 1;
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), i9);
        System.arraycopy(obj, 0, objNewInstance, 0, i8);
        if (i8 < i9) {
            System.arraycopy(obj, i8 + 1, objNewInstance, i8, (length - i8) - 1);
        }
        return objNewInstance;
    }

    static Object x(Object obj, BitSet bitSet) throws NegativeArraySizeException {
        if (obj == null) {
            return null;
        }
        int length = getLength(obj);
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length - bitSet.cardinality());
        int iNextClearBit = 0;
        int i8 = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(iNextClearBit);
            if (iNextSetBit == -1) {
                break;
            }
            int i9 = iNextSetBit - iNextClearBit;
            if (i9 > 0) {
                System.arraycopy(obj, iNextClearBit, objNewInstance, i8, i9);
                i8 += i9;
            }
            iNextClearBit = bitSet.nextClearBit(iNextSetBit);
        }
        int i10 = length - iNextClearBit;
        if (i10 > 0) {
            System.arraycopy(obj, iNextClearBit, objNewInstance, i8, i10);
        }
        return objNewInstance;
    }

    static Object y(Object obj, int... iArr) throws NegativeArraySizeException {
        int i8;
        int i9;
        int length = getLength(obj);
        int[] iArrSort = C0697a.sort(clone(iArr));
        if (isNotEmpty(iArrSort)) {
            int length2 = iArrSort.length;
            int i10 = length;
            i8 = 0;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                i9 = iArrSort[length2];
                if (i9 < 0 || i9 >= length) {
                    break;
                }
                if (i9 < i10) {
                    i8++;
                    i10 = i9;
                }
            }
            throw new IndexOutOfBoundsException("Index: " + i9 + ", Length: " + length);
        }
        i8 = 0;
        int i11 = length - i8;
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), i11);
        if (i8 < length) {
            int length3 = iArrSort.length - 1;
            while (length3 >= 0) {
                int i12 = iArrSort[length3];
                int i13 = length - i12;
                if (i13 > 1) {
                    int i14 = i13 - 1;
                    i11 -= i14;
                    System.arraycopy(obj, i12 + 1, objNewInstance, i11, i14);
                }
                length3--;
                length = i12;
            }
            if (length > 0) {
                System.arraycopy(obj, 0, objNewInstance, 0, length);
            }
        }
        return objNewInstance;
    }

    public static byte[] addFirst(byte[] bArr, byte b9) {
        return bArr == null ? add(bArr, b9) : insert(0, bArr, b9);
    }

    public static byte[] clone(byte[] bArr) {
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public static boolean contains(byte[] bArr, byte b9) {
        return indexOf(bArr, b9) != -1;
    }

    public static <T> T get(T[] tArr, int i8, T t8) {
        return isArrayIndexValid(tArr, i8) ? tArr[i8] : t8;
    }

    public static int indexOf(boolean[] zArr, boolean z8, int i8) {
        if (isEmpty(zArr)) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < zArr.length) {
            if (z8 == zArr[i8]) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static BitSet indexesOf(boolean[] zArr, boolean z8, int i8) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (zArr == null) {
            return bitSet;
        }
        while (i8 < zArr.length && (iIndexOf = indexOf(zArr, z8, i8)) != -1) {
            bitSet.set(iIndexOf);
            i8 = iIndexOf + 1;
        }
        return bitSet;
    }

    public static boolean isEmpty(byte[] bArr) {
        return l(bArr);
    }

    public static boolean isNotEmpty(byte[] bArr) {
        return !isEmpty(bArr);
    }

    public static boolean isSameLength(byte[] bArr, byte[] bArr2) {
        return getLength(bArr) == getLength(bArr2);
    }

    public static int lastIndexOf(boolean[] zArr, boolean z8, int i8) {
        if (!isEmpty(zArr) && i8 >= 0) {
            if (i8 >= zArr.length) {
                i8 = zArr.length - 1;
            }
            while (i8 >= 0) {
                if (z8 == zArr[i8]) {
                    return i8;
                }
                i8--;
            }
        }
        return -1;
    }

    public static Boolean[] nullToEmpty(Boolean[] boolArr) {
        return isEmpty(boolArr) ? EMPTY_BOOLEAN_OBJECT_ARRAY : boolArr;
    }

    public static byte[] remove(byte[] bArr, int i8) {
        return (byte[]) w(bArr, i8);
    }

    public static byte[] removeAll(byte[] bArr, int... iArr) {
        return (byte[]) y(bArr, iArr);
    }

    @Deprecated
    public static byte[] removeAllOccurences(byte[] bArr, byte b9) {
        return (byte[]) x(bArr, indexesOf(bArr, b9));
    }

    public static byte[] removeAllOccurrences(byte[] bArr, byte b9) {
        return (byte[]) x(bArr, indexesOf(bArr, b9));
    }

    public static void reverse(boolean[] zArr, int i8, int i9) {
        if (zArr == null) {
            return;
        }
        int iMin = Math.min(zArr.length, i9) - 1;
        for (int iMax = Math.max(i8, 0); iMin > iMax; iMax++) {
            boolean z8 = zArr[iMin];
            zArr[iMin] = zArr[iMax];
            zArr[iMax] = z8;
            iMin--;
        }
    }

    public static <T> T[] setAll(T[] tArr, Supplier<? extends T> supplier) {
        if (tArr != null && supplier != null) {
            for (int i8 = 0; i8 < tArr.length; i8++) {
                tArr[i8] = supplier.get();
            }
        }
        return tArr;
    }

    public static void shift(boolean[] zArr, int i8, int i9, int i10) {
        if (zArr == null || i8 >= zArr.length - 1 || i9 <= 0) {
            return;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 >= zArr.length) {
            i9 = zArr.length;
        }
        int i11 = i9 - i8;
        if (i11 <= 1) {
            return;
        }
        int i12 = i10 % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        while (i11 > 1 && i12 > 0) {
            int i13 = i11 - i12;
            if (i12 > i13) {
                swap(zArr, i8, (i11 + i8) - i13, i13);
                int i14 = i12;
                i12 -= i13;
                i11 = i14;
            } else if (i12 >= i13) {
                swap(zArr, i8, i13 + i8, i12);
                return;
            } else {
                swap(zArr, i8, i8 + i13, i12);
                i8 += i12;
                i11 = i13;
            }
        }
    }

    public static void shuffle(boolean[] zArr, Random random) {
        for (int length = zArr.length; length > 1; length--) {
            swap(zArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static void swap(boolean[] zArr, int i8, int i9, int i10) {
        if (isEmpty(zArr) || i8 >= zArr.length || i9 >= zArr.length) {
            return;
        }
        int i11 = 0;
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int iMin = Math.min(Math.min(i10, zArr.length - i8), zArr.length - i9);
        while (i11 < iMin) {
            boolean z8 = zArr[i8];
            zArr[i8] = zArr[i9];
            zArr[i9] = z8;
            i11++;
            i8++;
            i9++;
        }
    }

    public static boolean[] toPrimitive(Boolean[] boolArr, boolean z8) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return EMPTY_BOOLEAN_ARRAY;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i8 = 0; i8 < boolArr.length; i8++) {
            Boolean bool = boolArr[i8];
            zArr[i8] = bool == null ? z8 : bool.booleanValue();
        }
        return zArr;
    }

    public static String toString(Object obj, String str) {
        return obj == null ? str : new R7.m(obj, R7.o.SIMPLE_STYLE).append(obj).toString();
    }

    @Deprecated
    public static boolean[] add(boolean[] zArr, int i8, boolean z8) {
        return (boolean[]) j(zArr, i8, Boolean.valueOf(z8), Boolean.TYPE);
    }

    public static char[] addFirst(char[] cArr, char c9) {
        return cArr == null ? add(cArr, c9) : insert(0, cArr, c9);
    }

    public static char[] clone(char[] cArr) {
        if (cArr != null) {
            return (char[]) cArr.clone();
        }
        return null;
    }

    public static boolean contains(char[] cArr, char c9) {
        return indexOf(cArr, c9) != -1;
    }

    public static boolean isEmpty(char[] cArr) {
        return l(cArr);
    }

    public static boolean isNotEmpty(char[] cArr) {
        return !isEmpty(cArr);
    }

    public static boolean isSameLength(char[] cArr, char[] cArr2) {
        return getLength(cArr) == getLength(cArr2);
    }

    public static byte[] nullToEmpty(byte[] bArr) {
        return isEmpty(bArr) ? EMPTY_BYTE_ARRAY : bArr;
    }

    public static char[] remove(char[] cArr, int i8) {
        return (char[]) w(cArr, i8);
    }

    public static char[] removeAll(char[] cArr, int... iArr) {
        return (char[]) y(cArr, iArr);
    }

    @Deprecated
    public static char[] removeAllOccurences(char[] cArr, char c9) {
        return (char[]) x(cArr, indexesOf(cArr, c9));
    }

    public static char[] removeAllOccurrences(char[] cArr, char c9) {
        return (char[]) x(cArr, indexesOf(cArr, c9));
    }

    public static byte[] removeElement(byte[] bArr, byte b9) {
        int iIndexOf = indexOf(bArr, b9);
        return iIndexOf == -1 ? clone(bArr) : remove(bArr, iIndexOf);
    }

    public static byte[] add(byte[] bArr, byte b9) {
        byte[] bArr2 = (byte[]) k(bArr, Byte.TYPE);
        bArr2[bArr2.length - 1] = b9;
        return bArr2;
    }

    public static double[] addFirst(double[] dArr, double d9) {
        return dArr == null ? add(dArr, d9) : insert(0, dArr, d9);
    }

    public static double[] clone(double[] dArr) {
        if (dArr != null) {
            return (double[]) dArr.clone();
        }
        return null;
    }

    public static boolean contains(double[] dArr, double d9) {
        return indexOf(dArr, d9) != -1;
    }

    public static boolean isEmpty(double[] dArr) {
        return l(dArr);
    }

    public static boolean isNotEmpty(double[] dArr) {
        return !isEmpty(dArr);
    }

    public static boolean isSameLength(double[] dArr, double[] dArr2) {
        return getLength(dArr) == getLength(dArr2);
    }

    public static Byte[] nullToEmpty(Byte[] bArr) {
        return isEmpty(bArr) ? EMPTY_BYTE_OBJECT_ARRAY : bArr;
    }

    public static double[] remove(double[] dArr, int i8) {
        return (double[]) w(dArr, i8);
    }

    public static double[] removeAll(double[] dArr, int... iArr) {
        return (double[]) y(dArr, iArr);
    }

    @Deprecated
    public static double[] removeAllOccurences(double[] dArr, double d9) {
        return (double[]) x(dArr, indexesOf(dArr, d9));
    }

    public static double[] removeAllOccurrences(double[] dArr, double d9) {
        return (double[]) x(dArr, indexesOf(dArr, d9));
    }

    public static void shuffle(byte[] bArr) {
        shuffle(bArr, (Random) v());
    }

    public static float[] addFirst(float[] fArr, float f8) {
        return fArr == null ? add(fArr, f8) : insert(0, fArr, f8);
    }

    public static float[] clone(float[] fArr) {
        if (fArr != null) {
            return (float[]) fArr.clone();
        }
        return null;
    }

    public static boolean contains(double[] dArr, double d9, double d10) {
        return indexOf(dArr, d9, 0, d10) != -1;
    }

    public static int indexOf(byte[] bArr, byte b9) {
        return indexOf(bArr, b9, 0);
    }

    public static boolean isEmpty(float[] fArr) {
        return l(fArr);
    }

    public static boolean isNotEmpty(float[] fArr) {
        return !isEmpty(fArr);
    }

    public static boolean isSameLength(float[] fArr, float[] fArr2) {
        return getLength(fArr) == getLength(fArr2);
    }

    public static char[] nullToEmpty(char[] cArr) {
        return isEmpty(cArr) ? EMPTY_CHAR_ARRAY : cArr;
    }

    public static float[] remove(float[] fArr, int i8) {
        return (float[]) w(fArr, i8);
    }

    public static float[] removeAll(float[] fArr, int... iArr) {
        return (float[]) y(fArr, iArr);
    }

    @Deprecated
    public static float[] removeAllOccurences(float[] fArr, float f8) {
        return (float[]) x(fArr, indexesOf(fArr, f8));
    }

    public static float[] removeAllOccurrences(float[] fArr, float f8) {
        return (float[]) x(fArr, indexesOf(fArr, f8));
    }

    public static char[] removeElement(char[] cArr, char c9) {
        int iIndexOf = indexOf(cArr, c9);
        return iIndexOf == -1 ? clone(cArr) : remove(cArr, iIndexOf);
    }

    public static void shuffle(byte[] bArr, Random random) {
        for (int length = bArr.length; length > 1; length--) {
            swap(bArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static Byte[] toObject(final byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return EMPTY_BYTE_OBJECT_ARRAY;
        }
        return (Byte[]) setAll(new Byte[bArr.length], new IntFunction() { // from class: Q7.e
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                return C0708l.o(bArr, i8);
            }
        });
    }

    @Deprecated
    public static byte[] add(byte[] bArr, int i8, byte b9) {
        return (byte[]) j(bArr, i8, Byte.valueOf(b9), Byte.TYPE);
    }

    public static byte[] addAll(byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return clone(bArr2);
        }
        if (bArr2 == null) {
            return clone(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static int[] addFirst(int[] iArr, int i8) {
        return iArr == null ? add(iArr, i8) : insert(0, iArr, i8);
    }

    public static int[] clone(int[] iArr) {
        if (iArr != null) {
            return (int[]) iArr.clone();
        }
        return null;
    }

    public static boolean contains(float[] fArr, float f8) {
        return indexOf(fArr, f8) != -1;
    }

    public static int indexOf(byte[] bArr, byte b9, int i8) {
        if (bArr == null) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < bArr.length) {
            if (b9 == bArr[i8]) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static BitSet indexesOf(byte[] bArr, byte b9) {
        return indexesOf(bArr, b9, 0);
    }

    public static boolean isEmpty(int[] iArr) {
        return l(iArr);
    }

    public static boolean isNotEmpty(int[] iArr) {
        return !isEmpty(iArr);
    }

    public static boolean isSameLength(int[] iArr, int[] iArr2) {
        return getLength(iArr) == getLength(iArr2);
    }

    public static boolean isSorted(byte[] bArr) {
        if (getLength(bArr) < 2) {
            return true;
        }
        byte b9 = bArr[0];
        int length = bArr.length;
        int i8 = 1;
        while (i8 < length) {
            byte b10 = bArr[i8];
            if (U7.a.compare(b9, b10) > 0) {
                return false;
            }
            i8++;
            b9 = b10;
        }
        return true;
    }

    public static int lastIndexOf(byte[] bArr, byte b9) {
        return lastIndexOf(bArr, b9, Integer.MAX_VALUE);
    }

    public static Character[] nullToEmpty(Character[] chArr) {
        return isEmpty(chArr) ? EMPTY_CHARACTER_OBJECT_ARRAY : chArr;
    }

    public static int[] remove(int[] iArr, int i8) {
        return (int[]) w(iArr, i8);
    }

    public static int[] removeAll(int[] iArr, int... iArr2) {
        return (int[]) y(iArr, iArr2);
    }

    @Deprecated
    public static int[] removeAllOccurences(int[] iArr, int i8) {
        return (int[]) x(iArr, indexesOf(iArr, i8));
    }

    public static int[] removeAllOccurrences(int[] iArr, int i8) {
        return (int[]) x(iArr, indexesOf(iArr, i8));
    }

    public static byte[] subarray(byte[] bArr, int i8, int i9) {
        if (bArr == null) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 > bArr.length) {
            i9 = bArr.length;
        }
        int i10 = i9 - i8;
        if (i10 <= 0) {
            return EMPTY_BYTE_ARRAY;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i8, bArr2, 0, i10);
        return bArr2;
    }

    public static String[] toStringArray(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return EMPTY_STRING_ARRAY;
        }
        String[] strArr = new String[objArr.length];
        for (int i8 = 0; i8 < objArr.length; i8++) {
            strArr[i8] = Objects.toString(objArr[i8], str);
        }
        return strArr;
    }

    public static char[] add(char[] cArr, char c9) {
        char[] cArr2 = (char[]) k(cArr, Character.TYPE);
        cArr2[cArr2.length - 1] = c9;
        return cArr2;
    }

    public static long[] addFirst(long[] jArr, long j8) {
        return jArr == null ? add(jArr, j8) : insert(0, jArr, j8);
    }

    public static long[] clone(long[] jArr) {
        if (jArr != null) {
            return (long[]) jArr.clone();
        }
        return null;
    }

    public static boolean contains(int[] iArr, int i8) {
        return indexOf(iArr, i8) != -1;
    }

    public static BitSet indexesOf(byte[] bArr, byte b9, int i8) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (bArr == null) {
            return bitSet;
        }
        while (i8 < bArr.length && (iIndexOf = indexOf(bArr, b9, i8)) != -1) {
            bitSet.set(iIndexOf);
            i8 = iIndexOf + 1;
        }
        return bitSet;
    }

    public static boolean isEmpty(long[] jArr) {
        return l(jArr);
    }

    public static boolean isNotEmpty(long[] jArr) {
        return !isEmpty(jArr);
    }

    public static boolean isSameLength(long[] jArr, long[] jArr2) {
        return getLength(jArr) == getLength(jArr2);
    }

    public static int lastIndexOf(byte[] bArr, byte b9, int i8) {
        if (bArr != null && i8 >= 0) {
            if (i8 >= bArr.length) {
                i8 = bArr.length - 1;
            }
            while (i8 >= 0) {
                if (b9 == bArr[i8]) {
                    return i8;
                }
                i8--;
            }
        }
        return -1;
    }

    public static Class<?>[] nullToEmpty(Class<?>[] clsArr) {
        return isEmpty(clsArr) ? EMPTY_CLASS_ARRAY : clsArr;
    }

    public static long[] remove(long[] jArr, int i8) {
        return (long[]) w(jArr, i8);
    }

    public static long[] removeAll(long[] jArr, int... iArr) {
        return (long[]) y(jArr, iArr);
    }

    @Deprecated
    public static long[] removeAllOccurences(long[] jArr, long j8) {
        return (long[]) x(jArr, indexesOf(jArr, j8));
    }

    public static long[] removeAllOccurrences(long[] jArr, long j8) {
        return (long[]) x(jArr, indexesOf(jArr, j8));
    }

    public static double[] removeElement(double[] dArr, double d9) {
        int iIndexOf = indexOf(dArr, d9);
        return iIndexOf == -1 ? clone(dArr) : remove(dArr, iIndexOf);
    }

    public static void reverse(byte[] bArr) {
        if (bArr != null) {
            reverse(bArr, 0, bArr.length);
        }
    }

    public static void shuffle(char[] cArr) {
        shuffle(cArr, (Random) v());
    }

    public static void swap(byte[] bArr, int i8, int i9) {
        swap(bArr, i8, i9, 1);
    }

    public static short[] addFirst(short[] sArr, short s8) {
        return sArr == null ? add(sArr, s8) : insert(0, sArr, s8);
    }

    public static short[] clone(short[] sArr) {
        if (sArr != null) {
            return (short[]) sArr.clone();
        }
        return null;
    }

    public static boolean contains(long[] jArr, long j8) {
        return indexOf(jArr, j8) != -1;
    }

    public static int indexOf(char[] cArr, char c9) {
        return indexOf(cArr, c9, 0);
    }

    public static boolean isEmpty(Object[] objArr) {
        return l(objArr);
    }

    public static boolean isNotEmpty(short[] sArr) {
        return !isEmpty(sArr);
    }

    public static boolean isSameLength(Object obj, Object obj2) {
        return getLength(obj) == getLength(obj2);
    }

    public static double[] nullToEmpty(double[] dArr) {
        return isEmpty(dArr) ? EMPTY_DOUBLE_ARRAY : dArr;
    }

    public static short[] remove(short[] sArr, int i8) {
        return (short[]) w(sArr, i8);
    }

    public static short[] removeAll(short[] sArr, int... iArr) {
        return (short[]) y(sArr, iArr);
    }

    @Deprecated
    public static short[] removeAllOccurences(short[] sArr, short s8) {
        return (short[]) x(sArr, indexesOf(sArr, s8));
    }

    public static short[] removeAllOccurrences(short[] sArr, short s8) {
        return (short[]) x(sArr, indexesOf(sArr, s8));
    }

    public static void reverse(byte[] bArr, int i8, int i9) {
        if (bArr == null) {
            return;
        }
        int iMin = Math.min(bArr.length, i9) - 1;
        for (int iMax = Math.max(i8, 0); iMin > iMax; iMax++) {
            byte b9 = bArr[iMin];
            bArr[iMin] = bArr[iMax];
            bArr[iMax] = b9;
            iMin--;
        }
    }

    public static void shuffle(char[] cArr, Random random) {
        for (int length = cArr.length; length > 1; length--) {
            swap(cArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static void swap(byte[] bArr, int i8, int i9, int i10) {
        if (isEmpty(bArr) || i8 >= bArr.length || i9 >= bArr.length) {
            return;
        }
        int i11 = 0;
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int iMin = Math.min(Math.min(i10, bArr.length - i8), bArr.length - i9);
        while (i11 < iMin) {
            byte b9 = bArr[i8];
            bArr[i8] = bArr[i9];
            bArr[i9] = b9;
            i11++;
            i8++;
            i9++;
        }
    }

    public static Character[] toObject(final char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return EMPTY_CHARACTER_OBJECT_ARRAY;
        }
        return (Character[]) setAll(new Character[cArr.length], new IntFunction() { // from class: Q7.g
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                return C0708l.p(cArr, i8);
            }
        });
    }

    public static byte[] toPrimitive(Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            bArr2[i8] = bArr[i8].byteValue();
        }
        return bArr2;
    }

    @Deprecated
    public static char[] add(char[] cArr, int i8, char c9) {
        return (char[]) j(cArr, i8, Character.valueOf(c9), Character.TYPE);
    }

    public static <T> T[] addFirst(T[] tArr, T t8) {
        return tArr == null ? (T[]) add(tArr, t8) : (T[]) insert(0, tArr, t8);
    }

    public static <T> T[] clone(T[] tArr) {
        if (tArr != null) {
            return (T[]) ((Object[]) tArr.clone());
        }
        return null;
    }

    public static boolean contains(Object[] objArr, Object obj) {
        return indexOf(objArr, obj) != -1;
    }

    public static int indexOf(char[] cArr, char c9, int i8) {
        if (cArr == null) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < cArr.length) {
            if (c9 == cArr[i8]) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static boolean isEmpty(short[] sArr) {
        return l(sArr);
    }

    public static <T> boolean isNotEmpty(T[] tArr) {
        return !isEmpty(tArr);
    }

    public static boolean isSameLength(Object[] objArr, Object[] objArr2) {
        return getLength(objArr) == getLength(objArr2);
    }

    public static Double[] nullToEmpty(Double[] dArr) {
        return isEmpty(dArr) ? EMPTY_DOUBLE_OBJECT_ARRAY : dArr;
    }

    public static <T> T[] remove(T[] tArr, int i8) {
        return (T[]) ((Object[]) w(tArr, i8));
    }

    public static <T> T[] removeAll(T[] tArr, int... iArr) {
        return (T[]) ((Object[]) y(tArr, iArr));
    }

    @Deprecated
    public static <T> T[] removeAllOccurences(T[] tArr, T t8) {
        return (T[]) ((Object[]) x(tArr, indexesOf(tArr, t8)));
    }

    public static <T> T[] removeAllOccurrences(T[] tArr, T t8) {
        return (T[]) ((Object[]) x(tArr, indexesOf(tArr, t8)));
    }

    public static float[] removeElement(float[] fArr, float f8) {
        int iIndexOf = indexOf(fArr, f8);
        return iIndexOf == -1 ? clone(fArr) : remove(fArr, iIndexOf);
    }

    public static void shift(byte[] bArr, int i8) {
        if (bArr != null) {
            shift(bArr, 0, bArr.length, i8);
        }
    }

    public static double[] add(double[] dArr, double d9) {
        double[] dArr2 = (double[]) k(dArr, Double.TYPE);
        dArr2[dArr2.length - 1] = d9;
        return dArr2;
    }

    public static boolean contains(short[] sArr, short s8) {
        return indexOf(sArr, s8) != -1;
    }

    public static byte[] insert(int i8, byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return null;
        }
        if (isEmpty(bArr2)) {
            return clone(bArr);
        }
        if (i8 >= 0 && i8 <= bArr.length) {
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, i8, bArr2.length);
            if (i8 > 0) {
                System.arraycopy(bArr, 0, bArr3, 0, i8);
            }
            if (i8 < bArr.length) {
                System.arraycopy(bArr, i8, bArr3, bArr2.length + i8, bArr.length - i8);
            }
            return bArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: " + bArr.length);
    }

    public static boolean isSameLength(short[] sArr, short[] sArr2) {
        return getLength(sArr) == getLength(sArr2);
    }

    public static int lastIndexOf(char[] cArr, char c9) {
        return lastIndexOf(cArr, c9, Integer.MAX_VALUE);
    }

    public static float[] nullToEmpty(float[] fArr) {
        return isEmpty(fArr) ? EMPTY_FLOAT_ARRAY : fArr;
    }

    public static void shift(byte[] bArr, int i8, int i9, int i10) {
        if (bArr == null || i8 >= bArr.length - 1 || i9 <= 0) {
            return;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 >= bArr.length) {
            i9 = bArr.length;
        }
        int i11 = i9 - i8;
        if (i11 <= 1) {
            return;
        }
        int i12 = i10 % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        while (i11 > 1 && i12 > 0) {
            int i13 = i11 - i12;
            if (i12 > i13) {
                swap(bArr, i8, (i11 + i8) - i13, i13);
                int i14 = i12;
                i12 -= i13;
                i11 = i14;
            } else if (i12 < i13) {
                swap(bArr, i8, i8 + i13, i12);
                i8 += i12;
                i11 = i13;
            } else {
                swap(bArr, i8, i13 + i8, i12);
                return;
            }
        }
    }

    public static void shuffle(double[] dArr) {
        shuffle(dArr, v());
    }

    public static char[] addAll(char[] cArr, char... cArr2) {
        if (cArr == null) {
            return clone(cArr2);
        }
        if (cArr2 == null) {
            return clone(cArr);
        }
        char[] cArr3 = new char[cArr.length + cArr2.length];
        System.arraycopy(cArr, 0, cArr3, 0, cArr.length);
        System.arraycopy(cArr2, 0, cArr3, cArr.length, cArr2.length);
        return cArr3;
    }

    public static int indexOf(double[] dArr, double d9) {
        return indexOf(dArr, d9, 0);
    }

    public static BitSet indexesOf(char[] cArr, char c9) {
        return indexesOf(cArr, c9, 0);
    }

    public static boolean isSorted(char[] cArr) {
        if (getLength(cArr) < 2) {
            return true;
        }
        char c9 = cArr[0];
        int length = cArr.length;
        int i8 = 1;
        while (i8 < length) {
            char c10 = cArr[i8];
            if (C0712p.compare(c9, c10) > 0) {
                return false;
            }
            i8++;
            c9 = c10;
        }
        return true;
    }

    public static int lastIndexOf(char[] cArr, char c9, int i8) {
        if (cArr != null && i8 >= 0) {
            if (i8 >= cArr.length) {
                i8 = cArr.length - 1;
            }
            while (i8 >= 0) {
                if (c9 == cArr[i8]) {
                    return i8;
                }
                i8--;
            }
        }
        return -1;
    }

    public static Float[] nullToEmpty(Float[] fArr) {
        return isEmpty(fArr) ? EMPTY_FLOAT_OBJECT_ARRAY : fArr;
    }

    public static int[] removeElement(int[] iArr, int i8) {
        int iIndexOf = indexOf(iArr, i8);
        return iIndexOf == -1 ? clone(iArr) : remove(iArr, iIndexOf);
    }

    public static void shuffle(double[] dArr, Random random) {
        for (int length = dArr.length; length > 1; length--) {
            swap(dArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static char[] subarray(char[] cArr, int i8, int i9) {
        if (cArr == null) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 > cArr.length) {
            i9 = cArr.length;
        }
        int i10 = i9 - i8;
        if (i10 <= 0) {
            return EMPTY_CHAR_ARRAY;
        }
        char[] cArr2 = new char[i10];
        System.arraycopy(cArr, i8, cArr2, 0, i10);
        return cArr2;
    }

    public static Double[] toObject(final double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return EMPTY_DOUBLE_OBJECT_ARRAY;
        }
        return (Double[]) setAll(new Double[dArr.length], new IntFunction() { // from class: Q7.j
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                return C0708l.q(dArr, i8);
            }
        });
    }

    @Deprecated
    public static double[] add(double[] dArr, int i8, double d9) {
        return (double[]) j(dArr, i8, Double.valueOf(d9), Double.TYPE);
    }

    public static int indexOf(double[] dArr, double d9, double d10) {
        return indexOf(dArr, d9, 0, d10);
    }

    public static BitSet indexesOf(char[] cArr, char c9, int i8) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (cArr == null) {
            return bitSet;
        }
        while (i8 < cArr.length && (iIndexOf = indexOf(cArr, c9, i8)) != -1) {
            bitSet.set(iIndexOf);
            i8 = iIndexOf + 1;
        }
        return bitSet;
    }

    public static int[] nullToEmpty(int[] iArr) {
        return isEmpty(iArr) ? EMPTY_INT_ARRAY : iArr;
    }

    public static float[] add(float[] fArr, float f8) {
        float[] fArr2 = (float[]) k(fArr, Float.TYPE);
        fArr2[fArr2.length - 1] = f8;
        return fArr2;
    }

    public static int indexOf(double[] dArr, double d9, int i8) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        boolean zIsNaN = Double.isNaN(d9);
        while (i8 < dArr.length) {
            double d10 = dArr[i8];
            if (d9 == d10 || (zIsNaN && Double.isNaN(d10))) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static Integer[] nullToEmpty(Integer[] numArr) {
        return isEmpty(numArr) ? EMPTY_INTEGER_OBJECT_ARRAY : numArr;
    }

    public static long[] removeElement(long[] jArr, long j8) {
        int iIndexOf = indexOf(jArr, j8);
        return iIndexOf == -1 ? clone(jArr) : remove(jArr, iIndexOf);
    }

    public static void reverse(char[] cArr) {
        if (cArr != null) {
            reverse(cArr, 0, cArr.length);
        }
    }

    public static void shuffle(float[] fArr) {
        shuffle(fArr, (Random) v());
    }

    public static void swap(char[] cArr, int i8, int i9) {
        swap(cArr, i8, i9, 1);
    }

    public static byte[] toPrimitive(Byte[] bArr, byte b9) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            Byte b10 = bArr[i8];
            bArr2[i8] = b10 == null ? b9 : b10.byteValue();
        }
        return bArr2;
    }

    public static int lastIndexOf(double[] dArr, double d9) {
        return lastIndexOf(dArr, d9, Integer.MAX_VALUE);
    }

    public static long[] nullToEmpty(long[] jArr) {
        return isEmpty(jArr) ? EMPTY_LONG_ARRAY : jArr;
    }

    public static void reverse(char[] cArr, int i8, int i9) {
        if (cArr == null) {
            return;
        }
        int iMin = Math.min(cArr.length, i9) - 1;
        for (int iMax = Math.max(i8, 0); iMin > iMax; iMax++) {
            char c9 = cArr[iMin];
            cArr[iMin] = cArr[iMax];
            cArr[iMax] = c9;
            iMin--;
        }
    }

    public static void shuffle(float[] fArr, Random random) {
        for (int length = fArr.length; length > 1; length--) {
            swap(fArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static void swap(char[] cArr, int i8, int i9, int i10) {
        if (isEmpty(cArr) || i8 >= cArr.length || i9 >= cArr.length) {
            return;
        }
        int i11 = 0;
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int iMin = Math.min(Math.min(i10, cArr.length - i8), cArr.length - i9);
        while (i11 < iMin) {
            char c9 = cArr[i8];
            cArr[i8] = cArr[i9];
            cArr[i9] = c9;
            i11++;
            i8++;
            i9++;
        }
    }

    public static Float[] toObject(final float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return EMPTY_FLOAT_OBJECT_ARRAY;
        }
        return (Float[]) setAll(new Float[fArr.length], new IntFunction() { // from class: Q7.f
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                return C0708l.r(fArr, i8);
            }
        });
    }

    @Deprecated
    public static float[] add(float[] fArr, int i8, float f8) {
        return (float[]) j(fArr, i8, Float.valueOf(f8), Float.TYPE);
    }

    public static int lastIndexOf(double[] dArr, double d9, double d10) {
        return lastIndexOf(dArr, d9, Integer.MAX_VALUE, d10);
    }

    public static Long[] nullToEmpty(Long[] lArr) {
        return isEmpty(lArr) ? EMPTY_LONG_OBJECT_ARRAY : lArr;
    }

    public static short[] removeElement(short[] sArr, short s8) {
        int iIndexOf = indexOf(sArr, s8);
        return iIndexOf == -1 ? clone(sArr) : remove(sArr, iIndexOf);
    }

    public static int[] add(int[] iArr, int i8) {
        int[] iArr2 = (int[]) k(iArr, Integer.TYPE);
        iArr2[iArr2.length - 1] = i8;
        return iArr2;
    }

    public static double[] addAll(double[] dArr, double... dArr2) {
        if (dArr == null) {
            return clone(dArr2);
        }
        if (dArr2 == null) {
            return clone(dArr);
        }
        double[] dArr3 = new double[dArr.length + dArr2.length];
        System.arraycopy(dArr, 0, dArr3, 0, dArr.length);
        System.arraycopy(dArr2, 0, dArr3, dArr.length, dArr2.length);
        return dArr3;
    }

    public static BitSet indexesOf(double[] dArr, double d9) {
        return indexesOf(dArr, d9, 0);
    }

    public static boolean isSorted(double[] dArr) {
        if (getLength(dArr) < 2) {
            return true;
        }
        double d9 = dArr[0];
        int length = dArr.length;
        int i8 = 1;
        while (i8 < length) {
            double d10 = dArr[i8];
            if (Double.compare(d9, d10) > 0) {
                return false;
            }
            i8++;
            d9 = d10;
        }
        return true;
    }

    public static int lastIndexOf(double[] dArr, double d9, int i8) {
        if (!isEmpty(dArr) && i8 >= 0) {
            if (i8 >= dArr.length) {
                i8 = dArr.length - 1;
            }
            while (i8 >= 0) {
                if (d9 == dArr[i8]) {
                    return i8;
                }
                i8--;
            }
        }
        return -1;
    }

    public static Object[] nullToEmpty(Object[] objArr) {
        return isEmpty(objArr) ? EMPTY_OBJECT_ARRAY : objArr;
    }

    public static void shuffle(int[] iArr) {
        shuffle(iArr, (Random) v());
    }

    public static double[] subarray(double[] dArr, int i8, int i9) {
        if (dArr == null) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 > dArr.length) {
            i9 = dArr.length;
        }
        int i10 = i9 - i8;
        if (i10 <= 0) {
            return EMPTY_DOUBLE_ARRAY;
        }
        double[] dArr2 = new double[i10];
        System.arraycopy(dArr, i8, dArr2, 0, i10);
        return dArr2;
    }

    public static BitSet indexesOf(double[] dArr, double d9, double d10) {
        return indexesOf(dArr, d9, 0, d10);
    }

    public static short[] nullToEmpty(short[] sArr) {
        return isEmpty(sArr) ? EMPTY_SHORT_ARRAY : sArr;
    }

    public static <T> T[] removeElement(T[] tArr, Object obj) {
        int iIndexOf = indexOf(tArr, obj);
        return iIndexOf == -1 ? (T[]) clone(tArr) : (T[]) remove(tArr, iIndexOf);
    }

    public static byte[] removeElements(byte[] bArr, byte... bArr2) {
        if (!isEmpty(bArr) && !isEmpty(bArr2)) {
            HashMap map = new HashMap(bArr2.length);
            for (byte b9 : bArr2) {
                Byte bValueOf = Byte.valueOf(b9);
                V7.b bVar = (V7.b) map.get(bValueOf);
                if (bVar == null) {
                    map.put(bValueOf, new V7.b(1));
                } else {
                    bVar.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i8 = 0; i8 < bArr.length; i8++) {
                byte b10 = bArr[i8];
                V7.b bVar2 = (V7.b) map.get(Byte.valueOf(b10));
                if (bVar2 != null) {
                    if (bVar2.decrementAndGet() == 0) {
                        map.remove(Byte.valueOf(b10));
                    }
                    bitSet.set(i8);
                }
            }
            return (byte[]) x(bArr, bitSet);
        }
        return clone(bArr);
    }

    public static void shift(char[] cArr, int i8) {
        if (cArr != null) {
            shift(cArr, 0, cArr.length, i8);
        }
    }

    public static void shuffle(int[] iArr, Random random) {
        for (int length = iArr.length; length > 1; length--) {
            swap(iArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static Integer[] toObject(final int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return EMPTY_INTEGER_OBJECT_ARRAY;
        }
        return (Integer[]) setAll(new Integer[iArr.length], new IntFunction() { // from class: Q7.h
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                return C0708l.s(iArr, i8);
            }
        });
    }

    @Deprecated
    public static int[] add(int[] iArr, int i8, int i9) {
        return (int[]) j(iArr, i8, Integer.valueOf(i9), Integer.TYPE);
    }

    public static int indexOf(double[] dArr, double d9, int i8, double d10) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        double d11 = d9 - d10;
        double d12 = d9 + d10;
        while (i8 < dArr.length) {
            double d13 = dArr[i8];
            if (d13 >= d11 && d13 <= d12) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static BitSet indexesOf(double[] dArr, double d9, int i8) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (dArr == null) {
            return bitSet;
        }
        while (i8 < dArr.length && (iIndexOf = indexOf(dArr, d9, i8)) != -1) {
            bitSet.set(iIndexOf);
            i8 = iIndexOf + 1;
        }
        return bitSet;
    }

    public static Short[] nullToEmpty(Short[] shArr) {
        return isEmpty(shArr) ? EMPTY_SHORT_OBJECT_ARRAY : shArr;
    }

    public static void shift(char[] cArr, int i8, int i9, int i10) {
        if (cArr == null || i8 >= cArr.length - 1 || i9 <= 0) {
            return;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 >= cArr.length) {
            i9 = cArr.length;
        }
        int i11 = i9 - i8;
        if (i11 <= 1) {
            return;
        }
        int i12 = i10 % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        while (i11 > 1 && i12 > 0) {
            int i13 = i11 - i12;
            if (i12 > i13) {
                swap(cArr, i8, (i11 + i8) - i13, i13);
                int i14 = i12;
                i12 -= i13;
                i11 = i14;
            } else if (i12 < i13) {
                swap(cArr, i8, i8 + i13, i12);
                i8 += i12;
                i11 = i13;
            } else {
                swap(cArr, i8, i13 + i8, i12);
                return;
            }
        }
    }

    @Deprecated
    public static long[] add(long[] jArr, int i8, long j8) {
        return (long[]) j(jArr, i8, Long.valueOf(j8), Long.TYPE);
    }

    public static char[] insert(int i8, char[] cArr, char... cArr2) {
        if (cArr == null) {
            return null;
        }
        if (isEmpty(cArr2)) {
            return clone(cArr);
        }
        if (i8 >= 0 && i8 <= cArr.length) {
            char[] cArr3 = new char[cArr.length + cArr2.length];
            System.arraycopy(cArr2, 0, cArr3, i8, cArr2.length);
            if (i8 > 0) {
                System.arraycopy(cArr, 0, cArr3, 0, i8);
            }
            if (i8 < cArr.length) {
                System.arraycopy(cArr, i8, cArr3, cArr2.length + i8, cArr.length - i8);
            }
            return cArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: " + cArr.length);
    }

    public static String[] nullToEmpty(String[] strArr) {
        return isEmpty(strArr) ? EMPTY_STRING_ARRAY : strArr;
    }

    public static void reverse(double[] dArr) {
        if (dArr != null) {
            reverse(dArr, 0, dArr.length);
        }
    }

    public static void shuffle(long[] jArr) {
        shuffle(jArr, (Random) v());
    }

    public static void swap(double[] dArr, int i8, int i9) {
        swap(dArr, i8, i9, 1);
    }

    public static char[] toPrimitive(Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return EMPTY_CHAR_ARRAY;
        }
        char[] cArr = new char[chArr.length];
        for (int i8 = 0; i8 < chArr.length; i8++) {
            cArr[i8] = chArr[i8].charValue();
        }
        return cArr;
    }

    public static long[] add(long[] jArr, long j8) {
        long[] jArr2 = (long[]) k(jArr, Long.TYPE);
        jArr2[jArr2.length - 1] = j8;
        return jArr2;
    }

    public static int lastIndexOf(double[] dArr, double d9, int i8, double d10) {
        if (!isEmpty(dArr) && i8 >= 0) {
            if (i8 >= dArr.length) {
                i8 = dArr.length - 1;
            }
            double d11 = d9 - d10;
            double d12 = d9 + d10;
            while (i8 >= 0) {
                double d13 = dArr[i8];
                if (d13 >= d11 && d13 <= d12) {
                    return i8;
                }
                i8--;
            }
        }
        return -1;
    }

    public static <T> T[] nullToEmpty(T[] tArr, Class<T[]> cls) {
        if (cls != null) {
            return tArr == null ? cls.cast(Array.newInstance(cls.getComponentType(), 0)) : tArr;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    public static void reverse(double[] dArr, int i8, int i9) {
        if (dArr == null) {
            return;
        }
        int iMin = Math.min(dArr.length, i9) - 1;
        for (int iMax = Math.max(i8, 0); iMin > iMax; iMax++) {
            double d9 = dArr[iMin];
            dArr[iMin] = dArr[iMax];
            dArr[iMax] = d9;
            iMin--;
        }
    }

    public static void shuffle(long[] jArr, Random random) {
        for (int length = jArr.length; length > 1; length--) {
            swap(jArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static void swap(double[] dArr, int i8, int i9, int i10) {
        if (isEmpty(dArr) || i8 >= dArr.length || i9 >= dArr.length) {
            return;
        }
        int i11 = 0;
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int iMin = Math.min(Math.min(i10, dArr.length - i8), dArr.length - i9);
        while (i11 < iMin) {
            double d9 = dArr[i8];
            dArr[i8] = dArr[i9];
            dArr[i9] = d9;
            i11++;
            i8++;
            i9++;
        }
    }

    public static Long[] toObject(final long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return EMPTY_LONG_OBJECT_ARRAY;
        }
        return (Long[]) setAll(new Long[jArr.length], new IntFunction() { // from class: Q7.c
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                return C0708l.t(jArr, i8);
            }
        });
    }

    public static float[] addAll(float[] fArr, float... fArr2) {
        if (fArr == null) {
            return clone(fArr2);
        }
        if (fArr2 == null) {
            return clone(fArr);
        }
        float[] fArr3 = new float[fArr.length + fArr2.length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        return fArr3;
    }

    public static int indexOf(float[] fArr, float f8) {
        return indexOf(fArr, f8, 0);
    }

    public static boolean isSorted(float[] fArr) {
        if (getLength(fArr) < 2) {
            return true;
        }
        float f8 = fArr[0];
        int length = fArr.length;
        int i8 = 1;
        while (i8 < length) {
            float f9 = fArr[i8];
            if (Float.compare(f8, f9) > 0) {
                return false;
            }
            i8++;
            f8 = f9;
        }
        return true;
    }

    public static float[] subarray(float[] fArr, int i8, int i9) {
        if (fArr == null) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 > fArr.length) {
            i9 = fArr.length;
        }
        int i10 = i9 - i8;
        if (i10 <= 0) {
            return EMPTY_FLOAT_ARRAY;
        }
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, i8, fArr2, 0, i10);
        return fArr2;
    }

    @Deprecated
    public static short[] add(short[] sArr, int i8, short s8) {
        return (short[]) j(sArr, i8, Short.valueOf(s8), Short.TYPE);
    }

    public static int indexOf(float[] fArr, float f8, int i8) {
        if (isEmpty(fArr)) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        boolean zIsNaN = Float.isNaN(f8);
        while (i8 < fArr.length) {
            float f9 = fArr[i8];
            if (f8 == f9 || (zIsNaN && Float.isNaN(f9))) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static BitSet indexesOf(double[] dArr, double d9, int i8, double d10) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (dArr == null) {
            return bitSet;
        }
        int i9 = i8;
        while (i9 < dArr.length && (iIndexOf = indexOf(dArr, d9, i9, d10)) != -1) {
            bitSet.set(iIndexOf);
            i9 = iIndexOf + 1;
        }
        return bitSet;
    }

    public static void shuffle(Object[] objArr) {
        shuffle(objArr, v());
    }

    public static short[] add(short[] sArr, short s8) {
        short[] sArr2 = (short[]) k(sArr, Short.TYPE);
        sArr2[sArr2.length - 1] = s8;
        return sArr2;
    }

    public static void shuffle(Object[] objArr, Random random) {
        for (int length = objArr.length; length > 1; length--) {
            swap(objArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static Short[] toObject(final short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return EMPTY_SHORT_OBJECT_ARRAY;
        }
        return (Short[]) setAll(new Short[sArr.length], new IntFunction() { // from class: Q7.d
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                return C0708l.u(sArr, i8);
            }
        });
    }

    public static int lastIndexOf(float[] fArr, float f8) {
        return lastIndexOf(fArr, f8, Integer.MAX_VALUE);
    }

    public static char[] toPrimitive(Character[] chArr, char c9) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return EMPTY_CHAR_ARRAY;
        }
        char[] cArr = new char[chArr.length];
        for (int i8 = 0; i8 < chArr.length; i8++) {
            Character ch = chArr[i8];
            cArr[i8] = ch == null ? c9 : ch.charValue();
        }
        return cArr;
    }

    @Deprecated
    public static <T> T[] add(T[] tArr, int i8, T t8) {
        Class componentType;
        if (tArr != null) {
            componentType = getComponentType(tArr);
        } else if (t8 != null) {
            componentType = O.getClass(t8);
        } else {
            throw new IllegalArgumentException("Array and element cannot both be null");
        }
        return (T[]) ((Object[]) j(tArr, i8, t8, componentType));
    }

    public static int lastIndexOf(float[] fArr, float f8, int i8) {
        if (!isEmpty(fArr) && i8 >= 0) {
            if (i8 >= fArr.length) {
                i8 = fArr.length - 1;
            }
            while (i8 >= 0) {
                if (f8 == fArr[i8]) {
                    return i8;
                }
                i8--;
            }
        }
        return -1;
    }

    public static void reverse(float[] fArr) {
        if (fArr != null) {
            reverse(fArr, 0, fArr.length);
        }
    }

    public static void shift(double[] dArr, int i8) {
        if (dArr != null) {
            shift(dArr, 0, dArr.length, i8);
        }
    }

    public static void shuffle(short[] sArr) {
        shuffle(sArr, (Random) v());
    }

    public static void swap(float[] fArr, int i8, int i9) {
        swap(fArr, i8, i9, 1);
    }

    public static int[] addAll(int[] iArr, int... iArr2) {
        if (iArr == null) {
            return clone(iArr2);
        }
        if (iArr2 == null) {
            return clone(iArr);
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    public static BitSet indexesOf(float[] fArr, float f8) {
        return indexesOf(fArr, f8, 0);
    }

    public static boolean isSorted(int[] iArr) {
        if (getLength(iArr) < 2) {
            return true;
        }
        int i8 = iArr[0];
        int length = iArr.length;
        int i9 = 1;
        while (i9 < length) {
            int i10 = iArr[i9];
            if (U7.a.compare(i8, i10) > 0) {
                return false;
            }
            i9++;
            i8 = i10;
        }
        return true;
    }

    public static void reverse(float[] fArr, int i8, int i9) {
        if (fArr == null) {
            return;
        }
        int iMin = Math.min(fArr.length, i9) - 1;
        for (int iMax = Math.max(i8, 0); iMin > iMax; iMax++) {
            float f8 = fArr[iMin];
            fArr[iMin] = fArr[iMax];
            fArr[iMax] = f8;
            iMin--;
        }
    }

    public static void shift(double[] dArr, int i8, int i9, int i10) {
        if (dArr == null || i8 >= dArr.length - 1 || i9 <= 0) {
            return;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 >= dArr.length) {
            i9 = dArr.length;
        }
        int i11 = i9 - i8;
        if (i11 <= 1) {
            return;
        }
        int i12 = i10 % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        while (i11 > 1 && i12 > 0) {
            int i13 = i11 - i12;
            if (i12 > i13) {
                swap(dArr, i8, (i11 + i8) - i13, i13);
                int i14 = i12;
                i12 -= i13;
                i11 = i14;
            } else if (i12 < i13) {
                swap(dArr, i8, i8 + i13, i12);
                i8 += i12;
                i11 = i13;
            } else {
                swap(dArr, i8, i13 + i8, i12);
                return;
            }
        }
    }

    public static void shuffle(short[] sArr, Random random) {
        for (int length = sArr.length; length > 1; length--) {
            swap(sArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static int[] subarray(int[] iArr, int i8, int i9) {
        if (iArr == null) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 > iArr.length) {
            i9 = iArr.length;
        }
        int i10 = i9 - i8;
        if (i10 <= 0) {
            return EMPTY_INT_ARRAY;
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, i8, iArr2, 0, i10);
        return iArr2;
    }

    public static void swap(float[] fArr, int i8, int i9, int i10) {
        if (isEmpty(fArr) || i8 >= fArr.length || i9 >= fArr.length) {
            return;
        }
        int i11 = 0;
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int iMin = Math.min(Math.min(i10, fArr.length - i8), fArr.length - i9);
        while (i11 < iMin) {
            float f8 = fArr[i8];
            fArr[i8] = fArr[i9];
            fArr[i9] = f8;
            i11++;
            i8++;
            i9++;
        }
    }

    public static int indexOf(int[] iArr, int i8) {
        return indexOf(iArr, i8, 0);
    }

    public static BitSet indexesOf(float[] fArr, float f8, int i8) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (fArr == null) {
            return bitSet;
        }
        while (i8 < fArr.length && (iIndexOf = indexOf(fArr, f8, i8)) != -1) {
            bitSet.set(iIndexOf);
            i8 = iIndexOf + 1;
        }
        return bitSet;
    }

    public static int indexOf(int[] iArr, int i8, int i9) {
        if (iArr == null) {
            return -1;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < iArr.length) {
            if (i8 == iArr[i9]) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static double[] insert(int i8, double[] dArr, double... dArr2) {
        if (dArr == null) {
            return null;
        }
        if (isEmpty(dArr2)) {
            return clone(dArr);
        }
        if (i8 >= 0 && i8 <= dArr.length) {
            double[] dArr3 = new double[dArr.length + dArr2.length];
            System.arraycopy(dArr2, 0, dArr3, i8, dArr2.length);
            if (i8 > 0) {
                System.arraycopy(dArr, 0, dArr3, 0, i8);
            }
            if (i8 < dArr.length) {
                System.arraycopy(dArr, i8, dArr3, dArr2.length + i8, dArr.length - i8);
            }
            return dArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: " + dArr.length);
    }

    public static <T> T[] add(T[] tArr, T t8) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else if (t8 != null) {
            componentType = t8.getClass();
        } else {
            throw new IllegalArgumentException("Arguments cannot both be null");
        }
        T[] tArr2 = (T[]) ((Object[]) k(tArr, componentType));
        tArr2[tArr2.length - 1] = t8;
        return tArr2;
    }

    public static int lastIndexOf(int[] iArr, int i8) {
        return lastIndexOf(iArr, i8, Integer.MAX_VALUE);
    }

    public static int indexOf(long[] jArr, long j8) {
        return indexOf(jArr, j8, 0);
    }

    public static int lastIndexOf(int[] iArr, int i8, int i9) {
        if (iArr != null && i9 >= 0) {
            if (i9 >= iArr.length) {
                i9 = iArr.length - 1;
            }
            while (i9 >= 0) {
                if (i8 == iArr[i9]) {
                    return i9;
                }
                i9--;
            }
        }
        return -1;
    }

    public static double[] toPrimitive(Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return EMPTY_DOUBLE_ARRAY;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i8 = 0; i8 < dArr.length; i8++) {
            dArr2[i8] = dArr[i8].doubleValue();
        }
        return dArr2;
    }

    public static long[] addAll(long[] jArr, long... jArr2) {
        if (jArr == null) {
            return clone(jArr2);
        }
        if (jArr2 == null) {
            return clone(jArr);
        }
        long[] jArr3 = new long[jArr.length + jArr2.length];
        System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
        System.arraycopy(jArr2, 0, jArr3, jArr.length, jArr2.length);
        return jArr3;
    }

    public static int indexOf(long[] jArr, long j8, int i8) {
        if (jArr == null) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < jArr.length) {
            if (j8 == jArr[i8]) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static BitSet indexesOf(int[] iArr, int i8) {
        return indexesOf(iArr, i8, 0);
    }

    public static boolean isSorted(long[] jArr) {
        if (getLength(jArr) < 2) {
            return true;
        }
        long j8 = jArr[0];
        int length = jArr.length;
        int i8 = 1;
        while (i8 < length) {
            long j9 = jArr[i8];
            if (U7.a.compare(j8, j9) > 0) {
                return false;
            }
            i8++;
            j8 = j9;
        }
        return true;
    }

    public static void reverse(int[] iArr) {
        if (iArr != null) {
            reverse(iArr, 0, iArr.length);
        }
    }

    public static long[] subarray(long[] jArr, int i8, int i9) {
        if (jArr == null) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 > jArr.length) {
            i9 = jArr.length;
        }
        int i10 = i9 - i8;
        if (i10 <= 0) {
            return EMPTY_LONG_ARRAY;
        }
        long[] jArr2 = new long[i10];
        System.arraycopy(jArr, i8, jArr2, 0, i10);
        return jArr2;
    }

    public static void swap(int[] iArr, int i8, int i9) {
        swap(iArr, i8, i9, 1);
    }

    public static BitSet indexesOf(int[] iArr, int i8, int i9) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (iArr == null) {
            return bitSet;
        }
        while (i9 < iArr.length && (iIndexOf = indexOf(iArr, i8, i9)) != -1) {
            bitSet.set(iIndexOf);
            i9 = iIndexOf + 1;
        }
        return bitSet;
    }

    public static void reverse(int[] iArr, int i8, int i9) {
        if (iArr == null) {
            return;
        }
        int iMin = Math.min(iArr.length, i9) - 1;
        for (int iMax = Math.max(i8, 0); iMin > iMax; iMax++) {
            int i10 = iArr[iMin];
            iArr[iMin] = iArr[iMax];
            iArr[iMax] = i10;
            iMin--;
        }
    }

    public static void swap(int[] iArr, int i8, int i9, int i10) {
        if (isEmpty(iArr) || i8 >= iArr.length || i9 >= iArr.length) {
            return;
        }
        int i11 = 0;
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int iMin = Math.min(Math.min(i10, iArr.length - i8), iArr.length - i9);
        while (i11 < iMin) {
            int i12 = iArr[i8];
            iArr[i8] = iArr[i9];
            iArr[i9] = i12;
            i11++;
            i8++;
            i9++;
        }
    }

    public static int indexOf(Object[] objArr, Object obj) {
        return indexOf(objArr, obj, 0);
    }

    public static int lastIndexOf(long[] jArr, long j8) {
        return lastIndexOf(jArr, j8, Integer.MAX_VALUE);
    }

    public static char[] removeElements(char[] cArr, char... cArr2) {
        if (!isEmpty(cArr) && !isEmpty(cArr2)) {
            HashMap map = new HashMap(cArr2.length);
            for (char c9 : cArr2) {
                Character chValueOf = Character.valueOf(c9);
                V7.b bVar = (V7.b) map.get(chValueOf);
                if (bVar == null) {
                    map.put(chValueOf, new V7.b(1));
                } else {
                    bVar.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i8 = 0; i8 < cArr.length; i8++) {
                char c10 = cArr[i8];
                V7.b bVar2 = (V7.b) map.get(Character.valueOf(c10));
                if (bVar2 != null) {
                    if (bVar2.decrementAndGet() == 0) {
                        map.remove(Character.valueOf(c10));
                    }
                    bitSet.set(i8);
                }
            }
            return (char[]) x(cArr, bitSet);
        }
        return clone(cArr);
    }

    public static void shift(float[] fArr, int i8) {
        if (fArr != null) {
            shift(fArr, 0, fArr.length, i8);
        }
    }

    public static int indexOf(Object[] objArr, Object obj, int i8) {
        if (objArr == null) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (obj == null) {
            while (i8 < objArr.length) {
                if (objArr[i8] == null) {
                    return i8;
                }
                i8++;
            }
        } else {
            while (i8 < objArr.length) {
                if (obj.equals(objArr[i8])) {
                    return i8;
                }
                i8++;
            }
        }
        return -1;
    }

    public static int lastIndexOf(long[] jArr, long j8, int i8) {
        if (jArr != null && i8 >= 0) {
            if (i8 >= jArr.length) {
                i8 = jArr.length - 1;
            }
            while (i8 >= 0) {
                if (j8 == jArr[i8]) {
                    return i8;
                }
                i8--;
            }
        }
        return -1;
    }

    public static void shift(float[] fArr, int i8, int i9, int i10) {
        if (fArr == null || i8 >= fArr.length - 1 || i9 <= 0) {
            return;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 >= fArr.length) {
            i9 = fArr.length;
        }
        int i11 = i9 - i8;
        if (i11 <= 1) {
            return;
        }
        int i12 = i10 % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        while (i11 > 1 && i12 > 0) {
            int i13 = i11 - i12;
            if (i12 > i13) {
                swap(fArr, i8, (i11 + i8) - i13, i13);
                int i14 = i12;
                i12 -= i13;
                i11 = i14;
            } else if (i12 < i13) {
                swap(fArr, i8, i8 + i13, i12);
                i8 += i12;
                i11 = i13;
            } else {
                swap(fArr, i8, i13 + i8, i12);
                return;
            }
        }
    }

    public static double[] toPrimitive(Double[] dArr, double d9) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return EMPTY_DOUBLE_ARRAY;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i8 = 0; i8 < dArr.length; i8++) {
            Double d10 = dArr[i8];
            dArr2[i8] = d10 == null ? d9 : d10.doubleValue();
        }
        return dArr2;
    }

    public static short[] addAll(short[] sArr, short... sArr2) {
        if (sArr == null) {
            return clone(sArr2);
        }
        if (sArr2 == null) {
            return clone(sArr);
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
        System.arraycopy(sArr2, 0, sArr3, sArr.length, sArr2.length);
        return sArr3;
    }

    public static BitSet indexesOf(long[] jArr, long j8) {
        return indexesOf(jArr, j8, 0);
    }

    public static boolean isSorted(short[] sArr) {
        if (getLength(sArr) < 2) {
            return true;
        }
        short s8 = sArr[0];
        int length = sArr.length;
        int i8 = 1;
        while (i8 < length) {
            short s9 = sArr[i8];
            if (U7.a.compare(s8, s9) > 0) {
                return false;
            }
            i8++;
            s8 = s9;
        }
        return true;
    }

    public static short[] subarray(short[] sArr, int i8, int i9) {
        if (sArr == null) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 > sArr.length) {
            i9 = sArr.length;
        }
        int i10 = i9 - i8;
        if (i10 <= 0) {
            return EMPTY_SHORT_ARRAY;
        }
        short[] sArr2 = new short[i10];
        System.arraycopy(sArr, i8, sArr2, 0, i10);
        return sArr2;
    }

    public static BitSet indexesOf(long[] jArr, long j8, int i8) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (jArr == null) {
            return bitSet;
        }
        while (i8 < jArr.length && (iIndexOf = indexOf(jArr, j8, i8)) != -1) {
            bitSet.set(iIndexOf);
            i8 = iIndexOf + 1;
        }
        return bitSet;
    }

    public static float[] insert(int i8, float[] fArr, float... fArr2) {
        if (fArr == null) {
            return null;
        }
        if (isEmpty(fArr2)) {
            return clone(fArr);
        }
        if (i8 >= 0 && i8 <= fArr.length) {
            float[] fArr3 = new float[fArr.length + fArr2.length];
            System.arraycopy(fArr2, 0, fArr3, i8, fArr2.length);
            if (i8 > 0) {
                System.arraycopy(fArr, 0, fArr3, 0, i8);
            }
            if (i8 < fArr.length) {
                System.arraycopy(fArr, i8, fArr3, fArr2.length + i8, fArr.length - i8);
            }
            return fArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: " + fArr.length);
    }

    public static int lastIndexOf(Object[] objArr, Object obj) {
        return lastIndexOf(objArr, obj, Integer.MAX_VALUE);
    }

    public static void reverse(long[] jArr) {
        if (jArr != null) {
            reverse(jArr, 0, jArr.length);
        }
    }

    public static void swap(long[] jArr, int i8, int i9) {
        swap(jArr, i8, i9, 1);
    }

    public static int indexOf(short[] sArr, short s8) {
        return indexOf(sArr, s8, 0);
    }

    public static int lastIndexOf(Object[] objArr, Object obj, int i8) {
        if (objArr != null && i8 >= 0) {
            if (i8 >= objArr.length) {
                i8 = objArr.length - 1;
            }
            if (obj == null) {
                while (i8 >= 0) {
                    if (objArr[i8] == null) {
                        return i8;
                    }
                    i8--;
                }
            } else if (objArr.getClass().getComponentType().isInstance(obj)) {
                while (i8 >= 0) {
                    if (obj.equals(objArr[i8])) {
                        return i8;
                    }
                    i8--;
                }
            }
        }
        return -1;
    }

    public static void reverse(long[] jArr, int i8, int i9) {
        if (jArr == null) {
            return;
        }
        int iMin = Math.min(jArr.length, i9) - 1;
        for (int iMax = Math.max(i8, 0); iMin > iMax; iMax++) {
            long j8 = jArr[iMin];
            jArr[iMin] = jArr[iMax];
            jArr[iMax] = j8;
            iMin--;
        }
    }

    public static void swap(long[] jArr, int i8, int i9, int i10) {
        if (isEmpty(jArr) || i8 >= jArr.length || i9 >= jArr.length) {
            return;
        }
        int i11 = 0;
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int iMin = Math.min(Math.min(i10, jArr.length - i8), jArr.length - i9);
        while (i11 < iMin) {
            long j8 = jArr[i8];
            jArr[i8] = jArr[i9];
            jArr[i9] = j8;
            i11++;
            i8++;
            i9++;
        }
    }

    public static int indexOf(short[] sArr, short s8, int i8) {
        if (sArr == null) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < sArr.length) {
            if (s8 == sArr[i8]) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static <T> T[] addAll(T[] tArr, T... tArr2) {
        if (tArr == null) {
            return (T[]) clone(tArr2);
        }
        if (tArr2 == null) {
            return (T[]) clone(tArr);
        }
        Class componentType = getComponentType(tArr);
        T[] tArr3 = (T[]) newInstance(componentType, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        try {
            System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
            return tArr3;
        } catch (ArrayStoreException e8) {
            Class<?> componentType2 = tArr2.getClass().getComponentType();
            if (!componentType.isAssignableFrom(componentType2)) {
                throw new IllegalArgumentException("Cannot store " + componentType2.getName() + " in an array of " + componentType.getName(), e8);
            }
            throw e8;
        }
    }

    public static BitSet indexesOf(Object[] objArr, Object obj) {
        return indexesOf(objArr, obj, 0);
    }

    public static <T extends Comparable<? super T>> boolean isSorted(T[] tArr) {
        return isSorted(tArr, new Comparator() { // from class: Q7.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        });
    }

    public static void shift(int[] iArr, int i8) {
        if (iArr != null) {
            shift(iArr, 0, iArr.length, i8);
        }
    }

    public static <T> T[] subarray(T[] tArr, int i8, int i9) {
        if (tArr == null) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 > tArr.length) {
            i9 = tArr.length;
        }
        int i10 = i9 - i8;
        Class componentType = getComponentType(tArr);
        if (i10 <= 0) {
            return (T[]) newInstance(componentType, 0);
        }
        T[] tArr2 = (T[]) newInstance(componentType, i10);
        System.arraycopy(tArr, i8, tArr2, 0, i10);
        return tArr2;
    }

    public static float[] toPrimitive(Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return EMPTY_FLOAT_ARRAY;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i8 = 0; i8 < fArr.length; i8++) {
            fArr2[i8] = fArr[i8].floatValue();
        }
        return fArr2;
    }

    public static BitSet indexesOf(Object[] objArr, Object obj, int i8) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (objArr == null) {
            return bitSet;
        }
        while (i8 < objArr.length && (iIndexOf = indexOf(objArr, obj, i8)) != -1) {
            bitSet.set(iIndexOf);
            i8 = iIndexOf + 1;
        }
        return bitSet;
    }

    public static <T> boolean isSorted(T[] tArr, Comparator<T> comparator) {
        Objects.requireNonNull(comparator, "comparator");
        if (getLength(tArr) < 2) {
            return true;
        }
        T t8 = tArr[0];
        int length = tArr.length;
        int i8 = 1;
        while (i8 < length) {
            T t9 = tArr[i8];
            if (comparator.compare(t8, t9) > 0) {
                return false;
            }
            i8++;
            t8 = t9;
        }
        return true;
    }

    public static void shift(int[] iArr, int i8, int i9, int i10) {
        if (iArr == null || i8 >= iArr.length - 1 || i9 <= 0) {
            return;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 >= iArr.length) {
            i9 = iArr.length;
        }
        int i11 = i9 - i8;
        if (i11 <= 1) {
            return;
        }
        int i12 = i10 % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        while (i11 > 1 && i12 > 0) {
            int i13 = i11 - i12;
            if (i12 > i13) {
                swap(iArr, i8, (i11 + i8) - i13, i13);
                int i14 = i12;
                i12 -= i13;
                i11 = i14;
            } else if (i12 < i13) {
                swap(iArr, i8, i8 + i13, i12);
                i8 += i12;
                i11 = i13;
            } else {
                swap(iArr, i8, i13 + i8, i12);
                return;
            }
        }
    }

    public static int lastIndexOf(short[] sArr, short s8) {
        return lastIndexOf(sArr, s8, Integer.MAX_VALUE);
    }

    public static void reverse(Object[] objArr) {
        if (objArr != null) {
            reverse(objArr, 0, objArr.length);
        }
    }

    public static void swap(Object[] objArr, int i8, int i9) {
        swap(objArr, i8, i9, 1);
    }

    public static int lastIndexOf(short[] sArr, short s8, int i8) {
        if (sArr != null && i8 >= 0) {
            if (i8 >= sArr.length) {
                i8 = sArr.length - 1;
            }
            while (i8 >= 0) {
                if (s8 == sArr[i8]) {
                    return i8;
                }
                i8--;
            }
        }
        return -1;
    }

    public static void reverse(Object[] objArr, int i8, int i9) {
        if (objArr == null) {
            return;
        }
        int iMin = Math.min(objArr.length, i9) - 1;
        for (int iMax = Math.max(i8, 0); iMin > iMax; iMax++) {
            Object obj = objArr[iMin];
            objArr[iMin] = objArr[iMax];
            objArr[iMax] = obj;
            iMin--;
        }
    }

    public static void swap(Object[] objArr, int i8, int i9, int i10) {
        if (isEmpty(objArr) || i8 >= objArr.length || i9 >= objArr.length) {
            return;
        }
        int i11 = 0;
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int iMin = Math.min(Math.min(i10, objArr.length - i8), objArr.length - i9);
        while (i11 < iMin) {
            Object obj = objArr[i8];
            objArr[i8] = objArr[i9];
            objArr[i9] = obj;
            i11++;
            i8++;
            i9++;
        }
    }

    public static BitSet indexesOf(short[] sArr, short s8) {
        return indexesOf(sArr, s8, 0);
    }

    public static int[] insert(int i8, int[] iArr, int... iArr2) {
        if (iArr == null) {
            return null;
        }
        if (isEmpty(iArr2)) {
            return clone(iArr);
        }
        if (i8 >= 0 && i8 <= iArr.length) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, i8, iArr2.length);
            if (i8 > 0) {
                System.arraycopy(iArr, 0, iArr3, 0, i8);
            }
            if (i8 < iArr.length) {
                System.arraycopy(iArr, i8, iArr3, iArr2.length + i8, iArr.length - i8);
            }
            return iArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: " + iArr.length);
    }

    public static float[] toPrimitive(Float[] fArr, float f8) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return EMPTY_FLOAT_ARRAY;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i8 = 0; i8 < fArr.length; i8++) {
            Float f9 = fArr[i8];
            fArr2[i8] = f9 == null ? f8 : f9.floatValue();
        }
        return fArr2;
    }

    public static BitSet indexesOf(short[] sArr, short s8, int i8) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (sArr == null) {
            return bitSet;
        }
        while (i8 < sArr.length && (iIndexOf = indexOf(sArr, s8, i8)) != -1) {
            bitSet.set(iIndexOf);
            i8 = iIndexOf + 1;
        }
        return bitSet;
    }

    public static double[] removeElements(double[] dArr, double... dArr2) {
        if (!isEmpty(dArr) && !isEmpty(dArr2)) {
            HashMap map = new HashMap(dArr2.length);
            for (double d9 : dArr2) {
                Double dValueOf = Double.valueOf(d9);
                V7.b bVar = (V7.b) map.get(dValueOf);
                if (bVar == null) {
                    map.put(dValueOf, new V7.b(1));
                } else {
                    bVar.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i8 = 0; i8 < dArr.length; i8++) {
                double d10 = dArr[i8];
                V7.b bVar2 = (V7.b) map.get(Double.valueOf(d10));
                if (bVar2 != null) {
                    if (bVar2.decrementAndGet() == 0) {
                        map.remove(Double.valueOf(d10));
                    }
                    bitSet.set(i8);
                }
            }
            return (double[]) x(dArr, bitSet);
        }
        return clone(dArr);
    }

    public static void reverse(short[] sArr) {
        if (sArr != null) {
            reverse(sArr, 0, sArr.length);
        }
    }

    public static void shift(long[] jArr, int i8) {
        if (jArr != null) {
            shift(jArr, 0, jArr.length, i8);
        }
    }

    public static void swap(short[] sArr, int i8, int i9) {
        swap(sArr, i8, i9, 1);
    }

    public static void reverse(short[] sArr, int i8, int i9) {
        if (sArr == null) {
            return;
        }
        int iMin = Math.min(sArr.length, i9) - 1;
        for (int iMax = Math.max(i8, 0); iMin > iMax; iMax++) {
            short s8 = sArr[iMin];
            sArr[iMin] = sArr[iMax];
            sArr[iMax] = s8;
            iMin--;
        }
    }

    public static void shift(long[] jArr, int i8, int i9, int i10) {
        if (jArr == null || i8 >= jArr.length - 1 || i9 <= 0) {
            return;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 >= jArr.length) {
            i9 = jArr.length;
        }
        int i11 = i9 - i8;
        if (i11 <= 1) {
            return;
        }
        int i12 = i10 % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        while (i11 > 1 && i12 > 0) {
            int i13 = i11 - i12;
            if (i12 > i13) {
                swap(jArr, i8, (i11 + i8) - i13, i13);
                int i14 = i12;
                i12 -= i13;
                i11 = i14;
            } else if (i12 < i13) {
                swap(jArr, i8, i8 + i13, i12);
                i8 += i12;
                i11 = i13;
            } else {
                swap(jArr, i8, i13 + i8, i12);
                return;
            }
        }
    }

    public static void swap(short[] sArr, int i8, int i9, int i10) {
        if (isEmpty(sArr) || i8 >= sArr.length || i9 >= sArr.length) {
            return;
        }
        int i11 = 0;
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        if (i8 == i9) {
            return;
        }
        int iMin = Math.min(Math.min(i10, sArr.length - i8), sArr.length - i9);
        while (i11 < iMin) {
            short s8 = sArr[i8];
            sArr[i8] = sArr[i9];
            sArr[i9] = s8;
            i11++;
            i8++;
            i9++;
        }
    }

    public static int[] toPrimitive(Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return EMPTY_INT_ARRAY;
        }
        int[] iArr = new int[numArr.length];
        for (int i8 = 0; i8 < numArr.length; i8++) {
            iArr[i8] = numArr[i8].intValue();
        }
        return iArr;
    }

    public static long[] insert(int i8, long[] jArr, long... jArr2) {
        if (jArr == null) {
            return null;
        }
        if (isEmpty(jArr2)) {
            return clone(jArr);
        }
        if (i8 >= 0 && i8 <= jArr.length) {
            long[] jArr3 = new long[jArr.length + jArr2.length];
            System.arraycopy(jArr2, 0, jArr3, i8, jArr2.length);
            if (i8 > 0) {
                System.arraycopy(jArr, 0, jArr3, 0, i8);
            }
            if (i8 < jArr.length) {
                System.arraycopy(jArr, i8, jArr3, jArr2.length + i8, jArr.length - i8);
            }
            return jArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: " + jArr.length);
    }

    public static void shift(Object[] objArr, int i8) {
        if (objArr != null) {
            shift(objArr, 0, objArr.length, i8);
        }
    }

    public static <T> T[] toArray(T... tArr) {
        return tArr;
    }

    public static int[] toPrimitive(Integer[] numArr, int i8) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return EMPTY_INT_ARRAY;
        }
        int[] iArr = new int[numArr.length];
        for (int i9 = 0; i9 < numArr.length; i9++) {
            Integer num = numArr[i9];
            iArr[i9] = num == null ? i8 : num.intValue();
        }
        return iArr;
    }

    public static void shift(Object[] objArr, int i8, int i9, int i10) {
        if (objArr == null || i8 >= objArr.length - 1 || i9 <= 0) {
            return;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 >= objArr.length) {
            i9 = objArr.length;
        }
        int i11 = i9 - i8;
        if (i11 <= 1) {
            return;
        }
        int i12 = i10 % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        while (i11 > 1 && i12 > 0) {
            int i13 = i11 - i12;
            if (i12 > i13) {
                swap(objArr, i8, (i11 + i8) - i13, i13);
                int i14 = i12;
                i12 -= i13;
                i11 = i14;
            } else if (i12 < i13) {
                swap(objArr, i8, i8 + i13, i12);
                i8 += i12;
                i11 = i13;
            } else {
                swap(objArr, i8, i13 + i8, i12);
                return;
            }
        }
    }

    public static long[] toPrimitive(Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return EMPTY_LONG_ARRAY;
        }
        long[] jArr = new long[lArr.length];
        for (int i8 = 0; i8 < lArr.length; i8++) {
            jArr[i8] = lArr[i8].longValue();
        }
        return jArr;
    }

    public static short[] insert(int i8, short[] sArr, short... sArr2) {
        if (sArr == null) {
            return null;
        }
        if (isEmpty(sArr2)) {
            return clone(sArr);
        }
        if (i8 >= 0 && i8 <= sArr.length) {
            short[] sArr3 = new short[sArr.length + sArr2.length];
            System.arraycopy(sArr2, 0, sArr3, i8, sArr2.length);
            if (i8 > 0) {
                System.arraycopy(sArr, 0, sArr3, 0, i8);
            }
            if (i8 < sArr.length) {
                System.arraycopy(sArr, i8, sArr3, sArr2.length + i8, sArr.length - i8);
            }
            return sArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: " + sArr.length);
    }

    public static float[] removeElements(float[] fArr, float... fArr2) {
        if (!isEmpty(fArr) && !isEmpty(fArr2)) {
            HashMap map = new HashMap(fArr2.length);
            for (float f8 : fArr2) {
                Float fValueOf = Float.valueOf(f8);
                V7.b bVar = (V7.b) map.get(fValueOf);
                if (bVar == null) {
                    map.put(fValueOf, new V7.b(1));
                } else {
                    bVar.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i8 = 0; i8 < fArr.length; i8++) {
                float f9 = fArr[i8];
                V7.b bVar2 = (V7.b) map.get(Float.valueOf(f9));
                if (bVar2 != null) {
                    if (bVar2.decrementAndGet() == 0) {
                        map.remove(Float.valueOf(f9));
                    }
                    bitSet.set(i8);
                }
            }
            return (float[]) x(fArr, bitSet);
        }
        return clone(fArr);
    }

    public static void shift(short[] sArr, int i8) {
        if (sArr != null) {
            shift(sArr, 0, sArr.length, i8);
        }
    }

    public static void shift(short[] sArr, int i8, int i9, int i10) {
        if (sArr == null || i8 >= sArr.length - 1 || i9 <= 0) {
            return;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (i9 >= sArr.length) {
            i9 = sArr.length;
        }
        int i11 = i9 - i8;
        if (i11 <= 1) {
            return;
        }
        int i12 = i10 % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        while (i11 > 1 && i12 > 0) {
            int i13 = i11 - i12;
            if (i12 > i13) {
                swap(sArr, i8, (i11 + i8) - i13, i13);
                int i14 = i12;
                i12 -= i13;
                i11 = i14;
            } else if (i12 < i13) {
                swap(sArr, i8, i8 + i13, i12);
                i8 += i12;
                i11 = i13;
            } else {
                swap(sArr, i8, i13 + i8, i12);
                return;
            }
        }
    }

    public static long[] toPrimitive(Long[] lArr, long j8) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return EMPTY_LONG_ARRAY;
        }
        long[] jArr = new long[lArr.length];
        for (int i8 = 0; i8 < lArr.length; i8++) {
            Long l8 = lArr[i8];
            jArr[i8] = l8 == null ? j8 : l8.longValue();
        }
        return jArr;
    }

    @SafeVarargs
    public static <T> T[] insert(int i8, T[] tArr, T... tArr2) {
        if (tArr == null) {
            return null;
        }
        if (isEmpty(tArr2)) {
            return (T[]) clone(tArr);
        }
        if (i8 >= 0 && i8 <= tArr.length) {
            T[] tArr3 = (T[]) newInstance(getComponentType(tArr), tArr.length + tArr2.length);
            System.arraycopy(tArr2, 0, tArr3, i8, tArr2.length);
            if (i8 > 0) {
                System.arraycopy(tArr, 0, tArr3, 0, i8);
            }
            if (i8 < tArr.length) {
                System.arraycopy(tArr, i8, tArr3, tArr2.length + i8, tArr.length - i8);
            }
            return tArr3;
        }
        throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: " + tArr.length);
    }

    public static Object toPrimitive(Object obj) {
        if (obj == null) {
            return null;
        }
        Class<?> clsWrapperToPrimitive = C.wrapperToPrimitive(obj.getClass().getComponentType());
        if (Boolean.TYPE.equals(clsWrapperToPrimitive)) {
            return toPrimitive((Boolean[]) obj);
        }
        if (Character.TYPE.equals(clsWrapperToPrimitive)) {
            return toPrimitive((Character[]) obj);
        }
        if (Byte.TYPE.equals(clsWrapperToPrimitive)) {
            return toPrimitive((Byte[]) obj);
        }
        if (Integer.TYPE.equals(clsWrapperToPrimitive)) {
            return toPrimitive((Integer[]) obj);
        }
        if (Long.TYPE.equals(clsWrapperToPrimitive)) {
            return toPrimitive((Long[]) obj);
        }
        if (Short.TYPE.equals(clsWrapperToPrimitive)) {
            return toPrimitive((Short[]) obj);
        }
        if (Double.TYPE.equals(clsWrapperToPrimitive)) {
            return toPrimitive((Double[]) obj);
        }
        return Float.TYPE.equals(clsWrapperToPrimitive) ? toPrimitive((Float[]) obj) : obj;
    }

    public static int[] removeElements(int[] iArr, int... iArr2) {
        if (!isEmpty(iArr) && !isEmpty(iArr2)) {
            HashMap map = new HashMap(iArr2.length);
            for (int i8 : iArr2) {
                Integer numValueOf = Integer.valueOf(i8);
                V7.b bVar = (V7.b) map.get(numValueOf);
                if (bVar == null) {
                    map.put(numValueOf, new V7.b(1));
                } else {
                    bVar.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i9 = 0; i9 < iArr.length; i9++) {
                int i10 = iArr[i9];
                V7.b bVar2 = (V7.b) map.get(Integer.valueOf(i10));
                if (bVar2 != null) {
                    if (bVar2.decrementAndGet() == 0) {
                        map.remove(Integer.valueOf(i10));
                    }
                    bitSet.set(i9);
                }
            }
            return (int[]) x(iArr, bitSet);
        }
        return clone(iArr);
    }

    public static short[] toPrimitive(Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return EMPTY_SHORT_ARRAY;
        }
        short[] sArr = new short[shArr.length];
        for (int i8 = 0; i8 < shArr.length; i8++) {
            sArr[i8] = shArr[i8].shortValue();
        }
        return sArr;
    }

    public static long[] removeElements(long[] jArr, long... jArr2) {
        if (!isEmpty(jArr) && !isEmpty(jArr2)) {
            HashMap map = new HashMap(jArr2.length);
            for (long j8 : jArr2) {
                Long lValueOf = Long.valueOf(j8);
                V7.b bVar = (V7.b) map.get(lValueOf);
                if (bVar == null) {
                    map.put(lValueOf, new V7.b(1));
                } else {
                    bVar.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i8 = 0; i8 < jArr.length; i8++) {
                long j9 = jArr[i8];
                V7.b bVar2 = (V7.b) map.get(Long.valueOf(j9));
                if (bVar2 != null) {
                    if (bVar2.decrementAndGet() == 0) {
                        map.remove(Long.valueOf(j9));
                    }
                    bitSet.set(i8);
                }
            }
            return (long[]) x(jArr, bitSet);
        }
        return clone(jArr);
    }

    public static short[] toPrimitive(Short[] shArr, short s8) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return EMPTY_SHORT_ARRAY;
        }
        short[] sArr = new short[shArr.length];
        for (int i8 = 0; i8 < shArr.length; i8++) {
            Short sh = shArr[i8];
            sArr[i8] = sh == null ? s8 : sh.shortValue();
        }
        return sArr;
    }

    public static short[] removeElements(short[] sArr, short... sArr2) {
        if (!isEmpty(sArr) && !isEmpty(sArr2)) {
            HashMap map = new HashMap(sArr2.length);
            for (short s8 : sArr2) {
                Short shValueOf = Short.valueOf(s8);
                V7.b bVar = (V7.b) map.get(shValueOf);
                if (bVar == null) {
                    map.put(shValueOf, new V7.b(1));
                } else {
                    bVar.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i8 = 0; i8 < sArr.length; i8++) {
                short s9 = sArr[i8];
                V7.b bVar2 = (V7.b) map.get(Short.valueOf(s9));
                if (bVar2 != null) {
                    if (bVar2.decrementAndGet() == 0) {
                        map.remove(Short.valueOf(s9));
                    }
                    bitSet.set(i8);
                }
            }
            return (short[]) x(sArr, bitSet);
        }
        return clone(sArr);
    }

    @SafeVarargs
    public static <T> T[] removeElements(T[] tArr, T... tArr2) {
        if (!isEmpty(tArr) && !isEmpty(tArr2)) {
            HashMap map = new HashMap(tArr2.length);
            for (T t8 : tArr2) {
                V7.b bVar = (V7.b) map.get(t8);
                if (bVar == null) {
                    map.put(t8, new V7.b(1));
                } else {
                    bVar.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i8 = 0; i8 < tArr.length; i8++) {
                T t9 = tArr[i8];
                V7.b bVar2 = (V7.b) map.get(t9);
                if (bVar2 != null) {
                    if (bVar2.decrementAndGet() == 0) {
                        map.remove(t9);
                    }
                    bitSet.set(i8);
                }
            }
            return (T[]) ((Object[]) x(tArr, bitSet));
        }
        return (T[]) clone(tArr);
    }
}
