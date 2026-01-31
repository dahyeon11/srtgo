package com.google.protobuf;

import com.google.protobuf.W;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.protobuf.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5231m1 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private final int f26578a;

    /* renamed from: b, reason: collision with root package name */
    private List f26579b;

    /* renamed from: c, reason: collision with root package name */
    private Map f26580c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26581d;

    /* renamed from: e, reason: collision with root package name */
    private volatile g f26582e;

    /* renamed from: f, reason: collision with root package name */
    private Map f26583f;

    /* renamed from: g, reason: collision with root package name */
    private volatile c f26584g;

    /* renamed from: com.google.protobuf.m1$a */
    class a extends AbstractC5231m1 {
        a(int i8) {
            super(i8, null);
        }

        @Override // com.google.protobuf.AbstractC5231m1
        public void makeImmutable() {
            if (!isImmutable()) {
                for (int i8 = 0; i8 < getNumArrayEntries(); i8++) {
                    Map.Entry<Comparable<Object>, Object> arrayEntryAt = getArrayEntryAt(i8);
                    if (((W.c) arrayEntryAt.getKey()).isRepeated()) {
                        arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                    }
                }
                for (Map.Entry<Comparable<Object>, Object> entry : getOverflowEntries()) {
                    if (((W.c) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.makeImmutable();
        }
    }

    /* renamed from: com.google.protobuf.m1$b */
    private class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private int f26585a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator f26586b;

        private b() {
            this.f26585a = AbstractC5231m1.this.f26579b.size();
        }

        private Iterator a() {
            if (this.f26586b == null) {
                this.f26586b = AbstractC5231m1.this.f26583f.entrySet().iterator();
            }
            return this.f26586b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i8 = this.f26585a;
            return (i8 > 0 && i8 <= AbstractC5231m1.this.f26579b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public Map.Entry<Comparable<Object>, Object> next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = AbstractC5231m1.this.f26579b;
            int i8 = this.f26585a - 1;
            this.f26585a = i8;
            return (Map.Entry) list.get(i8);
        }

        /* synthetic */ b(AbstractC5231m1 abstractC5231m1, a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.m1$c */
    private class c extends g {
        private c() {
            super(AbstractC5231m1.this, null);
        }

        @Override // com.google.protobuf.AbstractC5231m1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Comparable<Object>, Object>> iterator() {
            return new b(AbstractC5231m1.this, null);
        }

        /* synthetic */ c(AbstractC5231m1 abstractC5231m1, a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.m1$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator f26589a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable f26590b = new b();

        /* renamed from: com.google.protobuf.m1$d$a */
        class a implements Iterator {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.google.protobuf.m1$d$b */
        class b implements Iterable {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f26589a;
            }
        }

        static Iterable b() {
            return f26590b;
        }
    }

    /* renamed from: com.google.protobuf.m1$e */
    private class e implements Map.Entry, Comparable {

        /* renamed from: a, reason: collision with root package name */
        private final Comparable f26591a;

        /* renamed from: b, reason: collision with root package name */
        private Object f26592b;

        e(AbstractC5231m1 abstractC5231m1, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean a(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a(this.f26591a, entry.getKey()) && a(this.f26592b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f26592b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f26591a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f26592b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            AbstractC5231m1.this.g();
            Object obj2 = this.f26592b;
            this.f26592b = obj;
            return obj2;
        }

        public String toString() {
            return this.f26591a + SimpleComparison.EQUAL_TO_OPERATION + this.f26592b;
        }

        e(Comparable comparable, Object obj) {
            this.f26591a = comparable;
            this.f26592b = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(com.google.protobuf.m1.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public Comparable<Object> getKey() {
            return this.f26591a;
        }
    }

    /* renamed from: com.google.protobuf.m1$f */
    private class f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private int f26594a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f26595b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator f26596c;

        private f() {
            this.f26594a = -1;
        }

        private Iterator a() {
            if (this.f26596c == null) {
                this.f26596c = AbstractC5231m1.this.f26580c.entrySet().iterator();
            }
            return this.f26596c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f26594a + 1 >= AbstractC5231m1.this.f26579b.size()) {
                return !AbstractC5231m1.this.f26580c.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f26595b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f26595b = false;
            AbstractC5231m1.this.g();
            if (this.f26594a >= AbstractC5231m1.this.f26579b.size()) {
                a().remove();
                return;
            }
            AbstractC5231m1 abstractC5231m1 = AbstractC5231m1.this;
            int i8 = this.f26594a;
            this.f26594a = i8 - 1;
            abstractC5231m1.l(i8);
        }

        @Override // java.util.Iterator
        public Map.Entry<Comparable<Object>, Object> next() {
            this.f26595b = true;
            int i8 = this.f26594a + 1;
            this.f26594a = i8;
            return i8 < AbstractC5231m1.this.f26579b.size() ? (Map.Entry) AbstractC5231m1.this.f26579b.get(this.f26594a) : (Map.Entry) a().next();
        }

        /* synthetic */ f(AbstractC5231m1 abstractC5231m1, a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.m1$g */
    private class g extends AbstractSet {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC5231m1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = AbstractC5231m1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Comparable<Object>, Object>> iterator() {
            return new f(AbstractC5231m1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            AbstractC5231m1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC5231m1.this.size();
        }

        /* synthetic */ g(AbstractC5231m1 abstractC5231m1, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<Comparable<Object>, Object> entry) {
            if (contains(entry)) {
                return false;
            }
            AbstractC5231m1.this.put(entry.getKey(), entry.getValue());
            return true;
        }
    }

    /* synthetic */ AbstractC5231m1(int i8, a aVar) {
        this(i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int f(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f26579b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f26579b
            java.lang.Object r2 = r2.get(r1)
            com.google.protobuf.m1$e r2 = (com.google.protobuf.AbstractC5231m1.e) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f26579b
            java.lang.Object r3 = r3.get(r2)
            com.google.protobuf.m1$e r3 = (com.google.protobuf.AbstractC5231m1.e) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC5231m1.f(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f26581d) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f26579b.isEmpty() || (this.f26579b instanceof ArrayList)) {
            return;
        }
        this.f26579b = new ArrayList(this.f26578a);
    }

    private SortedMap j() {
        g();
        if (this.f26580c.isEmpty() && !(this.f26580c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f26580c = treeMap;
            this.f26583f = treeMap.descendingMap();
        }
        return (SortedMap) this.f26580c;
    }

    static AbstractC5231m1 k(int i8) {
        return new a(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object l(int i8) {
        g();
        Object value = ((e) this.f26579b.remove(i8)).getValue();
        if (!this.f26580c.isEmpty()) {
            Iterator it = j().entrySet().iterator();
            this.f26579b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f26579b.isEmpty()) {
            this.f26579b.clear();
        }
        if (this.f26580c.isEmpty()) {
            return;
        }
        this.f26580c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f26580c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Comparable<Object>, Object>> entrySet() {
        if (this.f26582e == null) {
            this.f26582e = new g(this, null);
        }
        return this.f26582e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5231m1)) {
            return super.equals(obj);
        }
        AbstractC5231m1 abstractC5231m1 = (AbstractC5231m1) obj;
        int size = size();
        if (size != abstractC5231m1.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != abstractC5231m1.getNumArrayEntries()) {
            return entrySet().equals(abstractC5231m1.entrySet());
        }
        for (int i8 = 0; i8 < numArrayEntries; i8++) {
            if (!getArrayEntryAt(i8).equals(abstractC5231m1.getArrayEntryAt(i8))) {
                return false;
            }
        }
        if (numArrayEntries != size) {
            return this.f26580c.equals(abstractC5231m1.f26580c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((e) this.f26579b.get(iF)).getValue() : this.f26580c.get(comparable);
    }

    public Map.Entry<Comparable<Object>, Object> getArrayEntryAt(int i8) {
        return (Map.Entry) this.f26579b.get(i8);
    }

    public int getNumArrayEntries() {
        return this.f26579b.size();
    }

    public int getNumOverflowEntries() {
        return this.f26580c.size();
    }

    public Iterable<Map.Entry<Comparable<Object>, Object>> getOverflowEntries() {
        return this.f26580c.isEmpty() ? d.b() : this.f26580c.entrySet();
    }

    Set h() {
        if (this.f26584g == null) {
            this.f26584g = new c(this, null);
        }
        return this.f26584g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int iHashCode = 0;
        for (int i8 = 0; i8 < numArrayEntries; i8++) {
            iHashCode += ((e) this.f26579b.get(i8)).hashCode();
        }
        return getNumOverflowEntries() > 0 ? iHashCode + this.f26580c.hashCode() : iHashCode;
    }

    public boolean isImmutable() {
        return this.f26581d;
    }

    public void makeImmutable() {
        if (this.f26581d) {
            return;
        }
        this.f26580c = this.f26580c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f26580c);
        this.f26583f = this.f26583f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f26583f);
        this.f26581d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return l(iF);
        }
        if (this.f26580c.isEmpty()) {
            return null;
        }
        return this.f26580c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f26579b.size() + this.f26580c.size();
    }

    private AbstractC5231m1(int i8) {
        this.f26578a = i8;
        this.f26579b = Collections.emptyList();
        this.f26580c = Collections.emptyMap();
        this.f26583f = Collections.emptyMap();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Comparable<Object> comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((e) this.f26579b.get(iF)).setValue(obj);
        }
        i();
        int i8 = -(iF + 1);
        if (i8 >= this.f26578a) {
            return j().put(comparable, obj);
        }
        int size = this.f26579b.size();
        int i9 = this.f26578a;
        if (size == i9) {
            e eVar = (e) this.f26579b.remove(i9 - 1);
            j().put(eVar.getKey(), eVar.getValue());
        }
        this.f26579b.add(i8, new e(comparable, obj));
        return null;
    }
}
