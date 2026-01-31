package io.grpc;

/* renamed from: io.grpc.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5793m0 extends AbstractC5786j {
    AbstractC5793m0() {
    }

    @Override // io.grpc.AbstractC5786j
    public void cancel(String str, Throwable th) {
        delegate().cancel(str, th);
    }

    protected abstract AbstractC5786j delegate();

    @Override // io.grpc.AbstractC5786j
    public C5713a getAttributes() {
        return delegate().getAttributes();
    }

    @Override // io.grpc.AbstractC5786j
    public void halfClose() {
        delegate().halfClose();
    }

    @Override // io.grpc.AbstractC5786j
    public boolean isReady() {
        return delegate().isReady();
    }

    @Override // io.grpc.AbstractC5786j
    public void request(int i8) {
        delegate().request(i8);
    }

    @Override // io.grpc.AbstractC5786j
    public void setMessageCompression(boolean z8) {
        delegate().setMessageCompression(z8);
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("delegate", delegate()).toString();
    }
}
