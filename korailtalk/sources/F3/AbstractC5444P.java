package f3;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: f3.P, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5444P extends X implements Collection {
    protected AbstractC5444P() {
    }

    protected abstract Collection a();

    public boolean add(Object obj) {
        return a().add(obj);
    }

    public boolean addAll(Collection<Object> collection) {
        return a().addAll(collection);
    }

    protected Object[] b() {
        return toArray(new Object[size()]);
    }

    protected Object[] c(Object[] objArr) {
        return Q0.f(this, objArr);
    }

    public void clear() {
        a().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return a().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return a().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return a().isEmpty();
    }

    public Iterator<Object> iterator() {
        return a().iterator();
    }

    public boolean remove(Object obj) {
        return a().remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return a().removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return a().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return a().size();
    }

    public Object[] toArray() {
        return a().toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return (T[]) a().toArray(tArr);
    }
}
