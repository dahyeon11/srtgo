package S6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: S6.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0778u extends C0777t {
    public static <T> int collectionSizeOrDefault(Iterable<? extends T> iterable, int i8) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i8;
    }

    public static final <T> Integer collectionSizeOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static final <T> List<T> flatten(Iterable<? extends Iterable<? extends T>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            r.addAll(arrayList, it.next());
        }
        return arrayList;
    }

    public static final <T, R> R6.p unzip(Iterable<? extends R6.p> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int iCollectionSizeOrDefault = r.collectionSizeOrDefault(iterable, 10);
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        ArrayList arrayList2 = new ArrayList(iCollectionSizeOrDefault);
        for (R6.p pVar : iterable) {
            arrayList.add(pVar.getFirst());
            arrayList2.add(pVar.getSecond());
        }
        return R6.v.to(arrayList, arrayList2);
    }
}
