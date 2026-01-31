package f3;

import f3.AbstractC5469j0;
import f3.AbstractC5477n0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: f3.r0 */
/* loaded from: classes2.dex */
public class C5485r0 extends AbstractC5477n0 implements g1 {

    /* renamed from: h */
    private final transient AbstractC5483q0 f31082h;

    /* renamed from: i */
    private transient C5485r0 f31083i;

    /* renamed from: j */
    private transient AbstractC5483q0 f31084j;

    /* renamed from: f3.r0$a */
    public static final class a extends AbstractC5477n0.c {
        @Override // f3.AbstractC5477n0.c
        Collection a() {
            return V0.c();
        }

        @Override // f3.AbstractC5477n0.c
        public /* bridge */ /* synthetic */ AbstractC5477n0.c orderKeysBy(Comparator comparator) {
            return orderKeysBy((Comparator<Object>) comparator);
        }

        @Override // f3.AbstractC5477n0.c
        public /* bridge */ /* synthetic */ AbstractC5477n0.c orderValuesBy(Comparator comparator) {
            return orderValuesBy((Comparator<Object>) comparator);
        }

        @Override // f3.AbstractC5477n0.c
        public C5485r0 build() {
            Collection collectionEntrySet = this.f31026a.entrySet();
            Comparator comparator = this.f31027b;
            if (comparator != null) {
                collectionEntrySet = T0.from(comparator).a().immutableSortedCopy(collectionEntrySet);
            }
            return C5485r0.p(collectionEntrySet, this.f31028c);
        }

        @Override // f3.AbstractC5477n0.c
        public a orderKeysBy(Comparator<Object> comparator) {
            super.orderKeysBy(comparator);
            return this;
        }

        @Override // f3.AbstractC5477n0.c
        public a orderValuesBy(Comparator<Object> comparator) {
            super.orderValuesBy(comparator);
            return this;
        }

        @Override // f3.AbstractC5477n0.c
        public /* bridge */ /* synthetic */ AbstractC5477n0.c put(Map.Entry entry) {
            return put((Map.Entry<Object, Object>) entry);
        }

        @Override // f3.AbstractC5477n0.c
        public /* bridge */ /* synthetic */ AbstractC5477n0.c putAll(Iterable iterable) {
            return putAll((Iterable<? extends Map.Entry<Object, Object>>) iterable);
        }

        @Override // f3.AbstractC5477n0.c
        public a put(Object obj, Object obj2) {
            super.put(obj, obj2);
            return this;
        }

        @Override // f3.AbstractC5477n0.c
        public /* bridge */ /* synthetic */ AbstractC5477n0.c putAll(Object obj, Iterable iterable) {
            return putAll(obj, (Iterable<Object>) iterable);
        }

        @Override // f3.AbstractC5477n0.c
        public a put(Map.Entry<Object, Object> entry) {
            super.put(entry);
            return this;
        }

        @Override // f3.AbstractC5477n0.c
        public a putAll(Iterable<? extends Map.Entry<Object, Object>> iterable) {
            super.putAll(iterable);
            return this;
        }

        @Override // f3.AbstractC5477n0.c
        public a putAll(Object obj, Iterable<Object> iterable) {
            super.putAll(obj, iterable);
            return this;
        }

        @Override // f3.AbstractC5477n0.c
        public a putAll(Object obj, Object... objArr) {
            return putAll(obj, (Iterable<Object>) Arrays.asList(objArr));
        }

        @Override // f3.AbstractC5477n0.c
        public a putAll(F0 f02) {
            for (Map.Entry<Object, Collection<Object>> entry : f02.asMap().entrySet()) {
                putAll(entry.getKey(), (Iterable<Object>) entry.getValue());
            }
            return this;
        }
    }

    /* renamed from: f3.r0$b */
    private static final class b extends AbstractC5483q0 {

        /* renamed from: c */
        private final transient C5485r0 f31085c;

        b(C5485r0 c5485r0) {
            this.f31085c = c5485r0;
        }

        @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f31085c.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // f3.AbstractC5457d0
        boolean isPartialView() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f31085c.size();
        }

        @Override // f3.AbstractC5483q0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public t1 iterator() {
            return this.f31085c.f();
        }
    }

    C5485r0(AbstractC5469j0 abstractC5469j0, int i8, Comparator comparator) {
        super(abstractC5469j0, i8);
        this.f31082h = o(comparator);
    }

    public static <K, V> a builder() {
        return new a();
    }

    public static <K, V> C5485r0 copyOf(F0 f02) {
        return n(f02, null);
    }

    private static C5485r0 n(F0 f02, Comparator comparator) {
        e3.w.checkNotNull(f02);
        if (f02.isEmpty() && comparator == null) {
            return of();
        }
        if (f02 instanceof C5485r0) {
            C5485r0 c5485r0 = (C5485r0) f02;
            if (!c5485r0.l()) {
                return c5485r0;
            }
        }
        return p(f02.asMap().entrySet(), comparator);
    }

    private static AbstractC5483q0 o(Comparator comparator) {
        return comparator == null ? AbstractC5483q0.of() : AbstractC5487s0.n(comparator);
    }

    public static <K, V> C5485r0 of() {
        return C5410C.f30613k;
    }

    static C5485r0 p(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        AbstractC5469j0.b bVar = new AbstractC5469j0.b(collection.size());
        Iterator it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AbstractC5483q0 abstractC5483q0R = r(comparator, (Collection) entry.getValue());
            if (!abstractC5483q0R.isEmpty()) {
                bVar.put(key, abstractC5483q0R);
                size += abstractC5483q0R.size();
            }
        }
        return new C5485r0(bVar.buildOrThrow(), size, comparator);
    }

    private C5485r0 q() {
        a aVarBuilder = builder();
        t1 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVarBuilder.put(entry.getValue(), entry.getKey());
        }
        C5485r0 c5485r0Build = aVarBuilder.build();
        c5485r0Build.f31083i = this;
        return c5485r0Build;
    }

    private static AbstractC5483q0 r(Comparator comparator, Collection collection) {
        return comparator == null ? AbstractC5483q0.copyOf(collection) : AbstractC5487s0.copyOf(comparator, collection);
    }

    @Override // f3.AbstractC5477n0, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    @Deprecated
    public /* bridge */ /* synthetic */ AbstractC5457d0 replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    public static <K, V> C5485r0 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().putAll((Iterable<? extends Map.Entry<Object, Object>>) iterable).build();
    }

    public static <K, V> C5485r0 of(K k8, V v8) {
        a aVarBuilder = builder();
        aVarBuilder.put((Object) k8, (Object) v8);
        return aVarBuilder.build();
    }

    @Override // f3.AbstractC5477n0
    public C5485r0 inverse() {
        C5485r0 c5485r0 = this.f31083i;
        if (c5485r0 != null) {
            return c5485r0;
        }
        C5485r0 c5485r0Q = q();
        this.f31083i = c5485r0Q;
        return c5485r0Q;
    }

    @Override // f3.AbstractC5477n0, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    @Deprecated
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // f3.AbstractC5477n0, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    @Deprecated
    public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // f3.AbstractC5477n0, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public AbstractC5483q0 entries() {
        AbstractC5483q0 abstractC5483q0 = this.f31084j;
        if (abstractC5483q0 != null) {
            return abstractC5483q0;
        }
        b bVar = new b(this);
        this.f31084j = bVar;
        return bVar;
    }

    @Override // f3.AbstractC5477n0, f3.AbstractC5474m, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public AbstractC5483q0 get(Object obj) {
        return (AbstractC5483q0) e3.p.firstNonNull((AbstractC5483q0) this.f31017f.get(obj), this.f31082h);
    }

    @Override // f3.AbstractC5477n0, f3.AbstractC5474m, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    @Deprecated
    public final AbstractC5483q0 removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // f3.AbstractC5477n0, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    @Deprecated
    public final AbstractC5483q0 replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> C5485r0 of(K k8, V v8, K k9, V v9) {
        a aVarBuilder = builder();
        aVarBuilder.put((Object) k8, (Object) v8);
        aVarBuilder.put((Object) k9, (Object) v9);
        return aVarBuilder.build();
    }

    public static <K, V> C5485r0 of(K k8, V v8, K k9, V v9, K k10, V v10) {
        a aVarBuilder = builder();
        aVarBuilder.put((Object) k8, (Object) v8);
        aVarBuilder.put((Object) k9, (Object) v9);
        aVarBuilder.put((Object) k10, (Object) v10);
        return aVarBuilder.build();
    }

    public static <K, V> C5485r0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11) {
        a aVarBuilder = builder();
        aVarBuilder.put((Object) k8, (Object) v8);
        aVarBuilder.put((Object) k9, (Object) v9);
        aVarBuilder.put((Object) k10, (Object) v10);
        aVarBuilder.put((Object) k11, (Object) v11);
        return aVarBuilder.build();
    }

    public static <K, V> C5485r0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12) {
        a aVarBuilder = builder();
        aVarBuilder.put((Object) k8, (Object) v8);
        aVarBuilder.put((Object) k9, (Object) v9);
        aVarBuilder.put((Object) k10, (Object) v10);
        aVarBuilder.put((Object) k11, (Object) v11);
        aVarBuilder.put((Object) k12, (Object) v12);
        return aVarBuilder.build();
    }
}
