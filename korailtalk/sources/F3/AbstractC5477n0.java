package f3;

import f3.K0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: f3.n0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5477n0 extends AbstractC5474m implements Serializable {

    /* renamed from: f */
    final transient AbstractC5469j0 f31017f;

    /* renamed from: g */
    final transient int f31018g;

    /* renamed from: f3.n0$a */
    class a extends t1 {

        /* renamed from: a */
        final Iterator f31019a;

        /* renamed from: b */
        Object f31020b = null;

        /* renamed from: c */
        Iterator f31021c = AbstractC5495w0.f();

        a() {
            this.f31019a = AbstractC5477n0.this.f31017f.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31021c.hasNext() || this.f31019a.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<Object, Object> next() {
            if (!this.f31021c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f31019a.next();
                this.f31020b = entry.getKey();
                this.f31021c = ((AbstractC5457d0) entry.getValue()).iterator();
            }
            Object obj = this.f31020b;
            Objects.requireNonNull(obj);
            return E0.immutableEntry(obj, this.f31021c.next());
        }
    }

    /* renamed from: f3.n0$b */
    class b extends t1 {

        /* renamed from: a */
        Iterator f31023a;

        /* renamed from: b */
        Iterator f31024b = AbstractC5495w0.f();

        b() {
            this.f31023a = AbstractC5477n0.this.f31017f.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31024b.hasNext() || this.f31023a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f31024b.hasNext()) {
                this.f31024b = ((AbstractC5457d0) this.f31023a.next()).iterator();
            }
            return this.f31024b.next();
        }
    }

    /* renamed from: f3.n0$d */
    private static class d extends AbstractC5457d0 {

        /* renamed from: b */
        final AbstractC5477n0 f31029b;

        d(AbstractC5477n0 abstractC5477n0) {
            this.f31029b = abstractC5477n0;
        }

        @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f31029b.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f31029b.size();
        }

        @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public t1 iterator() {
            return this.f31029b.f();
        }
    }

    /* renamed from: f3.n0$e */
    class e extends AbstractC5479o0 {
        e() {
        }

        @Override // f3.AbstractC5479o0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return AbstractC5477n0.this.containsKey(obj);
        }

        @Override // f3.AbstractC5479o0, f3.K0
        public int count(Object obj) {
            Collection collection = (Collection) AbstractC5477n0.this.f31017f.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // f3.AbstractC5479o0
        K0.a h(int i8) {
            Map.Entry entry = (Map.Entry) AbstractC5477n0.this.f31017f.entrySet().asList().get(i8);
            return L0.immutableEntry(entry.getKey(), ((Collection) entry.getValue()).size());
        }

        @Override // f3.AbstractC5457d0
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, f3.K0
        public int size() {
            return AbstractC5477n0.this.size();
        }

        @Override // f3.AbstractC5479o0, f3.K0
        public AbstractC5483q0 elementSet() {
            return AbstractC5477n0.this.keySet();
        }
    }

    /* renamed from: f3.n0$f */
    private static final class f extends AbstractC5457d0 {

        /* renamed from: b */
        private final transient AbstractC5477n0 f31031b;

        f(AbstractC5477n0 abstractC5477n0) {
            this.f31031b = abstractC5477n0;
        }

        @Override // f3.AbstractC5457d0
        int a(Object[] objArr, int i8) {
            t1 it = this.f31031b.f31017f.values().iterator();
            while (it.hasNext()) {
                i8 = ((AbstractC5457d0) it.next()).a(objArr, i8);
            }
            return i8;
        }

        @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f31031b.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f31031b.size();
        }

        @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public t1 iterator() {
            return this.f31031b.g();
        }
    }

    AbstractC5477n0(AbstractC5469j0 abstractC5469j0, int i8) {
        this.f31017f = abstractC5469j0;
        this.f31018g = i8;
    }

    public static <K, V> c builder() {
        return new c();
    }

    public static <K, V> AbstractC5477n0 copyOf(F0 f02) {
        if (f02 instanceof AbstractC5477n0) {
            AbstractC5477n0 abstractC5477n0 = (AbstractC5477n0) f02;
            if (!abstractC5477n0.l()) {
                return abstractC5477n0;
            }
        }
        return C5467i0.copyOf(f02);
    }

    public static <K, V> AbstractC5477n0 of() {
        return C5467i0.of();
    }

    @Override // f3.AbstractC5462g
    Map a() {
        throw new AssertionError("should never be called");
    }

    @Override // f3.AbstractC5462g
    Set c() {
        throw new AssertionError("unreachable");
    }

    @Override // f3.AbstractC5474m, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.g1
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // f3.AbstractC5474m, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public boolean containsKey(Object obj) {
        return this.f31017f.containsKey(obj);
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.g1
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // f3.AbstractC5462g, f3.F0
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // f3.AbstractC5474m, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public abstract AbstractC5457d0 get(Object obj);

    @Override // f3.AbstractC5462g
    /* renamed from: h */
    public AbstractC5457d0 b() {
        return new d(this);
    }

    @Override // f3.AbstractC5462g, f3.F0
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // f3.AbstractC5462g
    /* renamed from: i */
    public AbstractC5479o0 d() {
        return new e();
    }

    public abstract AbstractC5477n0 inverse();

    @Override // f3.AbstractC5462g, f3.F0
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // f3.AbstractC5462g
    /* renamed from: j */
    public AbstractC5457d0 e() {
        return new f(this);
    }

    @Override // f3.AbstractC5462g
    /* renamed from: k */
    public t1 f() {
        return new a();
    }

    boolean l() {
        return this.f31017f.e();
    }

    @Override // f3.AbstractC5462g
    /* renamed from: m */
    public t1 g() {
        return new b();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.g1
    @Deprecated
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.g1
    @Deprecated
    public final boolean putAll(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.g1
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    @Deprecated
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // f3.AbstractC5474m, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public int size() {
        return this.f31018g;
    }

    @Override // f3.AbstractC5462g
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: f3.n0$c */
    public static class c {

        /* renamed from: a */
        final Map f31026a = V0.d();

        /* renamed from: b */
        Comparator f31027b;

        /* renamed from: c */
        Comparator f31028c;

        Collection a() {
            return new ArrayList();
        }

        public AbstractC5477n0 build() {
            Collection collectionEntrySet = this.f31026a.entrySet();
            Comparator comparator = this.f31027b;
            if (comparator != null) {
                collectionEntrySet = T0.from(comparator).a().immutableSortedCopy(collectionEntrySet);
            }
            return C5467i0.n(collectionEntrySet, this.f31028c);
        }

        public c orderKeysBy(Comparator<Object> comparator) {
            this.f31027b = (Comparator) e3.w.checkNotNull(comparator);
            return this;
        }

        public c orderValuesBy(Comparator<Object> comparator) {
            this.f31028c = (Comparator) e3.w.checkNotNull(comparator);
            return this;
        }

        public c put(Object obj, Object obj2) {
            AbstractC5484r.a(obj, obj2);
            Collection collection = (Collection) this.f31026a.get(obj);
            if (collection == null) {
                Map map = this.f31026a;
                Collection collectionA = a();
                map.put(obj, collectionA);
                collection = collectionA;
            }
            collection.add(obj2);
            return this;
        }

        public c putAll(Iterable<? extends Map.Entry<Object, Object>> iterable) {
            Iterator<? extends Map.Entry<Object, Object>> it = iterable.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        public c putAll(Object obj, Iterable<Object> iterable) {
            if (obj != null) {
                Collection collection = (Collection) this.f31026a.get(obj);
                if (collection != null) {
                    for (Object obj2 : iterable) {
                        AbstractC5484r.a(obj, obj2);
                        collection.add(obj2);
                    }
                    return this;
                }
                Iterator<Object> it = iterable.iterator();
                if (!it.hasNext()) {
                    return this;
                }
                Collection collectionA = a();
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC5484r.a(obj, next);
                    collectionA.add(next);
                }
                this.f31026a.put(obj, collectionA);
                return this;
            }
            throw new NullPointerException("null key in entry: null=" + AbstractC5493v0.toString(iterable));
        }

        public c put(Map.Entry<Object, Object> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        public c putAll(Object obj, Object... objArr) {
            return putAll(obj, Arrays.asList(objArr));
        }

        public c putAll(F0 f02) {
            for (Map.Entry<Object, Collection<Object>> entry : f02.asMap().entrySet()) {
                putAll(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    public static <K, V> AbstractC5477n0 of(K k8, V v8) {
        return C5467i0.of((Object) k8, (Object) v8);
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5501z0
    public AbstractC5469j0 asMap() {
        return this.f31017f;
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public AbstractC5457d0 entries() {
        return (AbstractC5457d0) super.entries();
    }

    @Override // f3.AbstractC5462g, f3.F0
    public AbstractC5483q0 keySet() {
        return this.f31017f.keySet();
    }

    @Override // f3.AbstractC5462g, f3.F0
    public AbstractC5479o0 keys() {
        return (AbstractC5479o0) super.keys();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.g1
    @Deprecated
    public final boolean putAll(F0 f02) {
        throw new UnsupportedOperationException();
    }

    @Override // f3.AbstractC5474m, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    @Deprecated
    public AbstractC5457d0 removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    @Deprecated
    public AbstractC5457d0 replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // f3.AbstractC5462g, f3.F0
    public AbstractC5457d0 values() {
        return (AbstractC5457d0) super.values();
    }

    public static <K, V> AbstractC5477n0 of(K k8, V v8, K k9, V v9) {
        return C5467i0.of((Object) k8, (Object) v8, (Object) k9, (Object) v9);
    }

    public static <K, V> AbstractC5477n0 of(K k8, V v8, K k9, V v9, K k10, V v10) {
        return C5467i0.of((Object) k8, (Object) v8, (Object) k9, (Object) v9, (Object) k10, (Object) v10);
    }

    public static <K, V> AbstractC5477n0 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return C5467i0.copyOf((Iterable) iterable);
    }

    public static <K, V> AbstractC5477n0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11) {
        return C5467i0.of((Object) k8, (Object) v8, (Object) k9, (Object) v9, (Object) k10, (Object) v10, (Object) k11, (Object) v11);
    }

    public static <K, V> AbstractC5477n0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12) {
        return C5467i0.of((Object) k8, (Object) v8, (Object) k9, (Object) v9, (Object) k10, (Object) v10, (Object) k11, (Object) v11, (Object) k12, (Object) v12);
    }
}
