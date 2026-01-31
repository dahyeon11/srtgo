package R6;

import R6.q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class r {
    public static final Object createFailure(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new q.b(exception);
    }

    public static final void throwOnFailure(Object obj) {
        if (obj instanceof q.b) {
            throw ((q.b) obj).exception;
        }
    }
}
