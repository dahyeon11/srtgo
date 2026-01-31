package R6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class v {
    public static final <A, B> p to(A a9, B b9) {
        return new p(a9, b9);
    }

    public static final <T> List<T> toList(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return S6.r.listOf(pVar.getFirst(), pVar.getSecond());
    }

    public static final <T> List<T> toList(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return S6.r.listOf(uVar.getFirst(), uVar.getSecond(), uVar.getThird());
    }
}
