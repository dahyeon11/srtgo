package f3;

import f3.E0;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: f3.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5466i extends E0.A implements NavigableMap {

    /* renamed from: f3.i$b */
    private final class b extends E0.AbstractC5432q {
        private b() {
        }

        @Override // f3.E0.AbstractC5432q
        Iterator d() {
            return AbstractC5466i.this.b();
        }

        @Override // f3.E0.AbstractC5432q
        NavigableMap e() {
            return AbstractC5466i.this;
        }
    }

    AbstractC5466i() {
    }

    abstract Iterator b();

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Object ceilingKey(Object obj) {
        return E0.v(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<Object> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public NavigableMap<Object, Object> descendingMap() {
        return new b();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> firstEntry() {
        return (Map.Entry) AbstractC5495w0.getNext(a(), null);
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        Map.Entry<Object, Object> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Object floorKey(Object obj) {
        return E0.v(floorEntry(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<Object, Object> headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Object higherKey(Object obj) {
        return E0.v(higherEntry(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<Object> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> lastEntry() {
        return (Map.Entry) AbstractC5495w0.getNext(b(), null);
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        Map.Entry<Object, Object> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<Object, Object> lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Object lowerKey(Object obj) {
        return E0.v(lowerEntry(obj));
    }

    public NavigableSet<Object> navigableKeySet() {
        return new E0.E(this);
    }

    public Map.Entry<Object, Object> pollFirstEntry() {
        return (Map.Entry) AbstractC5495w0.k(a());
    }

    public Map.Entry<Object, Object> pollLastEntry() {
        return (Map.Entry) AbstractC5495w0.k(b());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<Object, Object> subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<Object, Object> tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
