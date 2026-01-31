package f3;

import f3.AbstractC5457d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: f3.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5465h0 extends AbstractC5457d0 implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final u1 f30945b = new b(Z0.f30851e, 0);

    /* renamed from: f3.h0$a */
    public static final class a extends AbstractC5457d0.a {
        public a() {
            this(4);
        }

        @Override // f3.AbstractC5457d0.a, f3.AbstractC5457d0.b
        public /* bridge */ /* synthetic */ AbstractC5457d0.b addAll(Iterable iterable) {
            return addAll((Iterable<Object>) iterable);
        }

        a(int i8) {
            super(i8);
        }

        @Override // f3.AbstractC5457d0.b
        public /* bridge */ /* synthetic */ AbstractC5457d0.b addAll(Iterator it) {
            return addAll((Iterator<Object>) it);
        }

        @Override // f3.AbstractC5457d0.b
        public AbstractC5465h0 build() {
            this.f30924c = true;
            return AbstractC5465h0.f(this.f30922a, this.f30923b);
        }

        @Override // f3.AbstractC5457d0.a, f3.AbstractC5457d0.b
        public a addAll(Iterable<Object> iterable) {
            super.addAll(iterable);
            return this;
        }

        @Override // f3.AbstractC5457d0.a, f3.AbstractC5457d0.b
        public a add(Object obj) {
            super.add(obj);
            return this;
        }

        @Override // f3.AbstractC5457d0.b
        public a addAll(Iterator<Object> it) {
            super.addAll(it);
            return this;
        }

        @Override // f3.AbstractC5457d0.a, f3.AbstractC5457d0.b
        public a add(Object... objArr) {
            super.add(objArr);
            return this;
        }
    }

    /* renamed from: f3.h0$b */
    static class b extends AbstractC5450a {

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC5465h0 f30946c;

        b(AbstractC5465h0 abstractC5465h0, int i8) {
            super(abstractC5465h0.size(), i8);
            this.f30946c = abstractC5465h0;
        }

        @Override // f3.AbstractC5450a
        protected Object get(int i8) {
            return this.f30946c.get(i8);
        }
    }

    /* renamed from: f3.h0$c */
    private static class c extends AbstractC5465h0 {

        /* renamed from: c, reason: collision with root package name */
        private final transient AbstractC5465h0 f30947c;

        c(AbstractC5465h0 abstractC5465h0) {
            this.f30947c = abstractC5465h0;
        }

        private int i(int i8) {
            return (size() - 1) - i8;
        }

        private int j(int i8) {
            return size() - i8;
        }

        @Override // f3.AbstractC5465h0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f30947c.contains(obj);
        }

        @Override // java.util.List
        public Object get(int i8) {
            e3.w.checkElementIndex(i8, size());
            return this.f30947c.get(i(i8));
        }

        @Override // f3.AbstractC5465h0, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f30947c.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return i(iLastIndexOf);
            }
            return -1;
        }

        @Override // f3.AbstractC5457d0
        boolean isPartialView() {
            return this.f30947c.isPartialView();
        }

        @Override // f3.AbstractC5465h0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // f3.AbstractC5465h0, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f30947c.indexOf(obj);
            if (iIndexOf >= 0) {
                return i(iIndexOf);
            }
            return -1;
        }

        @Override // f3.AbstractC5465h0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // f3.AbstractC5465h0
        public AbstractC5465h0 reverse() {
            return this.f30947c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f30947c.size();
        }

        @Override // f3.AbstractC5465h0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i8) {
            return super.listIterator(i8);
        }

        @Override // f3.AbstractC5465h0, java.util.List
        public AbstractC5465h0 subList(int i8, int i9) {
            e3.w.checkPositionIndexes(i8, i9, size());
            return this.f30947c.subList(j(i9), j(i8)).reverse();
        }
    }

    /* renamed from: f3.h0$d */
    class d extends AbstractC5465h0 {

        /* renamed from: c, reason: collision with root package name */
        final transient int f30948c;

        /* renamed from: d, reason: collision with root package name */
        final transient int f30949d;

        d(int i8, int i9) {
            this.f30948c = i8;
            this.f30949d = i9;
        }

        @Override // f3.AbstractC5457d0
        Object[] b() {
            return AbstractC5465h0.this.b();
        }

        @Override // f3.AbstractC5457d0
        int c() {
            return AbstractC5465h0.this.d() + this.f30948c + this.f30949d;
        }

        @Override // f3.AbstractC5457d0
        int d() {
            return AbstractC5465h0.this.d() + this.f30948c;
        }

        @Override // java.util.List
        public Object get(int i8) {
            e3.w.checkElementIndex(i8, this.f30949d);
            return AbstractC5465h0.this.get(i8 + this.f30948c);
        }

        @Override // f3.AbstractC5457d0
        boolean isPartialView() {
            return true;
        }

        @Override // f3.AbstractC5465h0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // f3.AbstractC5465h0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f30949d;
        }

        @Override // f3.AbstractC5465h0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i8) {
            return super.listIterator(i8);
        }

        @Override // f3.AbstractC5465h0, java.util.List
        public AbstractC5465h0 subList(int i8, int i9) {
            e3.w.checkPositionIndexes(i8, i9, this.f30949d);
            AbstractC5465h0 abstractC5465h0 = AbstractC5465h0.this;
            int i10 = this.f30948c;
            return abstractC5465h0.subList(i8 + i10, i9 + i10);
        }
    }

    AbstractC5465h0() {
    }

    public static <E> a builder() {
        return new a();
    }

    public static <E> a builderWithExpectedSize(int i8) {
        AbstractC5484r.b(i8, "expectedSize");
        return new a(i8);
    }

    public static <E> AbstractC5465h0 copyOf(Iterable<? extends E> iterable) {
        e3.w.checkNotNull(iterable);
        return iterable instanceof Collection ? copyOf((Collection) iterable) : copyOf(iterable.iterator());
    }

    static AbstractC5465h0 e(Object[] objArr) {
        return f(objArr, objArr.length);
    }

    static AbstractC5465h0 f(Object[] objArr, int i8) {
        return i8 == 0 ? of() : new Z0(objArr, i8);
    }

    private static AbstractC5465h0 g(Object... objArr) {
        return e(Q0.b(objArr));
    }

    public static <E> AbstractC5465h0 of() {
        return Z0.f30851e;
    }

    public static <E extends Comparable<? super E>> AbstractC5465h0 sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) AbstractC5493v0.g(iterable, new Comparable[0]);
        Q0.b(comparableArr);
        Arrays.sort(comparableArr);
        return e(comparableArr);
    }

    @Override // f3.AbstractC5457d0
    int a(Object[] objArr, int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i8 + i9] = get(i9);
        }
        return i8 + size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i8, Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return A0.c(this, obj);
    }

    AbstractC5465h0 h(int i8, int i9) {
        return new d(i8, i9 - i8);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i8 = 1;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = ~(~((i8 * 31) + get(i9).hashCode()));
        }
        return i8;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return A0.d(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return A0.f(this, obj);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i8) {
        throw new UnsupportedOperationException();
    }

    public AbstractC5465h0 reverse() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <E> AbstractC5465h0 of(E e8) {
        return g(e8);
    }

    @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public t1 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public AbstractC5465h0 subList(int i8, int i9) {
        e3.w.checkPositionIndexes(i8, i9, size());
        int i10 = i9 - i8;
        return i10 == size() ? this : i10 == 0 ? of() : h(i8, i9);
    }

    public static <E> AbstractC5465h0 of(E e8, E e9) {
        return g(e8, e9);
    }

    @Override // java.util.List
    public u1 listIterator() {
        return listIterator(0);
    }

    public static <E> AbstractC5465h0 of(E e8, E e9, E e10) {
        return g(e8, e9, e10);
    }

    @Override // java.util.List
    public u1 listIterator(int i8) {
        e3.w.checkPositionIndex(i8, size());
        if (isEmpty()) {
            return f30945b;
        }
        return new b(this, i8);
    }

    public static <E> AbstractC5465h0 copyOf(Collection<? extends E> collection) {
        if (collection instanceof AbstractC5457d0) {
            AbstractC5465h0 abstractC5465h0AsList = ((AbstractC5457d0) collection).asList();
            return abstractC5465h0AsList.isPartialView() ? e(abstractC5465h0AsList.toArray()) : abstractC5465h0AsList;
        }
        return g(collection.toArray());
    }

    public static <E> AbstractC5465h0 of(E e8, E e9, E e10, E e11) {
        return g(e8, e9, e10, e11);
    }

    public static <E> AbstractC5465h0 sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        e3.w.checkNotNull(comparator);
        Object[] objArrF = AbstractC5493v0.f(iterable);
        Q0.b(objArrF);
        Arrays.sort(objArrF, comparator);
        return e(objArrF);
    }

    public static <E> AbstractC5465h0 of(E e8, E e9, E e10, E e11, E e12) {
        return g(e8, e9, e10, e11, e12);
    }

    public static <E> AbstractC5465h0 of(E e8, E e9, E e10, E e11, E e12, E e13) {
        return g(e8, e9, e10, e11, e12, e13);
    }

    public static <E> AbstractC5465h0 of(E e8, E e9, E e10, E e11, E e12, E e13, E e14) {
        return g(e8, e9, e10, e11, e12, e13, e14);
    }

    public static <E> AbstractC5465h0 copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new a().add((Object) next).addAll((Iterator<Object>) it).build();
    }

    public static <E> AbstractC5465h0 of(E e8, E e9, E e10, E e11, E e12, E e13, E e14, E e15) {
        return g(e8, e9, e10, e11, e12, e13, e14, e15);
    }

    public static <E> AbstractC5465h0 of(E e8, E e9, E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return g(e8, e9, e10, e11, e12, e13, e14, e15, e16);
    }

    public static <E> AbstractC5465h0 of(E e8, E e9, E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17) {
        return g(e8, e9, e10, e11, e12, e13, e14, e15, e16, e17);
    }

    public static <E> AbstractC5465h0 of(E e8, E e9, E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18) {
        return g(e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18);
    }

    @SafeVarargs
    public static <E> AbstractC5465h0 of(E e8, E e9, E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E... eArr) {
        e3.w.checkArgument(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e8;
        objArr[1] = e9;
        objArr[2] = e10;
        objArr[3] = e11;
        objArr[4] = e12;
        objArr[5] = e13;
        objArr[6] = e14;
        objArr[7] = e15;
        objArr[8] = e16;
        objArr[9] = e17;
        objArr[10] = e18;
        objArr[11] = e19;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return g(objArr);
    }

    public static <E> AbstractC5465h0 copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return of();
        }
        return g((Object[]) eArr.clone());
    }

    @Override // f3.AbstractC5457d0
    @Deprecated
    public final AbstractC5465h0 asList() {
        return this;
    }
}
