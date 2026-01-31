package f3;

import f3.C5415E;
import f3.E0;
import f3.H0;
import f3.K0;
import f3.L0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: f3.E, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5415E extends AbstractC5462g implements InterfaceC5439K {

    /* renamed from: f, reason: collision with root package name */
    final F0 f30672f;

    /* renamed from: g, reason: collision with root package name */
    final e3.x f30673g;

    /* renamed from: f3.E$a */
    class a extends E0.R {

        /* renamed from: f3.E$a$a, reason: collision with other inner class name */
        class C0284a extends E0.s {

            /* renamed from: f3.E$a$a$a, reason: collision with other inner class name */
            class C0285a extends AbstractC5452b {

                /* renamed from: c, reason: collision with root package name */
                final Iterator f30676c;

                C0285a() {
                    this.f30676c = C5415E.this.f30672f.asMap().entrySet().iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // f3.AbstractC5452b
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public Map.Entry computeNext() {
                    while (this.f30676c.hasNext()) {
                        Map.Entry entry = (Map.Entry) this.f30676c.next();
                        Object key = entry.getKey();
                        Collection collectionI = C5415E.i((Collection) entry.getValue(), C5415E.this.new c(key));
                        if (!collectionI.isEmpty()) {
                            return E0.immutableEntry(key, collectionI);
                        }
                    }
                    return (Map.Entry) a();
                }
            }

            C0284a() {
            }

            @Override // f3.E0.s
            Map a() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<Object, Collection<Object>>> iterator() {
                return new C0285a();
            }

            @Override // f3.E0.s, f3.h1.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return C5415E.this.j(e3.y.in(collection));
            }

            @Override // f3.E0.s, f3.h1.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return C5415E.this.j(e3.y.not(e3.y.in(collection)));
            }

            @Override // f3.E0.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return AbstractC5495w0.size(iterator());
            }
        }

        /* renamed from: f3.E$a$b */
        class b extends E0.B {
            b() {
                super(a.this);
            }

            @Override // f3.E0.B, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                return a.this.remove(obj) != null;
            }

            @Override // f3.h1.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return C5415E.this.j(E0.w(e3.y.in(collection)));
            }

            @Override // f3.h1.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return C5415E.this.j(E0.w(e3.y.not(e3.y.in(collection))));
            }
        }

        /* renamed from: f3.E$a$c */
        class c extends E0.Q {
            c() {
                super(a.this);
            }

            @Override // f3.E0.Q, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                if (!(obj instanceof Collection)) {
                    return false;
                }
                Collection collection = (Collection) obj;
                Iterator<Map.Entry<Object, Collection<Object>>> it = C5415E.this.f30672f.asMap().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Object, Collection<Object>> next = it.next();
                    Collection collectionI = C5415E.i(next.getValue(), C5415E.this.new c(next.getKey()));
                    if (!collectionI.isEmpty() && collection.equals(collectionI)) {
                        if (collectionI.size() == next.getValue().size()) {
                            it.remove();
                            return true;
                        }
                        collectionI.clear();
                        return true;
                    }
                }
                return false;
            }

            @Override // f3.E0.Q, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return C5415E.this.j(E0.P(e3.y.in(collection)));
            }

            @Override // f3.E0.Q, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return C5415E.this.j(E0.P(e3.y.not(e3.y.in(collection))));
            }
        }

        a() {
        }

        @Override // f3.E0.R
        Set a() {
            return new C0284a();
        }

        @Override // f3.E0.R
        Collection b() {
            return new c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            C5415E.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // f3.E0.R
        /* renamed from: createKeySet */
        Set d() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<Object> get(Object obj) {
            Collection<Object> collection = C5415E.this.f30672f.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            Collection<Object> collectionI = C5415E.i(collection, C5415E.this.new c(obj));
            if (collectionI.isEmpty()) {
                return null;
            }
            return collectionI;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<Object> remove(Object obj) {
            Collection<Object> collection = C5415E.this.f30672f.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList arrayListNewArrayList = A0.newArrayList();
            Iterator<Object> it = collection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (C5415E.this.k(obj, next)) {
                    it.remove();
                    arrayListNewArrayList.add(next);
                }
            }
            if (arrayListNewArrayList.isEmpty()) {
                return null;
            }
            return C5415E.this.f30672f instanceof g1 ? Collections.unmodifiableSet(h1.newLinkedHashSet(arrayListNewArrayList)) : Collections.unmodifiableList(arrayListNewArrayList);
        }
    }

    /* renamed from: f3.E$b */
    class b extends H0.g {

        /* renamed from: f3.E$b$a */
        class a extends L0.h {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ boolean c(e3.x xVar, Map.Entry entry) {
                return xVar.apply(L0.immutableEntry(entry.getKey(), ((Collection) entry.getValue()).size()));
            }

            private boolean d(final e3.x xVar) {
                return C5415E.this.j(new e3.x() { // from class: f3.F
                    @Override // e3.x
                    public final boolean apply(Object obj) {
                        return C5415E.b.a.c(xVar, (Map.Entry) obj);
                    }
                });
            }

            @Override // f3.L0.h
            K0 a() {
                return b.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<K0.a> iterator() {
                return b.this.e();
            }

            @Override // f3.h1.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return d(e3.y.in(collection));
            }

            @Override // f3.h1.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return d(e3.y.not(e3.y.in(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return C5415E.this.keySet().size();
            }
        }

        b() {
            super(C5415E.this);
        }

        @Override // f3.AbstractC5464h, f3.K0
        public Set<K0.a> entrySet() {
            return new a();
        }

        @Override // f3.H0.g, f3.AbstractC5464h, f3.K0
        public int remove(Object obj, int i8) {
            AbstractC5484r.b(i8, "occurrences");
            if (i8 == 0) {
                return count(obj);
            }
            Collection<Object> collection = C5415E.this.f30672f.asMap().get(obj);
            int i9 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator<Object> it = collection.iterator();
            while (it.hasNext()) {
                if (C5415E.this.k(obj, it.next()) && (i9 = i9 + 1) <= i8) {
                    it.remove();
                }
            }
            return i9;
        }
    }

    /* renamed from: f3.E$c */
    final class c implements e3.x {

        /* renamed from: a, reason: collision with root package name */
        private final Object f30682a;

        c(Object obj) {
            this.f30682a = obj;
        }

        @Override // e3.x
        public boolean apply(Object obj) {
            return C5415E.this.k(this.f30682a, obj);
        }
    }

    C5415E(F0 f02, e3.x xVar) {
        this.f30672f = (F0) e3.w.checkNotNull(f02);
        this.f30673g = (e3.x) e3.w.checkNotNull(xVar);
    }

    static Collection i(Collection collection, e3.x xVar) {
        return collection instanceof Set ? h1.filter((Set) collection, xVar) : AbstractC5486s.filter(collection, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k(Object obj, Object obj2) {
        return this.f30673g.apply(E0.immutableEntry(obj, obj2));
    }

    @Override // f3.AbstractC5462g
    Map a() {
        return new a();
    }

    @Override // f3.AbstractC5462g
    Collection b() {
        return i(this.f30672f.entries(), this.f30673g);
    }

    @Override // f3.AbstractC5462g
    Set c() {
        return asMap().keySet();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public void clear() {
        entries().clear();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public boolean containsKey(Object obj) {
        return asMap().get(obj) != null;
    }

    @Override // f3.AbstractC5462g
    K0 d() {
        return new b();
    }

    @Override // f3.AbstractC5462g
    Collection e() {
        return new C5440L(this);
    }

    @Override // f3.InterfaceC5439K
    public e3.x entryPredicate() {
        return this.f30673g;
    }

    @Override // f3.AbstractC5462g
    Iterator f() {
        throw new AssertionError("should never be called");
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public Collection<Object> get(Object obj) {
        return i(this.f30672f.get(obj), new c(obj));
    }

    boolean j(e3.x xVar) {
        Iterator<Map.Entry<Object, Collection<Object>>> it = this.f30672f.asMap().entrySet().iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            Map.Entry<Object, Collection<Object>> next = it.next();
            Object key = next.getKey();
            Collection collectionI = i(next.getValue(), new c(key));
            if (!collectionI.isEmpty() && xVar.apply(E0.immutableEntry(key, collectionI))) {
                if (collectionI.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    collectionI.clear();
                }
                z8 = true;
            }
        }
        return z8;
    }

    Collection l() {
        return this.f30672f instanceof g1 ? Collections.emptySet() : Collections.emptyList();
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public Collection<Object> removeAll(Object obj) {
        return (Collection) e3.p.firstNonNull(asMap().remove(obj), l());
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public int size() {
        return entries().size();
    }

    @Override // f3.InterfaceC5439K
    public F0 unfiltered() {
        return this.f30672f;
    }
}
