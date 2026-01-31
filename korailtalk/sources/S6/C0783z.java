package S6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: S6.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0783z extends C0782y {
    public static final <T> List<T> asReversed(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new b0(list);
    }

    public static <T> List<T> asReversedMutable(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new a0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(List list, int i8) {
        if (new j7.l(0, r.getLastIndex(list)).contains(i8)) {
            return r.getLastIndex(list) - i8;
        }
        throw new IndexOutOfBoundsException("Element index " + i8 + " must be in range [" + new j7.l(0, r.getLastIndex(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(List list, int i8) {
        return r.getLastIndex(list) - i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(List list, int i8) {
        if (new j7.l(0, list.size()).contains(i8)) {
            return list.size() - i8;
        }
        throw new IndexOutOfBoundsException("Position index " + i8 + " must be in range [" + new j7.l(0, list.size()) + "].");
    }
}
