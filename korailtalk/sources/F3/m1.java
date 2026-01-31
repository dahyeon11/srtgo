package f3;

import f3.K0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: classes2.dex */
public interface m1 extends n1, j1 {
    @Override // f3.n1, f3.K0
    /* synthetic */ int add(Object obj, int i8);

    @Override // f3.n1, f3.K0, java.util.Collection
    /* synthetic */ boolean add(Object obj);

    @Override // f3.j1
    Comparator<Object> comparator();

    @Override // f3.n1, f3.K0, java.util.Collection
    /* synthetic */ boolean contains(Object obj);

    @Override // f3.n1, f3.K0, java.util.Collection
    /* synthetic */ boolean containsAll(Collection collection);

    @Override // f3.n1, f3.K0
    /* synthetic */ int count(Object obj);

    m1 descendingMultiset();

    @Override // f3.n1, f3.K0
    NavigableSet<Object> elementSet();

    @Override // f3.n1, f3.K0
    Set<K0.a> entrySet();

    K0.a firstEntry();

    m1 headMultiset(Object obj, EnumC5478o enumC5478o);

    @Override // f3.n1, f3.K0, java.util.Collection, java.lang.Iterable
    Iterator<Object> iterator();

    K0.a lastEntry();

    K0.a pollFirstEntry();

    K0.a pollLastEntry();

    @Override // f3.n1, f3.K0
    /* synthetic */ int remove(Object obj, int i8);

    @Override // f3.n1, f3.K0, java.util.Collection
    /* synthetic */ boolean remove(Object obj);

    @Override // f3.n1, f3.K0, java.util.Collection
    /* synthetic */ boolean removeAll(Collection collection);

    @Override // f3.n1, f3.K0, java.util.Collection
    /* synthetic */ boolean retainAll(Collection collection);

    @Override // f3.n1, f3.K0
    /* synthetic */ int setCount(Object obj, int i8);

    @Override // f3.n1, f3.K0
    /* synthetic */ boolean setCount(Object obj, int i8, int i9);

    @Override // f3.n1, f3.K0, java.util.Collection
    /* synthetic */ int size();

    m1 subMultiset(Object obj, EnumC5478o enumC5478o, Object obj2, EnumC5478o enumC5478o2);

    m1 tailMultiset(Object obj, EnumC5478o enumC5478o);
}
