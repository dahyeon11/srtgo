package io.grpc.internal;

import io.grpc.internal.C5766o0;
import io.grpc.internal.Q0;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
final class N0 extends N {

    /* renamed from: a, reason: collision with root package name */
    private final C5766o0.b f32509a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f32510b;

    public N0(C5766o0.b bVar) {
        this.f32509a = bVar;
    }

    @Override // io.grpc.internal.N
    protected C5766o0.b a() {
        return this.f32509a;
    }

    @Override // io.grpc.internal.N, io.grpc.internal.C5766o0.b
    public void deframeFailed(Throwable th) {
        this.f32510b = true;
        super.deframeFailed(th);
    }

    @Override // io.grpc.internal.N, io.grpc.internal.C5766o0.b
    public void deframerClosed(boolean z8) {
        this.f32510b = true;
        super.deframerClosed(z8);
    }

    @Override // io.grpc.internal.N, io.grpc.internal.C5766o0.b
    public void messagesAvailable(Q0.a aVar) throws IOException {
        if (!this.f32510b) {
            super.messagesAvailable(aVar);
        } else if (aVar instanceof Closeable) {
            U.closeQuietly((Closeable) aVar);
        }
    }
}
