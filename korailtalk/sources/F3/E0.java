package f3;

import e3.AbstractC5367i;
import f3.AbstractC5469j0;
import f3.B0;
import f3.h1;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public abstract class E0 {

    static abstract class A extends AbstractMap {

        class a extends s {
            a() {
            }

            @Override // f3.E0.s
            Map a() {
                return A.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<Object, Object>> iterator() {
                return A.this.a();
            }
        }

        A() {
        }

        abstract Iterator a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            AbstractC5495w0.c(a());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<Object, Object>> entrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    static class B extends h1.j {

        /* renamed from: a */
        final Map f30685a;

        B(Map map) {
            this.f30685a = (Map) e3.w.checkNotNull(map);
        }

        /* renamed from: a */
        Map b() {
            return this.f30685a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return b().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return b().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Object> iterator() {
            return E0.u(b().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            b().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b().size();
        }
    }

    static class C implements B0 {

        /* renamed from: a */
        final Map f30686a;

        /* renamed from: b */
        final Map f30687b;

        /* renamed from: c */
        final Map f30688c;

        /* renamed from: d */
        final Map f30689d;

        C(Map map, Map map2, Map map3, Map map4) {
            this.f30686a = E0.L(map);
            this.f30687b = E0.L(map2);
            this.f30688c = E0.L(map3);
            this.f30689d = E0.L(map4);
        }

        @Override // f3.B0
        public boolean areEqual() {
            return this.f30686a.isEmpty() && this.f30687b.isEmpty() && this.f30689d.isEmpty();
        }

        @Override // f3.B0
        public Map<Object, B0.a> entriesDiffering() {
            return this.f30689d;
        }

        @Override // f3.B0
        public Map<Object, Object> entriesInCommon() {
            return this.f30688c;
        }

        @Override // f3.B0
        public Map<Object, Object> entriesOnlyOnLeft() {
            return this.f30686a;
        }

        @Override // f3.B0
        public Map<Object, Object> entriesOnlyOnRight() {
            return this.f30687b;
        }

        @Override // f3.B0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof B0)) {
                return false;
            }
            B0 b02 = (B0) obj;
            return entriesOnlyOnLeft().equals(b02.entriesOnlyOnLeft()) && entriesOnlyOnRight().equals(b02.entriesOnlyOnRight()) && entriesInCommon().equals(b02.entriesInCommon()) && entriesDiffering().equals(b02.entriesDiffering());
        }

        @Override // f3.B0
        public int hashCode() {
            return e3.r.hashCode(entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering());
        }

        public String toString() {
            if (areEqual()) {
                return "equal";
            }
            StringBuilder sb = new StringBuilder("not equal");
            if (!this.f30686a.isEmpty()) {
                sb.append(": only on left=");
                sb.append(this.f30686a);
            }
            if (!this.f30687b.isEmpty()) {
                sb.append(": only on right=");
                sb.append(this.f30687b);
            }
            if (!this.f30689d.isEmpty()) {
                sb.append(": value differences=");
                sb.append(this.f30689d);
            }
            return sb.toString();
        }
    }

    private static final class D extends AbstractC5466i {

        /* renamed from: a */
        private final NavigableSet f30690a;

        /* renamed from: b */
        private final e3.l f30691b;

        D(NavigableSet navigableSet, e3.l lVar) {
            this.f30690a = (NavigableSet) e3.w.checkNotNull(navigableSet);
            this.f30691b = (e3.l) e3.w.checkNotNull(lVar);
        }

        @Override // f3.E0.A
        Iterator a() {
            return E0.i(this.f30690a, this.f30691b);
        }

        @Override // f3.AbstractC5466i
        Iterator b() {
            return descendingMap().entrySet().iterator();
        }

        @Override // f3.E0.A, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f30690a.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<Object> comparator() {
            return this.f30690a.comparator();
        }

        @Override // f3.AbstractC5466i, java.util.NavigableMap
        public NavigableMap<Object, Object> descendingMap() {
            return E0.asMap(this.f30690a.descendingSet(), this.f30691b);
        }

        @Override // f3.AbstractC5466i, java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            if (AbstractC5486s.f(this.f30690a, obj)) {
                return this.f30691b.apply(obj);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> headMap(Object obj, boolean z8) {
            return E0.asMap(this.f30690a.headSet(obj, z8), this.f30691b);
        }

        @Override // f3.AbstractC5466i, java.util.NavigableMap
        public NavigableSet<Object> navigableKeySet() {
            return E0.z(this.f30690a);
        }

        @Override // f3.E0.A, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f30690a.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> subMap(Object obj, boolean z8, Object obj2, boolean z9) {
            return E0.asMap(this.f30690a.subSet(obj, z8, obj2, z9), this.f30691b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> tailMap(Object obj, boolean z8) {
            return E0.asMap(this.f30690a.tailSet(obj, z8), this.f30691b);
        }
    }

    static class E extends G implements NavigableSet {
        E(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // f3.E0.G
        /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap b() {
            return (NavigableMap) this.f30685a;
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return a().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator<Object> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> descendingSet() {
            return a().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return a().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> headSet(Object obj, boolean z8) {
            return a().headMap(obj, z8).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return a().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return a().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return E0.v(a().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return E0.v(a().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> subSet(Object obj, boolean z8, Object obj2, boolean z9) {
            return a().subMap(obj, z8, obj2, z9).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> tailSet(Object obj, boolean z8) {
            return a().tailMap(obj, z8).navigableKeySet();
        }

        @Override // f3.E0.G, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<Object> headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // f3.E0.G, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<Object> subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // f3.E0.G, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<Object> tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }

    private static class F extends C5430o implements SortedMap {
        F(SortedSet sortedSet, e3.l lVar) {
            super(sortedSet, lVar);
        }

        @Override // java.util.SortedMap
        public Comparator<Object> comparator() {
            return c().comparator();
        }

        @Override // f3.E0.C5430o
        /* renamed from: d */
        public SortedSet c() {
            return (SortedSet) super.c();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return c().first();
        }

        @Override // java.util.SortedMap
        public SortedMap<Object, Object> headMap(Object obj) {
            return E0.asMap(c().headSet(obj), this.f30723e);
        }

        @Override // f3.E0.R, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Object> keySet() {
            return E0.B(c());
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return c().last();
        }

        @Override // java.util.SortedMap
        public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
            return E0.asMap(c().subSet(obj, obj2), this.f30723e);
        }

        @Override // java.util.SortedMap
        public SortedMap<Object, Object> tailMap(Object obj) {
            return E0.asMap(c().tailSet(obj), this.f30723e);
        }
    }

    static class G extends B implements SortedSet {
        G(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // f3.E0.B
        public SortedMap b() {
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
            return new G(b().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return b().lastKey();
        }

        public SortedSet<Object> subSet(Object obj, Object obj2) {
            return new G(b().subMap(obj, obj2));
        }

        public SortedSet<Object> tailSet(Object obj) {
            return new G(b().tailMap(obj));
        }
    }

    static class H extends C implements l1 {
        H(SortedMap sortedMap, SortedMap sortedMap2, SortedMap sortedMap3, SortedMap sortedMap4) {
            super(sortedMap, sortedMap2, sortedMap3, sortedMap4);
        }

        @Override // f3.E0.C, f3.B0
        public SortedMap<Object, B0.a> entriesDiffering() {
            return (SortedMap) super.entriesDiffering();
        }

        @Override // f3.E0.C, f3.B0
        public SortedMap<Object, Object> entriesInCommon() {
            return (SortedMap) super.entriesInCommon();
        }

        @Override // f3.E0.C, f3.B0
        public SortedMap<Object, Object> entriesOnlyOnLeft() {
            return (SortedMap) super.entriesOnlyOnLeft();
        }

        @Override // f3.E0.C, f3.B0
        public SortedMap<Object, Object> entriesOnlyOnRight() {
            return (SortedMap) super.entriesOnlyOnRight();
        }
    }

    static class I extends A {

        /* renamed from: a */
        final Map f30692a;

        /* renamed from: b */
        final t f30693b;

        I(Map map, t tVar) {
            this.f30692a = (Map) e3.w.checkNotNull(map);
            this.f30693b = (t) e3.w.checkNotNull(tVar);
        }

        @Override // f3.E0.A
        Iterator a() {
            return AbstractC5495w0.transform(this.f30692a.entrySet().iterator(), E0.f(this.f30693b));
        }

        @Override // f3.E0.A, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f30692a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f30692a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            Object obj2 = this.f30692a.get(obj);
            if (obj2 != null || this.f30692a.containsKey(obj)) {
                return this.f30693b.transformEntry(obj, N0.a(obj2));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Object> keySet() {
            return this.f30692a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            if (this.f30692a.containsKey(obj)) {
                return this.f30693b.transformEntry(obj, N0.a(this.f30692a.remove(obj)));
            }
            return null;
        }

        @Override // f3.E0.A, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f30692a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<Object> values() {
            return new Q(this);
        }
    }

    private static class J extends K implements NavigableMap {
        J(NavigableMap navigableMap, t tVar) {
            super(navigableMap, tVar);
        }

        private Map.Entry d(Map.Entry entry) {
            if (entry == null) {
                return null;
            }
            return E0.G(this.f30693b, entry);
        }

        @Override // f3.E0.K
        /* renamed from: c */
        public NavigableMap b() {
            return (NavigableMap) super.b();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> ceilingEntry(Object obj) {
            return d(b().ceilingEntry(obj));
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return b().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<Object> descendingKeySet() {
            return b().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> descendingMap() {
            return E0.transformEntries(b().descendingMap(), this.f30693b);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> firstEntry() {
            return d(b().firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> floorEntry(Object obj) {
            return d(b().floorEntry(obj));
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return b().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> higherEntry(Object obj) {
            return d(b().higherEntry(obj));
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return b().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> lastEntry() {
            return d(b().lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> lowerEntry(Object obj) {
            return d(b().lowerEntry(obj));
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return b().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<Object> navigableKeySet() {
            return b().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> pollFirstEntry() {
            return d(b().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> pollLastEntry() {
            return d(b().pollLastEntry());
        }

        @Override // f3.E0.K, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<Object, Object> headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> subMap(Object obj, boolean z8, Object obj2, boolean z9) {
            return E0.transformEntries(b().subMap(obj, z8, obj2, z9), this.f30693b);
        }

        @Override // f3.E0.K, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<Object, Object> tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> headMap(Object obj, boolean z8) {
            return E0.transformEntries(b().headMap(obj, z8), this.f30693b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> tailMap(Object obj, boolean z8) {
            return E0.transformEntries(b().tailMap(obj, z8), this.f30693b);
        }

        @Override // f3.E0.K, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<Object, Object> subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }
    }

    static class K extends I implements SortedMap {
        K(SortedMap sortedMap, t tVar) {
            super(sortedMap, tVar);
        }

        protected SortedMap b() {
            return (SortedMap) this.f30692a;
        }

        @Override // java.util.SortedMap
        public Comparator<Object> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return b().firstKey();
        }

        public SortedMap<Object, Object> headMap(Object obj) {
            return E0.transformEntries(b().headMap(obj), this.f30693b);
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return b().lastKey();
        }

        public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
            return E0.transformEntries(b().subMap(obj, obj2), this.f30693b);
        }

        public SortedMap<Object, Object> tailMap(Object obj) {
            return E0.transformEntries(b().tailMap(obj), this.f30693b);
        }
    }

    private static class L extends AbstractC5446S implements InterfaceC5476n, Serializable {

        /* renamed from: a */
        final Map f30694a;

        /* renamed from: b */
        final InterfaceC5476n f30695b;

        /* renamed from: c */
        InterfaceC5476n f30696c;

        /* renamed from: d */
        transient Set f30697d;

        L(InterfaceC5476n interfaceC5476n, InterfaceC5476n interfaceC5476n2) {
            this.f30694a = Collections.unmodifiableMap(interfaceC5476n);
            this.f30695b = interfaceC5476n;
            this.f30696c = interfaceC5476n2;
        }

        @Override // f3.X
        /* renamed from: a */
        public Map delegate() {
            return this.f30694a;
        }

        @Override // f3.InterfaceC5476n
        public Object forcePut(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.InterfaceC5476n
        public InterfaceC5476n inverse() {
            InterfaceC5476n interfaceC5476n = this.f30696c;
            if (interfaceC5476n != null) {
                return interfaceC5476n;
            }
            L l8 = new L(this.f30695b.inverse(), this);
            this.f30696c = l8;
            return l8;
        }

        @Override // f3.AbstractC5446S, java.util.Map, f3.InterfaceC5476n
        public Set<Object> values() {
            Set<Object> set = this.f30697d;
            if (set != null) {
                return set;
            }
            Set<Object> setUnmodifiableSet = Collections.unmodifiableSet(this.f30695b.values());
            this.f30697d = setUnmodifiableSet;
            return setUnmodifiableSet;
        }
    }

    static class M extends AbstractC5444P {

        /* renamed from: a */
        private final Collection f30698a;

        M(Collection collection) {
            this.f30698a = collection;
        }

        @Override // f3.X
        /* renamed from: a */
        public Collection delegate() {
            return this.f30698a;
        }

        @Override // f3.AbstractC5444P, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<Object, Object>> iterator() {
            return E0.J(this.f30698a.iterator());
        }

        @Override // f3.AbstractC5444P, java.util.Collection
        public Object[] toArray() {
            return b();
        }

        @Override // f3.AbstractC5444P, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) c(tArr);
        }
    }

    static class N extends M implements Set {
        N(Set set) {
            super(set);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return h1.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return h1.b(this);
        }
    }

    static class O extends Z implements NavigableMap, Serializable {

        /* renamed from: a */
        private final NavigableMap f30699a;

        /* renamed from: b */
        private transient O f30700b;

        O(NavigableMap navigableMap) {
            this.f30699a = navigableMap;
        }

        @Override // f3.X
        /* renamed from: c */
        public SortedMap delegate() {
            return Collections.unmodifiableSortedMap(this.f30699a);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> ceilingEntry(Object obj) {
            return E0.M(this.f30699a.ceilingEntry(obj));
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return this.f30699a.ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<Object> descendingKeySet() {
            return h1.unmodifiableNavigableSet(this.f30699a.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> descendingMap() {
            O o8 = this.f30700b;
            if (o8 != null) {
                return o8;
            }
            O o9 = new O(this.f30699a.descendingMap(), this);
            this.f30700b = o9;
            return o9;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> firstEntry() {
            return E0.M(this.f30699a.firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> floorEntry(Object obj) {
            return E0.M(this.f30699a.floorEntry(obj));
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return this.f30699a.floorKey(obj);
        }

        @Override // f3.Z, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<Object, Object> headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> higherEntry(Object obj) {
            return E0.M(this.f30699a.higherEntry(obj));
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return this.f30699a.higherKey(obj);
        }

        @Override // f3.AbstractC5446S, java.util.Map, java.util.SortedMap
        public Set<Object> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> lastEntry() {
            return E0.M(this.f30699a.lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> lowerEntry(Object obj) {
            return E0.M(this.f30699a.lowerEntry(obj));
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return this.f30699a.lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<Object> navigableKeySet() {
            return h1.unmodifiableNavigableSet(this.f30699a.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<Object, Object> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<Object, Object> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // f3.Z, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // f3.Z, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<Object, Object> tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> headMap(Object obj, boolean z8) {
            return E0.unmodifiableNavigableMap(this.f30699a.headMap(obj, z8));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> subMap(Object obj, boolean z8, Object obj2, boolean z9) {
            return E0.unmodifiableNavigableMap(this.f30699a.subMap(obj, z8, obj2, z9));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> tailMap(Object obj, boolean z8) {
            return E0.unmodifiableNavigableMap(this.f30699a.tailMap(obj, z8));
        }

        O(NavigableMap navigableMap, O o8) {
            this.f30699a = navigableMap;
            this.f30700b = o8;
        }
    }

    static class P implements B0.a {

        /* renamed from: a */
        private final Object f30701a;

        /* renamed from: b */
        private final Object f30702b;

        private P(Object obj, Object obj2) {
            this.f30701a = obj;
            this.f30702b = obj2;
        }

        static B0.a a(Object obj, Object obj2) {
            return new P(obj, obj2);
        }

        @Override // f3.B0.a
        public boolean equals(Object obj) {
            if (!(obj instanceof B0.a)) {
                return false;
            }
            B0.a aVar = (B0.a) obj;
            return e3.r.equal(this.f30701a, aVar.leftValue()) && e3.r.equal(this.f30702b, aVar.rightValue());
        }

        @Override // f3.B0.a
        public int hashCode() {
            return e3.r.hashCode(this.f30701a, this.f30702b);
        }

        @Override // f3.B0.a
        public Object leftValue() {
            return this.f30701a;
        }

        @Override // f3.B0.a
        public Object rightValue() {
            return this.f30702b;
        }

        public String toString() {
            return "(" + this.f30701a + ", " + this.f30702b + ")";
        }
    }

    static class Q extends AbstractCollection {

        /* renamed from: a */
        final Map f30703a;

        Q(Map map) {
            this.f30703a = (Map) e3.w.checkNotNull(map);
        }

        final Map a() {
            return this.f30703a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return E0.O(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : a().entrySet()) {
                    if (e3.r.equal(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) e3.w.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSet = h1.newHashSet();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetNewHashSet.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(hashSetNewHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) e3.w.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSet = h1.newHashSet();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetNewHashSet.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(hashSetNewHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    static abstract class R extends AbstractMap {

        /* renamed from: a */
        private transient Set f30704a;

        /* renamed from: b */
        private transient Set f30705b;

        /* renamed from: c */
        private transient Collection f30706c;

        R() {
        }

        abstract Set a();

        Collection b() {
            return new Q(this);
        }

        /* renamed from: createKeySet */
        Set d() {
            return new B(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<Object, Object>> entrySet() {
            Set<Map.Entry<Object, Object>> set = this.f30704a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<Object, Object>> setA = a();
            this.f30704a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Object> keySet() {
            Set<Object> set = this.f30705b;
            if (set != null) {
                return set;
            }
            Set<Object> setD = d();
            this.f30705b = setD;
            return setD;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<Object> values() {
            Collection<Object> collection = this.f30706c;
            if (collection != null) {
                return collection;
            }
            Collection<Object> collectionB = b();
            this.f30706c = collectionB;
            return collectionB;
        }
    }

    /* renamed from: f3.E0$a */
    class C5416a implements e3.l {

        /* renamed from: a */
        final /* synthetic */ t f30707a;

        /* renamed from: b */
        final /* synthetic */ Object f30708b;

        C5416a(t tVar, Object obj) {
            this.f30707a = tVar;
            this.f30708b = obj;
        }

        @Override // e3.l
        public Object apply(Object obj) {
            return this.f30707a.transformEntry(this.f30708b, obj);
        }
    }

    /* renamed from: f3.E0$b */
    class C5417b implements e3.l {

        /* renamed from: a */
        final /* synthetic */ t f30709a;

        C5417b(t tVar) {
            this.f30709a = tVar;
        }

        @Override // e3.l
        public Object apply(Map.Entry<Object, Object> entry) {
            return this.f30709a.transformEntry(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: f3.E0$c */
    class C5418c extends AbstractC5460f {

        /* renamed from: a */
        final /* synthetic */ Map.Entry f30710a;

        /* renamed from: b */
        final /* synthetic */ t f30711b;

        C5418c(Map.Entry entry, t tVar) {
            this.f30710a = entry;
            this.f30711b = tVar;
        }

        @Override // f3.AbstractC5460f, java.util.Map.Entry
        public Object getKey() {
            return this.f30710a.getKey();
        }

        @Override // f3.AbstractC5460f, java.util.Map.Entry
        public Object getValue() {
            return this.f30711b.transformEntry(this.f30710a.getKey(), this.f30710a.getValue());
        }
    }

    /* renamed from: f3.E0$d */
    class C5419d implements e3.l {

        /* renamed from: a */
        final /* synthetic */ t f30712a;

        C5419d(t tVar) {
            this.f30712a = tVar;
        }

        @Override // e3.l
        public Map.Entry<Object, Object> apply(Map.Entry<Object, Object> entry) {
            return E0.G(this.f30712a, entry);
        }
    }

    /* renamed from: f3.E0$e */
    class C5420e extends r1 {
        C5420e(Iterator it) {
            super(it);
        }

        @Override // f3.r1
        /* renamed from: b */
        public Object a(Map.Entry entry) {
            return entry.getKey();
        }
    }

    /* renamed from: f3.E0$f */
    class C5421f extends r1 {
        C5421f(Iterator it) {
            super(it);
        }

        @Override // f3.r1
        /* renamed from: b */
        public Object a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* renamed from: f3.E0$g */
    class C5422g extends r1 {

        /* renamed from: b */
        final /* synthetic */ e3.l f30713b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5422g(Iterator it, e3.l lVar) {
            super(it);
            this.f30713b = lVar;
        }

        @Override // f3.r1
        /* renamed from: b */
        public Map.Entry a(Object obj) {
            return E0.immutableEntry(obj, this.f30713b.apply(obj));
        }
    }

    /* renamed from: f3.E0$h */
    class C5423h extends Y {

        /* renamed from: a */
        final /* synthetic */ Set f30714a;

        C5423h(Set set) {
            this.f30714a = set;
        }

        @Override // f3.AbstractC5444P, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5444P, java.util.Collection, java.util.Set
        public boolean addAll(Collection<Object> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.X
        /* renamed from: d */
        public Set delegate() {
            return this.f30714a;
        }
    }

    /* renamed from: f3.E0$i */
    class C5424i extends AbstractC5451a0 {

        /* renamed from: a */
        final /* synthetic */ SortedSet f30715a;

        C5424i(SortedSet sortedSet) {
            this.f30715a = sortedSet;
        }

        @Override // f3.AbstractC5444P, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5444P, java.util.Collection, java.util.Set
        public boolean addAll(Collection<Object> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.X
        /* renamed from: e */
        public SortedSet delegate() {
            return this.f30715a;
        }

        @Override // f3.AbstractC5451a0, java.util.SortedSet
        public SortedSet<Object> headSet(Object obj) {
            return E0.B(super.headSet(obj));
        }

        @Override // f3.AbstractC5451a0, java.util.SortedSet
        public SortedSet<Object> subSet(Object obj, Object obj2) {
            return E0.B(super.subSet(obj, obj2));
        }

        @Override // f3.AbstractC5451a0, java.util.SortedSet
        public SortedSet<Object> tailSet(Object obj) {
            return E0.B(super.tailSet(obj));
        }
    }

    /* renamed from: f3.E0$j */
    class C5425j extends W {

        /* renamed from: a */
        final /* synthetic */ NavigableSet f30716a;

        C5425j(NavigableSet navigableSet) {
            this.f30716a = navigableSet;
        }

        @Override // f3.AbstractC5444P, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.AbstractC5444P, java.util.Collection, java.util.Set
        public boolean addAll(Collection<Object> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // f3.W, java.util.NavigableSet
        public NavigableSet<Object> descendingSet() {
            return E0.z(super.descendingSet());
        }

        @Override // f3.AbstractC5451a0
        /* renamed from: f */
        public NavigableSet delegate() {
            return this.f30716a;
        }

        @Override // f3.AbstractC5451a0, java.util.SortedSet
        public SortedSet<Object> headSet(Object obj) {
            return E0.B(super.headSet(obj));
        }

        @Override // f3.AbstractC5451a0, java.util.SortedSet
        public SortedSet<Object> subSet(Object obj, Object obj2) {
            return E0.B(super.subSet(obj, obj2));
        }

        @Override // f3.AbstractC5451a0, java.util.SortedSet
        public SortedSet<Object> tailSet(Object obj) {
            return E0.B(super.tailSet(obj));
        }

        @Override // f3.W, java.util.NavigableSet
        public NavigableSet<Object> headSet(Object obj, boolean z8) {
            return E0.z(super.headSet(obj, z8));
        }

        @Override // f3.W, java.util.NavigableSet
        public NavigableSet<Object> subSet(Object obj, boolean z8, Object obj2, boolean z9) {
            return E0.z(super.subSet(obj, z8, obj2, z9));
        }

        @Override // f3.W, java.util.NavigableSet
        public NavigableSet<Object> tailSet(Object obj, boolean z8) {
            return E0.z(super.tailSet(obj, z8));
        }
    }

    /* renamed from: f3.E0$k */
    class C5426k extends AbstractC5460f {

        /* renamed from: a */
        final /* synthetic */ Map.Entry f30717a;

        C5426k(Map.Entry entry) {
            this.f30717a = entry;
        }

        @Override // f3.AbstractC5460f, java.util.Map.Entry
        public Object getKey() {
            return this.f30717a.getKey();
        }

        @Override // f3.AbstractC5460f, java.util.Map.Entry
        public Object getValue() {
            return this.f30717a.getValue();
        }
    }

    /* renamed from: f3.E0$l */
    class C5427l extends t1 {

        /* renamed from: a */
        final /* synthetic */ Iterator f30718a;

        C5427l(Iterator it) {
            this.f30718a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30718a.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<Object, Object> next() {
            return E0.I((Map.Entry) this.f30718a.next());
        }
    }

    /* renamed from: f3.E0$m */
    class C5428m implements t {

        /* renamed from: a */
        final /* synthetic */ e3.l f30719a;

        C5428m(e3.l lVar) {
            this.f30719a = lVar;
        }

        @Override // f3.E0.t
        public Object transformEntry(Object obj, Object obj2) {
            return this.f30719a.apply(obj2);
        }
    }

    /* renamed from: f3.E0$n */
    private static abstract class AbstractC5429n extends R {

        /* renamed from: d */
        final Map f30720d;

        /* renamed from: e */
        final e3.x f30721e;

        AbstractC5429n(Map map, e3.x xVar) {
            this.f30720d = map;
            this.f30721e = xVar;
        }

        @Override // f3.E0.R
        Collection b() {
            return new z(this, this.f30720d, this.f30721e);
        }

        boolean c(Object obj, Object obj2) {
            return this.f30721e.apply(E0.immutableEntry(obj, obj2));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f30720d.containsKey(obj) && c(obj, this.f30720d.get(obj));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            Object obj2 = this.f30720d.get(obj);
            if (obj2 == null || !c(obj, obj2)) {
                return null;
            }
            return obj2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            e3.w.checkArgument(c(obj, obj2));
            return this.f30720d.put(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<Object, Object> map) {
            for (Map.Entry<Object, Object> entry : map.entrySet()) {
                e3.w.checkArgument(c(entry.getKey(), entry.getValue()));
            }
            this.f30720d.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            if (containsKey(obj)) {
                return this.f30720d.remove(obj);
            }
            return null;
        }
    }

    /* renamed from: f3.E0$o */
    private static class C5430o extends R {

        /* renamed from: d */
        private final Set f30722d;

        /* renamed from: e */
        final e3.l f30723e;

        /* renamed from: f3.E0$o$a */
        class a extends s {
            a() {
            }

            @Override // f3.E0.s
            Map a() {
                return C5430o.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<Object, Object>> iterator() {
                return E0.i(C5430o.this.c(), C5430o.this.f30723e);
            }
        }

        C5430o(Set set, e3.l lVar) {
            this.f30722d = (Set) e3.w.checkNotNull(set);
            this.f30723e = (e3.l) e3.w.checkNotNull(lVar);
        }

        @Override // f3.E0.R
        protected Set a() {
            return new a();
        }

        @Override // f3.E0.R
        Collection b() {
            return AbstractC5486s.transform(this.f30722d, this.f30723e);
        }

        Set c() {
            return this.f30722d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return c().contains(obj);
        }

        @Override // f3.E0.R
        /* renamed from: createKeySet */
        public Set<Object> d() {
            return E0.A(c());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            if (AbstractC5486s.f(c(), obj)) {
                return this.f30723e.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            if (c().remove(obj)) {
                return this.f30723e.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return c().size();
        }
    }

    /* renamed from: f3.E0$p */
    private static final class C5431p extends AbstractC5367i implements Serializable {

        /* renamed from: c */
        private final InterfaceC5476n f30725c;

        C5431p(InterfaceC5476n interfaceC5476n) {
            this.f30725c = (InterfaceC5476n) e3.w.checkNotNull(interfaceC5476n);
        }

        private static Object h(InterfaceC5476n interfaceC5476n, Object obj) {
            Object obj2 = interfaceC5476n.get(obj);
            e3.w.checkArgument(obj2 != null, "No non-null mapping present for input: %s", obj);
            return obj2;
        }

        @Override // e3.AbstractC5367i
        protected Object d(Object obj) {
            return h(this.f30725c.inverse(), obj);
        }

        @Override // e3.AbstractC5367i
        protected Object e(Object obj) {
            return h(this.f30725c, obj);
        }

        @Override // e3.AbstractC5367i, e3.l
        public boolean equals(Object obj) {
            if (obj instanceof C5431p) {
                return this.f30725c.equals(((C5431p) obj).f30725c);
            }
            return false;
        }

        public int hashCode() {
            return this.f30725c.hashCode();
        }

        public String toString() {
            return "Maps.asConverter(" + this.f30725c + ")";
        }
    }

    /* renamed from: f3.E0$q */
    static abstract class AbstractC5432q extends AbstractC5446S implements NavigableMap {

        /* renamed from: a */
        private transient Comparator f30726a;

        /* renamed from: b */
        private transient Set f30727b;

        /* renamed from: c */
        private transient NavigableSet f30728c;

        /* renamed from: f3.E0$q$a */
        class a extends s {
            a() {
            }

            @Override // f3.E0.s
            Map a() {
                return AbstractC5432q.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<Object, Object>> iterator() {
                return AbstractC5432q.this.d();
            }
        }

        AbstractC5432q() {
        }

        private static T0 f(Comparator comparator) {
            return T0.from(comparator).reverse();
        }

        @Override // f3.X
        /* renamed from: a */
        public final Map delegate() {
            return e();
        }

        Set c() {
            return new a();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> ceilingEntry(Object obj) {
            return e().floorEntry(obj);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return e().floorKey(obj);
        }

        @Override // java.util.SortedMap
        public Comparator<Object> comparator() {
            Comparator<Object> comparator = this.f30726a;
            if (comparator != null) {
                return comparator;
            }
            Comparator comparator2 = e().comparator();
            if (comparator2 == null) {
                comparator2 = T0.natural();
            }
            T0 t0F = f(comparator2);
            this.f30726a = t0F;
            return t0F;
        }

        abstract Iterator d();

        @Override // java.util.NavigableMap
        public NavigableSet<Object> descendingKeySet() {
            return e().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> descendingMap() {
            return e();
        }

        abstract NavigableMap e();

        @Override // f3.AbstractC5446S, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<Object, Object>> entrySet() {
            Set<Map.Entry<Object, Object>> set = this.f30727b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<Object, Object>> setC = c();
            this.f30727b = setC;
            return setC;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> firstEntry() {
            return e().lastEntry();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return e().lastKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> floorEntry(Object obj) {
            return e().ceilingEntry(obj);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return e().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> headMap(Object obj, boolean z8) {
            return e().tailMap(obj, z8).descendingMap();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> higherEntry(Object obj) {
            return e().lowerEntry(obj);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return e().lowerKey(obj);
        }

        @Override // f3.AbstractC5446S, java.util.Map, java.util.SortedMap
        public Set<Object> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> lastEntry() {
            return e().firstEntry();
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return e().firstKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> lowerEntry(Object obj) {
            return e().higherEntry(obj);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return e().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<Object> navigableKeySet() {
            NavigableSet<Object> navigableSet = this.f30728c;
            if (navigableSet != null) {
                return navigableSet;
            }
            E e8 = new E(this);
            this.f30728c = e8;
            return e8;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> pollFirstEntry() {
            return e().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<Object, Object> pollLastEntry() {
            return e().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> subMap(Object obj, boolean z8, Object obj2, boolean z9) {
            return e().subMap(obj2, z9, obj, z8).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> tailMap(Object obj, boolean z8) {
            return e().headMap(obj, z8).descendingMap();
        }

        @Override // f3.X
        public String toString() {
            return b();
        }

        @Override // f3.AbstractC5446S, java.util.Map, f3.InterfaceC5476n
        public Collection<Object> values() {
            return new Q(this);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<Object, Object> headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<Object, Object> tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    /* renamed from: f3.E0$r */
    private static abstract class EnumC5433r extends Enum implements e3.l {
        public static final EnumC5433r KEY = new a("KEY", 0);
        public static final EnumC5433r VALUE = new b("VALUE", 1);

        /* renamed from: a */
        private static final /* synthetic */ EnumC5433r[] f30730a = a();

        /* renamed from: f3.E0$r$a */
        enum a extends EnumC5433r {
            a(String str, int i8) {
                super(str, i8, null);
            }

            @Override // f3.E0.EnumC5433r, e3.l
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* renamed from: f3.E0$r$b */
        enum b extends EnumC5433r {
            b(String str, int i8) {
                super(str, i8, null);
            }

            @Override // f3.E0.EnumC5433r, e3.l
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private EnumC5433r(String str, int i8) {
            super(str, i8);
        }

        private static /* synthetic */ EnumC5433r[] a() {
            return new EnumC5433r[]{KEY, VALUE};
        }

        public static EnumC5433r valueOf(String str) {
            return (EnumC5433r) Enum.valueOf(EnumC5433r.class, str);
        }

        public static EnumC5433r[] values() {
            return (EnumC5433r[]) f30730a.clone();
        }

        @Override // e3.l
        public abstract /* synthetic */ Object apply(Object obj);

        /* synthetic */ EnumC5433r(String str, int i8, C5420e c5420e) {
            this(str, i8);
        }
    }

    static abstract class s extends h1.j {
        s() {
        }

        abstract Map a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objD = E0.D(a(), key);
            if (e3.r.equal(objD, entry.getValue())) {
                return objD != null || a().containsKey(key);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // f3.h1.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) e3.w.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return h1.e(this, collection.iterator());
            }
        }

        @Override // f3.h1.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) e3.w.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSetWithExpectedSize = h1.newHashSetWithExpectedSize(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetNewHashSetWithExpectedSize.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(hashSetNewHashSetWithExpectedSize);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    public interface t {
        Object transformEntry(Object obj, Object obj2);
    }

    static final class u extends v implements InterfaceC5476n {

        /* renamed from: g */
        private final InterfaceC5476n f30731g;

        class a implements e3.x {

            /* renamed from: a */
            final /* synthetic */ e3.x f30732a;

            a(e3.x xVar) {
                this.f30732a = xVar;
            }

            @Override // e3.x
            public boolean apply(Map.Entry<Object, Object> entry) {
                return this.f30732a.apply(E0.immutableEntry(entry.getValue(), entry.getKey()));
            }
        }

        u(InterfaceC5476n interfaceC5476n, e3.x xVar) {
            super(interfaceC5476n, xVar);
            this.f30731g = new u(interfaceC5476n.inverse(), f(xVar), this);
        }

        private static e3.x f(e3.x xVar) {
            return new a(xVar);
        }

        @Override // f3.InterfaceC5476n
        public Object forcePut(Object obj, Object obj2) {
            e3.w.checkArgument(c(obj, obj2));
            return g().forcePut(obj, obj2);
        }

        InterfaceC5476n g() {
            return (InterfaceC5476n) this.f30720d;
        }

        @Override // f3.InterfaceC5476n
        public InterfaceC5476n inverse() {
            return this.f30731g;
        }

        @Override // f3.E0.R, java.util.AbstractMap, java.util.Map
        public Set<Object> values() {
            return this.f30731g.keySet();
        }

        private u(InterfaceC5476n interfaceC5476n, e3.x xVar, InterfaceC5476n interfaceC5476n2) {
            super(interfaceC5476n, xVar);
            this.f30731g = interfaceC5476n2;
        }
    }

    static class v extends AbstractC5429n {

        /* renamed from: f */
        final Set f30733f;

        private class a extends Y {

            /* renamed from: f3.E0$v$a$a */
            class C0286a extends r1 {

                /* renamed from: f3.E0$v$a$a$a */
                class C0287a extends AbstractC5447T {

                    /* renamed from: a */
                    final /* synthetic */ Map.Entry f30736a;

                    C0287a(Map.Entry entry) {
                        this.f30736a = entry;
                    }

                    @Override // f3.X
                    /* renamed from: a */
                    public Map.Entry delegate() {
                        return this.f30736a;
                    }

                    @Override // f3.AbstractC5447T, java.util.Map.Entry
                    public Object setValue(Object obj) {
                        e3.w.checkArgument(v.this.c(getKey(), obj));
                        return super.setValue(obj);
                    }
                }

                C0286a(Iterator it) {
                    super(it);
                }

                @Override // f3.r1
                /* renamed from: b */
                public Map.Entry a(Map.Entry entry) {
                    return new C0287a(entry);
                }
            }

            private a() {
            }

            @Override // f3.X
            /* renamed from: d */
            public Set delegate() {
                return v.this.f30733f;
            }

            @Override // f3.AbstractC5444P, java.util.Collection, java.lang.Iterable
            public Iterator<Map.Entry<Object, Object>> iterator() {
                return new C0286a(v.this.f30733f.iterator());
            }

            /* synthetic */ a(v vVar, C5420e c5420e) {
                this();
            }
        }

        class b extends B {
            b() {
                super(v.this);
            }

            @Override // f3.E0.B, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!v.this.containsKey(obj)) {
                    return false;
                }
                v.this.f30720d.remove(obj);
                return true;
            }

            @Override // f3.h1.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                v vVar = v.this;
                return v.d(vVar.f30720d, vVar.f30721e, collection);
            }

            @Override // f3.h1.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                v vVar = v.this;
                return v.e(vVar.f30720d, vVar.f30721e, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return A0.newArrayList(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) A0.newArrayList(iterator()).toArray(tArr);
            }
        }

        v(Map map, e3.x xVar) {
            super(map, xVar);
            this.f30733f = h1.filter(map.entrySet(), this.f30721e);
        }

        static boolean d(Map map, e3.x xVar, Collection collection) {
            Iterator it = map.entrySet().iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (xVar.apply(entry) && collection.contains(entry.getKey())) {
                    it.remove();
                    z8 = true;
                }
            }
            return z8;
        }

        static boolean e(Map map, e3.x xVar, Collection collection) {
            Iterator it = map.entrySet().iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (xVar.apply(entry) && !collection.contains(entry.getKey())) {
                    it.remove();
                    z8 = true;
                }
            }
            return z8;
        }

        @Override // f3.E0.R
        protected Set a() {
            return new a(this, null);
        }

        @Override // f3.E0.R
        /* renamed from: createKeySet */
        Set d() {
            return new b();
        }
    }

    private static class w extends AbstractC5466i {

        /* renamed from: a */
        private final NavigableMap f30739a;

        /* renamed from: b */
        private final e3.x f30740b;

        /* renamed from: c */
        private final Map f30741c;

        class a extends E {
            a(NavigableMap navigableMap) {
                super(navigableMap);
            }

            @Override // f3.h1.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return v.d(w.this.f30739a, w.this.f30740b, collection);
            }

            @Override // f3.h1.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return v.e(w.this.f30739a, w.this.f30740b, collection);
            }
        }

        w(NavigableMap navigableMap, e3.x xVar) {
            this.f30739a = (NavigableMap) e3.w.checkNotNull(navigableMap);
            this.f30740b = xVar;
            this.f30741c = new v(navigableMap, xVar);
        }

        @Override // f3.E0.A
        Iterator a() {
            return AbstractC5495w0.filter(this.f30739a.entrySet().iterator(), this.f30740b);
        }

        @Override // f3.AbstractC5466i
        Iterator b() {
            return AbstractC5495w0.filter(this.f30739a.descendingMap().entrySet().iterator(), this.f30740b);
        }

        @Override // f3.E0.A, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f30741c.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<Object> comparator() {
            return this.f30739a.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f30741c.containsKey(obj);
        }

        @Override // f3.AbstractC5466i, java.util.NavigableMap
        public NavigableMap<Object, Object> descendingMap() {
            return E0.filterEntries(this.f30739a.descendingMap(), this.f30740b);
        }

        @Override // f3.E0.A, java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<Object, Object>> entrySet() {
            return this.f30741c.entrySet();
        }

        @Override // f3.AbstractC5466i, java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            return this.f30741c.get(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> headMap(Object obj, boolean z8) {
            return E0.filterEntries(this.f30739a.headMap(obj, z8), this.f30740b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !AbstractC5493v0.any(this.f30739a.entrySet(), this.f30740b);
        }

        @Override // f3.AbstractC5466i, java.util.NavigableMap
        public NavigableSet<Object> navigableKeySet() {
            return new a(this);
        }

        @Override // f3.AbstractC5466i, java.util.NavigableMap
        public Map.Entry<Object, Object> pollFirstEntry() {
            return (Map.Entry) AbstractC5493v0.c(this.f30739a.entrySet(), this.f30740b);
        }

        @Override // f3.AbstractC5466i, java.util.NavigableMap
        public Map.Entry<Object, Object> pollLastEntry() {
            return (Map.Entry) AbstractC5493v0.c(this.f30739a.descendingMap().entrySet(), this.f30740b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            return this.f30741c.put(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<Object, Object> map) {
            this.f30741c.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            return this.f30741c.remove(obj);
        }

        @Override // f3.E0.A, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f30741c.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> subMap(Object obj, boolean z8, Object obj2, boolean z9) {
            return E0.filterEntries(this.f30739a.subMap(obj, z8, obj2, z9), this.f30740b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Object, Object> tailMap(Object obj, boolean z8) {
            return E0.filterEntries(this.f30739a.tailMap(obj, z8), this.f30740b);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<Object> values() {
            return new z(this, this.f30739a, this.f30740b);
        }
    }

    private static class x extends v implements SortedMap {

        class a extends v.b implements SortedSet {
            a() {
                super();
            }

            @Override // java.util.SortedSet
            public Comparator<Object> comparator() {
                return x.this.g().comparator();
            }

            @Override // java.util.SortedSet
            public Object first() {
                return x.this.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<Object> headSet(Object obj) {
                return (SortedSet) x.this.headMap(obj).keySet();
            }

            @Override // java.util.SortedSet
            public Object last() {
                return x.this.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<Object> subSet(Object obj, Object obj2) {
                return (SortedSet) x.this.subMap(obj, obj2).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet<Object> tailSet(Object obj) {
                return (SortedSet) x.this.tailMap(obj).keySet();
            }
        }

        x(SortedMap sortedMap, e3.x xVar) {
            super(sortedMap, xVar);
        }

        @Override // java.util.SortedMap
        public Comparator<Object> comparator() {
            return g().comparator();
        }

        @Override // f3.E0.v, f3.E0.R
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedSet d() {
            return new a();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return keySet().iterator().next();
        }

        SortedMap g() {
            return (SortedMap) this.f30720d;
        }

        @Override // java.util.SortedMap
        public SortedMap<Object, Object> headMap(Object obj) {
            return new x(g().headMap(obj), this.f30721e);
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            SortedMap sortedMapG = g();
            while (true) {
                Object objLastKey = sortedMapG.lastKey();
                if (c(objLastKey, N0.a(this.f30720d.get(objLastKey)))) {
                    return objLastKey;
                }
                sortedMapG = g().headMap(objLastKey);
            }
        }

        @Override // java.util.SortedMap
        public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
            return new x(g().subMap(obj, obj2), this.f30721e);
        }

        @Override // java.util.SortedMap
        public SortedMap<Object, Object> tailMap(Object obj) {
            return new x(g().tailMap(obj), this.f30721e);
        }

        @Override // f3.E0.R, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public SortedSet<Object> keySet() {
            return (SortedSet) super.keySet();
        }
    }

    private static class y extends AbstractC5429n {

        /* renamed from: f */
        final e3.x f30744f;

        y(Map map, e3.x xVar, e3.x xVar2) {
            super(map, xVar2);
            this.f30744f = xVar;
        }

        @Override // f3.E0.R
        protected Set a() {
            return h1.filter(this.f30720d.entrySet(), this.f30721e);
        }

        @Override // f3.E0.AbstractC5429n, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f30720d.containsKey(obj) && this.f30744f.apply(obj);
        }

        @Override // f3.E0.R
        /* renamed from: createKeySet */
        Set d() {
            return h1.filter(this.f30720d.keySet(), this.f30744f);
        }
    }

    private static final class z extends Q {

        /* renamed from: b */
        final Map f30745b;

        /* renamed from: c */
        final e3.x f30746c;

        z(Map map, Map map2, e3.x xVar) {
            super(map);
            this.f30745b = map2;
            this.f30746c = xVar;
        }

        @Override // f3.E0.Q, java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            Iterator it = this.f30745b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (this.f30746c.apply(entry) && e3.r.equal(entry.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // f3.E0.Q, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator it = this.f30745b.entrySet().iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (this.f30746c.apply(entry) && collection.contains(entry.getValue())) {
                    it.remove();
                    z8 = true;
                }
            }
            return z8;
        }

        @Override // f3.E0.Q, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator it = this.f30745b.entrySet().iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (this.f30746c.apply(entry) && !collection.contains(entry.getValue())) {
                    it.remove();
                    z8 = true;
                }
            }
            return z8;
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

    public static Set A(Set set) {
        return new C5423h(set);
    }

    public static SortedSet B(SortedSet sortedSet) {
        return new C5424i(sortedSet);
    }

    static boolean C(Map map, Object obj) {
        e3.w.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static Object D(Map map, Object obj) {
        e3.w.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static Object E(Map map, Object obj) {
        e3.w.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String F(Map map) {
        StringBuilder sbE = AbstractC5486s.e(map.size());
        sbE.append('{');
        boolean z8 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z8) {
                sbE.append(", ");
            }
            sbE.append(entry.getKey());
            sbE.append('=');
            sbE.append(entry.getValue());
            z8 = false;
        }
        sbE.append('}');
        return sbE.toString();
    }

    static Map.Entry G(t tVar, Map.Entry entry) {
        e3.w.checkNotNull(tVar);
        e3.w.checkNotNull(entry);
        return new C5418c(entry, tVar);
    }

    private static AbstractC5469j0 H(Iterator it, e3.l lVar, AbstractC5469j0.b bVar) {
        e3.w.checkNotNull(lVar);
        while (it.hasNext()) {
            Object next = it.next();
            bVar.put(lVar.apply(next), next);
        }
        try {
            return bVar.buildOrThrow();
        } catch (IllegalArgumentException e8) {
            throw new IllegalArgumentException(e8.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
        }
    }

    static Map.Entry I(Map.Entry entry) {
        e3.w.checkNotNull(entry);
        return new C5426k(entry);
    }

    static t1 J(Iterator it) {
        return new C5427l(it);
    }

    static Set K(Set set) {
        return new N(Collections.unmodifiableSet(set));
    }

    public static Map L(Map map) {
        return map instanceof SortedMap ? Collections.unmodifiableSortedMap((SortedMap) map) : Collections.unmodifiableMap(map);
    }

    public static Map.Entry M(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return I(entry);
    }

    static e3.l N() {
        return EnumC5433r.VALUE;
    }

    static Iterator O(Iterator it) {
        return new C5421f(it);
    }

    static e3.x P(e3.x xVar) {
        return e3.y.compose(xVar, N());
    }

    public static <A, B> AbstractC5367i asConverter(InterfaceC5476n interfaceC5476n) {
        return new C5431p(interfaceC5476n);
    }

    public static <K, V> Map<K, V> asMap(Set<K> set, e3.l lVar) {
        return new C5430o(set, lVar);
    }

    public static <K, V> B0 difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        return map instanceof SortedMap ? difference((SortedMap) map, (Map) map2) : difference(map, map2, e3.j.equals());
    }

    static e3.l f(t tVar) {
        e3.w.checkNotNull(tVar);
        return new C5419d(tVar);
    }

    public static <K, V> Map<K, V> filterEntries(Map<K, V> map, e3.x xVar) {
        e3.w.checkNotNull(xVar);
        return map instanceof AbstractC5429n ? p((AbstractC5429n) map, xVar) : new v((Map) e3.w.checkNotNull(map), xVar);
    }

    public static <K, V> Map<K, V> filterKeys(Map<K, V> map, e3.x xVar) {
        e3.w.checkNotNull(xVar);
        e3.x xVarW = w(xVar);
        return map instanceof AbstractC5429n ? p((AbstractC5429n) map, xVarW) : new y((Map) e3.w.checkNotNull(map), xVar, xVarW);
    }

    public static <K, V> Map<K, V> filterValues(Map<K, V> map, e3.x xVar) {
        return filterEntries(map, P(xVar));
    }

    public static AbstractC5469j0 fromProperties(Properties properties) {
        AbstractC5469j0.b bVarBuilder = AbstractC5469j0.builder();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            Object objNextElement = enumerationPropertyNames.nextElement();
            Objects.requireNonNull(objNextElement);
            String str = (String) objNextElement;
            String property = properties.getProperty(str);
            Objects.requireNonNull(property);
            bVarBuilder.put(str, property);
        }
        return bVarBuilder.buildOrThrow();
    }

    static e3.l g(t tVar) {
        e3.w.checkNotNull(tVar);
        return new C5417b(tVar);
    }

    static t h(e3.l lVar) {
        e3.w.checkNotNull(lVar);
        return new C5428m(lVar);
    }

    static Iterator i(Set set, e3.l lVar) {
        return new C5422g(set.iterator(), lVar);
    }

    public static <K, V> Map.Entry<K, V> immutableEntry(K k8, V v8) {
        return new C5459e0(k8, v8);
    }

    public static <K extends Enum<K>, V> AbstractC5469j0 immutableEnumMap(Map<K, ? extends V> map) {
        if (map instanceof C5461f0) {
            return (C5461f0) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return AbstractC5469j0.of();
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        AbstractC5484r.a(key, value);
        EnumMap enumMap = new EnumMap(Collections.singletonMap(key, value));
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            AbstractC5484r.a(key2, value2);
            enumMap.put((EnumMap) key2, (K) value2);
        }
        return C5461f0.h(enumMap);
    }

    static e3.l j(t tVar, Object obj) {
        e3.w.checkNotNull(tVar);
        return new C5416a(tVar, obj);
    }

    static int k(int i8) {
        if (i8 < 3) {
            AbstractC5484r.b(i8, "expectedSize");
            return i8 + 1;
        }
        if (i8 < 1073741824) {
            return (int) Math.ceil(i8 / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    static boolean l(Collection collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.contains(I((Map.Entry) obj));
        }
        return false;
    }

    private static void m(Map map, Map map2, e3.j jVar, Map map3, Map map4, Map map5, Map map6) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (map2.containsKey(key)) {
                Object objA = N0.a(map4.remove(key));
                if (jVar.equivalent(value, objA)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, P.a(value, objA));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    static boolean n(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Class<K> cls) {
        return new EnumMap<>((Class) e3.w.checkNotNull(cls));
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i8) {
        return new HashMap<>(k(i8));
    }

    public static <K, V> IdentityHashMap<K, V> newIdentityHashMap() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i8) {
        return new LinkedHashMap<>(k(i8));
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
        return new TreeMap<>();
    }

    private static InterfaceC5476n o(u uVar, e3.x xVar) {
        return new u(uVar.g(), e3.y.and(uVar.f30721e, xVar));
    }

    private static Map p(AbstractC5429n abstractC5429n, e3.x xVar) {
        return new v(abstractC5429n.f30720d, e3.y.and(abstractC5429n.f30721e, xVar));
    }

    private static NavigableMap q(w wVar, e3.x xVar) {
        return new w(wVar.f30739a, e3.y.and(wVar.f30740b, xVar));
    }

    private static SortedMap r(x xVar, e3.x xVar2) {
        return new x(xVar.g(), e3.y.and(xVar.f30721e, xVar2));
    }

    static AbstractC5469j0 s(Collection collection) {
        AbstractC5469j0.b bVar = new AbstractC5469j0.b(collection.size());
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            bVar.put(it.next(), Integer.valueOf(i8));
            i8++;
        }
        return bVar.buildOrThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> subMap(NavigableMap<K, V> navigableMap, W0 w02) {
        if (navigableMap.comparator() != null && navigableMap.comparator() != T0.natural() && w02.hasLowerBound() && w02.hasUpperBound()) {
            e3.w.checkArgument(navigableMap.comparator().compare(w02.lowerEndpoint(), w02.upperEndpoint()) <= 0, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (w02.hasLowerBound() && w02.hasUpperBound()) {
            Comparable comparableLowerEndpoint = w02.lowerEndpoint();
            EnumC5478o enumC5478oLowerBoundType = w02.lowerBoundType();
            EnumC5478o enumC5478o = EnumC5478o.CLOSED;
            return navigableMap.subMap(comparableLowerEndpoint, enumC5478oLowerBoundType == enumC5478o, w02.upperEndpoint(), w02.upperBoundType() == enumC5478o);
        }
        if (w02.hasLowerBound()) {
            return navigableMap.tailMap(w02.lowerEndpoint(), w02.lowerBoundType() == EnumC5478o.CLOSED);
        }
        if (w02.hasUpperBound()) {
            return navigableMap.headMap(w02.upperEndpoint(), w02.upperBoundType() == EnumC5478o.CLOSED);
        }
        return (NavigableMap) e3.w.checkNotNull(navigableMap);
    }

    public static <K, V> InterfaceC5476n synchronizedBiMap(InterfaceC5476n interfaceC5476n) {
        return p1.g(interfaceC5476n, null);
    }

    public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> navigableMap) {
        return p1.m(navigableMap);
    }

    static e3.l t() {
        return EnumC5433r.KEY;
    }

    public static <K, V> AbstractC5469j0 toMap(Iterable<K> iterable, e3.l lVar) {
        return toMap(iterable.iterator(), lVar);
    }

    public static <K, V1, V2> Map<K, V2> transformEntries(Map<K, V1> map, t tVar) {
        return new I(map, tVar);
    }

    public static <K, V1, V2> Map<K, V2> transformValues(Map<K, V1> map, e3.l lVar) {
        return transformEntries(map, h(lVar));
    }

    static Iterator u(Iterator it) {
        return new C5420e(it);
    }

    public static <K, V> AbstractC5469j0 uniqueIndex(Iterable<V> iterable, e3.l lVar) {
        return iterable instanceof Collection ? H(iterable.iterator(), lVar, AbstractC5469j0.builderWithExpectedSize(((Collection) iterable).size())) : uniqueIndex(iterable.iterator(), lVar);
    }

    public static <K, V> InterfaceC5476n unmodifiableBiMap(InterfaceC5476n interfaceC5476n) {
        return new L(interfaceC5476n, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
        e3.w.checkNotNull(navigableMap);
        return navigableMap instanceof O ? navigableMap : new O(navigableMap);
    }

    static Object v(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    static e3.x w(e3.x xVar) {
        return e3.y.compose(xVar, t());
    }

    static Comparator x(Comparator comparator) {
        return comparator != null ? comparator : T0.natural();
    }

    static boolean y(Collection collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.remove(I((Map.Entry) obj));
        }
        return false;
    }

    public static NavigableSet z(NavigableSet navigableSet) {
        return new C5425j(navigableSet);
    }

    public static <K, V> SortedMap<K, V> asMap(SortedSet<K> sortedSet, e3.l lVar) {
        return new F(sortedSet, lVar);
    }

    public static <K, V> SortedMap<K, V> filterValues(SortedMap<K, V> sortedMap, e3.x xVar) {
        return filterEntries((SortedMap) sortedMap, P(xVar));
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <K, V> TreeMap<K, V> newTreeMap(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<>((SortedMap) sortedMap);
    }

    public static <K, V> AbstractC5469j0 toMap(Iterator<K> it, e3.l lVar) {
        e3.w.checkNotNull(lVar);
        AbstractC5469j0.b bVarBuilder = AbstractC5469j0.builder();
        while (it.hasNext()) {
            K next = it.next();
            bVarBuilder.put(next, lVar.apply(next));
        }
        return bVarBuilder.buildKeepingLast();
    }

    public static <K, V1, V2> SortedMap<K, V2> transformEntries(SortedMap<K, V1> sortedMap, t tVar) {
        return new K(sortedMap, tVar);
    }

    public static <K, V1, V2> SortedMap<K, V2> transformValues(SortedMap<K, V1> sortedMap, e3.l lVar) {
        return transformEntries((SortedMap) sortedMap, h(lVar));
    }

    public static <K, V> NavigableMap<K, V> asMap(NavigableSet<K> navigableSet, e3.l lVar) {
        return new D(navigableSet, lVar);
    }

    public static <K, V> NavigableMap<K, V> filterValues(NavigableMap<K, V> navigableMap, e3.x xVar) {
        return filterEntries((NavigableMap) navigableMap, P(xVar));
    }

    public static <C, K extends C, V> TreeMap<K, V> newTreeMap(Comparator<C> comparator) {
        return new TreeMap<>(comparator);
    }

    public static <K, V1, V2> NavigableMap<K, V2> transformEntries(NavigableMap<K, V1> navigableMap, t tVar) {
        return new J(navigableMap, tVar);
    }

    public static <K, V1, V2> NavigableMap<K, V2> transformValues(NavigableMap<K, V1> navigableMap, e3.l lVar) {
        return transformEntries((NavigableMap) navigableMap, h(lVar));
    }

    public static <K, V> InterfaceC5476n filterValues(InterfaceC5476n interfaceC5476n, e3.x xVar) {
        return filterEntries(interfaceC5476n, P(xVar));
    }

    public static <K, V> B0 difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, e3.j jVar) {
        e3.w.checkNotNull(jVar);
        LinkedHashMap linkedHashMapNewLinkedHashMap = newLinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        LinkedHashMap linkedHashMapNewLinkedHashMap2 = newLinkedHashMap();
        LinkedHashMap linkedHashMapNewLinkedHashMap3 = newLinkedHashMap();
        m(map, map2, jVar, linkedHashMapNewLinkedHashMap, linkedHashMap, linkedHashMapNewLinkedHashMap2, linkedHashMapNewLinkedHashMap3);
        return new C(linkedHashMapNewLinkedHashMap, linkedHashMap, linkedHashMapNewLinkedHashMap2, linkedHashMapNewLinkedHashMap3);
    }

    public static <K, V> SortedMap<K, V> filterEntries(SortedMap<K, V> sortedMap, e3.x xVar) {
        e3.w.checkNotNull(xVar);
        if (sortedMap instanceof x) {
            return r((x) sortedMap, xVar);
        }
        return new x((SortedMap) e3.w.checkNotNull(sortedMap), xVar);
    }

    public static <K, V> SortedMap<K, V> filterKeys(SortedMap<K, V> sortedMap, e3.x xVar) {
        return filterEntries((SortedMap) sortedMap, w(xVar));
    }

    public static <K, V> AbstractC5469j0 uniqueIndex(Iterator<V> it, e3.l lVar) {
        return H(it, lVar, AbstractC5469j0.builder());
    }

    public static <K, V> NavigableMap<K, V> filterKeys(NavigableMap<K, V> navigableMap, e3.x xVar) {
        return filterEntries((NavigableMap) navigableMap, w(xVar));
    }

    public static <K, V> InterfaceC5476n filterKeys(InterfaceC5476n interfaceC5476n, e3.x xVar) {
        e3.w.checkNotNull(xVar);
        return filterEntries(interfaceC5476n, w(xVar));
    }

    public static <K, V> NavigableMap<K, V> filterEntries(NavigableMap<K, V> navigableMap, e3.x xVar) {
        e3.w.checkNotNull(xVar);
        if (navigableMap instanceof w) {
            return q((w) navigableMap, xVar);
        }
        return new w((NavigableMap) e3.w.checkNotNull(navigableMap), xVar);
    }

    public static <K, V> l1 difference(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        e3.w.checkNotNull(sortedMap);
        e3.w.checkNotNull(map);
        Comparator comparatorX = x(sortedMap.comparator());
        TreeMap treeMapNewTreeMap = newTreeMap(comparatorX);
        TreeMap treeMapNewTreeMap2 = newTreeMap(comparatorX);
        treeMapNewTreeMap2.putAll(map);
        TreeMap treeMapNewTreeMap3 = newTreeMap(comparatorX);
        TreeMap treeMapNewTreeMap4 = newTreeMap(comparatorX);
        m(sortedMap, map, e3.j.equals(), treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
        return new H(treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
    }

    public static <K, V> InterfaceC5476n filterEntries(InterfaceC5476n interfaceC5476n, e3.x xVar) {
        e3.w.checkNotNull(interfaceC5476n);
        e3.w.checkNotNull(xVar);
        if (interfaceC5476n instanceof u) {
            return o((u) interfaceC5476n, xVar);
        }
        return new u(interfaceC5476n, xVar);
    }
}
