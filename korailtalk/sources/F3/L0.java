package f3;

import f3.K0;
import f3.h1;
import j3.AbstractC5820b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class L0 {

    class a extends m {

        /* renamed from: c */
        final /* synthetic */ K0 f30778c;

        /* renamed from: d */
        final /* synthetic */ K0 f30779d;

        /* renamed from: f3.L0$a$a */
        class C0291a extends AbstractC5452b {

            /* renamed from: c */
            final /* synthetic */ Iterator f30780c;

            /* renamed from: d */
            final /* synthetic */ Iterator f30781d;

            C0291a(Iterator it, Iterator it2) {
                this.f30780c = it;
                this.f30781d = it2;
            }

            @Override // f3.AbstractC5452b
            /* renamed from: c */
            public K0.a computeNext() {
                if (this.f30780c.hasNext()) {
                    K0.a aVar = (K0.a) this.f30780c.next();
                    Object element = aVar.getElement();
                    return L0.immutableEntry(element, Math.max(aVar.getCount(), a.this.f30779d.count(element)));
                }
                while (this.f30781d.hasNext()) {
                    K0.a aVar2 = (K0.a) this.f30781d.next();
                    Object element2 = aVar2.getElement();
                    if (!a.this.f30778c.contains(element2)) {
                        return L0.immutableEntry(element2, aVar2.getCount());
                    }
                }
                return (K0.a) a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(K0 k02, K0 k03) {
            super(null);
            this.f30778c = k02;
            this.f30779d = k03;
        }

        @Override // f3.AbstractC5464h
        Set a() {
            return h1.union(this.f30778c.elementSet(), this.f30779d.elementSet());
        }

        @Override // f3.AbstractC5464h, java.util.AbstractCollection, java.util.Collection, f3.K0
        public boolean contains(Object obj) {
            return this.f30778c.contains(obj) || this.f30779d.contains(obj);
        }

        @Override // f3.L0.m, f3.AbstractC5464h, f3.K0
        public int count(Object obj) {
            return Math.max(this.f30778c.count(obj), this.f30779d.count(obj));
        }

        @Override // f3.AbstractC5464h
        Iterator d() {
            throw new AssertionError("should never be called");
        }

        @Override // f3.AbstractC5464h
        Iterator e() {
            return new C0291a(this.f30778c.entrySet().iterator(), this.f30779d.entrySet().iterator());
        }

        @Override // f3.AbstractC5464h, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f30778c.isEmpty() && this.f30779d.isEmpty();
        }
    }

    class b extends m {

        /* renamed from: c */
        final /* synthetic */ K0 f30783c;

        /* renamed from: d */
        final /* synthetic */ K0 f30784d;

        class a extends AbstractC5452b {

            /* renamed from: c */
            final /* synthetic */ Iterator f30785c;

            a(Iterator it) {
                this.f30785c = it;
            }

            @Override // f3.AbstractC5452b
            /* renamed from: c */
            public K0.a computeNext() {
                while (this.f30785c.hasNext()) {
                    K0.a aVar = (K0.a) this.f30785c.next();
                    Object element = aVar.getElement();
                    int iMin = Math.min(aVar.getCount(), b.this.f30784d.count(element));
                    if (iMin > 0) {
                        return L0.immutableEntry(element, iMin);
                    }
                }
                return (K0.a) a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(K0 k02, K0 k03) {
            super(null);
            this.f30783c = k02;
            this.f30784d = k03;
        }

        @Override // f3.AbstractC5464h
        Set a() {
            return h1.intersection(this.f30783c.elementSet(), this.f30784d.elementSet());
        }

        @Override // f3.L0.m, f3.AbstractC5464h, f3.K0
        public int count(Object obj) {
            int iCount = this.f30783c.count(obj);
            if (iCount == 0) {
                return 0;
            }
            return Math.min(iCount, this.f30784d.count(obj));
        }

        @Override // f3.AbstractC5464h
        Iterator d() {
            throw new AssertionError("should never be called");
        }

        @Override // f3.AbstractC5464h
        Iterator e() {
            return new a(this.f30783c.entrySet().iterator());
        }
    }

    class c extends m {

        /* renamed from: c */
        final /* synthetic */ K0 f30787c;

        /* renamed from: d */
        final /* synthetic */ K0 f30788d;

        class a extends AbstractC5452b {

            /* renamed from: c */
            final /* synthetic */ Iterator f30789c;

            /* renamed from: d */
            final /* synthetic */ Iterator f30790d;

            a(Iterator it, Iterator it2) {
                this.f30789c = it;
                this.f30790d = it2;
            }

            @Override // f3.AbstractC5452b
            /* renamed from: c */
            public K0.a computeNext() {
                if (this.f30789c.hasNext()) {
                    K0.a aVar = (K0.a) this.f30789c.next();
                    Object element = aVar.getElement();
                    return L0.immutableEntry(element, aVar.getCount() + c.this.f30788d.count(element));
                }
                while (this.f30790d.hasNext()) {
                    K0.a aVar2 = (K0.a) this.f30790d.next();
                    Object element2 = aVar2.getElement();
                    if (!c.this.f30787c.contains(element2)) {
                        return L0.immutableEntry(element2, aVar2.getCount());
                    }
                }
                return (K0.a) a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(K0 k02, K0 k03) {
            super(null);
            this.f30787c = k02;
            this.f30788d = k03;
        }

        @Override // f3.AbstractC5464h
        Set a() {
            return h1.union(this.f30787c.elementSet(), this.f30788d.elementSet());
        }

        @Override // f3.AbstractC5464h, java.util.AbstractCollection, java.util.Collection, f3.K0
        public boolean contains(Object obj) {
            return this.f30787c.contains(obj) || this.f30788d.contains(obj);
        }

        @Override // f3.L0.m, f3.AbstractC5464h, f3.K0
        public int count(Object obj) {
            return this.f30787c.count(obj) + this.f30788d.count(obj);
        }

        @Override // f3.AbstractC5464h
        Iterator d() {
            throw new AssertionError("should never be called");
        }

        @Override // f3.AbstractC5464h
        Iterator e() {
            return new a(this.f30787c.entrySet().iterator(), this.f30788d.entrySet().iterator());
        }

        @Override // f3.AbstractC5464h, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f30787c.isEmpty() && this.f30788d.isEmpty();
        }

        @Override // f3.L0.m, java.util.AbstractCollection, java.util.Collection, f3.K0
        public int size() {
            return i3.b.saturatedAdd(this.f30787c.size(), this.f30788d.size());
        }
    }

    class d extends m {

        /* renamed from: c */
        final /* synthetic */ K0 f30792c;

        /* renamed from: d */
        final /* synthetic */ K0 f30793d;

        class a extends AbstractC5452b {

            /* renamed from: c */
            final /* synthetic */ Iterator f30794c;

            a(Iterator it) {
                this.f30794c = it;
            }

            @Override // f3.AbstractC5452b
            protected Object computeNext() {
                while (this.f30794c.hasNext()) {
                    K0.a aVar = (K0.a) this.f30794c.next();
                    Object element = aVar.getElement();
                    if (aVar.getCount() > d.this.f30793d.count(element)) {
                        return element;
                    }
                }
                return a();
            }
        }

        class b extends AbstractC5452b {

            /* renamed from: c */
            final /* synthetic */ Iterator f30796c;

            b(Iterator it) {
                this.f30796c = it;
            }

            @Override // f3.AbstractC5452b
            /* renamed from: c */
            public K0.a computeNext() {
                while (this.f30796c.hasNext()) {
                    K0.a aVar = (K0.a) this.f30796c.next();
                    Object element = aVar.getElement();
                    int count = aVar.getCount() - d.this.f30793d.count(element);
                    if (count > 0) {
                        return L0.immutableEntry(element, count);
                    }
                }
                return (K0.a) a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(K0 k02, K0 k03) {
            super(null);
            this.f30792c = k02;
            this.f30793d = k03;
        }

        @Override // f3.L0.m, f3.AbstractC5464h
        int c() {
            return AbstractC5495w0.size(e());
        }

        @Override // f3.L0.m, f3.AbstractC5464h, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // f3.L0.m, f3.AbstractC5464h, f3.K0
        public int count(Object obj) {
            int iCount = this.f30792c.count(obj);
            if (iCount == 0) {
                return 0;
            }
            return Math.max(0, iCount - this.f30793d.count(obj));
        }

        @Override // f3.AbstractC5464h
        Iterator d() {
            return new a(this.f30792c.entrySet().iterator());
        }

        @Override // f3.AbstractC5464h
        Iterator e() {
            return new b(this.f30792c.entrySet().iterator());
        }
    }

    static abstract class e implements K0.a {
        e() {
        }

        @Override // f3.K0.a
        public boolean equals(Object obj) {
            if (!(obj instanceof K0.a)) {
                return false;
            }
            K0.a aVar = (K0.a) obj;
            return getCount() == aVar.getCount() && e3.r.equal(getElement(), aVar.getElement());
        }

        @Override // f3.K0.a
        public abstract /* synthetic */ int getCount();

        @Override // f3.K0.a
        public abstract /* synthetic */ Object getElement();

        @Override // f3.K0.a
        public int hashCode() {
            Object element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        @Override // f3.K0.a
        public String toString() {
            String strValueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    private static final class f implements Comparator {

        /* renamed from: a */
        static final f f30798a = new f();

        private f() {
        }

        @Override // java.util.Comparator
        public int compare(K0.a aVar, K0.a aVar2) {
            return aVar2.getCount() - aVar.getCount();
        }
    }

    static abstract class g extends h1.j {
        g() {
        }

        abstract K0 a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return a().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<Object> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return a().remove(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().entrySet().size();
        }
    }

    static abstract class h extends h1.j {
        h() {
        }

        abstract K0 a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof K0.a)) {
                return false;
            }
            K0.a aVar = (K0.a) obj;
            return aVar.getCount() > 0 && a().count(aVar.getElement()) == aVar.getCount();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof K0.a) {
                K0.a aVar = (K0.a) obj;
                Object element = aVar.getElement();
                int count = aVar.getCount();
                if (count != 0) {
                    return a().setCount(element, count, 0);
                }
            }
            return false;
        }
    }

    private static final class i extends m {

        /* renamed from: c */
        final K0 f30799c;

        /* renamed from: d */
        final e3.x f30800d;

        class a implements e3.x {
            a() {
            }

            @Override // e3.x
            public boolean apply(K0.a aVar) {
                return i.this.f30800d.apply(aVar.getElement());
            }
        }

        i(K0 k02, e3.x xVar) {
            super(null);
            this.f30799c = (K0) e3.w.checkNotNull(k02);
            this.f30800d = (e3.x) e3.w.checkNotNull(xVar);
        }

        @Override // f3.AbstractC5464h
        Set a() {
            return h1.filter(this.f30799c.elementSet(), this.f30800d);
        }

        @Override // f3.AbstractC5464h, f3.K0
        public int add(Object obj, int i8) {
            e3.w.checkArgument(this.f30800d.apply(obj), "Element %s does not match predicate %s", obj, this.f30800d);
            return this.f30799c.add(obj, i8);
        }

        @Override // f3.AbstractC5464h
        Set b() {
            return h1.filter(this.f30799c.entrySet(), new a());
        }

        @Override // f3.L0.m, f3.AbstractC5464h, f3.K0
        public int count(Object obj) {
            int iCount = this.f30799c.count(obj);
            if (iCount <= 0 || !this.f30800d.apply(obj)) {
                return 0;
            }
            return iCount;
        }

        @Override // f3.AbstractC5464h
        Iterator d() {
            throw new AssertionError("should never be called");
        }

        @Override // f3.AbstractC5464h
        Iterator e() {
            throw new AssertionError("should never be called");
        }

        @Override // f3.AbstractC5464h, f3.K0
        public int remove(Object obj, int i8) {
            AbstractC5484r.b(i8, "occurrences");
            if (i8 == 0) {
                return count(obj);
            }
            if (contains(obj)) {
                return this.f30799c.remove(obj, i8);
            }
            return 0;
        }

        @Override // f3.L0.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, f3.K0
        public t1 iterator() {
            return AbstractC5495w0.filter(this.f30799c.iterator(), this.f30800d);
        }
    }

    static class j extends e implements Serializable {

        /* renamed from: a */
        private final Object f30802a;

        /* renamed from: b */
        private final int f30803b;

        j(Object obj, int i8) {
            this.f30802a = obj;
            this.f30803b = i8;
            AbstractC5484r.b(i8, "count");
        }

        @Override // f3.L0.e, f3.K0.a
        public final int getCount() {
            return this.f30803b;
        }

        @Override // f3.L0.e, f3.K0.a
        public final Object getElement() {
            return this.f30802a;
        }

        public j nextInBucket() {
            return null;
        }
    }

    static final class k implements Iterator {

        /* renamed from: a */
        private final K0 f30804a;

        /* renamed from: b */
        private final Iterator f30805b;

        /* renamed from: c */
        private K0.a f30806c;

        /* renamed from: d */
        private int f30807d;

        /* renamed from: e */
        private int f30808e;

        /* renamed from: f */
        private boolean f30809f;

        k(K0 k02, Iterator it) {
            this.f30804a = k02;
            this.f30805b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30807d > 0 || this.f30805b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f30807d == 0) {
                K0.a aVar = (K0.a) this.f30805b.next();
                this.f30806c = aVar;
                int count = aVar.getCount();
                this.f30807d = count;
                this.f30808e = count;
            }
            this.f30807d--;
            this.f30809f = true;
            K0.a aVar2 = this.f30806c;
            Objects.requireNonNull(aVar2);
            return aVar2.getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            AbstractC5484r.d(this.f30809f);
            if (this.f30808e == 1) {
                this.f30805b.remove();
            } else {
                K0 k02 = this.f30804a;
                K0.a aVar = this.f30806c;
                Objects.requireNonNull(aVar);
                k02.remove(aVar.getElement());
            }
            this.f30808e--;
            this.f30809f = false;
        }
    }

    static class l extends AbstractC5449V implements Serializable {

        /* renamed from: a */
        final K0 f30810a;

        /* renamed from: b */
        transient Set f30811b;

        /* renamed from: c */
        transient Set f30812c;

        l(K0 k02) {
            this.f30810a = k02;
        }

        @Override // f3.AbstractC5444P, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5444P, java.util.Collection, java.util.Set
        public boolean addAll(Collection<Object> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5444P, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // f3.X
        /* renamed from: d */
        public K0 delegate() {
            return this.f30810a;
        }

        Set e() {
            return Collections.unmodifiableSet(this.f30810a.elementSet());
        }

        @Override // f3.AbstractC5449V, f3.K0
        public Set<Object> elementSet() {
            Set<Object> set = this.f30811b;
            if (set != null) {
                return set;
            }
            Set<Object> setE = e();
            this.f30811b = setE;
            return setE;
        }

        @Override // f3.AbstractC5449V, f3.K0
        public Set<K0.a> entrySet() {
            Set<K0.a> set = this.f30812c;
            if (set != null) {
                return set;
            }
            Set<K0.a> setUnmodifiableSet = Collections.unmodifiableSet(this.f30810a.entrySet());
            this.f30812c = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // f3.AbstractC5444P, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return AbstractC5495w0.unmodifiableIterator(this.f30810a.iterator());
        }

        @Override // f3.AbstractC5444P, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5444P, java.util.Collection, f3.K0
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5444P, java.util.Collection, f3.K0
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5449V, f3.K0
        public int setCount(Object obj, int i8) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5449V, f3.K0
        public int add(Object obj, int i8) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5449V, f3.K0
        public int remove(Object obj, int i8) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5449V, f3.K0
        public boolean setCount(Object obj, int i8, int i9) {
            throw new UnsupportedOperationException();
        }
    }

    private static abstract class m extends AbstractC5464h {
        private m() {
        }

        @Override // f3.AbstractC5464h
        int c() {
            return elementSet().size();
        }

        @Override // f3.AbstractC5464h, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            elementSet().clear();
        }

        @Override // f3.AbstractC5464h, f3.K0
        public abstract /* synthetic */ int count(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, f3.K0
        public Iterator<Object> iterator() {
            return L0.f(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, f3.K0
        public int size() {
            return L0.g(this);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    private static boolean a(K0 k02, K0 k03) {
        if (k03.isEmpty()) {
            return false;
        }
        for (K0.a aVar : k03.entrySet()) {
            k02.add(aVar.getElement(), aVar.getCount());
        }
        return true;
    }

    static boolean b(K0 k02, Collection collection) {
        e3.w.checkNotNull(k02);
        e3.w.checkNotNull(collection);
        if (collection instanceof K0) {
            return a(k02, c(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return AbstractC5495w0.addAll(k02, collection.iterator());
    }

    static K0 c(Iterable iterable) {
        return (K0) iterable;
    }

    public static boolean containsOccurrences(K0 k02, K0 k03) {
        e3.w.checkNotNull(k02);
        e3.w.checkNotNull(k03);
        for (K0.a aVar : k03.entrySet()) {
            if (k02.count(aVar.getElement()) < aVar.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static <E> AbstractC5479o0 copyHighestCountFirst(K0 k02) {
        K0.a[] aVarArr = (K0.a[]) k02.entrySet().toArray(new K0.a[0]);
        Arrays.sort(aVarArr, f.f30798a);
        return AbstractC5479o0.f(Arrays.asList(aVarArr));
    }

    static boolean d(K0 k02, Object obj) {
        if (obj == k02) {
            return true;
        }
        if (obj instanceof K0) {
            K0 k03 = (K0) obj;
            if (k02.size() == k03.size() && k02.entrySet().size() == k03.entrySet().size()) {
                for (K0.a aVar : k03.entrySet()) {
                    if (k02.count(aVar.getElement()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static <E> K0 difference(K0 k02, K0 k03) {
        e3.w.checkNotNull(k02);
        e3.w.checkNotNull(k03);
        return new d(k02, k03);
    }

    static int e(Iterable iterable) {
        if (iterable instanceof K0) {
            return ((K0) iterable).elementSet().size();
        }
        return 11;
    }

    static Iterator f(K0 k02) {
        return new k(k02, k02.entrySet().iterator());
    }

    public static <E> K0 filter(K0 k02, e3.x xVar) {
        if (!(k02 instanceof i)) {
            return new i(k02, xVar);
        }
        i iVar = (i) k02;
        return new i(iVar.f30799c, e3.y.and(iVar.f30800d, xVar));
    }

    static int g(K0 k02) {
        long count = 0;
        while (k02.entrySet().iterator().hasNext()) {
            count += r4.next().getCount();
        }
        return AbstractC5820b.saturatedCast(count);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean h(K0 k02, Collection collection) {
        if (collection instanceof K0) {
            collection = ((K0) collection).elementSet();
        }
        return k02.elementSet().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean i(K0 k02, Collection collection) {
        e3.w.checkNotNull(collection);
        if (collection instanceof K0) {
            collection = ((K0) collection).elementSet();
        }
        return k02.elementSet().retainAll(collection);
    }

    public static <E> K0.a immutableEntry(E e8, int i8) {
        return new j(e8, i8);
    }

    public static <E> K0 intersection(K0 k02, K0 k03) {
        e3.w.checkNotNull(k02);
        e3.w.checkNotNull(k03);
        return new b(k02, k03);
    }

    private static boolean j(K0 k02, K0 k03) {
        e3.w.checkNotNull(k02);
        e3.w.checkNotNull(k03);
        Iterator<K0.a> it = k02.entrySet().iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            K0.a next = it.next();
            int iCount = k03.count(next.getElement());
            if (iCount == 0) {
                it.remove();
            } else if (iCount < next.getCount()) {
                k02.setCount(next.getElement(), iCount);
            }
            z8 = true;
        }
        return z8;
    }

    static int k(K0 k02, Object obj, int i8) {
        AbstractC5484r.b(i8, "count");
        int iCount = k02.count(obj);
        int i9 = i8 - iCount;
        if (i9 > 0) {
            k02.add(obj, i9);
        } else if (i9 < 0) {
            k02.remove(obj, -i9);
        }
        return iCount;
    }

    static boolean l(K0 k02, Object obj, int i8, int i9) {
        AbstractC5484r.b(i8, "oldCount");
        AbstractC5484r.b(i9, "newCount");
        if (k02.count(obj) != i8) {
            return false;
        }
        k02.setCount(obj, i9);
        return true;
    }

    public static boolean removeOccurrences(K0 k02, Iterable<?> iterable) {
        if (iterable instanceof K0) {
            return removeOccurrences(k02, (K0) iterable);
        }
        e3.w.checkNotNull(k02);
        e3.w.checkNotNull(iterable);
        Iterator<?> it = iterable.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= k02.remove(it.next());
        }
        return zRemove;
    }

    public static boolean retainOccurrences(K0 k02, K0 k03) {
        return j(k02, k03);
    }

    public static <E> K0 sum(K0 k02, K0 k03) {
        e3.w.checkNotNull(k02);
        e3.w.checkNotNull(k03);
        return new c(k02, k03);
    }

    public static <E> K0 union(K0 k02, K0 k03) {
        e3.w.checkNotNull(k02);
        e3.w.checkNotNull(k03);
        return new a(k02, k03);
    }

    public static <E> K0 unmodifiableMultiset(K0 k02) {
        return ((k02 instanceof l) || (k02 instanceof AbstractC5479o0)) ? k02 : new l((K0) e3.w.checkNotNull(k02));
    }

    public static <E> m1 unmodifiableSortedMultiset(m1 m1Var) {
        return new v1((m1) e3.w.checkNotNull(m1Var));
    }

    @Deprecated
    public static <E> K0 unmodifiableMultiset(AbstractC5479o0 abstractC5479o0) {
        return (K0) e3.w.checkNotNull(abstractC5479o0);
    }

    public static boolean removeOccurrences(K0 k02, K0 k03) {
        e3.w.checkNotNull(k02);
        e3.w.checkNotNull(k03);
        Iterator<K0.a> it = k02.entrySet().iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            K0.a next = it.next();
            int iCount = k03.count(next.getElement());
            if (iCount >= next.getCount()) {
                it.remove();
            } else if (iCount > 0) {
                k02.remove(next.getElement(), iCount);
            }
            z8 = true;
        }
        return z8;
    }
}
