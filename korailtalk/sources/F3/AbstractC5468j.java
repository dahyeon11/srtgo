package f3;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: f3.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5468j extends AbstractC5456d implements g1 {
    protected AbstractC5468j(Map map) {
        super(map);
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5501z0
    public Map<Object, Collection<Object>> asMap() {
        return super.asMap();
    }

    @Override // f3.AbstractC5462g, f3.F0
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // f3.AbstractC5456d, f3.AbstractC5462g, f3.F0, f3.g1
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // f3.AbstractC5456d, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f3.AbstractC5456d
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Set s() {
        return Collections.emptySet();
    }

    @Override // f3.AbstractC5456d, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public Set<Map.Entry<Object, Object>> entries() {
        return (Set) super.entries();
    }

    @Override // f3.AbstractC5456d, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public Set<Object> get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // f3.AbstractC5456d, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public Set<Object> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // f3.AbstractC5456d, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public Set<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        return (Set) super.replaceValues(obj, iterable);
    }
}
