package f3;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes2.dex */
abstract class k1 {
    public static <E> Comparator<? super E> comparator(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? T0.natural() : comparator;
    }

    public static boolean hasSameComparator(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator<Object> comparator2;
        e3.w.checkNotNull(comparator);
        e3.w.checkNotNull(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = comparator((SortedSet) iterable);
        } else {
            if (!(iterable instanceof j1)) {
                return false;
            }
            comparator2 = ((j1) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
