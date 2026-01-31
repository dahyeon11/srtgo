package f3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: f3.K, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
interface InterfaceC5439K extends F0 {
    @Override // f3.F0, f3.InterfaceC5501z0
    /* synthetic */ Map asMap();

    /* synthetic */ void clear();

    @Override // f3.F0, f3.g1
    /* synthetic */ boolean containsEntry(Object obj, Object obj2);

    /* synthetic */ boolean containsKey(Object obj);

    @Override // f3.F0, f3.g1
    /* synthetic */ boolean containsValue(Object obj);

    /* synthetic */ Collection entries();

    e3.x entryPredicate();

    /* synthetic */ Collection get(Object obj);

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

    /* synthetic */ Collection removeAll(Object obj);

    /* synthetic */ Collection replaceValues(Object obj, Iterable iterable);

    /* synthetic */ int size();

    F0 unfiltered();

    @Override // f3.F0
    /* synthetic */ Collection values();
}
