package io.grpc;

import io.grpc.w0;

/* renamed from: io.grpc.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5799p0 extends w0.a {
    AbstractC5799p0() {
    }

    protected abstract w0.a a();

    @Override // io.grpc.w0.a
    public void onCancel() {
        a().onCancel();
    }

    @Override // io.grpc.w0.a
    public void onComplete() {
        a().onComplete();
    }

    @Override // io.grpc.w0.a
    public void onHalfClose() {
        a().onHalfClose();
    }

    @Override // io.grpc.w0.a
    public void onReady() {
        a().onReady();
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("delegate", a()).toString();
    }
}
