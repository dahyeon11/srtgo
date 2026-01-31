package f3;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import r4.C6174a;

/* renamed from: f3.s */
/* loaded from: classes2.dex */
public abstract class AbstractC5486s {

    /* renamed from: f3.s$a */
    static class a extends AbstractCollection {

        /* renamed from: a */
        final Collection f31087a;

        /* renamed from: b */
        final e3.x f31088b;

        a(Collection collection, e3.x xVar) {
            this.f31087a = collection;
            this.f31088b = xVar;
        }

        a a(e3.x xVar) {
            return new a(this.f31087a, e3.y.and(this.f31088b, xVar));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            e3.w.checkArgument(this.f31088b.apply(obj));
            return this.f31087a.add(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<Object> collection) {
            Iterator<Object> it = collection.iterator();
            while (it.hasNext()) {
                e3.w.checkArgument(this.f31088b.apply(it.next()));
            }
            return this.f31087a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC5493v0.removeIf(this.f31087a, this.f31088b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (AbstractC5486s.f(this.f31087a, obj)) {
                return this.f31088b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC5486s.b(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !AbstractC5493v0.any(this.f31087a, this.f31088b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return AbstractC5495w0.filter(this.f31087a.iterator(), this.f31088b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f31087a.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator it = this.f31087a.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f31088b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z8 = true;
                }
            }
            return z8;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator it = this.f31087a.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f31088b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z8 = true;
                }
            }
            return z8;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator it = this.f31087a.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                if (this.f31088b.apply(it.next())) {
                    i8++;
                }
            }
            return i8;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return A0.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) A0.newArrayList(iterator()).toArray(tArr);
        }
    }

    /* renamed from: f3.s$b */
    private static final class b extends AbstractCollection {

        /* renamed from: a */
        final AbstractC5465h0 f31089a;

        /* renamed from: b */
        final Comparator f31090b;

        /* renamed from: c */
        final int f31091c;

        b(Iterable iterable, Comparator comparator) {
            AbstractC5465h0 abstractC5465h0SortedCopyOf = AbstractC5465h0.sortedCopyOf(comparator, iterable);
            this.f31089a = abstractC5465h0SortedCopyOf;
            this.f31090b = comparator;
            this.f31091c = a(abstractC5465h0SortedCopyOf, comparator);
        }

        private static int a(List list, Comparator comparator) {
            int i8 = 1;
            int iSaturatedMultiply = 1;
            int i9 = 1;
            while (i8 < list.size()) {
                if (comparator.compare(list.get(i8 - 1), list.get(i8)) < 0) {
                    iSaturatedMultiply = i3.b.saturatedMultiply(iSaturatedMultiply, i3.b.binomial(i8, i9));
                    if (iSaturatedMultiply == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    i9 = 0;
                }
                i8++;
                i9++;
            }
            return i3.b.saturatedMultiply(iSaturatedMultiply, i3.b.binomial(i8, i9));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return AbstractC5486s.d(this.f31089a, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<Object>> iterator() {
            return new c(this.f31089a, this.f31090b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f31091c;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "orderedPermutationCollection(" + this.f31089a + ")";
        }
    }

    /* renamed from: f3.s$c */
    private static final class c extends AbstractC5452b {

        /* renamed from: c */
        List f31092c;

        /* renamed from: d */
        final Comparator f31093d;

        c(List list, Comparator comparator) {
            this.f31092c = A0.newArrayList(list);
            this.f31093d = comparator;
        }

        void c() {
            int iE = e();
            if (iE == -1) {
                this.f31092c = null;
                return;
            }
            Objects.requireNonNull(this.f31092c);
            Collections.swap(this.f31092c, iE, f(iE));
            Collections.reverse(this.f31092c.subList(iE + 1, this.f31092c.size()));
        }

        @Override // f3.AbstractC5452b
        /* renamed from: d */
        public List computeNext() {
            List list = this.f31092c;
            if (list == null) {
                return (List) a();
            }
            AbstractC5465h0 abstractC5465h0CopyOf = AbstractC5465h0.copyOf((Collection) list);
            c();
            return abstractC5465h0CopyOf;
        }

        int e() {
            Objects.requireNonNull(this.f31092c);
            for (int size = this.f31092c.size() - 2; size >= 0; size--) {
                if (this.f31093d.compare(this.f31092c.get(size), this.f31092c.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        int f(int i8) {
            Objects.requireNonNull(this.f31092c);
            Object obj = this.f31092c.get(i8);
            for (int size = this.f31092c.size() - 1; size > i8; size--) {
                if (this.f31093d.compare(obj, this.f31092c.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }
    }

    /* renamed from: f3.s$d */
    private static final class d extends AbstractCollection {

        /* renamed from: a */
        final AbstractC5465h0 f31094a;

        d(AbstractC5465h0 abstractC5465h0) {
            this.f31094a = abstractC5465h0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return AbstractC5486s.d(this.f31094a, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<Object>> iterator() {
            return new e(this.f31094a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return i3.b.factorial(this.f31094a.size());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "permutations(" + this.f31094a + ")";
        }
    }

    /* renamed from: f3.s$e */
    private static class e extends AbstractC5452b {

        /* renamed from: c */
        final List f31095c;

        /* renamed from: d */
        final int[] f31096d;

        /* renamed from: e */
        final int[] f31097e;

        /* renamed from: f */
        int f31098f;

        e(List list) {
            this.f31095c = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.f31096d = iArr;
            int[] iArr2 = new int[size];
            this.f31097e = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
            this.f31098f = Integer.MAX_VALUE;
        }

        void c() {
            int size = this.f31095c.size() - 1;
            this.f31098f = size;
            if (size == -1) {
                return;
            }
            int i8 = 0;
            while (true) {
                int[] iArr = this.f31096d;
                int i9 = this.f31098f;
                int i10 = iArr[i9];
                int i11 = this.f31097e[i9] + i10;
                if (i11 < 0) {
                    e();
                } else if (i11 != i9 + 1) {
                    Collections.swap(this.f31095c, (i9 - i10) + i8, (i9 - i11) + i8);
                    this.f31096d[this.f31098f] = i11;
                    return;
                } else {
                    if (i9 == 0) {
                        return;
                    }
                    i8++;
                    e();
                }
            }
        }

        @Override // f3.AbstractC5452b
        /* renamed from: d */
        public List computeNext() {
            if (this.f31098f <= 0) {
                return (List) a();
            }
            AbstractC5465h0 abstractC5465h0CopyOf = AbstractC5465h0.copyOf((Collection) this.f31095c);
            c();
            return abstractC5465h0CopyOf;
        }

        void e() {
            int[] iArr = this.f31097e;
            int i8 = this.f31098f;
            iArr[i8] = -iArr[i8];
            this.f31098f = i8 - 1;
        }
    }

    /* renamed from: f3.s$f */
    static class f extends AbstractCollection {

        /* renamed from: a */
        final Collection f31099a;

        /* renamed from: b */
        final e3.l f31100b;

        f(Collection collection, e3.l lVar) {
            this.f31099a = (Collection) e3.w.checkNotNull(collection);
            this.f31100b = (e3.l) e3.w.checkNotNull(lVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f31099a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f31099a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return AbstractC5495w0.transform(this.f31099a.iterator(), this.f31100b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f31099a.size();
        }
    }

    static boolean b(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static R0 c(Collection collection) {
        R0 r02 = new R0();
        for (Object obj : collection) {
            r02.put(obj, r02.get(obj) + 1);
        }
        return r02;
    }

    public static boolean d(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        R0 r0C = c(list);
        R0 r0C2 = c(list2);
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (r0C.i(i8) != r0C2.get(r0C.g(i8))) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder e(int i8) {
        AbstractC5484r.b(i8, "size");
        return new StringBuilder((int) Math.min(i8 * 8, C6174a.GB));
    }

    static boolean f(Collection collection, Object obj) {
        e3.w.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <E> Collection<E> filter(Collection<E> collection, e3.x xVar) {
        return collection instanceof a ? ((a) collection).a(xVar) : new a((Collection) e3.w.checkNotNull(collection), (e3.x) e3.w.checkNotNull(xVar));
    }

    public static <E extends Comparable<? super E>> Collection<List<E>> orderedPermutations(Iterable<E> iterable) {
        return orderedPermutations(iterable, T0.natural());
    }

    public static <E> Collection<List<E>> permutations(Collection<E> collection) {
        return new d(AbstractC5465h0.copyOf((Collection) collection));
    }

    public static <F, T> Collection<T> transform(Collection<F> collection, e3.l lVar) {
        return new f(collection, lVar);
    }

    public static <E> Collection<List<E>> orderedPermutations(Iterable<E> iterable, Comparator<? super E> comparator) {
        return new b(iterable, comparator);
    }
}
