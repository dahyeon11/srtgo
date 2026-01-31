package S6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: S6.t */
/* loaded from: classes3.dex */
public class C0777t extends C0776s {

    /* renamed from: S6.t$a */
    public static final class a extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ f7.l f4765a;

        /* renamed from: b */
        final /* synthetic */ Comparable f4766b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f7.l lVar, Comparable comparable) {
            super(1);
            this.f4765a = lVar;
            this.f4766b = comparable;
        }

        @Override // f7.l
        public final Integer invoke(T t8) {
            return Integer.valueOf(V6.a.compareValues((Comparable) this.f4765a.invoke(t8), this.f4766b));
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((a) obj);
        }
    }

    private static final void a(int i8, int i9, int i10) {
        if (i9 > i10) {
            throw new IllegalArgumentException("fromIndex (" + i9 + ") is greater than toIndex (" + i10 + ").");
        }
        if (i9 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i9 + ") is less than zero.");
        }
        if (i10 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i8 + ").");
    }

    public static final <T> ArrayList<T> arrayListOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new C0763g(elements, true));
    }

    public static final <T> Collection<T> asCollection(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new C0763g(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T t8, int i8, int i9) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        a(list.size(), i8, i9);
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int iCompareValues = V6.a.compareValues(list.get(i11), t8);
            if (iCompareValues < 0) {
                i8 = i11 + 1;
            } else {
                if (iCompareValues <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static /* synthetic */ int binarySearch$default(List list, Comparable comparable, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = list.size();
        }
        return binarySearch((List<? extends Comparable>) list, comparable, i8, i9);
    }

    public static final <T, K extends Comparable<? super K>> int binarySearchBy(List<? extends T> list, K k8, int i8, int i9, f7.l selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return binarySearch(list, i8, i9, new a(selector, k8));
    }

    public static /* synthetic */ int binarySearchBy$default(List list, Comparable comparable, int i8, int i9, f7.l selector, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = list.size();
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return binarySearch(list, i8, i9, new a(selector, comparable));
    }

    public static final Object[] collectionToArrayCommonImpl(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        int i8 = 0;
        if (collection.isEmpty()) {
            return new Object[0];
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i8] = it.next();
            i8++;
        }
        return objArr;
    }

    public static <T> List<T> emptyList() {
        return E.INSTANCE;
    }

    public static j7.l getIndices(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new j7.l(0, collection.size() - 1);
    }

    public static <T> int getLastIndex(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> listOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? AbstractC0765i.asList(elements) : r.emptyList();
    }

    public static final <T> List<T> listOfNotNull(T t8) {
        return t8 != null ? r.listOf(t8) : r.emptyList();
    }

    public static final <T> List<T> mutableListOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C0763g(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> optimizeReadOnlyList(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : r.listOf(list.get(0)) : r.emptyList();
    }

    public static final <T> List<T> shuffled(Iterable<? extends T> iterable, h7.f random) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List<T> mutableList = B.toMutableList(iterable);
        B.shuffle(mutableList, random);
        return mutableList;
    }

    public static void throwCountOverflow() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static /* synthetic */ int binarySearch$default(List list, Object obj, Comparator comparator, int i8, int i9, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = list.size();
        }
        return binarySearch(list, obj, comparator, i8, i9);
    }

    public static final <T> List<T> listOfNotNull(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return AbstractC0765i.filterNotNull(elements);
    }

    public static /* synthetic */ int binarySearch$default(List list, int i8, int i9, f7.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = list.size();
        }
        return binarySearch(list, i8, i9, lVar);
    }

    public static final <T> int binarySearch(List<? extends T> list, T t8, Comparator<? super T> comparator, int i8, int i9) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        a(list.size(), i8, i9);
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int iCompare = comparator.compare(list.get(i11), t8);
            if (iCompare < 0) {
                i8 = i11 + 1;
            } else {
                if (iCompare <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final <T> int binarySearch(List<? extends T> list, int i8, int i9, f7.l comparison) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        a(list.size(), i8, i9);
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int iIntValue = ((Number) comparison.invoke(list.get(i11))).intValue();
            if (iIntValue < 0) {
                i8 = i11 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final <T> T[] collectionToArrayCommonImpl(Collection<?> collection, T[] array) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(array, "array");
        int i8 = 0;
        if (collection.isEmpty()) {
            return (T[]) r.terminateCollectionToArray(0, array);
        }
        int length = array.length;
        Object[] objArr = array;
        if (length < collection.size()) {
            objArr = (T[]) C0766j.arrayOfNulls(array, collection.size());
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i8] = it.next();
            i8++;
        }
        return (T[]) r.terminateCollectionToArray(collection.size(), objArr);
    }
}
