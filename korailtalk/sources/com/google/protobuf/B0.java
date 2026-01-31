package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class B0 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f26107a;

    /* renamed from: b, reason: collision with root package name */
    private volatile d f26108b;

    /* renamed from: c, reason: collision with root package name */
    private c f26109c;

    /* renamed from: d, reason: collision with root package name */
    private List f26110d;

    /* renamed from: e, reason: collision with root package name */
    private final a f26111e;

    private interface a {
        H0 convertKeyAndValueToMessage(Object obj, Object obj2);

        void convertMessageToKeyAndValue(H0 h02, Map<Object, Object> map);

        H0 getMessageDefaultInstance();
    }

    private static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final C5274z0 f26112a;

        public b(C5274z0 c5274z0) {
            this.f26112a = c5274z0;
        }

        @Override // com.google.protobuf.B0.a
        public H0 convertKeyAndValueToMessage(Object obj, Object obj2) {
            return this.f26112a.newBuilderForType().setKey(obj).setValue(obj2).buildPartial();
        }

        @Override // com.google.protobuf.B0.a
        public void convertMessageToKeyAndValue(H0 h02, Map<Object, Object> map) {
            C5274z0 c5274z0 = (C5274z0) h02;
            map.put(c5274z0.getKey(), c5274z0.getValue());
        }

        @Override // com.google.protobuf.B0.a
        public H0 getMessageDefaultInstance() {
            return this.f26112a;
        }
    }

    private static class c implements Map {

        /* renamed from: a, reason: collision with root package name */
        private final R0 f26113a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f26114b;

        private static class a implements Collection {

            /* renamed from: a, reason: collision with root package name */
            private final R0 f26115a;

            /* renamed from: b, reason: collision with root package name */
            private final Collection f26116b;

            a(R0 r02, Collection collection) {
                this.f26115a = r02;
                this.f26116b = collection;
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
                this.f26115a.ensureMutable();
                this.f26116b.clear();
            }

            @Override // java.util.Collection
            public boolean contains(Object obj) {
                return this.f26116b.contains(obj);
            }

            @Override // java.util.Collection
            public boolean containsAll(Collection<?> collection) {
                return this.f26116b.containsAll(collection);
            }

            @Override // java.util.Collection
            public boolean equals(Object obj) {
                return this.f26116b.equals(obj);
            }

            @Override // java.util.Collection
            public int hashCode() {
                return this.f26116b.hashCode();
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return this.f26116b.isEmpty();
            }

            @Override // java.util.Collection, java.lang.Iterable
            public Iterator<Object> iterator() {
                return new b(this.f26115a, this.f26116b.iterator());
            }

            @Override // java.util.Collection
            public boolean remove(Object obj) {
                this.f26115a.ensureMutable();
                return this.f26116b.remove(obj);
            }

            @Override // java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                this.f26115a.ensureMutable();
                return this.f26116b.removeAll(collection);
            }

            @Override // java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                this.f26115a.ensureMutable();
                return this.f26116b.retainAll(collection);
            }

            @Override // java.util.Collection
            public int size() {
                return this.f26116b.size();
            }

            @Override // java.util.Collection
            public Object[] toArray() {
                return this.f26116b.toArray();
            }

            public String toString() {
                return this.f26116b.toString();
            }

            @Override // java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) this.f26116b.toArray(tArr);
            }
        }

        private static class b implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            private final R0 f26117a;

            /* renamed from: b, reason: collision with root package name */
            private final Iterator f26118b;

            b(R0 r02, Iterator it) {
                this.f26117a = r02;
                this.f26118b = it;
            }

            public boolean equals(Object obj) {
                return this.f26118b.equals(obj);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f26118b.hasNext();
            }

            public int hashCode() {
                return this.f26118b.hashCode();
            }

            @Override // java.util.Iterator
            public Object next() {
                return this.f26118b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f26117a.ensureMutable();
                this.f26118b.remove();
            }

            public String toString() {
                return this.f26118b.toString();
            }
        }

        /* renamed from: com.google.protobuf.B0$c$c, reason: collision with other inner class name */
        private static class C0216c implements Set {

            /* renamed from: a, reason: collision with root package name */
            private final R0 f26119a;

            /* renamed from: b, reason: collision with root package name */
            private final Set f26120b;

            C0216c(R0 r02, Set set) {
                this.f26119a = r02;
                this.f26120b = set;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(Object obj) {
                this.f26119a.ensureMutable();
                return this.f26120b.add(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<Object> collection) {
                this.f26119a.ensureMutable();
                return this.f26120b.addAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                this.f26119a.ensureMutable();
                this.f26120b.clear();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object obj) {
                return this.f26120b.contains(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(Collection<?> collection) {
                return this.f26120b.containsAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean equals(Object obj) {
                return this.f26120b.equals(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public int hashCode() {
                return this.f26120b.hashCode();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f26120b.isEmpty();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public Iterator<Object> iterator() {
                return new b(this.f26119a, this.f26120b.iterator());
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                this.f26119a.ensureMutable();
                return this.f26120b.remove(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                this.f26119a.ensureMutable();
                return this.f26120b.removeAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                this.f26119a.ensureMutable();
                return this.f26120b.retainAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public int size() {
                return this.f26120b.size();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return this.f26120b.toArray();
            }

            public String toString() {
                return this.f26120b.toString();
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) this.f26120b.toArray(tArr);
            }
        }

        c(R0 r02, Map map) {
            this.f26113a = r02;
            this.f26114b = map;
        }

        @Override // java.util.Map
        public void clear() {
            this.f26113a.ensureMutable();
            this.f26114b.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.f26114b.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.f26114b.containsValue(obj);
        }

        @Override // java.util.Map
        public Set<Map.Entry<Object, Object>> entrySet() {
            return new C0216c(this.f26113a, this.f26114b.entrySet());
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return this.f26114b.equals(obj);
        }

        @Override // java.util.Map
        public Object get(Object obj) {
            return this.f26114b.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.f26114b.hashCode();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f26114b.isEmpty();
        }

        @Override // java.util.Map
        public Set<Object> keySet() {
            return new C0216c(this.f26113a, this.f26114b.keySet());
        }

        @Override // java.util.Map
        public Object put(Object obj, Object obj2) {
            this.f26113a.ensureMutable();
            AbstractC5227l0.a(obj);
            AbstractC5227l0.a(obj2);
            return this.f26114b.put(obj, obj2);
        }

        @Override // java.util.Map
        public void putAll(Map<Object, Object> map) {
            this.f26113a.ensureMutable();
            for (Object obj : map.keySet()) {
                AbstractC5227l0.a(obj);
                AbstractC5227l0.a(map.get(obj));
            }
            this.f26114b.putAll(map);
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            this.f26113a.ensureMutable();
            return this.f26114b.remove(obj);
        }

        @Override // java.util.Map
        public int size() {
            return this.f26114b.size();
        }

        public String toString() {
            return this.f26114b.toString();
        }

        @Override // java.util.Map
        public Collection<Object> values() {
            return new a(this.f26113a, this.f26114b.values());
        }
    }

    private enum d {
        MAP,
        LIST,
        BOTH
    }

    private B0(a aVar, d dVar, Map map) {
        this.f26111e = aVar;
        this.f26107a = true;
        this.f26108b = dVar;
        this.f26109c = new c(this, map);
        this.f26110d = null;
    }

    private H0 a(Object obj, Object obj2) {
        return this.f26111e.convertKeyAndValueToMessage(obj, obj2);
    }

    private c b(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d((H0) it.next(), linkedHashMap);
        }
        return new c(this, linkedHashMap);
    }

    private List c(c cVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Object, Object> entry : cVar.entrySet()) {
            arrayList.add(a(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private void d(H0 h02, Map map) {
        this.f26111e.convertMessageToKeyAndValue(h02, map);
    }

    public static <K, V> B0 emptyMapField(C5274z0 c5274z0) {
        return new B0(c5274z0, d.MAP, Collections.emptyMap());
    }

    public static <K, V> B0 newMapField(C5274z0 c5274z0) {
        return new B0(c5274z0, d.MAP, new LinkedHashMap());
    }

    public void clear() {
        this.f26109c = new c(this, new LinkedHashMap());
        this.f26108b = d.MAP;
    }

    public B0 copy() {
        return new B0(this.f26111e, d.MAP, C0.e(getMap()));
    }

    List e() {
        d dVar = this.f26108b;
        d dVar2 = d.MAP;
        if (dVar == dVar2) {
            synchronized (this) {
                try {
                    if (this.f26108b == dVar2) {
                        this.f26110d = c(this.f26109c);
                        this.f26108b = d.BOTH;
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableList(this.f26110d);
    }

    @Override // com.google.protobuf.R0
    public void ensureMutable() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof B0) {
            return C0.h(getMap(), ((B0) obj).getMap());
        }
        return false;
    }

    H0 f() {
        return this.f26111e.getMessageDefaultInstance();
    }

    List g() {
        d dVar = this.f26108b;
        d dVar2 = d.LIST;
        if (dVar != dVar2) {
            if (this.f26108b == d.MAP) {
                this.f26110d = c(this.f26109c);
            }
            this.f26109c = null;
            this.f26108b = dVar2;
        }
        return this.f26110d;
    }

    public Map<Object, Object> getMap() {
        d dVar = this.f26108b;
        d dVar2 = d.LIST;
        if (dVar == dVar2) {
            synchronized (this) {
                try {
                    if (this.f26108b == dVar2) {
                        this.f26109c = b(this.f26110d);
                        this.f26108b = d.BOTH;
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableMap(this.f26109c);
    }

    public Map<Object, Object> getMutableMap() {
        d dVar = this.f26108b;
        d dVar2 = d.MAP;
        if (dVar != dVar2) {
            if (this.f26108b == d.LIST) {
                this.f26109c = b(this.f26110d);
            }
            this.f26110d = null;
            this.f26108b = dVar2;
        }
        return this.f26109c;
    }

    public int hashCode() {
        return C0.a(getMap());
    }

    public boolean isMutable() {
        return this.f26107a;
    }

    public void makeImmutable() {
        this.f26107a = false;
    }

    public void mergeFrom(B0 b02) {
        getMutableMap().putAll(C0.e(b02.getMap()));
    }

    private B0(C5274z0 c5274z0, d dVar, Map map) {
        this(new b(c5274z0), dVar, map);
    }
}
