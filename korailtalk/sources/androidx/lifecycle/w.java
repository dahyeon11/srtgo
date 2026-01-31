package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import n7.C5971a0;

/* loaded from: classes.dex */
public final class w extends n7.I {
    public final C1016e dispatchQueue = new C1016e();

    @Override // n7.I
    /* renamed from: dispatch */
    public void mo570dispatch(W6.g context, Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }

    @Override // n7.I
    public boolean isDispatchNeeded(W6.g context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (C5971a0.getMain().getImmediate().isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
