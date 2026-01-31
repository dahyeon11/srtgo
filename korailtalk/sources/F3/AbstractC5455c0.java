package f3;

import f3.AbstractC5469j0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* renamed from: f3.c0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5455c0 extends AbstractC5469j0 implements InterfaceC5476n {

    /* renamed from: f3.c0$a */
    public static final class a extends AbstractC5469j0.b {
        public a() {
        }

        @Override // f3.AbstractC5469j0.b
        public /* bridge */ /* synthetic */ AbstractC5469j0.b orderEntriesByValue(Comparator comparator) {
            return orderEntriesByValue((Comparator<Object>) comparator);
        }

        @Override // f3.AbstractC5469j0.b
        public /* bridge */ /* synthetic */ AbstractC5469j0.b putAll(Iterable iterable) {
            return putAll((Iterable<? extends Map.Entry<Object, Object>>) iterable);
        }

        a(int i8) {
            super(i8);
        }

        @Override // f3.AbstractC5469j0.b
        public AbstractC5455c0 build() {
            return buildOrThrow();
        }

        @Override // f3.AbstractC5469j0.b
        @Deprecated
        public AbstractC5455c0 buildKeepingLast() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // f3.AbstractC5469j0.b
        public AbstractC5455c0 buildOrThrow() {
            int i8 = this.f31001c;
            if (i8 == 0) {
                return AbstractC5455c0.of();
            }
            if (this.f30999a != null) {
                if (this.f31002d) {
                    this.f31000b = Arrays.copyOf(this.f31000b, i8 * 2);
                }
                AbstractC5469j0.b.d(this.f31000b, this.f31001c, this.f30999a);
            }
            this.f31002d = true;
            return new Y0(this.f31000b, this.f31001c);
        }

        @Override // f3.AbstractC5469j0.b
        public a orderEntriesByValue(Comparator<Object> comparator) {
            super.orderEntriesByValue(comparator);
            return this;
        }

        @Override // f3.AbstractC5469j0.b
        public /* bridge */ /* synthetic */ AbstractC5469j0.b put(Map.Entry entry) {
            return put((Map.Entry<Object, Object>) entry);
        }

        @Override // f3.AbstractC5469j0.b
        public /* bridge */ /* synthetic */ AbstractC5469j0.b putAll(Map map) {
            return putAll((Map<Object, Object>) map);
        }

        @Override // f3.AbstractC5469j0.b
        public a put(Object obj, Object obj2) {
            super.put(obj, obj2);
            return this;
        }

        @Override // f3.AbstractC5469j0.b
        public a putAll(Map<Object, Object> map) {
            super.putAll(map);
            return this;
        }

        @Override // f3.AbstractC5469j0.b
        public a put(Map.Entry<Object, Object> entry) {
            super.put(entry);
            return this;
        }

        @Override // f3.AbstractC5469j0.b
        public a putAll(Iterable<? extends Map.Entry<Object, Object>> iterable) {
            super.putAll(iterable);
            return this;
        }
    }

    AbstractC5455c0() {
    }

    public static <K, V> a builder() {
        return new a();
    }

    public static <K, V> a builderWithExpectedSize(int i8) {
        AbstractC5484r.b(i8, "expectedSize");
        return new a(i8);
    }

    public static <K, V> AbstractC5455c0 copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof AbstractC5455c0) {
            AbstractC5455c0 abstractC5455c0 = (AbstractC5455c0) map;
            if (!abstractC5455c0.e()) {
                return abstractC5455c0;
            }
        }
        return copyOf((Iterable) map.entrySet());
    }

    public static <K, V> AbstractC5455c0 of() {
        return Y0.f30845k;
    }

    @SafeVarargs
    public static <K, V> AbstractC5455c0 ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf((Iterable) Arrays.asList(entryArr));
    }

    @Override // f3.InterfaceC5476n
    @Deprecated
    public final Object forcePut(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // f3.AbstractC5469j0
    /* renamed from: g */
    public final AbstractC5483q0 c() {
        throw new AssertionError("should never be called");
    }

    @Override // f3.InterfaceC5476n
    public abstract AbstractC5455c0 inverse();

    public static <K, V> AbstractC5455c0 of(K k8, V v8) {
        AbstractC5484r.a(k8, v8);
        return new Y0(new Object[]{k8, v8}, 1);
    }

    public static <K, V> AbstractC5455c0 of(K k8, V v8, K k9, V v9) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        return new Y0(new Object[]{k8, v8, k9, v9}, 2);
    }

    @Override // f3.AbstractC5469j0, java.util.Map, f3.InterfaceC5476n
    public AbstractC5483q0 values() {
        return inverse().keySet();
    }

    public static <K, V> AbstractC5455c0 copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4).putAll((Iterable<? extends Map.Entry<Object, Object>>) iterable).build();
    }

    public static <K, V> AbstractC5455c0 of(K k8, V v8, K k9, V v9, K k10, V v10) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        return new Y0(new Object[]{k8, v8, k9, v9, k10, v10}, 3);
    }

    public static <K, V> AbstractC5455c0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        AbstractC5484r.a(k11, v11);
        return new Y0(new Object[]{k8, v8, k9, v9, k10, v10, k11, v11}, 4);
    }

    public static <K, V> AbstractC5455c0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        AbstractC5484r.a(k11, v11);
        AbstractC5484r.a(k12, v12);
        return new Y0(new Object[]{k8, v8, k9, v9, k10, v10, k11, v11, k12, v12}, 5);
    }

    public static <K, V> AbstractC5455c0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        AbstractC5484r.a(k11, v11);
        AbstractC5484r.a(k12, v12);
        AbstractC5484r.a(k13, v13);
        return new Y0(new Object[]{k8, v8, k9, v9, k10, v10, k11, v11, k12, v12, k13, v13}, 6);
    }

    public static <K, V> AbstractC5455c0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        AbstractC5484r.a(k11, v11);
        AbstractC5484r.a(k12, v12);
        AbstractC5484r.a(k13, v13);
        AbstractC5484r.a(k14, v14);
        return new Y0(new Object[]{k8, v8, k9, v9, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14}, 7);
    }

    public static <K, V> AbstractC5455c0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        AbstractC5484r.a(k11, v11);
        AbstractC5484r.a(k12, v12);
        AbstractC5484r.a(k13, v13);
        AbstractC5484r.a(k14, v14);
        AbstractC5484r.a(k15, v15);
        return new Y0(new Object[]{k8, v8, k9, v9, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15}, 8);
    }

    public static <K, V> AbstractC5455c0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        AbstractC5484r.a(k8, v8);
        AbstractC5484r.a(k9, v9);
        AbstractC5484r.a(k10, v10);
        AbstractC5484r.a(k11, v11);
        AbstractC5484r.a(k12, v12);
        AbstractC5484r.a(k13, v13);
        AbstractC5484r.a(k14, v14);
        AbstractC5484r.a(k15, v15);
        AbstractC5484r.a(k16, v16);
        return new Y0(new Object[]{k8, v8, k9, v9, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16}, 9);
    }

    public static <K, V> AbstractC5455c0 of(K k8, V v8, K k9, V v9, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
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
        return new Y0(new Object[]{k8, v8, k9, v9, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17}, 10);
    }
}
