package l7;

import S6.M;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class C extends B {
    public static final /* synthetic */ Character max(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return D.maxOrNull(charSequence);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(CharSequence charSequence, f7.l selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = r.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cCharAt));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(cCharAt2));
            if (comparable.compareTo(comparable2) < 0) {
                cCharAt = cCharAt2;
                comparable = comparable2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final /* synthetic */ Character maxWith(CharSequence charSequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return D.maxWithOrNull(charSequence, comparator);
    }

    public static final /* synthetic */ Character min(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return D.minOrNull(charSequence);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(CharSequence charSequence, f7.l selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = r.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cCharAt));
        M it = new j7.l(1, lastIndex).iterator();
        while (it.hasNext()) {
            char cCharAt2 = charSequence.charAt(it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(cCharAt2));
            if (comparable.compareTo(comparable2) > 0) {
                cCharAt = cCharAt2;
                comparable = comparable2;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final /* synthetic */ Character minWith(CharSequence charSequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return D.minWithOrNull(charSequence, comparator);
    }

    public static final SortedSet<Character> toSortedSet(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (SortedSet) D.toCollection(charSequence, new TreeSet());
    }
}
