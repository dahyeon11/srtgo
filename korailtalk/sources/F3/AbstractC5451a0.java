package f3;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: f3.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5451a0 extends Y implements SortedSet {
    protected AbstractC5451a0() {
    }

    @Override // java.util.SortedSet
    public Comparator<Object> comparator() {
        return e().comparator();
    }

    protected abstract SortedSet e();

    @Override // java.util.SortedSet
    public Object first() {
        return e().first();
    }

    public SortedSet<Object> headSet(Object obj) {
        return e().headSet(obj);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return e().last();
    }

    public SortedSet<Object> subSet(Object obj, Object obj2) {
        return e().subSet(obj, obj2);
    }

    public SortedSet<Object> tailSet(Object obj) {
        return e().tailSet(obj);
    }
}
