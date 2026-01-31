package f3;

import e3.InterfaceC5355E;
import f3.AbstractC5456d;
import f3.AbstractC5462g;
import f3.C5467i0;
import f3.E0;
import f3.K0;
import f3.L0;
import f3.h1;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class H0 {

    static final class a extends E0.R {

        /* renamed from: d */
        private final F0 f30749d;

        /* renamed from: f3.H0$a$a */
        class C0288a extends E0.s {
            C0288a() {
            }

            public /* synthetic */ Collection c(Object obj) {
                return a.this.f30749d.get(obj);
            }

            @Override // f3.E0.s
            Map a() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<Object, Collection<Object>>> iterator() {
                return E0.i(a.this.f30749d.keySet(), new e3.l() { // from class: f3.G0
                    @Override // e3.l
                    public final Object apply(Object obj) {
                        return this.f30748a.c(obj);
                    }
                });
            }

            @Override // f3.E0.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                a.this.d(entry.getKey());
                return true;
            }
        }

        a(F0 f02) {
            this.f30749d = (F0) e3.w.checkNotNull(f02);
        }

        @Override // f3.E0.R
        protected Set a() {
            return new C0288a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f30749d.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f30749d.containsKey(obj);
        }

        void d(Object obj) {
            this.f30749d.keySet().remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f30749d.isEmpty();
        }

        @Override // f3.E0.R, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Object> keySet() {
            return this.f30749d.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f30749d.keySet().size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<Object> get(Object obj) {
            if (containsKey(obj)) {
                return this.f30749d.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<Object> remove(Object obj) {
            if (containsKey(obj)) {
                return this.f30749d.removeAll(obj);
            }
            return null;
        }
    }

    private static class b extends AbstractC5454c {

        /* renamed from: h */
        transient InterfaceC5355E f30751h;

        b(Map map, InterfaceC5355E interfaceC5355E) {
            super(map);
            this.f30751h = (InterfaceC5355E) e3.w.checkNotNull(interfaceC5355E);
        }

        @Override // f3.AbstractC5456d
        /* renamed from: A */
        public List o() {
            return (List) this.f30751h.get();
        }

        @Override // f3.AbstractC5462g
        Map a() {
            return q();
        }

        @Override // f3.AbstractC5462g
        Set c() {
            return r();
        }
    }

    private static class c extends AbstractC5456d {

        /* renamed from: h */
        transient InterfaceC5355E f30752h;

        c(Map map, InterfaceC5355E interfaceC5355E) {
            super(map);
            this.f30752h = (InterfaceC5355E) e3.w.checkNotNull(interfaceC5355E);
        }

        @Override // f3.AbstractC5462g
        Map a() {
            return q();
        }

        @Override // f3.AbstractC5462g
        Set c() {
            return r();
        }

        @Override // f3.AbstractC5456d
        protected Collection o() {
            return (Collection) this.f30752h.get();
        }

        @Override // f3.AbstractC5456d
        Collection w(Collection collection) {
            return collection instanceof NavigableSet ? h1.unmodifiableNavigableSet((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        @Override // f3.AbstractC5456d
        Collection x(Object obj, Collection collection) {
            return collection instanceof List ? y(obj, (List) collection, null) : collection instanceof NavigableSet ? new AbstractC5456d.m(obj, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractC5456d.o(obj, (SortedSet) collection, null) : collection instanceof Set ? new AbstractC5456d.n(obj, (Set) collection) : new AbstractC5456d.k(obj, collection, null);
        }
    }

    private static class d extends AbstractC5468j {

        /* renamed from: h */
        transient InterfaceC5355E f30753h;

        d(Map map, InterfaceC5355E interfaceC5355E) {
            super(map);
            this.f30753h = (InterfaceC5355E) e3.w.checkNotNull(interfaceC5355E);
        }

        @Override // f3.AbstractC5456d
        /* renamed from: A */
        public Set o() {
            return (Set) this.f30753h.get();
        }

        @Override // f3.AbstractC5462g
        Map a() {
            return q();
        }

        @Override // f3.AbstractC5462g
        Set c() {
            return r();
        }

        @Override // f3.AbstractC5456d
        Collection w(Collection collection) {
            return collection instanceof NavigableSet ? h1.unmodifiableNavigableSet((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // f3.AbstractC5456d
        Collection x(Object obj, Collection collection) {
            return collection instanceof NavigableSet ? new AbstractC5456d.m(obj, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractC5456d.o(obj, (SortedSet) collection, null) : new AbstractC5456d.n(obj, (Set) collection);
        }
    }

    private static class e extends AbstractC5470k {

        /* renamed from: h */
        transient InterfaceC5355E f30754h;

        /* renamed from: i */
        transient Comparator f30755i;

        e(Map map, InterfaceC5355E interfaceC5355E) {
            super(map);
            this.f30754h = (InterfaceC5355E) e3.w.checkNotNull(interfaceC5355E);
            this.f30755i = ((SortedSet) interfaceC5355E.get()).comparator();
        }

        @Override // f3.AbstractC5456d
        /* renamed from: A */
        public SortedSet o() {
            return (SortedSet) this.f30754h.get();
        }

        @Override // f3.AbstractC5462g
        Map a() {
            return q();
        }

        @Override // f3.AbstractC5462g
        Set c() {
            return r();
        }

        @Override // f3.AbstractC5470k, f3.o1
        public Comparator<Object> valueComparator() {
            return this.f30755i;
        }
    }

    static abstract class f extends AbstractCollection {
        f() {
        }

        abstract F0 a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    static class g extends AbstractC5464h {

        /* renamed from: c */
        final F0 f30756c;

        class a extends r1 {

            /* renamed from: f3.H0$g$a$a */
            class C0289a extends L0.e {

                /* renamed from: a */
                final /* synthetic */ Map.Entry f30757a;

                C0289a(a aVar, Map.Entry entry) {
                    this.f30757a = entry;
                }

                @Override // f3.L0.e, f3.K0.a
                public int getCount() {
                    return ((Collection) this.f30757a.getValue()).size();
                }

                @Override // f3.L0.e, f3.K0.a
                public Object getElement() {
                    return this.f30757a.getKey();
                }
            }

            a(g gVar, Iterator it) {
                super(it);
            }

            @Override // f3.r1
            /* renamed from: b */
            public K0.a a(Map.Entry entry) {
                return new C0289a(this, entry);
            }
        }

        g(F0 f02) {
            this.f30756c = f02;
        }

        @Override // f3.AbstractC5464h
        int c() {
            return this.f30756c.asMap().size();
        }

        @Override // f3.AbstractC5464h, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f30756c.clear();
        }

        @Override // f3.AbstractC5464h, java.util.AbstractCollection, java.util.Collection, f3.K0
        public boolean contains(Object obj) {
            return this.f30756c.containsKey(obj);
        }

        @Override // f3.AbstractC5464h, f3.K0
        public int count(Object obj) {
            Collection collection = (Collection) E0.D(this.f30756c.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // f3.AbstractC5464h
        Iterator d() {
            throw new AssertionError("should never be called");
        }

        @Override // f3.AbstractC5464h
        Iterator e() {
            return new a(this, this.f30756c.asMap().entrySet().iterator());
        }

        @Override // f3.AbstractC5464h, f3.K0
        public Set<Object> elementSet() {
            return this.f30756c.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, f3.K0
        public Iterator<Object> iterator() {
            return E0.u(this.f30756c.entries().iterator());
        }

        @Override // f3.AbstractC5464h, f3.K0
        public int remove(Object obj, int i8) {
            AbstractC5484r.b(i8, "occurrences");
            if (i8 == 0) {
                return count(obj);
            }
            Collection collection = (Collection) E0.D(this.f30756c.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i8 >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i9 = 0; i9 < i8; i9++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, f3.K0
        public int size() {
            return this.f30756c.size();
        }
    }

    private static class h extends AbstractC5462g implements g1, Serializable {

        /* renamed from: f */
        final Map f30758f;

        class a extends h1.j {

            /* renamed from: a */
            final /* synthetic */ Object f30759a;

            /* renamed from: f3.H0$h$a$a */
            class C0290a implements Iterator {

                /* renamed from: a */
                int f30761a;

                C0290a() {
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.f30761a == 0) {
                        a aVar = a.this;
                        if (h.this.f30758f.containsKey(aVar.f30759a)) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // java.util.Iterator
                public Object next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.f30761a++;
                    a aVar = a.this;
                    return N0.a(h.this.f30758f.get(aVar.f30759a));
                }

                @Override // java.util.Iterator
                public void remove() {
                    AbstractC5484r.d(this.f30761a == 1);
                    this.f30761a = -1;
                    a aVar = a.this;
                    h.this.f30758f.remove(aVar.f30759a);
                }
            }

            a(Object obj) {
                this.f30759a = obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Object> iterator() {
                return new C0290a();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return h.this.f30758f.containsKey(this.f30759a) ? 1 : 0;
            }
        }

        h(Map map) {
            this.f30758f = (Map) e3.w.checkNotNull(map);
        }

        @Override // f3.AbstractC5462g
        Map a() {
            return new a(this);
        }

        @Override // f3.AbstractC5462g
        Collection b() {
            throw new AssertionError("unreachable");
        }

        @Override // f3.AbstractC5462g
        Set c() {
            return this.f30758f.keySet();
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
        public void clear() {
            this.f30758f.clear();
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.g1
        public boolean containsEntry(Object obj, Object obj2) {
            return this.f30758f.entrySet().contains(E0.immutableEntry(obj, obj2));
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
        public boolean containsKey(Object obj) {
            return this.f30758f.containsKey(obj);
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.g1
        public boolean containsValue(Object obj) {
            return this.f30758f.containsValue(obj);
        }

        @Override // f3.AbstractC5462g
        K0 d() {
            return new g(this);
        }

        @Override // f3.AbstractC5462g
        Collection e() {
            return this.f30758f.values();
        }

        @Override // f3.AbstractC5462g
        Iterator f() {
            return this.f30758f.entrySet().iterator();
        }

        @Override // f3.AbstractC5462g, f3.F0
        public int hashCode() {
            return this.f30758f.hashCode();
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.g1
        public boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.g1
        public boolean putAll(Object obj, Iterable<Object> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.g1
        public boolean remove(Object obj, Object obj2) {
            return this.f30758f.entrySet().remove(E0.immutableEntry(obj, obj2));
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues(obj, (Iterable<Object>) iterable);
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
        public int size() {
            return this.f30758f.size();
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public Set<Map.Entry<Object, Object>> entries() {
            return this.f30758f.entrySet();
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
        public Set<Object> get(Object obj) {
            return new a(obj);
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.g1
        public boolean putAll(F0 f02) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
        public Set<Object> removeAll(Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.f30758f.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.f30758f.remove(obj));
            return hashSet;
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public Set<Object> replaceValues(Object obj, Iterable<Object> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class i extends j implements InterfaceC5501z0 {
        i(InterfaceC5501z0 interfaceC5501z0, E0.t tVar) {
            super(interfaceC5501z0, tVar);
        }

        @Override // f3.H0.j
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public List i(Object obj, Collection collection) {
            return A0.transform((List) collection, E0.j(this.f30764g, obj));
        }

        @Override // f3.H0.j, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues(obj, (Iterable<Object>) iterable);
        }

        @Override // f3.H0.j, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
        public List<Object> get(Object obj) {
            return j(obj, this.f30763f.get(obj));
        }

        @Override // f3.H0.j, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
        public List<Object> removeAll(Object obj) {
            return j(obj, this.f30763f.removeAll(obj));
        }

        @Override // f3.H0.j, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public List<Object> replaceValues(Object obj, Iterable<Object> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    static class j extends AbstractC5462g {

        /* renamed from: f */
        final F0 f30763f;

        /* renamed from: g */
        final E0.t f30764g;

        j(F0 f02, E0.t tVar) {
            this.f30763f = (F0) e3.w.checkNotNull(f02);
            this.f30764g = (E0.t) e3.w.checkNotNull(tVar);
        }

        @Override // f3.AbstractC5462g
        Map a() {
            return E0.transformEntries(this.f30763f.asMap(), new E0.t() { // from class: f3.I0
                @Override // f3.E0.t
                public final Object transformEntry(Object obj, Object obj2) {
                    return this.f30776a.i(obj, (Collection) obj2);
                }
            });
        }

        @Override // f3.AbstractC5462g
        Collection b() {
            return new AbstractC5462g.a();
        }

        @Override // f3.AbstractC5462g
        Set c() {
            return this.f30763f.keySet();
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
        public void clear() {
            this.f30763f.clear();
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
        public boolean containsKey(Object obj) {
            return this.f30763f.containsKey(obj);
        }

        @Override // f3.AbstractC5462g
        K0 d() {
            return this.f30763f.keys();
        }

        @Override // f3.AbstractC5462g
        Collection e() {
            return AbstractC5486s.transform(this.f30763f.entries(), E0.g(this.f30764g));
        }

        @Override // f3.AbstractC5462g
        Iterator f() {
            return AbstractC5495w0.transform(this.f30763f.entries().iterator(), E0.f(this.f30764g));
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
        public Collection<Object> get(Object obj) {
            return i(obj, this.f30763f.get(obj));
        }

        @Override // f3.AbstractC5462g, f3.F0
        public boolean isEmpty() {
            return this.f30763f.isEmpty();
        }

        /* renamed from: j */
        public Collection i(Object obj, Collection collection) {
            e3.l lVarJ = E0.j(this.f30764g, obj);
            return collection instanceof List ? A0.transform((List) collection, lVarJ) : AbstractC5486s.transform(collection, lVarJ);
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.g1
        public boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.g1
        public boolean putAll(Object obj, Iterable<Object> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.g1
        public boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
        public Collection<Object> removeAll(Object obj) {
            return i(obj, this.f30763f.removeAll(obj));
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public Collection<Object> replaceValues(Object obj, Iterable<Object> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
        public int size() {
            return this.f30763f.size();
        }

        @Override // f3.AbstractC5462g, f3.F0, f3.g1
        public boolean putAll(F0 f02) {
            throw new UnsupportedOperationException();
        }
    }

    private static class k extends l implements InterfaceC5501z0 {
        k(InterfaceC5501z0 interfaceC5501z0) {
            super(interfaceC5501z0);
        }

        @Override // f3.H0.l, f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues(obj, (Iterable<Object>) iterable);
        }

        @Override // f3.H0.l, f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K
        public List<Object> get(Object obj) {
            return Collections.unmodifiableList(delegate().get(obj));
        }

        @Override // f3.H0.l, f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K
        public List<Object> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.H0.l, f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public List<Object> replaceValues(Object obj, Iterable<Object> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.H0.l, f3.X
        public InterfaceC5501z0 delegate() {
            return (InterfaceC5501z0) super.delegate();
        }
    }

    static class l extends AbstractC5448U implements Serializable {

        /* renamed from: a */
        final F0 f30765a;

        /* renamed from: b */
        transient Collection f30766b;

        /* renamed from: c */
        transient K0 f30767c;

        /* renamed from: d */
        transient Set f30768d;

        /* renamed from: e */
        transient Collection f30769e;

        /* renamed from: f */
        transient Map f30770f;

        l(F0 f02) {
            this.f30765a = (F0) e3.w.checkNotNull(f02);
        }

        @Override // f3.AbstractC5448U, f3.F0, f3.InterfaceC5501z0
        public Map<Object, Collection<Object>> asMap() {
            Map<Object, Collection<Object>> map = this.f30770f;
            if (map != null) {
                return map;
            }
            Map<Object, Collection<Object>> mapUnmodifiableMap = Collections.unmodifiableMap(E0.transformValues(this.f30765a.asMap(), new e3.l() { // from class: f3.J0
                @Override // e3.l
                public final Object apply(Object obj) {
                    return H0.b((Collection) obj);
                }
            }));
            this.f30770f = mapUnmodifiableMap;
            return mapUnmodifiableMap;
        }

        @Override // f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public Collection<Map.Entry<Object, Object>> entries() {
            Collection<Map.Entry<Object, Object>> collection = this.f30766b;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<Object, Object>> collectionF = H0.f(this.f30765a.entries());
            this.f30766b = collectionF;
            return collectionF;
        }

        @Override // f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K
        public Collection<Object> get(Object obj) {
            return H0.g(this.f30765a.get(obj));
        }

        @Override // f3.AbstractC5448U, f3.F0
        public Set<Object> keySet() {
            Set<Object> set = this.f30768d;
            if (set != null) {
                return set;
            }
            Set<Object> setUnmodifiableSet = Collections.unmodifiableSet(this.f30765a.keySet());
            this.f30768d = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // f3.AbstractC5448U, f3.F0
        public K0 keys() {
            K0 k02 = this.f30767c;
            if (k02 != null) {
                return k02;
            }
            K0 k0UnmodifiableMultiset = L0.unmodifiableMultiset(this.f30765a.keys());
            this.f30767c = k0UnmodifiableMultiset;
            return k0UnmodifiableMultiset;
        }

        @Override // f3.AbstractC5448U, f3.F0, f3.g1
        public boolean put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5448U, f3.F0, f3.g1
        public boolean putAll(Object obj, Iterable<Object> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5448U, f3.F0, f3.g1
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K
        public Collection<Object> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public Collection<Object> replaceValues(Object obj, Iterable<Object> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5448U, f3.F0
        public Collection<Object> values() {
            Collection<Object> collection = this.f30769e;
            if (collection != null) {
                return collection;
            }
            Collection<Object> collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f30765a.values());
            this.f30769e = collectionUnmodifiableCollection;
            return collectionUnmodifiableCollection;
        }

        @Override // f3.X
        public F0 delegate() {
            return this.f30765a;
        }

        @Override // f3.AbstractC5448U, f3.F0, f3.g1
        public boolean putAll(F0 f02) {
            throw new UnsupportedOperationException();
        }
    }

    private static class m extends l implements g1 {
        m(g1 g1Var) {
            super(g1Var);
        }

        @Override // f3.H0.l, f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues(obj, (Iterable<Object>) iterable);
        }

        @Override // f3.H0.l, f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public Set<Map.Entry<Object, Object>> entries() {
            return E0.K(delegate().entries());
        }

        @Override // f3.H0.l, f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K
        public Set<Object> get(Object obj) {
            return Collections.unmodifiableSet(delegate().get(obj));
        }

        @Override // f3.H0.l, f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K
        public Set<Object> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.H0.l, f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public Set<Object> replaceValues(Object obj, Iterable<Object> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.H0.l, f3.X
        public g1 delegate() {
            return (g1) super.delegate();
        }
    }

    private static class n extends m implements o1 {
        n(o1 o1Var) {
            super(o1Var);
        }

        @Override // f3.H0.m, f3.H0.l, f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues(obj, (Iterable<Object>) iterable);
        }

        @Override // f3.o1
        public Comparator<Object> valueComparator() {
            return delegate().valueComparator();
        }

        @Override // f3.H0.m, f3.H0.l, f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
            return replaceValues(obj, (Iterable<Object>) iterable);
        }

        @Override // f3.H0.m, f3.H0.l, f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K
        public SortedSet<Object> get(Object obj) {
            return Collections.unmodifiableSortedSet(delegate().get(obj));
        }

        @Override // f3.H0.m, f3.H0.l, f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K
        public SortedSet<Object> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.H0.m, f3.H0.l, f3.AbstractC5448U, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public SortedSet<Object> replaceValues(Object obj, Iterable<Object> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.H0.m, f3.H0.l, f3.X
        public o1 delegate() {
            return (o1) super.delegate();
        }
    }

    public static <K, V> Map<K, List<V>> asMap(InterfaceC5501z0 interfaceC5501z0) {
        return (Map<K, List<V>>) interfaceC5501z0.asMap();
    }

    public static /* synthetic */ Collection b(Collection collection) {
        return g(collection);
    }

    static boolean c(F0 f02, Object obj) {
        if (obj == f02) {
            return true;
        }
        if (obj instanceof F0) {
            return f02.asMap().equals(((F0) obj).asMap());
        }
        return false;
    }

    private static F0 d(InterfaceC5439K interfaceC5439K, e3.x xVar) {
        return new C5415E(interfaceC5439K.unfiltered(), e3.y.and(interfaceC5439K.entryPredicate(), xVar));
    }

    private static g1 e(InterfaceC5441M interfaceC5441M, e3.x xVar) {
        return new C5435G(interfaceC5441M.unfiltered(), e3.y.and(interfaceC5441M.entryPredicate(), xVar));
    }

    public static Collection f(Collection collection) {
        return collection instanceof Set ? E0.K((Set) collection) : new E0.M(Collections.unmodifiableCollection(collection));
    }

    public static <K, V> F0 filterEntries(F0 f02, e3.x xVar) {
        e3.w.checkNotNull(xVar);
        return f02 instanceof g1 ? filterEntries((g1) f02, xVar) : f02 instanceof InterfaceC5439K ? d((InterfaceC5439K) f02, xVar) : new C5415E((F0) e3.w.checkNotNull(f02), xVar);
    }

    public static <K, V> F0 filterKeys(F0 f02, e3.x xVar) {
        if (f02 instanceof g1) {
            return filterKeys((g1) f02, xVar);
        }
        if (f02 instanceof InterfaceC5501z0) {
            return filterKeys((InterfaceC5501z0) f02, xVar);
        }
        if (!(f02 instanceof C5437I)) {
            return f02 instanceof InterfaceC5439K ? d((InterfaceC5439K) f02, E0.w(xVar)) : new C5437I(f02, xVar);
        }
        C5437I c5437i = (C5437I) f02;
        return new C5437I(c5437i.f30771f, e3.y.and(c5437i.f30772g, xVar));
    }

    public static <K, V> F0 filterValues(F0 f02, e3.x xVar) {
        return filterEntries(f02, E0.P(xVar));
    }

    public static <K, V> g1 forMap(Map<K, V> map) {
        return new h(map);
    }

    public static Collection g(Collection collection) {
        return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    public static <K, V> C5467i0 index(Iterable<V> iterable, e3.l lVar) {
        return index(iterable.iterator(), lVar);
    }

    public static <K, V, M extends F0> M invertFrom(F0 f02, M m8) {
        e3.w.checkNotNull(m8);
        for (Map.Entry<Object, Object> entry : f02.entries()) {
            m8.put(entry.getValue(), entry.getKey());
        }
        return m8;
    }

    public static <K, V> InterfaceC5501z0 newListMultimap(Map<K, Collection<V>> map, InterfaceC5355E interfaceC5355E) {
        return new b(map, interfaceC5355E);
    }

    public static <K, V> F0 newMultimap(Map<K, Collection<V>> map, InterfaceC5355E interfaceC5355E) {
        return new c(map, interfaceC5355E);
    }

    public static <K, V> g1 newSetMultimap(Map<K, Collection<V>> map, InterfaceC5355E interfaceC5355E) {
        return new d(map, interfaceC5355E);
    }

    public static <K, V> o1 newSortedSetMultimap(Map<K, Collection<V>> map, InterfaceC5355E interfaceC5355E) {
        return new e(map, interfaceC5355E);
    }

    public static <K, V> InterfaceC5501z0 synchronizedListMultimap(InterfaceC5501z0 interfaceC5501z0) {
        return p1.j(interfaceC5501z0, null);
    }

    public static <K, V> F0 synchronizedMultimap(F0 f02) {
        return p1.k(f02, null);
    }

    public static <K, V> g1 synchronizedSetMultimap(g1 g1Var) {
        return p1.s(g1Var, null);
    }

    public static <K, V> o1 synchronizedSortedSetMultimap(o1 o1Var) {
        return p1.v(o1Var, null);
    }

    public static <K, V1, V2> F0 transformEntries(F0 f02, E0.t tVar) {
        return new j(f02, tVar);
    }

    public static <K, V1, V2> F0 transformValues(F0 f02, e3.l lVar) {
        e3.w.checkNotNull(lVar);
        return transformEntries(f02, E0.h(lVar));
    }

    public static <K, V> InterfaceC5501z0 unmodifiableListMultimap(InterfaceC5501z0 interfaceC5501z0) {
        return ((interfaceC5501z0 instanceof k) || (interfaceC5501z0 instanceof C5467i0)) ? interfaceC5501z0 : new k(interfaceC5501z0);
    }

    public static <K, V> F0 unmodifiableMultimap(F0 f02) {
        return ((f02 instanceof l) || (f02 instanceof AbstractC5477n0)) ? f02 : new l(f02);
    }

    public static <K, V> g1 unmodifiableSetMultimap(g1 g1Var) {
        return ((g1Var instanceof m) || (g1Var instanceof C5485r0)) ? g1Var : new m(g1Var);
    }

    public static <K, V> o1 unmodifiableSortedSetMultimap(o1 o1Var) {
        return o1Var instanceof n ? o1Var : new n(o1Var);
    }

    public static <K, V> Map<K, Set<V>> asMap(g1 g1Var) {
        return (Map<K, Set<V>>) g1Var.asMap();
    }

    public static <K, V> g1 filterValues(g1 g1Var, e3.x xVar) {
        return filterEntries(g1Var, E0.P(xVar));
    }

    public static <K, V> C5467i0 index(Iterator<V> it, e3.l lVar) {
        e3.w.checkNotNull(lVar);
        C5467i0.a aVarBuilder = C5467i0.builder();
        while (it.hasNext()) {
            V next = it.next();
            e3.w.checkNotNull(next, it);
            aVarBuilder.put(lVar.apply(next), (Object) next);
        }
        return aVarBuilder.build();
    }

    public static <K, V1, V2> InterfaceC5501z0 transformEntries(InterfaceC5501z0 interfaceC5501z0, E0.t tVar) {
        return new i(interfaceC5501z0, tVar);
    }

    public static <K, V> Map<K, SortedSet<V>> asMap(o1 o1Var) {
        return (Map<K, SortedSet<V>>) o1Var.asMap();
    }

    @Deprecated
    public static <K, V> InterfaceC5501z0 unmodifiableListMultimap(C5467i0 c5467i0) {
        return (InterfaceC5501z0) e3.w.checkNotNull(c5467i0);
    }

    @Deprecated
    public static <K, V> F0 unmodifiableMultimap(AbstractC5477n0 abstractC5477n0) {
        return (F0) e3.w.checkNotNull(abstractC5477n0);
    }

    @Deprecated
    public static <K, V> g1 unmodifiableSetMultimap(C5485r0 c5485r0) {
        return (g1) e3.w.checkNotNull(c5485r0);
    }

    public static <K, V> Map<K, Collection<V>> asMap(F0 f02) {
        return (Map<K, Collection<V>>) f02.asMap();
    }

    public static <K, V1, V2> InterfaceC5501z0 transformValues(InterfaceC5501z0 interfaceC5501z0, e3.l lVar) {
        e3.w.checkNotNull(lVar);
        return transformEntries(interfaceC5501z0, E0.h(lVar));
    }

    public static <K, V> g1 filterEntries(g1 g1Var, e3.x xVar) {
        e3.w.checkNotNull(xVar);
        if (g1Var instanceof InterfaceC5441M) {
            return e((InterfaceC5441M) g1Var, xVar);
        }
        return new C5435G((g1) e3.w.checkNotNull(g1Var), xVar);
    }

    public static <K, V> g1 filterKeys(g1 g1Var, e3.x xVar) {
        if (g1Var instanceof C5438J) {
            C5438J c5438j = (C5438J) g1Var;
            return new C5438J(c5438j.unfiltered(), e3.y.and(c5438j.f30772g, xVar));
        }
        if (g1Var instanceof InterfaceC5441M) {
            return e((InterfaceC5441M) g1Var, E0.w(xVar));
        }
        return new C5438J(g1Var, xVar);
    }

    public static <K, V> InterfaceC5501z0 filterKeys(InterfaceC5501z0 interfaceC5501z0, e3.x xVar) {
        if (interfaceC5501z0 instanceof C5436H) {
            C5436H c5436h = (C5436H) interfaceC5501z0;
            return new C5436H(c5436h.unfiltered(), e3.y.and(c5436h.f30772g, xVar));
        }
        return new C5436H(interfaceC5501z0, xVar);
    }
}
