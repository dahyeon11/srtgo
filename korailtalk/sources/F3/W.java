package f3;

import java.util.Iterator;
import java.util.NavigableSet;

/* loaded from: classes2.dex */
public abstract class W extends AbstractC5451a0 implements NavigableSet {
    protected W() {
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return f().ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public Iterator<Object> descendingIterator() {
        return f().descendingIterator();
    }

    public NavigableSet<Object> descendingSet() {
        return f().descendingSet();
    }

    protected abstract NavigableSet f();

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return f().floor(obj);
    }

    public NavigableSet<Object> headSet(Object obj, boolean z8) {
        return f().headSet(obj, z8);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return f().higher(obj);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return f().lower(obj);
    }

    @Override // java.util.NavigableSet
    public Object pollFirst() {
        return f().pollFirst();
    }

    @Override // java.util.NavigableSet
    public Object pollLast() {
        return f().pollLast();
    }

    public NavigableSet<Object> subSet(Object obj, boolean z8, Object obj2, boolean z9) {
        return f().subSet(obj, z8, obj2, z9);
    }

    public NavigableSet<Object> tailSet(Object obj, boolean z8) {
        return f().tailSet(obj, z8);
    }
}
