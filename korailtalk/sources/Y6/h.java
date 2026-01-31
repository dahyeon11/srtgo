package Y6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> W6.d<T> probeCoroutineCreated(W6.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return completion;
    }

    public static final void probeCoroutineResumed(W6.d<?> frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    public static final void probeCoroutineSuspended(W6.d<?> frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }
}
