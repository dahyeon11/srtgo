package io.grpc;

import io.grpc.AbstractC5786j;

/* renamed from: io.grpc.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5795n0 extends AbstractC5786j.a {
    AbstractC5795n0() {
    }

    protected abstract AbstractC5786j.a delegate();

    @Override // io.grpc.AbstractC5786j.a
    public void onClose(J0 j02, C5728h0 c5728h0) {
        delegate().onClose(j02, c5728h0);
    }

    @Override // io.grpc.AbstractC5786j.a
    public void onHeaders(C5728h0 c5728h0) {
        delegate().onHeaders(c5728h0);
    }

    @Override // io.grpc.AbstractC5786j.a
    public void onReady() {
        delegate().onReady();
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("delegate", delegate()).toString();
    }
}
