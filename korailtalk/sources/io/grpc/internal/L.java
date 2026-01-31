package io.grpc.internal;

import io.grpc.C5728h0;
import io.grpc.internal.InterfaceC5774t;
import io.grpc.internal.Q0;

/* loaded from: classes.dex */
abstract class L implements InterfaceC5774t {
    L() {
    }

    protected abstract InterfaceC5774t a();

    @Override // io.grpc.internal.InterfaceC5774t
    public void closed(io.grpc.J0 j02, InterfaceC5774t.a aVar, C5728h0 c5728h0) {
        a().closed(j02, aVar, c5728h0);
    }

    @Override // io.grpc.internal.InterfaceC5774t
    public void headersRead(C5728h0 c5728h0) {
        a().headersRead(c5728h0);
    }

    @Override // io.grpc.internal.InterfaceC5774t, io.grpc.internal.Q0
    public void messagesAvailable(Q0.a aVar) {
        a().messagesAvailable(aVar);
    }

    @Override // io.grpc.internal.InterfaceC5774t, io.grpc.internal.Q0
    public void onReady() {
        a().onReady();
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("delegate", a()).toString();
    }
}
