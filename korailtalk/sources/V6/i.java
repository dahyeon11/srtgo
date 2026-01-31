package V6;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i {
    public static final <T> Comparator<T> compareBy(final f7.l... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: V6.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return i.f(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static <T extends Comparable<?>> int compareValues(T t8, T t9) {
        if (t8 == t9) {
            return 0;
        }
        if (t8 == null) {
            return -1;
        }
        if (t9 == null) {
            return 1;
        }
        return t8.compareTo(t9);
    }

    public static final <T> int compareValuesBy(T t8, T t9, f7.l... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return g(t8, t9, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(f7.l[] selectors, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(selectors, "$selectors");
        return g(obj, obj2, selectors);
    }

    private static final int g(Object obj, Object obj2, f7.l[] lVarArr) {
        for (f7.l lVar : lVarArr) {
            int iCompareValues = a.compareValues((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
            if (iCompareValues != 0) {
                return iCompareValues;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(Comparator comparator, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(Comparator comparator, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(Comparator this_then, Comparator comparator, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(this_then, "$this_then");
        Intrinsics.checkNotNullParameter(comparator, "$comparator");
        int iCompare = this_then.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator.compare(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(Comparator this_thenDescending, Comparator comparator, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(this_thenDescending, "$this_thenDescending");
        Intrinsics.checkNotNullParameter(comparator, "$comparator");
        int iCompare = this_thenDescending.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator.compare(obj2, obj);
    }

    public static final <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        l lVar = l.INSTANCE;
        Intrinsics.checkNotNull(lVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return lVar;
    }

    public static final <T> Comparator<T> nullsFirst(final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: V6.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return i.h(comparator, obj, obj2);
            }
        };
    }

    public static final <T> Comparator<T> nullsLast(final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: V6.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return i.i(comparator, obj, obj2);
            }
        };
    }

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        m mVar = m.INSTANCE;
        Intrinsics.checkNotNull(mVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return mVar;
    }

    public static final <T> Comparator<T> reversed(Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        if (comparator instanceof n) {
            return (Comparator<T>) ((n) comparator).getComparator();
        }
        Comparator<T> nVar = l.INSTANCE;
        if (Intrinsics.areEqual(comparator, nVar)) {
            m mVar = m.INSTANCE;
            Intrinsics.checkNotNull(mVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return mVar;
        }
        if (Intrinsics.areEqual(comparator, m.INSTANCE)) {
            Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            nVar = new n(comparator);
        }
        return nVar;
    }

    public static final <T> Comparator<T> then(final Comparator<T> comparator, final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: V6.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return i.j(comparator, comparator2, obj, obj2);
            }
        };
    }

    public static final <T> Comparator<T> thenDescending(final Comparator<T> comparator, final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: V6.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return i.k(comparator, comparator2, obj, obj2);
            }
        };
    }
}
