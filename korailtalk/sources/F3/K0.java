package f3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public interface K0 extends Collection {

    public interface a {
        boolean equals(Object obj);

        int getCount();

        Object getElement();

        int hashCode();

        String toString();
    }

    int add(Object obj, int i8);

    @Override // java.util.Collection
    boolean add(Object obj);

    @Override // java.util.Collection, f3.K0
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    Set<Object> elementSet();

    Set<a> entrySet();

    @Override // java.util.Collection
    boolean equals(Object obj);

    @Override // java.util.Collection
    int hashCode();

    @Override // java.util.Collection, java.lang.Iterable, f3.K0
    Iterator<Object> iterator();

    int remove(Object obj, int i8);

    @Override // java.util.Collection
    boolean remove(Object obj);

    @Override // java.util.Collection
    boolean removeAll(Collection<?> collection);

    @Override // java.util.Collection
    boolean retainAll(Collection<?> collection);

    int setCount(Object obj, int i8);

    boolean setCount(Object obj, int i8, int i9);

    @Override // java.util.Collection, f3.K0
    int size();

    String toString();
}
