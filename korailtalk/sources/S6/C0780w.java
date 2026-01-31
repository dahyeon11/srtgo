package S6;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: S6.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0780w extends C0779v {
    public static final <T> void forEach(Iterator<? extends T> it, f7.l operation) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        while (it.hasNext()) {
            operation.invoke(it.next());
        }
    }

    public static final <T> Iterator<J> withIndex(Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return new L(it);
    }
}
