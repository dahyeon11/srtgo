package io.grpc;

import io.grpc.C5804v;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    static final C5804v.i f33354a = C5804v.key("io.grpc.Server");

    public abstract void awaitTermination();

    public abstract boolean awaitTermination(long j8, TimeUnit timeUnit);

    public List<E0> getImmutableServices() {
        return Collections.emptyList();
    }

    public List<? extends SocketAddress> getListenSockets() {
        throw new UnsupportedOperationException();
    }

    public List<E0> getMutableServices() {
        return Collections.emptyList();
    }

    public int getPort() {
        return -1;
    }

    public List<E0> getServices() {
        return Collections.emptyList();
    }

    public abstract boolean isShutdown();

    public abstract boolean isTerminated();

    public abstract u0 shutdown();

    public abstract u0 shutdownNow();

    public abstract u0 start();
}
