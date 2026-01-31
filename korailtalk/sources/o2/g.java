package o2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g {
    private static Map a(int i8, boolean z8) {
        return i8 <= 256 ? new O.a(i8) : new HashMap(i8, 1.0f);
    }

    private static Set b(int i8, boolean z8) {
        if (i8 <= (true != z8 ? 256 : 128)) {
            return new O.b(i8);
        }
        return new HashSet(i8, true != z8 ? 1.0f : 0.75f);
    }

    public static boolean isEmpty(Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    public static <K, V> Map<K, V> mapOf(K k8, V v8, K k9, V v9, K k10, V v10) {
        Map mapA = a(3, false);
        mapA.put(k8, v8);
        mapA.put(k9, v9);
        mapA.put(k10, v10);
        return Collections.unmodifiableMap(mapA);
    }

    public static <K, V> Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapA = a(length, false);
        for (int i8 = 0; i8 < kArr.length; i8++) {
            mapA.put(kArr[i8], vArr[i8]);
        }
        return Collections.unmodifiableMap(mapA);
    }

    public static <T> Set<T> mutableSetOfWithSize(int i8) {
        return i8 == 0 ? new O.b() : b(i8, true);
    }

    @Deprecated
    public static <T> Set<T> setOf(T t8, T t9, T t10) {
        Set setB = b(3, false);
        setB.add(t8);
        setB.add(t9);
        setB.add(t10);
        return Collections.unmodifiableSet(setB);
    }

    @Deprecated
    public static <T> List<T> listOf(T t8) {
        return Collections.singletonList(t8);
    }

    @Deprecated
    public static <T> List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.singletonList(tArr[0]);
    }

    public static <K, V> Map<K, V> mapOf(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        Map mapA = a(6, false);
        mapA.put(k8, v8);
        mapA.put(k9, v9);
        mapA.put(k10, v10);
        mapA.put(k11, v11);
        mapA.put(k12, v12);
        mapA.put(k13, v13);
        return Collections.unmodifiableMap(mapA);
    }

    @Deprecated
    public static <T> Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t8 = tArr[0];
            T t9 = tArr[1];
            Set setB = b(2, false);
            setB.add(t8);
            setB.add(t9);
            return Collections.unmodifiableSet(setB);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setB2 = b(length, false);
            Collections.addAll(setB2, tArr);
            return Collections.unmodifiableSet(setB2);
        }
        T t10 = tArr[0];
        T t11 = tArr[1];
        T t12 = tArr[2];
        T t13 = tArr[3];
        Set setB3 = b(4, false);
        setB3.add(t10);
        setB3.add(t11);
        setB3.add(t12);
        setB3.add(t13);
        return Collections.unmodifiableSet(setB3);
    }
}
