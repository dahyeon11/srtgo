package f3;

import f3.AbstractC5456d;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: f3.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5470k extends AbstractC5468j implements o1 {
    protected AbstractC5470k(Map map) {
        super(map);
    }

    /* renamed from: A */
    abstract SortedSet o();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f3.AbstractC5468j
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public SortedSet s() {
        return w(o());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f3.AbstractC5456d
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public SortedSet w(Collection collection) {
        return collection instanceof NavigableSet ? h1.unmodifiableNavigableSet((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // f3.AbstractC5468j, f3.AbstractC5462g, f3.F0, f3.InterfaceC5501z0
    public Map<Object, Collection<Object>> asMap() {
        return super.asMap();
    }

    @Override // f3.AbstractC5468j, f3.AbstractC5456d, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    public abstract /* synthetic */ Comparator valueComparator();

    @Override // f3.AbstractC5456d, f3.AbstractC5462g, f3.F0
    public Collection<Object> values() {
        return super.values();
    }

    @Override // f3.AbstractC5456d
    Collection x(Object obj, Collection collection) {
        return collection instanceof NavigableSet ? new AbstractC5456d.m(obj, (NavigableSet) collection, null) : new AbstractC5456d.o(obj, (SortedSet) collection, null);
    }

    @Override // f3.AbstractC5468j, f3.AbstractC5456d, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // f3.AbstractC5468j, f3.AbstractC5456d, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public SortedSet<Object> get(Object obj) {
        return (SortedSet) super.get(obj);
    }

    @Override // f3.AbstractC5468j, f3.AbstractC5456d, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public SortedSet<Object> removeAll(Object obj) {
        return (SortedSet) super.removeAll(obj);
    }

    @Override // f3.AbstractC5468j, f3.AbstractC5456d, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public SortedSet<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        return (SortedSet) super.replaceValues(obj, iterable);
    }
}
