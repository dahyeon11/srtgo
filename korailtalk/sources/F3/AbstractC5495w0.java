package f3;

import f3.AbstractC5495w0;
import j3.AbstractC5820b;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

/* renamed from: f3.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5495w0 {

    /* renamed from: f3.w0$a */
    class a extends t1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Enumeration f31158a;

        a(Enumeration enumeration) {
            this.f31158a = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31158a.hasMoreElements();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            return this.f31158a.nextElement();
        }
    }

    /* renamed from: f3.w0$b */
    class b implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f31159a;

        b(Iterator it) {
            this.f31159a = it;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f31159a.hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // java.util.Enumeration
        public T nextElement() {
            return this.f31159a.next();
        }
    }

    /* renamed from: f3.w0$c */
    class c extends t1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f31160a;

        c(Iterator it) {
            this.f31160a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31160a.hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            return this.f31160a.next();
        }
    }

    /* renamed from: f3.w0$d */
    class d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        Iterator f31161a = AbstractC5495w0.h();

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f31162b;

        d(Iterable iterable) {
            this.f31162b = iterable;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31161a.hasNext() || this.f31162b.iterator().hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            if (!this.f31161a.hasNext()) {
                Iterator it = this.f31162b.iterator();
                this.f31161a = it;
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
            }
            return this.f31161a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f31161a.remove();
        }
    }

    /* renamed from: f3.w0$e */
    class e extends t1 {

        /* renamed from: a, reason: collision with root package name */
        int f31163a = 0;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator[] f31164b;

        e(Iterator[] itArr) {
            this.f31164b = itArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31163a < this.f31164b.length;
        }

        @Override // java.util.Iterator
        public Iterator<?> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<?> it = this.f31164b[this.f31163a];
            Objects.requireNonNull(it);
            Iterator<?> it2 = it;
            Iterator[] itArr = this.f31164b;
            int i8 = this.f31163a;
            itArr[i8] = null;
            this.f31163a = i8 + 1;
            return it2;
        }
    }

    /* renamed from: f3.w0$f */
    class f extends t1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f31165a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31166b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f31167c;

        f(Iterator it, int i8, boolean z8) {
            this.f31165a = it;
            this.f31166b = i8;
            this.f31167c = z8;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31165a.hasNext();
        }

        @Override // java.util.Iterator
        public List<Object> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object[] objArr = new Object[this.f31166b];
            int i8 = 0;
            while (i8 < this.f31166b && this.f31165a.hasNext()) {
                objArr[i8] = this.f31165a.next();
                i8++;
            }
            for (int i9 = i8; i9 < this.f31166b; i9++) {
                objArr[i9] = null;
            }
            List<Object> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
            return (this.f31167c || i8 == this.f31166b) ? listUnmodifiableList : listUnmodifiableList.subList(0, i8);
        }
    }

    /* renamed from: f3.w0$g */
    class g extends AbstractC5452b {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f31168c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e3.x f31169d;

        g(Iterator it, e3.x xVar) {
            this.f31168c = it;
            this.f31169d = xVar;
        }

        @Override // f3.AbstractC5452b
        protected Object computeNext() {
            while (this.f31168c.hasNext()) {
                Object next = this.f31168c.next();
                if (this.f31169d.apply(next)) {
                    return next;
                }
            }
            return a();
        }
    }

    /* renamed from: f3.w0$h */
    class h extends r1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e3.l f31170b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Iterator it, e3.l lVar) {
            super(it);
            this.f31170b = lVar;
        }

        @Override // f3.r1
        Object a(Object obj) {
            return this.f31170b.apply(obj);
        }
    }

    /* renamed from: f3.w0$i */
    class i implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private int f31171a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f31173c;

        i(int i8, Iterator it) {
            this.f31172b = i8;
            this.f31173c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31171a < this.f31172b && this.f31173c.hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f31171a++;
            return this.f31173c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f31173c.remove();
        }
    }

    /* renamed from: f3.w0$j */
    class j extends t1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f31174a;

        j(Iterator it) {
            this.f31174a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31174a.hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            ?? next = this.f31174a.next();
            this.f31174a.remove();
            return next;
        }

        public String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* renamed from: f3.w0$k */
    class k extends t1 {

        /* renamed from: a, reason: collision with root package name */
        boolean f31175a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f31176b;

        k(Object obj) {
            this.f31176b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f31175a;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            if (this.f31175a) {
                throw new NoSuchElementException();
            }
            this.f31175a = true;
            return this.f31176b;
        }
    }

    /* renamed from: f3.w0$l */
    private static final class l extends AbstractC5450a {

        /* renamed from: e, reason: collision with root package name */
        static final u1 f31177e = new l(new Object[0], 0, 0, 0);

        /* renamed from: c, reason: collision with root package name */
        private final Object[] f31178c;

        /* renamed from: d, reason: collision with root package name */
        private final int f31179d;

        l(Object[] objArr, int i8, int i9, int i10) {
            super(i9, i10);
            this.f31178c = objArr;
            this.f31179d = i8;
        }

        @Override // f3.AbstractC5450a
        protected Object get(int i8) {
            return this.f31178c[this.f31179d + i8];
        }
    }

    /* renamed from: f3.w0$m */
    private static class m implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private Iterator f31180a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator f31181b = AbstractC5495w0.f();

        /* renamed from: c, reason: collision with root package name */
        private Iterator f31182c;

        /* renamed from: d, reason: collision with root package name */
        private Deque f31183d;

        m(Iterator it) {
            this.f31182c = (Iterator) e3.w.checkNotNull(it);
        }

        private Iterator a() {
            while (true) {
                Iterator it = this.f31182c;
                if (it != null && it.hasNext()) {
                    return this.f31182c;
                }
                Deque deque = this.f31183d;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f31182c = (Iterator) this.f31183d.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) e3.w.checkNotNull(this.f31181b)).hasNext()) {
                Iterator itA = a();
                this.f31182c = itA;
                if (itA == null) {
                    return false;
                }
                Iterator it = (Iterator) itA.next();
                this.f31181b = it;
                if (it instanceof m) {
                    m mVar = (m) it;
                    this.f31181b = mVar.f31181b;
                    if (this.f31183d == null) {
                        this.f31183d = new ArrayDeque();
                    }
                    this.f31183d.addFirst(this.f31182c);
                    if (mVar.f31183d != null) {
                        while (!mVar.f31183d.isEmpty()) {
                            this.f31183d.addFirst((Iterator) mVar.f31183d.removeLast());
                        }
                    }
                    this.f31182c = mVar.f31182c;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator it = this.f31181b;
            this.f31180a = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator it = this.f31180a;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f31180a = null;
        }
    }

    /* renamed from: f3.w0$n */
    private enum n implements Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            AbstractC5484r.d(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f3.w0$o */
    static class o extends t1 {

        /* renamed from: a, reason: collision with root package name */
        final Queue f31185a;

        public o(Iterable<? extends Iterator<Object>> iterable, final Comparator<Object> comparator) {
            this.f31185a = new PriorityQueue(2, new Comparator() { // from class: f3.x0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return AbstractC5495w0.o.b(comparator, (U0) obj, (U0) obj2);
                }
            });
            for (Iterator<Object> it : iterable) {
                if (it.hasNext()) {
                    this.f31185a.add(AbstractC5495w0.peekingIterator(it));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(Comparator comparator, U0 u02, U0 u03) {
            return comparator.compare(u02.peek(), u03.peek());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f31185a.isEmpty();
        }

        @Override // java.util.Iterator
        public Object next() {
            U0 u02 = (U0) this.f31185a.remove();
            Object next = u02.next();
            if (u02.hasNext()) {
                this.f31185a.add(u02);
            }
            return next;
        }
    }

    /* renamed from: f3.w0$p */
    private static class p implements U0 {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f31186a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f31187b;

        /* renamed from: c, reason: collision with root package name */
        private Object f31188c;

        public p(Iterator<Object> it) {
            this.f31186a = (Iterator) e3.w.checkNotNull(it);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31187b || this.f31186a.hasNext();
        }

        @Override // f3.U0, java.util.Iterator
        public Object next() {
            if (!this.f31187b) {
                return this.f31186a.next();
            }
            Object objA = N0.a(this.f31188c);
            this.f31187b = false;
            this.f31188c = null;
            return objA;
        }

        @Override // f3.U0
        public Object peek() {
            if (!this.f31187b) {
                this.f31188c = this.f31186a.next();
                this.f31187b = true;
            }
            return N0.a(this.f31188c);
        }

        @Override // f3.U0, java.util.Iterator
        public void remove() {
            e3.w.checkState(!this.f31187b, "Can't remove after you've peeked at next");
            this.f31186a.remove();
        }
    }

    static ListIterator a(Iterator it) {
        return (ListIterator) it;
    }

    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it) {
        e3.w.checkNotNull(collection);
        e3.w.checkNotNull(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static int advance(Iterator<?> it, int i8) {
        e3.w.checkNotNull(it);
        int i9 = 0;
        e3.w.checkArgument(i8 >= 0, "numberToAdvance must be nonnegative");
        while (i9 < i8 && it.hasNext()) {
            it.next();
            i9++;
        }
        return i9;
    }

    public static <T> boolean all(Iterator<T> it, e3.x xVar) {
        e3.w.checkNotNull(xVar);
        while (it.hasNext()) {
            if (!xVar.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterator<T> it, e3.x xVar) {
        return indexOf(it, xVar) != -1;
    }

    public static <T> Enumeration<T> asEnumeration(Iterator<T> it) {
        e3.w.checkNotNull(it);
        return new b(it);
    }

    static void b(int i8) {
        if (i8 >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("position (" + i8 + ") must not be negative");
    }

    static void c(Iterator it) {
        e3.w.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2) {
        e3.w.checkNotNull(it);
        e3.w.checkNotNull(it2);
        return concat(e(it, it2));
    }

    public static <T> Iterator<T> consumingIterator(Iterator<T> it) {
        e3.w.checkNotNull(it);
        return new j(it);
    }

    public static boolean contains(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> cycle(Iterable<T> iterable) {
        e3.w.checkNotNull(iterable);
        return new d(iterable);
    }

    static Iterator d(Iterator... itArr) {
        for (Iterator it : (Iterator[]) e3.w.checkNotNull(itArr)) {
            e3.w.checkNotNull(it);
        }
        return concat(e(itArr));
    }

    private static Iterator e(Iterator... itArr) {
        return new e(itArr);
    }

    public static boolean elementsEqual(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !e3.r.equal(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static t1 f() {
        return g();
    }

    public static <T> t1 filter(Iterator<T> it, e3.x xVar) {
        e3.w.checkNotNull(it);
        e3.w.checkNotNull(xVar);
        return new g(it, xVar);
    }

    public static <T> T find(Iterator<T> it, e3.x xVar) {
        e3.w.checkNotNull(it);
        e3.w.checkNotNull(xVar);
        while (it.hasNext()) {
            T next = it.next();
            if (xVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @SafeVarargs
    public static <T> t1 forArray(T... tArr) {
        return i(tArr, 0, tArr.length, 0);
    }

    public static <T> t1 forEnumeration(Enumeration<T> enumeration) {
        e3.w.checkNotNull(enumeration);
        return new a(enumeration);
    }

    public static int frequency(Iterator<?> it, Object obj) {
        int i8 = 0;
        while (contains(it, obj)) {
            i8++;
        }
        return i8;
    }

    static u1 g() {
        return l.f31177e;
    }

    public static <T> T get(Iterator<T> it, int i8) {
        b(i8);
        int iAdvance = advance(it, i8);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException("position (" + i8 + ") must be less than the number of elements that remained (" + iAdvance + ")");
    }

    public static <T> T getLast(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T getNext(Iterator<? extends T> it, T t8) {
        return it.hasNext() ? it.next() : t8;
    }

    public static <T> T getOnlyElement(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i8 = 0; i8 < 4 && it.hasNext(); i8++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    static Iterator h() {
        return n.INSTANCE;
    }

    static u1 i(Object[] objArr, int i8, int i9, int i10) {
        e3.w.checkArgument(i9 >= 0);
        e3.w.checkPositionIndexes(i8, i8 + i9, objArr.length);
        e3.w.checkPositionIndex(i10, i9);
        return i9 == 0 ? g() : new l(objArr, i8, i9, i10);
    }

    public static <T> int indexOf(Iterator<T> it, e3.x xVar) {
        e3.w.checkNotNull(xVar, "predicate");
        int i8 = 0;
        while (it.hasNext()) {
            if (xVar.apply(it.next())) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    private static t1 j(Iterator it, int i8, boolean z8) {
        e3.w.checkNotNull(it);
        e3.w.checkArgument(i8 > 0);
        return new f(it, i8, z8);
    }

    static Object k(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static <T> Iterator<T> limit(Iterator<T> it, int i8) {
        e3.w.checkNotNull(it);
        e3.w.checkArgument(i8 >= 0, "limit is negative");
        return new i(i8, it);
    }

    public static <T> t1 mergeSorted(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        e3.w.checkNotNull(iterable, "iterators");
        e3.w.checkNotNull(comparator, "comparator");
        return new o(iterable, comparator);
    }

    public static <T> t1 paddedPartition(Iterator<T> it, int i8) {
        return j(it, i8, true);
    }

    public static <T> t1 partition(Iterator<T> it, int i8) {
        return j(it, i8, false);
    }

    public static <T> U0 peekingIterator(Iterator<? extends T> it) {
        return it instanceof p ? (p) it : new p(it);
    }

    public static boolean removeAll(Iterator<?> it, Collection<?> collection) {
        e3.w.checkNotNull(collection);
        boolean z8 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    public static <T> boolean removeIf(Iterator<T> it, e3.x xVar) {
        e3.w.checkNotNull(xVar);
        boolean z8 = false;
        while (it.hasNext()) {
            if (xVar.apply(it.next())) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    public static boolean retainAll(Iterator<?> it, Collection<?> collection) {
        e3.w.checkNotNull(collection);
        boolean z8 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    public static <T> t1 singletonIterator(T t8) {
        return new k(t8);
    }

    public static int size(Iterator<?> it) {
        long j8 = 0;
        while (it.hasNext()) {
            it.next();
            j8++;
        }
        return AbstractC5820b.saturatedCast(j8);
    }

    public static <T> T[] toArray(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) AbstractC5493v0.toArray(A0.newArrayList(it), cls);
    }

    public static String toString(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z8 = true;
        while (it.hasNext()) {
            if (!z8) {
                sb.append(", ");
            }
            sb.append(it.next());
            z8 = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it, e3.l lVar) {
        e3.w.checkNotNull(lVar);
        return new h(it, lVar);
    }

    public static <T> e3.s tryFind(Iterator<T> it, e3.x xVar) {
        e3.w.checkNotNull(it);
        e3.w.checkNotNull(xVar);
        while (it.hasNext()) {
            T next = it.next();
            if (xVar.apply(next)) {
                return e3.s.of(next);
            }
        }
        return e3.s.absent();
    }

    public static <T> t1 unmodifiableIterator(Iterator<? extends T> it) {
        e3.w.checkNotNull(it);
        return it instanceof t1 ? (t1) it : new c(it);
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... tArr) {
        return cycle(A0.newArrayList(tArr));
    }

    public static <T> T getLast(Iterator<? extends T> it, T t8) {
        return it.hasNext() ? (T) getLast(it) : t8;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
        e3.w.checkNotNull(it);
        e3.w.checkNotNull(it2);
        e3.w.checkNotNull(it3);
        return concat(e(it, it2, it3));
    }

    public static <T> t1 filter(Iterator<?> it, Class<T> cls) {
        return filter(it, e3.y.instanceOf(cls));
    }

    @Deprecated
    public static <T> U0 peekingIterator(U0 u02) {
        return (U0) e3.w.checkNotNull(u02);
    }

    @Deprecated
    public static <T> t1 unmodifiableIterator(t1 t1Var) {
        return (t1) e3.w.checkNotNull(t1Var);
    }

    public static <T> T get(Iterator<? extends T> it, int i8, T t8) {
        b(i8);
        advance(it, i8);
        return (T) getNext(it, t8);
    }

    public static <T> T find(Iterator<? extends T> it, e3.x xVar, T t8) {
        e3.w.checkNotNull(it);
        e3.w.checkNotNull(xVar);
        while (it.hasNext()) {
            T next = it.next();
            if (xVar.apply(next)) {
                return next;
            }
        }
        return t8;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        e3.w.checkNotNull(it);
        e3.w.checkNotNull(it2);
        e3.w.checkNotNull(it3);
        e3.w.checkNotNull(it4);
        return concat(e(it, it2, it3, it4));
    }

    public static <T> T getOnlyElement(Iterator<? extends T> it, T t8) {
        return it.hasNext() ? (T) getOnlyElement(it) : t8;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T>... itArr) {
        return d((Iterator[]) Arrays.copyOf(itArr, itArr.length));
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> it) {
        return new m(it);
    }
}
