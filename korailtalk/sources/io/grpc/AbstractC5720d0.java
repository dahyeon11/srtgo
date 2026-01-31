package io.grpc;

import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5720d0 extends AbstractC5723f {
    public abstract boolean awaitTermination(long j8, TimeUnit timeUnit);

    public void enterIdle() {
    }

    public EnumC5802t getState(boolean z8) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public abstract boolean isShutdown();

    public abstract boolean isTerminated();

    public void notifyWhenStateChanged(EnumC5802t enumC5802t, Runnable runnable) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void resetConnectBackoff() {
    }

    public abstract AbstractC5720d0 shutdown();

    public abstract AbstractC5720d0 shutdownNow();
}
