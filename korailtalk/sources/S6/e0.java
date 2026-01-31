package S6;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class e0 {
    public static final <E> Set<E> build(Set<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return (Set<E>) ((T6.h) builder).build();
    }

    public static final <E> Set<E> createSetBuilder() {
        return new T6.h();
    }

    public static <T> Set<T> setOf(T t8) {
        Set<T> setSingleton = Collections.singleton(t8);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static final <T> TreeSet<T> sortedSetOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (TreeSet) C0769m.toCollection(elements, new TreeSet());
    }

    public static final <E> Set<E> createSetBuilder(int i8) {
        return new T6.h(i8);
    }

    public static final <T> TreeSet<T> sortedSetOf(Comparator<? super T> comparator, T... elements) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (TreeSet) C0769m.toCollection(elements, new TreeSet(comparator));
    }
}
