package f3;

import f3.AbstractC5457d0;
import f3.AbstractC5483q0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: f3.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5487s0 extends AbstractC5489t0 implements NavigableSet, j1 {

    /* renamed from: c, reason: collision with root package name */
    final transient Comparator f31101c;

    /* renamed from: d, reason: collision with root package name */
    transient AbstractC5487s0 f31102d;

    /* renamed from: f3.s0$a */
    public static final class a extends AbstractC5483q0.a {

        /* renamed from: f, reason: collision with root package name */
        private final Comparator f31103f;

        public a(Comparator<Object> comparator) {
            this.f31103f = (Comparator) e3.w.checkNotNull(comparator);
        }

        @Override // f3.AbstractC5483q0.a, f3.AbstractC5457d0.a, f3.AbstractC5457d0.b
        public /* bridge */ /* synthetic */ AbstractC5457d0.b addAll(Iterable iterable) {
            return addAll((Iterable<Object>) iterable);
        }

        @Override // f3.AbstractC5483q0.a, f3.AbstractC5457d0.b
        public /* bridge */ /* synthetic */ AbstractC5457d0.b addAll(Iterator it) {
            return addAll((Iterator<Object>) it);
        }

        @Override // f3.AbstractC5483q0.a, f3.AbstractC5457d0.a, f3.AbstractC5457d0.b
        public /* bridge */ /* synthetic */ AbstractC5483q0.a addAll(Iterable iterable) {
            return addAll((Iterable<Object>) iterable);
        }

        @Override // f3.AbstractC5483q0.a, f3.AbstractC5457d0.b
        public AbstractC5487s0 build() {
            AbstractC5487s0 abstractC5487s0L = AbstractC5487s0.l(this.f31103f, this.f30923b, this.f30922a);
            this.f30923b = abstractC5487s0L.size();
            this.f30924c = true;
            return abstractC5487s0L;
        }

        @Override // f3.AbstractC5483q0.a, f3.AbstractC5457d0.b
        public /* bridge */ /* synthetic */ AbstractC5483q0.a addAll(Iterator it) {
            return addAll((Iterator<Object>) it);
        }

        @Override // f3.AbstractC5483q0.a, f3.AbstractC5457d0.a, f3.AbstractC5457d0.b
        public a addAll(Iterable<Object> iterable) {
            super.addAll(iterable);
            return this;
        }

        @Override // f3.AbstractC5483q0.a, f3.AbstractC5457d0.a, f3.AbstractC5457d0.b
        public a add(Object obj) {
            super.add(obj);
            return this;
        }

        @Override // f3.AbstractC5483q0.a, f3.AbstractC5457d0.b
        public a addAll(Iterator<Object> it) {
            super.addAll(it);
            return this;
        }

        @Override // f3.AbstractC5483q0.a, f3.AbstractC5457d0.a, f3.AbstractC5457d0.b
        public a add(Object... objArr) {
            super.add(objArr);
            return this;
        }
    }

    AbstractC5487s0(Comparator comparator) {
        this.f31101c = comparator;
    }

    public static <E extends Comparable<? super E>> AbstractC5487s0 copyOf(E[] eArr) {
        return l(T0.natural(), eArr.length, (Comparable[]) eArr.clone());
    }

    public static <E> AbstractC5487s0 copyOfSorted(SortedSet<E> sortedSet) {
        Comparator comparator = k1.comparator(sortedSet);
        AbstractC5465h0 abstractC5465h0CopyOf = AbstractC5465h0.copyOf((Collection) sortedSet);
        return abstractC5465h0CopyOf.isEmpty() ? n(comparator) : new d1(abstractC5465h0CopyOf, comparator);
    }

    static AbstractC5487s0 l(Comparator comparator, int i8, Object... objArr) {
        if (i8 == 0) {
            return n(comparator);
        }
        Q0.c(objArr, i8);
        Arrays.sort(objArr, 0, i8, comparator);
        int i9 = 1;
        for (int i10 = 1; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (comparator.compare(obj, objArr[i9 - 1]) != 0) {
                objArr[i9] = obj;
                i9++;
            }
        }
        Arrays.fill(objArr, i9, i8, (Object) null);
        if (i9 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i9);
        }
        return new d1(AbstractC5465h0.f(objArr, i9), comparator);
    }

    static d1 n(Comparator comparator) {
        return T0.natural().equals(comparator) ? d1.f30925f : new d1(AbstractC5465h0.of(), comparator);
    }

    public static <E extends Comparable<?>> a naturalOrder() {
        return new a(T0.natural());
    }

    public static <E> AbstractC5487s0 of() {
        return d1.f30925f;
    }

    public static <E> a orderedBy(Comparator<E> comparator) {
        return new a(comparator);
    }

    public static <E extends Comparable<?>> a reverseOrder() {
        return new a(Collections.reverseOrder());
    }

    static int s(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    public Object ceiling(Object obj) {
        return AbstractC5493v0.getFirst(tailSet(obj, true), null);
    }

    @Override // java.util.SortedSet, f3.j1
    public Comparator<Object> comparator() {
        return this.f31101c;
    }

    @Override // java.util.NavigableSet
    public abstract t1 descendingIterator();

    public Object first() {
        return iterator().next();
    }

    public Object floor(Object obj) {
        return AbstractC5495w0.getNext(headSet(obj, true).descendingIterator(), null);
    }

    public Object higher(Object obj) {
        return AbstractC5493v0.getFirst(tailSet(obj, false), null);
    }

    @Override // f3.AbstractC5483q0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract t1 iterator();

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        return AbstractC5495w0.getNext(headSet(obj, false).descendingIterator(), null);
    }

    abstract AbstractC5487s0 m();

    abstract AbstractC5487s0 o(Object obj, boolean z8);

    abstract AbstractC5487s0 p(Object obj, boolean z8, Object obj2, boolean z9);

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    abstract AbstractC5487s0 q(Object obj, boolean z8);

    int r(Object obj, Object obj2) {
        return s(this.f31101c, obj, obj2);
    }

    public static <E> AbstractC5487s0 copyOf(Iterable<? extends E> iterable) {
        return copyOf(T0.natural(), iterable);
    }

    public static <E extends Comparable<? super E>> AbstractC5487s0 of(E e8) {
        return new d1(AbstractC5465h0.of(e8), T0.natural());
    }

    @Override // java.util.NavigableSet
    public AbstractC5487s0 descendingSet() {
        AbstractC5487s0 abstractC5487s0 = this.f31102d;
        if (abstractC5487s0 != null) {
            return abstractC5487s0;
        }
        AbstractC5487s0 abstractC5487s0M = m();
        this.f31102d = abstractC5487s0M;
        abstractC5487s0M.f31102d = this;
        return abstractC5487s0M;
    }

    public static <E extends Comparable<? super E>> AbstractC5487s0 of(E e8, E e9) {
        return l(T0.natural(), 2, e8, e9);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public AbstractC5487s0 headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public AbstractC5487s0 subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public AbstractC5487s0 tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public static <E> AbstractC5487s0 copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator) T0.natural(), (Collection) collection);
    }

    public static <E extends Comparable<? super E>> AbstractC5487s0 of(E e8, E e9, E e10) {
        return l(T0.natural(), 3, e8, e9, e10);
    }

    @Override // java.util.NavigableSet
    public AbstractC5487s0 headSet(Object obj, boolean z8) {
        return o(e3.w.checkNotNull(obj), z8);
    }

    @Override // java.util.NavigableSet
    public AbstractC5487s0 subSet(Object obj, boolean z8, Object obj2, boolean z9) {
        e3.w.checkNotNull(obj);
        e3.w.checkNotNull(obj2);
        e3.w.checkArgument(this.f31101c.compare(obj, obj2) <= 0);
        return p(obj, z8, obj2, z9);
    }

    @Override // java.util.NavigableSet
    public AbstractC5487s0 tailSet(Object obj, boolean z8) {
        return q(e3.w.checkNotNull(obj), z8);
    }

    public static <E extends Comparable<? super E>> AbstractC5487s0 of(E e8, E e9, E e10, E e11) {
        return l(T0.natural(), 4, e8, e9, e10, e11);
    }

    public static <E> AbstractC5487s0 copyOf(Iterator<? extends E> it) {
        return copyOf(T0.natural(), it);
    }

    public static <E extends Comparable<? super E>> AbstractC5487s0 of(E e8, E e9, E e10, E e11, E e12) {
        return l(T0.natural(), 5, e8, e9, e10, e11, e12);
    }

    public static <E extends Comparable<? super E>> AbstractC5487s0 of(E e8, E e9, E e10, E e11, E e12, E e13, E... eArr) {
        int length = eArr.length + 6;
        Comparable[] comparableArr = new Comparable[length];
        comparableArr[0] = e8;
        comparableArr[1] = e9;
        comparableArr[2] = e10;
        comparableArr[3] = e11;
        comparableArr[4] = e12;
        comparableArr[5] = e13;
        System.arraycopy(eArr, 0, comparableArr, 6, eArr.length);
        return l(T0.natural(), length, comparableArr);
    }

    public static <E> AbstractC5487s0 copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        return new a(comparator).addAll((Iterator<Object>) it).build();
    }

    public static <E> AbstractC5487s0 copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        e3.w.checkNotNull(comparator);
        if (k1.hasSameComparator(comparator, iterable) && (iterable instanceof AbstractC5487s0)) {
            AbstractC5487s0 abstractC5487s0 = (AbstractC5487s0) iterable;
            if (!abstractC5487s0.isPartialView()) {
                return abstractC5487s0;
            }
        }
        Object[] objArrF = AbstractC5493v0.f(iterable);
        return l(comparator, objArrF.length, objArrF);
    }

    public static <E> AbstractC5487s0 copyOf(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return copyOf((Comparator) comparator, (Iterable) collection);
    }
}
