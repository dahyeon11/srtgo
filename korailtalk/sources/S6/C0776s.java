package S6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: S6.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0776s {
    public static <E> List<E> build(List<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return (List<E>) ((T6.b) builder).build();
    }

    public static final <T> Object[] copyToArrayOfAny(T[] tArr, boolean z8) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (z8 && Intrinsics.areEqual(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static <E> List<E> createListBuilder() {
        return new T6.b();
    }

    public static <T> List<T> listOf(T t8) {
        List<T> listSingletonList = Collections.singletonList(t8);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static final <T> List<T> shuffled(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        List<T> mutableList = B.toMutableList(iterable);
        Collections.shuffle(mutableList);
        return mutableList;
    }

    public static <T> T[] terminateCollectionToArray(int i8, T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i8 < array.length) {
            array[i8] = null;
        }
        return array;
    }

    public static <E> List<E> createListBuilder(int i8) {
        return new T6.b(i8);
    }

    public static final <T> List<T> shuffled(Iterable<? extends T> iterable, Random random) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List<T> mutableList = B.toMutableList(iterable);
        Collections.shuffle(mutableList, random);
        return mutableList;
    }
}
