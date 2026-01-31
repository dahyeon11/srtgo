package f3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public interface g1 extends F0 {
    @Override // f3.F0, f3.InterfaceC5501z0
    Map<Object, Collection<Object>> asMap();

    @Override // f3.F0, f3.InterfaceC5439K
    /* synthetic */ void clear();

    /* synthetic */ boolean containsEntry(Object obj, Object obj2);

    @Override // f3.F0, f3.InterfaceC5439K
    /* synthetic */ boolean containsKey(Object obj);

    /* synthetic */ boolean containsValue(Object obj);

    @Override // 
    Set<Map.Entry<Object, Object>> entries();

    @Override // f3.F0
    boolean equals(Object obj);

    @Override // f3.F0, f3.InterfaceC5439K
    Set<Object> get(Object obj);

    @Override // f3.F0
    /* synthetic */ boolean isEmpty();

    @Override // f3.F0
    /* synthetic */ Set keySet();

    @Override // f3.F0
    /* synthetic */ K0 keys();

    /* synthetic */ boolean put(Object obj, Object obj2);

    /* synthetic */ boolean putAll(F0 f02);

    /* synthetic */ boolean putAll(Object obj, Iterable iterable);

    /* synthetic */ boolean remove(Object obj, Object obj2);

    @Override // f3.F0, f3.InterfaceC5439K
    Set<Object> removeAll(Object obj);

    /* bridge */ /* synthetic */ default Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    Set<Object> replaceValues(Object obj, Iterable<Object> iterable);

    @Override // f3.F0, f3.InterfaceC5439K
    /* synthetic */ int size();

    @Override // f3.F0
    /* synthetic */ Collection values();
}
