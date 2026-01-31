package f3;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: f3.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC5501z0 extends F0 {
    Map<Object, Collection<Object>> asMap();

    @Override // f3.F0, f3.InterfaceC5439K
    /* synthetic */ void clear();

    @Override // f3.F0, f3.g1
    /* synthetic */ boolean containsEntry(Object obj, Object obj2);

    @Override // f3.F0, f3.InterfaceC5439K
    /* synthetic */ boolean containsKey(Object obj);

    @Override // f3.F0, f3.g1
    /* synthetic */ boolean containsValue(Object obj);

    @Override // f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    /* synthetic */ Collection entries();

    @Override // f3.F0
    boolean equals(Object obj);

    @Override // f3.F0, f3.InterfaceC5439K
    List<Object> get(Object obj);

    @Override // f3.F0
    /* synthetic */ boolean isEmpty();

    @Override // f3.F0
    /* synthetic */ Set keySet();

    @Override // f3.F0
    /* synthetic */ K0 keys();

    @Override // f3.F0, f3.g1
    /* synthetic */ boolean put(Object obj, Object obj2);

    @Override // f3.F0, f3.g1
    /* synthetic */ boolean putAll(F0 f02);

    @Override // f3.F0, f3.g1
    /* synthetic */ boolean putAll(Object obj, Iterable iterable);

    @Override // f3.F0, f3.g1
    /* synthetic */ boolean remove(Object obj, Object obj2);

    @Override // f3.F0, f3.InterfaceC5439K
    List<Object> removeAll(Object obj);

    @Override // f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    /* bridge */ /* synthetic */ default Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    List<Object> replaceValues(Object obj, Iterable<Object> iterable);

    @Override // f3.F0, f3.InterfaceC5439K
    /* synthetic */ int size();

    @Override // f3.F0
    /* synthetic */ Collection values();
}
