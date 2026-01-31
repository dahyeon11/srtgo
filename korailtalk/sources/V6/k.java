package V6;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class k extends j {
    public static final <T> T maxOf(T t8, T t9, T t10, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (T) maxOf(t8, maxOf(t9, t10, comparator), comparator);
    }

    public static final <T> T minOf(T t8, T t9, T t10, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (T) minOf(t8, minOf(t9, t10, comparator), comparator);
    }

    public static final <T> T maxOf(T t8, T t9, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return comparator.compare(t8, t9) >= 0 ? t8 : t9;
    }

    public static final <T> T minOf(T t8, T t9, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return comparator.compare(t8, t9) <= 0 ? t8 : t9;
    }

    public static final <T> T maxOf(T t8, T[] other, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        for (T t9 : other) {
            if (comparator.compare(t8, t9) < 0) {
                t8 = t9;
            }
        }
        return t8;
    }

    public static final <T> T minOf(T t8, T[] other, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        for (T t9 : other) {
            if (comparator.compare(t8, t9) > 0) {
                t8 = t9;
            }
        }
        return t8;
    }
}
