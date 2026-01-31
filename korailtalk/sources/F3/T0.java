package f3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class T0 implements Comparator {

    static class a extends T0 {

        /* renamed from: a */
        private final AtomicInteger f30837a = new AtomicInteger(0);

        /* renamed from: b */
        private final ConcurrentMap f30838b = V0.e(new C0()).makeMap();

        a() {
        }

        private Integer b(Object obj) {
            Integer num = (Integer) this.f30838b.get(obj);
            if (num != null) {
                return num;
            }
            Integer numValueOf = Integer.valueOf(this.f30837a.getAndIncrement());
            Integer num2 = (Integer) this.f30838b.putIfAbsent(obj, numValueOf);
            return num2 != null ? num2 : numValueOf;
        }

        int c(Object obj) {
            return System.identityHashCode(obj);
        }

        @Override // f3.T0, java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int iC = c(obj);
            int iC2 = c(obj2);
            if (iC != iC2) {
                return iC < iC2 ? -1 : 1;
            }
            int iCompareTo = b(obj).compareTo(b(obj2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    private static class b {

        /* renamed from: a */
        static final T0 f30839a = new a();
    }

    static class c extends ClassCastException {

        /* renamed from: a */
        final Object f30840a;

        c(Object obj) {
            super("Cannot compare value: " + obj);
            this.f30840a = obj;
        }
    }

    protected T0() {
    }

    public static T0 allEqual() {
        return C5472l.f31011a;
    }

    public static T0 arbitrary() {
        return b.f30839a;
    }

    public static <T> T0 explicit(List<T> list) {
        return new C5411D(list);
    }

    public static <T> T0 from(Comparator<T> comparator) {
        return comparator instanceof T0 ? (T0) comparator : new C5494w(comparator);
    }

    public static <C extends Comparable> T0 natural() {
        return M0.f30813c;
    }

    public static T0 usingToString() {
        return w1.f31189a;
    }

    T0 a() {
        return onResultOf(E0.t());
    }

    @Deprecated
    public int binarySearch(List<Object> list, Object obj) {
        return Collections.binarySearch(list, obj, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public <U> T0 compound(Comparator<? super U> comparator) {
        return new C5496x(this, (Comparator) e3.w.checkNotNull(comparator));
    }

    public <E> List<E> greatestOf(Iterable<E> iterable, int i8) {
        return reverse().leastOf(iterable, i8);
    }

    public <E> AbstractC5465h0 immutableSortedCopy(Iterable<E> iterable) {
        return AbstractC5465h0.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E> List<E> leastOf(Iterable<E> iterable, int i8) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= i8 * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i8) {
                    array = Arrays.copyOf(array, i8);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i8);
    }

    public <S> T0 lexicographical() {
        return new C5499y0(this);
    }

    public <E> E max(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) max(next, it.next());
        }
        return next;
    }

    public <E> E min(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) min(next, it.next());
        }
        return next;
    }

    public <S> T0 nullsFirst() {
        return new O0(this);
    }

    public <S> T0 nullsLast() {
        return new P0(this);
    }

    public <F> T0 onResultOf(e3.l lVar) {
        return new C5480p(lVar, this);
    }

    public <S> T0 reverse() {
        return new f1(this);
    }

    public <E> List<E> sortedCopy(Iterable<E> iterable) {
        Object[] objArrF = AbstractC5493v0.f(iterable);
        Arrays.sort(objArrF, this);
        return A0.newArrayList(Arrays.asList(objArrF));
    }

    public static <T> T0 compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new C5496x(iterable);
    }

    public static <T> T0 explicit(T t8, T... tArr) {
        return explicit(A0.asList(t8, tArr));
    }

    public <E> List<E> greatestOf(Iterator<E> it, int i8) {
        return reverse().leastOf(it, i8);
    }

    @Deprecated
    public static <T> T0 from(T0 t02) {
        return (T0) e3.w.checkNotNull(t02);
    }

    public <E> E max(Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    public <E> E min(Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    public <E> E max(E e8, E e9) {
        return compare(e8, e9) >= 0 ? e8 : e9;
    }

    public <E> E min(E e8, E e9) {
        return compare(e8, e9) <= 0 ? e8 : e9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> E max(E e8, E e9, E e10, E... eArr) {
        E e11 = (E) max(max(e8, e9), e10);
        for (E e12 : eArr) {
            e11 = (E) max(e11, e12);
        }
        return e11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> E min(E e8, E e9, E e10, E... eArr) {
        E e11 = (E) min(min(e8, e9), e10);
        for (E e12 : eArr) {
            e11 = (E) min(e11, e12);
        }
        return e11;
    }

    public <E> List<E> leastOf(Iterator<E> it, int i8) {
        e3.w.checkNotNull(it);
        AbstractC5484r.b(i8, "k");
        if (i8 == 0 || !it.hasNext()) {
            return Collections.emptyList();
        }
        if (i8 >= 1073741823) {
            ArrayList arrayListNewArrayList = A0.newArrayList(it);
            Collections.sort(arrayListNewArrayList, this);
            if (arrayListNewArrayList.size() > i8) {
                arrayListNewArrayList.subList(i8, arrayListNewArrayList.size()).clear();
            }
            arrayListNewArrayList.trimToSize();
            return Collections.unmodifiableList(arrayListNewArrayList);
        }
        q1 q1VarLeast = q1.least(i8, this);
        q1VarLeast.offerAll(it);
        return (List<E>) q1VarLeast.topK();
    }
}
