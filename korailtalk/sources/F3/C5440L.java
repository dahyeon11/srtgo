package f3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: f3.L */
/* loaded from: classes2.dex */
final class C5440L extends AbstractCollection {

    /* renamed from: a */
    private final InterfaceC5439K f30777a;

    C5440L(InterfaceC5439K interfaceC5439K) {
        this.f30777a = (InterfaceC5439K) e3.w.checkNotNull(interfaceC5439K);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f30777a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f30777a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return E0.O(this.f30777a.entries().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        e3.x xVarEntryPredicate = this.f30777a.entryPredicate();
        Iterator<Map.Entry<Object, Object>> it = this.f30777a.unfiltered().entries().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Object> next = it.next();
            if (xVarEntryPredicate.apply(next) && e3.r.equal(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return AbstractC5493v0.removeIf(this.f30777a.unfiltered().entries(), e3.y.and(this.f30777a.entryPredicate(), E0.P(e3.y.in(collection))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return AbstractC5493v0.removeIf(this.f30777a.unfiltered().entries(), e3.y.and(this.f30777a.entryPredicate(), E0.P(e3.y.not(e3.y.in(collection)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f30777a.size();
    }
}
