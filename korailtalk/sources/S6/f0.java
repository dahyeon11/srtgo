package S6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class f0 extends e0 {
    public static <T> Set<T> emptySet() {
        return G.INSTANCE;
    }

    public static final <T> HashSet<T> hashSetOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (HashSet) C0769m.toCollection(elements, new HashSet(Q.mapCapacity(elements.length)));
    }

    public static final <T> LinkedHashSet<T> linkedSetOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (LinkedHashSet) C0769m.toCollection(elements, new LinkedHashSet(Q.mapCapacity(elements.length)));
    }

    public static final <T> Set<T> mutableSetOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) C0769m.toCollection(elements, new LinkedHashSet(Q.mapCapacity(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> optimizeReadOnlySet(Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : d0.setOf(set.iterator().next()) : d0.emptySet();
    }

    public static final <T> Set<T> setOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? C0769m.toSet(elements) : d0.emptySet();
    }

    public static final <T> Set<T> setOfNotNull(T t8) {
        return t8 != null ? d0.setOf(t8) : d0.emptySet();
    }

    public static final <T> Set<T> setOfNotNull(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) C0769m.filterNotNullTo(elements, new LinkedHashSet());
    }
}
