package W6;

import R6.G;
import R6.q;
import f7.l;
import f7.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f {
    public static final <T> d<G> createCoroutine(l lVar, d<? super T> completion) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new i(X6.b.intercepted(X6.b.createCoroutineUnintercepted(lVar, completion)), X6.b.getCOROUTINE_SUSPENDED());
    }

    public static final <T> void startCoroutine(l lVar, d<? super T> completion) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        d dVarIntercepted = X6.b.intercepted(X6.b.createCoroutineUnintercepted(lVar, completion));
        q.a aVar = q.Companion;
        dVarIntercepted.resumeWith(q.m67constructorimpl(G.INSTANCE));
    }

    public static final <R, T> d<G> createCoroutine(p pVar, R r8, d<? super T> completion) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new i(X6.b.intercepted(X6.b.createCoroutineUnintercepted(pVar, r8, completion)), X6.b.getCOROUTINE_SUSPENDED());
    }

    public static final <R, T> void startCoroutine(p pVar, R r8, d<? super T> completion) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        d dVarIntercepted = X6.b.intercepted(X6.b.createCoroutineUnintercepted(pVar, r8, completion));
        q.a aVar = q.Companion;
        dVarIntercepted.resumeWith(q.m67constructorimpl(G.INSTANCE));
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
