package f3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: f3.U, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5448U extends X implements F0 {
    protected AbstractC5448U() {
    }

    public Map<Object, Collection<Object>> asMap() {
        return delegate().asMap();
    }

    public void clear() {
        delegate().clear();
    }

    @Override // f3.F0, f3.g1
    public boolean containsEntry(Object obj, Object obj2) {
        return delegate().containsEntry(obj, obj2);
    }

    @Override // f3.F0, f3.InterfaceC5439K
    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // f3.F0, f3.g1
    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // f3.X
    protected abstract F0 delegate();

    public Collection<Map.Entry<Object, Object>> entries() {
        return delegate().entries();
    }

    @Override // f3.F0
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public Collection<Object> get(Object obj) {
        return delegate().get(obj);
    }

    @Override // f3.F0
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // f3.F0
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<Object> keySet() {
        return delegate().keySet();
    }

    public K0 keys() {
        return delegate().keys();
    }

    public boolean put(Object obj, Object obj2) {
        return delegate().put(obj, obj2);
    }

    public boolean putAll(Object obj, Iterable<Object> iterable) {
        return delegate().putAll(obj, iterable);
    }

    public boolean remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    public Collection<Object> removeAll(Object obj) {
        return delegate().removeAll(obj);
    }

    public Collection<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        return delegate().replaceValues(obj, iterable);
    }

    @Override // f3.F0, f3.InterfaceC5439K
    public int size() {
        return delegate().size();
    }

    public Collection<Object> values() {
        return delegate().values();
    }

    public boolean putAll(F0 f02) {
        return delegate().putAll(f02);
    }
}
