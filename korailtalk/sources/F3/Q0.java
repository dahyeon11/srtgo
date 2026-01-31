package f3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class Q0 {
    static Object a(Object obj, int i8) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i8);
    }

    static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    static Object[] c(Object[] objArr, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            a(objArr[i9], i9);
        }
        return objArr;
    }

    public static <T> T[] concat(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] tArr3 = (T[]) newArray(cls, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    private static Object[] d(Iterable iterable, Object[] objArr) {
        Iterator it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            objArr[i8] = it.next();
            i8++;
        }
        return objArr;
    }

    static Object[] e(Collection collection) {
        return d(collection, new Object[collection.size()]);
    }

    static Object[] f(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            objArr = newArray(objArr, size);
        }
        d(collection, objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    static Object[] g(Object[] objArr, int i8, int i9, Object[] objArr2) {
        e3.w.checkPositionIndexes(i8, i8 + i9, objArr.length);
        if (objArr2.length < i9) {
            objArr2 = newArray(objArr2, i9);
        } else if (objArr2.length > i9) {
            objArr2[i9] = null;
        }
        System.arraycopy(objArr, i8, objArr2, 0, i9);
        return objArr2;
    }

    public static <T> T[] newArray(Class<T> cls, int i8) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i8));
    }

    public static <T> T[] newArray(T[] tArr, int i8) {
        return (T[]) V0.b(tArr, i8);
    }

    public static <T> T[] concat(T t8, T[] tArr) {
        T[] tArr2 = (T[]) newArray(tArr, tArr.length + 1);
        tArr2[0] = t8;
        System.arraycopy(tArr, 0, tArr2, 1, tArr.length);
        return tArr2;
    }

    public static <T> T[] concat(T[] tArr, T t8) {
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length + 1);
        tArr2[tArr.length] = t8;
        return tArr2;
    }
}
