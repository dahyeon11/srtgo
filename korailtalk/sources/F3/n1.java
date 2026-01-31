package f3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
interface n1 extends K0 {
    @Override // f3.K0
    /* synthetic */ int add(Object obj, int i8);

    @Override // f3.K0, java.util.Collection
    /* synthetic */ boolean add(Object obj);

    @Override // f3.K0, java.util.Collection
    /* synthetic */ boolean contains(Object obj);

    @Override // f3.K0, java.util.Collection
    /* synthetic */ boolean containsAll(Collection collection);

    @Override // f3.K0
    /* synthetic */ int count(Object obj);

    @Override // f3.K0
    SortedSet<Object> elementSet();

    @Override // f3.K0
    /* synthetic */ Set entrySet();

    @Override // f3.K0, java.util.Collection, java.lang.Iterable
    /* synthetic */ Iterator iterator();

    @Override // f3.K0
    /* synthetic */ int remove(Object obj, int i8);

    @Override // f3.K0, java.util.Collection
    /* synthetic */ boolean remove(Object obj);

    @Override // f3.K0, java.util.Collection
    /* synthetic */ boolean removeAll(Collection collection);

    @Override // f3.K0, java.util.Collection
    /* synthetic */ boolean retainAll(Collection collection);

    @Override // f3.K0
    /* synthetic */ int setCount(Object obj, int i8);

    @Override // f3.K0
    /* synthetic */ boolean setCount(Object obj, int i8, int i9);

    @Override // f3.K0, java.util.Collection
    /* synthetic */ int size();
}
