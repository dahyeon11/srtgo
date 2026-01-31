package S6;

import f7.InterfaceC5519a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public class B extends A {

    public static final class a implements k7.m {

        /* renamed from: a */
        final /* synthetic */ Iterable f4666a;

        public a(Iterable iterable) {
            this.f4666a = iterable;
        }

        @Override // k7.m
        public Iterator<T> iterator() {
            return this.f4666a.iterator();
        }
    }

    static final class b extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ int f4667a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i8) {
            super(1);
            this.f4667a = i8;
        }

        public final T invoke(int i8) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f4667a + Q7.C.PACKAGE_SEPARATOR_CHAR);
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    public static final class c implements I {

        /* renamed from: a */
        final /* synthetic */ Iterable f4668a;

        /* renamed from: b */
        final /* synthetic */ f7.l f4669b;

        public c(Iterable<? extends T> iterable, f7.l lVar) {
            this.f4668a = iterable;
            this.f4669b = lVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [K, java.lang.Object] */
        @Override // S6.I
        public K keyOf(T t8) {
            return this.f4669b.invoke(t8);
        }

        @Override // S6.I
        public Iterator<T> sourceIterator() {
            return this.f4668a.iterator();
        }
    }

    static final class d extends Lambda implements InterfaceC5519a {

        /* renamed from: a */
        final /* synthetic */ Iterable f4670a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Iterable iterable) {
            super(0);
            this.f4670a = iterable;
        }

        @Override // f7.InterfaceC5519a
        public final Iterator<T> invoke() {
            return this.f4670a.iterator();
        }
    }

    public static final <T> boolean all(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static <T> k7.m asSequence(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new a(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associate(Iterable<? extends T> iterable, f7.l transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(r.collectionSizeOrDefault(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R6.p pVar = (R6.p) transform.invoke(it.next());
            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K> Map<K, T> associateBy(Iterable<? extends T> iterable, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(r.collectionSizeOrDefault(iterable, 10)), 16));
        for (T t8 : iterable) {
            linkedHashMap.put(keySelector.invoke(t8), t8);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(Iterable<? extends T> iterable, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t8 : iterable) {
            destination.put(keySelector.invoke(t8), t8);
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(Iterable<? extends T> iterable, M destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R6.p pVar = (R6.p) transform.invoke(it.next());
            destination.put(pVar.getFirst(), pVar.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateWith(Iterable<? extends K> iterable, f7.l valueSelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(r.collectionSizeOrDefault(iterable, 10)), 16));
        for (K k8 : iterable) {
            linkedHashMap.put(k8, valueSelector.invoke(k8));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(Iterable<? extends K> iterable, M destination, f7.l valueSelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (K k8 : iterable) {
            destination.put(k8, valueSelector.invoke(k8));
        }
        return destination;
    }

    public static final double averageOfByte(Iterable<Byte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        double dByteValue = 0.0d;
        int i8 = 0;
        while (it.hasNext()) {
            dByteValue += it.next().byteValue();
            i8++;
            if (i8 < 0) {
                r.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dByteValue / i8;
    }

    public static final double averageOfDouble(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        int i8 = 0;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
            i8++;
            if (i8 < 0) {
                r.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / i8;
    }

    public static final double averageOfFloat(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double dFloatValue = 0.0d;
        int i8 = 0;
        while (it.hasNext()) {
            dFloatValue += it.next().floatValue();
            i8++;
            if (i8 < 0) {
                r.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dFloatValue / i8;
    }

    public static final double averageOfInt(Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        double dIntValue = 0.0d;
        int i8 = 0;
        while (it.hasNext()) {
            dIntValue += it.next().intValue();
            i8++;
            if (i8 < 0) {
                r.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dIntValue / i8;
    }

    public static final double averageOfLong(Iterable<Long> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        double dLongValue = 0.0d;
        int i8 = 0;
        while (it.hasNext()) {
            dLongValue += it.next().longValue();
            i8++;
            if (i8 < 0) {
                r.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dLongValue / i8;
    }

    public static final double averageOfShort(Iterable<Short> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        double dShortValue = 0.0d;
        int i8 = 0;
        while (it.hasNext()) {
            dShortValue += it.next().shortValue();
            i8++;
            if (i8 < 0) {
                r.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dShortValue / i8;
    }

    public static final <T> List<List<T>> chunked(Iterable<? extends T> iterable, int i8) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return windowed(iterable, i8, i8, true);
    }

    public static <T> boolean contains(Iterable<? extends T> iterable, T t8) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t8) : indexOf(iterable, t8) >= 0;
    }

    public static final <T> int count(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            it.next();
            i8++;
            if (i8 < 0) {
                r.throwCountOverflow();
            }
        }
        return i8;
    }

    public static final <T> List<T> distinct(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return r.toList(toMutableSet(iterable));
    }

    public static final <T, K> List<T> distinctBy(Iterable<? extends T> iterable, f7.l selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t8 : iterable) {
            if (hashSet.add(selector.invoke(t8))) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public static <T> List<T> drop(Iterable<? extends T> iterable, int i8) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return r.toList(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i8;
            if (size <= 0) {
                return r.emptyList();
            }
            if (size == 1) {
                return r.listOf(last(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i8 < size2) {
                        arrayList.add(((List) iterable).get(i8));
                        i8++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i8);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i9 = 0;
        for (T t8 : iterable) {
            if (i9 >= i8) {
                arrayList.add(t8);
            } else {
                i9++;
            }
        }
        return C0777t.optimizeReadOnlyList(arrayList);
    }

    public static final <T> List<T> dropLast(List<? extends T> list, int i8) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i8 >= 0) {
            return take(list, j7.s.coerceAtLeast(list.size() - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final <T> List<T> dropLastWhile(List<? extends T> list, f7.l predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!((Boolean) predicate.invoke(listIterator.previous())).booleanValue()) {
                    return take(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return r.emptyList();
    }

    public static final <T> List<T> dropWhile(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        for (T t8 : iterable) {
            if (z8) {
                arrayList.add(t8);
            } else if (!((Boolean) predicate.invoke(t8)).booleanValue()) {
                arrayList.add(t8);
                z8 = true;
            }
        }
        return arrayList;
    }

    public static final <T> T elementAt(Iterable<? extends T> iterable, int i8) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i8) : (T) elementAtOrElse(iterable, i8, new b(i8));
    }

    public static final <T> T elementAtOrElse(Iterable<? extends T> iterable, int i8, f7.l defaultValue) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i8 < 0 || i8 > r.getLastIndex(list)) ? (T) defaultValue.invoke(Integer.valueOf(i8)) : (T) list.get(i8);
        }
        if (i8 < 0) {
            return (T) defaultValue.invoke(Integer.valueOf(i8));
        }
        int i9 = 0;
        for (T t8 : iterable) {
            int i10 = i9 + 1;
            if (i8 == i9) {
                return t8;
            }
            i9 = i10;
        }
        return (T) defaultValue.invoke(Integer.valueOf(i8));
    }

    public static final <T> T elementAtOrNull(Iterable<? extends T> iterable, int i8) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) getOrNull((List) iterable, i8);
        }
        if (i8 < 0) {
            return null;
        }
        int i9 = 0;
        for (T t8 : iterable) {
            int i10 = i9 + 1;
            if (i8 == i9) {
                return t8;
            }
            i9 = i10;
        }
        return null;
    }

    public static final <T> List<T> filter(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t8 : iterable) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filterIndexed(Iterable<? extends T> iterable, f7.p predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        for (T t8 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                r.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(Integer.valueOf(i8), t8)).booleanValue()) {
                arrayList.add(t8);
            }
            i8 = i9;
        }
        return arrayList;
    }

    public static final <T, C extends Collection<? super T>> C filterIndexedTo(Iterable<? extends T> iterable, C destination, f7.p predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (T t8 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                r.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(Integer.valueOf(i8), t8)).booleanValue()) {
                destination.add(t8);
            }
            i8 = i9;
        }
        return destination;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Iterable<?> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Iterable<?> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : iterable) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T> List<T> filterNot(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t8 : iterable) {
            if (!((Boolean) predicate.invoke(t8)).booleanValue()) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filterNotNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (List) filterNotNullTo(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(Iterable<? extends T> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t8 : iterable) {
            if (t8 != null) {
                destination.add(t8);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterNotTo(Iterable<? extends T> iterable, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t8 : iterable) {
            if (!((Boolean) predicate.invoke(t8)).booleanValue()) {
                destination.add(t8);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterTo(Iterable<? extends T> iterable, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t8 : iterable) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                destination.add(t8);
            }
        }
        return destination;
    }

    public static final <T> T first(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) first((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T firstOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T, R> List<R> flatMap(Iterable<? extends T> iterable, f7.l transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r.addAll(arrayList, (Iterable) transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T, R> List<R> flatMapSequence(Iterable<? extends T> iterable, f7.l transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r.addAll(arrayList, (k7.m) transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(Iterable<? extends T> iterable, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r.addAll(destination, (k7.m) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapTo(Iterable<? extends T> iterable, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r.addAll(destination, (Iterable) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R> R fold(Iterable<? extends T> iterable, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r8 = (R) operation.invoke(r8, it.next());
        }
        return r8;
    }

    public static final <T, R> R foldIndexed(Iterable<? extends T> iterable, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i8 = 0;
        for (T t8 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                r.throwIndexOverflow();
            }
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, t8);
            i8 = i9;
        }
        return r8;
    }

    public static final <T, R> R foldRight(List<? extends T> list, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r8 = (R) operation.invoke(listIterator.previous(), r8);
            }
        }
        return r8;
    }

    public static final <T, R> R foldRightIndexed(List<? extends T> list, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r8 = (R) operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r8);
            }
        }
        return r8;
    }

    public static final <T> void forEach(Iterable<? extends T> iterable, f7.l action) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    public static final <T> void forEachIndexed(Iterable<? extends T> iterable, f7.p action) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i8 = 0;
        for (T t8 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                r.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i8), t8);
            i8 = i9;
        }
    }

    public static final <T> T getOrNull(List<? extends T> list, int i8) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i8 < 0 || i8 > r.getLastIndex(list)) {
            return null;
        }
        return list.get(i8);
    }

    public static final <T, K> Map<K, List<T>> groupBy(Iterable<? extends T> iterable, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t8 : iterable) {
            Object objInvoke = keySelector.invoke(t8);
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(t8);
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(Iterable<? extends T> iterable, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t8 : iterable) {
            Object objInvoke = keySelector.invoke(t8);
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(t8);
        }
        return destination;
    }

    public static final <T, K> I groupingBy(Iterable<? extends T> iterable, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new c(iterable, keySelector);
    }

    public static final <T> int indexOf(Iterable<? extends T> iterable, T t8) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t8);
        }
        int i8 = 0;
        for (T t9 : iterable) {
            if (i8 < 0) {
                r.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t8, t9)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (T t8 : iterable) {
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                r.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = -1;
        int i9 = 0;
        for (T t8 : iterable) {
            if (i9 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                r.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                i8 = i9;
            }
            i9++;
        }
        return i8;
    }

    public static final <T> Set<T> intersect(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        C0782y.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T, A extends Appendable> A joinTo(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) throws IOException {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (T t8 : iterable) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            l7.r.appendElement(buffer, t8, lVar);
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String joinToString(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(iterable, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f7.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return joinToString(iterable, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static final <T> T last(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) r.last((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> int lastIndexOf(Iterable<? extends T> iterable, T t8) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t8);
        }
        int i8 = -1;
        int i9 = 0;
        for (T t9 : iterable) {
            if (i9 < 0) {
                r.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t8, t9)) {
                i8 = i9;
            }
            i9++;
        }
        return i8;
    }

    public static final <T> T lastOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T, R> List<R> map(Iterable<? extends T> iterable, f7.l transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(r.collectionSizeOrDefault(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexed(Iterable<? extends T> iterable, f7.p transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(r.collectionSizeOrDefault(iterable, 10));
        int i8 = 0;
        for (T t8 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                r.throwIndexOverflow();
            }
            arrayList.add(transform.invoke(Integer.valueOf(i8), t8));
            i8 = i9;
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexedNotNull(Iterable<? extends T> iterable, f7.p transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        for (T t8 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                r.throwIndexOverflow();
            }
            Object objInvoke = transform.invoke(Integer.valueOf(i8), t8);
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
            i8 = i9;
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(Iterable<? extends T> iterable, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        for (T t8 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                r.throwIndexOverflow();
            }
            Object objInvoke = transform.invoke(Integer.valueOf(i8), t8);
            if (objInvoke != null) {
                destination.add(objInvoke);
            }
            i8 = i9;
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(Iterable<? extends T> iterable, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        for (T t8 : iterable) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                r.throwIndexOverflow();
            }
            destination.add(transform.invoke(Integer.valueOf(i8), t8));
            i8 = i9;
        }
        return destination;
    }

    public static final <T, R> List<R> mapNotNull(Iterable<? extends T> iterable, f7.l transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object objInvoke = transform.invoke(it.next());
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(Iterable<? extends T> iterable, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object objInvoke = transform.invoke(it.next());
            if (objInvoke != null) {
                destination.add(objInvoke);
            }
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapTo(Iterable<? extends T> iterable, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrNull(Iterable<? extends T> iterable, f7.l selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) selector.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next2);
            if (comparable.compareTo(comparable2) < 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(Iterable<? extends T> iterable, f7.l selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) selector.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next2);
            if (comparable.compareTo(comparable2) < 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    /* renamed from: maxOrNull */
    public static final Double m130maxOrNull(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final double maxOrThrow(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T maxWithOrNull(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T maxWithOrThrow(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrNull(Iterable<? extends T> iterable, f7.l selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) selector.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next2);
            if (comparable.compareTo(comparable2) > 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrThrow(Iterable<? extends T> iterable, f7.l selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) selector.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next2);
            if (comparable.compareTo(comparable2) > 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    /* renamed from: minOrNull */
    public static final Double m134minOrNull(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final double minOrThrow(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T minWithOrNull(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T minWithOrThrow(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, T t8) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(r.collectionSizeOrDefault(iterable, 10));
        boolean z8 = false;
        for (T t9 : iterable) {
            boolean z9 = true;
            if (!z8 && Intrinsics.areEqual(t9, t8)) {
                z8 = true;
                z9 = false;
            }
            if (z9) {
                arrayList.add(t9);
            }
        }
        return arrayList;
    }

    public static final <T> boolean none(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static final <T, C extends Iterable<? extends T>> C onEach(C c9, f7.l action) {
        Intrinsics.checkNotNullParameter(c9, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<T> it = c9.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        return c9;
    }

    public static final <T, C extends Iterable<? extends T>> C onEachIndexed(C c9, f7.p action) {
        Intrinsics.checkNotNullParameter(c9, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i8 = 0;
        for (T t8 : c9) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                r.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i8), t8);
            i8 = i9;
        }
        return c9;
    }

    public static final <T> R6.p partition(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t8 : iterable) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                arrayList.add(t8);
            } else {
                arrayList2.add(t8);
            }
        }
        return new R6.p(arrayList, arrayList2);
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, T t8) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return r.plus((Collection) iterable, (Object) t8);
        }
        ArrayList arrayList = new ArrayList();
        r.addAll(arrayList, iterable);
        arrayList.add(t8);
        return arrayList;
    }

    public static final <T> T random(Collection<? extends T> collection, h7.f random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) elementAt(collection, random.nextInt(collection.size()));
    }

    public static final <T> T randomOrNull(Collection<? extends T> collection, h7.f random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) elementAt(collection, random.nextInt(collection.size()));
    }

    public static final <S, T extends S> S reduce(Iterable<? extends T> iterable, f7.p operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = (S) operation.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexed(Iterable<? extends T> iterable, f7.q operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        T next = it.next();
        int i8 = 1;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                r.throwIndexOverflow();
            }
            next = (S) operation.invoke(Integer.valueOf(i8), next, it.next());
            i8 = i9;
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexedOrNull(Iterable<? extends T> iterable, f7.q operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        int i8 = 1;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                r.throwIndexOverflow();
            }
            next = (S) operation.invoke(Integer.valueOf(i8), next, it.next());
            i8 = i9;
        }
        return next;
    }

    public static final <S, T extends S> S reduceOrNull(Iterable<? extends T> iterable, f7.p operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = (S) operation.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceRight(List<? extends T> list, f7.p operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        T tPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            tPrevious = (S) operation.invoke(listIterator.previous(), tPrevious);
        }
        return tPrevious;
    }

    public static final <S, T extends S> S reduceRightIndexed(List<? extends T> list, f7.q operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        T tPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            tPrevious = (S) operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), tPrevious);
        }
        return tPrevious;
    }

    public static final <S, T extends S> S reduceRightIndexedOrNull(List<? extends T> list, f7.q operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        T tPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            tPrevious = (S) operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), tPrevious);
        }
        return tPrevious;
    }

    public static final <S, T extends S> S reduceRightOrNull(List<? extends T> list, f7.p operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        T tPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            tPrevious = (S) operation.invoke(listIterator.previous(), tPrevious);
        }
        return tPrevious;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Iterable<T> requireNoNulls(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + Q7.C.PACKAGE_SEPARATOR_CHAR);
            }
        }
        return iterable;
    }

    public static final <T> List<T> reversed(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return r.toList(iterable);
        }
        List<T> mutableList = toMutableList(iterable);
        r.reverse(mutableList);
        return mutableList;
    }

    public static final <T, R> List<R> runningFold(Iterable<? extends T> iterable, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = r.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return r.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r8);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r8 = (R) operation.invoke(r8, it.next());
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <T, R> List<R> runningFoldIndexed(Iterable<? extends T> iterable, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = r.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return r.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r8);
        Iterator<? extends T> it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, it.next());
            arrayList.add(r8);
            i8++;
        }
        return arrayList;
    }

    public static final <S, T extends S> List<S> runningReduce(Iterable<? extends T> iterable, f7.p operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return r.emptyList();
        }
        Object next = it.next();
        ArrayList arrayList = new ArrayList(r.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    public static final <S, T extends S> List<S> runningReduceIndexed(Iterable<? extends T> iterable, f7.q operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return r.emptyList();
        }
        Object next = it.next();
        ArrayList arrayList = new ArrayList(r.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        int i8 = 1;
        while (it.hasNext()) {
            next = operation.invoke(Integer.valueOf(i8), next, it.next());
            arrayList.add(next);
            i8++;
        }
        return arrayList;
    }

    public static final <T, R> List<R> scan(Iterable<? extends T> iterable, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = r.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return r.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r8);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r8 = (R) operation.invoke(r8, it.next());
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <T, R> List<R> scanIndexed(Iterable<? extends T> iterable, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = r.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return r.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r8);
        Iterator<? extends T> it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, it.next());
            arrayList.add(r8);
            i8++;
        }
        return arrayList;
    }

    public static final <T> void shuffle(List<T> list, h7.f random) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = r.getLastIndex(list); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            list.set(iNextInt, list.set(lastIndex, list.get(iNextInt)));
        }
    }

    public static <T> T single(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) single((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T singleOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static final <T> List<T> slice(List<? extends T> list, j7.l indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? r.emptyList() : r.toList(list.subList(indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(List<T> list, f7.l selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (list.size() > 1) {
            r.sortWith(list, new V6.g(selector));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(List<T> list, f7.l selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (list.size() > 1) {
            r.sortWith(list, new V6.h(selector));
        }
    }

    public static final <T extends Comparable<? super T>> void sortDescending(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        r.sortWith(list, V6.a.reverseOrder());
    }

    public static final <T extends Comparable<? super T>> List<T> sorted(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> mutableList = toMutableList(iterable);
            r.sort(mutableList);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return r.toList(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        C0768l.sort((Comparable[]) array);
        return AbstractC0765i.asList(array);
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(Iterable<? extends T> iterable, f7.l selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return r.sortedWith(iterable, new V6.g(selector));
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(Iterable<? extends T> iterable, f7.l selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return r.sortedWith(iterable, new V6.h(selector));
    }

    public static final <T extends Comparable<? super T>> List<T> sortedDescending(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return r.sortedWith(iterable, V6.a.reverseOrder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> sortedWith(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> mutableList = toMutableList(iterable);
            r.sortWith(mutableList, comparator);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return r.toList(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        C0768l.sortWith(array, comparator);
        return AbstractC0765i.asList(array);
    }

    public static final <T> Set<T> subtract(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        C0782y.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T> int sumBy(Iterable<? extends T> iterable, f7.l selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) selector.invoke(it.next())).intValue();
        }
        return iIntValue;
    }

    public static final <T> double sumByDouble(Iterable<? extends T> iterable, f7.l selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += ((Number) selector.invoke(it.next())).doubleValue();
        }
        return dDoubleValue;
    }

    public static final int sumOfByte(Iterable<Byte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    public static final double sumOfDouble(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    public static final float sumOfFloat(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    public static final int sumOfInt(Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    public static final long sumOfLong(Iterable<Long> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    public static final int sumOfShort(Iterable<Short> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += it.next().shortValue();
        }
        return iShortValue;
    }

    public static final <T> List<T> take(Iterable<? extends T> iterable, int i8) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return r.emptyList();
        }
        if (iterable instanceof Collection) {
            if (i8 >= ((Collection) iterable).size()) {
                return r.toList(iterable);
            }
            if (i8 == 1) {
                return r.listOf(first(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i8);
        Iterator<? extends T> it = iterable.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i9++;
            if (i9 == i8) {
                break;
            }
        }
        return C0777t.optimizeReadOnlyList(arrayList);
    }

    public static final <T> List<T> takeLast(List<? extends T> list, int i8) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 == 0) {
            return r.emptyList();
        }
        int size = list.size();
        if (i8 >= size) {
            return r.toList(list);
        }
        if (i8 == 1) {
            return r.listOf(r.last((List) list));
        }
        ArrayList arrayList = new ArrayList(i8);
        if (list instanceof RandomAccess) {
            for (int i9 = size - i8; i9 < size; i9++) {
                arrayList.add(list.get(i9));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i8);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final <T> List<T> takeLastWhile(List<? extends T> list, f7.l predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (list.isEmpty()) {
            return r.emptyList();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!((Boolean) predicate.invoke(listIterator.previous())).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return r.emptyList();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return r.toList(list);
    }

    public static final <T> List<T> takeWhile(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t8 : iterable) {
            if (!((Boolean) predicate.invoke(t8)).booleanValue()) {
                break;
            }
            arrayList.add(t8);
        }
        return arrayList;
    }

    public static final boolean[] toBooleanArray(Collection<Boolean> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            zArr[i8] = it.next().booleanValue();
            i8++;
        }
        return zArr;
    }

    public static final byte[] toByteArray(Collection<Byte> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            bArr[i8] = it.next().byteValue();
            i8++;
        }
        return bArr;
    }

    public static final char[] toCharArray(Collection<Character> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            cArr[i8] = it.next().charValue();
            i8++;
        }
        return cArr;
    }

    public static final <T, C extends Collection<? super T>> C toCollection(Iterable<? extends T> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static final double[] toDoubleArray(Collection<Double> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            dArr[i8] = it.next().doubleValue();
            i8++;
        }
        return dArr;
    }

    public static final float[] toFloatArray(Collection<Float> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            fArr[i8] = it.next().floatValue();
            i8++;
        }
        return fArr;
    }

    public static final <T> HashSet<T> toHashSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (HashSet) toCollection(iterable, new HashSet(Q.mapCapacity(r.collectionSizeOrDefault(iterable, 12))));
    }

    public static final int[] toIntArray(Collection<Integer> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr[i8] = it.next().intValue();
            i8++;
        }
        return iArr;
    }

    public static <T> List<T> toList(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C0777t.optimizeReadOnlyList(toMutableList(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return r.emptyList();
        }
        if (size != 1) {
            return r.toMutableList(collection);
        }
        return r.listOf(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final long[] toLongArray(Collection<Long> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            jArr[i8] = it.next().longValue();
            i8++;
        }
        return jArr;
    }

    public static final <T> List<T> toMutableList(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? r.toMutableList((Collection) iterable) : (List) toCollection(iterable, new ArrayList());
    }

    public static final <T> Set<T> toMutableSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) toCollection(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> toSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return f0.optimizeReadOnlySet((Set) toCollection(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d0.emptySet();
        }
        if (size != 1) {
            return (Set) toCollection(iterable, new LinkedHashSet(Q.mapCapacity(collection.size())));
        }
        return d0.setOf(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final short[] toShortArray(Collection<Short> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] sArr = new short[collection.size()];
        Iterator<Short> it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            sArr[i8] = it.next().shortValue();
            i8++;
        }
        return sArr;
    }

    public static final <T> Set<T> union(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        r.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T> List<List<T>> windowed(Iterable<? extends T> iterable, int i8, int i9, boolean z8) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        i0.checkWindowSizeStep(i8, i9);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itWindowedIterator = i0.windowedIterator(iterable.iterator(), i8, i9, z8, false);
            while (itWindowedIterator.hasNext()) {
                arrayList.add((List) itWindowedIterator.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i9) + (size % i9 == 0 ? 0 : 1));
        int i10 = 0;
        while (i10 >= 0 && i10 < size) {
            int iCoerceAtMost = j7.s.coerceAtMost(i8, size - i10);
            if (iCoerceAtMost < i8 && !z8) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iCoerceAtMost);
            for (int i11 = 0; i11 < iCoerceAtMost; i11++) {
                arrayList3.add(list.get(i11 + i10));
            }
            arrayList2.add(arrayList3);
            i10 += i9;
        }
        return arrayList2;
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i8, int i9, boolean z8, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        return windowed(iterable, i8, i9, z8);
    }

    public static final <T> Iterable<J> withIndex(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new K(new d(iterable));
    }

    public static final <T, R, V> List<V> zip(Iterable<? extends T> iterable, R[] other, f7.p transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(r.collectionSizeOrDefault(iterable, 10), length));
        int i8 = 0;
        for (T t8 : iterable) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(transform.invoke(t8, other[i8]));
            i8++;
        }
        return arrayList;
    }

    public static final <T, R> List<R> zipWithNext(Iterable<? extends T> iterable, f7.p transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return r.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(transform.invoke(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final <T, R> List<R> chunked(Iterable<? extends T> iterable, int i8, f7.l transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowed(iterable, i8, i8, true, transform);
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i8, int i9, boolean z8, f7.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        return windowed(iterable, i8, i9, z8, lVar);
    }

    public static final <T> boolean any(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(Iterable<? extends T> iterable, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t8 : iterable) {
            destination.put(keySelector.invoke(t8), valueTransform.invoke(t8));
        }
        return destination;
    }

    public static final <T> int count(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue() && (i8 = i8 + 1) < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
                r.throwCountOverflow();
            }
        }
        return i8;
    }

    public static final <T> boolean none(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> requireNoNulls(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + Q7.C.PACKAGE_SEPARATOR_CHAR);
            }
        }
        return list;
    }

    public static final <T> List<T> slice(List<? extends T> list, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = r.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return r.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    public static final <T> int indexOfFirst(List<? extends T> list, f7.l predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(List<? extends T> list, f7.l predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (((Boolean) predicate.invoke(listIterator.previous())).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static <T> List<T> toMutableList(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associateBy(Iterable<? extends T> iterable, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(r.collectionSizeOrDefault(iterable, 10)), 16));
        for (T t8 : iterable) {
            linkedHashMap.put(keySelector.invoke(t8), valueTransform.invoke(t8));
        }
        return linkedHashMap;
    }

    public static final <T> int indexOf(List<? extends T> list, T t8) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.indexOf(t8);
    }

    public static final <T> int lastIndexOf(List<? extends T> list, T t8) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.lastIndexOf(t8);
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, T[] elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return r.toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t8 : iterable) {
            if (!AbstractC0765i.contains(elements, t8)) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public static <T> List<T> plus(Collection<? extends T> collection, T t8) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t8);
        return arrayList;
    }

    public static final <T, R, V> List<V> zip(Iterable<? extends T> iterable, Iterable<? extends R> other, f7.p transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(r.collectionSizeOrDefault(iterable, 10), r.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(transform.invoke(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T> T first(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T singleOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> T firstOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T> T lastOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T> T singleOrNull(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean z8 = false;
        T t8 = null;
        for (T t9 : iterable) {
            if (((Boolean) predicate.invoke(t9)).booleanValue()) {
                if (z8) {
                    return null;
                }
                z8 = true;
                t8 = t9;
            }
        }
        if (z8) {
            return t8;
        }
        return null;
    }

    public static final <T> T firstOrNull(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t8 : iterable) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(Iterable<? extends T> iterable, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t8 : iterable) {
            Object objInvoke = keySelector.invoke(t8);
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(t8));
        }
        return destination;
    }

    public static <T> T last(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(r.getLastIndex(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T lastOrNull(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t8 = null;
        for (T t9 : iterable) {
            if (((Boolean) predicate.invoke(t9)).booleanValue()) {
                t8 = t9;
            }
        }
        return t8;
    }

    /* renamed from: maxOrNull */
    public static final Float m131maxOrNull(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* renamed from: maxOrThrow */
    public static final float m132maxOrThrow(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float fFloatValue = it.next().floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, it.next().floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOrNull */
    public static final Float m135minOrNull(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* renamed from: minOrThrow */
    public static final float m136minOrThrow(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float fFloatValue = it.next().floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, it.next().floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, T[] elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Object[]) elements);
        }
        ArrayList arrayList = new ArrayList();
        r.addAll(arrayList, iterable);
        C0782y.addAll(arrayList, elements);
        return arrayList;
    }

    public static final <T> T single(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final <T> List<R6.p> zipWithNext(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return r.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(R6.v.to(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final <T> T first(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t8 : iterable) {
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, List<V>> groupBy(Iterable<? extends T> iterable, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t8 : iterable) {
            Object objInvoke = keySelector.invoke(t8);
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(t8));
        }
        return linkedHashMap;
    }

    public static final <T> T lastOrNull(List<? extends T> list, f7.l predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (((Boolean) predicate.invoke(tPrevious)).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collectionConvertToListIfNotCollection = r.convertToListIfNotCollection(elements);
        if (collectionConvertToListIfNotCollection.isEmpty()) {
            return r.toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t8 : iterable) {
            if (!collectionConvertToListIfNotCollection.contains(t8)) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R6.p> zip(Iterable<? extends T> iterable, R[] other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(r.collectionSizeOrDefault(iterable, 10), length));
        int i8 = 0;
        for (T t8 : iterable) {
            if (i8 >= length) {
                break;
            }
            arrayList.add(R6.v.to(t8, other[i8]));
            i8++;
        }
        return arrayList;
    }

    public static final <T> T last(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t8 = null;
        boolean z8 = false;
        for (T t9 : iterable) {
            if (((Boolean) predicate.invoke(t9)).booleanValue()) {
                z8 = true;
                t8 = t9;
            }
        }
        if (z8) {
            return t8;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final <T> List<T> plus(Collection<? extends T> collection, T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        C0782y.addAll(arrayList, elements);
        return arrayList;
    }

    public static final <T> T single(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t8 = null;
        boolean z8 = false;
        for (T t9 : iterable) {
            if (((Boolean) predicate.invoke(t9)).booleanValue()) {
                if (z8) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z8 = true;
                t8 = t9;
            }
        }
        if (z8) {
            return t8;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final <T, R> List<R> windowed(Iterable<? extends T> iterable, int i8, int i9, boolean z8, f7.l transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        i0.checkWindowSizeStep(i8, i9);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i10 = 0;
            ArrayList arrayList = new ArrayList((size / i9) + (size % i9 == 0 ? 0 : 1));
            X x8 = new X(list);
            while (i10 >= 0 && i10 < size) {
                int iCoerceAtMost = j7.s.coerceAtMost(i8, size - i10);
                if (!z8 && iCoerceAtMost < i8) {
                    break;
                }
                x8.move(i10, iCoerceAtMost + i10);
                arrayList.add(transform.invoke(x8));
                i10 += i9;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator itWindowedIterator = i0.windowedIterator(iterable.iterator(), i8, i9, z8, true);
        while (itWindowedIterator.hasNext()) {
            arrayList2.add(transform.invoke((List) itWindowedIterator.next()));
        }
        return arrayList2;
    }

    public static final <T> T last(List<? extends T> list, f7.l predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (((Boolean) predicate.invoke(tPrevious)).booleanValue()) {
                return tPrevious;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public static final <T extends Comparable<? super T>> T maxOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* renamed from: maxOrThrow */
    public static final <T extends Comparable<? super T>> T m133maxOrThrow(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    public static <T extends Comparable<? super T>> T minOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* renamed from: minOrThrow */
    public static final <T extends Comparable<? super T>> T m137minOrThrow(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return r.plus((Collection) iterable, (Iterable) elements);
        }
        ArrayList arrayList = new ArrayList();
        r.addAll(arrayList, iterable);
        r.addAll(arrayList, elements);
        return arrayList;
    }

    public static <T, R> List<R6.p> zip(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(r.collectionSizeOrDefault(iterable, 10), r.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(R6.v.to(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, k7.m elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = k7.p.toList(elements);
        if (list.isEmpty()) {
            return r.toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t8 : iterable) {
            if (!list.contains(t8)) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public static <T> List<T> plus(Collection<? extends T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        r.addAll(arrayList2, elements);
        return arrayList2;
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, k7.m elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList();
        r.addAll(arrayList, iterable);
        r.addAll(arrayList, elements);
        return arrayList;
    }

    public static final <T> List<T> plus(Collection<? extends T> collection, k7.m elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        r.addAll(arrayList, elements);
        return arrayList;
    }
}
