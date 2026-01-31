package f3;

import f3.H0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: f3.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5462g implements F0 {

    /* renamed from: a, reason: collision with root package name */
    private transient Collection f30932a;

    /* renamed from: b, reason: collision with root package name */
    private transient Set f30933b;

    /* renamed from: c, reason: collision with root package name */
    private transient K0 f30934c;

    /* renamed from: d, reason: collision with root package name */
    private transient Collection f30935d;

    /* renamed from: e, reason: collision with root package name */
    private transient Map f30936e;

    /* renamed from: f3.g$a */
    class a extends H0.f {
        a() {
        }

        @Override // f3.H0.f
        F0 a() {
            return AbstractC5462g.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<Object, Object>> iterator() {
            return AbstractC5462g.this.f();
        }
    }

    /* renamed from: f3.g$b */
    class b extends a implements Set {
        b(AbstractC5462g abstractC5462g) {
            super();
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

    /* renamed from: f3.g$c */
    class c extends AbstractCollection {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC5462g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC5462g.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return AbstractC5462g.this.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC5462g.this.size();
        }
    }

    AbstractC5462g() {
    }

    abstract Map a();

    @Override // f3.F0, f3.InterfaceC5501z0
    public Map<Object, Collection<Object>> asMap() {
        Map<Object, Collection<Object>> map = this.f30936e;
        if (map != null) {
            return map;
        }
        Map<Object, Collection<Object>> mapA = a();
        this.f30936e = mapA;
        return mapA;
    }

    abstract Collection b();

    abstract Set c();

    @Override // f3.F0, f3.InterfaceC5439K
    public abstract /* synthetic */ void clear();

    @Override // f3.F0, f3.g1
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<Object> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // f3.F0, f3.InterfaceC5439K
    public abstract /* synthetic */ boolean containsKey(Object obj);

    @Override // f3.F0, f3.g1
    public boolean containsValue(Object obj) {
        Iterator<Collection<Object>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract K0 d();

    abstract Collection e();

    @Override // f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public Collection<Map.Entry<Object, Object>> entries() {
        Collection<Map.Entry<Object, Object>> collection = this.f30932a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<Object, Object>> collectionB = b();
        this.f30932a = collectionB;
        return collectionB;
    }

    @Override // f3.F0
    public boolean equals(Object obj) {
        return H0.c(this, obj);
    }

    abstract Iterator f();

    Iterator g() {
        return E0.O(entries().iterator());
    }

    @Override // f3.F0, f3.InterfaceC5439K
    public abstract /* synthetic */ Collection get(Object obj);

    @Override // f3.F0
    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // f3.F0
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // f3.F0
    public Set<Object> keySet() {
        Set<Object> set = this.f30933b;
        if (set != null) {
            return set;
        }
        Set<Object> setC = c();
        this.f30933b = setC;
        return setC;
    }

    @Override // f3.F0
    public K0 keys() {
        K0 k02 = this.f30934c;
        if (k02 != null) {
            return k02;
        }
        K0 k0D = d();
        this.f30934c = k0D;
        return k0D;
    }

    @Override // f3.F0, f3.g1
    public boolean put(Object obj, Object obj2) {
        return get(obj).add(obj2);
    }

    @Override // f3.F0, f3.g1
    public boolean putAll(Object obj, Iterable<Object> iterable) {
        e3.w.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return !collection.isEmpty() && get(obj).addAll(collection);
        }
        Iterator<Object> it = iterable.iterator();
        return it.hasNext() && AbstractC5495w0.addAll(get(obj), it);
    }

    @Override // f3.F0, f3.g1
    public boolean remove(Object obj, Object obj2) {
        Collection<Object> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // f3.F0, f3.InterfaceC5439K
    public abstract /* synthetic */ Collection removeAll(Object obj);

    @Override // f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public Collection<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        e3.w.checkNotNull(iterable);
        Collection<Object> collectionRemoveAll = removeAll(obj);
        putAll(obj, iterable);
        return collectionRemoveAll;
    }

    @Override // f3.F0, f3.InterfaceC5439K
    public abstract /* synthetic */ int size();

    public String toString() {
        return asMap().toString();
    }

    @Override // f3.F0
    public Collection<Object> values() {
        Collection<Object> collection = this.f30935d;
        if (collection != null) {
            return collection;
        }
        Collection<Object> collectionE = e();
        this.f30935d = collectionE;
        return collectionE;
    }

    @Override // f3.F0, f3.g1
    public boolean putAll(F0 f02) {
        boolean zPut = false;
        for (Map.Entry<Object, Object> entry : f02.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }
}
