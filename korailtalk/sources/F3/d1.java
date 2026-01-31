package f3;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
final class d1 extends AbstractC5487s0 {

    /* renamed from: f */
    static final d1 f30925f = new d1(AbstractC5465h0.of(), T0.natural());

    /* renamed from: e */
    final transient AbstractC5465h0 f30926e;

    d1(AbstractC5465h0 abstractC5465h0, Comparator comparator) {
        super(comparator);
        this.f30926e = abstractC5465h0;
    }

    private int w(Object obj) {
        return Collections.binarySearch(this.f30926e, obj, x());
    }

    @Override // f3.AbstractC5457d0
    int a(Object[] objArr, int i8) {
        return this.f30926e.a(objArr, i8);
    }

    @Override // f3.AbstractC5483q0, f3.AbstractC5457d0
    public AbstractC5465h0 asList() {
        return this.f30926e;
    }

    @Override // f3.AbstractC5457d0
    Object[] b() {
        return this.f30926e.b();
    }

    @Override // f3.AbstractC5457d0
    int c() {
        return this.f30926e.c();
    }

    @Override // f3.AbstractC5487s0, java.util.NavigableSet
    public Object ceiling(Object obj) {
        int iV = v(obj, true);
        if (iV == size()) {
            return null;
        }
        return this.f30926e.get(iV);
    }

    @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return w(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof K0) {
            collection = ((K0) collection).elementSet();
        }
        if (!k1.hasSameComparator(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        t1 it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int iR = r(next2, next);
                if (iR < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iR == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iR > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // f3.AbstractC5457d0
    int d() {
        return this.f30926e.d();
    }

    @Override // f3.AbstractC5483q0, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!k1.hasSameComparator(this.f31101c, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            t1 it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 == null || r(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // f3.AbstractC5487s0, java.util.SortedSet
    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f30926e.get(0);
    }

    @Override // f3.AbstractC5487s0, java.util.NavigableSet
    public Object floor(Object obj) {
        int iU = u(obj, true) - 1;
        if (iU == -1) {
            return null;
        }
        return this.f30926e.get(iU);
    }

    @Override // f3.AbstractC5487s0, java.util.NavigableSet
    public Object higher(Object obj) {
        int iV = v(obj, false);
        if (iV == size()) {
            return null;
        }
        return this.f30926e.get(iV);
    }

    @Override // f3.AbstractC5457d0
    boolean isPartialView() {
        return this.f30926e.isPartialView();
    }

    @Override // f3.AbstractC5487s0, java.util.SortedSet
    public Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f30926e.get(size() - 1);
    }

    @Override // f3.AbstractC5487s0, java.util.NavigableSet
    public Object lower(Object obj) {
        int iU = u(obj, false) - 1;
        if (iU == -1) {
            return null;
        }
        return this.f30926e.get(iU);
    }

    @Override // f3.AbstractC5487s0
    AbstractC5487s0 m() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f31101c);
        return isEmpty() ? AbstractC5487s0.n(comparatorReverseOrder) : new d1(this.f30926e.reverse(), comparatorReverseOrder);
    }

    @Override // f3.AbstractC5487s0
    AbstractC5487s0 o(Object obj, boolean z8) {
        return t(0, u(obj, z8));
    }

    @Override // f3.AbstractC5487s0
    AbstractC5487s0 p(Object obj, boolean z8, Object obj2, boolean z9) {
        return q(obj, z8).o(obj2, z9);
    }

    @Override // f3.AbstractC5487s0
    AbstractC5487s0 q(Object obj, boolean z8) {
        return t(v(obj, z8), size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f30926e.size();
    }

    d1 t(int i8, int i9) {
        return (i8 == 0 && i9 == size()) ? this : i8 < i9 ? new d1(this.f30926e.subList(i8, i9), this.f31101c) : AbstractC5487s0.n(this.f31101c);
    }

    int u(Object obj, boolean z8) {
        int iBinarySearch = Collections.binarySearch(this.f30926e, e3.w.checkNotNull(obj), comparator());
        return iBinarySearch >= 0 ? z8 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    int v(Object obj, boolean z8) {
        int iBinarySearch = Collections.binarySearch(this.f30926e, e3.w.checkNotNull(obj), comparator());
        return iBinarySearch >= 0 ? z8 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    Comparator x() {
        return this.f31101c;
    }

    @Override // f3.AbstractC5487s0, java.util.NavigableSet
    public t1 descendingIterator() {
        return this.f30926e.reverse().iterator();
    }

    @Override // f3.AbstractC5487s0, f3.AbstractC5483q0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public t1 iterator() {
        return this.f30926e.iterator();
    }
}
