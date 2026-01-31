package f3;

import f3.K0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
abstract class p1 {

    private static class b extends j {

        /* renamed from: f, reason: collision with root package name */
        transient Set f31045f;

        /* renamed from: g, reason: collision with root package name */
        transient Collection f31046g;

        b(Map map, Object obj) {
            super(map, obj);
        }

        @Override // f3.p1.j, java.util.Map
        public boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        @Override // f3.p1.j, java.util.Map
        public Set<Map.Entry<Object, Collection<Object>>> entrySet() {
            Set<Map.Entry<Object, Collection<Object>>> set;
            synchronized (this.f31068b) {
                try {
                    if (this.f31045f == null) {
                        this.f31045f = new c(c().entrySet(), this.f31068b);
                    }
                    set = this.f31045f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // f3.p1.j, java.util.Map
        public Collection<Collection<Object>> values() {
            Collection<Collection<Object>> collection;
            synchronized (this.f31068b) {
                try {
                    if (this.f31046g == null) {
                        this.f31046g = new d(c().values(), this.f31068b);
                    }
                    collection = this.f31046g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        @Override // f3.p1.j, java.util.Map
        public Collection<Object> get(Object obj) {
            Collection<Object> collectionW;
            synchronized (this.f31068b) {
                Collection collection = (Collection) super.get(obj);
                collectionW = collection == null ? null : p1.w(collection, this.f31068b);
            }
            return collectionW;
        }
    }

    private static class d extends f {

        class a extends r1 {
            a(Iterator it) {
                super(it);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // f3.r1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection a(Collection collection) {
                return p1.w(collection, d.this.f31068b);
            }
        }

        d(Collection collection, Object obj) {
            super(collection, obj);
        }

        @Override // f3.p1.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Collection<Object>> iterator() {
            return new a(super.iterator());
        }
    }

    static class e extends j implements InterfaceC5476n, Serializable {

        /* renamed from: f, reason: collision with root package name */
        private transient Set f31051f;

        /* renamed from: g, reason: collision with root package name */
        private transient InterfaceC5476n f31052g;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.p1.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5476n c() {
            return (InterfaceC5476n) super.c();
        }

        @Override // f3.InterfaceC5476n
        public Object forcePut(Object obj, Object obj2) {
            Object objForcePut;
            synchronized (this.f31068b) {
                objForcePut = b().forcePut(obj, obj2);
            }
            return objForcePut;
        }

        @Override // f3.InterfaceC5476n
        public InterfaceC5476n inverse() {
            InterfaceC5476n interfaceC5476n;
            synchronized (this.f31068b) {
                try {
                    if (this.f31052g == null) {
                        this.f31052g = new e(b().inverse(), this.f31068b, this);
                    }
                    interfaceC5476n = this.f31052g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return interfaceC5476n;
        }

        private e(InterfaceC5476n interfaceC5476n, Object obj, InterfaceC5476n interfaceC5476n2) {
            super(interfaceC5476n, obj);
            this.f31052g = interfaceC5476n2;
        }

        @Override // f3.p1.j, java.util.Map
        public Set<Object> values() {
            Set<Object> set;
            synchronized (this.f31068b) {
                try {
                    if (this.f31051f == null) {
                        this.f31051f = p1.r(b().values(), this.f31068b);
                    }
                    set = this.f31051f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }
    }

    static class f extends o implements Collection {
        @Override // java.util.Collection
        public boolean add(Object obj) {
            boolean zAdd;
            synchronized (this.f31068b) {
                zAdd = c().add(obj);
            }
            return zAdd;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<Object> collection) {
            boolean zAddAll;
            synchronized (this.f31068b) {
                zAddAll = c().addAll(collection);
            }
            return zAddAll;
        }

        /* renamed from: b */
        Collection c() {
            return (Collection) super.a();
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.f31068b) {
                c().clear();
            }
        }

        public boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.f31068b) {
                zContains = c().contains(obj);
            }
            return zContains;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean zContainsAll;
            synchronized (this.f31068b) {
                zContainsAll = c().containsAll(collection);
            }
            return zContainsAll;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f31068b) {
                zIsEmpty = c().isEmpty();
            }
            return zIsEmpty;
        }

        public Iterator<Object> iterator() {
            return c().iterator();
        }

        public boolean remove(Object obj) {
            boolean zRemove;
            synchronized (this.f31068b) {
                zRemove = c().remove(obj);
            }
            return zRemove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean zRemoveAll;
            synchronized (this.f31068b) {
                zRemoveAll = c().removeAll(collection);
            }
            return zRemoveAll;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean zRetainAll;
            synchronized (this.f31068b) {
                zRetainAll = c().retainAll(collection);
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.f31068b) {
                size = c().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.f31068b) {
                array = c().toArray();
            }
            return array;
        }

        private f(Collection collection, Object obj) {
            super(collection, obj);
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f31068b) {
                tArr2 = (T[]) c().toArray(tArr);
            }
            return tArr2;
        }
    }

    private static class g extends o implements Map.Entry {
        g(Map.Entry entry, Object obj) {
            super(entry, obj);
        }

        Map.Entry b() {
            return (Map.Entry) super.a();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean zEquals;
            synchronized (this.f31068b) {
                zEquals = b().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            Object key;
            synchronized (this.f31068b) {
                key = b().getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object value;
            synchronized (this.f31068b) {
                value = b().getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode;
            synchronized (this.f31068b) {
                iHashCode = b().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object value;
            synchronized (this.f31068b) {
                value = b().setValue(obj);
            }
            return value;
        }
    }

    private static class h extends f implements List {
        h(List list, Object obj) {
            super(list, obj);
        }

        @Override // java.util.List
        public void add(int i8, Object obj) {
            synchronized (this.f31068b) {
                b().add(i8, obj);
            }
        }

        @Override // java.util.List
        public boolean addAll(int i8, Collection<Object> collection) {
            boolean zAddAll;
            synchronized (this.f31068b) {
                zAddAll = b().addAll(i8, collection);
            }
            return zAddAll;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.p1.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List c() {
            return (List) super.c();
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f31068b) {
                zEquals = b().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.List
        public Object get(int i8) {
            Object obj;
            synchronized (this.f31068b) {
                obj = b().get(i8);
            }
            return obj;
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode;
            synchronized (this.f31068b) {
                iHashCode = b().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            synchronized (this.f31068b) {
                iIndexOf = b().indexOf(obj);
            }
            return iIndexOf;
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            synchronized (this.f31068b) {
                iLastIndexOf = b().lastIndexOf(obj);
            }
            return iLastIndexOf;
        }

        @Override // java.util.List
        public ListIterator<Object> listIterator() {
            return b().listIterator();
        }

        @Override // java.util.List
        public Object remove(int i8) {
            Object objRemove;
            synchronized (this.f31068b) {
                objRemove = b().remove(i8);
            }
            return objRemove;
        }

        @Override // java.util.List
        public Object set(int i8, Object obj) {
            Object obj2;
            synchronized (this.f31068b) {
                obj2 = b().set(i8, obj);
            }
            return obj2;
        }

        @Override // java.util.List
        public List<Object> subList(int i8, int i9) {
            List<Object> listI;
            synchronized (this.f31068b) {
                listI = p1.i(b().subList(i8, i9), this.f31068b);
            }
            return listI;
        }

        @Override // java.util.List
        public ListIterator<Object> listIterator(int i8) {
            return b().listIterator(i8);
        }
    }

    private static class i extends k implements InterfaceC5501z0 {
        i(InterfaceC5501z0 interfaceC5501z0, Object obj) {
            super(interfaceC5501z0, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.p1.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5501z0 b() {
            return (InterfaceC5501z0) super.b();
        }

        @Override // f3.p1.k, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues(obj, (Iterable<Object>) iterable);
        }

        @Override // f3.p1.k, f3.F0, f3.InterfaceC5439K
        public List<Object> get(Object obj) {
            List<Object> listI;
            synchronized (this.f31068b) {
                listI = p1.i(b().get(obj), this.f31068b);
            }
            return listI;
        }

        @Override // f3.p1.k, f3.F0, f3.InterfaceC5439K
        public List<Object> removeAll(Object obj) {
            List<Object> listRemoveAll;
            synchronized (this.f31068b) {
                listRemoveAll = b().removeAll(obj);
            }
            return listRemoveAll;
        }

        @Override // f3.p1.k, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public List<Object> replaceValues(Object obj, Iterable<Object> iterable) {
            List<Object> listReplaceValues;
            synchronized (this.f31068b) {
                listReplaceValues = b().replaceValues(obj, iterable);
            }
            return listReplaceValues;
        }
    }

    private static class j extends o implements Map {

        /* renamed from: c, reason: collision with root package name */
        transient Set f31053c;

        /* renamed from: d, reason: collision with root package name */
        transient Collection f31054d;

        /* renamed from: e, reason: collision with root package name */
        transient Set f31055e;

        j(Map map, Object obj) {
            super(map, obj);
        }

        /* renamed from: b */
        Map c() {
            return (Map) super.a();
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.f31068b) {
                c().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.f31068b) {
                zContainsKey = c().containsKey(obj);
            }
            return zContainsKey;
        }

        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.f31068b) {
                zContainsValue = c().containsValue(obj);
            }
            return zContainsValue;
        }

        public Set<Map.Entry<Object, Object>> entrySet() {
            Set<Map.Entry<Object, Object>> set;
            synchronized (this.f31068b) {
                try {
                    if (this.f31055e == null) {
                        this.f31055e = p1.r(c().entrySet(), this.f31068b);
                    }
                    set = this.f31055e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f31068b) {
                zEquals = c().equals(obj);
            }
            return zEquals;
        }

        public Object get(Object obj) {
            Object obj2;
            synchronized (this.f31068b) {
                obj2 = c().get(obj);
            }
            return obj2;
        }

        @Override // java.util.Map
        public int hashCode() {
            int iHashCode;
            synchronized (this.f31068b) {
                iHashCode = c().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f31068b) {
                zIsEmpty = c().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Map
        public Set<Object> keySet() {
            Set<Object> set;
            synchronized (this.f31068b) {
                try {
                    if (this.f31053c == null) {
                        this.f31053c = p1.r(c().keySet(), this.f31068b);
                    }
                    set = this.f31053c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public Object put(Object obj, Object obj2) {
            Object objPut;
            synchronized (this.f31068b) {
                objPut = c().put(obj, obj2);
            }
            return objPut;
        }

        @Override // java.util.Map
        public void putAll(Map<Object, Object> map) {
            synchronized (this.f31068b) {
                c().putAll(map);
            }
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            Object objRemove;
            synchronized (this.f31068b) {
                objRemove = c().remove(obj);
            }
            return objRemove;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.f31068b) {
                size = c().size();
            }
            return size;
        }

        public Collection<Object> values() {
            Collection<Object> collection;
            synchronized (this.f31068b) {
                try {
                    if (this.f31054d == null) {
                        this.f31054d = p1.h(c().values(), this.f31068b);
                    }
                    collection = this.f31054d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }
    }

    static class o implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Object f31067a;

        /* renamed from: b, reason: collision with root package name */
        final Object f31068b;

        o(Object obj, Object obj2) {
            this.f31067a = e3.w.checkNotNull(obj);
            this.f31068b = obj2 == null ? this : obj2;
        }

        Object a() {
            return this.f31067a;
        }

        public String toString() {
            String string;
            synchronized (this.f31068b) {
                string = this.f31067a.toString();
            }
            return string;
        }
    }

    private static class p extends h implements RandomAccess {
        p(List list, Object obj) {
            super(list, obj);
        }
    }

    static class q extends f implements Set {
        q(Set set, Object obj) {
            super(set, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.p1.f
        public Set c() {
            return (Set) super.c();
        }

        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f31068b) {
                zEquals = c().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int iHashCode;
            synchronized (this.f31068b) {
                iHashCode = c().hashCode();
            }
            return iHashCode;
        }
    }

    private static class r extends k implements g1 {

        /* renamed from: h, reason: collision with root package name */
        transient Set f31069h;

        r(g1 g1Var, Object obj) {
            super(g1Var, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.p1.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g1 b() {
            return (g1) super.b();
        }

        @Override // f3.p1.k, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues(obj, (Iterable<Object>) iterable);
        }

        @Override // f3.p1.k, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public Set<Map.Entry<Object, Object>> entries() {
            Set<Map.Entry<Object, Object>> set;
            synchronized (this.f31068b) {
                try {
                    if (this.f31069h == null) {
                        this.f31069h = p1.r(b().entries(), this.f31068b);
                    }
                    set = this.f31069h;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // f3.p1.k, f3.F0, f3.InterfaceC5439K
        public Set<Object> get(Object obj) {
            Set<Object> setR;
            synchronized (this.f31068b) {
                setR = p1.r(b().get(obj), this.f31068b);
            }
            return setR;
        }

        @Override // f3.p1.k, f3.F0, f3.InterfaceC5439K
        public Set<Object> removeAll(Object obj) {
            Set<Object> setRemoveAll;
            synchronized (this.f31068b) {
                setRemoveAll = b().removeAll(obj);
            }
            return setRemoveAll;
        }

        @Override // f3.p1.k, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public Set<Object> replaceValues(Object obj, Iterable<Object> iterable) {
            Set<Object> setReplaceValues;
            synchronized (this.f31068b) {
                setReplaceValues = b().replaceValues(obj, iterable);
            }
            return setReplaceValues;
        }
    }

    static class s extends j implements SortedMap {
        s(SortedMap sortedMap, Object obj) {
            super(sortedMap, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.p1.j
        public SortedMap c() {
            return (SortedMap) super.c();
        }

        @Override // java.util.SortedMap
        public Comparator<Object> comparator() {
            Comparator<Object> comparator;
            synchronized (this.f31068b) {
                comparator = c().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            Object objFirstKey;
            synchronized (this.f31068b) {
                objFirstKey = c().firstKey();
            }
            return objFirstKey;
        }

        public SortedMap<Object, Object> headMap(Object obj) {
            SortedMap<Object, Object> sortedMapT;
            synchronized (this.f31068b) {
                sortedMapT = p1.t(c().headMap(obj), this.f31068b);
            }
            return sortedMapT;
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            Object objLastKey;
            synchronized (this.f31068b) {
                objLastKey = c().lastKey();
            }
            return objLastKey;
        }

        public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
            SortedMap<Object, Object> sortedMapT;
            synchronized (this.f31068b) {
                sortedMapT = p1.t(c().subMap(obj, obj2), this.f31068b);
            }
            return sortedMapT;
        }

        public SortedMap<Object, Object> tailMap(Object obj) {
            SortedMap<Object, Object> sortedMapT;
            synchronized (this.f31068b) {
                sortedMapT = p1.t(c().tailMap(obj), this.f31068b);
            }
            return sortedMapT;
        }
    }

    static class t extends q implements SortedSet {
        t(SortedSet sortedSet, Object obj) {
            super(sortedSet, obj);
        }

        @Override // java.util.SortedSet
        public Comparator<Object> comparator() {
            Comparator<Object> comparator;
            synchronized (this.f31068b) {
                comparator = c().comparator();
            }
            return comparator;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.p1.q
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public SortedSet c() {
            return (SortedSet) super.c();
        }

        @Override // java.util.SortedSet
        public Object first() {
            Object objFirst;
            synchronized (this.f31068b) {
                objFirst = c().first();
            }
            return objFirst;
        }

        public SortedSet<Object> headSet(Object obj) {
            SortedSet<Object> sortedSetU;
            synchronized (this.f31068b) {
                sortedSetU = p1.u(c().headSet(obj), this.f31068b);
            }
            return sortedSetU;
        }

        @Override // java.util.SortedSet
        public Object last() {
            Object objLast;
            synchronized (this.f31068b) {
                objLast = c().last();
            }
            return objLast;
        }

        public SortedSet<Object> subSet(Object obj, Object obj2) {
            SortedSet<Object> sortedSetU;
            synchronized (this.f31068b) {
                sortedSetU = p1.u(c().subSet(obj, obj2), this.f31068b);
            }
            return sortedSetU;
        }

        public SortedSet<Object> tailSet(Object obj) {
            SortedSet<Object> sortedSetU;
            synchronized (this.f31068b) {
                sortedSetU = p1.u(c().tailSet(obj), this.f31068b);
            }
            return sortedSetU;
        }
    }

    private static class u extends r implements o1 {
        u(o1 o1Var, Object obj) {
            super(o1Var, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.p1.r
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public o1 b() {
            return (o1) super.b();
        }

        @Override // f3.p1.r, f3.p1.k, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
            return replaceValues(obj, (Iterable<Object>) iterable);
        }

        @Override // f3.o1
        public Comparator<Object> valueComparator() {
            Comparator<Object> comparatorValueComparator;
            synchronized (this.f31068b) {
                comparatorValueComparator = b().valueComparator();
            }
            return comparatorValueComparator;
        }

        @Override // f3.p1.r, f3.p1.k, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
            return replaceValues(obj, (Iterable<Object>) iterable);
        }

        @Override // f3.p1.r, f3.p1.k, f3.F0, f3.InterfaceC5439K
        public SortedSet<Object> get(Object obj) {
            SortedSet<Object> sortedSetU;
            synchronized (this.f31068b) {
                sortedSetU = p1.u(b().get(obj), this.f31068b);
            }
            return sortedSetU;
        }

        @Override // f3.p1.r, f3.p1.k, f3.F0, f3.InterfaceC5439K
        public SortedSet<Object> removeAll(Object obj) {
            SortedSet<Object> sortedSetRemoveAll;
            synchronized (this.f31068b) {
                sortedSetRemoveAll = b().removeAll(obj);
            }
            return sortedSetRemoveAll;
        }

        @Override // f3.p1.r, f3.p1.k, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public SortedSet<Object> replaceValues(Object obj, Iterable<Object> iterable) {
            SortedSet<Object> sortedSetReplaceValues;
            synchronized (this.f31068b) {
                sortedSetReplaceValues = b().replaceValues(obj, iterable);
            }
            return sortedSetReplaceValues;
        }
    }

    static InterfaceC5476n g(InterfaceC5476n interfaceC5476n, Object obj) {
        return ((interfaceC5476n instanceof e) || (interfaceC5476n instanceof AbstractC5455c0)) ? interfaceC5476n : new e(interfaceC5476n, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection h(Collection collection, Object obj) {
        return new f(collection, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List i(List list, Object obj) {
        return list instanceof RandomAccess ? new p(list, obj) : new h(list, obj);
    }

    static InterfaceC5501z0 j(InterfaceC5501z0 interfaceC5501z0, Object obj) {
        return ((interfaceC5501z0 instanceof i) || (interfaceC5501z0 instanceof AbstractC5474m)) ? interfaceC5501z0 : new i(interfaceC5501z0, obj);
    }

    static F0 k(F0 f02, Object obj) {
        return ((f02 instanceof k) || (f02 instanceof AbstractC5474m)) ? f02 : new k(f02, obj);
    }

    static K0 l(K0 k02, Object obj) {
        return ((k02 instanceof l) || (k02 instanceof AbstractC5479o0)) ? k02 : new l(k02, obj);
    }

    static NavigableMap m(NavigableMap navigableMap) {
        return n(navigableMap, null);
    }

    static NavigableMap n(NavigableMap navigableMap, Object obj) {
        return new m(navigableMap, obj);
    }

    static NavigableSet o(NavigableSet navigableSet) {
        return p(navigableSet, null);
    }

    static NavigableSet p(NavigableSet navigableSet, Object obj) {
        return new n(navigableSet, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map.Entry q(Map.Entry entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new g(entry, obj);
    }

    static Set r(Set set, Object obj) {
        return new q(set, obj);
    }

    static g1 s(g1 g1Var, Object obj) {
        return ((g1Var instanceof r) || (g1Var instanceof AbstractC5474m)) ? g1Var : new r(g1Var, obj);
    }

    static SortedMap t(SortedMap sortedMap, Object obj) {
        return new s(sortedMap, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SortedSet u(SortedSet sortedSet, Object obj) {
        return new t(sortedSet, obj);
    }

    static o1 v(o1 o1Var, Object obj) {
        return o1Var instanceof u ? o1Var : new u(o1Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection w(Collection collection, Object obj) {
        return collection instanceof SortedSet ? u((SortedSet) collection, obj) : collection instanceof Set ? r((Set) collection, obj) : collection instanceof List ? i((List) collection, obj) : h(collection, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set x(Set set, Object obj) {
        return set instanceof SortedSet ? u((SortedSet) set, obj) : r(set, obj);
    }

    private static class c extends q {

        class a extends r1 {

            /* renamed from: f3.p1$c$a$a, reason: collision with other inner class name */
            class C0299a extends AbstractC5447T {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Map.Entry f31048a;

                C0299a(Map.Entry entry) {
                    this.f31048a = entry;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // f3.X
                /* renamed from: a */
                public Map.Entry delegate() {
                    return this.f31048a;
                }

                @Override // f3.AbstractC5447T, java.util.Map.Entry
                public Collection<Object> getValue() {
                    return p1.w((Collection) this.f31048a.getValue(), c.this.f31068b);
                }
            }

            a(Iterator it) {
                super(it);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // f3.r1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry a(Map.Entry entry) {
                return new C0299a(entry);
            }
        }

        c(Set set, Object obj) {
            super(set, obj);
        }

        @Override // f3.p1.f, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            boolean zL;
            synchronized (this.f31068b) {
                zL = E0.l(c(), obj);
            }
            return zL;
        }

        @Override // f3.p1.f, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            boolean zB;
            synchronized (this.f31068b) {
                zB = AbstractC5486s.b(c(), collection);
            }
            return zB;
        }

        @Override // f3.p1.q, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            boolean zA;
            if (obj == this) {
                return true;
            }
            synchronized (this.f31068b) {
                zA = h1.a(c(), obj);
            }
            return zA;
        }

        @Override // f3.p1.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Object, Collection<Object>>> iterator() {
            return new a(super.iterator());
        }

        @Override // f3.p1.f, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean zY;
            synchronized (this.f31068b) {
                zY = E0.y(c(), obj);
            }
            return zY;
        }

        @Override // f3.p1.f, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            boolean zRemoveAll;
            synchronized (this.f31068b) {
                zRemoveAll = AbstractC5495w0.removeAll(c().iterator(), collection);
            }
            return zRemoveAll;
        }

        @Override // f3.p1.f, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            boolean zRetainAll;
            synchronized (this.f31068b) {
                zRetainAll = AbstractC5495w0.retainAll(c().iterator(), collection);
            }
            return zRetainAll;
        }

        @Override // f3.p1.f, java.util.Collection, java.util.Set
        public Object[] toArray() {
            Object[] objArrE;
            synchronized (this.f31068b) {
                objArrE = Q0.e(c());
            }
            return objArrE;
        }

        @Override // f3.p1.f, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f31068b) {
                tArr2 = (T[]) Q0.f(c(), tArr);
            }
            return tArr2;
        }
    }

    private static class k extends o implements F0 {

        /* renamed from: c, reason: collision with root package name */
        transient Set f31056c;

        /* renamed from: d, reason: collision with root package name */
        transient Collection f31057d;

        /* renamed from: e, reason: collision with root package name */
        transient Collection f31058e;

        /* renamed from: f, reason: collision with root package name */
        transient Map f31059f;

        /* renamed from: g, reason: collision with root package name */
        transient K0 f31060g;

        k(F0 f02, Object obj) {
            super(f02, obj);
        }

        @Override // f3.F0, f3.InterfaceC5501z0
        public Map<Object, Collection<Object>> asMap() {
            Map<Object, Collection<Object>> map;
            synchronized (this.f31068b) {
                try {
                    if (this.f31059f == null) {
                        this.f31059f = new b(b().asMap(), this.f31068b);
                    }
                    map = this.f31059f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return map;
        }

        F0 b() {
            return (F0) super.a();
        }

        @Override // f3.F0, f3.InterfaceC5439K
        public void clear() {
            synchronized (this.f31068b) {
                b().clear();
            }
        }

        @Override // f3.F0, f3.g1
        public boolean containsEntry(Object obj, Object obj2) {
            boolean zContainsEntry;
            synchronized (this.f31068b) {
                zContainsEntry = b().containsEntry(obj, obj2);
            }
            return zContainsEntry;
        }

        @Override // f3.F0, f3.InterfaceC5439K
        public boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.f31068b) {
                zContainsKey = b().containsKey(obj);
            }
            return zContainsKey;
        }

        @Override // f3.F0, f3.g1
        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.f31068b) {
                zContainsValue = b().containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
        public Collection<Map.Entry<Object, Object>> entries() {
            Collection<Map.Entry<Object, Object>> collection;
            synchronized (this.f31068b) {
                try {
                    if (this.f31058e == null) {
                        this.f31058e = p1.w(b().entries(), this.f31068b);
                    }
                    collection = this.f31058e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        @Override // f3.F0
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f31068b) {
                zEquals = b().equals(obj);
            }
            return zEquals;
        }

        public Collection<Object> get(Object obj) {
            Collection<Object> collectionW;
            synchronized (this.f31068b) {
                collectionW = p1.w(b().get(obj), this.f31068b);
            }
            return collectionW;
        }

        @Override // f3.F0
        public int hashCode() {
            int iHashCode;
            synchronized (this.f31068b) {
                iHashCode = b().hashCode();
            }
            return iHashCode;
        }

        @Override // f3.F0
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f31068b) {
                zIsEmpty = b().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // f3.F0
        public Set<Object> keySet() {
            Set<Object> set;
            synchronized (this.f31068b) {
                try {
                    if (this.f31056c == null) {
                        this.f31056c = p1.x(b().keySet(), this.f31068b);
                    }
                    set = this.f31056c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // f3.F0
        public K0 keys() {
            K0 k02;
            synchronized (this.f31068b) {
                try {
                    if (this.f31060g == null) {
                        this.f31060g = p1.l(b().keys(), this.f31068b);
                    }
                    k02 = this.f31060g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return k02;
        }

        @Override // f3.F0, f3.g1
        public boolean put(Object obj, Object obj2) {
            boolean zPut;
            synchronized (this.f31068b) {
                zPut = b().put(obj, obj2);
            }
            return zPut;
        }

        @Override // f3.F0, f3.g1
        public boolean putAll(Object obj, Iterable<Object> iterable) {
            boolean zPutAll;
            synchronized (this.f31068b) {
                zPutAll = b().putAll(obj, iterable);
            }
            return zPutAll;
        }

        @Override // f3.F0, f3.g1
        public boolean remove(Object obj, Object obj2) {
            boolean zRemove;
            synchronized (this.f31068b) {
                zRemove = b().remove(obj, obj2);
            }
            return zRemove;
        }

        public Collection<Object> removeAll(Object obj) {
            Collection<Object> collectionRemoveAll;
            synchronized (this.f31068b) {
                collectionRemoveAll = b().removeAll(obj);
            }
            return collectionRemoveAll;
        }

        public Collection<Object> replaceValues(Object obj, Iterable<Object> iterable) {
            Collection<Object> collectionReplaceValues;
            synchronized (this.f31068b) {
                collectionReplaceValues = b().replaceValues(obj, iterable);
            }
            return collectionReplaceValues;
        }

        @Override // f3.F0, f3.InterfaceC5439K
        public int size() {
            int size;
            synchronized (this.f31068b) {
                size = b().size();
            }
            return size;
        }

        @Override // f3.F0
        public Collection<Object> values() {
            Collection<Object> collection;
            synchronized (this.f31068b) {
                try {
                    if (this.f31057d == null) {
                        this.f31057d = p1.h(b().values(), this.f31068b);
                    }
                    collection = this.f31057d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        @Override // f3.F0, f3.g1
        public boolean putAll(F0 f02) {
            boolean zPutAll;
            synchronized (this.f31068b) {
                zPutAll = b().putAll(f02);
            }
            return zPutAll;
        }
    }

    private static class l extends f implements K0 {

        /* renamed from: c, reason: collision with root package name */
        transient Set f31061c;

        /* renamed from: d, reason: collision with root package name */
        transient Set f31062d;

        l(K0 k02, Object obj) {
            super(k02, obj);
        }

        @Override // f3.K0
        public int add(Object obj, int i8) {
            int iAdd;
            synchronized (this.f31068b) {
                iAdd = b().add(obj, i8);
            }
            return iAdd;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.p1.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public K0 c() {
            return (K0) super.c();
        }

        @Override // f3.K0
        public int count(Object obj) {
            int iCount;
            synchronized (this.f31068b) {
                iCount = b().count(obj);
            }
            return iCount;
        }

        @Override // f3.K0
        public Set<Object> elementSet() {
            Set<Object> set;
            synchronized (this.f31068b) {
                try {
                    if (this.f31061c == null) {
                        this.f31061c = p1.x(b().elementSet(), this.f31068b);
                    }
                    set = this.f31061c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // f3.K0
        public Set<K0.a> entrySet() {
            Set<K0.a> set;
            synchronized (this.f31068b) {
                try {
                    if (this.f31062d == null) {
                        this.f31062d = p1.x(b().entrySet(), this.f31068b);
                    }
                    set = this.f31062d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Collection, f3.K0
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f31068b) {
                zEquals = b().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Collection, f3.K0
        public int hashCode() {
            int iHashCode;
            synchronized (this.f31068b) {
                iHashCode = b().hashCode();
            }
            return iHashCode;
        }

        @Override // f3.K0
        public int remove(Object obj, int i8) {
            int iRemove;
            synchronized (this.f31068b) {
                iRemove = b().remove(obj, i8);
            }
            return iRemove;
        }

        @Override // f3.K0
        public int setCount(Object obj, int i8) {
            int count;
            synchronized (this.f31068b) {
                count = b().setCount(obj, i8);
            }
            return count;
        }

        @Override // f3.K0
        public boolean setCount(Object obj, int i8, int i9) {
            boolean count;
            synchronized (this.f31068b) {
                count = b().setCount(obj, i8, i9);
            }
            return count;
        }
    }

    static class m extends s implements NavigableMap {

        /* renamed from: f, reason: collision with root package name */
        transient NavigableSet f31063f;

        /* renamed from: g, reason: collision with root package name */
        transient NavigableMap f31064g;

        /* renamed from: h, reason: collision with root package name */
        transient NavigableSet f31065h;

        m(NavigableMap navigableMap, Object obj) {
            super(navigableMap, obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> ceilingEntry(Object obj) {
            Map.Entry<Object, Object> entryQ;
            synchronized (this.f31068b) {
                entryQ = p1.q(b().ceilingEntry(obj), this.f31068b);
            }
            return entryQ;
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            Object objCeilingKey;
            synchronized (this.f31068b) {
                objCeilingKey = b().ceilingKey(obj);
            }
            return objCeilingKey;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.p1.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap c() {
            return (NavigableMap) super.c();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<Object> descendingKeySet() {
            synchronized (this.f31068b) {
                try {
                    NavigableSet<Object> navigableSet = this.f31063f;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<Object> navigableSetP = p1.p(b().descendingKeySet(), this.f31068b);
                    this.f31063f = navigableSetP;
                    return navigableSetP;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> descendingMap() {
            synchronized (this.f31068b) {
                try {
                    NavigableMap<Object, Object> navigableMap = this.f31064g;
                    if (navigableMap != null) {
                        return navigableMap;
                    }
                    NavigableMap<Object, Object> navigableMapN = p1.n(b().descendingMap(), this.f31068b);
                    this.f31064g = navigableMapN;
                    return navigableMapN;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> firstEntry() {
            Map.Entry<Object, Object> entryQ;
            synchronized (this.f31068b) {
                entryQ = p1.q(b().firstEntry(), this.f31068b);
            }
            return entryQ;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> floorEntry(Object obj) {
            Map.Entry<Object, Object> entryQ;
            synchronized (this.f31068b) {
                entryQ = p1.q(b().floorEntry(obj), this.f31068b);
            }
            return entryQ;
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            Object objFloorKey;
            synchronized (this.f31068b) {
                objFloorKey = b().floorKey(obj);
            }
            return objFloorKey;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> headMap(Object obj, boolean z8) {
            NavigableMap<Object, Object> navigableMapN;
            synchronized (this.f31068b) {
                navigableMapN = p1.n(b().headMap(obj, z8), this.f31068b);
            }
            return navigableMapN;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> higherEntry(Object obj) {
            Map.Entry<Object, Object> entryQ;
            synchronized (this.f31068b) {
                entryQ = p1.q(b().higherEntry(obj), this.f31068b);
            }
            return entryQ;
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            Object objHigherKey;
            synchronized (this.f31068b) {
                objHigherKey = b().higherKey(obj);
            }
            return objHigherKey;
        }

        @Override // f3.p1.j, java.util.Map
        public Set<Object> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> lastEntry() {
            Map.Entry<Object, Object> entryQ;
            synchronized (this.f31068b) {
                entryQ = p1.q(b().lastEntry(), this.f31068b);
            }
            return entryQ;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> lowerEntry(Object obj) {
            Map.Entry<Object, Object> entryQ;
            synchronized (this.f31068b) {
                entryQ = p1.q(b().lowerEntry(obj), this.f31068b);
            }
            return entryQ;
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            Object objLowerKey;
            synchronized (this.f31068b) {
                objLowerKey = b().lowerKey(obj);
            }
            return objLowerKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<Object> navigableKeySet() {
            synchronized (this.f31068b) {
                try {
                    NavigableSet<Object> navigableSet = this.f31065h;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<Object> navigableSetP = p1.p(b().navigableKeySet(), this.f31068b);
                    this.f31065h = navigableSetP;
                    return navigableSetP;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> pollFirstEntry() {
            Map.Entry<Object, Object> entryQ;
            synchronized (this.f31068b) {
                entryQ = p1.q(b().pollFirstEntry(), this.f31068b);
            }
            return entryQ;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> pollLastEntry() {
            Map.Entry<Object, Object> entryQ;
            synchronized (this.f31068b) {
                entryQ = p1.q(b().pollLastEntry(), this.f31068b);
            }
            return entryQ;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> subMap(Object obj, boolean z8, Object obj2, boolean z9) {
            NavigableMap<Object, Object> navigableMapN;
            synchronized (this.f31068b) {
                navigableMapN = p1.n(b().subMap(obj, z8, obj2, z9), this.f31068b);
            }
            return navigableMapN;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> tailMap(Object obj, boolean z8) {
            NavigableMap<Object, Object> navigableMapN;
            synchronized (this.f31068b) {
                navigableMapN = p1.n(b().tailMap(obj, z8), this.f31068b);
            }
            return navigableMapN;
        }

        @Override // f3.p1.s, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<Object, Object> headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // f3.p1.s, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // f3.p1.s, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<Object, Object> tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    static class n extends t implements NavigableSet {

        /* renamed from: c, reason: collision with root package name */
        transient NavigableSet f31066c;

        n(NavigableSet navigableSet, Object obj) {
            super(navigableSet, obj);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            Object objCeiling;
            synchronized (this.f31068b) {
                objCeiling = b().ceiling(obj);
            }
            return objCeiling;
        }

        @Override // java.util.NavigableSet
        public Iterator<Object> descendingIterator() {
            return b().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> descendingSet() {
            synchronized (this.f31068b) {
                try {
                    NavigableSet<Object> navigableSet = this.f31066c;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<Object> navigableSetP = p1.p(b().descendingSet(), this.f31068b);
                    this.f31066c = navigableSetP;
                    return navigableSetP;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.p1.t
        /* renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet c() {
            return (NavigableSet) super.c();
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            Object objFloor;
            synchronized (this.f31068b) {
                objFloor = b().floor(obj);
            }
            return objFloor;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> headSet(Object obj, boolean z8) {
            NavigableSet<Object> navigableSetP;
            synchronized (this.f31068b) {
                navigableSetP = p1.p(b().headSet(obj, z8), this.f31068b);
            }
            return navigableSetP;
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            Object objHigher;
            synchronized (this.f31068b) {
                objHigher = b().higher(obj);
            }
            return objHigher;
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            Object objLower;
            synchronized (this.f31068b) {
                objLower = b().lower(obj);
            }
            return objLower;
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            Object objPollFirst;
            synchronized (this.f31068b) {
                objPollFirst = b().pollFirst();
            }
            return objPollFirst;
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            Object objPollLast;
            synchronized (this.f31068b) {
                objPollLast = b().pollLast();
            }
            return objPollLast;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> subSet(Object obj, boolean z8, Object obj2, boolean z9) {
            NavigableSet<Object> navigableSetP;
            synchronized (this.f31068b) {
                navigableSetP = p1.p(b().subSet(obj, z8, obj2, z9), this.f31068b);
            }
            return navigableSetP;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> tailSet(Object obj, boolean z8) {
            NavigableSet<Object> navigableSetP;
            synchronized (this.f31068b) {
                navigableSetP = p1.p(b().tailSet(obj, z8), this.f31068b);
            }
            return navigableSetP;
        }

        @Override // f3.p1.t, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<Object> headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // f3.p1.t, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<Object> tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // f3.p1.t, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<Object> subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }
    }
}
