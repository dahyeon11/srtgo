package f3;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5454c extends AbstractC5456d implements InterfaceC5501z0 {
    protected AbstractC5454c(Map map) {
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

    @Override // f3.AbstractC5456d
    Collection w(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // f3.AbstractC5456d
    Collection x(Object obj, Collection collection) {
        return y(obj, (List) collection, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f3.AbstractC5456d
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public List s() {
        return Collections.emptyList();
    }

    @Override // f3.AbstractC5456d, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public List<Object> get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // f3.AbstractC5456d, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public List<Object> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // f3.AbstractC5456d, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public List<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        return (List) super.replaceValues(obj, iterable);
    }
}
