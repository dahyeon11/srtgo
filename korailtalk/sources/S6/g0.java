package S6;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class g0 extends f0 {
    public static final <T> Set<T> minus(Set<? extends T> set, T t8) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(Q.mapCapacity(set.size()));
        boolean z8 = false;
        for (T t9 : set) {
            boolean z9 = true;
            if (!z8 && Intrinsics.areEqual(t9, t8)) {
                z8 = true;
                z9 = false;
            }
            if (z9) {
                linkedHashSet.add(t9);
            }
        }
        return linkedHashSet;
    }

    public static final <T> Set<T> plus(Set<? extends T> set, T t8) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(Q.mapCapacity(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t8);
        return linkedHashSet;
    }

    public static final <T> Set<T> plus(Set<? extends T> set, T[] elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(Q.mapCapacity(set.size() + elements.length));
        linkedHashSet.addAll(set);
        C0782y.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, T[] elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        C0782y.removeAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static <T> Set<T> plus(Set<? extends T> set, Iterable<? extends T> elements) {
        int size;
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Integer numCollectionSizeOrNull = C0778u.collectionSizeOrNull(elements);
        if (numCollectionSizeOrNull != null) {
            size = set.size() + numCollectionSizeOrNull.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(Q.mapCapacity(size));
        linkedHashSet.addAll(set);
        r.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<?> collectionConvertToListIfNotCollection = r.convertToListIfNotCollection(elements);
        if (collectionConvertToListIfNotCollection.isEmpty()) {
            return r.toSet(set);
        }
        if (collectionConvertToListIfNotCollection instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t8 : set) {
                if (!collectionConvertToListIfNotCollection.contains(t8)) {
                    linkedHashSet.add(t8);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(collectionConvertToListIfNotCollection);
        return linkedHashSet2;
    }

    public static final <T> Set<T> plus(Set<? extends T> set, k7.m elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(Q.mapCapacity(set.size() * 2));
        linkedHashSet.addAll(set);
        r.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, k7.m elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        C0782y.removeAll(linkedHashSet, elements);
        return linkedHashSet;
    }
}
