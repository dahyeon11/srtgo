package f3;

import com.j256.ormlite.stmt.query.SimpleComparison;
import f3.AbstractC5457d0;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: f3.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5469j0 implements Map, Serializable {

    /* renamed from: e, reason: collision with root package name */
    static final Map.Entry[] f30993e = new Map.Entry[0];

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC5483q0 f30994a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC5483q0 f30995b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC5457d0 f30996c;

    /* renamed from: d, reason: collision with root package name */
    private transient C5485r0 f30997d;

    /* renamed from: f3.j0$a */
    class a extends t1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t1 f30998a;

        a(AbstractC5469j0 abstractC5469j0, t1 t1Var) {
            this.f30998a = t1Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30998a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return ((Map.Entry) this.f30998a.next()).getKey();
        }
    }

    /* renamed from: f3.j0$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        Comparator f30999a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f31000b;

        /* renamed from: c, reason: collision with root package name */
        int f31001c;

        /* renamed from: d, reason: collision with root package name */
        boolean f31002d;

        /* renamed from: e, reason: collision with root package name */
        a f31003e;

        /* renamed from: f3.j0$b$a */
        static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f31004a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f31005b;

            /* renamed from: c, reason: collision with root package name */
            private final Object f31006c;

            a(Object obj, Object obj2, Object obj3) {
                this.f31004a = obj;
                this.f31005b = obj2;
                this.f31006c = obj3;
            }

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f31004a + SimpleComparison.EQUAL_TO_OPERATION + this.f31005b + " and " + this.f31004a + SimpleComparison.EQUAL_TO_OPERATION + this.f31006c);
            }
        }

        public b() {
            this(4);
        }

        private AbstractC5469j0 a(boolean z8) {
            Object[] objArrC;
            a aVar;
            a aVar2;
            if (z8 && (aVar2 = this.f31003e) != null) {
                throw aVar2.a();
            }
            int length = this.f31001c;
            if (this.f30999a == null) {
                objArrC = this.f31000b;
            } else {
                if (this.f31002d) {
                    this.f31000b = Arrays.copyOf(this.f31000b, length * 2);
                }
                objArrC = this.f31000b;
                if (!z8) {
                    objArrC = c(objArrC, this.f31001c);
                    if (objArrC.length < this.f31000b.length) {
                        length = objArrC.length >>> 1;
                    }
                }
                d(objArrC, length, this.f30999a);
            }
            this.f31002d = true;
            a1 a1VarH = a1.h(length, objArrC, this);
            if (!z8 || (aVar = this.f31003e) == null) {
                return a1VarH;
            }
            throw aVar.a();
        }

        private void b(int i8) {
            int i9 = i8 * 2;
            Object[] objArr = this.f31000b;
            if (i9 > objArr.length) {
                this.f31000b = Arrays.copyOf(objArr, AbstractC5457d0.b.a(objArr.length, i9));
                this.f31002d = false;
            }
        }

        private Object[] c(Object[] objArr, int i8) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i9 = i8 - 1; i9 >= 0; i9--) {
                Object obj = objArr[i9 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i9);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i8 - bitSet.cardinality()) * 2];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8 * 2) {
                if (bitSet.get(i10 >>> 1)) {
                    i10 += 2;
                } else {
                    int i12 = i11 + 1;
                    int i13 = i10 + 1;
                    Object obj2 = objArr[i10];
                    Objects.requireNonNull(obj2);
                    objArr2[i11] = obj2;
                    i11 += 2;
                    i10 += 2;
                    Object obj3 = objArr[i13];
                    Objects.requireNonNull(obj3);
                    objArr2[i12] = obj3;
                }
            }
            return objArr2;
        }

        static void d(Object[] objArr, int i8, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = i9 * 2;
                Object obj = objArr[i10];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i10 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i9] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i8, T0.from(comparator).onResultOf(E0.N()));
            for (int i11 = 0; i11 < i8; i11++) {
                int i12 = i11 * 2;
                objArr[i12] = entryArr[i11].getKey();
                objArr[i12 + 1] = entryArr[i11].getValue();
            }
        }

        public AbstractC5469j0 build() {
            return buildOrThrow();
        }

        public AbstractC5469j0 buildKeepingLast() {
            return a(false);
        }

        public AbstractC5469j0 buildOrThrow() {
            return a(true);
        }

        public b orderEntriesByValue(Comparator<Object> comparator) {
            e3.w.checkState(this.f30999a == null, "valueComparator was already set");
            this.f30999a = (Comparator) e3.w.checkNotNull(comparator, "valueComparator");
            return this;
        }

        public b put(Object obj, Object obj2) {
            b(this.f31001c + 1);
            AbstractC5484r.a(obj, obj2);
            Object[] objArr = this.f31000b;
            int i8 = this.f31001c;
            objArr[i8 * 2] = obj;
            objArr[(i8 * 2) + 1] = obj2;
            this.f31001c = i8 + 1;
            return this;
        }

        public b putAll(Map<Object, Object> map) {
            return putAll(map.entrySet());
        }

        b(int i8) {
            this.f31000b = new Object[i8 * 2];
            this.f31001c = 0;
            this.f31002d = false;
        }

        public b putAll(Iterable<? extends Map.Entry<Object, Object>> iterable) {
            if (iterable instanceof Collection) {
                b(this.f31001c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<Object, Object>> it = iterable.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        public b put(Map.Entry<Object, Object> entry) {
            return put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: f3.j0$c */
    static abstract class c extends AbstractC5469j0 {

        /* renamed from: f3.j0$c$a */
        class a extends AbstractC5471k0 {
            a() {
            }

            @Override // f3.AbstractC5471k0
            AbstractC5469j0 l() {
                return c.this;
            }

            @Override // f3.AbstractC5483q0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public t1 iterator() {
                return c.this.g();
            }
        }

        c() {
        }

        @Override // f3.AbstractC5469j0
        AbstractC5483q0 a() {
            return new a();
        }

        @Override // f3.AbstractC5469j0
        AbstractC5483q0 b() {
            return new C5473l0(this);
        }

        @Override // f3.AbstractC5469j0
        AbstractC5457d0 c() {
            return new C5475m0(this);
        }

        @Override // f3.AbstractC5469j0, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        abstract t1 g();

        @Override // f3.AbstractC5469j0, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // f3.AbstractC5469j0, java.util.Map, f3.InterfaceC5476n
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* renamed from: f3.j0$d */
    private final class d extends c {

        /* renamed from: f3.j0$d$a */
        class a extends t1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Iterator f31009a;

            /* renamed from: f3.j0$d$a$a, reason: collision with other inner class name */
            class C0298a extends AbstractC5460f {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Map.Entry f31010a;

                C0298a(a aVar, Map.Entry entry) {
                    this.f31010a = entry;
                }

                @Override // f3.AbstractC5460f, java.util.Map.Entry
                public Object getKey() {
                    return this.f31010a.getKey();
                }

                @Override // f3.AbstractC5460f, java.util.Map.Entry
                public AbstractC5483q0 getValue() {
                    return AbstractC5483q0.of(this.f31010a.getValue());
                }
            }

            a(d dVar, Iterator it) {
                this.f31009a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f31009a.hasNext();
            }

            @Override // java.util.Iterator
            public Map.Entry<Object, AbstractC5483q0> next() {
                return new C0298a(this, (Map.Entry) this.f31009a.next());
            }
        }

        private d() {
        }

        @Override // f3.AbstractC5469j0.c, f3.AbstractC5469j0
        AbstractC5483q0 b() {
            return AbstractC5469j0.this.keySet();
        }

        @Override // f3.AbstractC5469j0, java.util.Map
        public boolean containsKey(Object obj) {
            return AbstractC5469j0.this.containsKey(obj);
        }

        @Override // f3.AbstractC5469j0
        boolean d() {
            return AbstractC5469j0.this.d();
        }

        @Override // f3.AbstractC5469j0
        boolean e() {
            return AbstractC5469j0.this.e();
        }

        @Override // f3.AbstractC5469j0.c
        t1 g() {
            return new a(this, AbstractC5469j0.this.entrySet().iterator());
        }

        @Override // f3.AbstractC5469j0, java.util.Map
        public int hashCode() {
            return AbstractC5469j0.this.hashCode();
        }

        @Override // java.util.Map
        public int size() {
            return AbstractC5469j0.this.size();
        }

        /* synthetic */ d(AbstractC5469j0 abstractC5469j0, a aVar) {
            this();
        }

        @Override // f3.AbstractC5469j0, java.util.Map
        public AbstractC5483q0 get(Object obj) {
            Object obj2 = AbstractC5469j0.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return AbstractC5483q0.of(obj2);
        }
    }

    AbstractC5469j0() {
    }

    public static <K, V> b builder() {
        return new b();
    }

    public static <K, V> b builderWithExpectedSize(int i8) {
        AbstractC5484r.b(i8, "expectedSize");
        return new b(i8);
    }

    public static <K, V> AbstractC5469j0 copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC5469j0) && !(map instanceof SortedMap)) {
            AbstractC5469j0 abstractC5469j0 = (AbstractC5469j0) map;
            if (!abstractC5469j0.e()) {
                return abstractC5469j0;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> AbstractC5469j0 of() {
        return a1.f30856i;
    }

    @SafeVarargs
    public static <K, V> AbstractC5469j0 ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    abstract AbstractC5483q0 a();

    public C5485r0 asMultimap() {
        if (isEmpty()) {
            return C5485r0.of();
        }
        C5485r0 c5485r0 = this.f30997d;
        if (c5485r0 != null) {
            return c5485r0;
        }
        C5485r0 c5485r02 = new C5485r0(new d(this, null), size(), null);
        this.f30997d = c5485r02;
        return c5485r02;
    }

    abstract AbstractC5483q0 b();

    abstract AbstractC5457d0 c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    boolean d() {
        return false;
    }

    abstract boolean e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return E0.n(this, obj);
    }

    t1 f() {
        return new a(this, entrySet().iterator());
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return h1.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<Object, Object> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return E0.F(this);
    }

    public static <K, V> AbstractC5469j0 of(K k8, V v8) {
        AbstractC5484r.a(k8, v8);
        return a1.g(1, new Object[]{k8, v8});
    }

    @Override // java.util.Map
    public AbstractC5483q0 entrySet() {
        AbstractC5483q0 abstractC5483q0 = this.f30994a;
        if (abstractC5483q0 != null) {
            return abstractC5483q0;
        }
        AbstractC5483q0 abstractC5483q0A = a();
        this.f30994a = abstractC5483q0A;
        return abstractC5483q0A;
    }

    @Override // java.util.Map
    public AbstractC5483q0 keySet() {
        AbstractC5483q0 abstractC5483q0 = this.f30995b;
        if (abstractC5483q0 != null) {
            return abstractC5483q0;
        }
        AbstractC5483q0 abstractC5483q0B = b();
        this.f30995b = abstractC5483q0B;
        return abstractC5483q0B;
    }

    @Override // java.util.Map, f3.InterfaceC5476n
    public AbstractC5457d0 values() {
        AbstractC5457d0 abstractC5457d0 = this.f30996c;
        if (abstractC5457d0 != null) {
            return abstractC5457d0;
        }
        AbstractC5457d0 abstractC5457d0C = c();
        this.f30996c = abstractC5457d0C;
        return abstractC5457d0C;
    }

    public static <K, V> AbstractC5469j0 of(K k8, V v8, K k9, V v9) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        return a1.g(2, new Object[]{k8, v8, k9, v9});
    }

    public static <K, V> AbstractC5469j0 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        b bVar = new b(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        bVar.putAll(iterable);
        return bVar.build();
    }

    public static <K, V> AbstractC5469j0 of(K k8, V v8, K k9, V v9, K k10, V v10) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        return a1.g(3, new Object[]{k8, v8, k9, v9, k10, v10});
    }

    public static <K, V> AbstractC5469j0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        AbstractC5484r.a(k11, v11);
        return a1.g(4, new Object[]{k8, v8, k9, v9, k10, v10, k11, v11});
    }

    public static <K, V> AbstractC5469j0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        AbstractC5484r.a(k11, v11);
        AbstractC5484r.a(k12, v12);
        return a1.g(5, new Object[]{k8, v8, k9, v9, k10, v10, k11, v11, k12, v12});
    }

    public static <K, V> AbstractC5469j0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        AbstractC5484r.a(k11, v11);
        AbstractC5484r.a(k12, v12);
        AbstractC5484r.a(k13, v13);
        return a1.g(6, new Object[]{k8, v8, k9, v9, k10, v10, k11, v11, k12, v12, k13, v13});
    }

    public static <K, V> AbstractC5469j0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        AbstractC5484r.a(k11, v11);
        AbstractC5484r.a(k12, v12);
        AbstractC5484r.a(k13, v13);
        AbstractC5484r.a(k14, v14);
        return a1.g(7, new Object[]{k8, v8, k9, v9, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14});
    }

    public static <K, V> AbstractC5469j0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        AbstractC5484r.a(k11, v11);
        AbstractC5484r.a(k12, v12);
        AbstractC5484r.a(k13, v13);
        AbstractC5484r.a(k14, v14);
        AbstractC5484r.a(k15, v15);
        return a1.g(8, new Object[]{k8, v8, k9, v9, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15});
    }

    public static <K, V> AbstractC5469j0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        AbstractC5484r.a(k11, v11);
        AbstractC5484r.a(k12, v12);
        AbstractC5484r.a(k13, v13);
        AbstractC5484r.a(k14, v14);
        AbstractC5484r.a(k15, v15);
        AbstractC5484r.a(k16, v16);
        return a1.g(9, new Object[]{k8, v8, k9, v9, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16});
    }

    public static <K, V> AbstractC5469j0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        AbstractC5484r.a(k11, v11);
        AbstractC5484r.a(k12, v12);
        AbstractC5484r.a(k13, v13);
        AbstractC5484r.a(k14, v14);
        AbstractC5484r.a(k15, v15);
        AbstractC5484r.a(k16, v16);
        AbstractC5484r.a(k17, v17);
        return a1.g(10, new Object[]{k8, v8, k9, v9, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17});
    }
}
