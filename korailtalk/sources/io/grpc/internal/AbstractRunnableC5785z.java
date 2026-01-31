package io.grpc.internal;

import io.grpc.C5804v;

/* renamed from: io.grpc.internal.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractRunnableC5785z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final C5804v f33219a;

    protected AbstractRunnableC5785z(C5804v c5804v) {
        this.f33219a = c5804v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5804v c5804vAttach = this.f33219a.attach();
        try {
            runInContext();
        } finally {
            this.f33219a.detach(c5804vAttach);
        }
    }

    public abstract void runInContext();
}
