package S6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class A extends C0783z {
    public static final <R> List<R> filterIsInstance(Iterable<?> iterable, Class<R> klass) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (List) filterIsInstanceTo(iterable, new ArrayList(), klass);
    }

    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(Iterable<?> iterable, C destination, Class<R> klass) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(klass, "klass");
        for (Object obj : iterable) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Double m126max(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return B.m130maxOrNull((Iterable<Double>) iterable);
    }

    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(Iterable<? extends T> iterable, f7.l selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) selector.invoke(next2);
                if (comparable.compareTo(comparable2) < 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
        }
        return next;
    }

    public static final /* synthetic */ Object maxWith(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return B.maxWithOrNull(iterable, comparator);
    }

    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Double m128min(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return B.m134minOrNull((Iterable<Double>) iterable);
    }

    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(Iterable<? extends T> iterable, f7.l selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) selector.invoke(next2);
                if (comparable.compareTo(comparable2) > 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
        }
        return next;
    }

    public static final /* synthetic */ Object minWith(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return B.minWithOrNull(iterable, comparator);
    }

    public static <T> void reverse(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Collections.reverse(list);
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (SortedSet) B.toCollection(iterable, new TreeSet());
    }

    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Float m127max(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return B.m131maxOrNull((Iterable<Float>) iterable);
    }

    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Float m129min(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return B.m135minOrNull((Iterable<Float>) iterable);
    }

    public static final <T> SortedSet<T> toSortedSet(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) B.toCollection(iterable, new TreeSet(comparator));
    }

    public static final /* synthetic */ Comparable max(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return B.maxOrNull(iterable);
    }

    public static final /* synthetic */ Comparable min(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return r.minOrNull(iterable);
    }
}
