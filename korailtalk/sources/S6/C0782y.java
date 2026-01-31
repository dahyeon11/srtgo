package S6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* renamed from: S6.y */
/* loaded from: classes3.dex */
public class C0782y extends C0781x {
    public static <T> boolean addAll(Collection<? super T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z8 = true;
            }
        }
        return z8;
    }

    private static final boolean b(Iterable iterable, f7.l lVar, boolean z8) {
        Iterator it = iterable.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z8) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    private static final boolean c(List list, f7.l lVar, boolean z8) {
        if (!(list instanceof RandomAccess)) {
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return b(TypeIntrinsics.asMutableIterable(list), lVar, z8);
        }
        M it = new j7.l(0, r.getLastIndex(list)).iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            Object obj = list.get(iNextInt);
            if (((Boolean) lVar.invoke(obj)).booleanValue() != z8) {
                if (i8 != iNextInt) {
                    list.set(i8, obj);
                }
                i8++;
            }
        }
        if (i8 >= list.size()) {
            return false;
        }
        int lastIndex = r.getLastIndex(list);
        if (i8 > lastIndex) {
            return true;
        }
        while (true) {
            list.remove(lastIndex);
            if (lastIndex == i8) {
                return true;
            }
            lastIndex--;
        }
    }

    public static <T> Collection<T> convertToListIfNotCollection(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = r.toList(iterable);
        }
        return (Collection) iterable;
    }

    private static final boolean d(Collection collection) {
        boolean z8 = !collection.isEmpty();
        collection.clear();
        return z8;
    }

    public static final <T> boolean removeAll(Collection<? super T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.removeAll(r.convertToListIfNotCollection(elements));
    }

    public static final <T> T removeFirst(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static final <T> T removeFirstOrNull(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static <T> T removeLast(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(r.getLastIndex(list));
    }

    public static final <T> T removeLastOrNull(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(r.getLastIndex(list));
    }

    public static final <T> boolean retainAll(Collection<? super T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.retainAll(r.convertToListIfNotCollection(elements));
    }

    public static final <T> boolean removeAll(Collection<? super T> collection, k7.m elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = k7.p.toList(elements);
        return !list.isEmpty() && collection.removeAll(list);
    }

    public static final <T> boolean retainAll(Collection<? super T> collection, T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return !(elements.length == 0) ? collection.retainAll(AbstractC0765i.asList(elements)) : d(collection);
    }

    public static <T> boolean addAll(Collection<? super T> collection, k7.m elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<Object> it = elements.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z8 = true;
            }
        }
        return z8;
    }

    public static final <T> boolean removeAll(Collection<? super T> collection, T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return !(elements.length == 0) && collection.removeAll(AbstractC0765i.asList(elements));
    }

    public static final <T> boolean removeAll(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return b(iterable, predicate, true);
    }

    public static final <T> boolean retainAll(Collection<? super T> collection, k7.m elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = k7.p.toList(elements);
        if (!list.isEmpty()) {
            return collection.retainAll(list);
        }
        return d(collection);
    }

    public static final <T> boolean addAll(Collection<? super T> collection, T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.addAll(AbstractC0765i.asList(elements));
    }

    public static final <T> boolean removeAll(List<T> list, f7.l predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return c(list, predicate, true);
    }

    public static <T> boolean retainAll(Iterable<? extends T> iterable, f7.l predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return b(iterable, predicate, false);
    }

    public static final <T> boolean retainAll(List<T> list, f7.l predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return c(list, predicate, false);
    }
}
