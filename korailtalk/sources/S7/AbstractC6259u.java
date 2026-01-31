package s7;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: s7.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6259u {
    public static final int FAILURE = 2;
    public static final int SUCCESS = 1;
    public static final int UNDECIDED = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f36365a = new K("CONDITION_FALSE");

    public static final Object getCONDITION_FALSE() {
        return f36365a;
    }

    public static final C6260v unwrap(Object obj) {
        C6260v c6260v;
        C6238E c6238e = obj instanceof C6238E ? (C6238E) obj : null;
        if (c6238e != null && (c6260v = c6238e.ref) != null) {
            return c6260v;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C6260v) obj;
    }

    public static /* synthetic */ void getCONDITION_FALSE$annotations() {
    }

    public static /* synthetic */ void getFAILURE$annotations() {
    }

    public static /* synthetic */ void getSUCCESS$annotations() {
    }

    public static /* synthetic */ void getUNDECIDED$annotations() {
    }
}
