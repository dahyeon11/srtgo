package f3;

import f3.AbstractC5462g;
import f3.E0;
import f3.H0;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: f3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5456d extends AbstractC5462g implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    private transient Map f30886f;

    /* renamed from: g, reason: collision with root package name */
    private transient int f30887g;

    /* renamed from: f3.d$b */
    class b extends AbstractC0294d {
        b(AbstractC5456d abstractC5456d) {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.AbstractC5456d.AbstractC0294d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(Object obj, Object obj2) {
            return E0.immutableEntry(obj, obj2);
        }
    }

    /* renamed from: f3.d$c */
    private class c extends E0.R {

        /* renamed from: d, reason: collision with root package name */
        final transient Map f30888d;

        /* renamed from: f3.d$c$a */
        class a extends E0.s {
            a() {
            }

            @Override // f3.E0.s
            Map a() {
                return c.this;
            }

            @Override // f3.E0.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return AbstractC5486s.f(c.this.f30888d.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<Object, Collection<Object>>> iterator() {
                return c.this.new b();
            }

            @Override // f3.E0.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC5456d.this.v(entry.getKey());
                return true;
            }
        }

        /* renamed from: f3.d$c$b */
        class b implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            final Iterator f30891a;

            /* renamed from: b, reason: collision with root package name */
            Collection f30892b;

            b() {
                this.f30891a = c.this.f30888d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f30891a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                e3.w.checkState(this.f30892b != null, "no calls to next() since the last call to remove()");
                this.f30891a.remove();
                AbstractC5456d.m(AbstractC5456d.this, this.f30892b.size());
                this.f30892b.clear();
                this.f30892b = null;
            }

            @Override // java.util.Iterator
            public Map.Entry<Object, Collection<Object>> next() {
                Map.Entry entry = (Map.Entry) this.f30891a.next();
                this.f30892b = (Collection) entry.getValue();
                return c.this.c(entry);
            }
        }

        c(Map map) {
            this.f30888d = map;
        }

        @Override // f3.E0.R
        protected Set a() {
            return new a();
        }

        Map.Entry c(Map.Entry entry) {
            Object key = entry.getKey();
            return E0.immutableEntry(key, AbstractC5456d.this.x(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f30888d == AbstractC5456d.this.f30886f) {
                AbstractC5456d.this.clear();
            } else {
                AbstractC5495w0.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return E0.C(this.f30888d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f30888d.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f30888d.hashCode();
        }

        @Override // f3.E0.R, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Object> keySet() {
            return AbstractC5456d.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f30888d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f30888d.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<Object> get(Object obj) {
            Collection collection = (Collection) E0.D(this.f30888d, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC5456d.this.x(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<Object> remove(Object obj) {
            Collection<? extends Object> collection = (Collection) this.f30888d.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection<Object> collectionO = AbstractC5456d.this.o();
            collectionO.addAll(collection);
            AbstractC5456d.m(AbstractC5456d.this, collection.size());
            collection.clear();
            return collectionO;
        }
    }

    /* renamed from: f3.d$d, reason: collision with other inner class name */
    private abstract class AbstractC0294d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        final Iterator f30894a;

        /* renamed from: b, reason: collision with root package name */
        Object f30895b = null;

        /* renamed from: c, reason: collision with root package name */
        Collection f30896c = null;

        /* renamed from: d, reason: collision with root package name */
        Iterator f30897d = AbstractC5495w0.h();

        AbstractC0294d() {
            this.f30894a = AbstractC5456d.this.f30886f.entrySet().iterator();
        }

        abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30894a.hasNext() || this.f30897d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f30897d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f30894a.next();
                this.f30895b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f30896c = collection;
                this.f30897d = collection.iterator();
            }
            return a(N0.a(this.f30895b), this.f30897d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f30897d.remove();
            Collection collection = this.f30896c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f30894a.remove();
            }
            AbstractC5456d.k(AbstractC5456d.this);
        }
    }

    /* renamed from: f3.d$e */
    private class e extends E0.B {

        /* renamed from: f3.d$e$a */
        class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            Map.Entry f30900a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f30901b;

            a(Iterator it) {
                this.f30901b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f30901b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f30901b.next();
                this.f30900a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                e3.w.checkState(this.f30900a != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f30900a.getValue();
                this.f30901b.remove();
                AbstractC5456d.m(AbstractC5456d.this, collection.size());
                collection.clear();
                this.f30900a = null;
            }
        }

        e(Map map) {
            super(map);
        }

        @Override // f3.E0.B, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC5495w0.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return b().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || b().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return b().keySet().hashCode();
        }

        @Override // f3.E0.B, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Object> iterator() {
            return new a(b().entrySet().iterator());
        }

        @Override // f3.E0.B, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) b().remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                AbstractC5456d.m(AbstractC5456d.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* renamed from: f3.d$f */
    class f extends i implements NavigableMap {
        f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Collection<Object>> ceilingEntry(Object obj) {
            Map.Entry entryCeilingEntry = e().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return c(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return e().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<Object> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Collection<Object>> descendingMap() {
            return AbstractC5456d.this.new f(e().descendingMap());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.AbstractC5456d.i
        /* renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet d() {
            return AbstractC5456d.this.new g(e());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Collection<Object>> firstEntry() {
            Map.Entry entryFirstEntry = e().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return c(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Collection<Object>> floorEntry(Object obj) {
            Map.Entry entryFloorEntry = e().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return c(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return e().floorKey(obj);
        }

        Map.Entry g(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection collectionO = AbstractC5456d.this.o();
            collectionO.addAll((Collection) entry.getValue());
            it.remove();
            return E0.immutableEntry(entry.getKey(), AbstractC5456d.this.w(collectionO));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.AbstractC5456d.i
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap e() {
            return (NavigableMap) super.e();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Collection<Object>> higherEntry(Object obj) {
            Map.Entry entryHigherEntry = e().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return c(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return e().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Collection<Object>> lastEntry() {
            Map.Entry entryLastEntry = e().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return c(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Collection<Object>> lowerEntry(Object obj) {
            Map.Entry entryLowerEntry = e().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return c(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return e().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<Object> navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Collection<Object>> pollFirstEntry() {
            return g(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Collection<Object>> pollLastEntry() {
            return g(descendingMap().entrySet().iterator());
        }

        @Override // f3.AbstractC5456d.i, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<Object, Collection<Object>> headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // f3.AbstractC5456d.i, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<Object, Collection<Object>> subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // f3.AbstractC5456d.i, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<Object, Collection<Object>> tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Collection<Object>> headMap(Object obj, boolean z8) {
            return AbstractC5456d.this.new f(e().headMap(obj, z8));
        }

        @Override // f3.AbstractC5456d.i, f3.AbstractC5456d.c, f3.E0.R, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public NavigableSet<Object> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Collection<Object>> subMap(Object obj, boolean z8, Object obj2, boolean z9) {
            return AbstractC5456d.this.new f(e().subMap(obj, z8, obj2, z9));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Collection<Object>> tailMap(Object obj, boolean z8) {
            return AbstractC5456d.this.new f(e().tailMap(obj, z8));
        }
    }

    /* renamed from: f3.d$g */
    class g extends j implements NavigableSet {
        g(NavigableMap navigableMap) {
            super(navigableMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.AbstractC5456d.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableMap b() {
            return (NavigableMap) super.b();
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return b().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator<Object> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> descendingSet() {
            return AbstractC5456d.this.new g(b().descendingMap());
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return b().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return b().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return b().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return AbstractC5495w0.k(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return AbstractC5495w0.k(descendingIterator());
        }

        @Override // f3.AbstractC5456d.j, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<Object> headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // f3.AbstractC5456d.j, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<Object> subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // f3.AbstractC5456d.j, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<Object> tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> headSet(Object obj, boolean z8) {
            return AbstractC5456d.this.new g(b().headMap(obj, z8));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> subSet(Object obj, boolean z8, Object obj2, boolean z9) {
            return AbstractC5456d.this.new g(b().subMap(obj, z8, obj2, z9));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> tailSet(Object obj, boolean z8) {
            return AbstractC5456d.this.new g(b().tailMap(obj, z8));
        }
    }

    /* renamed from: f3.d$h */
    private class h extends l implements RandomAccess {
        h(AbstractC5456d abstractC5456d, Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }
    }

    /* renamed from: f3.d$i */
    private class i extends c implements SortedMap {

        /* renamed from: f, reason: collision with root package name */
        SortedSet f30905f;

        i(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<Object> comparator() {
            return e().comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.E0.R
        public SortedSet d() {
            return AbstractC5456d.this.new j(e());
        }

        SortedMap e() {
            return (SortedMap) this.f30888d;
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return e().firstKey();
        }

        public SortedMap<Object, Collection<Object>> headMap(Object obj) {
            return AbstractC5456d.this.new i(e().headMap(obj));
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return e().lastKey();
        }

        public SortedMap<Object, Collection<Object>> subMap(Object obj, Object obj2) {
            return AbstractC5456d.this.new i(e().subMap(obj, obj2));
        }

        public SortedMap<Object, Collection<Object>> tailMap(Object obj) {
            return AbstractC5456d.this.new i(e().tailMap(obj));
        }

        @Override // f3.AbstractC5456d.c, f3.E0.R, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public SortedSet<Object> keySet() {
            SortedSet<Object> sortedSet = this.f30905f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<Object> sortedSetD = d();
            this.f30905f = sortedSetD;
            return sortedSetD;
        }
    }

    /* renamed from: f3.d$j */
    private class j extends e implements SortedSet {
        j(SortedMap sortedMap) {
            super(sortedMap);
        }

        SortedMap b() {
            return (SortedMap) super.b();
        }

        @Override // java.util.SortedSet
        public Comparator<Object> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return b().firstKey();
        }

        public SortedSet<Object> headSet(Object obj) {
            return AbstractC5456d.this.new j(b().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return b().lastKey();
        }

        public SortedSet<Object> subSet(Object obj, Object obj2) {
            return AbstractC5456d.this.new j(b().subMap(obj, obj2));
        }

        public SortedSet<Object> tailSet(Object obj) {
            return AbstractC5456d.this.new j(b().tailMap(obj));
        }
    }

    /* renamed from: f3.d$m */
    class m extends o implements NavigableSet {
        m(Object obj, NavigableSet navigableSet, k kVar) {
            super(obj, navigableSet, kVar);
        }

        private NavigableSet i(NavigableSet navigableSet) {
            return AbstractC5456d.this.new m(this.f30908a, navigableSet, b() == null ? this : b());
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return g().ceiling(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator<Object> descendingIterator() {
            return new k.a(g().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> descendingSet() {
            return i(g().descendingSet());
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return g().floor(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.AbstractC5456d.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableSet g() {
            return (NavigableSet) super.g();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> headSet(Object obj, boolean z8) {
            return i(g().headSet(obj, z8));
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return g().higher(obj);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return g().lower(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return AbstractC5495w0.k(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return AbstractC5495w0.k(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> subSet(Object obj, boolean z8, Object obj2, boolean z9) {
            return i(g().subSet(obj, z8, obj2, z9));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> tailSet(Object obj, boolean z8) {
            return i(g().tailSet(obj, z8));
        }
    }

    /* renamed from: f3.d$n */
    class n extends k implements Set {
        n(Object obj, Set set) {
            super(obj, set, null);
        }

        @Override // f3.AbstractC5456d.k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zD = h1.d((Set) this.f30909b, collection);
            if (zD) {
                AbstractC5456d.l(AbstractC5456d.this, this.f30909b.size() - size);
                f();
            }
            return zD;
        }
    }

    /* renamed from: f3.d$o */
    class o extends k implements SortedSet {
        o(Object obj, SortedSet sortedSet, k kVar) {
            super(obj, sortedSet, kVar);
        }

        @Override // java.util.SortedSet
        public Comparator<Object> comparator() {
            return g().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            e();
            return g().first();
        }

        SortedSet g() {
            return (SortedSet) c();
        }

        @Override // java.util.SortedSet
        public SortedSet<Object> headSet(Object obj) {
            e();
            return AbstractC5456d.this.new o(d(), g().headSet(obj), b() == null ? this : b());
        }

        @Override // java.util.SortedSet
        public Object last() {
            e();
            return g().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<Object> subSet(Object obj, Object obj2) {
            e();
            return AbstractC5456d.this.new o(d(), g().subSet(obj, obj2), b() == null ? this : b());
        }

        @Override // java.util.SortedSet
        public SortedSet<Object> tailSet(Object obj) {
            e();
            return AbstractC5456d.this.new o(d(), g().tailSet(obj), b() == null ? this : b());
        }
    }

    protected AbstractC5456d(Map map) {
        e3.w.checkArgument(map.isEmpty());
        this.f30886f = map;
    }

    static /* synthetic */ int j(AbstractC5456d abstractC5456d) {
        int i8 = abstractC5456d.f30887g;
        abstractC5456d.f30887g = i8 + 1;
        return i8;
    }

    static /* synthetic */ int k(AbstractC5456d abstractC5456d) {
        int i8 = abstractC5456d.f30887g;
        abstractC5456d.f30887g = i8 - 1;
        return i8;
    }

    static /* synthetic */ int l(AbstractC5456d abstractC5456d, int i8) {
        int i9 = abstractC5456d.f30887g + i8;
        abstractC5456d.f30887g = i9;
        return i9;
    }

    static /* synthetic */ int m(AbstractC5456d abstractC5456d, int i8) {
        int i9 = abstractC5456d.f30887g - i8;
        abstractC5456d.f30887g = i9;
        return i9;
    }

    private Collection t(Object obj) {
        Collection collection = (Collection) this.f30886f.get(obj);
        if (collection != null) {
            return collection;
        }
        Collection collectionP = p(obj);
        this.f30886f.put(obj, collectionP);
        return collectionP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterator u(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(Object obj) {
        Collection collection = (Collection) E0.E(this.f30886f, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f30887g -= size;
        }
    }

    @Override // f3.AbstractC5462g
    Collection b() {
        return this instanceof g1 ? new AbstractC5462g.b(this) : new AbstractC5462g.a();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public void clear() {
        Iterator it = this.f30886f.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f30886f.clear();
        this.f30887g = 0;
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public boolean containsKey(Object obj) {
        return this.f30886f.containsKey(obj);
    }

    @Override // f3.AbstractC5462g
    K0 d() {
        return new H0.g(this);
    }

    @Override // f3.AbstractC5462g
    Collection e() {
        return new AbstractC5462g.c();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public Collection<Map.Entry<Object, Object>> entries() {
        return super.entries();
    }

    @Override // f3.AbstractC5462g
    Iterator f() {
        return new b(this);
    }

    @Override // f3.AbstractC5462g
    Iterator g() {
        return new a(this);
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public Collection<Object> get(Object obj) {
        Collection collectionP = (Collection) this.f30886f.get(obj);
        if (collectionP == null) {
            collectionP = p(obj);
        }
        return x(obj, collectionP);
    }

    abstract Collection o();

    Collection p(Object obj) {
        return o();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.g1
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f30886f.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f30887g++;
            return true;
        }
        Collection collectionP = p(obj);
        if (!collectionP.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f30887g++;
        this.f30886f.put(obj, collectionP);
        return true;
    }

    final Map q() {
        Map map = this.f30886f;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f30886f) : map instanceof SortedMap ? new i((SortedMap) this.f30886f) : new c(this.f30886f);
    }

    final Set r() {
        Map map = this.f30886f;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f30886f) : map instanceof SortedMap ? new j((SortedMap) this.f30886f) : new e(this.f30886f);
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public Collection<Object> removeAll(Object obj) {
        Collection collection = (Collection) this.f30886f.remove(obj);
        if (collection == null) {
            return s();
        }
        Collection collectionO = o();
        collectionO.addAll(collection);
        this.f30887g -= collection.size();
        collection.clear();
        return w(collectionO);
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public Collection<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(obj);
        }
        Collection collectionT = t(obj);
        Collection collectionO = o();
        collectionO.addAll(collectionT);
        this.f30887g -= collectionT.size();
        collectionT.clear();
        while (it.hasNext()) {
            if (collectionT.add(it.next())) {
                this.f30887g++;
            }
        }
        return w(collectionO);
    }

    Collection s() {
        return w(o());
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public int size() {
        return this.f30887g;
    }

    @Override // f3.AbstractC5462g, f3.F0
    public Collection<Object> values() {
        return super.values();
    }

    abstract Collection w(Collection collection);

    abstract Collection x(Object obj, Collection collection);

    final List y(Object obj, List list, k kVar) {
        return list instanceof RandomAccess ? new h(this, obj, list, kVar) : new l(obj, list, kVar);
    }

    /* renamed from: f3.d$k */
    class k extends AbstractCollection {

        /* renamed from: a, reason: collision with root package name */
        final Object f30908a;

        /* renamed from: b, reason: collision with root package name */
        Collection f30909b;

        /* renamed from: c, reason: collision with root package name */
        final k f30910c;

        /* renamed from: d, reason: collision with root package name */
        final Collection f30911d;

        k(Object obj, Collection collection, k kVar) {
            this.f30908a = obj;
            this.f30909b = collection;
            this.f30910c = kVar;
            this.f30911d = kVar == null ? null : kVar.c();
        }

        void a() {
            k kVar = this.f30910c;
            if (kVar != null) {
                kVar.a();
            } else {
                AbstractC5456d.this.f30886f.put(this.f30908a, this.f30909b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            e();
            boolean zIsEmpty = this.f30909b.isEmpty();
            boolean zAdd = this.f30909b.add(obj);
            if (zAdd) {
                AbstractC5456d.j(AbstractC5456d.this);
                if (zIsEmpty) {
                    a();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<Object> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f30909b.addAll(collection);
            if (zAddAll) {
                AbstractC5456d.l(AbstractC5456d.this, this.f30909b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        k b() {
            return this.f30910c;
        }

        Collection c() {
            return this.f30909b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f30909b.clear();
            AbstractC5456d.m(AbstractC5456d.this, size);
            f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            e();
            return this.f30909b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            e();
            return this.f30909b.containsAll(collection);
        }

        Object d() {
            return this.f30908a;
        }

        void e() {
            Collection collection;
            k kVar = this.f30910c;
            if (kVar != null) {
                kVar.e();
                if (this.f30910c.c() != this.f30911d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f30909b.isEmpty() || (collection = (Collection) AbstractC5456d.this.f30886f.get(this.f30908a)) == null) {
                    return;
                }
                this.f30909b = collection;
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.f30909b.equals(obj);
        }

        void f() {
            k kVar = this.f30910c;
            if (kVar != null) {
                kVar.f();
            } else if (this.f30909b.isEmpty()) {
                AbstractC5456d.this.f30886f.remove(this.f30908a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            e();
            return this.f30909b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            e();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            e();
            boolean zRemove = this.f30909b.remove(obj);
            if (zRemove) {
                AbstractC5456d.k(AbstractC5456d.this);
                f();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f30909b.removeAll(collection);
            if (zRemoveAll) {
                AbstractC5456d.l(AbstractC5456d.this, this.f30909b.size() - size);
                f();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            e3.w.checkNotNull(collection);
            int size = size();
            boolean zRetainAll = this.f30909b.retainAll(collection);
            if (zRetainAll) {
                AbstractC5456d.l(AbstractC5456d.this, this.f30909b.size() - size);
                f();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            e();
            return this.f30909b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            e();
            return this.f30909b.toString();
        }

        /* renamed from: f3.d$k$a */
        class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            final Iterator f30913a;

            /* renamed from: b, reason: collision with root package name */
            final Collection f30914b;

            a() {
                Collection collection = k.this.f30909b;
                this.f30914b = collection;
                this.f30913a = AbstractC5456d.u(collection);
            }

            Iterator a() {
                b();
                return this.f30913a;
            }

            void b() {
                k.this.e();
                if (k.this.f30909b != this.f30914b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f30913a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                b();
                return this.f30913a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f30913a.remove();
                AbstractC5456d.k(AbstractC5456d.this);
                k.this.f();
            }

            a(Iterator it) {
                this.f30914b = k.this.f30909b;
                this.f30913a = it;
            }
        }
    }

    /* renamed from: f3.d$l */
    class l extends k implements List {

        /* renamed from: f3.d$l$a */
        private class a extends k.a implements ListIterator {
            a() {
                super();
            }

            private ListIterator c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean zIsEmpty = l.this.isEmpty();
                c().add(obj);
                AbstractC5456d.j(AbstractC5456d.this);
                if (zIsEmpty) {
                    l.this.a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                c().set(obj);
            }

            public a(int i8) {
                super(l.this.g().listIterator(i8));
            }
        }

        l(Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }

        @Override // java.util.List
        public void add(int i8, Object obj) {
            e();
            boolean zIsEmpty = c().isEmpty();
            g().add(i8, obj);
            AbstractC5456d.j(AbstractC5456d.this);
            if (zIsEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i8, Collection<Object> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = g().addAll(i8, collection);
            if (zAddAll) {
                AbstractC5456d.l(AbstractC5456d.this, c().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        List g() {
            return (List) c();
        }

        @Override // java.util.List
        public Object get(int i8) {
            e();
            return g().get(i8);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            e();
            return g().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            e();
            return g().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<Object> listIterator() {
            e();
            return new a();
        }

        @Override // java.util.List
        public Object remove(int i8) {
            e();
            Object objRemove = g().remove(i8);
            AbstractC5456d.k(AbstractC5456d.this);
            f();
            return objRemove;
        }

        @Override // java.util.List
        public Object set(int i8, Object obj) {
            e();
            return g().set(i8, obj);
        }

        @Override // java.util.List
        public List<Object> subList(int i8, int i9) {
            e();
            return AbstractC5456d.this.y(d(), g().subList(i8, i9), b() == null ? this : b());
        }

        @Override // java.util.List
        public ListIterator<Object> listIterator(int i8) {
            e();
            return new a(i8);
        }
    }

    /* renamed from: f3.d$a */
    class a extends AbstractC0294d {
        a(AbstractC5456d abstractC5456d) {
            super();
        }

        @Override // f3.AbstractC5456d.AbstractC0294d
        Object a(Object obj, Object obj2) {
            return obj2;
        }
    }
}
