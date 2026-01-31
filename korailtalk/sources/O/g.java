package O;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
abstract class g {

    /* renamed from: a, reason: collision with root package name */
    b f3372a;

    /* renamed from: b, reason: collision with root package name */
    c f3373b;

    /* renamed from: c, reason: collision with root package name */
    e f3374c;

    final class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        final int f3375a;

        /* renamed from: b, reason: collision with root package name */
        int f3376b;

        /* renamed from: c, reason: collision with root package name */
        int f3377c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3378d = false;

        a(int i8) {
            this.f3375a = i8;
            this.f3376b = g.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3377c < this.f3376b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objB = g.this.b(this.f3377c, this.f3375a);
            this.f3377c++;
            this.f3378d = true;
            return objB;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3378d) {
                throw new IllegalStateException();
            }
            int i8 = this.f3377c - 1;
            this.f3377c = i8;
            this.f3376b--;
            this.f3378d = false;
            g.this.h(i8);
        }
    }

    final class b implements Set {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<Object, Object>> collection) {
            int iD = g.this.d();
            for (Map.Entry<Object, Object> entry : collection) {
                g.this.g(entry.getKey(), entry.getValue());
            }
            return iD != g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iE = g.this.e(entry.getKey());
            if (iE < 0) {
                return false;
            }
            return O.d.equal(g.this.b(iE, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return g.equalsSetHelper(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = g.this.d() - 1; iD >= 0; iD--) {
                Object objB = g.this.b(iD, 0);
                Object objB2 = g.this.b(iD, 1);
                iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<Object, Object>> iterator() {
            return g.this.new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Map.Entry<Object, Object> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<Object> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return g.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return g.containsAllHelper(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return g.equalsSetHelper(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = g.this.d() - 1; iD >= 0; iD--) {
                Object objB = g.this.b(iD, 0);
                iHashCode += objB == null ? 0 : objB.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return g.this.new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iE = g.this.e(obj);
            if (iE < 0) {
                return false;
            }
            g.this.h(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return g.removeAllHelper(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return g.retainAllHelper(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return g.this.toArrayHelper(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.toArrayHelper(tArr, 0);
        }
    }

    final class d implements Iterator, Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        int f3382a;

        /* renamed from: c, reason: collision with root package name */
        boolean f3384c = false;

        /* renamed from: b, reason: collision with root package name */
        int f3383b = -1;

        d() {
            this.f3382a = g.this.d() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f3384c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return O.d.equal(entry.getKey(), g.this.b(this.f3383b, 0)) && O.d.equal(entry.getValue(), g.this.b(this.f3383b, 1));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f3384c) {
                return g.this.b(this.f3383b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f3384c) {
                return g.this.b(this.f3383b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3383b < this.f3382a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f3384c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objB = g.this.b(this.f3383b, 0);
            Object objB2 = g.this.b(this.f3383b, 1);
            return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3384c) {
                throw new IllegalStateException();
            }
            g.this.h(this.f3383b);
            this.f3383b--;
            this.f3382a--;
            this.f3384c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f3384c) {
                return g.this.i(this.f3383b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + SimpleComparison.EQUAL_TO_OPERATION + getValue();
        }

        @Override // java.util.Iterator
        public Map.Entry<Object, Object> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f3383b++;
            this.f3384c = true;
            return this;
        }
    }

    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<Object> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return g.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return g.this.new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iF = g.this.f(obj);
            if (iF < 0) {
                return false;
            }
            g.this.h(iF);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iD = g.this.d();
            int i8 = 0;
            boolean z8 = false;
            while (i8 < iD) {
                if (collection.contains(g.this.b(i8, 1))) {
                    g.this.h(i8);
                    i8--;
                    iD--;
                    z8 = true;
                }
                i8++;
            }
            return z8;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iD = g.this.d();
            int i8 = 0;
            boolean z8 = false;
            while (i8 < iD) {
                if (!collection.contains(g.this.b(i8, 1))) {
                    g.this.h(i8);
                    i8--;
                    iD--;
                    z8 = true;
                }
                i8++;
            }
            return z8;
        }

        @Override // java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return g.this.toArrayHelper(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.toArrayHelper(tArr, 1);
        }
    }

    g() {
    }

    public static <K, V> boolean containsAllHelper(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean equalsSetHelper(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean removeAllHelper(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean retainAllHelper(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int i8, int i9);

    protected abstract Map c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(Object obj, Object obj2);

    public Set<Map.Entry<Object, Object>> getEntrySet() {
        if (this.f3372a == null) {
            this.f3372a = new b();
        }
        return this.f3372a;
    }

    public Set<Object> getKeySet() {
        if (this.f3373b == null) {
            this.f3373b = new c();
        }
        return this.f3373b;
    }

    public Collection<Object> getValues() {
        if (this.f3374c == null) {
            this.f3374c = new e();
        }
        return this.f3374c;
    }

    protected abstract void h(int i8);

    protected abstract Object i(int i8, Object obj);

    public Object[] toArrayHelper(int i8) {
        int iD = d();
        Object[] objArr = new Object[iD];
        for (int i9 = 0; i9 < iD; i9++) {
            objArr[i9] = b(i9, i8);
        }
        return objArr;
    }

    public <T> T[] toArrayHelper(T[] tArr, int i8) {
        int iD = d();
        if (tArr.length < iD) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iD));
        }
        for (int i9 = 0; i9 < iD; i9++) {
            tArr[i9] = b(i9, i8);
        }
        if (tArr.length > iD) {
            tArr[iD] = null;
        }
        return tArr;
    }
}
