package f3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: f3.M, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
interface InterfaceC5441M extends InterfaceC5439K, g1 {
    @Override // f3.InterfaceC5439K, f3.F0, f3.InterfaceC5501z0
    /* synthetic */ Map asMap();

    @Override // f3.InterfaceC5439K
    /* synthetic */ void clear();

    @Override // f3.InterfaceC5439K, f3.F0, f3.g1
    /* synthetic */ boolean containsEntry(Object obj, Object obj2);

    @Override // f3.InterfaceC5439K
    /* synthetic */ boolean containsKey(Object obj);

    @Override // f3.InterfaceC5439K, f3.F0, f3.g1
    /* synthetic */ boolean containsValue(Object obj);

    @Override // f3.g1
    /* bridge */ /* synthetic */ default Collection entries() {
        return super.entries();
    }

    @Override // f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    /* synthetic */ Set entries();

    @Override // f3.InterfaceC5439K
    /* synthetic */ e3.x entryPredicate();

    @Override // f3.InterfaceC5439K
    /* bridge */ /* synthetic */ default Collection get(Object obj) {
        return super.get(obj);
    }

    @Override // f3.InterfaceC5439K
    /* synthetic */ Set get(Object obj);

    @Override // f3.InterfaceC5439K, f3.F0
    /* synthetic */ boolean isEmpty();

    @Override // f3.InterfaceC5439K, f3.F0
    /* synthetic */ Set keySet();

    @Override // f3.InterfaceC5439K, f3.F0
    /* synthetic */ K0 keys();

    @Override // f3.InterfaceC5439K, f3.F0, f3.g1
    /* synthetic */ boolean put(Object obj, Object obj2);

    @Override // f3.InterfaceC5439K, f3.F0, f3.g1
    /* synthetic */ boolean putAll(F0 f02);

    @Override // f3.InterfaceC5439K, f3.F0, f3.g1
    /* synthetic */ boolean putAll(Object obj, Iterable iterable);

    @Override // f3.InterfaceC5439K, f3.F0, f3.g1
    /* synthetic */ boolean remove(Object obj, Object obj2);

    @Override // f3.InterfaceC5439K
    /* bridge */ /* synthetic */ default Collection removeAll(Object obj) {
        return super.removeAll(obj);
    }

    @Override // f3.InterfaceC5439K
    /* synthetic */ Set removeAll(Object obj);

    @Override // f3.g1
    /* bridge */ /* synthetic */ default Collection replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    @Override // f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    /* synthetic */ Set replaceValues(Object obj, Iterable iterable);

    @Override // f3.InterfaceC5439K
    /* synthetic */ int size();

    @Override // f3.InterfaceC5439K
    g1 unfiltered();

    @Override // f3.InterfaceC5439K, f3.F0
    /* synthetic */ Collection values();
}
