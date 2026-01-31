package f3;

import f3.AbstractC5469j0;
import f3.AbstractC5477n0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: f3.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5467i0 extends AbstractC5477n0 implements InterfaceC5501z0 {

    /* renamed from: h, reason: collision with root package name */
    private transient C5467i0 f30991h;

    /* renamed from: f3.i0$a */
    public static final class a extends AbstractC5477n0.c {
        @Override // f3.AbstractC5477n0.c
        public /* bridge */ /* synthetic */ AbstractC5477n0.c orderKeysBy(Comparator comparator) {
            return orderKeysBy((Comparator<Object>) comparator);
        }

        @Override // f3.AbstractC5477n0.c
        public /* bridge */ /* synthetic */ AbstractC5477n0.c orderValuesBy(Comparator comparator) {
            return orderValuesBy((Comparator<Object>) comparator);
        }

        @Override // f3.AbstractC5477n0.c
        public C5467i0 build() {
            return (C5467i0) super.build();
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
            super.putAll(obj, objArr);
            return this;
        }

        @Override // f3.AbstractC5477n0.c
        public a putAll(F0 f02) {
            super.putAll(f02);
            return this;
        }
    }

    C5467i0(AbstractC5469j0 abstractC5469j0, int i8) {
        super(abstractC5469j0, i8);
    }

    public static <K, V> a builder() {
        return new a();
    }

    public static <K, V> C5467i0 copyOf(F0 f02) {
        if (f02.isEmpty()) {
            return of();
        }
        if (f02 instanceof C5467i0) {
            C5467i0 c5467i0 = (C5467i0) f02;
            if (!c5467i0.l()) {
                return c5467i0;
            }
        }
        return n(f02.asMap().entrySet(), null);
    }

    static C5467i0 n(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        AbstractC5469j0.b bVar = new AbstractC5469j0.b(collection.size());
        Iterator it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            AbstractC5465h0 abstractC5465h0CopyOf = comparator == null ? AbstractC5465h0.copyOf(collection2) : AbstractC5465h0.sortedCopyOf(comparator, collection2);
            if (!abstractC5465h0CopyOf.isEmpty()) {
                bVar.put(key, abstractC5465h0CopyOf);
                size += abstractC5465h0CopyOf.size();
            }
        }
        return new C5467i0(bVar.buildOrThrow(), size);
    }

    private C5467i0 o() {
        a aVarBuilder = builder();
        t1 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVarBuilder.put(entry.getValue(), entry.getKey());
        }
        C5467i0 c5467i0Build = aVarBuilder.build();
        c5467i0Build.f30991h = this;
        return c5467i0Build;
    }

    public static <K, V> C5467i0 of() {
        return C5409B.f30612i;
    }

    @Override // f3.AbstractC5477n0, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    @Deprecated
    public /* bridge */ /* synthetic */ AbstractC5457d0 replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    public static <K, V> C5467i0 of(K k8, V v8) {
        a aVarBuilder = builder();
        aVarBuilder.put((Object) k8, (Object) v8);
        return aVarBuilder.build();
    }

    @Override // f3.AbstractC5477n0
    public C5467i0 inverse() {
        C5467i0 c5467i0 = this.f30991h;
        if (c5467i0 != null) {
            return c5467i0;
        }
        C5467i0 c5467i0O = o();
        this.f30991h = c5467i0O;
        return c5467i0O;
    }

    @Override // f3.AbstractC5477n0, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    @Deprecated
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // f3.AbstractC5477n0, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    @Deprecated
    public /* bridge */ /* synthetic */ List replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // f3.AbstractC5477n0, f3.AbstractC5474m, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public AbstractC5465h0 get(Object obj) {
        AbstractC5465h0 abstractC5465h0 = (AbstractC5465h0) this.f31017f.get(obj);
        return abstractC5465h0 == null ? AbstractC5465h0.of() : abstractC5465h0;
    }

    @Override // f3.AbstractC5477n0, f3.AbstractC5474m, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    @Deprecated
    public final AbstractC5465h0 removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // f3.AbstractC5477n0, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    @Deprecated
    public final AbstractC5465h0 replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> C5467i0 of(K k8, V v8, K k9, V v9) {
        a aVarBuilder = builder();
        aVarBuilder.put((Object) k8, (Object) v8);
        aVarBuilder.put((Object) k9, (Object) v9);
        return aVarBuilder.build();
    }

    public static <K, V> C5467i0 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().putAll((Iterable<? extends Map.Entry<Object, Object>>) iterable).build();
    }

    public static <K, V> C5467i0 of(K k8, V v8, K k9, V v9, K k10, V v10) {
        a aVarBuilder = builder();
        aVarBuilder.put((Object) k8, (Object) v8);
        aVarBuilder.put((Object) k9, (Object) v9);
        aVarBuilder.put((Object) k10, (Object) v10);
        return aVarBuilder.build();
    }

    public static <K, V> C5467i0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11) {
        a aVarBuilder = builder();
        aVarBuilder.put((Object) k8, (Object) v8);
        aVarBuilder.put((Object) k9, (Object) v9);
        aVarBuilder.put((Object) k10, (Object) v10);
        aVarBuilder.put((Object) k11, (Object) v11);
        return aVarBuilder.build();
    }

    public static <K, V> C5467i0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12) {
        a aVarBuilder = builder();
        aVarBuilder.put((Object) k8, (Object) v8);
        aVarBuilder.put((Object) k9, (Object) v9);
        aVarBuilder.put((Object) k10, (Object) v10);
        aVarBuilder.put((Object) k11, (Object) v11);
        aVarBuilder.put((Object) k12, (Object) v12);
        return aVarBuilder.build();
    }
}
