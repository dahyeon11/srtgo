package f3;

import java.util.Comparator;
import java.util.SortedMap;

/* loaded from: classes2.dex */
public abstract class Z extends AbstractC5446S implements SortedMap {
    protected Z() {
    }

    /* renamed from: c */
    protected abstract SortedMap delegate();

    @Override // java.util.SortedMap
    public Comparator<Object> comparator() {
        return delegate().comparator();
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return delegate().firstKey();
    }

    public SortedMap<Object, Object> headMap(Object obj) {
        return delegate().headMap(obj);
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return delegate().lastKey();
    }

    public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
        return delegate().subMap(obj, obj2);
    }

    public SortedMap<Object, Object> tailMap(Object obj) {
        return delegate().tailMap(obj);
    }
}
