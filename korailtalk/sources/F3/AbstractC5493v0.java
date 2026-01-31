package f3;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: f3.v0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5493v0 {

    /* renamed from: f3.v0$a */
    class a extends AbstractC5442N {

        /* renamed from: b */
        final /* synthetic */ Iterable f31137b;

        a(Iterable iterable) {
            this.f31137b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return AbstractC5495w0.cycle(this.f31137b);
        }

        @Override // f3.AbstractC5442N
        public String toString() {
            return this.f31137b.toString() + " (cycled)";
        }
    }

    /* renamed from: f3.v0$b */
    class b extends AbstractC5442N {

        /* renamed from: b */
        final /* synthetic */ Iterable f31138b;

        /* renamed from: c */
        final /* synthetic */ int f31139c;

        b(Iterable iterable, int i8) {
            this.f31138b = iterable;
            this.f31139c = i8;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return AbstractC5495w0.partition(this.f31138b.iterator(), this.f31139c);
        }
    }

    /* renamed from: f3.v0$c */
    class c extends AbstractC5442N {

        /* renamed from: b */
        final /* synthetic */ Iterable f31140b;

        /* renamed from: c */
        final /* synthetic */ int f31141c;

        c(Iterable iterable, int i8) {
            this.f31140b = iterable;
            this.f31141c = i8;
        }

        @Override // java.lang.Iterable
        public Iterator<List<T>> iterator() {
            return AbstractC5495w0.paddedPartition(this.f31140b.iterator(), this.f31141c);
        }
    }

    /* renamed from: f3.v0$d */
    class d extends AbstractC5442N {

        /* renamed from: b */
        final /* synthetic */ Iterable f31142b;

        /* renamed from: c */
        final /* synthetic */ e3.x f31143c;

        d(Iterable iterable, e3.x xVar) {
            this.f31142b = iterable;
            this.f31143c = xVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return AbstractC5495w0.filter(this.f31142b.iterator(), this.f31143c);
        }
    }

    /* renamed from: f3.v0$e */
    class e extends AbstractC5442N {

        /* renamed from: b */
        final /* synthetic */ Iterable f31144b;

        /* renamed from: c */
        final /* synthetic */ e3.l f31145c;

        e(Iterable iterable, e3.l lVar) {
            this.f31144b = iterable;
            this.f31145c = lVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return AbstractC5495w0.transform(this.f31144b.iterator(), this.f31145c);
        }
    }

    /* renamed from: f3.v0$f */
    class f extends AbstractC5442N {

        /* renamed from: b */
        final /* synthetic */ Iterable f31146b;

        /* renamed from: c */
        final /* synthetic */ int f31147c;

        /* renamed from: f3.v0$f$a */
        class a implements Iterator {

            /* renamed from: a */
            boolean f31148a = true;

            /* renamed from: b */
            final /* synthetic */ Iterator f31149b;

            a(f fVar, Iterator it) {
                this.f31149b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f31149b.hasNext();
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            @Override // java.util.Iterator
            public T next() {
                ?? next = this.f31149b.next();
                this.f31148a = false;
                return next;
            }

            @Override // java.util.Iterator
            public void remove() {
                AbstractC5484r.d(!this.f31148a);
                this.f31149b.remove();
            }
        }

        f(Iterable iterable, int i8) {
            this.f31146b = iterable;
            this.f31147c = i8;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f31146b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f31147c), list.size()).iterator();
            }
            Iterator it = iterable.iterator();
            AbstractC5495w0.advance(it, this.f31147c);
            return new a(this, it);
        }
    }

    /* renamed from: f3.v0$g */
    class g extends AbstractC5442N {

        /* renamed from: b */
        final /* synthetic */ Iterable f31150b;

        /* renamed from: c */
        final /* synthetic */ int f31151c;

        g(Iterable iterable, int i8) {
            this.f31150b = iterable;
            this.f31151c = i8;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return AbstractC5495w0.limit(this.f31150b.iterator(), this.f31151c);
        }
    }

    /* renamed from: f3.v0$h */
    class h extends AbstractC5442N {

        /* renamed from: b */
        final /* synthetic */ Iterable f31152b;

        h(Iterable iterable) {
            this.f31152b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f31152b;
            return iterable instanceof Queue ? new C5498y((Queue) iterable) : AbstractC5495w0.consumingIterator(iterable.iterator());
        }

        @Override // f3.AbstractC5442N
        public String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* renamed from: f3.v0$i */
    class i extends AbstractC5442N {

        /* renamed from: b */
        final /* synthetic */ Iterable f31153b;

        /* renamed from: c */
        final /* synthetic */ Comparator f31154c;

        i(Iterable iterable, Comparator comparator) {
            this.f31153b = iterable;
            this.f31154c = comparator;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return AbstractC5495w0.mergeSorted(AbstractC5493v0.transform(this.f31153b, new C5443O()), this.f31154c);
        }
    }

    /* renamed from: f3.v0$j */
    private static final class j extends AbstractC5442N {

        /* renamed from: b */
        private final Iterable f31155b;

        /* synthetic */ j(Iterable iterable, a aVar) {
            this(iterable);
        }

        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            return AbstractC5495w0.unmodifiableIterator(this.f31155b.iterator());
        }

        @Override // f3.AbstractC5442N
        public String toString() {
            return this.f31155b.toString();
        }

        private j(Iterable iterable) {
            this.f31155b = iterable;
        }
    }

    private static Collection a(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : A0.newArrayList(iterable.iterator());
    }

    public static <T> boolean addAll(Collection<T> collection, Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : AbstractC5495w0.addAll(collection, ((Iterable) e3.w.checkNotNull(iterable)).iterator());
    }

    public static <T> boolean all(Iterable<T> iterable, e3.x xVar) {
        return AbstractC5495w0.all(iterable.iterator(), xVar);
    }

    public static <T> boolean any(Iterable<T> iterable, e3.x xVar) {
        return AbstractC5495w0.any(iterable.iterator(), xVar);
    }

    private static Object b(List list) {
        return list.get(list.size() - 1);
    }

    static Object c(Iterable iterable, e3.x xVar) {
        e3.w.checkNotNull(xVar);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (xVar.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return AbstractC5442N.concat(iterable, iterable2);
    }

    public static <T> Iterable<T> consumingIterable(Iterable<T> iterable) {
        e3.w.checkNotNull(iterable);
        return new h(iterable);
    }

    public static boolean contains(Iterable<? extends Object> iterable, Object obj) {
        return iterable instanceof Collection ? AbstractC5486s.f((Collection) iterable, obj) : AbstractC5495w0.contains(iterable.iterator(), obj);
    }

    public static <T> Iterable<T> cycle(Iterable<T> iterable) {
        e3.w.checkNotNull(iterable);
        return new a(iterable);
    }

    private static boolean d(List list, e3.x xVar) {
        int i8 = 0;
        int i9 = 0;
        while (i8 < list.size()) {
            Object obj = list.get(i8);
            if (!xVar.apply(obj)) {
                if (i8 > i9) {
                    try {
                        list.set(i9, obj);
                    } catch (IllegalArgumentException unused) {
                        e(list, xVar, i9, i8);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        e(list, xVar, i9, i8);
                        return true;
                    }
                }
                i9++;
            }
            i8++;
        }
        list.subList(i9, list.size()).clear();
        return i8 != i9;
    }

    private static void e(List list, e3.x xVar, int i8, int i9) {
        for (int size = list.size() - 1; size > i9; size--) {
            if (xVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            list.remove(i10);
        }
    }

    public static boolean elementsEqual(Iterable<?> iterable, Iterable<?> iterable2) {
        if ((iterable instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return AbstractC5495w0.elementsEqual(iterable.iterator(), iterable2.iterator());
    }

    static Object[] f(Iterable iterable) {
        return a(iterable).toArray();
    }

    public static <T> Iterable<T> filter(Iterable<T> iterable, e3.x xVar) {
        e3.w.checkNotNull(iterable);
        e3.w.checkNotNull(xVar);
        return new d(iterable, xVar);
    }

    public static <T> T find(Iterable<T> iterable, e3.x xVar) {
        return (T) AbstractC5495w0.find(iterable.iterator(), xVar);
    }

    public static int frequency(Iterable<?> iterable, Object obj) {
        return iterable instanceof K0 ? ((K0) iterable).count(obj) : iterable instanceof Set ? ((Set) iterable).contains(obj) ? 1 : 0 : AbstractC5495w0.frequency(iterable.iterator(), obj);
    }

    static Object[] g(Iterable iterable, Object[] objArr) {
        return a(iterable).toArray(objArr);
    }

    public static <T> T get(Iterable<T> iterable, int i8) {
        e3.w.checkNotNull(iterable);
        return iterable instanceof List ? (T) ((List) iterable).get(i8) : (T) AbstractC5495w0.get(iterable.iterator(), i8);
    }

    public static <T> T getFirst(Iterable<? extends T> iterable, T t8) {
        return (T) AbstractC5495w0.getNext(iterable.iterator(), t8);
    }

    public static <T> T getLast(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) AbstractC5495w0.getLast(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) b(list);
    }

    public static <T> T getOnlyElement(Iterable<T> iterable) {
        return (T) AbstractC5495w0.getOnlyElement(iterable.iterator());
    }

    public static <T> int indexOf(Iterable<T> iterable, e3.x xVar) {
        return AbstractC5495w0.indexOf(iterable.iterator(), xVar);
    }

    public static boolean isEmpty(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> limit(Iterable<T> iterable, int i8) {
        e3.w.checkNotNull(iterable);
        e3.w.checkArgument(i8 >= 0, "limit is negative");
        return new g(iterable, i8);
    }

    public static <T> Iterable<T> mergeSorted(Iterable<? extends Iterable<? extends T>> iterable, Comparator<? super T> comparator) {
        e3.w.checkNotNull(iterable, "iterables");
        e3.w.checkNotNull(comparator, "comparator");
        return new j(new i(iterable, comparator), null);
    }

    public static <T> Iterable<List<T>> paddedPartition(Iterable<T> iterable, int i8) {
        e3.w.checkNotNull(iterable);
        e3.w.checkArgument(i8 > 0);
        return new c(iterable, i8);
    }

    public static <T> Iterable<List<T>> partition(Iterable<T> iterable, int i8) {
        e3.w.checkNotNull(iterable);
        e3.w.checkArgument(i8 > 0);
        return new b(iterable, i8);
    }

    public static boolean removeAll(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).removeAll((Collection) e3.w.checkNotNull(collection)) : AbstractC5495w0.removeAll(iterable.iterator(), collection);
    }

    public static <T> boolean removeIf(Iterable<T> iterable, e3.x xVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? d((List) iterable, (e3.x) e3.w.checkNotNull(xVar)) : AbstractC5495w0.removeIf(iterable.iterator(), xVar);
    }

    public static boolean retainAll(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).retainAll((Collection) e3.w.checkNotNull(collection)) : AbstractC5495w0.retainAll(iterable.iterator(), collection);
    }

    public static int size(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : AbstractC5495w0.size(iterable.iterator());
    }

    public static <T> Iterable<T> skip(Iterable<T> iterable, int i8) {
        e3.w.checkNotNull(iterable);
        e3.w.checkArgument(i8 >= 0, "number to skip cannot be negative");
        return new f(iterable, i8);
    }

    public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) g(iterable, Q0.newArray(cls, 0));
    }

    public static String toString(Iterable<?> iterable) {
        return AbstractC5495w0.toString(iterable.iterator());
    }

    public static <F, T> Iterable<T> transform(Iterable<F> iterable, e3.l lVar) {
        e3.w.checkNotNull(iterable);
        e3.w.checkNotNull(lVar);
        return new e(iterable, lVar);
    }

    public static <T> e3.s tryFind(Iterable<T> iterable, e3.x xVar) {
        return AbstractC5495w0.tryFind(iterable.iterator(), xVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> unmodifiableIterable(Iterable<? extends T> iterable) {
        e3.w.checkNotNull(iterable);
        return ((iterable instanceof j) || (iterable instanceof AbstractC5457d0)) ? iterable : new j(iterable, null);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return AbstractC5442N.concat(iterable, iterable2, iterable3);
    }

    public static <T> T find(Iterable<? extends T> iterable, e3.x xVar, T t8) {
        return (T) AbstractC5495w0.find(iterable.iterator(), xVar, t8);
    }

    public static <T> T getOnlyElement(Iterable<? extends T> iterable, T t8) {
        return (T) AbstractC5495w0.getOnlyElement(iterable.iterator(), t8);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return AbstractC5442N.concat(iterable, iterable2, iterable3, iterable4);
    }

    @SafeVarargs
    public static <T> Iterable<T> cycle(T... tArr) {
        return cycle(A0.newArrayList(tArr));
    }

    @SafeVarargs
    public static <T> Iterable<T> concat(Iterable<? extends T>... iterableArr) {
        return AbstractC5442N.concat(iterableArr);
    }

    public static <T> Iterable<T> filter(Iterable<?> iterable, Class<T> cls) {
        e3.w.checkNotNull(iterable);
        e3.w.checkNotNull(cls);
        return filter(iterable, e3.y.instanceOf(cls));
    }

    @Deprecated
    public static <E> Iterable<E> unmodifiableIterable(AbstractC5457d0 abstractC5457d0) {
        return (Iterable) e3.w.checkNotNull(abstractC5457d0);
    }

    public static <T> Iterable<T> concat(Iterable<? extends Iterable<? extends T>> iterable) {
        return AbstractC5442N.concat(iterable);
    }

    public static <T> T get(Iterable<? extends T> iterable, int i8, T t8) {
        e3.w.checkNotNull(iterable);
        AbstractC5495w0.b(i8);
        if (iterable instanceof List) {
            List listA = A0.a(iterable);
            return i8 < listA.size() ? (T) listA.get(i8) : t8;
        }
        Iterator<? extends T> it = iterable.iterator();
        AbstractC5495w0.advance(it, i8);
        return (T) AbstractC5495w0.getNext(it, t8);
    }

    public static <T> T getLast(Iterable<? extends T> iterable, T t8) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t8;
            }
            if (iterable instanceof List) {
                return (T) b(A0.a(iterable));
            }
        }
        return (T) AbstractC5495w0.getLast(iterable.iterator(), t8);
    }
}
