package io.grpc.internal;

import io.grpc.internal.C5766o0;
import io.grpc.internal.Q0;

/* loaded from: classes.dex */
abstract class N implements C5766o0.b {
    N() {
    }

    protected abstract C5766o0.b a();

    @Override // io.grpc.internal.C5766o0.b
    public void bytesRead(int i8) {
        a().bytesRead(i8);
    }

    @Override // io.grpc.internal.C5766o0.b
    public void deframeFailed(Throwable th) {
        a().deframeFailed(th);
    }

    @Override // io.grpc.internal.C5766o0.b
    public void deframerClosed(boolean z8) {
        a().deframerClosed(z8);
    }

    @Override // io.grpc.internal.C5766o0.b
    public void messagesAvailable(Q0.a aVar) {
        a().messagesAvailable(aVar);
    }
}
